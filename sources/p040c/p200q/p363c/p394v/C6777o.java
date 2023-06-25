package p040c.p200q.p363c.p394v;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p040c.p200q.p363c.p394v.p396q.C6783c;
import p040c.p200q.p363c.p394v.p398s.C6793a;
import p040c.p200q.p363c.p394v.p398s.C6794b;

/* renamed from: c.q.c.v.o */
/* compiled from: Utils */
public final class C6777o {

    /* renamed from: b */
    public static final long f12946b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f12947c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C6777o f12948d;

    /* renamed from: a */
    public final C6793a f12949a;

    public C6777o(C6793a aVar) {
        this.f12949a = aVar;
    }

    /* renamed from: c */
    public static C6777o m19174c() {
        return m19175d(C6794b.m19280b());
    }

    /* renamed from: d */
    public static C6777o m19175d(C6793a aVar) {
        if (f12948d == null) {
            f12948d = new C6777o(aVar);
        }
        return f12948d;
    }

    /* renamed from: g */
    public static boolean m19176g(@Nullable String str) {
        return f12947c.matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m19177h(@Nullable String str) {
        return str.contains(RunnerArgs.CLASSPATH_SEPARATOR);
    }

    /* renamed from: a */
    public long mo31481a() {
        return this.f12949a.mo31560a();
    }

    /* renamed from: b */
    public long mo31482b() {
        return TimeUnit.MILLISECONDS.toSeconds(mo31481a());
    }

    /* renamed from: e */
    public long mo31483e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean mo31484f(@NonNull C6783c cVar) {
        if (!TextUtils.isEmpty(cVar.mo31486b()) && cVar.mo31493h() + cVar.mo31487c() >= mo31482b() + f12946b) {
            return false;
        }
        return true;
    }
}
