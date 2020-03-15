package com.gupaoedu.vip.pattern.factory.abstractFactory;

public  abstract class CourseFactory {

    public  void init(){
        System.out.println("初始化基础数据");
    }

    protected  abstract INote createNote();

    protected abstract  IVideo createVideo();
}
