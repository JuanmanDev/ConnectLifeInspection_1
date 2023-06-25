package com.donkingliang.groupedadapter.holder;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public SparseArray<View> f7159a = new SparseArray<>();

    public BaseViewHolder(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo22537a(int i) {
        T t = (View) this.f7159a.get(i);
        if (t != null) {
            return t;
        }
        T findViewById = this.itemView.findViewById(i);
        this.f7159a.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public BaseViewHolder mo22538b(int i, String str) {
        ((TextView) mo22537a(i)).setText(str);
        return this;
    }
}
