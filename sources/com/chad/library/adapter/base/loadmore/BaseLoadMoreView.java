package com.chad.library.adapter.base.loadmore;

import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo47991d2 = {"Lcom/chad/library/adapter/base/loadmore/BaseLoadMoreView;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "position", "Lcom/chad/library/adapter/base/loadmore/LoadMoreStatus;", "loadMoreStatus", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;ILcom/chad/library/adapter/base/loadmore/LoadMoreStatus;)V", "Landroid/view/View;", "getLoadComplete", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)Landroid/view/View;", "getLoadEndView", "getLoadFailView", "getLoadingView", "Landroid/view/ViewGroup;", "parent", "getRootView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "visible", "isVisible", "(Landroid/view/View;Z)V", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseLoadMoreView.kt */
public abstract class BaseLoadMoreView {

    @Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {}, mo47991d2 = {}, mo47992k = 3, mo47993mv = {1, 1, 16}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreStatus.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadMoreStatus.Complete.ordinal()] = 1;
            $EnumSwitchMapping$0[LoadMoreStatus.Loading.ordinal()] = 2;
            $EnumSwitchMapping$0[LoadMoreStatus.Fail.ordinal()] = 3;
            $EnumSwitchMapping$0[LoadMoreStatus.End.ordinal()] = 4;
        }
    }

    private final void isVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public void convert(@NotNull BaseViewHolder baseViewHolder, int i, @NotNull LoadMoreStatus loadMoreStatus) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[loadMoreStatus.ordinal()];
        if (i2 == 1) {
            isVisible(getLoadingView(baseViewHolder), false);
            isVisible(getLoadComplete(baseViewHolder), true);
            isVisible(getLoadFailView(baseViewHolder), false);
            isVisible(getLoadEndView(baseViewHolder), false);
        } else if (i2 == 2) {
            isVisible(getLoadingView(baseViewHolder), true);
            isVisible(getLoadComplete(baseViewHolder), false);
            isVisible(getLoadFailView(baseViewHolder), false);
            isVisible(getLoadEndView(baseViewHolder), false);
        } else if (i2 == 3) {
            isVisible(getLoadingView(baseViewHolder), false);
            isVisible(getLoadComplete(baseViewHolder), false);
            isVisible(getLoadFailView(baseViewHolder), true);
            isVisible(getLoadEndView(baseViewHolder), false);
        } else if (i2 == 4) {
            isVisible(getLoadingView(baseViewHolder), false);
            isVisible(getLoadComplete(baseViewHolder), false);
            isVisible(getLoadFailView(baseViewHolder), false);
            isVisible(getLoadEndView(baseViewHolder), true);
        }
    }

    @NotNull
    public abstract View getLoadComplete(@NotNull BaseViewHolder baseViewHolder);

    @NotNull
    public abstract View getLoadEndView(@NotNull BaseViewHolder baseViewHolder);

    @NotNull
    public abstract View getLoadFailView(@NotNull BaseViewHolder baseViewHolder);

    @NotNull
    public abstract View getLoadingView(@NotNull BaseViewHolder baseViewHolder);

    @NotNull
    public abstract View getRootView(@NotNull ViewGroup viewGroup);
}
