package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.c.t */
/* compiled from: RoundedCorners */
public final class C1827t extends C1804e {

    /* renamed from: c */
    public static final byte[] f1411c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C1567c.f914a);

    /* renamed from: b */
    public final int f1412b;

    public C1827t(int i) {
        C1949i.m2560a(i > 0, "roundingRadius must be greater than 0.");
        this.f1412b = i;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f1411c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f1412b).array());
    }

    /* renamed from: c */
    public Bitmap mo16074c(@NonNull C1697e eVar, @NonNull Bitmap bitmap, int i, int i2) {
        return C1830v.m2107o(eVar, bitmap, this.f1412b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1827t) || this.f1412b != ((C1827t) obj).f1412b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C1950j.m2577m(-569625254, C1950j.m2576l(this.f1412b));
    }
}
