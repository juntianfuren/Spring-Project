package com.jtfr.chapter13;

public class Course {

    public void study(String courseName){
        if ("直播课".equals(courseName)){
            System.out.println(courseName + "不能快进");
        } else {
            System.out.println(courseName + "可以反复观看");
        }
    }

    /**
     * Course 类承担处理了两种处理逻辑，如果要加密，直播课程和录播课程加密逻辑不一样，必须修改代码，修改代码的逻辑势必会影响，带来不可控的风险。
     * @param args
     */
    public static void main(String[] args){
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
    }
}
