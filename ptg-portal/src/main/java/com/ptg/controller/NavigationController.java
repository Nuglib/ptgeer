package com.ptg.controller;

import com.ptg.service.HomeImagesService;
import com.ptg.service.NavigationService;
import com.ptg.service.StudentEmploymentService;
import com.ptg.service.TeacherTeamService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("navigation")
public class NavigationController {
    @Autowired
    private NavigationService navigationService;

    @Autowired
    private HomeImagesService homeImagesService;

    @Autowired
    private TeacherTeamService teacherTeamService;

    @Autowired
    private StudentEmploymentService studentEmploymentService;

    //获取所有导航栏内容
    @GetMapping("all")
    public ResponseEntity queryNavigationList() {
        /**
          * @Description: 获取导航栏内容
          * @Param: []
          * @return: org.springframework.http.ResponseEntity
          * @Author: Jesse
          * @Date: 2019/1/1
          *
         */
        String NavigationList = null;
        try {
            NavigationList = this.navigationService.queryNavigationList();
            return ResponseEntity.ok(NavigationList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //获取主页图片
    @GetMapping("images")
    public ResponseEntity queryHomeImagesList(){
        String imagesList = null;
        try {
            imagesList = this.homeImagesService.queryHomeImages();
            if (StringUtils.isBlank(imagesList)){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
            return ResponseEntity.ok(imagesList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * 获取所有教师信息
     * @return
     */
    @GetMapping("queryTeacher")
    public ResponseEntity queryTeacherTeamList(){
        /**
          * @Description: 查询所有教师信息
          * @Param: []
          * @return: org.springframework.http.ResponseEntity
          * @Author: Jesse
          * @Date: 2019/1/1
          *
         */
        String teacherTeamList = null;
        try {
            teacherTeamList = this.teacherTeamService.queryTeacherList();
            if (StringUtils.isBlank(teacherTeamList)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            return ResponseEntity.ok(teacherTeamList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("queryStudentEmployment")
    public ResponseEntity queryStudentEmploymentList(){
        /**
          * @Description: 查询所有就业学生信息
          * @Param: []
          * @return: org.springframework.http.ResponseEntity
          * @Author: Jesse
          * @Date: 2019/1/1
          *
         */
        String studentEmploymentList = null;
        try {
            studentEmploymentList = this.studentEmploymentService.queryStudentEmploymentList();
            return ResponseEntity.ok(studentEmploymentList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}