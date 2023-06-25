package p001a.p007c.p016g;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: a.c.g.e */
/* compiled from: lambda */
public final /* synthetic */ class C0063e implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ View f97e;

    public /* synthetic */ C0063e(View view) {
        this.f97e = view;
    }

    public final void run() {
        ((InputMethodManager) this.f97e.getContext().getSystemService("input_method")).showSoftInput(this.f97e, 0);
    }
}
