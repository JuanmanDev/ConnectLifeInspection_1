package p040c.p200q.p406e;

import androidx.test.internal.runner.RunnerArgs;

/* renamed from: c.q.e.c */
/* compiled from: LuminanceSource */
public abstract class C7017c {

    /* renamed from: a */
    public final int f13406a;

    /* renamed from: b */
    public final int f13407b;

    public C7017c(int i, int i2) {
        this.f13406a = i;
        this.f13407b = i2;
    }

    /* renamed from: a */
    public final int mo32464a() {
        return this.f13407b;
    }

    /* renamed from: b */
    public abstract byte[] mo32465b();

    /* renamed from: c */
    public abstract byte[] mo32466c(int i, byte[] bArr);

    /* renamed from: d */
    public final int mo32467d() {
        return this.f13406a;
    }

    /* renamed from: e */
    public boolean mo32468e() {
        return false;
    }

    /* renamed from: f */
    public C7017c mo32469f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.f13406a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.f13407b * (i + 1));
        for (int i2 = 0; i2 < this.f13407b; i2++) {
            bArr = mo32466c(i2, bArr);
            for (int i3 = 0; i3 < this.f13406a; i3++) {
                byte b = bArr[i3] & 255;
                sb.append(b < 64 ? RunnerArgs.METHOD_SEPARATOR : b < 128 ? '+' : b < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
