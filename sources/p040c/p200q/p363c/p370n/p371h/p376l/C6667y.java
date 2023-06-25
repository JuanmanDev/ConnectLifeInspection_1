package p040c.p200q.p363c.p370n.p371h.p376l;

import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;

/* renamed from: c.q.c.n.h.l.y */
/* compiled from: AutoValue_StaticSessionData_DeviceData */
public final class C6667y extends C6595b0.C6597b {

    /* renamed from: a */
    public final int f12733a;

    /* renamed from: b */
    public final String f12734b;

    /* renamed from: c */
    public final int f12735c;

    /* renamed from: d */
    public final long f12736d;

    /* renamed from: e */
    public final long f12737e;

    /* renamed from: f */
    public final boolean f12738f;

    /* renamed from: g */
    public final int f12739g;

    /* renamed from: h */
    public final String f12740h;

    /* renamed from: i */
    public final String f12741i;

    public C6667y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f12733a = i;
        if (str != null) {
            this.f12734b = str;
            this.f12735c = i2;
            this.f12736d = j;
            this.f12737e = j2;
            this.f12738f = z;
            this.f12739g = i3;
            if (str2 != null) {
                this.f12740h = str2;
                if (str3 != null) {
                    this.f12741i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    /* renamed from: a */
    public int mo30964a() {
        return this.f12733a;
    }

    /* renamed from: b */
    public int mo30965b() {
        return this.f12735c;
    }

    /* renamed from: d */
    public long mo30966d() {
        return this.f12737e;
    }

    /* renamed from: e */
    public boolean mo30967e() {
        return this.f12738f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6595b0.C6597b)) {
            return false;
        }
        C6595b0.C6597b bVar = (C6595b0.C6597b) obj;
        if (this.f12733a == bVar.mo30964a() && this.f12734b.equals(bVar.mo30969g()) && this.f12735c == bVar.mo30965b() && this.f12736d == bVar.mo30972j() && this.f12737e == bVar.mo30966d() && this.f12738f == bVar.mo30967e() && this.f12739g == bVar.mo30971i() && this.f12740h.equals(bVar.mo30968f()) && this.f12741i.equals(bVar.mo30970h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo30968f() {
        return this.f12740h;
    }

    /* renamed from: g */
    public String mo30969g() {
        return this.f12734b;
    }

    /* renamed from: h */
    public String mo30970h() {
        return this.f12741i;
    }

    public int hashCode() {
        long j = this.f12736d;
        long j2 = this.f12737e;
        return ((((((((((((((((this.f12733a ^ 1000003) * 1000003) ^ this.f12734b.hashCode()) * 1000003) ^ this.f12735c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f12738f ? 1231 : 1237)) * 1000003) ^ this.f12739g) * 1000003) ^ this.f12740h.hashCode()) * 1000003) ^ this.f12741i.hashCode();
    }

    /* renamed from: i */
    public int mo30971i() {
        return this.f12739g;
    }

    /* renamed from: j */
    public long mo30972j() {
        return this.f12736d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f12733a + ", model=" + this.f12734b + ", availableProcessors=" + this.f12735c + ", totalRam=" + this.f12736d + ", diskSpace=" + this.f12737e + ", isEmulator=" + this.f12738f + ", state=" + this.f12739g + ", manufacturer=" + this.f12740h + ", modelClass=" + this.f12741i + "}";
    }
}
