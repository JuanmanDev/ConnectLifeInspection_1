package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.nio.charset.Charset;

/* renamed from: c.q.a.c.g.g.g0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4435g0 extends C4408f0 {

    /* renamed from: e */
    public final byte[] f9240e;

    public C4435g0(byte[] bArr) {
        if (bArr != null) {
            this.f9240e = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: c */
    public int mo25873c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacc) || zzd() != ((zzacc) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof C4435g0)) {
            return obj.equals(this);
        }
        C4435g0 g0Var = (C4435g0) obj;
        int zzm = zzm();
        int zzm2 = g0Var.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > g0Var.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd > g0Var.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + g0Var.zzd());
        } else if (!(g0Var instanceof C4435g0)) {
            return g0Var.zzg(0, zzd).equals(zzg(0, zzd));
        } else {
            byte[] bArr = this.f9240e;
            byte[] bArr2 = g0Var.f9240e;
            g0Var.mo25873c();
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
        return this.f9240e[i];
    }

    public byte zzb(int i) {
        return this.f9240e[i];
    }

    public int zzd() {
        return this.f9240e.length;
    }

    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9240e, 0, bArr, 0, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        return C4706q1.m12867d(i, this.f9240e, 0, i3);
    }

    public final zzacc zzg(int i, int i2) {
        int zzl = zzacc.zzl(0, i2, zzd());
        if (zzl == 0) {
            return zzacc.zzb;
        }
        return new C4354d0(this.f9240e, 0, zzl);
    }

    public final C4624n0 zzh() {
        return C4624n0.m12506m(this.f9240e, 0, zzd(), true);
    }

    public final String zzi(Charset charset) {
        return new String(this.f9240e, 0, zzd(), charset);
    }

    public final void zzj(C4938z zVar) {
        zVar.mo26553a(this.f9240e, 0, zzd());
    }

    public final boolean zzk() {
        return C4385e4.m11888f(this.f9240e, 0, zzd());
    }
}
