package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p081k.p084j.C1680q;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.c.d */
/* compiled from: BitmapResource */
public class C1803d implements C1685u<Bitmap>, C1680q {

    /* renamed from: e */
    public final Bitmap f1370e;

    /* renamed from: l */
    public final C1697e f1371l;

    public C1803d(@NonNull Bitmap bitmap, @NonNull C1697e eVar) {
        C1949i.m2564e(bitmap, "Bitmap must not be null");
        this.f1370e = bitmap;
        C1949i.m2564e(eVar, "BitmapPool must not be null");
        this.f1371l = eVar;
    }

    @Nullable
    /* renamed from: f */
    public static C1803d m1984f(@Nullable Bitmap bitmap, @NonNull C1697e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1803d(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo15875a() {
        this.f1370e.prepareToDraw();
    }

    @NonNull
    /* renamed from: b */
    public Bitmap get() {
        return this.f1370e;
    }

    /* renamed from: c */
    public void mo15867c() {
        this.f1371l.mo15922c(this.f1370e);
    }

    /* renamed from: d */
    public int mo15868d() {
        return C1950j.m2571g(this.f1370e);
    }

    @NonNull
    /* renamed from: e */
    public Class<Bitmap> mo15869e() {
        return Bitmap.class;
    }
}
