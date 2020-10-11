package com.jtfr.chapter222;

/**
 * CourseFactory 第三版 通过反射创建对象，直接传入字节码对象
 * 字节码对象，不需要再控制了传入的类名校验了。
 */
public class CourseFactory3 {
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if (null != clazz){
                return clazz.newInstance();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 简单工厂模式缺点：工厂类的职责过重，不易于扩展过于复杂的产品结构。
     * @param args
     */
    public static void main(String[] args) {
        CourseFactory3 courseFactory3 = new CourseFactory3();
        ICourse iCourse = courseFactory3.create(JavaCourse.class);
        iCourse.record();
    }
}
