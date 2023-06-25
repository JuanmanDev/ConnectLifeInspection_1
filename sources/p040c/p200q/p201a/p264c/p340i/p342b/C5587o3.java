package p040c.p200q.p201a.p264c.p340i.p342b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: c.q.a.c.i.b.o3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5587o3 extends C5569m9 {
    public C5587o3(C5709y9 y9Var) {
        super(y9Var);
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo28499m() {
        mo28475i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f10699a.mo28490f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
