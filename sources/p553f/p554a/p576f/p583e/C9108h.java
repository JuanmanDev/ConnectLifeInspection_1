package p553f.p554a.p576f.p583e;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p040c.p200q.p353b.p360g.p361a.C6312b;
import p040c.p200q.p353b.p360g.p361a.C6313c;
import p040c.p200q.p353b.p360g.p361a.C6318g;
import p040c.p200q.p353b.p360g.p361a.C6319h;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p588g.C9167a;

/* renamed from: f.a.f.e.h */
/* compiled from: PathProviderPlugin */
public class C9108h implements C8944a, C9017j.C9021c {

    /* renamed from: e */
    public Context f17858e;

    /* renamed from: l */
    public C9017j f17859l;

    /* renamed from: m */
    public final Executor f17860m = new C9110b((C9109a) null);

    /* renamed from: n */
    public final Executor f17861n;

    /* renamed from: f.a.f.e.h$a */
    /* compiled from: PathProviderPlugin */
    public class C9109a implements C6312b<T> {

        /* renamed from: a */
        public final /* synthetic */ C9017j.C9022d f17862a;

        public C9109a(C9108h hVar, C9017j.C9022d dVar) {
            this.f17862a = dVar;
        }

        public void onFailure(Throwable th) {
            this.f17862a.error(th.getClass().getName(), th.getMessage(), (Object) null);
        }

        public void onSuccess(T t) {
            this.f17862a.success(t);
        }
    }

    public C9108h() {
        C6319h hVar = new C6319h();
        hVar.mo30388e("path-provider-background-%d");
        hVar.mo30389f(5);
        this.f17861n = Executors.newSingleThreadExecutor(hVar.mo30387b());
    }

    /* renamed from: h */
    public static /* synthetic */ void m24693h(C6318g gVar, Callable callable) {
        try {
            gVar.mo30370y(callable.call());
        } catch (Throwable th) {
            gVar.mo30371z(th);
        }
    }

    /* renamed from: a */
    public final <T> void mo46805a(Callable<T> callable, C9017j.C9022d dVar) {
        C6318g B = C6318g.m17762B();
        C6313c.m17760a(B, new C9109a(this, dVar), this.f17860m);
        this.f17861n.execute(new C9106f(B, callable));
    }

    /* renamed from: b */
    public final String mo46817n() {
        return C9167a.m24871c(this.f17858e);
    }

    /* renamed from: c */
    public final String mo46813j() {
        return C9167a.m24870b(this.f17858e);
    }

    /* renamed from: d */
    public final List<String> mo46815l() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f17858e.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f17858e.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final List<String> mo46816m(String str) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f17858e.getExternalFilesDirs(str)) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f17858e.getExternalFilesDir(str);
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final String mo46814k() {
        File externalFilesDir = this.f17858e.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: g */
    public final String mo46812i() {
        return this.f17858e.getCacheDir().getPath();
    }

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        this.f17859l = new C9017j(bVar.mo46465b(), "plugins.flutter.io/path_provider");
        this.f17858e = bVar.mo46464a();
        this.f17859l.mo46575e(this);
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        this.f17859l.mo46575e((C9017j.C9021c) null);
        this.f17859l = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r8, @androidx.annotation.NonNull p553f.p554a.p570e.p571a.C9017j.C9022d r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f17687a
            int r1 = r0.hashCode()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1832373352: goto L_0x0041;
                case -1208689078: goto L_0x0037;
                case 299667825: goto L_0x002d;
                case 1200320591: goto L_0x0023;
                case 1252916648: goto L_0x0019;
                case 1711844626: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x004b
        L_0x000f:
            java.lang.String r1 = "getTemporaryDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            goto L_0x004c
        L_0x0019:
            java.lang.String r1 = "getStorageDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = r5
            goto L_0x004c
        L_0x0023:
            java.lang.String r1 = "getApplicationDocumentsDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = r6
            goto L_0x004c
        L_0x002d:
            java.lang.String r1 = "getExternalStorageDirectories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = r3
            goto L_0x004c
        L_0x0037:
            java.lang.String r1 = "getExternalCacheDirectories"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = r4
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "getApplicationSupportDirectory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004b
            r0 = r2
            goto L_0x004c
        L_0x004b:
            r0 = -1
        L_0x004c:
            if (r0 == 0) goto L_0x0095
            if (r0 == r6) goto L_0x008c
            if (r0 == r5) goto L_0x0083
            if (r0 == r4) goto L_0x007a
            if (r0 == r3) goto L_0x0065
            if (r0 == r2) goto L_0x005c
            r9.notImplemented()
            goto L_0x009d
        L_0x005c:
            f.a.f.e.g r8 = new f.a.f.e.g
            r8.<init>(r7)
            r7.mo46805a(r8, r9)
            goto L_0x009d
        L_0x0065:
            java.lang.String r0 = "type"
            java.lang.Object r8 = r8.mo46571a(r0)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r8 = p553f.p554a.p576f.p583e.C9111i.m24707a(r8)
            f.a.f.e.c r0 = new f.a.f.e.c
            r0.<init>(r7, r8)
            r7.mo46805a(r0, r9)
            goto L_0x009d
        L_0x007a:
            f.a.f.e.a r8 = new f.a.f.e.a
            r8.<init>(r7)
            r7.mo46805a(r8, r9)
            goto L_0x009d
        L_0x0083:
            f.a.f.e.d r8 = new f.a.f.e.d
            r8.<init>(r7)
            r7.mo46805a(r8, r9)
            goto L_0x009d
        L_0x008c:
            f.a.f.e.e r8 = new f.a.f.e.e
            r8.<init>(r7)
            r7.mo46805a(r8, r9)
            goto L_0x009d
        L_0x0095:
            f.a.f.e.b r8 = new f.a.f.e.b
            r8.<init>(r7)
            r7.mo46805a(r8, r9)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p576f.p583e.C9108h.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: f.a.f.e.h$b */
    /* compiled from: PathProviderPlugin */
    public static class C9110b implements Executor {

        /* renamed from: e */
        public final Handler f17863e;

        public C9110b() {
            this.f17863e = new Handler(Looper.getMainLooper());
        }

        public void execute(Runnable runnable) {
            this.f17863e.post(runnable);
        }

        public /* synthetic */ C9110b(C9109a aVar) {
            this();
        }
    }
}
