package p553f.p554a.p576f.p587i;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;

/* renamed from: f.a.f.i.e */
/* compiled from: InputAwareWebView */
public final class C9160e extends WebView {

    /* renamed from: e */
    public View f17943e;

    /* renamed from: l */
    public C9164g f17944l;

    /* renamed from: m */
    public View f17945m;

    /* renamed from: f.a.f.i.e$a */
    /* compiled from: InputAwareWebView */
    public class C9161a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ View f17946e;

        public C9161a(View view) {
            this.f17946e = view;
        }

        public void run() {
            this.f17946e.onWindowFocusChanged(true);
            ((InputMethodManager) C9160e.this.getContext().getSystemService("input_method")).isActive(C9160e.this.f17945m);
        }
    }

    public C9160e(Context context, View view) {
        super(context);
        this.f17945m = view;
    }

    /* renamed from: b */
    public void mo46934b() {
        mo46939e();
    }

    /* renamed from: c */
    public final boolean mo46935c() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f17943e;
        this.f17943e = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.f17945m;
        if (view3 == null) {
            return super.checkInputConnectionProxy(view);
        }
        C9164g gVar = new C9164g(view3, view, view.getHandler());
        this.f17944l = gVar;
        mo46941g(gVar);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        mo46939e();
    }

    /* renamed from: d */
    public void mo46938d() {
        C9164g gVar = this.f17944l;
        if (gVar != null) {
            gVar.mo46947a(true);
        }
    }

    /* renamed from: e */
    public final void mo46939e() {
        View view;
        if (this.f17944l != null && (view = this.f17945m) != null) {
            mo46941g(view);
        }
    }

    /* renamed from: f */
    public void mo46940f(View view) {
        this.f17945m = view;
        if (this.f17944l != null && view != null) {
            mo46941g(this.f17944l);
        }
    }

    /* renamed from: g */
    public final void mo46941g(View view) {
        if (this.f17945m != null) {
            view.requestFocus();
            this.f17945m.post(new C9161a(view));
        }
    }

    /* renamed from: h */
    public void mo46942h() {
        C9164g gVar = this.f17944l;
        if (gVar != null) {
            gVar.mo46947a(false);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !mo46935c() || z) {
            super.onFocusChanged(z, i, rect);
        }
    }
}
