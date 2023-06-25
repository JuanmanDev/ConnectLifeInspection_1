package p040c.p200q.p363c.p367l.p368h;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;

/* renamed from: c.q.c.l.h.x */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6401x {

    /* renamed from: b */
    public static final C6401x f12079b = new C6401x();

    /* renamed from: a */
    public final C6394q f12080a;

    public C6401x() {
        C6394q a = C6394q.m17924a();
        C6389l.m17916a();
        this.f12080a = a;
    }

    /* renamed from: a */
    public static C6401x m17944a() {
        return f12079b;
    }

    /* renamed from: b */
    public final void mo30501b(Context context) {
        this.f12080a.mo30489b(context);
    }

    /* renamed from: c */
    public final void mo30502c(FirebaseAuth firebaseAuth) {
        this.f12080a.mo30490c(firebaseAuth);
    }

    /* renamed from: d */
    public final void mo30503d(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.mo24533R());
        edit.putString("statusMessage", status.mo24534S());
        edit.putLong(NotificationCompat.CarExtender.KEY_TIMESTAMP, C3556g.m9065c().mo20838a());
        edit.commit();
    }
}
