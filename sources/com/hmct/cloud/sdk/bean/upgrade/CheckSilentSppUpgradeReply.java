package com.hmct.cloud.sdk.bean.upgrade;

import com.hmct.cloud.sdk.bean.global.ReplyInfo;
import java.util.List;

public class CheckSilentSppUpgradeReply extends ReplyInfo {
    public static final long serialVersionUID = -524497223102141262L;
    public List<AppPackageInfo> appPackageList;

    public List<AppPackageInfo> getAppPackageList() {
        return this.appPackageList;
    }

    public void setAppPackageList(List<AppPackageInfo> list) {
        this.appPackageList = list;
    }
}
