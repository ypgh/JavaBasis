package com.practice.thread525;

/**
 * Created by Administrator on 2016/5/25.
 */
public class MyThread extends Thread{

    private String mStr;

    public MyThread(String str){
        this.mStr = str;
    }
    @Override
    public void run() {
        super.run();
        System.out.println(this.getName()+"---str"+mStr);
    }
}
