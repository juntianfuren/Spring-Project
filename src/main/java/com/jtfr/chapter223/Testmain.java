package com.jtfr.chapter223;

/**
 * 工厂方法，和直接创建对象，有什么区别？
 * 适用场景：对外保持一致，对内可以随意变换创建操作。
 * 1. 创建兑现需要大量重复代码，方法修改后，对上传屏蔽了细节。
 * 2. 客户端不依赖产品类实例如何被创建、如何被实现的细节。
 * 3. 一个类通过其他子类来指定创建哪个对象。
 * 缺点：
 * 1. 类个数容易过多，增加复杂度
 * 2. 增加了系统的抽象性和理解难度
 */
public class Testmain {
    public static void main(String[] args) {
        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse iCourse = pythonCourseFactory.create();
        iCourse.record();

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse iCourse1 = javaCourseFactory.create();
        iCourse1.record();
    }
}
