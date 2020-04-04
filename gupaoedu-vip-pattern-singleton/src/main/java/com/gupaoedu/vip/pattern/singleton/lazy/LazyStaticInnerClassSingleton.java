package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 *
 */

/**
 * classpath: LazyStaticInnerClassSingleton.class
 *            LazyStaticInnerClassSingleton$LazyHolder.class
 * 优点： 利用java本身的语法特点，性能高，避免内存浪费,不能够被反射破坏
 * 缺点： 写法不优雅
 */
public class  LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){
        if(LazyHolder.INSTANCE!=null){
            System.out.println((LazyHolder.INSTANCE));
            throw  new RuntimeException("非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
