package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 优点：节省了内存
 * 缺点：线程不安全
 */
public class LazySimpleSingelton {

    private static LazySimpleSingelton instance;

    private  LazySimpleSingelton(){}

    public static synchronized LazySimpleSingelton getInstance(){
        if(instance==null){
            instance = new LazySimpleSingelton();
        }
        return instance;
    }
}
