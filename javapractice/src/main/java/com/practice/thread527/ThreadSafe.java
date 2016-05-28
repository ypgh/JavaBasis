package com.practice.thread527;

/**
 * test multithreading safe
 * Created by Alexander on 2016/5/27.
 */
public class ThreadSafe {
    public static void main(String [] args){
        Boy boy = new Boy();
        MyThread thread = new MyThread(boy);
        MyThread thread2 = new MyThread(boy);
        MyThread thread1 = new MyThread(boy);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
