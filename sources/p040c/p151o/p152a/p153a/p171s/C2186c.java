package p040c.p151o.p152a.p153a.p171s;

import com.google.gson.annotations.SerializedName;

/* renamed from: c.o.a.a.s.c */
/* compiled from: SessionInfo */
public class C2186c {

    /* renamed from: a */
    public String f2165a;

    /* renamed from: b */
    public String f2166b;
    @SerializedName(alternate = {"expires_in"}, value = "expirationTime")

    /* renamed from: c */
    public long f2167c;

    public C2186c(String str, String str2, long j) {
        this.f2166b = str;
        this.f2165a = str2;
        this.f2167c = j;
    }

    /* renamed from: a */
    public long mo17023a() {
        return this.f2167c;
    }

    /* renamed from: b */
    public String mo17024b() {
        return this.f2166b;
    }

    /* renamed from: c */
    public String mo17025c() {
        return this.f2165a;
    }

    /* renamed from: d */
    public boolean mo17026d() {
        return (this.f2165a == null || this.f2166b == null) ? false : true;
    }
}
