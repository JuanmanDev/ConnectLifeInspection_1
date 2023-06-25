package com.hmct.cloud.sdk.bean.wallpaper;

public class ThemeResourceDetailReply extends ThemeBaseReply {
    public static final long serialVersionUID = 3173600826473220936L;
    public ResourceDetailInfo resourceDetailInfo;

    public ResourceDetailInfo getResourceDetailInfo() {
        return this.resourceDetailInfo;
    }

    public void setResourceDetailInfo(ResourceDetailInfo resourceDetailInfo2) {
        this.resourceDetailInfo = resourceDetailInfo2;
    }
}
