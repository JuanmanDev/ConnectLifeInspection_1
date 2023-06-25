package com.hmct.cloud.sdk.bean.wallpaper;

import java.io.Serializable;
import java.util.List;

public class ObjectInfo implements Serializable {
    public static final long serialVersionUID = -1377681242698998722L;
    public int displayOrder;

    /* renamed from: id */
    public long f16451id;
    public List<MetaInfo> meta;
    public int type;
    public String url;

    public int getDisplayOrder() {
        return this.displayOrder;
    }

    public long getId() {
        return this.f16451id;
    }

    public List<MetaInfo> getMeta() {
        return this.meta;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setDisplayOrder(int i) {
        this.displayOrder = i;
    }

    public void setId(long j) {
        this.f16451id = j;
    }

    public void setMeta(List<MetaInfo> list) {
        this.meta = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
