package p040c.p200q.p363c.p370n;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p372h.C6481a;
import p040c.p200q.p363c.p370n.p371h.p372h.C6483c;
import p040c.p200q.p363c.p370n.p371h.p372h.C6484d;
import p040c.p200q.p363c.p370n.p371h.p372h.C6485e;
import p040c.p200q.p363c.p370n.p371h.p372h.C6486f;
import p040c.p200q.p363c.p370n.p371h.p373i.C6487a;
import p040c.p200q.p363c.p370n.p371h.p373i.C6488b;
import p040c.p200q.p363c.p370n.p371h.p373i.C6489c;
import p040c.p200q.p363c.p393u.C6755a;
import p040c.p200q.p363c.p393u.C6757b;

/* renamed from: c.q.c.n.e */
/* compiled from: AnalyticsDeferredProxy */
public class C6465e {

    /* renamed from: a */
    public final C6755a<C6341a> f12165a;

    /* renamed from: b */
    public volatile C6481a f12166b;

    /* renamed from: c */
    public volatile C6488b f12167c;
    @GuardedBy("this")

    /* renamed from: d */
    public final List<C6487a> f12168d;

    public C6465e(C6755a<C6341a> aVar) {
        this(aVar, new C6489c(), new C6486f());
    }

    /* renamed from: g */
    public static C6341a.C6342a m18073g(@NonNull C6341a aVar, @NonNull C6466f fVar) {
        C6341a.C6342a c = aVar.mo30439c("clx", fVar);
        if (c == null) {
            C6479f.m18125f().mo30641b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            c = aVar.mo30439c(CrashDumperPlugin.NAME, fVar);
            if (c != null) {
                C6479f.m18125f().mo30649k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return c;
    }

    /* renamed from: a */
    public C6481a mo30604a() {
        return new C6461a(this);
    }

    /* renamed from: b */
    public C6488b mo30605b() {
        return new C6462b(this);
    }

    /* renamed from: c */
    public final void mo30606c() {
        this.f12165a.mo30600a(new C6463c(this));
    }

    /* renamed from: d */
    public /* synthetic */ void mo30607d(String str, Bundle bundle) {
        this.f12166b.mo30602a(str, bundle);
    }

    /* renamed from: e */
    public /* synthetic */ void mo30608e(C6487a aVar) {
        synchronized (this) {
            if (this.f12167c instanceof C6489c) {
                this.f12168d.add(aVar);
            }
            this.f12167c.mo30603a(aVar);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void mo30609f(C6757b bVar) {
        C6479f.m18125f().mo30641b("AnalyticsConnector now available.");
        C6341a aVar = (C6341a) bVar.get();
        C6485e eVar = new C6485e(aVar);
        C6466f fVar = new C6466f();
        if (m18073g(aVar, fVar) != null) {
            C6479f.m18125f().mo30641b("Registered Firebase Analytics listener.");
            C6484d dVar = new C6484d();
            C6483c cVar = new C6483c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C6487a a : this.f12168d) {
                    dVar.mo30603a(a);
                }
                fVar.mo30611d(dVar);
                fVar.mo30612e(cVar);
                this.f12167c = dVar;
                this.f12166b = cVar;
            }
            return;
        }
        C6479f.m18125f().mo30649k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public C6465e(C6755a<C6341a> aVar, @NonNull C6488b bVar, @NonNull C6481a aVar2) {
        this.f12165a = aVar;
        this.f12167c = bVar;
        this.f12168d = new ArrayList();
        this.f12166b = aVar2;
        mo30606c();
    }
}
