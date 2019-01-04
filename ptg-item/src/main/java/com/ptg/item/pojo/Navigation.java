package com.ptg.item.pojo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tab_navigation")
public class Navigation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;      //导航栏id
    private String name;     // 导航栏名称
    private Integer parentId;  //导航栏父级id
    private Integer isParent;   //是否为父级id  是为1，不是为0
    private String Route;      //路径

    public Navigation() {
    }

    public Navigation(String name, Integer parentId, Integer isParent, String route) {
        this.name = name;
        this.parentId = parentId;
        this.isParent = isParent;
        Route = route;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }

    @Override
    public String toString() {
        return "Navigation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", isParent=" + isParent +
                ", Route='" + Route + '\'' +
                '}';
    }
}
