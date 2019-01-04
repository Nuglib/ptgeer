package com.ptg.common.pojo;

import java.util.List;

/**
 * @ClassName PageResult（分页信息）
 * @Description TODO
 * @Author Jesse
 * @Date 2019/1/1 15:55
 * Version 1.0
 */
public class PageResult<T> {
    private Long total;   //总条数
    private Integer totalPage;   //总页数
    private List<T> items;    //分页信息

    public PageResult() {
    }

    public PageResult(Integer totalPage, List<T> items) {
        this.totalPage = totalPage;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", totalPage=" + totalPage +
                ", items=" + items +
                '}';
    }
}