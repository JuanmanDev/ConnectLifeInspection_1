package com.hmct.cloud.sdk.bean.wallpaper;

public class ThemeDownloadReply extends ThemeBaseReply {
    public static final long serialVersionUID = 791741388455167533L;
    public String finalUrl = null;

    public String getFinalUrl() {
        return this.finalUrl;
    }

    public void setFinalUrl(String str) {
        this.finalUrl = str;
    }
}
