package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThreeadLocal());
        Thread t2 = new Thread(new ExectorThreeadLocal());
        t1.start();
        t2.start();
        System.out.println("END");

    }
}
