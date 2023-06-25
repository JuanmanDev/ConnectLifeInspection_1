package p040c.p200q.p363c.p400x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import java.util.concurrent.Executor;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;

/* renamed from: c.q.c.x.g0 */
/* compiled from: FcmBroadcastProcessor */
public class C6829g0 {

    /* renamed from: c */
    public static final Object f13072c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    public static C6815d1 f13073d;

    /* renamed from: a */
    public final Context f13074a;

    /* renamed from: b */
    public final Executor f13075b = C6867y.f13147e;

    public C6829g0(Context context) {
        this.f13074a = context;
    }

    /* renamed from: a */
    public static C5771j<Integer> m19364a(Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        if (C6856t0.m19479b().mo31678e(context)) {
            C6806b1.m19310e(context, m19365b(context, "com.google.firebase.MESSAGING_EVENT"), intent);
        } else {
            m19365b(context, "com.google.firebase.MESSAGING_EVENT").mo31587c(intent);
        }
        return C5777m.m16414f(-1);
    }

    /* renamed from: b */
    public static C6815d1 m19365b(Context context, String str) {
        C6815d1 d1Var;
        synchronized (f13072c) {
            if (f13073d == null) {
                f13073d = new C6815d1(context, str);
            }
            d1Var = f13073d;
        }
        return d1Var;
    }

    /* renamed from: d */
    public static /* synthetic */ Integer m19367d(C5771j jVar) {
        return 403;
    }

    /* renamed from: e */
    public static /* synthetic */ C5771j m19368e(Context context, Intent intent, C5771j jVar) {
        return (!C3562m.m9087h() || ((Integer) jVar.mo28852m()).intValue() != 402) ? jVar : m19364a(context, intent).mo28849j(C6867y.f13147e, C6807c.f13039a);
    }

    /* renamed from: f */
    public C5771j<Integer> mo31609f(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return mo31610g(this.f13074a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: g */
    public C5771j<Integer> mo31610g(Context context, Intent intent) {
        boolean z = true;
        boolean z2 = C3562m.m9087h() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) == 0) {
            z = false;
        }
        if (!z2 || z) {
            return C5777m.m16412d(this.f13075b, new C6817e(context, intent)).mo28850k(this.f13075b, new C6812d(context, intent));
        }
        return m19364a(context, intent);
    }
}
