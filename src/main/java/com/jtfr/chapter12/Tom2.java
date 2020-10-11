package com.jtfr.chapter12;

/**
 * Tom 第二个版本
 */
public class Tom2 {
    public void study(ICourse course){
        course.study();
    }

    /**
     * 这样修改后， Tom 兴趣增加再多，只需要新建一个类，通过传入参数的方式告诉Tom，不需要修改底层代码。
     * 原理：依赖注入，常用的还有构造器方式和 Setter 方式
     * @param args
     */
    public static void main(String[] args) {
        Tom2 tom = new Tom2();
        tom.study(new JavaCourse());
        tom.study(new PythonCourse());
    }
}
