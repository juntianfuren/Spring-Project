package com.jtfr.chapter12;

/**
 * Tom第四个版本：Setter方式注入
 * 适用场景：
 */
public class Tom4 {
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }

    public static void main(String[] args) {
        Tom4 tom = new Tom4();
        tom.setCourse(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
