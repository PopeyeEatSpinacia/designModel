package com.gupaoedu.vip.pattern.singleton.register;

/**
 * 优点：写法优雅，线程安全，
 *
 * 缺点：不能大批量创建对象（一开始就放到map上）
 */

public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
