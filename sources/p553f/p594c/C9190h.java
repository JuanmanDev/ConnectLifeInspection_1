package p553f.p594c;

import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p607e.p608a.C9249f;
import p553f.p594c.p602s.p607e.p608a.C9265n;
import p553f.p594c.p602s.p607e.p610c.C9281d;
import p553f.p594c.p602s.p607e.p610c.C9282e;
import p553f.p594c.p602s.p607e.p610c.C9284f;
import p553f.p594c.p602s.p607e.p610c.C9285g;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.BackpressureStrategy;

/* renamed from: f.c.h */
/* compiled from: Observable */
public abstract class C9190h<T> implements C9192i<T> {

    /* renamed from: f.c.h$a */
    /* compiled from: Observable */
    public static /* synthetic */ class C9191a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17985a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.reactivex.BackpressureStrategy[] r0 = p630io.reactivex.BackpressureStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17985a = r0
                io.reactivex.BackpressureStrategy r1 = p630io.reactivex.BackpressureStrategy.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17985a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.reactivex.BackpressureStrategy r1 = p630io.reactivex.BackpressureStrategy.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17985a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.reactivex.BackpressureStrategy r1 = p630io.reactivex.BackpressureStrategy.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17985a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.reactivex.BackpressureStrategy r1 = p630io.reactivex.BackpressureStrategy.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.C9190h.C9191a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo47002a(C9193j<? super T> jVar) {
        C9227b.m24985d(jVar, "observer is null");
        try {
            C9193j<? super Object> t = C9323a.m25173t(this, jVar);
            C9227b.m24985d(t, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo47006e(t);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9211a.m24971b(th);
            C9323a.m25169p(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: b */
    public final C9183a mo47003b() {
        return C9323a.m25163j(new C9281d(this));
    }

    /* renamed from: c */
    public final C9187e<T> mo47004c() {
        return C9323a.m25165l(new C9282e(this));
    }

    /* renamed from: d */
    public final C9197l<T> mo47005d() {
        return C9323a.m25167n(new C9284f(this, null));
    }

    /* renamed from: e */
    public abstract void mo47006e(C9193j<? super T> jVar);

    /* renamed from: f */
    public final C9190h<T> mo47007f(C9194k kVar) {
        C9227b.m24985d(kVar, "scheduler is null");
        return C9323a.m25166m(new C9285g(this, kVar));
    }

    /* renamed from: g */
    public final C9185c<T> mo47008g(BackpressureStrategy backpressureStrategy) {
        C9249f fVar = new C9249f(this);
        int i = C9191a.f17985a[backpressureStrategy.ordinal()];
        if (i == 1) {
            return fVar.mo46987p();
        }
        if (i == 2) {
            return fVar.mo46988q();
        }
        if (i == 3) {
            return fVar;
        }
        if (i != 4) {
            return fVar.mo46985n();
        }
        return C9323a.m25164k(new C9265n(fVar));
    }
}
