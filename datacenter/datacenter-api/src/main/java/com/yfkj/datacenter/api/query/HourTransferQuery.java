package com.yfkj.datacenter.api.query;

/**
 * @author Jerry Tan
 * @date 2017\12\22 0022 11:05
 */
public class HourTransferQuery {
    private String provinceName;
    private String appName;
    private String cpid;
    private long amt;
    private int dhour;
    private long businerId;
    private int transType;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
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

    public int getTransType() {
        return transType;
    }

    public void setTransType(int transType) {
        this.transType = transType;
    }
}
