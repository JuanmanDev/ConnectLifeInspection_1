package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.d0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4354d0 extends C4435g0 {

    /* renamed from: l */
    public final int f9159l;

    public C4354d0(byte[] bArr, int i, int i2) {
        super(bArr);
        zzacc.zzl(0, i2, bArr.length);
        this.f9159l = i2;
    }

    /* renamed from: c */
    public final int mo25873c() {
        return 0;
    }

    public final byte zza(int i) {
        int i2 = this.f9159l;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f9240e[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    public final byte zzb(int i) {
        return this.f9240e[i];
    }

    public final int zzd() {
        return this.f9159l;
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9240e, 0, bArr, 0, i3);
    }
}
