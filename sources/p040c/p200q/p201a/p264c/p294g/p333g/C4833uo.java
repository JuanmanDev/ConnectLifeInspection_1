package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3550a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3558i;

/* renamed from: c.q.a.c.g.g.uo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4833uo {

    /* renamed from: a */
    public final String f9688a;

    /* renamed from: b */
    public final String f9689b;

    public C4833uo(Context context, String str) {
        C3495o.m8908j(context);
        C3495o.m8904f(str);
        this.f9688a = str;
        try {
            byte[] a = C3550a.m9042a(context, str);
            if (a == null) {
                "single cert required: ".concat(String.valueOf(str));
                this.f9689b = null;
                return;
            }
            this.f9689b = C3558i.m9076c(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            "no pkg: ".concat(String.valueOf(str));
            this.f9689b = null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final String mo26749a() {
        return this.f9689b;
    }

    /* renamed from: b */
    public final String mo26750b() {
        return this.f9688a;
    }
}
