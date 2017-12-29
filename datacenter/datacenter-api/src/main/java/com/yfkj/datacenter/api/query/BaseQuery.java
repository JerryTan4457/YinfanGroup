package com.yfkj.datacenter.api.query;

import java.io.Serializable;

/**
 * @author Jerry Tan
 * @date 2017\12\20 0020 11:14
 */
public class BaseQuery implements Serializable{
    private static final long serialVersionUID = -1414220665147970278L;

    /** 默认分页大小 **/
    private static final int DEFAULT_PAGE_SIZE = 30;

    /** 默认分页码 **/
    private static final int DEFAULT_CURRENT_PAGE = 1;

    /** 当前页 **/
    private int pageNo = DEFAULT_CURRENT_PAGE;

    /** 每页的记录数 **/
    private int pageSize = DEFAULT_PAGE_SIZE;

    /** 总记录数 **/
    private int total = 0;

    /** 总页数 **/
    private int pageNum = 0;

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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}