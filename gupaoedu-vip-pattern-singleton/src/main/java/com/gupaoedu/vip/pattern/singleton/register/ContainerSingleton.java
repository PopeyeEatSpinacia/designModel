package com.gupaoedu.vip.pattern.singleton.register;

import org.checkerframework.checker.units.qual.C;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 线程安全问题和序列化的问题
 * 容器式单例适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object instance = null;
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                try {
                    instance = Class.forName(className).newInstance();
                    ioc.put(className, instance);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return instance;
            } else {
                return ioc.get(className);
            }
        }
    }
}
