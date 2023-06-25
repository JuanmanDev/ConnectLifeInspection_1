package p040c.p200q.p201a.p264c.p276d;

import java.util.concurrent.Callable;

/* renamed from: c.q.a.c.d.h0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3438h0 extends C3536j0 {

    /* renamed from: e */
    public final Callable f6391e;

    public /* synthetic */ C3438h0(Callable callable, C3433g0 g0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (C3443i0) null);
        this.f6391e = callable;
    }

    /* renamed from: a */
    public final String mo20633a() {
        try {
            return (String) this.f6391e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
