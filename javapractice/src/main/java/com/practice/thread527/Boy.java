package com.practice.thread527;

/**
 * this class will handling in multithreading,so add synchronized in  grow method
 * Created by Alexander on 2016/5/27.
 */
public class Boy {
    private int age;
    public synchronized void grow(){
        age++;
        System.out.println("boy age is ==" + age);
    }
}
