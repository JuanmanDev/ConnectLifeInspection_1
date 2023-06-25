package p553f.p554a.p589h;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import p553f.p554a.p555c.C8902c;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p553f.p554a.p570e.p571a.C9003c;
import p630io.flutter.embedding.engine.FlutterJNI;
import p630io.flutter.view.FlutterView;

/* renamed from: f.a.h.d */
/* compiled from: FlutterNativeView */
public class C9173d implements C9003c {

    /* renamed from: e */
    public final C8902c f17964e;

    /* renamed from: l */
    public final C8928a f17965l;

    /* renamed from: m */
    public FlutterView f17966m;

    /* renamed from: n */
    public final FlutterJNI f17967n;

    /* renamed from: o */
    public final Context f17968o;

    /* renamed from: p */
    public boolean f17969p;

    /* renamed from: q */
    public final C8969b f17970q;

    /* renamed from: f.a.h.d$a */
    /* compiled from: FlutterNativeView */
    public class C9174a implements C8969b {
        public C9174a() {
        }

        /* renamed from: a */
        public void mo46342a() {
        }

        /* renamed from: b */
        public void mo46343b() {
            if (C9173d.this.f17966m != null) {
                C9173d.this.f17966m.mo47678q();
            }
        }
    }

    /* renamed from: f.a.h.d$b */
    /* compiled from: FlutterNativeView */
    public final class C9175b implements C8916a.C8918b {
        public C9175b() {
        }

        /* renamed from: a */
        public void mo46387a() {
            if (C9173d.this.f17966m != null) {
                C9173d.this.f17966m.mo47644B();
            }
            if (C9173d.this.f17964e != null) {
                C9173d.this.f17964e.mo46294n();
            }
        }

        public /* synthetic */ C9175b(C9173d dVar, C9174a aVar) {
            this();
        }
    }

    public C9173d(@NonNull Context context) {
        this(context, false);
    }

    @UiThread
    /* renamed from: a */
    public void mo46433a(String str, ByteBuffer byteBuffer, C9003c.C9005b bVar) {
        if (!mo46966o()) {
            "FlutterView.send called on a detached view, channel=" + str;
            return;
        }
        this.f17965l.mo46437h().mo46433a(str, byteBuffer, bVar);
    }

    @UiThread
    /* renamed from: b */
    public void mo46434b(String str, C9003c.C9004a aVar) {
        this.f17965l.mo46437h().mo46434b(str, aVar);
    }

    @UiThread
    /* renamed from: d */
    public void mo46435d(String str, ByteBuffer byteBuffer) {
        this.f17965l.mo46437h().mo46435d(str, byteBuffer);
    }

    /* renamed from: f */
    public void mo46957f() {
        if (!mo46966o()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    /* renamed from: g */
    public final void mo46958g(C9173d dVar, boolean z) {
        this.f17967n.attachToNative(z);
        this.f17965l.mo46441l();
    }

    /* renamed from: h */
    public void mo46959h(FlutterView flutterView, Activity activity) {
        this.f17966m = flutterView;
        this.f17964e.mo46290j(flutterView, activity);
    }

    /* renamed from: i */
    public void mo46960i() {
        this.f17964e.mo46291k();
        this.f17965l.mo46442m();
        this.f17966m = null;
        this.f17967n.removeIsDisplayingFlutterUiListener(this.f17970q);
        this.f17967n.detachFromNativeAndReleaseResources();
        this.f17969p = false;
    }

    /* renamed from: j */
    public void mo46961j() {
        this.f17964e.mo46292l();
        this.f17966m = null;
    }

    @NonNull
    /* renamed from: k */
    public C8928a mo46962k() {
        return this.f17965l;
    }

    /* renamed from: l */
    public FlutterJNI mo46963l() {
        return this.f17967n;
    }

    @NonNull
    /* renamed from: m */
    public C8902c mo46964m() {
        return this.f17964e;
    }

    /* renamed from: n */
    public boolean mo46965n() {
        return this.f17969p;
    }

    /* renamed from: o */
    public boolean mo46966o() {
        return this.f17967n.isAttached();
    }

    /* renamed from: p */
    public void mo46967p(C9176e eVar) {
        if (eVar.f17974b != null) {
            mo46957f();
            if (!this.f17969p) {
                this.f17967n.runBundleAndSnapshotFromLibrary(eVar.f17973a, eVar.f17974b, eVar.f17975c, this.f17968o.getResources().getAssets());
                this.f17969p = true;
                return;
            }
            throw new AssertionError("This Flutter engine instance is already running an application");
        }
        throw new AssertionError("An entrypoint must be specified");
    }

    public C9173d(@NonNull Context context, boolean z) {
        this.f17970q = new C9174a();
        this.f17968o = context;
        this.f17964e = new C8902c(this, context);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f17967n = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(this.f17970q);
        this.f17965l = new C8928a(this.f17967n, context.getAssets());
        this.f17967n.addEngineLifecycleListener(new C9175b(this, (C9174a) null));
        mo46958g(this, z);
        mo46957f();
    }
}
