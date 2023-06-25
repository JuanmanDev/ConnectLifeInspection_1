package p040c.p200q.p201a.p219b.p241k0.p242b0;

import android.net.Uri;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.b0.a */
/* compiled from: AdPlaybackState */
public final class C2866a {

    /* renamed from: f */
    public static final C2866a f4533f = new C2866a(new long[0]);

    /* renamed from: a */
    public final int f4534a;

    /* renamed from: b */
    public final long[] f4535b;

    /* renamed from: c */
    public final C2867a[] f4536c;

    /* renamed from: d */
    public final long f4537d;

    /* renamed from: e */
    public final long f4538e;

    /* renamed from: c.q.a.b.k0.b0.a$a */
    /* compiled from: AdPlaybackState */
    public static final class C2867a {

        /* renamed from: a */
        public final int f4539a;

        /* renamed from: b */
        public final Uri[] f4540b;

        /* renamed from: c */
        public final int[] f4541c;

        /* renamed from: d */
        public final long[] f4542d;

        public C2867a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int mo19060a() {
            return mo19061b(-1);
        }

        /* renamed from: b */
        public int mo19061b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f4541c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        /* renamed from: c */
        public boolean mo19062c() {
            return this.f4539a == -1 || mo19060a() < this.f4539a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2867a.class != obj.getClass()) {
                return false;
            }
            C2867a aVar = (C2867a) obj;
            if (this.f4539a != aVar.f4539a || !Arrays.equals(this.f4540b, aVar.f4540b) || !Arrays.equals(this.f4541c, aVar.f4541c) || !Arrays.equals(this.f4542d, aVar.f4542d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.f4539a * 31) + Arrays.hashCode(this.f4540b)) * 31) + Arrays.hashCode(this.f4541c)) * 31) + Arrays.hashCode(this.f4542d);
        }

        public C2867a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C3151e.m7753a(iArr.length == uriArr.length);
            this.f4539a = i;
            this.f4541c = iArr;
            this.f4540b = uriArr;
            this.f4542d = jArr;
        }
    }

    public C2866a(long... jArr) {
        int length = jArr.length;
        this.f4534a = length;
        this.f4535b = Arrays.copyOf(jArr, length);
        this.f4536c = new C2867a[length];
        for (int i = 0; i < length; i++) {
            this.f4536c[i] = new C2867a();
        }
        this.f4537d = 0;
        this.f4538e = -9223372036854775807L;
    }

    /* renamed from: a */
    public int mo19055a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.f4535b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.f4536c[i].mo19062c())) {
                i++;
            }
        }
        if (i < this.f4535b.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public int mo19056b(long j) {
        int length = this.f4535b.length - 1;
        while (length >= 0 && mo19057c(j, length)) {
            length--;
        }
        if (length < 0 || !this.f4536c[length].mo19062c()) {
            return -1;
        }
        return length;
    }

    /* renamed from: c */
    public final boolean mo19057c(long j, int i) {
        long j2 = this.f4535b[i];
        if (j2 == Long.MIN_VALUE) {
            long j3 = this.f4538e;
            if (j3 == -9223372036854775807L || j < j3) {
                return true;
            }
            return false;
        } else if (j < j2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2866a.class != obj.getClass()) {
            return false;
        }
        C2866a aVar = (C2866a) obj;
        if (this.f4534a == aVar.f4534a && this.f4537d == aVar.f4537d && this.f4538e == aVar.f4538e && Arrays.equals(this.f4535b, aVar.f4535b) && Arrays.equals(this.f4536c, aVar.f4536c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f4534a * 31) + ((int) this.f4537d)) * 31) + ((int) this.f4538e)) * 31) + Arrays.hashCode(this.f4535b)) * 31) + Arrays.hashCode(this.f4536c);
    }
}
