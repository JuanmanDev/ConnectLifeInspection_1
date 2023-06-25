package p040c.p200q.p201a.p264c.p265a.p266a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.stetho.inspector.elements.android.FragmentDescriptor;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.C3322a;
import p040c.p200q.p201a.p264c.p276d.C3326c;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p288m.C3548a;
import p040c.p200q.p201a.p264c.p294g.p295a.C3606e;
import p040c.p200q.p201a.p264c.p294g.p295a.C3607f;

/* renamed from: c.q.a.c.a.a.a */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public class C3220a {
    @Nullable

    /* renamed from: a */
    public C3322a f6082a;
    @Nullable

    /* renamed from: b */
    public C3607f f6083b;

    /* renamed from: c */
    public boolean f6084c;

    /* renamed from: d */
    public final Object f6085d = new Object();
    @Nullable

    /* renamed from: e */
    public C3223c f6086e;

    /* renamed from: f */
    public final Context f6087f;

    /* renamed from: g */
    public final long f6088g;

    /* renamed from: c.q.a.c.a.a.a$a */
    /* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
    public static final class C3221a {
        @Nullable

        /* renamed from: a */
        public final String f6089a;

        /* renamed from: b */
        public final boolean f6090b;

        @Deprecated
        public C3221a(@Nullable String str, boolean z) {
            this.f6089a = str;
            this.f6090b = z;
        }

        @Nullable
        /* renamed from: a */
        public String mo20225a() {
            return this.f6089a;
        }

        /* renamed from: b */
        public boolean mo20226b() {
            return this.f6090b;
        }

        @NonNull
        public String toString() {
            String str = this.f6089a;
            boolean z = this.f6090b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public C3220a(@NonNull Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C3495o.m8908j(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f6087f = context;
        this.f6084c = false;
        this.f6088g = j;
    }

    @NonNull
    /* renamed from: a */
    public static C3221a m8278a(@NonNull Context context) {
        C3220a aVar = new C3220a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo20220d(false);
            C3221a f = aVar.mo20222f(-1);
            aVar.mo20221e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.mo20219c();
            return f;
        } catch (Throwable th) {
            aVar.mo20219c();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m8279b(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20219c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8907i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f6087f     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            c.q.a.c.d.a r0 = r3.f6082a     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            boolean r0 = r3.f6084c     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001e
            c.q.a.c.d.m.a r0 = p040c.p200q.p201a.p264c.p276d.p288m.C3548a.m9034b()     // Catch:{ all -> 0x001e }
            android.content.Context r1 = r3.f6087f     // Catch:{ all -> 0x001e }
            c.q.a.c.d.a r2 = r3.f6082a     // Catch:{ all -> 0x001e }
            r0.mo20833c(r1, r2)     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = 0
            r3.f6084c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r3.f6083b = r0     // Catch:{ all -> 0x002a }
            r3.f6082a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p265a.p266a.C3220a.mo20219c():void");
    }

    /* renamed from: d */
    public final void mo20220d(boolean z) {
        C3495o.m8907i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f6084c) {
                mo20219c();
            }
            Context context = this.f6087f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h = C3326c.m8424f().mo20389h(context, C3330e.f6210a);
                if (h != 0) {
                    if (h != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C3322a aVar = new C3322a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C3548a.m9034b().mo20832a(context, intent, aVar, 1)) {
                    this.f6082a = aVar;
                    this.f6083b = C3606e.m9149d(aVar.mo20380a(10000, TimeUnit.MILLISECONDS));
                    this.f6084c = true;
                    if (z) {
                        mo20224g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo20221e(@Nullable C3221a aVar, boolean z, float f, long j, String str, @Nullable Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo20226b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo20225a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put(FragmentDescriptor.TAG_ATTRIBUTE_NAME, "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C3222b(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0063, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005c */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p265a.p266a.C3220a.C3221a mo20222f(int r4) {
        /*
            r3 = this;
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8907i(r4)
            monitor-enter(r3)
            boolean r4 = r3.f6084c     // Catch:{ all -> 0x0064 }
            if (r4 != 0) goto L_0x003b
            java.lang.Object r4 = r3.f6085d     // Catch:{ all -> 0x0064 }
            monitor-enter(r4)     // Catch:{ all -> 0x0064 }
            c.q.a.c.a.a.c r0 = r3.f6086e     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0.f6095n     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0030
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            r4 = 0
            r3.mo20220d(r4)     // Catch:{ Exception -> 0x0027 }
            boolean r4 = r3.f6084c     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x001f
            goto L_0x003b
        L_0x001f:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "AdvertisingIdClient cannot reconnect."
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0027:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0064 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0030:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "AdvertisingIdClient is not connected."
            r0.<init>(r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x003b:
            c.q.a.c.d.a r4 = r3.f6082a     // Catch:{ all -> 0x0064 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)     // Catch:{ all -> 0x0064 }
            c.q.a.c.g.a.f r4 = r3.f6083b     // Catch:{ all -> 0x0064 }
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r4)     // Catch:{ all -> 0x0064 }
            c.q.a.c.a.a.a$a r4 = new c.q.a.c.a.a.a$a     // Catch:{ RemoteException -> 0x005c }
            c.q.a.c.g.a.f r0 = r3.f6083b     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r0 = r0.mo20877b()     // Catch:{ RemoteException -> 0x005c }
            c.q.a.c.g.a.f r1 = r3.f6083b     // Catch:{ RemoteException -> 0x005c }
            r2 = 1
            boolean r1 = r1.mo20878w(r2)     // Catch:{ RemoteException -> 0x005c }
            r4.<init>(r0, r1)     // Catch:{ RemoteException -> 0x005c }
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            r3.mo20224g()
            return r4
        L_0x005c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "Remote exception"
            r4.<init>(r0)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0064 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p265a.p266a.C3220a.mo20222f(int):c.q.a.c.a.a.a$a");
    }

    public final void finalize() {
        mo20219c();
        super.finalize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20224g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f6085d
            monitor-enter(r0)
            c.q.a.c.a.a.c r1 = r5.f6086e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f6094m     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            c.q.a.c.a.a.c r1 = r5.f6086e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r5.f6088g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            c.q.a.c.a.a.c r3 = new c.q.a.c.a.a.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0022 }
            r5.f6086e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p265a.p266a.C3220a.mo20224g():void");
    }
}
