package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3484l;

/* renamed from: c.q.a.c.g.g.bo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4324bo {

    /* renamed from: a */
    public final int f9140a;

    public C4324bo(String str) {
        int i = -1;
        try {
            List d = C4303b3.m11702c("[.-]").mo25808d(str);
            if (d.size() == 1) {
                i = Integer.parseInt(str);
            } else if (d.size() >= 3) {
                i = (Integer.parseInt((String) d.get(0)) * 1000000) + (Integer.parseInt((String) d.get(1)) * 1000) + Integer.parseInt((String) d.get(2));
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e});
            }
        }
        this.f9140a = i;
    }

    /* renamed from: a */
    public static C4324bo m11745a() {
        String b = C3484l.m8883a().mo20744b("firebase-auth");
        if (TextUtils.isEmpty(b) || b.equals("UNKNOWN")) {
            b = "-1";
        }
        return new C4324bo(b);
    }

    /* renamed from: b */
    public final String mo25834b() {
        return String.format("X%s", new Object[]{Integer.toString(this.f9140a)});
    }
}
