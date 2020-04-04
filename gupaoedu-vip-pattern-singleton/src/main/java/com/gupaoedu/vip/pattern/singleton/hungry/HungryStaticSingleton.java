package com.gupaoedu.vip.pattern.singleton.hungry;

/**
 * 先静态后动态
 * 先上后下
 * 先属性后方法
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton ;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton (){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
