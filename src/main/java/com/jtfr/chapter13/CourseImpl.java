package com.jtfr.chapter13;

/**
 * 实现类: 编写额滴am过程，尽可能让接口和方法保持一致职责，很多类都不符合单一职责。
 */
public class CourseImpl implements ICourseInfo, ICourseManager {
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }

    public void modifyUserName(String userName){
        userName = "Tom";
    }

    public void modifyAddress(String address){
        address = "Changsha";
    }
}
