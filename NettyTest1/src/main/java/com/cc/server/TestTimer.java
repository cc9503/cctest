package com.cc.server;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Task task = new Task();
        timer.schedule(task, new Date(), 3000);
    }
}
 
class Task extends TimerTask{
    @Override
    public void run() {
        System.out.println("Do work...");
        
        String str="测试";
        InputStream stream = new ByteArrayInputStream(str.getBytes());
        System.out.println(str);
    }
}

