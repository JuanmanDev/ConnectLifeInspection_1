package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;

/* renamed from: c.d.a.k.l.c.o */
/* compiled from: FitCenter */
public class C1821o extends C1804e {

    /* renamed from: b */
    public static final byte[] f1396b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C1567c.f914a);

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1396b);
    }

    /* renamed from: c */
    public Bitmap mo16074c(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        return C1830v.m2098f(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C1821o;
    }

    public int hashCode() {
        return 1572326941;
    }
}
