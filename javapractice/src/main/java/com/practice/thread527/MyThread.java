package com.practice.thread527;

/**
 * Created by Administrator on 2016/5/27.
 */
public class MyThread extends Thread {

    private Boy mBoy ;
    private int a = 5 ;
    private String threadName;
    public MyThread( ){

    }
    @Override
    synchronized public  void run() {
        super.run();
        //mBoy.old++;
        a--;
//        System.out.println(threadName +"old =="+mBoy.old);
        System.out.println(this.currentThread().getName() +"old =="+a);
    }
}
