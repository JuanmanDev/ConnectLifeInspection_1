package p553f.p554a.p570e.p575e;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p553f.p554a.p556d.p557a.C8906b;
import p553f.p554a.p556d.p557a.C8912f;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p569i.C8984h;
import p553f.p554a.p570e.p572b.C9038c;
import p553f.p554a.p589h.C9177f;
import p630io.flutter.embedding.android.FlutterImageView;
import p630io.flutter.embedding.android.FlutterView;
import p630io.flutter.embedding.engine.FlutterOverlaySurface;
import p630io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import p630io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import p630io.flutter.view.AccessibilityBridge;

/* renamed from: f.a.e.e.j */
/* compiled from: PlatformViewsController */
public class C9060j implements C9059i {

    /* renamed from: a */
    public final C9058h f17768a = new C9058h();

    /* renamed from: b */
    public C8906b f17769b;

    /* renamed from: c */
    public Context f17770c;

    /* renamed from: d */
    public View f17771d;

    /* renamed from: e */
    public C9177f f17772e;

    /* renamed from: f */
    public C9038c f17773f;

    /* renamed from: g */
    public C8984h f17774g;

    /* renamed from: h */
    public final C9051c f17775h = new C9051c();
    @VisibleForTesting

    /* renamed from: i */
    public final HashMap<Integer, C9063k> f17776i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<Context, View> f17777j = new HashMap<>();

    /* renamed from: k */
    public final SparseArray<View> f17778k = new SparseArray<>();

    /* renamed from: l */
    public final SparseArray<FlutterMutatorView> f17779l = new SparseArray<>();

    /* renamed from: m */
    public final SparseArray<FlutterImageView> f17780m = new SparseArray<>();

    /* renamed from: n */
    public int f17781n = 0;

    /* renamed from: o */
    public boolean f17782o = false;

    /* renamed from: p */
    public HashSet<Integer> f17783p = new HashSet<>();

    /* renamed from: q */
    public HashSet<Integer> f17784q = new HashSet<>();

    /* renamed from: r */
    public final C8912f f17785r = C8912f.m24120a();

    /* renamed from: s */
    public final C8984h.C8990e f17786s = new C9061a();

    /* renamed from: f.a.e.e.j$a */
    /* compiled from: PlatformViewsController */
    public class C9061a implements C8984h.C8990e {

        /* renamed from: f.a.e.e.j$a$a */
        /* compiled from: PlatformViewsController */
        public class C9062a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ C9063k f17788e;

            /* renamed from: l */
            public final /* synthetic */ Runnable f17789l;

            public C9062a(C9063k kVar, Runnable runnable) {
                this.f17788e = kVar;
                this.f17789l = runnable;
            }

            public void run() {
                C9060j.this.mo46707Y(this.f17788e);
                this.f17789l.run();
            }
        }

        public C9061a() {
        }

        /* renamed from: a */
        public void mo46539a(int i) {
            View view = (View) C9060j.this.f17778k.get(i);
            FlutterMutatorView flutterMutatorView = (FlutterMutatorView) C9060j.this.f17779l.get(i);
            if (view != null) {
                if (flutterMutatorView != null) {
                    flutterMutatorView.removeView(view);
                }
                C9060j.this.f17778k.remove(i);
            }
            if (flutterMutatorView != null) {
                ((FlutterView) C9060j.this.f17771d).removeView(flutterMutatorView);
                C9060j.this.f17779l.remove(i);
            }
        }

