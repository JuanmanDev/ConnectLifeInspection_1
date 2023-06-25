package p040c.p200q.p201a.p219b;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.r */
/* compiled from: PlaybackParameters */
public final class C3206r {

    /* renamed from: e */
    public static final C3206r f6028e = new C3206r(1.0f);

    /* renamed from: a */
    public final float f6029a;

    /* renamed from: b */
    public final float f6030b;

    /* renamed from: c */
    public final boolean f6031c;

    /* renamed from: d */
    public final int f6032d;

    public C3206r(float f) {
        this(f, 1.0f, false);
    }

    /* renamed from: a */
    public long mo20166a(long j) {
        return j * ((long) this.f6032d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3206r.class != obj.getClass()) {
            return false;
        }
        C3206r rVar = (C3206r) obj;
        if (this.f6029a == rVar.f6029a && this.f6030b == rVar.f6030b && this.f6031c == rVar.f6031c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f6029a)) * 31) + Float.floatToRawIntBits(this.f6030b)) * 31) + (this.f6031c ? 1 : 0);
    }

    public C3206r(float f, float f2, boolean z) {
        boolean z2 = true;
        C3151e.m7753a(f > 0.0f);
        C3151e.m7753a(f2 <= 0.0f ? false : z2);
        this.f6029a = f;
        this.f6030b = f2;
        this.f6031c = z;
        this.f6032d = Math.round(f * 1000.0f);
    }
}
