package com.jtfr.chapter222;

public class CourseFactory {
    public static ICourse create(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }
        if ("python".equals(name)){
            return new PythonCourse();
        }
        return null;
    }

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        factory.create("java");

        CourseFactory.create("python");
    }
}
