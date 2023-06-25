package p040c.p200q.p363c.p370n.p371h;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p363c.p370n.p371h.p376l.C6595b0;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.n.h.d */
/* compiled from: CrashlyticsNativeComponentDeferredProxy */
public final class C6473d implements C6472c {

    /* renamed from: c */
    public static final C6480g f12180c = new C6475b();

    /* renamed from: a */
    public final C6755a<C6472c> f12181a;

    /* renamed from: b */
    public final AtomicReference<C6472c> f12182b = new AtomicReference<>((Object) null);

    /* renamed from: c.q.c.n.h.d$b */
    /* compiled from: CrashlyticsNativeComponentDeferredProxy */
    public static final class C6475b implements C6480g {
        public C6475b() {
        }

        /* renamed from: a */
        public File mo30630a() {
            return null;
        }

        /* renamed from: b */
        public File mo30631b() {
            return null;
        }

        /* renamed from: c */
        public File mo30632c() {
            return null;
        }

        /* renamed from: d */
        public File mo30633d() {
            return null;
        }

        /* renamed from: e */
        public File mo30634e() {
            return null;
        }

        /* renamed from: f */
        public File mo30635f() {
            return null;
        }
    }

    public C6473d(C6755a<C6472c> aVar) {
        this.f12181a = aVar;
        aVar.mo30600a(new C6470a(this));
    }

    @NonNull
    /* renamed from: a */
    public C6480g mo30625a(@NonNull String str) {
        C6472c cVar = this.f12182b.get();
        if (cVar == null) {
            return f12180c;
        }
        return cVar.mo30625a(str);
    }

    /* renamed from: b */
    public boolean mo30626b() {
        C6472c cVar = this.f12182b.get();
        return cVar != null && cVar.mo30626b();
    }

    /* renamed from: c */
    public void mo30627c(@NonNull String str, @NonNull String str2, long j, @NonNull C6595b0 b0Var) {
        C6479f f = C6479f.m18125f();
        f.mo30647i("Deferring native open session: " + str);
        this.f12181a.mo30600a(new C6471b(str, str2, j, b0Var));
    }

    /* renamed from: d */
    public boolean mo30628d(@NonNull String str) {
        C6472c cVar = this.f12182b.get();
        return cVar != null && cVar.mo30628d(str);
    }

    /* renamed from: e */
    public /* synthetic */ void mo30629e(C6757b bVar) {
        C6479f.m18125f().mo30641b("Crashlytics native component now available.");
        this.f12182b.set((C6472c) bVar.get());
    }
}
