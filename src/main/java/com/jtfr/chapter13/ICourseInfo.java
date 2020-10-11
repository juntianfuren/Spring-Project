package com.jtfr.chapter13;

/**
 * 课程信息
 */
public interface ICourseInfo {

    // 获得基本信息
    String getCourseName();

    // 获得视频流
    byte[] getCourseVideo();
}
