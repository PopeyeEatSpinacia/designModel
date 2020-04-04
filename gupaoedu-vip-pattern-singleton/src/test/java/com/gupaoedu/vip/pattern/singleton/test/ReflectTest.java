package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor c  =clazz.getDeclaredConstructor(null);
            c.setAccessible(true);
            Object instance = c.newInstance();
            Object instance1 = c.newInstance();

            System.out.println(instance);
            System.out.println(instance1);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
