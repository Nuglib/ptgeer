package com.ptg.item.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName StudentEmployment(学生就业实体类)
 * @Description TODO
 * @Author Jesse
 * @Date 2019/1/1 16:42
 * Version 1.0
 */
@Table(name = "tab_student_empl")
public class StudentEmployment {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;         //学生Id
    private String StudentNum;  //学生编号
    private String StudentName;   //学生姓名
    private Integer StudentGender;  //学生性别
    private Double StudentPriorSalary;   //就业前薪资
    private Double StudentAfterSalary;   //就业薪资
    private Integer StudentAge;          //学生年龄
    private String StudentEducation;     //学历
    private String StudentWorkLoca;      //工作地点


    public StudentEmployment() {
    }

    public StudentEmployment(String studentNum, String studentName, Integer studentGender, Double studentPriorSalary, Double studentAfterSalary, Integer studentAge, String studentEducation, String studentWorkLoca) {
        StudentNum = studentNum;
        StudentName = studentName;
        StudentGender = studentGender;
        StudentPriorSalary = studentPriorSalary;
        StudentAfterSalary = studentAfterSalary;
        StudentAge = studentAge;
        StudentEducation = studentEducation;
        StudentWorkLoca = studentWorkLoca;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(String studentNum) {
        StudentNum = studentNum;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Integer getStudentGender() {
        return StudentGender;
    }

    public void setStudentGender(Integer studentGender) {
        StudentGender = studentGender;
    }

    public Double getStudentPriorSalary() {
        return StudentPriorSalary;
    }

    public void setStudentPriorSalary(Double studentPriorSalary) {
        StudentPriorSalary = studentPriorSalary;
    }

    public Double getStudentAfterSalary() {
        return StudentAfterSalary;
    }

    public void setStudentAfterSalary(Double studentAfterSalary) {
        StudentAfterSalary = studentAfterSalary;
    }

    public Integer getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(Integer studentAge) {
        StudentAge = studentAge;
    }

    public String getStudentEducation() {
        return StudentEducation;
    }

    public void setStudentEducation(String studentEducation) {
        StudentEducation = studentEducation;
    }

    public String getStudentWorkLoca() {
        return StudentWorkLoca;
    }

    public void setStudentWorkLoca(String studentWorkLoca) {
        StudentWorkLoca = studentWorkLoca;
    }

    @Override
    public String toString() {
        return "StudentEmployment{" +
                "Id=" + Id +
                ", StudentNum='" + StudentNum + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentGender=" + StudentGender +
                ", StudentPriorSalary=" + StudentPriorSalary +
                ", StudentAfterSalary=" + StudentAfterSalary +
                ", StudentAge=" + StudentAge +
                ", StudentEducation='" + StudentEducation + '\'' +
                ", StudentWorkLoca='" + StudentWorkLoca + '\'' +
                '}';
    }
}
