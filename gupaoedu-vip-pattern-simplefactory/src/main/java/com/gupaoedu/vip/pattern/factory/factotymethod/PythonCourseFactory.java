package com.gupaoedu.vip.pattern.factory.factotymethod;

public class PythonCourseFactory implements  ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}
