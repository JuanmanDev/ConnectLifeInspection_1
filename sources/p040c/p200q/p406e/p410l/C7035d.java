package p040c.p200q.p406e.p410l;

import java.util.List;

/* renamed from: c.q.e.l.d */
/* compiled from: DecoderResult */
public final class C7035d {

    /* renamed from: a */
    public final byte[] f13462a;

    /* renamed from: b */
    public int f13463b;

    /* renamed from: c */
    public final String f13464c;

    /* renamed from: d */
    public final List<byte[]> f13465d;

    /* renamed from: e */
    public final String f13466e;

    /* renamed from: f */
    public Object f13467f;

    /* renamed from: g */
    public final int f13468g;

    /* renamed from: h */
    public final int f13469h;

    public C7035d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> mo32553a() {
        return this.f13465d;
    }

    /* renamed from: b */
    public String mo32554b() {
        return this.f13466e;
    }

    /* renamed from: c */
    public int mo32555c() {
        return this.f13463b;
    }

    /* renamed from: d */
    public Object mo32556d() {
        return this.f13467f;
    }

    /* renamed from: e */
    public byte[] mo32557e() {
        return this.f13462a;
    }

    /* renamed from: f */
    public int mo32558f() {
        return this.f13468g;
    }

    /* renamed from: g */
    public int mo32559g() {
        return this.f13469h;
    }

    /* renamed from: h */
    public String mo32560h() {
        return this.f13464c;
    }

    /* renamed from: i */
    public boolean mo32561i() {
        return this.f13468g >= 0 && this.f13469h >= 0;
    }

    /* renamed from: j */
    public void mo32562j(Integer num) {
    }

    /* renamed from: k */
    public void mo32563k(Integer num) {
    }

    /* renamed from: l */
    public void mo32564l(int i) {
        this.f13463b = i;
    }

    /* renamed from: m */
    public void mo32565m(Object obj) {
        this.f13467f = obj;
    }

    public C7035d(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f13462a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f13463b = i3;
        this.f13464c = str;
        this.f13465d = list;
        this.f13466e = str2;
        this.f13468g = i2;
        this.f13469h = i;
    }
}
