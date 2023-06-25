package com.chad.library.adapter.base.module;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p111f.p112a.p113a.p114a.p116b.C1992h;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000B\u0017\u0012\u000e\u0010'\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&¢\u0006\u0004\bM\u0010NJ\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u0019\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001b\u0010\bJ\u0019\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R\u001e\u0010'\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010)\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0018R\"\u0010-\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0018R*\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0018R\"\u00102\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0018R$\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8\u0006@BX\u000e¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b5\u0010\u000fR\u0013\u00106\u001a\u00020\r8F@\u0006¢\u0006\u0006\u001a\u0004\b6\u0010\u000fR$\u00108\u001a\u0002072\u0006\u00104\u001a\u0002078\u0006@BX\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0013\u0010E\u001a\u00020\u00018F@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010*R*\u0010I\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00018\u0006@FX\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010D\"\u0004\bL\u0010\u0005¨\u0006O"}, mo47991d2 = {"Lcom/chad/library/adapter/base/module/BaseLoadMoreModule;", "", "position", "", "autoLoadMore$com_github_CymChad_brvah", "(I)V", "autoLoadMore", "checkDisableLoadMoreIfNotFullPage", "()V", "", "numbers", "getTheBiggestNumber", "([I)I", "", "hasLoadMoreView", "()Z", "invokeLoadMoreListener", "Landroidx/recyclerview/widget/LinearLayoutManager;", "llm", "isFullScreen", "(Landroidx/recyclerview/widget/LinearLayoutManager;)Z", "loadMoreComplete", "gone", "loadMoreEnd", "(Z)V", "loadMoreFail", "loadMoreToLoading", "reset$com_github_CymChad_brvah", "reset", "Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;", "listener", "setOnLoadMoreListener", "(Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "viewHolder", "setupViewHolder$com_github_CymChad_brvah", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "setupViewHolder", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "enableLoadMoreEndClick", "Z", "getEnableLoadMoreEndClick", "setEnableLoadMoreEndClick", "isAutoLoadMore", "setAutoLoadMore", "value", "isEnableLoadMore", "setEnableLoadMore", "isEnableLoadMoreIfNotFullPage", "setEnableLoadMoreIfNotFullPage", "<set-?>", "isLoadEndMoreGone", "isLoading", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreStatus", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "getLoadMoreStatus", "()Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "loadMoreView", "Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "getLoadMoreView", "()Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "setLoadMoreView", "(Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;)V", "getLoadMoreViewPosition", "()I", "loadMoreViewPosition", "mLoadMoreListener", "Lcom/chad/library/adapter/base/listener/OnLoadMoreListener;", "mNextLoadEnable", "preLoadNumber", "I", "getPreLoadNumber", "setPreLoadNumber", "<init>", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: LoadMoreModule.kt */
public class BaseLoadMoreModule {
    public final BaseQuickAdapter<?, ?> baseQuickAdapter;
    public boolean enableLoadMoreEndClick;
    public boolean isAutoLoadMore = true;
    public boolean isEnableLoadMore;
    public boolean isEnableLoadMoreIfNotFullPage = true;
    public boolean isLoadEndMoreGone;
    @NotNull
    public LoadMoreStatus loadMoreStatus = LoadMoreStatus.Complete;
    @NotNull
    public BaseLoadMoreView loadMoreView = LoadMoreModuleConfig.getDefLoadMoreView();
    public C1992h mLoadMoreListener;
    public boolean mNextLoadEnable = true;
    public int preLoadNumber = 1;

    public BaseLoadMoreModule(@NotNull BaseQuickAdapter<?, ?> baseQuickAdapter2) {
        this.baseQuickAdapter = baseQuickAdapter2;
    }

    /* access modifiers changed from: private */
    public final int getTheBiggestNumber(int[] iArr) {
        int i = -1;
        if (iArr != null) {
            if (!(iArr.length == 0)) {
                for (int i2 : iArr) {
                    if (i2 > i) {
                        i = i2;
                    }
                }
            }
        }
        return i;
    }

    private final void invokeLoadMoreListener() {
        this.loadMoreStatus = LoadMoreStatus.Loading;
        RecyclerView mRecyclerView$com_github_CymChad_brvah = this.baseQuickAdapter.getMRecyclerView$com_github_CymChad_brvah();
        if (mRecyclerView$com_github_CymChad_brvah != null) {
            mRecyclerView$com_github_CymChad_brvah.post(new BaseLoadMoreModule$invokeLoadMoreListener$$inlined$let$lambda$1(this));
            return;
        }
        C1992h hVar = this.mLoadMoreListener;
        if (hVar != null) {
            hVar.mo16554a();
        }
    }

    /* access modifiers changed from: private */
    public final boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == this.baseQuickAdapter.getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void loadMoreEnd$default(BaseLoadMoreModule baseLoadMoreModule, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            baseLoadMoreModule.loadMoreEnd(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int i) {
        LoadMoreStatus loadMoreStatus2;
        if (this.isAutoLoadMore && hasLoadMoreView() && i >= this.baseQuickAdapter.getItemCount() - this.preLoadNumber && (loadMoreStatus2 = this.loadMoreStatus) == LoadMoreStatus.Complete && loadMoreStatus2 != LoadMoreStatus.Loading && this.mNextLoadEnable) {
            invokeLoadMoreListener();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        RecyclerView.LayoutManager layoutManager;
        if (!this.isEnableLoadMoreIfNotFullPage) {
            this.mNextLoadEnable = false;
            RecyclerView mRecyclerView$com_github_CymChad_brvah = this.baseQuickAdapter.getMRecyclerView$com_github_CymChad_brvah();
            if (mRecyclerView$com_github_CymChad_brvah != null && (layoutManager = mRecyclerView$com_github_CymChad_brvah.getLayoutManager()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return");
                if (layoutManager instanceof LinearLayoutManager) {
                    mRecyclerView$com_github_CymChad_brvah.postDelayed(new BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$1(this, layoutManager), 50);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    mRecyclerView$com_github_CymChad_brvah.postDelayed(new BaseLoadMoreModule$checkDisableLoadMoreIfNotFullPage$2(this, layoutManager), 50);
                }
            }
        }
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.enableLoadMoreEndClick;
    }

    @NotNull
    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    @NotNull
    public final BaseLoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    public final int getLoadMoreViewPosition() {
        if (this.baseQuickAdapter.hasEmptyView()) {
            return -1;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter2 = this.baseQuickAdapter;
        return baseQuickAdapter2.getHeaderLayoutCount() + baseQuickAdapter2.getData().size() + baseQuickAdapter2.getFooterLayoutCount();
    }

    public final int getPreLoadNumber() {
        return this.preLoadNumber;
    }

    public final boolean hasLoadMoreView() {
        if (this.mLoadMoreListener == null || !this.isEnableLoadMore) {
            return false;
        }
        if (this.loadMoreStatus != LoadMoreStatus.End || !this.isLoadEndMoreGone) {
            return !this.baseQuickAdapter.getData().isEmpty();
        }
        return false;
    }

    public final boolean isAutoLoadMore() {
        return this.isAutoLoadMore;
    }

    public final boolean isEnableLoadMore() {
        return this.isEnableLoadMore;
    }

    public final boolean isEnableLoadMoreIfNotFullPage() {
        return this.isEnableLoadMoreIfNotFullPage;
    }

    public final boolean isLoadEndMoreGone() {
        return this.isLoadEndMoreGone;
    }

    public final boolean isLoading() {
        return this.loadMoreStatus == LoadMoreStatus.Loading;
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    @JvmOverloads
    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, (Object) null);
    }

    @JvmOverloads
    public final void loadMoreEnd(boolean z) {
        if (hasLoadMoreView()) {
            this.isLoadEndMoreGone = z;
            this.loadMoreStatus = LoadMoreStatus.End;
            if (z) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Fail;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreToLoading() {
        LoadMoreStatus loadMoreStatus2 = this.loadMoreStatus;
        LoadMoreStatus loadMoreStatus3 = LoadMoreStatus.Loading;
        if (loadMoreStatus2 != loadMoreStatus3) {
            this.loadMoreStatus = loadMoreStatus3;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            invokeLoadMoreListener();
        }
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.mLoadMoreListener != null) {
            setEnableLoadMore(true);
            this.loadMoreStatus = LoadMoreStatus.Complete;
        }
    }

    public final void setAutoLoadMore(boolean z) {
        this.isAutoLoadMore = z;
    }

    public final void setEnableLoadMore(boolean z) {
        boolean hasLoadMoreView = hasLoadMoreView();
        this.isEnableLoadMore = z;
        boolean hasLoadMoreView2 = hasLoadMoreView();
        if (hasLoadMoreView) {
            if (!hasLoadMoreView2) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (hasLoadMoreView2) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setEnableLoadMoreEndClick(boolean z) {
        this.enableLoadMoreEndClick = z;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z) {
        this.isEnableLoadMoreIfNotFullPage = z;
    }

    public final void setLoadMoreView(@NotNull BaseLoadMoreView baseLoadMoreView) {
        this.loadMoreView = baseLoadMoreView;
    }

    public void setOnLoadMoreListener(@Nullable C1992h hVar) {
        this.mLoadMoreListener = hVar;
        setEnableLoadMore(true);
    }

    public final void setPreLoadNumber(int i) {
        if (i > 1) {
            this.preLoadNumber = i;
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(@NotNull BaseViewHolder baseViewHolder) {
        baseViewHolder.itemView.setOnClickListener(new BaseLoadMoreModule$setupViewHolder$1(this));
    }
}
