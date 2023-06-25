package p040c.p200q.p201a.p219b.p224f0.p230w;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.p224f0.p230w.C2756i;
import p040c.p200q.p201a.p219b.p224f0.p230w.C2763l;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.k */
/* compiled from: VorbisReader */
public final class C2761k extends C2756i {

    /* renamed from: n */
    public C2762a f4020n;

    /* renamed from: o */
    public int f4021o;

    /* renamed from: p */
    public boolean f4022p;

    /* renamed from: q */
    public C2763l.C2767d f4023q;

    /* renamed from: r */
    public C2763l.C2765b f4024r;

    /* renamed from: c.q.a.b.f0.w.k$a */
    /* compiled from: VorbisReader */
    public static final class C2762a {

        /* renamed from: a */
        public final C2763l.C2767d f4025a;

        /* renamed from: b */
        public final byte[] f4026b;

        /* renamed from: c */
        public final C2763l.C2766c[] f4027c;

        /* renamed from: d */
        public final int f4028d;

        public C2762a(C2763l.C2767d dVar, C2763l.C2765b bVar, byte[] bArr, C2763l.C2766c[] cVarArr, int i) {
            this.f4025a = dVar;
            this.f4026b = bArr;
            this.f4027c = cVarArr;
            this.f4028d = i;
        }
    }

    /* renamed from: l */
    public static void m5691l(C3173t tVar, long j) {
        tVar.mo20005K(tVar.mo20011d() + 4);
        tVar.f5877a[tVar.mo20011d() - 4] = (byte) ((int) (j & 255));
        tVar.f5877a[tVar.mo20011d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        tVar.f5877a[tVar.mo20011d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        tVar.f5877a[tVar.mo20011d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: m */
    public static int m5692m(byte b, C2762a aVar) {
        if (!aVar.f4027c[m5693n(b, aVar.f4028d, 1)].f4029a) {
            return aVar.f4025a.f4033d;
        }
        return aVar.f4025a.f4034e;
    }

    /* renamed from: n */
    public static int m5693n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: p */
    public static boolean m5694p(C3173t tVar) {
        try {
            return C2763l.m5710k(1, tVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void mo18724d(long j) {
        super.mo18724d(j);
        int i = 0;
        this.f4022p = j != 0;
        C2763l.C2767d dVar = this.f4023q;
        if (dVar != null) {
            i = dVar.f4033d;
        }
        this.f4021o = i;
    }

    /* renamed from: e */
    public long mo18704e(C3173t tVar) {
        byte[] bArr = tVar.f5877a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int m = m5692m(bArr[0], this.f4020n);
        if (this.f4022p) {
            i = (this.f4021o + m) / 4;
        }
        long j = (long) i;
        m5691l(tVar, j);
        this.f4022p = true;
        this.f4021o = m;
        return j;
    }

    /* renamed from: h */
    public boolean mo18705h(C3173t tVar, long j, C2756i.C2758b bVar) {
        if (this.f4020n != null) {
            return false;
        }
        C2762a o = mo18734o(tVar);
        this.f4020n = o;
        if (o == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f4020n.f4025a.f4035f);
        arrayList.add(this.f4020n.f4026b);
        C2763l.C2767d dVar = this.f4020n.f4025a;
        bVar.f4014a = Format.m10238l((String) null, "audio/vorbis", (String) null, dVar.f4032c, -1, dVar.f4030a, (int) dVar.f4031b, arrayList, (DrmInitData) null, 0, (String) null);
        return true;
    }

    /* renamed from: j */
    public void mo18706j(boolean z) {
        super.mo18706j(z);
        if (z) {
            this.f4020n = null;
            this.f4023q = null;
            this.f4024r = null;
        }
        this.f4021o = 0;
        this.f4022p = false;
    }

    /* renamed from: o */
    public C2762a mo18734o(C3173t tVar) {
        if (this.f4023q == null) {
            this.f4023q = C2763l.m5708i(tVar);
            return null;
        } else if (this.f4024r == null) {
            this.f4024r = C2763l.m5707h(tVar);
            return null;
        } else {
            byte[] bArr = new byte[tVar.mo20011d()];
            System.arraycopy(tVar.f5877a, 0, bArr, 0, tVar.mo20011d());
            C2763l.C2766c[] j = C2763l.m5709j(tVar, this.f4023q.f4030a);
            return new C2762a(this.f4023q, this.f4024r, bArr, j, C2763l.m5700a(j.length - 1));
        }
    }
}
