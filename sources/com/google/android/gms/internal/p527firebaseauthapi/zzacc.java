package com.google.android.gms.internal.p527firebaseauthapi;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p294g.p333g.C4273a0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4300b0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4435g0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4489i0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4516j0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4624n0;
import p040c.p200q.p201a.p264c.p294g.p333g.C4627n3;
import p040c.p200q.p201a.p264c.p294g.p333g.C4706q1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4834v;
import p040c.p200q.p201a.p264c.p294g.p333g.C4938z;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzacc implements Iterable, Serializable {
    public static final Comparator zza = new C4300b0();
    public static final zzacc zzb = new C4435g0(C4706q1.f9577b);
    public static final C4516j0 zzd = new C4516j0((C4489i0) null);
    public int zzc = 0;

    static {
        int i = C4834v.f9690a;
    }

    public static int zzl(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static zzacc zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzacc zzo(byte[] bArr, int i, int i2) {
        zzl(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C4435g0(bArr2);
    }

    public static zzacc zzp(String str) {
        return new C4435g0(str.getBytes(C4706q1.f9576a));
    }

    public static zzacc zzq(byte[] bArr) {
        return new C4435g0(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C4273a0(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? C4627n3.m12521a(this) : C4627n3.m12521a(zzg(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzacc zzg(int i, int i2);

    public abstract C4624n0 zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(C4938z zVar);

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        return zzd() == 0 ? "" : zzi(charset);
    }

    public final boolean zzs() {
        return zzd() == 0;
    }

    public final byte[] zzt() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return C4706q1.f9577b;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
