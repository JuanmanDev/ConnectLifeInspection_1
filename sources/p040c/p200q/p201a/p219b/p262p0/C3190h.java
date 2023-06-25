package p040c.p200q.p201a.p219b.p262p0;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3155g;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.p0.h */
/* compiled from: AvcConfig */
public final class C3190h {

    /* renamed from: a */
    public final List<byte[]> f5934a;

    /* renamed from: b */
    public final int f5935b;

    /* renamed from: c */
    public final int f5936c;

    /* renamed from: d */
    public final int f5937d;

    /* renamed from: e */
    public final float f5938e;

    public C3190h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f5934a = list;
        this.f5935b = i;
        this.f5936c = i2;
        this.f5937d = i3;
        this.f5938e = f;
    }

    /* renamed from: a */
    public static byte[] m8036a(C3173t tVar) {
        int E = tVar.mo19999E();
        int c = tVar.mo20010c();
        tVar.mo20007M(E);
        return C3155g.m7841d(tVar.f5877a, c, E);
    }

    /* renamed from: b */
    public static C3190h m8037b(C3173t tVar) {
        float f;
        int i;
        int i2;
        try {
            tVar.mo20007M(4);
            int y = (tVar.mo20032y() & 3) + 1;
            if (y != 3) {
                ArrayList arrayList = new ArrayList();
                int y2 = tVar.mo20032y() & 31;
                for (int i3 = 0; i3 < y2; i3++) {
                    arrayList.add(m8036a(tVar));
                }
                int y3 = tVar.mo20032y();
                for (int i4 = 0; i4 < y3; i4++) {
                    arrayList.add(m8036a(tVar));
                }
                if (y2 > 0) {
                    C3168q.C3170b i5 = C3168q.m7910i((byte[]) arrayList.get(0), y, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.f5864e;
                    int i7 = i5.f5865f;
                    f = i5.f5866g;
                    i2 = i6;
                    i = i7;
                } else {
                    f = 1.0f;
                    i2 = -1;
                    i = -1;
                }
                return new C3190h(arrayList, y, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
