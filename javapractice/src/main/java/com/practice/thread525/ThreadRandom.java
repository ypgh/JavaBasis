package com.practice.thread525;

/**
 * 测试线程随机执行
 *
 * Created by Administrator on 2016/5/25.
 */
public class ThreadRandom {
    public static void main(String [] args){

        MyThread thread = new MyThread("1");
        thread.start();
        MyThread thread1 = new MyThread("2");
        thread1.start();
        MyThread thread2 = new MyThread("3");
        thread2.start();
    }
}
