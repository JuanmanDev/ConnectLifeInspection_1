package p040c.p200q.p201a.p219b.p261o0;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: c.q.a.b.o0.a0 */
/* compiled from: TimedValueQueue */
public final class C3144a0<V> {

    /* renamed from: a */
    public long[] f5809a;

    /* renamed from: b */
    public V[] f5810b;

    /* renamed from: c */
    public int f5811c;

    /* renamed from: d */
    public int f5812d;

    public C3144a0() {
        this(10);
    }

    /* renamed from: f */
    public static <V> V[] m7727f(int i) {
        return new Object[i];
    }

    /* renamed from: a */
    public synchronized void mo19935a(long j, V v) {
        mo19938d(j);
        mo19939e();
        mo19936b(j, v);
    }

    /* renamed from: b */
    public final void mo19936b(long j, V v) {
        int i = this.f5811c;
        int i2 = this.f5812d;
        V[] vArr = this.f5810b;
        int length = (i + i2) % vArr.length;
        this.f5809a[length] = j;
        vArr[length] = v;
        this.f5812d = i2 + 1;
    }

    /* renamed from: c */
    public synchronized void mo19937c() {
        this.f5811c = 0;
        this.f5812d = 0;
        Arrays.fill(this.f5810b, (Object) null);
    }

    /* renamed from: d */
    public final void mo19938d(long j) {
        int i = this.f5812d;
        if (i > 0) {
            if (j <= this.f5809a[((this.f5811c + i) - 1) % this.f5810b.length]) {
                mo19937c();
            }
        }
    }

    /* renamed from: e */
    public final void mo19939e() {
        int length = this.f5810b.length;
        if (this.f5812d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] f = m7727f(i);
            int i2 = this.f5811c;
            int i3 = length - i2;
            System.arraycopy(this.f5809a, i2, jArr, 0, i3);
            System.arraycopy(this.f5810b, this.f5811c, f, 0, i3);
            int i4 = this.f5811c;
            if (i4 > 0) {
                System.arraycopy(this.f5809a, 0, jArr, i3, i4);
                System.arraycopy(this.f5810b, 0, f, i3, this.f5811c);
            }
            this.f5809a = jArr;
            this.f5810b = f;
            this.f5811c = 0;
        }
    }

    @Nullable
    /* renamed from: g */
    public final V mo19940g(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (this.f5812d > 0) {
            long j3 = j - this.f5809a[this.f5811c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            V[] vArr = this.f5810b;
            int i = this.f5811c;
            v = vArr[i];
            vArr[i] = null;
            this.f5811c = (i + 1) % vArr.length;
            this.f5812d--;
            j2 = j3;
        }
        return v;
    }

    @Nullable
    /* renamed from: h */
    public synchronized V mo19941h(long j) {
        return mo19940g(j, true);
    }

    public C3144a0(int i) {
        this.f5809a = new long[i];
        this.f5810b = m7727f(i);
    }
}
