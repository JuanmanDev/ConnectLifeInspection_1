package p040c.p077d.p078a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040c.p077d.p078a.p081k.p084j.C1657j;
import p040c.p077d.p078a.p098l.C1876c;
import p040c.p077d.p078a.p098l.C1878d;
import p040c.p077d.p078a.p098l.C1883h;
import p040c.p077d.p078a.p098l.C1884i;
import p040c.p077d.p078a.p098l.C1889l;
import p040c.p077d.p078a.p098l.C1890m;
import p040c.p077d.p078a.p098l.C1891n;
import p040c.p077d.p078a.p101o.C1909c;
import p040c.p077d.p078a.p101o.C1911e;
import p040c.p077d.p078a.p101o.C1912f;
import p040c.p077d.p078a.p101o.p102j.C1925h;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.g */
/* compiled from: RequestManager */
public class C1546g implements C1884i {

    /* renamed from: l */
    public static final C1912f f813l;

    /* renamed from: a */
    public final C1541c f814a;

    /* renamed from: b */
    public final Context f815b;

    /* renamed from: c */
    public final C1883h f816c;
    @GuardedBy("this")

    /* renamed from: d */
    public final C1890m f817d;
    @GuardedBy("this")

    /* renamed from: e */
    public final C1889l f818e;
    @GuardedBy("this")

    /* renamed from: f */
    public final C1891n f819f;

    /* renamed from: g */
    public final Runnable f820g;

    /* renamed from: h */
    public final Handler f821h;

    /* renamed from: i */
    public final C1876c f822i;

    /* renamed from: j */
    public final CopyOnWriteArrayList<C1911e<Object>> f823j;
    @GuardedBy("this")

    /* renamed from: k */
    public C1912f f824k;

    /* renamed from: c.d.a.g$a */
    /* compiled from: RequestManager */
    public class C1547a implements Runnable {
        public C1547a() {
        }

        public void run() {
            C1546g gVar = C1546g.this;
            gVar.f816c.mo16194a(gVar);
        }
    }

    /* renamed from: c.d.a.g$b */
    /* compiled from: RequestManager */
    public class C1548b implements C1876c.C1877a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a */
        public final C1890m f826a;

        public C1548b(@NonNull C1890m mVar) {
            this.f826a = mVar;
        }

