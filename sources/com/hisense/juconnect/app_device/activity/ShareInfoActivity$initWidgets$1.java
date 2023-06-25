package com.hisense.juconnect.app_device.activity;

import com.hisense.connect_life.hismart.networks.request.device.model.UserInfo;
import com.hisensehitachi.oversea.himit2.home.adapter.ShareInfoAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ShareInfoActivity$initWidgets$1", "Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter$IItemIndexedCallback;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/UserInfo;", "accept", "", "index", "", "item", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShareInfoActivity.kt */
public final class ShareInfoActivity$initWidgets$1 implements ShareInfoAdapter.IItemIndexedCallback<UserInfo> {
    public final /* synthetic */ ShareInfoActivity this$0;

    public ShareInfoActivity$initWidgets$1(ShareInfoActivity shareInfoActivity) {
        this.this$0 = shareInfoActivity;
    }

    public void accept(int i, @NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "item");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(Integer.parseInt(userInfo.getShareId())));
        this.this$0.shareList.remove(i);
        this.this$0.notifyShareList();
        ShareInfoActivity.access$getMViewModel(this.this$0).cancelShare(arrayList);
    }
}
