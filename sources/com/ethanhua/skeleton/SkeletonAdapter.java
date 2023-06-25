package com.ethanhua.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.recyclerview.widget.RecyclerView;
import p630io.supercharge.shimmerlayout.ShimmerLayout;

public class SkeletonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public int f7172a;

    /* renamed from: b */
    public int f7173b;

    /* renamed from: c */
    public int f7174c;

    /* renamed from: d */
    public boolean f7175d;

    /* renamed from: e */
    public int f7176e;

    /* renamed from: f */
    public int f7177f;

    /* renamed from: com.ethanhua.skeleton.SkeletonAdapter$a */
    public class C3881a extends RecyclerView.ViewHolder {
        public C3881a(SkeletonAdapter skeletonAdapter, View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public void mo22565a(int i) {
        this.f7172a = i;
    }

    /* renamed from: b */
    public void mo22566b(int i) {
        this.f7173b = i;
    }

    /* renamed from: c */
    public void mo22567c(@IntRange(from = 0, mo840to = 30) int i) {
        this.f7177f = i;
    }

    /* renamed from: d */
    public void mo22568d(int i) {
        this.f7174c = i;
    }

    /* renamed from: e */
    public void mo22569e(int i) {
        this.f7176e = i;
    }

    /* renamed from: f */
    public void mo22570f(boolean z) {
        this.f7175d = z;
    }

    public int getItemCount() {
        return this.f7172a;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (this.f7175d) {
            ShimmerLayout shimmerLayout = (ShimmerLayout) viewHolder.itemView;
            shimmerLayout.setShimmerAnimationDuration(this.f7176e);
            shimmerLayout.setShimmerAngle(this.f7177f);
            shimmerLayout.setShimmerColor(this.f7174c);
            shimmerLayout.mo47860n();
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f7175d) {
            return new ShimmerViewHolder(from, viewGroup, this.f7173b);
        }
        return new C3881a(this, from.inflate(this.f7173b, viewGroup, false));
    }
}
