package p040c.p313b0.p314a.p319i;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: c.b0.a.i.h */
/* compiled from: ThreadedInputConnectionProxyAdapterView */
public final class C4204h extends View {

    /* renamed from: e */
    public final Handler f8955e;

    /* renamed from: l */
    public final IBinder f8956l;

    /* renamed from: m */
    public final View f8957m;

    /* renamed from: n */
    public final View f8958n;

    /* renamed from: o */
    public boolean f8959o = false;

    /* renamed from: p */
    public InputConnection f8960p;

    public C4204h(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f8955e = handler;
        this.f8958n = view2;
        this.f8956l = view.getWindowToken();
        this.f8957m = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    /* renamed from: a */
    public void mo25613a(boolean z) {
        this.f8959o = z;
    }

    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public Handler getHandler() {
        return this.f8955e;
    }

    public View getRootView() {
        return this.f8957m;
    }

    public IBinder getWindowToken() {
        return this.f8956l;
    }

    public boolean hasWindowFocus() {
        return true;
    }

    public boolean isFocused() {
        return true;
    }

    public boolean onCheckIsTextEditor() {
        return true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = this.f8959o ? this.f8960p : this.f8958n.onCreateInputConnection(editorInfo);
        this.f8960p = onCreateInputConnection;
        return onCreateInputConnection;
    }
}
