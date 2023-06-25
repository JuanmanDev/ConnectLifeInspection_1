package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p091l.p094e.C1847d;

/* renamed from: c.d.a.k.l.c.s */
/* compiled from: ResourceBitmapDecoder */
public class C1826s implements C1572f<Uri, Bitmap> {

    /* renamed from: a */
    public final C1847d f1409a;

    /* renamed from: b */
    public final C1697e f1410b;

    public C1826s(C1847d dVar, C1697e eVar) {
        this.f1409a = dVar;
        this.f1410b = eVar;
    }

    @Nullable
    /* renamed from: c */
    public C1685u<Bitmap> mo15621b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        C1685u<Drawable> c = this.f1409a.mo15621b(uri, i, i2, eVar);
        if (c == null) {
            return null;
        }
        return C1817l.m2056a(this.f1410b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo15620a(@NonNull Uri uri, @NonNull C1571e eVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
