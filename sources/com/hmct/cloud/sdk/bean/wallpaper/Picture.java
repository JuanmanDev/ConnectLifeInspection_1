package com.hmct.cloud.sdk.bean.wallpaper;

import java.io.Serializable;

public class Picture implements Serializable {
    public static final long serialVersionUID = 1225184872768795065L;
    public String picture;

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String str) {
        this.picture = str;
    }
}
