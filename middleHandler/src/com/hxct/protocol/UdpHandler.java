package com.hxct.protocol;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.codec.binary.Base64;

import com.hxct.DataDock;
import com.hxct.po.UserData;
import com.hxct.util.Constants;
import com.hxct.util.DESUtil;
import com.hxct.util.DataConvert;

public class UdpHandler implements IHandler {

	@Override
	public void sendData(Object allUserData) {
		List<UserData> userDatas = (List<UserData>) allUserData;
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String remoteIp = System.getProperty("remote_udp_server_ip");
		String remotePort = System.getProperty("remote_udp_server_port");
		if(remoteIp==null)
		{
			remoteIp = "27.17.23.41";
		}
		if(remotePort==null)
		{
			remotePort = "19890";
		}
		InetAddress loc = null;
		try {	
			loc = InetAddress.getByName(remoteIp);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ds.setSoTimeout(Constants.TIMEOUT);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // 设置接收数据时阻塞的最长时间

		for (UserData data : userDatas) {
			String str_send = data.toString();
			byte[] buf = new byte[1024];
			// 客户端在9000端口监听接收到的数据
			// 定义用来发送数据的DatagramPacket实例
			byte[] enCodeDes = null;
			try {
				enCodeDes = DESUtil.CBCEncrypt(str_send.getBytes("UTF-8"), Constants.password.getBytes(),
						Constants.iv.getBytes());
//				byte[] deCode = DESUtil.CBCDecrypt(enCodeDes, Constants.password.getBytes(), Constants.iv.getBytes());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String bstr = Base64.encodeBase64String(enCodeDes);
			DatagramPacket dp_send = new DatagramPacket(bstr.getBytes(), bstr.getBytes().length, loc, Integer.parseInt(remotePort));
			// 定义用来接收数据的DatagramPacket实例
			DatagramPacket dp_receive = new DatagramPacket(buf, 1024);
			// 数据发向本地3000端口
			if(System.getProperty("recvconfirm").equals("0"))
			{
				try {
					ds.send(dp_send);
					String v = DataConvert.bytesToHexString(dp_send.getData(), true, true);
					System.out.println("send data value is:"+v);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
			int tries = 0; // 重发数据的次数
			boolean receivedResponse = false; // 是否接收到数据的标志位
			// 直到接收到数据，或者重发次数达到预定值，则退出循环
			while (!receivedResponse && tries < Constants.MAXNUM) {
				// 发送数据
				try {
					ds.send(dp_send);
					String v = DataConvert.bytesToHexString(dp_send.getData(), true, true);
					System.out.println("value is:"+v);
					// 接收从服务端发送回来的数据
					 ds.receive(dp_receive);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {

					// 如果接收到数据。则将receivedResponse标志位改为true，从而退出循环
					receivedResponse = true;
					Thread.sleep(5);
					// 如果接收到的数据不是来自目标地址，则抛出异常
					if (!dp_receive.getAddress().equals(loc)) {
						return;
					}
				} catch (InterruptedException ex) {
					Logger.getLogger(DataDock.class.getName()).log(Level.SEVERE, null, ex);
					// 如果接收数据时阻塞超时，重发并减少一次重发的次数
					tries += 1;
					System.out.println("Time out," + (Constants.MAXNUM - tries) + " more tries...");
				}
			}
			if (receivedResponse) {
				// 如果收到数据，则打印出来
//				System.out.println("client received data from server：");
				String str_receive = new String(dp_receive.getData(), 0, dp_receive.getLength()) + " from "
						+ dp_receive.getAddress().getHostAddress() + ":" + dp_receive.getPort();
//				System.out.println(str_receive);
				// 由于dp_receive在接收了数据之后，其内部消息长度值会变为实际接收的消息的字节数，
				// 所以这里要将dp_receive的内部消息长度重置为1024
				dp_receive.setLength(1024);
			} else {
				// 如果重发MAXNUM次数据后，仍未获得服务器发送回来的数据，则打印如下信息
				System.out.println("No response -- give up.");
			}
		}
		ds.close();
	}

	@Override
	public void recvData() {
		// TODO Auto-generated method stub

	}

}
