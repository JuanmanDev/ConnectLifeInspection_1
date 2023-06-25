package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\n\u0010\tR(\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo47991d2 = {"Lcom/chad/library/adapter/base/module/LoadMoreModuleConfig;", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "defLoadMoreView", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "getDefLoadMoreView", "()Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "setDefLoadMoreView", "(Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;)V", "defLoadMoreView$annotations", "()V", "<init>", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: LoadMoreModule.kt */
public final class LoadMoreModuleConfig {
    public static final LoadMoreModuleConfig INSTANCE = new LoadMoreModuleConfig();
    @NotNull
    public static BaseLoadMoreView defLoadMoreView = new SimpleLoadMoreView();

    @JvmStatic
    public static /* synthetic */ void defLoadMoreView$annotations() {
    }

    @NotNull
    public static final BaseLoadMoreView getDefLoadMoreView() {
        return defLoadMoreView;
    }

    public static final void setDefLoadMoreView(@NotNull BaseLoadMoreView baseLoadMoreView) {
        defLoadMoreView = baseLoadMoreView;
    }
}
