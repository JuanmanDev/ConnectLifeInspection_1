package com.hmct.cloud.sdk.bean.global;

import java.io.Serializable;

public class ReplyInfo implements Serializable {
    public static final long serialVersionUID = 9062430960119306826L;
    public String desc;
    public ErrorInfo error;
    public int reply = Integer.MIN_VALUE;

    public String getDesc() {
        return this.desc;
    }

    public ErrorInfo getError() {
        return this.error;
    }

    public int getReply() {
        return this.reply;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setError(ErrorInfo errorInfo) {
        this.error = errorInfo;
    }

    public void setReply(int i) {
        this.reply = i;
    }
}
