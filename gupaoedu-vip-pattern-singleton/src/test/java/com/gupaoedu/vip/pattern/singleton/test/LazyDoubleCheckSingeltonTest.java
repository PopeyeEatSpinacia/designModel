package com.gupaoedu.vip.pattern.singleton.test;

public class LazyDoubleCheckSingeltonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThreead());
        Thread t2 = new Thread(new ExectorThreead());
        t1.start();
        t2.start();
        System.out.println("END");

    }
}
