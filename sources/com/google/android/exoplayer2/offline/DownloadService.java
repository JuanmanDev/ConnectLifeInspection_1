package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.HashMap;
import p040c.p200q.p201a.p219b.p239i0.C2844a;
import p040c.p200q.p201a.p219b.p240j0.C2855a;
import p040c.p200q.p201a.p219b.p240j0.C2856b;
import p040c.p200q.p201a.p219b.p240j0.C2861c;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3171r;

public abstract class DownloadService extends Service {

    /* renamed from: s */
    public static final HashMap<Class<? extends DownloadService>, C4039d> f7811s = new HashMap<>();

    /* renamed from: t */
    public static final C2855a f7812t = new C2855a(1, false, false);
    @Nullable

    /* renamed from: e */
    public final C4038c f7813e;
    @Nullable

    /* renamed from: l */
    public final String f7814l;
    @StringRes

    /* renamed from: m */
    public final int f7815m;

    /* renamed from: n */
    public C2844a f7816n;

    /* renamed from: o */
    public C4037b f7817o;

    /* renamed from: p */
    public int f7818p;

    /* renamed from: q */
    public boolean f7819q;

    /* renamed from: r */
    public boolean f7820r;

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$b */
    public final class C4037b implements C2844a.C2845a {
        public C4037b(DownloadService downloadService) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$c */
    public final class C4038c implements Runnable {
        /* renamed from: a */
        public abstract void mo24193a();

        /* renamed from: b */
        public abstract void mo24194b();
    }

    /* renamed from: com.google.android.exoplayer2.offline.DownloadService$d */
    public static final class C4039d implements C2856b.C2860d {

        /* renamed from: a */
        public final Context f7821a;

        /* renamed from: b */
        public final C2855a f7822b;
        @Nullable

        /* renamed from: c */
        public final C2861c f7823c;

        /* renamed from: d */
        public final Class<? extends DownloadService> f7824d;

        /* renamed from: e */
        public final C2856b f7825e;

