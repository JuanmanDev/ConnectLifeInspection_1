package p040c.p200q.p201a.p264c.p275c;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p040c.p200q.p201a.p264c.p347m.C5757c;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* renamed from: c.q.a.c.c.w */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C3318w implements C5757c {

    /* renamed from: a */
    public static final /* synthetic */ C3318w f6189a = new C3318w();

    /* renamed from: a */
    public final Object mo20377a(C5771j jVar) {
        if (jVar.mo28856q()) {
            return (Bundle) jVar.mo28852m();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(jVar.mo28851l());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            sb.toString();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", jVar.mo28851l());
    }
}
