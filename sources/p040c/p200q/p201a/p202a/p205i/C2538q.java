package p040c.p200q.p201a.p202a.p205i;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import p040c.p200q.p201a.p202a.p205i.C2509e;

/* renamed from: c.q.a.a.i.q */
/* compiled from: TransportContext */
public abstract class C2538q {

    /* renamed from: c.q.a.a.i.q$a */
    /* compiled from: TransportContext */
    public static abstract class C2539a {
        /* renamed from: a */
        public abstract C2538q mo17948a();

        /* renamed from: b */
        public abstract C2539a mo17949b(String str);

        /* renamed from: c */
        public abstract C2539a mo17950c(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public abstract C2539a mo17951d(Priority priority);
    }

    /* renamed from: a */
    public static C2539a m4531a() {
        C2509e.C2511b bVar = new C2509e.C2511b();
        bVar.mo17951d(Priority.DEFAULT);
        return bVar;
    }

    /* renamed from: b */
    public abstract String mo17943b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo17944c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract Priority mo17945d();

    /* renamed from: e */
    public boolean mo17979e() {
        return mo17944c() != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public C2538q mo17980f(Priority priority) {
        C2539a a = m4531a();
        a.mo17949b(mo17943b());
        a.mo17951d(priority);
        a.mo17950c(mo17944c());
        return a.mo17948a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo17943b();
        objArr[1] = mo17945d();
        objArr[2] = mo17944c() == null ? "" : Base64.encodeToString(mo17944c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
