package com.chad.library.adapter.base.module;

import kotlin.Metadata;
import p040c.p111f.p112a.p113a.p114a.p116b.C1992h;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo47991d2 = {"<anonymous>", "", "run", "com/chad/library/adapter/base/module/BaseLoadMoreModule$invokeLoadMoreListener$1$1"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: LoadMoreModule.kt */
public final class BaseLoadMoreModule$invokeLoadMoreListener$$inlined$let$lambda$1 implements Runnable {
    public final /* synthetic */ BaseLoadMoreModule this$0;

    public BaseLoadMoreModule$invokeLoadMoreListener$$inlined$let$lambda$1(BaseLoadMoreModule baseLoadMoreModule) {
        this.this$0 = baseLoadMoreModule;
    }

    public final void run() {
        C1992h access$getMLoadMoreListener$p = this.this$0.mLoadMoreListener;
        if (access$getMLoadMoreListener$p != null) {
            access$getMLoadMoreListener$p.mo16554a();
        }
    }
}
