package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance= EnumSingleton.getInstance();
        instance.setData(new Object());

        Class clazz =EnumSingleton.class;
        //Enum没有无参构造方法
       // Constructor c = clazz.getDeclaredConstructor();
        Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
        //从jdk的底层限制不能用反射构造枚举类型
        c.setAccessible(true);
        Object instance1e =  c.newInstance();
    }
}
