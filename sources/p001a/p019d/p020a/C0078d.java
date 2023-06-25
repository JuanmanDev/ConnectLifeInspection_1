package p001a.p019d.p020a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: a.d.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C0078d implements Executor {

    /* renamed from: e */
    public final /* synthetic */ Handler f115e;

    public /* synthetic */ C0078d(Handler handler) {
        this.f115e = handler;
    }

    public final void execute(Runnable runnable) {
        this.f115e.post(runnable);
    }
}
