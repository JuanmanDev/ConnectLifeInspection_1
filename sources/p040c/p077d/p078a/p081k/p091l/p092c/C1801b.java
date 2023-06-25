package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;

/* renamed from: c.d.a.k.l.c.b */
/* compiled from: BitmapDrawableEncoder */
public class C1801b implements C1573g<BitmapDrawable> {

    /* renamed from: a */
    public final C1697e f1365a;

    /* renamed from: b */
    public final C1573g<Bitmap> f1366b;

    public C1801b(C1697e eVar, C1573g<Bitmap> gVar) {
        this.f1365a = eVar;
        this.f1366b = gVar;
    }

    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo15622b(@NonNull C1571e eVar) {
        return this.f1366b.mo15622b(eVar);
    }

    /* renamed from: c */
    public boolean mo15605a(@NonNull C1685u<BitmapDrawable> uVar, @NonNull File file, @NonNull C1571e eVar) {
        return this.f1366b.mo15605a(new C1803d(uVar.get().getBitmap(), this.f1365a), file, eVar);
    }
}
