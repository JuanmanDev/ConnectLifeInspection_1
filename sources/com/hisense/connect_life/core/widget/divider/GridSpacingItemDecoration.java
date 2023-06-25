package com.hisense.connect_life.core.widget.divider;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/core/widget/divider/GridSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spanCount", "", "spacing", "includeEdge", "", "spaceTop", "(IIZI)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GridSpacingItemDecoration.kt */
public final class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    public final boolean includeEdge;
    public final int spaceTop;
    public final int spacing;
    public final int spanCount;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GridSpacingItemDecoration(int i, int i2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, (i4 & 8) != 0 ? 0 : i3);
    }

    public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.spanCount;
        int i2 = childAdapterPosition / i;
        int i3 = childAdapterPosition % i;
        if (this.includeEdge) {
            if (i2 == 0) {
                int i4 = this.spacing;
                rect.left = i4 - ((i3 * i4) / i);
                rect.right = ((i3 + 1) * i4) / i;
                rect.top = this.spaceTop + i4;
                rect.bottom = i4;
                return;
            }
            int i5 = this.spacing;
            rect.left = i5 - ((i3 * i5) / i);
            rect.right = ((i3 + 1) * i5) / i;
            if (childAdapterPosition < i) {
                rect.top = i5;
            }
            rect.bottom = this.spacing;
        } else if (i2 == 0) {
            int i6 = this.spacing;
            rect.left = i6 - ((i3 * i6) / i);
            rect.right = ((i3 + 1) * i6) / i;
            rect.top = this.spaceTop;
            rect.bottom = i6;
        } else {
            int i7 = this.spacing;
            rect.left = (i3 * i7) / i;
            rect.right = i7 - (((i3 + 1) * i7) / i);
            if (childAdapterPosition < i) {
                rect.top = i7;
            }
            rect.bottom = this.spacing;
        }
    }

    public GridSpacingItemDecoration(int i, int i2, boolean z, int i3) {
        this.spanCount = i;
        this.spacing = i2;
        this.includeEdge = z;
        this.spaceTop = i3;
    }
}
