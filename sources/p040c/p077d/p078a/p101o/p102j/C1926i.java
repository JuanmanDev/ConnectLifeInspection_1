package p040c.p077d.p078a.p101o.p102j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040c.p077d.p078a.p101o.C1909c;
import p040c.p077d.p078a.p105q.C1949i;

@Deprecated
/* renamed from: c.d.a.o.j.i */
/* compiled from: ViewTarget */
public abstract class C1926i<T extends View, Z> extends C1918a<Z> {
    @Nullable

    /* renamed from: g */
    public static Integer f1599g;

    /* renamed from: b */
    public final T f1600b;

    /* renamed from: c */
    public final C1927a f1601c;
    @Nullable

    /* renamed from: d */
    public View.OnAttachStateChangeListener f1602d;

    /* renamed from: e */
    public boolean f1603e;

    /* renamed from: f */
    public boolean f1604f;

    @VisibleForTesting
    /* renamed from: c.d.a.o.j.i$a */
    /* compiled from: ViewTarget */
    public static final class C1927a {
        @VisibleForTesting
        @Nullable

        /* renamed from: e */
        public static Integer f1605e;

        /* renamed from: a */
        public final View f1606a;

        /* renamed from: b */
        public final List<C1924g> f1607b = new ArrayList();

        /* renamed from: c */
        public boolean f1608c;
        @Nullable

        /* renamed from: d */
        public C1928a f1609d;

        /* renamed from: c.d.a.o.j.i$a$a */
        /* compiled from: ViewTarget */
        public static final class C1928a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: e */
            public final WeakReference<C1927a> f1610e;

            public C1928a(@NonNull C1927a aVar) {
                this.f1610e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    "OnGlobalLayoutListener called attachStateListener=" + this;
                }
                C1927a aVar = (C1927a) this.f1610e.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo16391a();
                return true;
            }
        }

        public C1927a(@NonNull View view) {
            this.f1606a = view;
        }

        /* renamed from: c */
        public static int m2510c(@NonNull Context context) {
            if (f1605e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C1949i.m2563d(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f1605e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f1605e.intValue();
        }

        /* renamed from: a */
        public void mo16391a() {
            if (!this.f1607b.isEmpty()) {
                int g = mo16396g();
                int f = mo16395f();
                if (mo16398i(g, f)) {
                    mo16399j(g, f);
                    mo16392b();
                }
            }
        }

        /* renamed from: b */
        public void mo16392b() {
            ViewTreeObserver viewTreeObserver = this.f1606a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f1609d);
            }
            this.f1609d = null;
            this.f1607b.clear();
        }

        /* renamed from: d */
        public void mo16393d(@NonNull C1924g gVar) {
            int g = mo16396g();
            int f = mo16395f();
            if (mo16398i(g, f)) {
                gVar.mo16351f(g, f);
                return;
            }
            if (!this.f1607b.contains(gVar)) {
                this.f1607b.add(gVar);
            }
            if (this.f1609d == null) {
                ViewTreeObserver viewTreeObserver = this.f1606a.getViewTreeObserver();
                C1928a aVar = new C1928a(this);
                this.f1609d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo16394e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f1608c && this.f1606a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f1606a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            boolean isLoggable = Log.isLoggable("ViewTarget", 4);
            return m2510c(this.f1606a.getContext());
        }

        /* renamed from: f */
        public final int mo16395f() {
            int paddingTop = this.f1606a.getPaddingTop() + this.f1606a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f1606a.getLayoutParams();
            return mo16394e(this.f1606a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int mo16396g() {
            int paddingLeft = this.f1606a.getPaddingLeft() + this.f1606a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f1606a.getLayoutParams();
            return mo16394e(this.f1606a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo16397h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo16398i(int i, int i2) {
            return mo16397h(i) && mo16397h(i2);
        }

        /* renamed from: j */
        public final void mo16399j(int i, int i2) {
            Iterator it = new ArrayList(this.f1607b).iterator();
            while (it.hasNext()) {
                ((C1924g) it.next()).mo16351f(i, i2);
            }
        }

        /* renamed from: k */
        public void mo16400k(@NonNull C1924g gVar) {
            this.f1607b.remove(gVar);
        }
    }

    public C1926i(@NonNull T t) {
        C1949i.m2563d(t);
        this.f1600b = (View) t;
        this.f1601c = new C1927a(t);
    }

    @CallSuper
    /* renamed from: a */
    public void mo16384a(@NonNull C1924g gVar) {
        this.f1601c.mo16400k(gVar);
    }

    /* renamed from: c */
    public void mo16372c(@Nullable C1909c cVar) {
        mo16389l(cVar);
    }

    @CallSuper
    /* renamed from: e */
    public void mo16374e(@Nullable Drawable drawable) {
        super.mo16374e(drawable);
        mo16387j();
    }

    @Nullable
    /* renamed from: f */
    public C1909c mo16375f() {
        Object i = mo16386i();
        if (i == null) {
            return null;
        }
        if (i instanceof C1909c) {
            return (C1909c) i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @CallSuper
    /* renamed from: g */
    public void mo16376g(@Nullable Drawable drawable) {
        super.mo16376g(drawable);
        this.f1601c.mo16392b();
        if (!this.f1603e) {
            mo16388k();
        }
    }

    @CallSuper
    /* renamed from: h */
    public void mo16385h(@NonNull C1924g gVar) {
        this.f1601c.mo16393d(gVar);
    }

    @Nullable
    /* renamed from: i */
    public final Object mo16386i() {
        Integer num = f1599g;
        if (num == null) {
            return this.f1600b.getTag();
        }
        return this.f1600b.getTag(num.intValue());
    }

    /* renamed from: j */
    public final void mo16387j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f1602d;
        if (onAttachStateChangeListener != null && !this.f1604f) {
            this.f1600b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f1604f = true;
        }
    }

    /* renamed from: k */
    public final void mo16388k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f1602d;
        if (onAttachStateChangeListener != null && this.f1604f) {
            this.f1600b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f1604f = false;
        }
    }

    /* renamed from: l */
    public final void mo16389l(@Nullable Object obj) {
        Integer num = f1599g;
        if (num == null) {
            this.f1600b.setTag(obj);
        } else {
            this.f1600b.setTag(num.intValue(), obj);
        }
    }

    public String toString() {
        return "Target for: " + this.f1600b;
    }
}
