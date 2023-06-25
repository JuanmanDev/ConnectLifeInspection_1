package p040c.p077d.p078a.p081k.p091l.p092c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.c.a */
/* compiled from: BitmapDrawableDecoder */
public class C1800a<DataType> implements C1572f<DataType, BitmapDrawable> {

    /* renamed from: a */
    public final C1572f<DataType, Bitmap> f1363a;

    /* renamed from: b */
    public final Resources f1364b;

    public C1800a(@NonNull Resources resources, @NonNull C1572f<DataType, Bitmap> fVar) {
        C1949i.m2563d(resources);
        this.f1364b = resources;
        C1949i.m2563d(fVar);
        this.f1363a = fVar;
    }

    /* renamed from: a */
    public boolean mo15620a(@NonNull DataType datatype, @NonNull C1571e eVar) {
        return this.f1363a.mo15620a(datatype, eVar);
    }

    /* renamed from: b */
    public C1685u<BitmapDrawable> mo15621b(@NonNull DataType datatype, int i, int i2, @NonNull C1571e eVar) {
        return C1823q.m2071f(this.f1364b, this.f1363a.mo15621b(datatype, i, i2, eVar));
    }
}
