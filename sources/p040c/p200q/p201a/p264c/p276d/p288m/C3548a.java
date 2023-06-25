package p040c.p200q.p201a.p264c.p276d.p288m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3509s1;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.m.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3548a {

    /* renamed from: b */
    public static final Object f6536b = new Object();

    /* renamed from: c */
    public static volatile C3548a f6537c;
    @NonNull

    /* renamed from: a */
    public ConcurrentHashMap f6538a = new ConcurrentHashMap();

    @NonNull
    /* renamed from: b */
    public static C3548a m9034b() {
        if (f6537c == null) {
            synchronized (f6536b) {
                if (f6537c == null) {
                    f6537c = new C3548a();
                }
            }
        }
        C3548a aVar = f6537c;
        C3495o.m8908j(aVar);
        return aVar;
    }

    /* renamed from: e */
    public static void m9035e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m9036g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof C3509s1);
    }

    /* renamed from: h */
    public static final boolean m9037h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!C3562m.m9089j() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo20832a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return mo20835f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo20833c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!m9036g(serviceConnection) || !this.f6538a.containsKey(serviceConnection)) {
            m9035e(context, serviceConnection);
            return;
        }
        try {
            m9035e(context, (ServiceConnection) this.f6538a.get(serviceConnection));
        } finally {
            this.f6538a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo20834d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, Executor executor) {
        return mo20835f(context, str, intent, serviceConnection, i, true, executor);
    }

    /* renamed from: f */
    public final boolean mo20835f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3573c.m9110a(context).mo20845c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m9036g(serviceConnection)) {
            return m9037h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f6538a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean h = m9037h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f6538a.remove(serviceConnection, serviceConnection);
        }
    }
}
