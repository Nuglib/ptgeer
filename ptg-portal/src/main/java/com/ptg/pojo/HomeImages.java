package com.ptg.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @ClassName HomeImages
 * @Description TODO
 * @Author Jesse
 * @Date 2018/12/31 10:28
 * Version 1.0
 */

@Table(name = "tab_portal_images")
public class HomeImages{
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Page;
    private String ImagePath;

    public HomeImages() {
    }

    public HomeImages(String page, String imagePath) {
        Page = page;
        ImagePath = imagePath;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPage() {
        return Page;
    }

    public void setPage(String page) {
        Page = page;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    @Override
    public String toString() {
        return "HomeImages{" +
                "Id=" + Id +
                ", Page='" + Page + '\'' +
                ", ImagePath='" + ImagePath + '\'' +
                '}';
    }
}
