package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p294g.p335i.C5078g7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5142k7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5158l7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5173m7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5263s7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5278t7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5293u7;
import p040c.p200q.p201a.p264c.p294g.p335i.C5311va;
import p040c.p200q.p201a.p264c.p294g.p335i.C5369z8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public abstract class zzje implements Iterable, Serializable {
    public static final Comparator zza = new C5173m7();
    public static final zzje zzb = new C5263s7(C5369z8.f10298b);
    public static final C5293u7 zzd = new C5293u7((C5278t7) null);
    public int zzc = 0;

    static {
        int i = C5078g7.f9905a;
    }

    public static int zzj(int i, int i2, int i3) {
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

    public static zzje zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C5263s7(bArr2);
    }

    public static zzje zzm(String str) {
        return new C5263s7(str.getBytes(C5369z8.f10297a));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C5158l7(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? C5311va.m15129a(this) : C5311va.m15129a(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzje zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract void zzh(C5142k7 k7Var);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
