package p040c.p077d.p078a.p081k.p091l.p097h;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.d.a.k.l.h.f */
/* compiled from: TranscoderRegistry */
public class C1871f {

    /* renamed from: a */
    public final List<C1872a<?, ?>> f1479a = new ArrayList();

    /* renamed from: c.d.a.k.l.h.f$a */
    /* compiled from: TranscoderRegistry */
    public static final class C1872a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f1480a;

        /* renamed from: b */
        public final Class<R> f1481b;

        /* renamed from: c */
        public final C1870e<Z, R> f1482c;

        public C1872a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C1870e<Z, R> eVar) {
            this.f1480a = cls;
            this.f1481b = cls2;
            this.f1482c = eVar;
        }

        /* renamed from: a */
        public boolean mo16193a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f1480a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f1481b);
        }
    }

    @NonNull
    /* renamed from: a */
    public synchronized <Z, R> C1870e<Z, R> mo16190a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1873g.m2239b();
        }
        for (C1872a next : this.f1479a) {
            if (next.mo16193a(cls, cls2)) {
                return next.f1482c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo16191b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1872a<?, ?> a : this.f1479a) {
            if (a.mo16193a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo16192c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull C1870e<Z, R> eVar) {
        this.f1479a.add(new C1872a(cls, cls2, eVar));
    }
}
