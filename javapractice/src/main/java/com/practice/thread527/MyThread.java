package com.practice.thread527;

/**
 * Created by Alexander on 2016/5/27.
 */
public class MyThread extends Thread {

    private Boy mBoy ;
    public MyThread(Boy boy) {
        this.mBoy = boy;
    }
    @Override
     public  void run() {
        super.run();
         mBoy.grow();
    }
}
