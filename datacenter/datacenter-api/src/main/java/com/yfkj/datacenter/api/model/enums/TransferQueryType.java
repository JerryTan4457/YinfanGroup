package com.yfkj.datacenter.api.model.enums;

/**
 * @author Jerry Tan
 * @date 2017\12\21 0021 11:34
 */
public enum TransferQueryType {
    BY_App(1, "按应用实时查询");

    int value;
    String text;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    TransferQueryType(int value,String text){
        this.value = value;
        this.text = text;
    }
}
