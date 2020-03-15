package com.gupaoedu.vip.pattern.factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
//        Course course = new Course();
//        JavaCourse javaCourse = new JavaCourse();
//        javaCourse.record();
//        course.record();
        ICourse course = new JavaCourse();
        course.record();

       // ICourse iCourse = CourseFactory.create("");

        ICourse iCourse = CourseFactory.create1("com.gupaoedu.vip.pattern.factory.simpleFactory.JavaCourse");

        ICourse iCourse1 = CourseFactory.create3(JavaCourse.class);

     //   ICourse iCourse2 = CourseFactory.create3(Object.class);


    }
}
