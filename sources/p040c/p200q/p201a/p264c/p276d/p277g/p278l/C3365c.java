package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;

/* renamed from: c.q.a.c.d.g.l.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3365c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: o */
    public static final C3365c f6246o = new C3365c();

    /* renamed from: e */
    public final AtomicBoolean f6247e = new AtomicBoolean();

    /* renamed from: l */
    public final AtomicBoolean f6248l = new AtomicBoolean();

    /* renamed from: m */
    public final ArrayList f6249m = new ArrayList();

    /* renamed from: n */
    public boolean f6250n = false;

    /* renamed from: c.q.a.c.d.g.l.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C3366a {
        /* renamed from: a */
        void mo20481a(boolean z);
    }

    @NonNull
    /* renamed from: b */
    public static C3365c m8512b() {
        return f6246o;
    }

    /* renamed from: d */
    public static void m8513d(@NonNull Application application) {
        synchronized (f6246o) {
            C3365c cVar = f6246o;
            if (!cVar.f6250n) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(f6246o);
                f6246o.f6250n = true;
            }
        }
    }

    /* renamed from: a */
    public void mo20467a(@NonNull C3366a aVar) {
        synchronized (f6246o) {
            this.f6249m.add(aVar);
        }
    }

    /* renamed from: e */
    public boolean mo20468e() {
        return this.f6247e.get();
    }

    @TargetApi(16)
    /* renamed from: f */
    public boolean mo20469f(boolean z) {
        if (!this.f6248l.get()) {
            if (!C3562m.m9081b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f6248l.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f6247e.set(true);
            }
        }
        return mo20468e();
    }

    /* renamed from: g */
    public final void mo20470g(boolean z) {
        synchronized (f6246o) {
            Iterator it = this.f6249m.iterator();
            while (it.hasNext()) {
                ((C3366a) it.next()).mo20481a(z);
            }
        }
    }

    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean compareAndSet = this.f6247e.compareAndSet(true, false);
        this.f6248l.set(true);
        if (compareAndSet) {
            mo20470g(false);
        }
    }

    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    public final void onActivityPaused(@NonNull Activity activity) {
    }

    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.f6247e.compareAndSet(true, false);
        this.f6248l.set(true);
        if (compareAndSet) {
            mo20470g(false);
        }
    }

    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    public final void onActivityStarted(@NonNull Activity activity) {
    }

    public final void onActivityStopped(@NonNull Activity activity) {
    }

    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f6247e.compareAndSet(false, true)) {
            this.f6248l.set(true);
            mo20470g(true);
        }
    }
}