        /* renamed from: a */
        public void mo19049a(C2856b bVar) {
            try {
                mo24195c();
                C2861c cVar = this.f7823c;
                if (cVar != null) {
                    cVar.cancel();
                }
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public void mo19050b(C2856b bVar) {
            try {
                mo24195c();
            } catch (Exception unused) {
            }
            if (this.f7823c != null) {
                if (!this.f7823c.mo19051a(this.f7822b, this.f7821a.getPackageName(), "com.google.android.exoplayer.downloadService.action.RESTART")) {
                    C3163m.m7877c("DownloadService", "Scheduling downloads failed.");
                }
            }
        }

        /* renamed from: c */
        public final void mo24195c() {
            try {
                this.f7821a.startService(DownloadService.m10537d(this.f7821a, this.f7824d, "com.google.android.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException e) {
                throw new Exception(e);
            }
        }

        /* renamed from: d */
        public void mo24196d() {
            this.f7825e.mo19042f();
        }

        /* renamed from: e */
        public void mo24197e() {
            this.f7825e.mo19043g();
            C2861c cVar = this.f7823c;
            if (cVar != null) {
                cVar.cancel();
            }
        }

        public C4039d(Context context, C2855a aVar, @Nullable C2861c cVar, Class<? extends DownloadService> cls) {
            this.f7821a = context;
            this.f7822b = aVar;
            this.f7823c = cVar;
            this.f7824d = cls;
            this.f7825e = new C2856b(context, this, aVar);
        }
    }

    /* renamed from: d */
    public static Intent m10537d(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    /* renamed from: b */
    public abstract C2844a mo24180b();

    /* renamed from: e */
    public C2855a mo24181e() {
        return f7812t;
    }

    @Nullable
    /* renamed from: f */
    public abstract C2861c mo24182f();

    /* renamed from: g */
    public final void mo24183g(String str) {
    }

    /* renamed from: h */
    public final void mo24184h(C2855a aVar) {
        if (this.f7816n.mo18941b() != 0) {
            Class<DownloadService> cls = DownloadService.class;
            if (f7811s.get(cls) == null) {
                C4039d dVar = new C4039d(this, aVar, mo24182f(), cls);
                f7811s.put(cls, dVar);
                dVar.mo24196d();
                mo24183g("started watching requirements");
            }
        }
    }

    /* renamed from: i */
    public final void mo24185i() {
        if (this.f7816n.mo18941b() <= 0) {
            mo24187k();
        }
    }

    /* renamed from: j */
    public final void mo24186j() {
        C4038c cVar = this.f7813e;
        if (cVar != null) {
            cVar.mo24194b();
            if (this.f7819q && C3152e0.f5819a >= 26) {
                this.f7813e.mo24193a();
            }
        }
        if (C3152e0.f5819a >= 28 || !this.f7820r) {
            boolean stopSelfResult = stopSelfResult(this.f7818p);
            mo24183g("stopSelf(" + this.f7818p + ") result: " + stopSelfResult);
            return;
        }
        stopSelf();
        mo24183g("stopSelf()");
    }

    /* renamed from: k */
    public final void mo24187k() {
        C4039d remove = f7811s.remove(DownloadService.class);
        if (remove != null) {
            remove.mo24197e();
            mo24183g("stopped watching requirements");
        }
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        mo24183g("onCreate");
        String str = this.f7814l;
        if (str != null) {
            C3171r.m7913a(this, str, this.f7815m, 2);
        }
        this.f7816n = mo24180b();
        C4037b bVar = new C4037b();
        this.f7817o = bVar;
        this.f7816n.mo18940a(bVar);
    }

    public void onDestroy() {
        mo24183g("onDestroy");
        C4038c cVar = this.f7813e;
        if (cVar != null) {
            cVar.mo24194b();
        }
        this.f7816n.mo18944e(this.f7817o);
        mo24185i();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r2.equals("com.google.android.exoplayer.downloadService.action.INIT") != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            r7 = this;
            r7.f7818p = r10
            r9 = 0
            r7.f7820r = r9
            java.lang.String r0 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r1 = 1
            if (r8 == 0) goto L_0x0026
            java.lang.String r2 = r8.getAction()
            boolean r3 = r7.f7819q
            java.lang.String r4 = "foreground"
            boolean r4 = r8.getBooleanExtra(r4, r9)
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.equals(r2)
            if (r4 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r4 = r9
            goto L_0x0022
        L_0x0021:
            r4 = r1
        L_0x0022:
            r3 = r3 | r4
            r7.f7819q = r3
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r2 != 0) goto L_0x002c
            r2 = r3
        L_0x002c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onStartCommand action: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " startId: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            r7.mo24183g(r10)
            r10 = -1
            int r4 = r2.hashCode()
            r5 = 3
            r6 = 2
            switch(r4) {
                case -871181424: goto L_0x006e;
                case -608867945: goto L_0x0064;
                case -382886238: goto L_0x005a;
                case 1015676687: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0076
        L_0x0053:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0076
            goto L_0x0077
        L_0x005a:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.ADD"
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x0076
            r9 = r6
            goto L_0x0077
        L_0x0064:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.RELOAD_REQUIREMENTS"
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x0076
            r9 = r5
            goto L_0x0077
        L_0x006e:
            boolean r9 = r2.equals(r0)
            if (r9 == 0) goto L_0x0076
            r9 = r1
            goto L_0x0077
        L_0x0076:
            r9 = r10
        L_0x0077:
            if (r9 == 0) goto L_0x00b4
            if (r9 == r1) goto L_0x00b4
            java.lang.String r10 = "DownloadService"
            if (r9 == r6) goto L_0x009a
            if (r9 == r5) goto L_0x0096
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Ignoring unrecognized action: "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r10, r8)
            goto L_0x00b4
        L_0x0096:
            r7.mo24187k()
            goto L_0x00b4
        L_0x009a:
            java.lang.String r9 = "download_action"
            byte[] r8 = r8.getByteArrayExtra(r9)
            if (r8 != 0) goto L_0x00a8
            java.lang.String r8 = "Ignoring ADD action with no action data"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r10, r8)
            goto L_0x00b4
        L_0x00a8:
            c.q.a.b.i0.a r9 = r7.f7816n     // Catch:{ IOException -> 0x00ae }
            r9.mo18942c(r8)     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b4
        L_0x00ae:
            r8 = move-exception
            java.lang.String r9 = "Failed to handle ADD action"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7878d(r10, r9, r8)
        L_0x00b4:
            c.q.a.b.j0.a r8 = r7.mo24181e()
            boolean r9 = r8.mo19035e(r7)
            if (r9 == 0) goto L_0x00c4
            c.q.a.b.i0.a r9 = r7.f7816n
            r9.mo18945f()
            goto L_0x00c9
        L_0x00c4:
            c.q.a.b.i0.a r9 = r7.f7816n
            r9.mo18946g()
        L_0x00c9:
            r7.mo24184h(r8)
            c.q.a.b.i0.a r8 = r7.f7816n
            boolean r8 = r8.mo18943d()
            if (r8 == 0) goto L_0x00d7
            r7.mo24186j()
        L_0x00d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        mo24183g("onTaskRemoved rootIntent: " + intent);
        this.f7820r = true;
    }
}
