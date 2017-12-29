package com.yfkj.datacenter.api.query;


import com.yfkj.datacenter.api.model.enums.TransferServiceType;
import com.yfkj.datacenter.api.utils.TimeUtils;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 16:24
 */
public class TransferQuery extends BaseQuery{
    private int serviceType = TransferServiceType.VIDEO.getValue();

    private String beginDate = TimeUtils.getFormatedCurrentDate();

    private String endDate = TimeUtils.getFormatedCurrentDate();

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public static void main(String[] args) {
        System.out.println(TimeUtils.getFormatedCurrentDate());
    }
}
