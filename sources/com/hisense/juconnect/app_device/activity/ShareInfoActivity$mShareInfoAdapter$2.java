package com.hisense.juconnect.app_device.activity;

import com.hisensehitachi.oversea.himit2.home.adapter.ShareInfoAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/hisensehitachi/oversea/himit2/home/adapter/ShareInfoAdapter;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ShareInfoActivity.kt */
public final class ShareInfoActivity$mShareInfoAdapter$2 extends Lambda implements Function0<ShareInfoAdapter> {
    public final /* synthetic */ ShareInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareInfoActivity$mShareInfoAdapter$2(ShareInfoActivity shareInfoActivity) {
        super(0);
        this.this$0 = shareInfoActivity;
    }

    @NotNull
    public final ShareInfoAdapter invoke() {
        return new ShareInfoAdapter(this.this$0.shareList);
    }
}
