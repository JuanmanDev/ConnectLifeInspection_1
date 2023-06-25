package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;

/* renamed from: c.q.a.c.g.i.o7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5203o7 extends C5263s7 {

    /* renamed from: l */
    public final int f10039l;

    public C5203o7(byte[] bArr, int i, int i2) {
        super(bArr);
        zzje.zzj(0, i2, bArr.length);
        this.f10039l = i2;
    }

    /* renamed from: c */
    public final int mo27487c() {
        return 0;
    }

    public final byte zza(int i) {
        int i2 = this.f10039l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f10136e[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    public final byte zzb(int i) {
        return this.f10136e[i];
    }

    public final int zzd() {
        return this.f10039l;
    }
}
