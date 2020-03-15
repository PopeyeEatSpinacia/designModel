package com.gupaoedu.vip.pattern.factory.simpleFactory;

public class CourseFactory {
    public static ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }
        return null;
    }

    public static ICourse create1(String name){
        if(!(null==name || "".equals(name))){
            try {
                return (ICourse)Class.forName(name).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static ICourse create2(Class className){
        if(!(null==className)){
            try {
                return (ICourse) className.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return null;
    }

    public static ICourse create3(Class<? extends ICourse> className){
        if(!(null==className)){
            try {
                return  className.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
