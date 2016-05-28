package com.practice.thread527;

/**
 * 测试多线程安全
 * Created by Administrator on 2016/5/27.
 */
public class ThreadSafe {
    public static void main(String [] args){

        Boy boy = new Boy();
//
//        MyThread thread = new MyThread(boy,"A");
//        thread.start();
//        MyThread thread1 = new MyThread(boy,"B");
//        thread1.start();
//        MyThread thread2 = new MyThread(boy,"C");
//        MyThread thread3 = new MyThread(boy,"D");
//        MyThread thread4 = new MyThread(boy,"E");
//        MyThread thread5 = new MyThread(boy,"F");
//        MyThread thread6 = new MyThread(boy,"G");
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();

        MyThread mythread = new MyThread();
        Thread thread = new Thread(mythread,"A");
        Thread thread1 = new Thread(mythread,"B");
        Thread thread2 = new Thread(mythread,"C");
        thread.start();
        thread1.start();
        thread2.start();

    }
}
