package com.ptg.item.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @ClassName Images(所有图片实体类)
 * @Description TODO
 * @Author Jesse
 * @Date 2018/12/31 10:23
 * Version 1.0
 */
@Table(name = "tab_portal_images")
public class Images {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Page;
    private String Image_Path;

    public Images() {
    }

    public Images(int id, String page, String image_Path) {
        Id = id;
        Page = page;
        Image_Path = image_Path;
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

    public String getImage_Path() {
        return Image_Path;
    }

    public void setImage_Path(String image_Path) {
        Image_Path = image_Path;
    }

    @Override
    public String toString() {
        return "Images{" +
                "Id=" + Id +
                ", Page='" + Page + '\'' +
                ", Image_Path='" + Image_Path + '\'' +
                '}';
    }
}
