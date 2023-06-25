package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.l.c.w */
/* compiled from: UnitBitmapDecoder */
public final class C1832w implements C1572f<Bitmap, Bitmap> {

    /* renamed from: c.d.a.k.l.c.w$a */
    /* compiled from: UnitBitmapDecoder */
    public static final class C1833a implements C1685u<Bitmap> {

        /* renamed from: e */
        public final Bitmap f1422e;

        public C1833a(@NonNull Bitmap bitmap) {
            this.f1422e = bitmap;
        }

        @NonNull
        /* renamed from: a */
        public Bitmap get() {
            return this.f1422e;
        }

        /* renamed from: c */
        public void mo15867c() {
        }

        /* renamed from: d */
        public int mo15868d() {
            return C1950j.m2571g(this.f1422e);
        }

        @NonNull
        /* renamed from: e */
        public Class<Bitmap> mo15869e() {
            return Bitmap.class;
        }
    }

    /* renamed from: c */
    public C1685u<Bitmap> mo15621b(@NonNull Bitmap bitmap, int i, int i2, @NonNull C1571e eVar) {
        return new C1833a(bitmap);
    }

    /* renamed from: d */
    public boolean mo15620a(@NonNull Bitmap bitmap, @NonNull C1571e eVar) {
        return true;
    }
}
