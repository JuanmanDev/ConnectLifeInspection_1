package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1937a;

/* renamed from: c.d.a.k.l.c.f */
/* compiled from: ByteBufferBitmapDecoder */
public class C1805f implements C1572f<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final C1814k f1372a;

    public C1805f(C1814k kVar) {
        this.f1372a = kVar;
    }

    /* renamed from: c */
    public C1685u<Bitmap> mo15621b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C1571e eVar) {
        return this.f1372a.mo16096d(C1937a.m2537e(byteBuffer), i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15620a(@NonNull ByteBuffer byteBuffer, @NonNull C1571e eVar) {
        return this.f1372a.mo16100n(byteBuffer);
    }
}
