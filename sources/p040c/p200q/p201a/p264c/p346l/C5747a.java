package p040c.p200q.p201a.p264c.p346l;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3553d;
import p040c.p200q.p201a.p264c.p276d.p289n.C3556g;
import p040c.p200q.p201a.p264c.p276d.p289n.C3564o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3566q;
import p040c.p200q.p201a.p264c.p294g.p336j.C5376b;
import p040c.p200q.p201a.p264c.p294g.p336j.C5377c;
import p040c.p200q.p201a.p264c.p294g.p336j.C5382h;

/* renamed from: c.q.a.c.l.a */
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class C5747a {

    /* renamed from: p */
    public static final long f11223p = TimeUnit.DAYS.toMillis(366);

    /* renamed from: q */
    public static volatile ScheduledExecutorService f11224q = null;

    /* renamed from: r */
    public static final Object f11225r = new Object();

    /* renamed from: s */
    public static volatile C5751e f11226s = new C5749c();

    /* renamed from: a */
    public final Object f11227a = new Object();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: b */
    public final PowerManager.WakeLock f11228b;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: c */
    public int f11229c = 0;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: d */
    public Future<?> f11230d;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: e */
    public long f11231e;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: f */
    public final Set<C5752f> f11232f = new HashSet();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: g */
    public boolean f11233g = true;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: h */
    public int f11234h;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: i */
    public C5376b f11235i;

    /* renamed from: j */
    public C3553d f11236j = C3556g.m9065c();

    /* renamed from: k */
    public WorkSource f11237k;

    /* renamed from: l */
    public final String f11238l;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: m */
    public final Map<String, C5750d> f11239m = new HashMap();

    /* renamed from: n */
    public AtomicInteger f11240n = new AtomicInteger(0);

    /* renamed from: o */
    public final ScheduledExecutorService f11241o;

    public C5747a(@NonNull Context context, int i, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        C3495o.m8909k(context, "WakeLock: context must not be null");
        C3495o.m8905g(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f11235i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f11238l = str2;
        } else {
            this.f11238l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f11228b = powerManager.newWakeLock(i, str);
        if (C3566q.m9099c(context)) {
            WorkSource b = C3566q.m9098b(context, C3564o.m9094b(packageName) ? context.getPackageName() : packageName);
            this.f11237k = b;
            if (b != null) {
                m16348i(this.f11228b, b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = f11224q;
        if (scheduledExecutorService == null) {
            synchronized (f11225r) {
                scheduledExecutorService = f11224q;
                if (scheduledExecutorService == null) {
                    C5382h.m15436a();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f11224q = scheduledExecutorService;
                }
            }
        }
        this.f11241o = scheduledExecutorService;
    }

    /* renamed from: e */
    public static /* synthetic */ void m16347e(@NonNull C5747a aVar) {
        synchronized (aVar.f11227a) {
            if (aVar.mo28819b()) {
                String.valueOf(aVar.f11238l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                aVar.mo28823g();
                if (aVar.mo28819b()) {
                    aVar.f11229c = 1;
                    aVar.mo28824h(0);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m16348i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void mo28818a(long j) {
        this.f11240n.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f11223p), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f11227a) {
            if (!mo28819b()) {
                this.f11235i = C5376b.m15435a(false, (C5377c) null);
                this.f11228b.acquire();
                this.f11236j.mo20839b();
            }
            this.f11229c++;
            this.f11234h++;
            mo28822f((String) null);
            C5750d dVar = this.f11239m.get((Object) null);
            if (dVar == null) {
                dVar = new C5750d((C5749c) null);
                this.f11239m.put((Object) null, dVar);
            }
            dVar.f11243a++;
            long b = this.f11236j.mo20839b();
            if (Long.MAX_VALUE - b > max) {
                j2 = b + max;
            }
            if (j2 > this.f11231e) {
                this.f11231e = j2;
                Future<?> future = this.f11230d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f11230d = this.f11241o.schedule(new C5748b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean mo28819b() {
        boolean z;
        synchronized (this.f11227a) {
            z = this.f11229c > 0;
        }
        return z;
    }

    /* renamed from: c */
    public void mo28820c() {
        if (this.f11240n.decrementAndGet() < 0) {
            String.valueOf(this.f11238l).concat(" release without a matched acquire!");
        }
        synchronized (this.f11227a) {
            mo28822f((String) null);
            if (this.f11239m.containsKey((Object) null)) {
                C5750d dVar = this.f11239m.get((Object) null);
                if (dVar != null) {
                    int i = dVar.f11243a - 1;
                    dVar.f11243a = i;
                    if (i == 0) {
                        this.f11239m.remove((Object) null);
                    }
                }
            } else {
                String.valueOf(this.f11238l).concat(" counter does not exist");
            }
            mo28824h(0);
        }
    }

    /* renamed from: d */
    public void mo28821d(boolean z) {
        synchronized (this.f11227a) {
            this.f11233g = z;
        }
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: f */
    public final String mo28822f(String str) {
        if (!this.f11233g || !TextUtils.isEmpty((CharSequence) null)) {
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: g */
    public final void mo28823g() {
        if (!this.f11232f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f11232f);
            this.f11232f.clear();
            if (arrayList.size() > 0) {
                C5752f fVar = (C5752f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    public final void mo28824h(int i) {
        synchronized (this.f11227a) {
            if (mo28819b()) {
                if (this.f11233g) {
                    int i2 = this.f11229c - 1;
                    this.f11229c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f11229c = 0;
                }
                mo28823g();
                for (C5750d dVar : this.f11239m.values()) {
                    dVar.f11243a = 0;
                }
                this.f11239m.clear();
                Future<?> future = this.f11230d;
                if (future != null) {
                    future.cancel(false);
                    this.f11230d = null;
                    this.f11231e = 0;
                }
                this.f11234h = 0;
                if (this.f11228b.isHeld()) {
                    try {
                        this.f11228b.release();
                        if (this.f11235i != null) {
                            this.f11235i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            String.valueOf(this.f11238l).concat(" failed to release!");
                            if (this.f11235i != null) {
                                this.f11235i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f11235i != null) {
                            this.f11235i = null;
                        }
                        throw th;
                    }
                } else {
                    String.valueOf(this.f11238l).concat(" should be held!");
                }
            }
        }
    }
}
