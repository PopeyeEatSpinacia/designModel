package com.gupaoedu.vip.pattern.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {
    //序列化 把内存中对象的状态转换成字节码的形式
    //把字节码通过IO输出流，写到磁盘上永久保存下来，持久化
    //

    //反序列化将持久化的字节码的内容通过IO输入流到内存中来
    //转换成一个java对象




    private final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //桥接模式
    private Object readResolve(){
        return INSTANCE;
    }
}
