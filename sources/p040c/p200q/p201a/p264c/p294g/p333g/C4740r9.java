package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: c.q.a.c.g.g.r9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4740r9 implements C4413f5 {

    /* renamed from: a */
    public final SharedPreferences.Editor f9599a;

    /* renamed from: b */
    public final String f9600b = "GenericIdpKeyset";

    public C4740r9(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f9599a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f9599a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    /* renamed from: a */
    public final void mo25973a(C4773sg sgVar) {
        if (!this.f9599a.putString(this.f9600b, C4509ik.m12176a(sgVar.mo26231i())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* renamed from: b */
    public final void mo25974b(C4453gi giVar) {
        if (!this.f9599a.putString(this.f9600b, C4509ik.m12176a(giVar.mo26231i())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
