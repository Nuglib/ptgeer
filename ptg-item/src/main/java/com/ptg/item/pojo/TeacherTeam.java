package com.ptg.item.pojo;

import javax.persistence.Table;

/**
 * @ClassName TeacherTeam
 * @Description TODO
 * @Author Jesse
 * @Date 2019/1/1 10:10
 * Version 1.0
 */
//讲师实体类
@Table(name = "tab_teacher_team")
public class TeacherTeam {
    private int Id;  //讲师编号
    private String TeacherNum; //教师编号
    private String TeacherAvatar;  //讲师头像简笔画
    private String TeacherName;   //讲师姓名
    private String TeacherDuties;   //讲师职责   小标题
    private String TeacherDetails;    //讲师职责详情

    public TeacherTeam() {
    }

    public TeacherTeam(int id, String teacherNum, String teacherAvatar, String teacherName, String teacherDuties, String teacherDetails) {
        Id = id;
        TeacherNum = teacherNum;
        TeacherAvatar = teacherAvatar;
        TeacherName = teacherName;
        TeacherDuties = teacherDuties;
        TeacherDetails = teacherDetails;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTeacherNum() {
        return TeacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        TeacherNum = teacherNum;
    }

    public String getTeacherAvatar() {
        return TeacherAvatar;
    }

    public void setTeacherAvatar(String teacherAvatar) {
        TeacherAvatar = teacherAvatar;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getTeacherDuties() {
        return TeacherDuties;
    }

    public void setTeacherDuties(String teacherDuties) {
        TeacherDuties = teacherDuties;
    }

    public String getTeacherDetails() {
        return TeacherDetails;
    }

    public void setTeacherDetails(String teacherDetails) {
        TeacherDetails = teacherDetails;
    }

    @Override
    public String toString() {
        return "TeacherTeam{" +
                "Id=" + Id +
                ", TeacherNum='" + TeacherNum + '\'' +
                ", TeacherAvatar='" + TeacherAvatar + '\'' +
                ", TeacherName='" + TeacherName + '\'' +
                ", TeacherDuties='" + TeacherDuties + '\'' +
                ", TeacherDetails='" + TeacherDetails + '\'' +
                '}';
    }
}
