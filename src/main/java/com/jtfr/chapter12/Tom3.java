package com.jtfr.chapter12;

/**
 * Tom第三个版本: 通过构造方法注入。
 * 适合场景：全局单例，这样只在第一次创建的时候选择使用 Setter方式注入。
 */
public class Tom3 {

    private ICourse course;

    public Tom3(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }

    public static void main(String[] args) {
        Tom3 tom = new Tom3(new JavaCourse());
        tom.study();
    }
}
