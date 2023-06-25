package p040c.p200q.p201a.p264c.p275c;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzq;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.c.r */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public abstract class C3313r<T> {

    /* renamed from: a */
    public final int f6175a;

    /* renamed from: b */
    public final C5773k<T> f6176b = new C5773k<>();

    /* renamed from: c */
    public final int f6177c;

    /* renamed from: d */
    public final Bundle f6178d;

    public C3313r(int i, int i2, Bundle bundle) {
        this.f6175a = i;
        this.f6177c = i2;
        this.f6178d = bundle;
    }

    /* renamed from: a */
    public abstract void mo20366a(Bundle bundle);

    /* renamed from: b */
    public abstract boolean mo20367b();

    /* renamed from: c */
    public final void mo20368c(zzq zzq) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f6176b.mo28860b(zzq);
    }

    /* renamed from: d */
    public final void mo20369d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            sb.toString();
        }
        this.f6176b.mo28861c(t);
    }

    public final String toString() {
        int i = this.f6177c;
        int i2 = this.f6175a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(mo20367b());
        sb.append("}");
        return sb.toString();
    }
}
