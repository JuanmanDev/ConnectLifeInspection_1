package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.n0.j */
/* compiled from: DataSpec */
public final class C3125j {

    /* renamed from: a */
    public final Uri f5720a;

    /* renamed from: b */
    public final int f5721b;
    @Nullable

    /* renamed from: c */
    public final byte[] f5722c;

    /* renamed from: d */
    public final long f5723d;

    /* renamed from: e */
    public final long f5724e;

    /* renamed from: f */
    public final long f5725f;
    @Nullable

    /* renamed from: g */
    public final String f5726g;

    /* renamed from: h */
    public final int f5727h;

    public C3125j(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: b */
    public static String m7645b(int i) {
        if (i == 1) {
            return ShareTarget.METHOD_GET;
        }
        if (i == 2) {
            return ShareTarget.METHOD_POST;
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    /* renamed from: a */
    public final String mo19891a() {
        return m7645b(this.f5721b);
    }

    /* renamed from: c */
    public boolean mo19892c(int i) {
        return (this.f5727h & i) == i;
    }

    /* renamed from: d */
    public C3125j mo19893d(long j) {
        long j2 = this.f5725f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo19894e(j, j3);
    }

    /* renamed from: e */
    public C3125j mo19894e(long j, long j2) {
        if (j == 0 && this.f5725f == j2) {
            return this;
        }
        return new C3125j(this.f5720a, this.f5721b, this.f5722c, this.f5723d + j, this.f5724e + j, j2, this.f5726g, this.f5727h);
    }

    public String toString() {
        return "DataSpec[" + mo19891a() + " " + this.f5720a + ", " + Arrays.toString(this.f5722c) + ", " + this.f5723d + ", " + this.f5724e + ", " + this.f5725f + ", " + this.f5726g + ", " + this.f5727h + "]";
    }

    public C3125j(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C3125j(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C3125j(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3125j(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    public C3125j(Uri uri, int i, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i2) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C3151e.m7753a(j4 >= 0);
        C3151e.m7753a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C3151e.m7753a(z);
        this.f5720a = uri;
        this.f5721b = i;
        this.f5722c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f5723d = j4;
        this.f5724e = j5;
        this.f5725f = j6;
        this.f5726g = str;
        this.f5727h = i2;
    }
}
