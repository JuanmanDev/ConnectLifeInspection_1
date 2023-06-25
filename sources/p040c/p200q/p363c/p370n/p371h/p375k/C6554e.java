package p040c.p200q.p363c.p370n.p371h.p375k;

import androidx.annotation.Nullable;
import java.io.File;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.k.e */
/* compiled from: LogFileManager */
public class C6554e {

    /* renamed from: c */
    public static final C6556b f12364c = new C6556b();

    /* renamed from: a */
    public final C6677f f12365a;

    /* renamed from: b */
    public C6552c f12366b;

    /* renamed from: c.q.c.n.h.k.e$b */
    /* compiled from: LogFileManager */
    public static final class C6556b implements C6552c {
        public C6556b() {
        }

        /* renamed from: a */
        public void mo30827a() {
        }

        /* renamed from: b */
        public String mo30828b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo30829c() {
            return null;
        }

        /* renamed from: d */
        public void mo30830d() {
        }

        /* renamed from: e */
        public void mo30831e(long j, String str) {
        }
    }

    public C6554e(C6677f fVar) {
        this.f12365a = fVar;
        this.f12366b = f12364c;
    }

    /* renamed from: a */
    public void mo30836a() {
        this.f12366b.mo30830d();
    }

    /* renamed from: b */
    public byte[] mo30837b() {
        return this.f12366b.mo30829c();
    }

    @Nullable
    /* renamed from: c */
    public String mo30838c() {
        return this.f12366b.mo30828b();
    }

    /* renamed from: d */
    public final File mo30839d(String str) {
        return this.f12365a.mo31294o(str, "userlog");
    }

    /* renamed from: e */
    public final void mo30840e(String str) {
        this.f12366b.mo30827a();
        this.f12366b = f12364c;
        if (str != null) {
            mo30841f(mo30839d(str), 65536);
        }
    }

    /* renamed from: f */
    public void mo30841f(File file, int i) {
        this.f12366b = new C6564h(file, i);
    }

    /* renamed from: g */
    public void mo30842g(long j, String str) {
        this.f12366b.mo30831e(j, str);
    }

    public C6554e(C6677f fVar, String str) {
        this(fVar);
        mo30840e(str);
    }
}
