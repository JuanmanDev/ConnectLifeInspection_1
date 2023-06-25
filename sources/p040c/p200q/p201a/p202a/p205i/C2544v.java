package p040c.p200q.p201a.p202a.p205i;

import android.content.Context;
import java.io.Closeable;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;

/* renamed from: c.q.a.a.i.v */
/* compiled from: TransportRuntimeComponent */
public abstract class C2544v implements Closeable {

    /* renamed from: c.q.a.a.i.v$a */
    /* compiled from: TransportRuntimeComponent */
    public interface C2545a {
        /* renamed from: a */
        C2545a mo17958a(Context context);

        C2544v build();
    }

    /* renamed from: a */
    public abstract C2467j0 mo17955a();

    /* renamed from: b */
    public abstract C2543u mo17956b();

    public void close() {
        mo17955a().close();
    }
}
