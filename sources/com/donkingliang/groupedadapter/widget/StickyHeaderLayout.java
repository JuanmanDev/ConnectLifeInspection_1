package com.donkingliang.groupedadapter.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import java.lang.reflect.Method;

public class StickyHeaderLayout extends FrameLayout {

    /* renamed from: e */
    public Context f7160e;

    /* renamed from: l */
    public RecyclerView f7161l;

    /* renamed from: m */
    public FrameLayout f7162m;

    /* renamed from: n */
    public final SparseArray<BaseViewHolder> f7163n = new SparseArray<>();

    /* renamed from: o */
    public int f7164o = -1;

    /* renamed from: p */
    public boolean f7165p = true;

    /* renamed from: q */
    public boolean f7166q = false;

    /* renamed from: com.donkingliang.groupedadapter.widget.StickyHeaderLayout$a */
    public class C3878a extends RecyclerView.OnScrollListener {
        public C3878a() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (StickyHeaderLayout.this.f7165p) {
                StickyHeaderLayout.this.mo22551l(false);
            }
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.widget.StickyHeaderLayout$b */
    public class C3879b extends RecyclerView.AdapterDataObserver {
        public C3879b() {
        }

        public void onChanged() {
            StickyHeaderLayout.this.mo22552m();
        }

        public void onItemRangeChanged(int i, int i2) {
            StickyHeaderLayout.this.mo22552m();
        }

        public void onItemRangeInserted(int i, int i2) {
            StickyHeaderLayout.this.mo22552m();
        }

        public void onItemRangeRemoved(int i, int i2) {
            StickyHeaderLayout.this.mo22552m();
        }
    }

    /* renamed from: com.donkingliang.groupedadapter.widget.StickyHeaderLayout$c */
    public class C3880c implements Runnable {
        public C3880c() {
        }

        public void run() {
            StickyHeaderLayout.this.mo22551l(true);
        }
    }

    public StickyHeaderLayout(@NonNull Context context) {
        super(context);
        this.f7160e = context;
    }

