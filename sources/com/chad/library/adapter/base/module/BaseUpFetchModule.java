package com.chad.library.adapter.base.module;

import com.chad.library.adapter.base.BaseQuickAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p111f.p112a.p113a.p114a.p116b.C1993i;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0016\u0018\u0000B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005¨\u0006\u001f"}, mo47991d2 = {"Lcom/chad/library/adapter/base/module/BaseUpFetchModule;", "", "position", "", "autoUpFetch$com_github_CymChad_brvah", "(I)V", "autoUpFetch", "Lcom/chad/library/adapter/base/listener/OnUpFetchListener;", "listener", "setOnUpFetchListener", "(Lcom/chad/library/adapter/base/listener/OnUpFetchListener;)V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "isUpFetchEnable", "Z", "()Z", "setUpFetchEnable", "(Z)V", "isUpFetching", "setUpFetching", "mUpFetchListener", "Lcom/chad/library/adapter/base/listener/OnUpFetchListener;", "startUpFetchPosition", "I", "getStartUpFetchPosition", "()I", "setStartUpFetchPosition", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: UpFetchModule.kt */
public class BaseUpFetchModule {
    public final BaseQuickAdapter<?, ?> baseQuickAdapter;
    public boolean isUpFetchEnable;
    public boolean isUpFetching;
    public C1993i mUpFetchListener;
    public int startUpFetchPosition = 1;

    public BaseUpFetchModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter2) {
        this.baseQuickAdapter = baseQuickAdapter2;
    }

    public final void autoUpFetch$com_github_CymChad_brvah(int i) {
        C1993i iVar;
        if (this.isUpFetchEnable && !this.isUpFetching && i <= this.startUpFetchPosition && (iVar = this.mUpFetchListener) != null) {
            iVar.mo16555a();
        }
    }

    public final int getStartUpFetchPosition() {
        return this.startUpFetchPosition;
    }

    public final boolean isUpFetchEnable() {
        return this.isUpFetchEnable;
    }

    public final boolean isUpFetching() {
        return this.isUpFetching;
    }

    public void setOnUpFetchListener(@Nullable C1993i iVar) {
        this.mUpFetchListener = iVar;
    }

    public final void setStartUpFetchPosition(int i) {
        this.startUpFetchPosition = i;
    }

    public final void setUpFetchEnable(boolean z) {
        this.isUpFetchEnable = z;
    }

    public final void setUpFetching(boolean z) {
        this.isUpFetching = z;
    }
}
