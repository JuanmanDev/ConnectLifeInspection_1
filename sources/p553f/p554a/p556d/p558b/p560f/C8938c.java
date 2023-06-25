package p553f.p554a.p556d.p558b.p560f;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p553f.p554a.C8893a;
import p553f.p554a.p588g.C9167a;
import p553f.p554a.p589h.C9179g;
import p630io.flutter.embedding.engine.FlutterJNI;

/* renamed from: f.a.d.b.f.c */
/* compiled from: FlutterLoader */
public class C8938c {

    /* renamed from: f */
    public static C8938c f17540f;

    /* renamed from: a */
    public boolean f17541a = false;
    @Nullable

    /* renamed from: b */
    public C8942c f17542b;

    /* renamed from: c */
    public long f17543c;

    /* renamed from: d */
    public C8937b f17544d;
    @Nullable

    /* renamed from: e */
    public Future<C8941b> f17545e;

    /* renamed from: f.a.d.b.f.c$a */
    /* compiled from: FlutterLoader */
    public class C8939a implements Callable<C8941b> {

        /* renamed from: e */
        public final /* synthetic */ Context f17546e;

        /* renamed from: f.a.d.b.f.c$a$a */
        /* compiled from: FlutterLoader */
        public class C8940a implements Runnable {
            public C8940a() {
            }

            public void run() {
                FlutterJNI.nativePrefetchDefaultFontManager();
            }
        }

        public C8939a(Context context) {
            this.f17546e = context;
        }

        /* renamed from: a */
        public C8941b call() {
            C8943d a = C8938c.this.mo46456h(this.f17546e);
            if (C8893a.m24024b().mo46257c()) {
                System.loadLibrary("flutter");
            }
            Executors.newSingleThreadExecutor().execute(new C8940a());
            if (a != null) {
                a.mo46463a();
            }
            return new C8941b(C9167a.m24871c(this.f17546e), C9167a.m24869a(this.f17546e), C9167a.m24870b(this.f17546e), (C8939a) null);
        }
    }

    /* renamed from: f.a.d.b.f.c$b */
    /* compiled from: FlutterLoader */
    public static class C8941b {

        /* renamed from: a */
        public final String f17549a;

        /* renamed from: b */
        public final String f17550b;

        public /* synthetic */ C8941b(String str, String str2, String str3, C8939a aVar) {
            this(str, str2, str3);
        }

        public C8941b(String str, String str2, String str3) {
            this.f17549a = str;
            this.f17550b = str2;
        }
    }

    /* renamed from: f.a.d.b.f.c$c */
    /* compiled from: FlutterLoader */
    public static class C8942c {

        /* renamed from: a */
        public String f17551a;

        @Nullable
        /* renamed from: a */
        public String mo46462a() {
            return this.f17551a;
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: e */
    public static C8938c m24226e() {
        if (f17540f == null) {
            f17540f = new C8938c();
        }
        return f17540f;
    }

    /* renamed from: b */
    public void mo46451b(@NonNull Context context, @Nullable String[] strArr) {
        if (!this.f17541a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.f17542b != null) {
                try {
                    C8941b bVar = this.f17545e.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    arrayList.add("--icu-native-lib-path=" + this.f17544d.f17538d + File.separator + "libflutter.so");
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=" + this.f17544d.f17535a);
                    arrayList.add("--aot-shared-library-name=" + this.f17544d.f17538d + File.separator + this.f17544d.f17535a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("--cache-dir-path=");
                    sb.append(bVar.f17550b);
                    arrayList.add(sb.toString());
                    if (!this.f17544d.f17539e) {
                        arrayList.add("--disallow-insecure-connections");
                    }
                    if (this.f17544d.f17537c != null) {
                        arrayList.add("--domain-network-policy=" + this.f17544d.f17537c);
                    }
                    if (this.f17542b.mo46462a() != null) {
                        arrayList.add("--log-tag=" + this.f17542b.mo46462a());
                    }
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f17543c;
                    if (C8893a.m24024b().mo46257c()) {
                        FlutterJNI.nativeInit(context, (String[]) arrayList.toArray(new String[0]), (String) null, bVar.f17549a, bVar.f17550b, uptimeMillis);
                    }
                    this.f17541a = true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public String mo46452c() {
        return this.f17544d.f17536b;
    }

    @NonNull
    /* renamed from: d */
    public final String mo46453d(@NonNull String str) {
        return this.f17544d.f17536b + File.separator + str;
    }

    @NonNull
    /* renamed from: f */
    public String mo46454f(@NonNull String str) {
        return mo46453d(str);
    }

    @NonNull
    /* renamed from: g */
    public String mo46455g(@NonNull String str, @NonNull String str2) {
        return mo46454f("packages" + File.separator + str2 + File.separator + str);
    }

    /* renamed from: h */
    public final C8943d mo46456h(@NonNull Context context) {
        return null;
    }

    /* renamed from: i */
    public void mo46457i(@NonNull Context context) {
        mo46458j(context, new C8942c());
    }

    /* renamed from: j */
    public void mo46458j(@NonNull Context context, @NonNull C8942c cVar) {
        if (this.f17542b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Context applicationContext = context.getApplicationContext();
                this.f17542b = cVar;
                this.f17543c = SystemClock.uptimeMillis();
                this.f17544d = C8936a.m24221d(applicationContext);
                C9179g.m24900b((WindowManager) applicationContext.getSystemService("window")).mo46968c();
                this.f17545e = Executors.newSingleThreadExecutor().submit(new C8939a(applicationContext));
                return;
            }
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
    }
}
