package p553f.p554a.p570e.p575e;

import android.content.Context;
import p553f.p554a.p570e.p571a.C9015h;

/* renamed from: f.a.e.e.f */
/* compiled from: PlatformViewFactory */
public abstract class C9056f {
    public final C9015h<Object> createArgsCodec;

    public C9056f(C9015h<Object> hVar) {
        this.createArgsCodec = hVar;
    }

    public abstract C9055e create(Context context, int i, Object obj);

    public final C9015h<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
