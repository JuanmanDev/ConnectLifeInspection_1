package p040c.p200q.p201a.p264c.p276d;

import android.util.Log;
import androidx.annotation.NonNull;

/* renamed from: c.q.a.c.d.j0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3536j0 {

    /* renamed from: d */
    public static final C3536j0 f6529d = new C3536j0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    public final boolean f6530a;

    /* renamed from: b */
    public final String f6531b;

    /* renamed from: c */
    public final Throwable f6532c;

    public C3536j0(boolean z, int i, int i2, String str, Throwable th) {
        this.f6530a = z;
        this.f6531b = str;
        this.f6532c = th;
    }

    public /* synthetic */ C3536j0(boolean z, int i, int i2, String str, Throwable th, C3443i0 i0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    /* renamed from: b */
    public static C3536j0 m9017b() {
        return f6529d;
    }

    /* renamed from: c */
    public static C3536j0 m9018c(@NonNull String str) {
        return new C3536j0(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    public static C3536j0 m9019d(@NonNull String str, @NonNull Throwable th) {
        return new C3536j0(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static C3536j0 m9020f(int i) {
        return new C3536j0(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    public static C3536j0 m9021g(int i, int i2, @NonNull String str, Throwable th) {
        return new C3536j0(false, i, i2, str, th);
    }

    /* renamed from: a */
    public String mo20633a() {
        return this.f6531b;
    }

    /* renamed from: e */
    public final void mo20804e() {
        if (!this.f6530a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f6532c != null) {
                mo20633a();
            } else {
                mo20633a();
            }
        }
    }
}