        @TargetApi(17)
        /* renamed from: b */
        public void mo46540b(int i, int i2) {
            if (C9060j.m24565Z(i2)) {
                mo46717i(20);
                View d = C9060j.this.f17776i.get(Integer.valueOf(i)).mo46722d();
                if (d != null) {
                    d.setLayoutDirection(i2);
                    return;
                }
                throw new IllegalStateException("Sending touch to an unknown view with id: " + i2);
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
        }

        @TargetApi(17)
        /* renamed from: c */
        public long mo46541c(@NonNull C8984h.C8987b bVar) {
            mo46717i(20);
            if (!C9060j.m24565Z(bVar.f17636e)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + bVar.f17636e + "(view id: " + bVar.f17632a + ")");
            } else if (!C9060j.this.f17776i.containsKey(Integer.valueOf(bVar.f17632a))) {
                C9056f b = C9060j.this.f17768a.mo46683b(bVar.f17633b);
                if (b != null) {
                    Object obj = null;
                    if (bVar.f17637f != null) {
                        obj = b.getCreateArgsCodec().mo46563b(bVar.f17637f);
                    }
                    Object obj2 = obj;
                    int o = C9060j.this.mo46706X(bVar.f17634c);
                    int o2 = C9060j.this.mo46706X(bVar.f17635d);
                    C9060j.this.mo46708a0(o, o2);
                    C9177f.C9178a e = C9060j.this.f17772e.mo46480e();
                    C9063k a = C9063k.m24624a(C9060j.this.f17770c, C9060j.this.f17775h, b, e, o, o2, bVar.f17632a, obj2, new C9049a(this, bVar));
                    if (a != null) {
                        if (C9060j.this.f17771d != null) {
                            a.mo46723e(C9060j.this.f17771d);
                        }
                        C9060j.this.f17776i.put(Integer.valueOf(bVar.f17632a), a);
                        View d = a.mo46722d();
                        d.setLayoutDirection(bVar.f17636e);
                        C9060j.this.f17777j.put(d.getContext(), d);
                        return e.mo46496id();
                    }
                    throw new IllegalStateException("Failed creating virtual display for a " + bVar.f17633b + " with id: " + bVar.f17632a);
                }
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + bVar.f17633b);
            } else {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + bVar.f17632a);
            }
        }

        /* renamed from: d */
        public void mo46542d(int i) {
            mo46717i(20);
            C9063k kVar = C9060j.this.f17776i.get(Integer.valueOf(i));
            if (kVar != null) {
                if (C9060j.this.f17773f != null) {
                    C9060j.this.f17773f.mo46622k(i);
                }
                C9060j.this.f17777j.remove(kVar.mo46722d().getContext());
                kVar.mo46721c();
                C9060j.this.f17776i.remove(Integer.valueOf(i));
                return;
            }
            throw new IllegalStateException("Trying to dispose a platform view with unknown id: " + i);
        }

        /* renamed from: e */
        public void mo46543e(@NonNull C8984h.C8987b bVar) {
            mo46717i(19);
            if (C9060j.m24565Z(bVar.f17636e)) {
                C9056f b = C9060j.this.f17768a.mo46683b(bVar.f17633b);
                if (b != null) {
                    Object obj = null;
                    if (bVar.f17637f != null) {
                        obj = b.getCreateArgsCodec().mo46563b(bVar.f17637f);
                    }
                    View view = b.create(C9060j.this.f17770c, bVar.f17632a, obj).getView();
                    if (view == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    } else if (view.getParent() == null) {
                        C9060j.this.f17778k.put(bVar.f17632a, view);
                    } else {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                } else {
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + bVar.f17633b);
                }
            } else {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + bVar.f17636e + "(view id: " + bVar.f17632a + ")");
            }
        }

        /* renamed from: f */
        public void mo46544f(@NonNull C8984h.C8988c cVar, @NonNull Runnable runnable) {
            mo46717i(20);
            C9063k kVar = C9060j.this.f17776i.get(Integer.valueOf(cVar.f17638a));
            if (kVar != null) {
                int o = C9060j.this.mo46706X(cVar.f17639b);
                int o2 = C9060j.this.mo46706X(cVar.f17640c);
                C9060j.this.mo46708a0(o, o2);
                C9060j.this.mo46697K(kVar);
                kVar.mo46727i(o, o2, new C9062a(kVar, runnable));
                return;
            }
            throw new IllegalStateException("Trying to resize a platform view with unknown id: " + cVar.f17638a);
        }

        /* renamed from: g */
        public void mo46545g(int i) {
            mo46717i(20);
            C9060j.this.f17776i.get(Integer.valueOf(i)).mo46722d().clearFocus();
        }

        /* renamed from: h */
        public void mo46546h(@NonNull C8984h.C8989d dVar) {
            int i = dVar.f17641a;
            float f = C9060j.this.f17770c.getResources().getDisplayMetrics().density;
            mo46717i(20);
            if (C9060j.this.f17776i.containsKey(Integer.valueOf(i))) {
                C9060j.this.f17776i.get(Integer.valueOf(dVar.f17641a)).mo46720b(C9060j.this.mo46705W(f, dVar, true));
            } else if (C9060j.this.f17778k.get(i) != null) {
                ((View) C9060j.this.f17778k.get(dVar.f17641a)).dispatchTouchEvent(C9060j.this.mo46705W(f, dVar, false));
            } else {
                throw new IllegalStateException("Sending touch to an unknown view with id: " + i);
            }
        }

        /* renamed from: i */
        public final void mo46717i(int i) {
            if (Build.VERSION.SDK_INT < i) {
                throw new IllegalStateException("Trying to use platform views with API " + Build.VERSION.SDK_INT + ", required API level is: " + i);
            }
        }

        /* renamed from: j */
        public /* synthetic */ void mo46718j(C8984h.C8987b bVar, View view, boolean z) {
            if (z) {
                C9060j.this.f17774g.mo46530d(bVar.f17632a);
            }
        }
    }

    /* renamed from: S */
    public static MotionEvent.PointerCoords m24561S(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f;
        return pointerCoords;
    }

    /* renamed from: T */
    public static List<MotionEvent.PointerCoords> m24562T(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        for (Object S : (List) obj) {
            arrayList.add(m24561S(S, f));
        }
        return arrayList;
    }

    /* renamed from: U */
    public static MotionEvent.PointerProperties m24563U(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: V */
    public static List<MotionEvent.PointerProperties> m24564V(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object U : (List) obj) {
            arrayList.add(m24563U(U));
        }
        return arrayList;
    }

    /* renamed from: Z */
    public static boolean m24565Z(int i) {
        return i == 0 || i == 1;
    }

    @UiThread
    /* renamed from: A */
    public void mo46687A() {
        this.f17774g.mo46531e((C8984h.C8990e) null);
        this.f17774g = null;
        this.f17770c = null;
        this.f17772e = null;
    }

    /* renamed from: B */
    public void mo46688B() {
        this.f17771d = null;
        for (C9063k f : this.f17776i.values()) {
            f.mo46724f();
        }
    }

    /* renamed from: C */
    public void mo46689C() {
        this.f17773f = null;
    }

    /* renamed from: D */
    public final void mo46690D(boolean z) {
        for (int i = 0; i < this.f17780m.size(); i++) {
            int keyAt = this.f17780m.keyAt(i);
            FlutterImageView valueAt = this.f17780m.valueAt(i);
            if (this.f17783p.contains(Integer.valueOf(keyAt))) {
                ((FlutterView) this.f17771d).mo47432i(valueAt);
                z &= valueAt.mo47386c();
            } else {
                if (!this.f17782o) {
                    valueAt.mo46500b();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i2 = 0; i2 < this.f17779l.size(); i2++) {
            int keyAt2 = this.f17779l.keyAt(i2);
            View view = this.f17779l.get(keyAt2);
            if (!z || !this.f17784q.contains(Integer.valueOf(keyAt2))) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: E */
    public final void mo46691E() {
        for (C9063k c : this.f17776i.values()) {
            c.mo46721c();
        }
        this.f17776i.clear();
    }

    /* renamed from: F */
    public final float mo46692F() {
        return this.f17770c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: G */
    public C9057g mo46693G() {
        return this.f17768a;
    }

    @VisibleForTesting
    /* renamed from: H */
    public void mo46694H(int i) {
        View view = this.f17778k.get(i);
        if (view == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f17779l.get(i) == null) {
            Context context = this.f17770c;
            FlutterMutatorView flutterMutatorView = new FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.f17769b);
            this.f17779l.put(i, flutterMutatorView);
            flutterMutatorView.addView(view);
            ((FlutterView) this.f17771d).addView(flutterMutatorView);
        }
    }

    /* renamed from: I */
    public final void mo46695I() {
        if (!this.f17782o) {
            ((FlutterView) this.f17771d).mo47435l();
            this.f17782o = true;
        }
    }

    /* renamed from: J */
    public /* synthetic */ void mo46696J() {
        mo46690D(false);
    }

    /* renamed from: K */
    public final void mo46697K(@NonNull C9063k kVar) {
        C9038c cVar = this.f17773f;
        if (cVar != null) {
            cVar.mo46630t();
            kVar.mo46725g();
        }
    }

    /* renamed from: L */
    public void mo46698L() {
    }

    /* renamed from: M */
    public void mo46699M() {
        this.f17783p.clear();
        this.f17784q.clear();
    }

    /* renamed from: N */
    public void mo46700N() {
        mo46691E();
    }

    /* renamed from: O */
    public void mo46701O(int i, int i2, int i3, int i4, int i5) {
        mo46695I();
        FlutterImageView flutterImageView = this.f17780m.get(i);
        if (flutterImageView.getParent() == null) {
            ((FlutterView) this.f17771d).addView(flutterImageView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        flutterImageView.setLayoutParams(layoutParams);
        flutterImageView.setVisibility(0);
        flutterImageView.bringToFront();
        this.f17783p.add(Integer.valueOf(i));
    }

    /* renamed from: P */
    public void mo46702P(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        mo46695I();
        mo46694H(i);
        FlutterMutatorView flutterMutatorView = this.f17779l.get(i);
        flutterMutatorView.mo47512a(flutterMutatorsStack, i2, i3, i4, i5);
        flutterMutatorView.setVisibility(0);
        flutterMutatorView.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        View view = this.f17778k.get(i);
        view.setLayoutParams(layoutParams);
        view.bringToFront();
        this.f17784q.add(Integer.valueOf(i));
    }

    /* renamed from: Q */
    public void mo46703Q() {
        FlutterView flutterView = (FlutterView) this.f17771d;
        boolean z = false;
        if (!this.f17782o || !this.f17784q.isEmpty()) {
            if (this.f17782o && flutterView.mo47426f()) {
                z = true;
            }
            mo46690D(z);
            return;
        }
        this.f17782o = false;
        flutterView.mo47455v(new C9050b(this));
    }

    /* renamed from: R */
    public void mo46704R() {
        mo46691E();
    }

    @VisibleForTesting
    /* renamed from: W */
    public MotionEvent mo46705W(float f, C8984h.C8989d dVar, boolean z) {
        C8984h.C8989d dVar2 = dVar;
        MotionEvent b = this.f17785r.mo46364b(C8912f.C8913a.m24125c(dVar2.f17656p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) m24564V(dVar2.f17646f).toArray(new MotionEvent.PointerProperties[dVar2.f17645e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) m24562T(dVar2.f17647g, f).toArray(new MotionEvent.PointerCoords[dVar2.f17645e]);
        if (!z && b != null) {
            return MotionEvent.obtain(b.getDownTime(), b.getEventTime(), b.getAction(), dVar2.f17645e, pointerPropertiesArr, pointerCoordsArr, b.getMetaState(), b.getButtonState(), b.getXPrecision(), b.getYPrecision(), b.getDeviceId(), b.getEdgeFlags(), b.getSource(), b.getFlags());
        }
        return MotionEvent.obtain(dVar2.f17642b.longValue(), dVar2.f17643c.longValue(), dVar2.f17644d, dVar2.f17645e, pointerPropertiesArr, pointerCoordsArr, dVar2.f17648h, dVar2.f17649i, dVar2.f17650j, dVar2.f17651k, dVar2.f17652l, dVar2.f17653m, dVar2.f17654n, dVar2.f17655o);
    }

    /* renamed from: X */
    public final int mo46706X(double d) {
        return (int) Math.round(d * ((double) mo46692F()));
    }

    /* renamed from: Y */
    public final void mo46707Y(@NonNull C9063k kVar) {
        C9038c cVar = this.f17773f;
        if (cVar != null) {
            cVar.mo46618F();
            kVar.mo46726h();
        }
    }

    /* renamed from: a */
    public void mo46684a(AccessibilityBridge accessibilityBridge) {
        this.f17775h.mo46657b(accessibilityBridge);
    }

    /* renamed from: a0 */
    public final void mo46708a0(int i, int i2) {
        DisplayMetrics displayMetrics = this.f17770c.getResources().getDisplayMetrics();
        if (i2 > displayMetrics.heightPixels || i > displayMetrics.widthPixels) {
            "Creating a virtual display of size: [" + i + ", " + i2 + "] may result in problems(https://github.com/flutter/flutter/issues/2897).It is larger than the device screen size: [" + displayMetrics.widthPixels + ", " + displayMetrics.heightPixels + "].";
        }
    }

    /* renamed from: b */
    public void mo46685b() {
        this.f17775h.mo46657b((AccessibilityBridge) null);
    }

    /* renamed from: c */
    public View mo46686c(Integer num) {
        if (this.f17778k.get(num.intValue()) != null) {
            return this.f17778k.get(num.intValue());
        }
        C9063k kVar = this.f17776i.get(num);
        if (kVar == null) {
            return null;
        }
        return kVar.mo46722d();
    }

    /* renamed from: s */
    public void mo46709s(Context context, C9177f fVar, @NonNull C8928a aVar) {
        if (this.f17770c == null) {
            this.f17770c = context;
            this.f17772e = fVar;
            C8984h hVar = new C8984h(aVar);
            this.f17774g = hVar;
            hVar.mo46531e(this.f17786s);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    /* renamed from: t */
    public void mo46710t(C9038c cVar) {
        this.f17773f = cVar;
    }

    /* renamed from: u */
    public void mo46711u(C8964a aVar) {
        this.f17769b = new C8906b(aVar, true);
    }

    /* renamed from: v */
    public void mo46712v(@NonNull View view) {
        this.f17771d = view;
        for (C9063k e : this.f17776i.values()) {
            e.mo46723e(view);
        }
    }

    /* renamed from: w */
    public boolean mo46713w(@Nullable View view) {
        if (view == null || !this.f17777j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = this.f17777j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @TargetApi(19)
    /* renamed from: x */
    public FlutterOverlaySurface mo46714x() {
        return mo46715y(new FlutterImageView(this.f17771d.getContext(), this.f17771d.getWidth(), this.f17771d.getHeight(), FlutterImageView.SurfaceKind.overlay));
    }

    @VisibleForTesting
    @TargetApi(19)
    /* renamed from: y */
    public FlutterOverlaySurface mo46715y(@NonNull FlutterImageView flutterImageView) {
        int i = this.f17781n;
        this.f17781n = i + 1;
        this.f17780m.put(i, flutterImageView);
        return new FlutterOverlaySurface(i, flutterImageView.getSurface());
    }

    /* renamed from: z */
    public void mo46716z() {
        for (int i = 0; i < this.f17780m.size(); i++) {
            this.f17780m.keyAt(i);
            FlutterImageView valueAt = this.f17780m.valueAt(i);
            valueAt.mo46500b();
            ((FlutterView) this.f17771d).removeView(valueAt);
        }
        this.f17780m.clear();
    }
}
