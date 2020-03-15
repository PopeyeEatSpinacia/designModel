package com.gupaoedu.vip.pattern.factory.factotymethod;

public class Test {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