        /* renamed from: a */
        public void mo15521a(boolean z) {
            if (z) {
                synchronized (C1546g.this) {
                    this.f826a.mo16228e();
                }
            }
        }
    }

    static {
        C1912f t0 = C1912f.m2415t0(Bitmap.class);
        t0.mo16276V();
        f813l = t0;
        C1912f t02 = C1912f.m2415t0(GifDrawable.class);
        t02.mo16276V();
        C1912f fVar = t02;
        C1912f fVar2 = (C1912f) ((C1912f) C1912f.m2416u0(C1657j.f1109c).mo16288e0(Priority.LOW)).mo16305m0(true);
    }

    public C1546g(@NonNull C1541c cVar, @NonNull C1883h hVar, @NonNull C1889l lVar, @NonNull Context context) {
        this(cVar, hVar, lVar, new C1890m(), cVar.mo15452h(), context);
    }

    @CheckResult
    @NonNull
    /* renamed from: i */
    public <ResourceType> C1544f<ResourceType> mo15499i(@NonNull Class<ResourceType> cls) {
        return new C1544f<>(this.f814a, this, cls, this.f815b);
    }

    @CheckResult
    @NonNull
    /* renamed from: j */
    public C1544f<Bitmap> mo15500j() {
        return mo15499i(Bitmap.class).mo15488a(f813l);
    }

    @CheckResult
    @NonNull
    /* renamed from: k */
    public C1544f<Drawable> mo15501k() {
        return mo15499i(Drawable.class);
    }

    /* renamed from: l */
    public synchronized void mo15502l(@Nullable C1925h<?> hVar) {
        if (hVar != null) {
            mo15519y(hVar);
        }
    }

    /* renamed from: m */
    public List<C1911e<Object>> mo15503m() {
        return this.f823j;
    }

    /* renamed from: n */
    public synchronized C1912f mo15504n() {
        return this.f824k;
    }

    @NonNull
    /* renamed from: o */
    public <T> C1549h<?, T> mo15505o(Class<T> cls) {
        return this.f814a.mo15454j().mo15470e(cls);
    }

    public synchronized void onDestroy() {
        this.f819f.onDestroy();
        for (C1925h<?> l : this.f819f.mo16233j()) {
            mo15502l(l);
        }
        this.f819f.mo16232i();
        this.f817d.mo16226c();
        this.f816c.mo16195b(this);
        this.f816c.mo16195b(this.f822i);
        this.f821h.removeCallbacks(this.f820g);
        this.f814a.mo15463t(this);
    }

    public synchronized void onStart() {
        mo15515u();
        this.f819f.onStart();
    }

    public synchronized void onStop() {
        mo15513t();
        this.f819f.onStop();
    }

    @CheckResult
    @NonNull
    /* renamed from: p */
    public C1544f<Drawable> mo15509p(@Nullable Bitmap bitmap) {
        return mo15501k().mo15480F0(bitmap);
    }

    @CheckResult
    @NonNull
    /* renamed from: q */
    public C1544f<Drawable> mo15510q(@Nullable Drawable drawable) {
        return mo15501k().mo15481G0(drawable);
    }

    @CheckResult
    @NonNull
    /* renamed from: r */
    public C1544f<Drawable> mo15511r(@RawRes @DrawableRes @Nullable Integer num) {
        return mo15501k().mo15482H0(num);
    }

    @CheckResult
    @NonNull
    /* renamed from: s */
    public C1544f<Drawable> mo15512s(@Nullable String str) {
        C1544f<Drawable> k = mo15501k();
        k.mo15484J0(str);
        return k;
    }

    /* renamed from: t */
    public synchronized void mo15513t() {
        this.f817d.mo16227d();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f817d + ", treeNode=" + this.f818e + "}";
    }

    /* renamed from: u */
    public synchronized void mo15515u() {
        this.f817d.mo16229f();
    }

    /* renamed from: v */
    public synchronized void mo15516v(@NonNull C1912f fVar) {
        C1912f fVar2 = (C1912f) fVar.clone();
        fVar2.mo16282b();
        this.f824k = fVar2;
    }

    /* renamed from: w */
    public synchronized void mo15517w(@NonNull C1925h<?> hVar, @NonNull C1909c cVar) {
        this.f819f.mo16234k(hVar);
        this.f817d.mo16230g(cVar);
    }

    /* renamed from: x */
    public synchronized boolean mo15518x(@NonNull C1925h<?> hVar) {
        C1909c f = hVar.mo16375f();
        if (f == null) {
            return true;
        }
        if (!this.f817d.mo16225b(f)) {
            return false;
        }
        this.f819f.mo16235l(hVar);
        hVar.mo16372c((C1909c) null);
        return true;
    }

    /* renamed from: y */
    public final void mo15519y(@NonNull C1925h<?> hVar) {
        if (!mo15518x(hVar) && !this.f814a.mo15461q(hVar) && hVar.mo16375f() != null) {
            C1909c f = hVar.mo16375f();
            hVar.mo16372c((C1909c) null);
            f.clear();
        }
    }

    public C1546g(C1541c cVar, C1883h hVar, C1889l lVar, C1890m mVar, C1878d dVar, Context context) {
        this.f819f = new C1891n();
        this.f820g = new C1547a();
        this.f821h = new Handler(Looper.getMainLooper());
        this.f814a = cVar;
        this.f816c = hVar;
        this.f818e = lVar;
        this.f817d = mVar;
        this.f815b = context;
        this.f822i = dVar.mo16199a(context.getApplicationContext(), new C1548b(mVar));
        if (C1950j.m2580p()) {
            this.f821h.post(this.f820g);
        } else {
            hVar.mo16194a(this);
        }
        hVar.mo16194a(this.f822i);
        this.f823j = new CopyOnWriteArrayList<>(cVar.mo15454j().mo15468c());
        mo15516v(cVar.mo15454j().mo15469d());
        cVar.mo15460p(this);
    }
}
