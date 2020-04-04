package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThreeadLocal implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());

        System.out.println(Thread.currentThread().getName()+":"+ThreadLocalSingleton.getInstance());

    }
}
