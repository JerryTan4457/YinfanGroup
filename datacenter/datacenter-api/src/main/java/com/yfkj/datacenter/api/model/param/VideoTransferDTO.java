package com.yfkj.datacenter.api.model.param;

import java.util.Date;

/**
 * @author Jerry Tan
 * @date 2017-12-15
 */
public class VideoTransferDTO {
    private long id;
    /**id**/
    private Date eventDay;
    /**日期**/
    private String appId;
    /**应用id**/
    private String appName;
    /**应用名称**/
    private String provinceId;
    /**省份id**/
    private String provinceName;
    /**省份名称**/
    private String cpid;
    /**渠道id**/
    private long amt;
    /**金额**/
    private long reqNum;
    /**计费请求数**/
    private long userNum;
    /**计费用户数**/
    private long transSucc;
    /**计费成功数**/
    private int dhour;
    /**小时**/
    private long businerId;
    /**商务id**/
    private String businerName;
    /**商务名称**/
    private int transType;
    /**交易类型**/
    private long secondNum;
    /**二次确认数**/
    private long interFee;
    /**信息费**/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getEventDay() {
        return eventDay;
    }

    public void setEventDay(Date eventDay) {
        this.eventDay = eventDay;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    public long getReqNum() {
        return reqNum;
    }

    public void setReqNum(long reqNum) {
        this.reqNum = reqNum;
    }

    public long getUserNum() {
        return userNum;
    }

    public void setUserNum(long userNum) {
        this.userNum = userNum;
    }

    public long getTransSucc() {
        return transSucc;
    }

    public void setTransSucc(long transSucc) {
        this.transSucc = transSucc;
    }

    public int getDhour() {
        return dhour;
    }

    public void setDhour(int dhour) {
        this.dhour = dhour;
    }

    public long getBusinerId() {
        return businerId;
    }

    public void setBusinerId(long businerId) {
        this.businerId = businerId;
    }

    public String getBusinerName() {
        return businerName;
    }

    public void setBusinerName(String businerName) {
        this.businerName = businerName;
    }

    public int getTransType() {
        return transType;
    }

    public void setTransType(int transType) {
        this.transType = transType;
    }

    public long getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(long secondNum) {
        this.secondNum = secondNum;
    }

    public long getInterFee() {
        return interFee;
    }

    public void setInterFee(long interFee) {
        this.interFee = interFee;
    }


}
