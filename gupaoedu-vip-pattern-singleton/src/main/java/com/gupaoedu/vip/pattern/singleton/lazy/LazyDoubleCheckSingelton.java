package com.gupaoedu.vip.pattern.singleton.lazy;



/**
 * 优点：性能提高了，线程安全了
 * 缺点：可读性难度加大，不够优雅
 */
public class LazyDoubleCheckSingelton {

    private volatile static LazyDoubleCheckSingelton instance;

    private LazyDoubleCheckSingelton(){}

    public static LazyDoubleCheckSingelton getInstance(){
        //检查是否阻塞
        if(instance==null){
            synchronized (LazySimpleSingelton.class){
                //检查是否要重新创建实例
                instance = new LazyDoubleCheckSingelton();
                //指令重排序的问题
            }
        }
        return instance;
    }
}
