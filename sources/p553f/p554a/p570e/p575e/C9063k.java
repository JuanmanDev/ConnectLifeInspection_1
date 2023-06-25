package p553f.p554a.p570e.p575e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import p553f.p554a.p589h.C9177f;
import p630io.flutter.plugin.platform.SingleViewPresentation;

@TargetApi(20)
/* renamed from: f.a.e.e.k */
/* compiled from: VirtualDisplayController */
public class C9063k {

    /* renamed from: a */
    public final Context f17791a;

    /* renamed from: b */
    public final C9051c f17792b;

    /* renamed from: c */
    public final int f17793c;

    /* renamed from: d */
    public final C9177f.C9178a f17794d;

    /* renamed from: e */
    public final View.OnFocusChangeListener f17795e;

    /* renamed from: f */
    public VirtualDisplay f17796f;
    @VisibleForTesting

    /* renamed from: g */
    public SingleViewPresentation f17797g;

    /* renamed from: h */
    public Surface f17798h;

    /* renamed from: f.a.e.e.k$a */
    /* compiled from: VirtualDisplayController */
    public class C9064a implements View.OnAttachStateChangeListener {

        /* renamed from: e */
        public final /* synthetic */ View f17799e;

        /* renamed from: l */
        public final /* synthetic */ Runnable f17800l;

        /* renamed from: f.a.e.e.k$a$a */
        /* compiled from: VirtualDisplayController */
        public class C9065a implements Runnable {
            public C9065a() {
            }

            public void run() {
                C9064a aVar = C9064a.this;
                aVar.f17799e.postDelayed(aVar.f17800l, 128);
            }
        }

        public C9064a(C9063k kVar, View view, Runnable runnable) {
            this.f17799e = view;
            this.f17800l = runnable;
        }

        public void onViewAttachedToWindow(View view) {
            C9066b.m24633a(this.f17799e, new C9065a());
            this.f17799e.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    @TargetApi(16)
    /* renamed from: f.a.e.e.k$b */
    /* compiled from: VirtualDisplayController */
    public static class C9066b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        public final View f17802a;

        /* renamed from: b */
        public Runnable f17803b;

        /* renamed from: f.a.e.e.k$b$a */
        /* compiled from: VirtualDisplayController */
        public class C9067a implements Runnable {
            public C9067a() {
            }

            public void run() {
                C9066b.this.f17802a.getViewTreeObserver().removeOnDrawListener(C9066b.this);
            }
        }

        public C9066b(View view, Runnable runnable) {
            this.f17802a = view;
            this.f17803b = runnable;
        }

        /* renamed from: a */
        public static void m24633a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new C9066b(view, runnable));
        }

        public void onDraw() {
            Runnable runnable = this.f17803b;
            if (runnable != null) {
                runnable.run();
                this.f17803b = null;
                this.f17802a.post(new C9067a());
            }
        }
    }

    public C9063k(Context context, C9051c cVar, VirtualDisplay virtualDisplay, C9056f fVar, Surface surface, C9177f.C9178a aVar, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        Context context2 = context;
        this.f17791a = context2;
        C9051c cVar2 = cVar;
        this.f17792b = cVar2;
        this.f17794d = aVar;
        View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
        this.f17795e = onFocusChangeListener2;
        this.f17798h = surface;
        this.f17796f = virtualDisplay;
        this.f17793c = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context2, this.f17796f.getDisplay(), fVar, cVar2, i, obj, onFocusChangeListener2);
        this.f17797g = singleViewPresentation;
        singleViewPresentation.show();
    }

    /* renamed from: a */
    public static C9063k m24624a(Context context, C9051c cVar, C9056f fVar, C9177f.C9178a aVar, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        int i4 = i;
        int i5 = i2;
        aVar.mo46495a().setDefaultBufferSize(i4, i5);
        Surface surface = new Surface(aVar.mo46495a());
        Context context2 = context;
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i4, i5, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new C9063k(context, cVar, createVirtualDisplay, fVar, surface, aVar, onFocusChangeListener, i3, obj);
    }

    /* renamed from: b */
    public void mo46720b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation != null) {
            singleViewPresentation.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: c */
    public void mo46721c() {
        C9055e view = this.f17797g.getView();
        this.f17797g.cancel();
        this.f17797g.detachState();
        view.dispose();
        this.f17796f.release();
        this.f17794d.release();
    }

    /* renamed from: d */
    public View mo46722d() {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    /* renamed from: e */
    public void mo46723e(@NonNull View view) {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f17797g.getView().onFlutterViewAttached(view);
        }
    }

    /* renamed from: f */
    public void mo46724f() {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f17797g.getView().onFlutterViewDetached();
        }
    }

    /* renamed from: g */
    public void mo46725g() {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f17797g.getView().onInputConnectionLocked();
        }
    }

    /* renamed from: h */
    public void mo46726h() {
        SingleViewPresentation singleViewPresentation = this.f17797g;
        if (singleViewPresentation != null && singleViewPresentation.getView() != null) {
            this.f17797g.getView().onInputConnectionUnlocked();
        }
    }

    /* renamed from: i */
    public void mo46727i(int i, int i2, Runnable runnable) {
        boolean isFocused = mo46722d().isFocused();
        SingleViewPresentation.C9434e detachState = this.f17797g.detachState();
        this.f17796f.setSurface((Surface) null);
        this.f17796f.release();
        this.f17794d.mo46495a().setDefaultBufferSize(i, i2);
        this.f17796f = ((DisplayManager) this.f17791a.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f17793c, this.f17798h, 0);
        View d = mo46722d();
        d.addOnAttachStateChangeListener(new C9064a(this, d, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f17791a, this.f17796f.getDisplay(), this.f17792b, detachState, this.f17795e, isFocused);
        singleViewPresentation.show();
        this.f17797g.cancel();
        this.f17797g = singleViewPresentation;
    }
}
