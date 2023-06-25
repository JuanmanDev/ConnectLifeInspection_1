package com.daimajia.swipe.adapters;

import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.CursorAdapter;
import p040c.p122h.p123a.p124a.C2001a;
import p040c.p122h.p123a.p125b.C2004a;

public abstract class CursorSwipeAdapter extends CursorAdapter implements C2004a {

    /* renamed from: e */
    public C2001a f7146e;

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = view == null;
        View view2 = super.getView(i, view, viewGroup);
        if (z) {
            this.f7146e.mo16564a(view2, i);
        } else {
            this.f7146e.mo16565b(view2, i);
        }
        return view2;
    }
}