    private int getFirstVisibleItem() {
        RecyclerView.LayoutManager layoutManager = this.f7161l.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                return mo22546g(iArr);
            }
        }
        return -1;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0 || !(view instanceof RecyclerView)) {
            throw new IllegalArgumentException("StickyHeaderLayout can host only one direct child --> RecyclerView");
        }
        super.addView(view, i, layoutParams);
        this.f7161l = (RecyclerView) view;
        mo22543d();
        mo22544e();
    }

    public int computeVerticalScrollExtent() {
        if (this.f7161l != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollExtent", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f7161l, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        if (this.f7161l != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollOffset", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f7161l, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollOffset();
    }

    public int computeVerticalScrollRange() {
        if (this.f7161l != null) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeVerticalScrollRange", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(this.f7161l, new Object[0])).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return super.computeVerticalScrollRange();
    }

    /* renamed from: d */
    public final void mo22543d() {
        this.f7161l.addOnScrollListener(new C3878a());
    }

    /* renamed from: e */
    public final void mo22544e() {
        this.f7162m = new FrameLayout(this.f7160e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f7162m.setLayoutParams(layoutParams);
        super.addView(this.f7162m, 1, layoutParams);
    }

    /* renamed from: f */
    public final float mo22545f(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, int i, int i2) {
        int i3;
        int positionForGroupHeader = groupedRecyclerViewAdapter.getPositionForGroupHeader(i2);
        if (positionForGroupHeader != -1 && this.f7161l.getChildCount() > (i3 = positionForGroupHeader - i)) {
            float y = this.f7161l.getChildAt(i3).getY() - ((float) this.f7162m.getHeight());
            if (y < 0.0f) {
                return y;
            }
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final int mo22546g(int[] iArr) {
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    /* renamed from: h */
    public final BaseViewHolder mo22547h(int i) {
        return this.f7163n.get(i);
    }

    /* renamed from: i */
    public final void mo22548i() {
        if (this.f7162m.getChildCount() > 0) {
            View childAt = this.f7162m.getChildAt(0);
            this.f7163n.put(((Integer) childAt.getTag(-101)).intValue(), (BaseViewHolder) childAt.getTag(-102));
            this.f7162m.removeAllViews();
        }
    }

    /* renamed from: j */
    public final BaseViewHolder mo22549j(int i) {
        if (this.f7162m.getChildCount() <= 0) {
            return null;
        }
        View childAt = this.f7162m.getChildAt(0);
        if (((Integer) childAt.getTag(-101)).intValue() == i) {
            return (BaseViewHolder) childAt.getTag(-102);
        }
        mo22548i();
        return null;
    }

    /* renamed from: k */
    public final void mo22550k(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        if (!this.f7166q) {
            this.f7166q = true;
            groupedRecyclerViewAdapter.registerAdapterDataObserver(new C3879b());
        }
    }

    /* renamed from: l */
    public final void mo22551l(boolean z) {
        RecyclerView.Adapter adapter = this.f7161l.getAdapter();
        if (adapter instanceof GroupedRecyclerViewAdapter) {
            GroupedRecyclerViewAdapter groupedRecyclerViewAdapter = (GroupedRecyclerViewAdapter) adapter;
            mo22550k(groupedRecyclerViewAdapter);
            int firstVisibleItem = getFirstVisibleItem();
            int groupPositionForPosition = groupedRecyclerViewAdapter.getGroupPositionForPosition(firstVisibleItem);
            if (z || this.f7164o != groupPositionForPosition) {
                this.f7164o = groupPositionForPosition;
                int positionForGroupHeader = groupedRecyclerViewAdapter.getPositionForGroupHeader(groupPositionForPosition);
                if (positionForGroupHeader != -1) {
                    int itemViewType = groupedRecyclerViewAdapter.getItemViewType(positionForGroupHeader);
                    BaseViewHolder j = mo22549j(itemViewType);
                    boolean z2 = j != null;
                    if (j == null) {
                        j = mo22547h(itemViewType);
                    }
                    if (j == null) {
                        j = (BaseViewHolder) groupedRecyclerViewAdapter.onCreateViewHolder(this.f7162m, itemViewType);
                        j.itemView.setTag(-101, Integer.valueOf(itemViewType));
                        j.itemView.setTag(-102, j);
                    }
                    groupedRecyclerViewAdapter.onBindViewHolder(j, positionForGroupHeader);
                    if (!z2) {
                        this.f7162m.addView(j.itemView);
                    }
                } else {
                    mo22548i();
                }
            }
            if (this.f7162m.getChildCount() > 0 && this.f7162m.getHeight() == 0) {
                this.f7162m.requestLayout();
            }
            this.f7162m.setTranslationY(mo22545f(groupedRecyclerViewAdapter, firstVisibleItem, groupPositionForPosition + 1));
        }
    }

    /* renamed from: m */
    public final void mo22552m() {
        postDelayed(new C3880c(), 64);
    }

    public void scrollBy(int i, int i2) {
        RecyclerView recyclerView = this.f7161l;
        if (recyclerView != null) {
            recyclerView.scrollBy(i, i2);
        } else {
            super.scrollBy(i, i2);
        }
    }

    public void scrollTo(int i, int i2) {
        RecyclerView recyclerView = this.f7161l;
        if (recyclerView != null) {
            recyclerView.scrollTo(i, i2);
        } else {
            super.scrollTo(i, i2);
        }
    }

    public void setSticky(boolean z) {
        if (this.f7165p != z) {
            this.f7165p = z;
            FrameLayout frameLayout = this.f7162m;
            if (frameLayout == null) {
                return;
            }
            if (z) {
                frameLayout.setVisibility(0);
                mo22551l(false);
                return;
            }
            mo22548i();
            this.f7162m.setVisibility(8);
        }
    }

    public StickyHeaderLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7160e = context;
    }

    public StickyHeaderLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.f7160e = context;
    }
}
