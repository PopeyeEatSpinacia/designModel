package com.gupaoedu.vip.pattern.factory.abstractFactory;

public class JavaCourseFactory extends CourseFactory{
    protected INote createNote() {
        super.init();
        return new JavaNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }
}
