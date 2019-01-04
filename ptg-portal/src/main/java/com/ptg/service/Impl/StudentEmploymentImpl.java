package com.ptg.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ptg.mapper.StudentEmploymentMapper;
import com.ptg.service.StudentEmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName StudentEmploymentImpl
 * @Description TODO
 * @Author Jesse
 * @Date 2019/1/1 16:31
 * Version 1.0
 */
@Service
public class StudentEmploymentImpl implements StudentEmploymentService {
    @Autowired
    private StudentEmploymentMapper studentEmploymentMapper;

    @Autowired
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String queryStudentEmploymentList() {
        try {
            return objectMapper.writeValueAsString(this.studentEmploymentMapper.selectAll());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
