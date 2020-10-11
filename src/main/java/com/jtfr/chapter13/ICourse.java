package com.jtfr.chapter13;

/**
 * 业务继续发展，课程要做权限。
 * 没有付费的学员可以获取课程基本信息，已经付费的学员可以获得视屏流，即学习权限。
 * 控制课程层面至少要有两个职责，可以把展示职责和管理职责分离开来，实现同一个抽象依赖。设计一个顶层接口创建 ICourse 接口
 */
public interface ICourse {

    // 学习课程
    void studyCourse();

    // 退款
    void refundCourse();

    // 获得基本信息
    String getCourseName();

    // 获得视频流
    byte[] getCourseVideo();
}
