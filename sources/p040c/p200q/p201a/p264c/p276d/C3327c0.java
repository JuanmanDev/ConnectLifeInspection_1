package p040c.p200q.p201a.p264c.p276d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3526w0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3529x0;
import p040c.p200q.p201a.p264c.p276d.p289n.C3550a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3558i;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* renamed from: c.q.a.c.d.c0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3327c0 {

    /* renamed from: a */
    public static final C3323a0 f6205a = new C3581w(C3583y.m9117g("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: b */
    public static final C3323a0 f6206b = new C3582x(C3583y.m9117g("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: c */
    public static volatile C3529x0 f6207c;

    /* renamed from: d */
    public static final Object f6208d = new Object();

    /* renamed from: e */
    public static Context f6209e;

    static {
        new C3579u(C3583y.m9117g("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new C3580v(C3583y.m9117g("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    /* renamed from: a */
    public static C3536j0 m8434a(String str, C3583y yVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m8439f(str, yVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static C3536j0 m8435b(String str, boolean z, boolean z2, boolean z3) {
        return m8440g(str, z, false, false, true);
    }

    /* renamed from: c */
    public static /* synthetic */ String m8436c(boolean z, String str, C3583y yVar) {
        String str2 = true != (!z && m8439f(str, yVar, true, false).f6530a) ? "not allowed" : "debug cert rejected";
        MessageDigest b = C3550a.m9043b("SHA-256");
        C3495o.m8908j(b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, C3558i.m9074a(b.digest(yVar.mo20383k())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    public static synchronized void m8437d(Context context) {
        synchronized (C3327c0.class) {
            if (f6209e != null) {
                return;
            }
            if (context != null) {
                f6209e = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static boolean m8438e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m8441h();
            boolean f = f6207c.mo20796f();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return f;
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    public static C3536j0 m8439f(String str, C3583y yVar, boolean z, boolean z2) {
        try {
            m8441h();
            C3495o.m8908j(f6209e);
            try {
                return f6207c.mo20797r(new zzs(str, yVar, z, z2), C3587b.m9124k(f6209e.getPackageManager())) ? C3536j0.m9017b() : new C3438h0(new C3578t(z, str, yVar), (C3433g0) null);
            } catch (RemoteException e) {
                return C3536j0.m9019d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return C3536j0.m9019d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [c.q.a.c.e.a, android.os.IBinder] */
    /* renamed from: g */
    public static C3536j0 m8440g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C3536j0 j0Var;
        zzq zzq;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C3495o.m8908j(f6209e);
            try {
                m8441h();
                zzo zzo = new zzo(str, z, false, C3587b.m9124k(f6209e), false);
                if (z4) {
                    zzq = f6207c.mo20794G(zzo);
                } else {
                    zzq = f6207c.mo20795M(zzo);
                }
                if (zzq.mo24657P()) {
                    j0Var = C3536j0.m9020f(zzq.mo24658Q());
                } else {
                    String zza = zzq.zza();
                    PackageManager.NameNotFoundException nameNotFoundException = zzq.mo24659R() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (zza == null) {
                        zza = "error checking package certificate";
                    }
                    j0Var = C3536j0.m9021g(zzq.mo24658Q(), zzq.mo24659R(), zza, nameNotFoundException);
                }
            } catch (DynamiteModule.LoadingException e) {
                j0Var = C3536j0.m9019d("module init: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (RemoteException e2) {
            j0Var = C3536j0.m9019d("module call", e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return j0Var;
    }

    /* renamed from: h */
    public static void m8441h() {
        if (f6207c == null) {
            C3495o.m8908j(f6209e);
            synchronized (f6208d) {
                if (f6207c == null) {
                    f6207c = C3526w0.m9004e(DynamiteModule.m11032d(f6209e, DynamiteModule.f8368c, "com.google.android.gms.googlecertificates").mo24664c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
