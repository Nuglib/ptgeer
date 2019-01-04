package com.ptg.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ptg.mapper.TeacherTeamMapper;
import com.ptg.service.TeacherTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TeacherTeamImpl
 * @Description TODO
 * @Author Jesse
 * @Date 2019/1/1 10:39
 * Version 1.0
 */
@Service
public class TeacherTeamImpl implements TeacherTeamService {
    @Autowired
    private TeacherTeamMapper teacherTeamMapper;
    @Autowired
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String queryTeacherList() {
        try {
            return this.objectMapper.writeValueAsString(this.teacherTeamMapper.selectAll());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
