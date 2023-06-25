package p040c.p200q.p201a.p264c.p276d;

import java.lang.ref.WeakReference;

/* renamed from: c.q.a.c.d.a0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3323a0 extends C3583y {

    /* renamed from: m */
    public static final WeakReference f6197m = new WeakReference((Object) null);

    /* renamed from: l */
    public WeakReference f6198l = f6197m;

    public C3323a0(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: k */
    public final byte[] mo20383k() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f6198l.get();
            if (bArr == null) {
                bArr = mo20384v();
                this.f6198l = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: v */
    public abstract byte[] mo20384v();
}
