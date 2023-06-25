package p001a.p007c.p009b;

import androidx.core.content.UnusedAppRestrictionsBackportServiceConnection;

/* renamed from: a.c.b.v */
/* compiled from: lambda */
public final /* synthetic */ class C0028v implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ UnusedAppRestrictionsBackportServiceConnection f31e;

    public /* synthetic */ C0028v(UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection) {
        this.f31e = unusedAppRestrictionsBackportServiceConnection;
    }

    public final void run() {
        this.f31e.disconnectFromService();
    }
}
