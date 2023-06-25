package p040c.p200q.p201a.p219b.p261o0;

import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import kotlinx.coroutines.EventLoop_commonKt;

/* renamed from: c.q.a.b.o0.b0 */
/* compiled from: TimestampAdjuster */
public final class C3146b0 {

    /* renamed from: a */
    public long f5814a;

    /* renamed from: b */
    public long f5815b;

    /* renamed from: c */
    public volatile long f5816c = -9223372036854775807L;

    public C3146b0(long j) {
        mo19949h(j);
    }

    /* renamed from: f */
    public static long m7735f(long j) {
        return (j * EventLoop_commonKt.MS_TO_NS) / 90000;
    }

    /* renamed from: i */
    public static long m7736i(long j) {
        return (j * 90000) / EventLoop_commonKt.MS_TO_NS;
    }

    /* renamed from: a */
    public long mo19943a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f5816c != -9223372036854775807L) {
            this.f5816c = j;
        } else {
            long j2 = this.f5814a;
            if (j2 != Long.MAX_VALUE) {
                this.f5815b = j2 - j;
            }
            synchronized (this) {
                this.f5816c = j;
                notifyAll();
            }
        }
        return j + this.f5815b;
    }

    /* renamed from: b */
    public long mo19944b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f5816c != -9223372036854775807L) {
            long i = m7736i(this.f5816c);
            long j2 = (AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSED_BIT + i) / AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSIBLE_FLAG_BIT;
            long j3 = ((j2 - 1) * AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSIBLE_FLAG_BIT) + j;
            j += j2 * AnimatedStateListDrawableCompat.AnimatedStateListState.REVERSIBLE_FLAG_BIT;
            if (Math.abs(j3 - i) < Math.abs(j - i)) {
                j = j3;
            }
        }
        return mo19943a(m7735f(j));
    }

    /* renamed from: c */
    public long mo19945c() {
        return this.f5814a;
    }

    /* renamed from: d */
    public long mo19946d() {
        if (this.f5816c != -9223372036854775807L) {
            return this.f5815b + this.f5816c;
        }
        long j = this.f5814a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public long mo19947e() {
        if (this.f5814a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f5816c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f5815b;
    }

    /* renamed from: g */
    public void mo19948g() {
        this.f5816c = -9223372036854775807L;
    }

    /* renamed from: h */
    public synchronized void mo19949h(long j) {
        C3151e.m7759g(this.f5816c == -9223372036854775807L);
        this.f5814a = j;
    }

    /* renamed from: j */
    public synchronized void mo19950j() {
        while (this.f5816c == -9223372036854775807L) {
            wait();
        }
    }
}
