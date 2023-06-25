package p040c.p077d.p078a.p081k.p091l.p096g;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p105q.C1937a;

/* renamed from: c.d.a.k.l.g.c */
/* compiled from: GifDrawableEncoder */
public class C1855c implements C1573g<GifDrawable> {
    @NonNull
    /* renamed from: b */
    public EncodeStrategy mo15622b(@NonNull C1571e eVar) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: c */
    public boolean mo15605a(@NonNull C1685u<GifDrawable> uVar, @NonNull File file, @NonNull C1571e eVar) {
        try {
            C1937a.m2536d(uVar.get().mo21677c(), file);
            return true;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
