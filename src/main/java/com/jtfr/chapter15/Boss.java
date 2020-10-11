package com.jtfr.chapter15;

import java.util.ArrayList;

/**
 * 学习软件设计原则，千万不能形成强迫症。碰到业务复杂的场景，我们需要随机应变。
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        // 模拟boss 一页一页往下翻页，TeamLeader 实时统计
        ArrayList<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
