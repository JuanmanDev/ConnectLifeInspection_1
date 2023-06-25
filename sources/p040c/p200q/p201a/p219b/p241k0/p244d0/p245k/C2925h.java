package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import android.net.Uri;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3150d0;

/* renamed from: c.q.a.b.k0.d0.k.h */
/* compiled from: RangedUri */
public final class C2925h {

    /* renamed from: a */
    public final long f4808a;

    /* renamed from: b */
    public final long f4809b;

    /* renamed from: c */
    public final String f4810c;

    /* renamed from: d */
    public int f4811d;

    public C2925h(@Nullable String str, long j, long j2) {
        this.f4810c = str == null ? "" : str;
        this.f4808a = j;
        this.f4809b = j2;
    }

    @Nullable
    /* renamed from: a */
    public C2925h mo19283a(@Nullable C2925h hVar, String str) {
        String c = mo19285c(str);
        if (hVar != null && c.equals(hVar.mo19285c(str))) {
            long j = this.f4809b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f4808a;
                if (j3 + j == hVar.f4808a) {
                    long j4 = hVar.f4809b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C2925h(c, j3, j2);
                }
            }
            long j5 = hVar.f4809b;
            if (j5 != -1) {
                long j6 = hVar.f4808a;
                if (j6 + j5 == this.f4808a) {
                    long j7 = this.f4809b;
                    if (j7 != -1) {
                        j2 = j5 + j7;
                    }
                    return new C2925h(c, j6, j2);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Uri mo19284b(String str) {
        return C3150d0.m7752d(str, this.f4810c);
    }

    /* renamed from: c */
    public String mo19285c(String str) {
        return C3150d0.m7751c(str, this.f4810c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2925h.class != obj.getClass()) {
            return false;
        }
        C2925h hVar = (C2925h) obj;
        if (this.f4808a == hVar.f4808a && this.f4809b == hVar.f4809b && this.f4810c.equals(hVar.f4810c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f4811d == 0) {
            this.f4811d = ((((527 + ((int) this.f4808a)) * 31) + ((int) this.f4809b)) * 31) + this.f4810c.hashCode();
        }
        return this.f4811d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f4810c + ", start=" + this.f4808a + ", length=" + this.f4809b + ")";
    }
}
