package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2781e0;
import p040c.p200q.p201a.p219b.p250l0.p251k.C3049d;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.i */
/* compiled from: DefaultTsPayloadReaderFactory */
public final class C2791i implements C2781e0.C2784c {

    /* renamed from: a */
    public final int f4157a;

    /* renamed from: b */
    public final List<Format> f4158b;

    public C2791i(int i) {
        this(i, Collections.singletonList(Format.m10245s((String) null, "application/cea-608", 0, (String) null)));
    }

    /* renamed from: a */
    public C2781e0 mo18759a(int i, C2781e0.C2783b bVar) {
        if (i == 2) {
            return new C2807t(new C2795m(mo18796d(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C2807t(new C2805r(bVar.f4099b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new C2807t(new C2803p());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new C2807t(new C2801o(mo18795c(bVar)));
                    }
                    if (i == 89) {
                        return new C2807t(new C2793k(bVar.f4100c));
                    }
                    if (i != 138) {
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (mo18798f(16)) {
                                    return null;
                                } else {
                                    return new C2815y(new C2770a0());
                                }
                            } else if (mo18798f(64)) {
                                return null;
                            }
                        }
                        return new C2807t(new C2786f(bVar.f4099b));
                    }
                    return new C2807t(new C2792j(bVar.f4099b));
                } else if (mo18798f(4)) {
                    return null;
                } else {
                    return new C2807t(new C2797n(mo18795c(bVar), mo18798f(1), mo18798f(8)));
                }
            } else if (mo18798f(2)) {
                return null;
            } else {
                return new C2807t(new C2804q(bVar.f4099b));
            }
        } else if (mo18798f(2)) {
            return null;
        } else {
            return new C2807t(new C2790h(false, bVar.f4099b));
        }
    }

    /* renamed from: b */
    public SparseArray<C2781e0> mo18760b() {
        return new SparseArray<>();
    }

    /* renamed from: c */
    public final C2816z mo18795c(C2781e0.C2783b bVar) {
        return new C2816z(mo18797e(bVar));
    }

    /* renamed from: d */
    public final C2789g0 mo18796d(C2781e0.C2783b bVar) {
        return new C2789g0(mo18797e(bVar));
    }

    /* renamed from: e */
    public final List<Format> mo18797e(C2781e0.C2783b bVar) {
        int i;
        String str;
        List<byte[]> list;
        if (mo18798f(32)) {
            return this.f4158b;
        }
        C3173t tVar = new C3173t(bVar.f4101d);
        List<Format> list2 = this.f4158b;
        while (tVar.mo20008a() > 0) {
            int y = tVar.mo20032y();
            int c = tVar.mo20010c() + tVar.mo20032y();
            if (y == 134) {
                list2 = new ArrayList<>();
                int y2 = tVar.mo20032y() & 31;
                for (int i2 = 0; i2 < y2; i2++) {
                    String v = tVar.mo20029v(3);
                    int y3 = tVar.mo20032y();
                    boolean z = true;
                    boolean z2 = (y3 & 128) != 0;
                    if (z2) {
                        i = y3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte y4 = (byte) tVar.mo20032y();
                    tVar.mo20007M(1);
                    if (z2) {
                        if ((y4 & 64) == 0) {
                            z = false;
                        }
                        list = C3049d.m7277a(z);
                    } else {
                        list = null;
                    }
                    list2.add(Format.m10247u((String) null, str, (String) null, -1, 0, v, i, (DrmInitData) null, Long.MAX_VALUE, list));
                }
            }
            tVar.mo20006L(c);
        }
        return list2;
    }

    /* renamed from: f */
    public final boolean mo18798f(int i) {
        return (i & this.f4157a) != 0;
    }

    public C2791i(int i, List<Format> list) {
        this.f4157a = i;
        this.f4158b = list;
    }
}
