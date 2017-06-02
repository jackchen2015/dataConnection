package com.hxct.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.hxct.CustomTask;

public class TimeArrangeMent {
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        new TimeArrangeMent().arrange();    
    }  
  
    //时间间隔(一天)  
    private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;  
    public TimeArrangeMent() {  
    }
    
    public void arrange(){
        Calendar calendar = Calendar.getInstance();
        String beginTime = System.getProperty("collect_data_time");
        int hTime = 3;
        int mTime = 8;
        int sTime = 15;
        String[] times = beginTime.split(":");
        if(beginTime!=null){
        	hTime = Integer.parseInt(times[0]);
        	mTime = Integer.parseInt(times[1]);
        	sTime = Integer.parseInt(times[2]);
        }
        calendar.set(Calendar.HOUR_OF_DAY, hTime); //凌晨3点  
        calendar.set(Calendar.MINUTE, mTime);
        calendar.set(Calendar.SECOND, sTime); 
        Date date=calendar.getTime(); //第一次执行定时任务的时间  
        //如果第一次执行定时任务的时间 小于当前的时间  
        //此时要在 第一次执行定时任务的时间加一天，以便此任务在下个时间点执行。如果不加一天，任务会立即执行。  
        if (date.before(new Date())) {  
            date = this.addDay(date, 1);  
        }  
        Timer timer = new Timer();  
        CustomTask task = new CustomTask();  
        //安排指定的任务在指定的时间开始进行重复的固定延迟执行。  
//        timer.schedule(task, date, PERIOD_DAY);
        task.run();
    }
    // 增加或减少天数  
    public Date addDay(Date date, int num) {  
        Calendar startDT = Calendar.getInstance();  
        startDT.setTime(date);  
        startDT.add(Calendar.DAY_OF_MONTH, num);  
        return startDT.getTime();  
    }  
}
