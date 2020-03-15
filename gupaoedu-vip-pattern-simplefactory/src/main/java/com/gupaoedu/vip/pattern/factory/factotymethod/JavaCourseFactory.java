package com.gupaoedu.vip.pattern.factory.factotymethod;

public class JavaCourseFactory implements  ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
