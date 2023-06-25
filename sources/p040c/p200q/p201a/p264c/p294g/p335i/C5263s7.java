package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import java.nio.charset.Charset;

/* renamed from: c.q.a.c.g.i.s7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C5263s7 extends C5248r7 {

    /* renamed from: e */
    public final byte[] f10136e;

    public C5263s7(byte[] bArr) {
        if (bArr != null) {
            this.f10136e = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public int mo27487c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzje) || zzd() != ((zzje) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof C5263s7)) {
            return obj.equals(this);
        }
        C5263s7 s7Var = (C5263s7) obj;
        int zzk = zzk();
        int zzk2 = s7Var.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > s7Var.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd > s7Var.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + s7Var.zzd());
        } else if (!(s7Var instanceof C5263s7)) {
            return s7Var.zzf(0, zzd).equals(zzf(0, zzd));
        } else {
            byte[] bArr = this.f10136e;
            byte[] bArr2 = s7Var.f10136e;
            s7Var.mo27487c();
            int i = 0;
            int i2 = 0;
            while (i < zzd) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        }
    }

    public byte zza(int i) {
        return this.f10136e[i];
    }

    public byte zzb(int i) {
        return this.f10136e[i];
    }

    public int zzd() {
        return this.f10136e.length;
    }

    public final int zze(int i, int i2, int i3) {
        return C5369z8.m15424d(i, this.f10136e, 0, i3);
    }

    public final zzje zzf(int i, int i2) {
        int zzj = zzje.zzj(0, i2, zzd());
        if (zzj == 0) {
            return zzje.zzb;
        }
        return new C5203o7(this.f10136e, 0, zzj);
    }

    public final String zzg(Charset charset) {
        return new String(this.f10136e, 0, zzd(), charset);
    }

    public final void zzh(C5142k7 k7Var) {
        ((C5368z7) k7Var).mo27972E(this.f10136e, 0, zzd());
    }

    public final boolean zzi() {
        return C5177mb.m14503f(this.f10136e, 0, zzd());
    }
}
