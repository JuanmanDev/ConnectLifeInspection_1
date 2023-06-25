package com.chad.library.adapter.base.module;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "run"}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: LoadMoreModule.kt */
public final class BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$1 implements Runnable {
    public final /* synthetic */ RecyclerView.LayoutManager $manager;
    public final /* synthetic */ BaseLoadMoreModule this$0;

    public BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$1(BaseLoadMoreModule baseLoadMoreModule, RecyclerView.LayoutManager layoutManager) {
        this.this$0 = baseLoadMoreModule;
        this.$manager = layoutManager;
    }

    public final void run() {
        if (this.this$0.isFullScreen((LinearLayoutManager) this.$manager)) {
            this.this$0.mNextLoadEnable = true;
        }
    }
}
