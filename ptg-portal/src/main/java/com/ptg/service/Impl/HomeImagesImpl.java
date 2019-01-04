package com.ptg.service.Impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ptg.mapper.HomeImagesMapper;
import com.ptg.pojo.HomeImages;
import com.ptg.service.HomeImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName HomeImagesImpl
 * @Description TODO
 * @Author Jesse
 * @Date 2018/12/31 10:14
 * Version 1.0
 */
@Service
public class HomeImagesImpl implements HomeImagesService {
    @Autowired
    private HomeImagesMapper homeImagesMapper;
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public String queryHomeImages() {
        HomeImages homeImages = new HomeImages();
        homeImages.setPage("home");
        try {
            return objectMapper.writeValueAsString(this.homeImagesMapper.select(homeImages));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
