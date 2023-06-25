package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2685p;
import p040c.p200q.p201a.p219b.p224f0.p230w.C2756i;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3161k;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.c */
/* compiled from: FlacReader */
public final class C2749c extends C2756i {

    /* renamed from: n */
    public C3161k f3974n;

    /* renamed from: o */
    public C2750a f3975o;

    /* renamed from: c.q.a.b.f0.w.c$a */
    /* compiled from: FlacReader */
    public class C2750a implements C2754g, C2682o {

        /* renamed from: a */
        public long[] f3976a;

        /* renamed from: b */
        public long[] f3977b;

        /* renamed from: c */
        public long f3978c = -1;

        /* renamed from: d */
        public long f3979d = -1;

        public C2750a() {
        }

        /* renamed from: b */
        public long mo18693b(C2675h hVar) {
            long j = this.f3979d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f3979d = -1;
            return j2;
        }

        /* renamed from: d */
        public boolean mo18503d() {
            return true;
        }

        /* renamed from: e */
        public C2682o mo18694e() {
            return this;
        }

        /* renamed from: f */
        public long mo18695f(long j) {
            long b = C2749c.this.mo18722b(j);
            this.f3979d = this.f3976a[C3152e0.m7795e(this.f3976a, b, true, true)];
            return b;
        }

        /* renamed from: g */
        public void mo18708g(C3173t tVar) {
            tVar.mo20007M(1);
            int B = tVar.mo19996B() / 18;
            this.f3976a = new long[B];
            this.f3977b = new long[B];
            for (int i = 0; i < B; i++) {
                this.f3976a[i] = tVar.mo20025r();
                this.f3977b[i] = tVar.mo20025r();
                tVar.mo20007M(2);
            }
        }

        /* renamed from: h */
        public C2682o.C2683a mo18504h(long j) {
            int e = C3152e0.m7795e(this.f3976a, C2749c.this.mo18722b(j), true, true);
            long a = C2749c.this.mo18721a(this.f3976a[e]);
            C2685p pVar = new C2685p(a, this.f3978c + this.f3977b[e]);
            if (a < j) {
                long[] jArr = this.f3976a;
                if (e != jArr.length - 1) {
                    int i = e + 1;
                    return new C2682o.C2683a(pVar, new C2685p(C2749c.this.mo18721a(jArr[i]), this.f3978c + this.f3977b[i]));
                }
            }
            return new C2682o.C2683a(pVar);
        }

        /* renamed from: i */
        public long mo18505i() {
            return C2749c.this.f3974n.mo19966b();
        }

        /* renamed from: j */
        public void mo18709j(long j) {
            this.f3978c = j;
        }
    }

    /* renamed from: n */
    public static boolean m5634n(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: o */
    public static boolean m5635o(C3173t tVar) {
        return tVar.mo20008a() >= 5 && tVar.mo20032y() == 127 && tVar.mo19995A() == 1179402563;
    }

    /* renamed from: e */
    public long mo18704e(C3173t tVar) {
        if (!m5634n(tVar.f5877a)) {
            return -1;
        }
        return (long) mo18707m(tVar);
    }

    /* renamed from: h */
    public boolean mo18705h(C3173t tVar, long j, C2756i.C2758b bVar) {
        byte[] bArr = tVar.f5877a;
        if (this.f3974n == null) {
            this.f3974n = new C3161k(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, tVar.mo20011d());
            copyOfRange[4] = ByteCompanionObject.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a = this.f3974n.mo19965a();
            C3161k kVar = this.f3974n;
            bVar.f4014a = Format.m10238l((String) null, "audio/flac", (String) null, -1, a, kVar.f5842b, kVar.f5841a, singletonList, (DrmInitData) null, 0, (String) null);
            return true;
        } else if ((bArr[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            C2750a aVar = new C2750a();
            this.f3975o = aVar;
            aVar.mo18708g(tVar);
            return true;
        } else if (!m5634n(bArr)) {
            return true;
        } else {
            C2750a aVar2 = this.f3975o;
            if (aVar2 != null) {
                aVar2.mo18709j(j);
                bVar.f4015b = this.f3975o;
            }
            return false;
        }
    }

    /* renamed from: j */
    public void mo18706j(boolean z) {
        super.mo18706j(z);
        if (z) {
            this.f3974n = null;
            this.f3975o = null;
        }
    }

    /* renamed from: m */
    public final int mo18707m(C3173t tVar) {
        int i;
        int i2;
        int i3 = (tVar.f5877a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                tVar.mo20007M(4);
                tVar.mo20000F();
                int y = i3 == 6 ? tVar.mo20032y() : tVar.mo19999E();
                tVar.mo20006L(0);
                return y + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }
}
