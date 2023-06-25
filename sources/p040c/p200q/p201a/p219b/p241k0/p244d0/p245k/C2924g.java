package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.d0.k.g */
/* compiled from: ProgramInformation */
public class C2924g {

    /* renamed from: a */
    public final String f4803a;

    /* renamed from: b */
    public final String f4804b;

    /* renamed from: c */
    public final String f4805c;

    /* renamed from: d */
    public final String f4806d;

    /* renamed from: e */
    public final String f4807e;

    public C2924g(String str, String str2, String str3, String str4, String str5) {
        this.f4803a = str;
        this.f4804b = str2;
        this.f4805c = str3;
        this.f4806d = str4;
        this.f4807e = str5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2924g.class != obj.getClass()) {
            return false;
        }
        C2924g gVar = (C2924g) obj;
        if (!C3152e0.m7789b(this.f4803a, gVar.f4803a) || !C3152e0.m7789b(this.f4804b, gVar.f4804b) || !C3152e0.m7789b(this.f4805c, gVar.f4805c) || !C3152e0.m7789b(this.f4806d, gVar.f4806d) || !C3152e0.m7789b(this.f4807e, gVar.f4807e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f4803a;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4804b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4805c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f4806d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f4807e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
