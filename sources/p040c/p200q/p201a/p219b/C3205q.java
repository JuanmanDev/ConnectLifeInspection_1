package p040c.p200q.p201a.p219b;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p259m0.C3112h;

/* renamed from: c.q.a.b.q */
/* compiled from: PlaybackInfo */
public final class C3205q {

    /* renamed from: n */
    public static final C3014u.C3015a f6014n = new C3014u.C3015a(new Object());

    /* renamed from: a */
    public final C2578a0 f6015a;
    @Nullable

    /* renamed from: b */
    public final Object f6016b;

    /* renamed from: c */
    public final C3014u.C3015a f6017c;

    /* renamed from: d */
    public final long f6018d;

    /* renamed from: e */
    public final long f6019e;

    /* renamed from: f */
    public final int f6020f;

    /* renamed from: g */
    public final boolean f6021g;

    /* renamed from: h */
    public final TrackGroupArray f6022h;

    /* renamed from: i */
    public final C3112h f6023i;

    /* renamed from: j */
    public final C3014u.C3015a f6024j;

    /* renamed from: k */
    public volatile long f6025k;

    /* renamed from: l */
    public volatile long f6026l;

    /* renamed from: m */
    public volatile long f6027m;

    public C3205q(C2578a0 a0Var, @Nullable Object obj, C3014u.C3015a aVar, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C3112h hVar, C3014u.C3015a aVar2, long j3, long j4, long j5) {
        this.f6015a = a0Var;
        this.f6016b = obj;
        this.f6017c = aVar;
        this.f6018d = j;
        this.f6019e = j2;
        this.f6020f = i;
        this.f6021g = z;
        this.f6022h = trackGroupArray;
        this.f6023i = hVar;
        this.f6024j = aVar2;
        this.f6025k = j3;
        this.f6026l = j4;
        this.f6027m = j5;
    }

    /* renamed from: g */
    public static C3205q m8147g(long j, C3112h hVar) {
        C3112h hVar2 = hVar;
        return new C3205q(C2578a0.f3043a, (Object) null, f6014n, j, -9223372036854775807L, 1, false, TrackGroupArray.f7829n, hVar2, f6014n, j, 0, j);
    }

    @CheckResult
    /* renamed from: a */
    public C3205q mo20158a(boolean z) {
        C2578a0 a0Var = this.f6015a;
        return new C3205q(a0Var, this.f6016b, this.f6017c, this.f6018d, this.f6019e, this.f6020f, z, this.f6022h, this.f6023i, this.f6024j, this.f6025k, this.f6026l, this.f6027m);
    }

    @CheckResult
    /* renamed from: b */
    public C3205q mo20159b(C3014u.C3015a aVar) {
        C2578a0 a0Var = this.f6015a;
        return new C3205q(a0Var, this.f6016b, this.f6017c, this.f6018d, this.f6019e, this.f6020f, this.f6021g, this.f6022h, this.f6023i, aVar, this.f6025k, this.f6026l, this.f6027m);
    }

    @CheckResult
    /* renamed from: c */
    public C3205q mo20160c(C3014u.C3015a aVar, long j, long j2, long j3) {
        return new C3205q(this.f6015a, this.f6016b, aVar, j, aVar.mo19513a() ? j2 : -9223372036854775807L, this.f6020f, this.f6021g, this.f6022h, this.f6023i, this.f6024j, this.f6025k, j3, j);
    }

    @CheckResult
    /* renamed from: d */
    public C3205q mo20161d(int i) {
        C2578a0 a0Var = this.f6015a;
        return new C3205q(a0Var, this.f6016b, this.f6017c, this.f6018d, this.f6019e, i, this.f6021g, this.f6022h, this.f6023i, this.f6024j, this.f6025k, this.f6026l, this.f6027m);
    }

    @CheckResult
    /* renamed from: e */
    public C3205q mo20162e(C2578a0 a0Var, Object obj) {
        C2578a0 a0Var2 = a0Var;
        return new C3205q(a0Var, obj, this.f6017c, this.f6018d, this.f6019e, this.f6020f, this.f6021g, this.f6022h, this.f6023i, this.f6024j, this.f6025k, this.f6026l, this.f6027m);
    }

    @CheckResult
    /* renamed from: f */
    public C3205q mo20163f(TrackGroupArray trackGroupArray, C3112h hVar) {
        C2578a0 a0Var = this.f6015a;
        return new C3205q(a0Var, this.f6016b, this.f6017c, this.f6018d, this.f6019e, this.f6020f, this.f6021g, trackGroupArray, hVar, this.f6024j, this.f6025k, this.f6026l, this.f6027m);
    }

    /* renamed from: h */
    public C3014u.C3015a mo20164h(boolean z, C2578a0.C2581c cVar) {
        if (this.f6015a.mo18062q()) {
            return f6014n;
        }
        C2578a0 a0Var = this.f6015a;
        return new C3014u.C3015a(this.f6015a.mo18057l(a0Var.mo18058m(a0Var.mo18046a(z), cVar).f3052c));
    }

    @CheckResult
    /* renamed from: i */
    public C3205q mo20165i(C3014u.C3015a aVar, long j, long j2) {
        return new C3205q(this.f6015a, this.f6016b, aVar, j, aVar.mo19513a() ? j2 : -9223372036854775807L, this.f6020f, this.f6021g, this.f6022h, this.f6023i, aVar, j, 0, j);
    }
}
