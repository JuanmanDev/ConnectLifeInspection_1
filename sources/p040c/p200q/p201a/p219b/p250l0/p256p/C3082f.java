package p040c.p200q.p201a.p219b.p250l0.p256p;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.l0.p.f */
/* compiled from: TtmlSubtitle */
public final class C3082f implements C3034d {

    /* renamed from: e */
    public final C3078b f5572e;

    /* renamed from: l */
    public final long[] f5573l;

    /* renamed from: m */
    public final Map<String, C3081e> f5574m;

    /* renamed from: n */
    public final Map<String, C3079c> f5575n;

    /* renamed from: o */
    public final Map<String, String> f5576o;

    public C3082f(C3078b bVar, Map<String, C3081e> map, Map<String, C3079c> map2, Map<String, String> map3) {
        this.f5572e = bVar;
        this.f5575n = map2;
        this.f5576o = map3;
        this.f5574m = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f5573l = bVar.mo19737j();
    }

    /* renamed from: c */
    public int mo19618c(long j) {
        int c = C3152e0.m7791c(this.f5573l, j, false, false);
        if (c < this.f5573l.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: d */
    public long mo19619d(int i) {
        return this.f5573l[i];
    }

    /* renamed from: e */
    public List<C3031a> mo19620e(long j) {
        return this.f5572e.mo19735h(j, this.f5574m, this.f5575n, this.f5576o);
    }

    /* renamed from: g */
    public int mo19621g() {
        return this.f5573l.length;
    }
}
