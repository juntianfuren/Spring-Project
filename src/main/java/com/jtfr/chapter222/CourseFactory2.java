package com.jtfr.chapter222;

/**
 * CourseFactory 第二版 通过反射创建对象
 */
public class CourseFactory2 {
    public ICourse create(String className){
        try {
            if (!(null== className || "".equals(className))){
                return (ICourse)Class.forName(className).newInstance();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        CourseFactory2 factory = new CourseFactory2();
        System.out.println(JavaCourse.class.getName());
        ICourse iCourse = factory.create(JavaCourse.class.getName());
        iCourse.record();
    }
}
