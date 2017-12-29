package com.yfkj.datacenter.api.model.param;

import java.io.Serializable;
import java.util.List;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 11:21
 */
public class PageDTO<T> implements Serializable{
    private List<T> itemList;

    private int totalCount;

    private int totalPage;

    private int pageNo;

    private int pageSize;

    public List<T> getItemList() {
        return itemList;
    }

    public void setItemList(List<T> itemList) {
        this.itemList = itemList;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
