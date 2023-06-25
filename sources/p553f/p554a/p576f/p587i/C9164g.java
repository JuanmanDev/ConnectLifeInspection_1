package p553f.p554a.p576f.p587i;

import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: f.a.f.i.g */
/* compiled from: ThreadedInputConnectionProxyAdapterView */
public final class C9164g extends View {

    /* renamed from: e */
    public final Handler f17953e;

    /* renamed from: l */
    public final IBinder f17954l;

    /* renamed from: m */
    public final View f17955m;

    /* renamed from: n */
    public final View f17956n;

    /* renamed from: o */
    public boolean f17957o = false;

    /* renamed from: p */
    public InputConnection f17958p;

    public C9164g(View view, View view2, Handler handler) {
        super(view.getContext());
        this.f17953e = handler;
        this.f17956n = view2;
        this.f17954l = view.getWindowToken();
        this.f17955m = view.getRootView();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setVisibility(0);
    }

    /* renamed from: a */
    public void mo46947a(boolean z) {
        this.f17957o = z;
    }

    public boolean checkInputConnectionProxy(View view) {
        return true;
    }

    public Handler getHandler() {
        return this.f17953e;
    }

    public View getRootView() {
        return this.f17955m;
    }

    public IBinder getWindowToken() {
        return this.f17954l;
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
        InputConnection onCreateInputConnection = this.f17957o ? this.f17958p : this.f17956n.onCreateInputConnection(editorInfo);
        this.f17958p = onCreateInputConnection;
        return onCreateInputConnection;
    }
}
