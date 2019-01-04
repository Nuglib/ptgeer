package com.ptg.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ptg.mapper.NavigationMapper;
import com.ptg.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Autowired
    private NavigationMapper navigationMapper;

    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String queryNavigationList() {
        try {
            return this.objectMapper.writeValueAsString(navigationMapper.selectAll());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}