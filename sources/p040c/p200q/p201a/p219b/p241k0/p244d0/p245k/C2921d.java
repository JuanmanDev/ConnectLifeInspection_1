package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.d0.k.d */
/* compiled from: Descriptor */
public final class C2921d {
    @NonNull

    /* renamed from: a */
    public final String f4792a;
    @Nullable

    /* renamed from: b */
    public final String f4793b;
    @Nullable

    /* renamed from: c */
    public final String f4794c;

    public C2921d(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f4792a = str;
        this.f4793b = str2;
        this.f4794c = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2921d.class != obj.getClass()) {
            return false;
        }
        C2921d dVar = (C2921d) obj;
        if (!C3152e0.m7789b(this.f4792a, dVar.f4792a) || !C3152e0.m7789b(this.f4793b, dVar.f4793b) || !C3152e0.m7789b(this.f4794c, dVar.f4794c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f4792a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4793b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4794c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
