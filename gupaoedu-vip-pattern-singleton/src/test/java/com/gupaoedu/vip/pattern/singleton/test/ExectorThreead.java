package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyDoubleCheckSingelton;

public class ExectorThreead implements  Runnable{

    @Override
    public void run() {
        LazyDoubleCheckSingelton instance = LazyDoubleCheckSingelton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
