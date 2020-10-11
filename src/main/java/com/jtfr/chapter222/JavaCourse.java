package com.jtfr.chapter222;

public class JavaCourse implements ICourse {
    public void record() {
        System.out.println("录制 Java 课程");
    }

    public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.record();
    }
}
