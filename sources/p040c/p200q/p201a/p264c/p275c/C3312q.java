package p040c.p200q.p201a.p264c.p275c;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzq;

/* renamed from: c.q.a.c.c.q */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3312q extends C3313r<Void> {
    public C3312q(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: a */
    public final void mo20366a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo20369d(null);
        } else {
            mo20368c(new zzq(4, "Invalid response to one way request", (Throwable) null));
        }
    }

    /* renamed from: b */
    public final boolean mo20367b() {
        return true;
    }
}
