package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.t6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5277t6 implements C4981a6 {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: c */
    public static final Map f10151c = new ArrayMap();

    /* renamed from: a */
    public final SharedPreferences f10152a;

    /* renamed from: b */
    public final SharedPreferences.OnSharedPreferenceChangeListener f10153b;

    @Nullable
    /* renamed from: a */
    public static C5277t6 m14951a(Context context, String str, Runnable runnable) {
        C5277t6 t6Var;
        if (!C5246r5.m14718b()) {
            synchronized (C5277t6.class) {
                t6Var = (C5277t6) f10151c.get((Object) null);
                if (t6Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return t6Var;
        }
        throw null;
    }

    /* renamed from: b */
    public static synchronized void m14952b() {
        synchronized (C5277t6.class) {
            Iterator it = f10151c.values().iterator();
            if (!it.hasNext()) {
                f10151c.clear();
            } else {
                C5277t6 t6Var = (C5277t6) it.next();
                SharedPreferences sharedPreferences = t6Var.f10152a;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = t6Var.f10153b;
                throw null;
            }
        }
    }

    @Nullable
    /* renamed from: d */
    public final Object mo26935d(String str) {
        throw null;
    }
}
