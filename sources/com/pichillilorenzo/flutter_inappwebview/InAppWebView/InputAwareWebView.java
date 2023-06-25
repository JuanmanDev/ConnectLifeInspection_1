package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ListPopupWindow;
import p040c.p313b0.p314a.p319i.C4204h;

public class InputAwareWebView extends WebView {

    /* renamed from: e */
    public View f16857e;

    /* renamed from: l */
    public View f16858l;

    /* renamed from: m */
    public C4204h f16859m;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.InAppWebView.InputAwareWebView$a */
    public class C8794a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ View f16860e;

        public C8794a(View view) {
            this.f16860e = view;
        }

        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) InputAwareWebView.this.getContext().getSystemService("input_method");
            this.f16860e.onWindowFocusChanged(true);
            if (Build.VERSION.SDK_INT < 29) {
                inputMethodManager.isActive(InputAwareWebView.this.f16857e);
            }
        }
    }

    public InputAwareWebView(Context context, View view) {
        super(context);
        this.f16857e = view;
    }

    private void setInputConnectionTarget(View view) {
        if (this.f16857e != null) {
            view.requestFocus();
            this.f16857e.post(new C8794a(view));
        }
    }

    /* renamed from: a */
    public void mo45774a() {
        mo45840d();
    }

    /* renamed from: b */
    public final boolean mo45836b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 0; i < stackTrace.length; i++) {
            if (stackTrace[i].getClassName().equals(ListPopupWindow.class.getCanonicalName()) && stackTrace[i].getMethodName().equals("show")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo45837c() {
        C4204h hVar = this.f16859m;
        if (hVar != null) {
            hVar.mo25613a(true);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        View view2 = this.f16858l;
        this.f16858l = view;
        if (view2 == view) {
            return super.checkInputConnectionProxy(view);
        }
        View view3 = this.f16857e;
        if (view3 == null) {
            return super.checkInputConnectionProxy(view);
        }
        C4204h hVar = new C4204h(view3, view, view.getHandler());
        this.f16859m = hVar;
        setInputConnectionTarget(hVar);
        return super.checkInputConnectionProxy(view);
    }

    public void clearFocus() {
        super.clearFocus();
        mo45840d();
    }

    /* renamed from: d */
    public final void mo45840d() {
        View view;
        if (this.f16859m != null && (view = this.f16857e) != null) {
            setInputConnectionTarget(view);
        }
    }

    /* renamed from: e */
    public void mo45841e() {
        C4204h hVar = this.f16859m;
        if (hVar != null) {
            hVar.mo25613a(false);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (Build.VERSION.SDK_INT >= 28 || !mo45836b() || z) {
            super.onFocusChanged(z, i, rect);
        }
    }

    public void setContainerView(View view) {
        this.f16857e = view;
        if (this.f16859m != null && view != null) {
            setInputConnectionTarget(this.f16859m);
        }
    }

    public InputAwareWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16857e = null;
    }

    public InputAwareWebView(Context context) {
        super(context);
        this.f16857e = null;
    }

    public InputAwareWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16857e = null;
    }
}
