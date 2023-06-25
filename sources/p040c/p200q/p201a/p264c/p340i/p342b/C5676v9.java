package p040c.p200q.p201a.p264c.p340i.p342b;

import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5107i4;
import p040c.p200q.p201a.p264c.p294g.p335i.C5275t4;

/* renamed from: c.q.a.c.i.b.v9 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5676v9 {

    /* renamed from: a */
    public C5275t4 f11046a;

    /* renamed from: b */
    public List f11047b;

    /* renamed from: c */
    public List f11048c;

    /* renamed from: d */
    public long f11049d;

    /* renamed from: e */
    public final /* synthetic */ C5709y9 f11050e;

    public /* synthetic */ C5676v9(C5709y9 y9Var, C5665u9 u9Var) {
        this.f11050e = y9Var;
    }

    /* renamed from: b */
    public static final long m16167b(C5107i4 i4Var) {
        return ((i4Var.mo27325G() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo28669a(long j, C5107i4 i4Var) {
        C3495o.m8908j(i4Var);
        if (this.f11048c == null) {
            this.f11048c = new ArrayList();
        }
        if (this.f11047b == null) {
            this.f11047b = new ArrayList();
        }
        if (!this.f11048c.isEmpty() && m16167b((C5107i4) this.f11048c.get(0)) != m16167b(i4Var)) {
            return false;
        }
        long d = this.f11049d + ((long) i4Var.mo27715d());
        this.f11050e.mo28732T();
        if (d >= ((long) Math.max(0, ((Integer) C5658u2.f10979i.mo28613a((Object) null)).intValue()))) {
            return false;
        }
        this.f11049d = d;
        this.f11048c.add(i4Var);
        this.f11047b.add(Long.valueOf(j));
        int size = this.f11048c.size();
        this.f11050e.mo28732T();
        if (size >= Math.max(1, ((Integer) C5658u2.f10981j.mo28613a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
