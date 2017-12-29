package com.yfkj.datacenter.api.model.result;

import java.util.List;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 15:25
 */
public class TransferPageResult<T> extends BaseResult {
    private List<T> itemList;
    private int totalCount;
    private int totalPage;
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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
