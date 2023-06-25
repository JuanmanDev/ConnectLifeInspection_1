package p040c.p200q.p201a.p219b;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.y */
/* compiled from: SeekParameters */
public final class C3216y {

    /* renamed from: c */
    public static final C3216y f6048c = new C3216y(0, 0);

    /* renamed from: d */
    public static final C3216y f6049d = f6048c;

    /* renamed from: a */
    public final long f6050a;

    /* renamed from: b */
    public final long f6051b;

    static {
        new C3216y(Long.MAX_VALUE, Long.MAX_VALUE);
        new C3216y(Long.MAX_VALUE, 0);
        new C3216y(0, Long.MAX_VALUE);
    }

    public C3216y(long j, long j2) {
        boolean z = true;
        C3151e.m7753a(j >= 0);
        C3151e.m7753a(j2 < 0 ? false : z);
        this.f6050a = j;
        this.f6051b = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3216y.class != obj.getClass()) {
            return false;
        }
        C3216y yVar = (C3216y) obj;
        if (this.f6050a == yVar.f6050a && this.f6051b == yVar.f6051b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f6050a) * 31) + ((int) this.f6051b);
    }
}
