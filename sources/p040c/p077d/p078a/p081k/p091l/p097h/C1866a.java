package p040c.p077d.p078a.p081k.p091l.p097h;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p091l.p093d.C1843b;

/* renamed from: c.d.a.k.l.h.a */
/* compiled from: BitmapBytesTranscoder */
public class C1866a implements C1870e<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f1473a;

    /* renamed from: b */
    public final int f1474b;

    public C1866a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Nullable
    /* renamed from: a */
    public C1685u<byte[]> mo16189a(@NonNull C1685u<Bitmap> uVar, @NonNull C1571e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f1473a, this.f1474b, byteArrayOutputStream);
        uVar.mo15867c();
        return new C1843b(byteArrayOutputStream.toByteArray());
    }

    public C1866a(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f1473a = compressFormat;
        this.f1474b = i;
    }
}
