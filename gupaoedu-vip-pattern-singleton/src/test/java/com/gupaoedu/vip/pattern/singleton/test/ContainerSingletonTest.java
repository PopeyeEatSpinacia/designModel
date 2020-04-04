package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object o = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        Object o1 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");

        System.out.println(o);
        System.out.println(o1);

    }
}
