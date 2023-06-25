package p040c.p077d.p078a.p098l;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import p040c.p077d.p078a.p098l.C1876c;

/* renamed from: c.d.a.l.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C1881f implements C1878d {
    @NonNull
    /* renamed from: a */
    public C1876c mo16199a(@NonNull Context context, @NonNull C1876c.C1877a aVar) {
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        boolean isLoggable = Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new C1879e(context, aVar) : new C1885j();
    }
}
