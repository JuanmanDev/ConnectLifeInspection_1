package p553f.p554a.p556d.p558b;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;
import p553f.p554a.C8893a;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p556d.p558b.p560f.C8938c;
import p553f.p554a.p556d.p558b.p561g.C8947b;
import p553f.p554a.p556d.p558b.p561g.p562c.C8949b;
import p553f.p554a.p556d.p558b.p568h.C8964a;
import p553f.p554a.p556d.p558b.p569i.C8972b;
import p553f.p554a.p556d.p558b.p569i.C8975c;
import p553f.p554a.p556d.p558b.p569i.C8978d;
import p553f.p554a.p556d.p558b.p569i.C8979e;
import p553f.p554a.p556d.p558b.p569i.C8980f;
import p553f.p554a.p556d.p558b.p569i.C8983g;
import p553f.p554a.p556d.p558b.p569i.C8991i;
import p553f.p554a.p556d.p558b.p569i.C8994j;
import p553f.p554a.p570e.p573c.C9044a;
import p553f.p554a.p570e.p575e.C9060j;
import p630io.flutter.embedding.engine.FlutterJNI;
import p630io.flutter.embedding.engine.systemchannels.PlatformChannel;
import p630io.flutter.embedding.engine.systemchannels.SettingsChannel;
import p630io.flutter.embedding.engine.systemchannels.TextInputChannel;

/* renamed from: f.a.d.b.a */
/* compiled from: FlutterEngine */
public class C8916a {
    @NonNull

    /* renamed from: a */
    public final FlutterJNI f17465a;
    @NonNull

    /* renamed from: b */
    public final C8964a f17466b;
    @NonNull

    /* renamed from: c */
    public final C8928a f17467c;
    @NonNull

    /* renamed from: d */
    public final C8920c f17468d;
    @NonNull

    /* renamed from: e */
    public final C9044a f17469e;
    @NonNull

    /* renamed from: f */
    public final C8972b f17470f;
    @NonNull

    /* renamed from: g */
    public final C8975c f17471g;
    @NonNull

    /* renamed from: h */
    public final C8978d f17472h;
    @NonNull

    /* renamed from: i */
    public final C8979e f17473i;
    @NonNull

    /* renamed from: j */
    public final C8980f f17474j;
    @NonNull

    /* renamed from: k */
    public final C8983g f17475k;
    @NonNull

    /* renamed from: l */
    public final C8991i f17476l;
    @NonNull

    /* renamed from: m */
    public final PlatformChannel f17477m;
    @NonNull

    /* renamed from: n */
    public final SettingsChannel f17478n;
    @NonNull

    /* renamed from: o */
    public final C8994j f17479o;
    @NonNull

    /* renamed from: p */
    public final TextInputChannel f17480p;
    @NonNull

    /* renamed from: q */
    public final C9060j f17481q;
    @NonNull

    /* renamed from: r */
    public final Set<C8918b> f17482r;
    @NonNull

    /* renamed from: s */
    public final C8918b f17483s;

    /* renamed from: f.a.d.b.a$a */
    /* compiled from: FlutterEngine */
    public class C8917a implements C8918b {
        public C8917a() {
        }

        /* renamed from: a */
        public void mo46387a() {
            C8896b.m24032d("FlutterEngine", "onPreEngineRestart()");
            for (C8918b a : C8916a.this.f17482r) {
                a.mo46387a();
            }
            C8916a.this.f17481q.mo46704R();
            C8916a.this.f17476l.mo46547g();
        }
    }

    /* renamed from: f.a.d.b.a$b */
    /* compiled from: FlutterEngine */
    public interface C8918b {
        /* renamed from: a */
        void mo46387a();
    }

    public C8916a(@NonNull Context context, @Nullable String[] strArr, boolean z, boolean z2) {
        this(context, (C8938c) null, new FlutterJNI(), new C9060j(), strArr, z, z2);
    }

    /* renamed from: d */
    public final void mo46367d() {
        C8896b.m24032d("FlutterEngine", "Attaching to JNI.");
        this.f17465a.attachToNative(false);
        if (!mo46385v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    /* renamed from: e */
    public void mo46368e() {
        C8896b.m24032d("FlutterEngine", "Destroying.");
        this.f17468d.mo46398h();
        this.f17481q.mo46700N();
        this.f17467c.mo46442m();
        this.f17465a.removeEngineLifecycleListener(this.f17483s);
        this.f17465a.detachFromNativeAndReleaseResources();
    }

    @NonNull
    /* renamed from: f */
    public C8972b mo46369f() {
        return this.f17470f;
    }

    @NonNull
    /* renamed from: g */
    public C8949b mo46370g() {
        return this.f17468d;
    }

    @NonNull
    /* renamed from: h */
    public C8928a mo46371h() {
        return this.f17467c;
    }

    @NonNull
    /* renamed from: i */
    public C8975c mo46372i() {
        return this.f17471g;
    }

    @NonNull
    /* renamed from: j */
    public C8978d mo46373j() {
        return this.f17472h;
    }

    @NonNull
    /* renamed from: k */
    public C9044a mo46374k() {
        return this.f17469e;
    }

    @NonNull
    /* renamed from: l */
    public C8980f mo46375l() {
        return this.f17474j;
    }

    @NonNull
    /* renamed from: m */
    public C8983g mo46376m() {
        return this.f17475k;
    }

    @NonNull
    /* renamed from: n */
    public PlatformChannel mo46377n() {
        return this.f17477m;
    }

    @NonNull
    /* renamed from: o */
    public C9060j mo46378o() {
        return this.f17481q;
    }

    @NonNull
    /* renamed from: p */
    public C8947b mo46379p() {
        return this.f17468d;
    }

    @NonNull
    /* renamed from: q */
    public C8964a mo46380q() {
        return this.f17466b;
    }

    @NonNull
    /* renamed from: r */
    public C8991i mo46381r() {
        return this.f17476l;
    }

    @NonNull
    /* renamed from: s */
    public SettingsChannel mo46382s() {
        return this.f17478n;
    }

    @NonNull
    /* renamed from: t */
    public C8994j mo46383t() {
        return this.f17479o;
    }

    @NonNull
    /* renamed from: u */
    public TextInputChannel mo46384u() {
        return this.f17480p;
    }

    /* renamed from: v */
    public final boolean mo46385v() {
        return this.f17465a.isAttached();
    }

    /* renamed from: w */
    public final void mo46386w() {
        try {
            Class.forName("io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", new Class[]{C8916a.class}).invoke((Object) null, new Object[]{this});
        } catch (Exception unused) {
            C8896b.m24033e("FlutterEngine", "Tried to automatically register plugins with FlutterEngine (" + this + ") but could not find and invoke the GeneratedPluginRegistrant.");
        }
    }

    public C8916a(@NonNull Context context, @Nullable C8938c cVar, @NonNull FlutterJNI flutterJNI, @NonNull C9060j jVar, @Nullable String[] strArr, boolean z, boolean z2) {
        this.f17482r = new HashSet();
        this.f17483s = new C8917a();
        C8928a aVar = new C8928a(flutterJNI, context.getAssets());
        this.f17467c = aVar;
        aVar.mo46441l();
        this.f17470f = new C8972b(this.f17467c, flutterJNI);
        this.f17471g = new C8975c(this.f17467c);
        this.f17472h = new C8978d(this.f17467c);
        this.f17473i = new C8979e(this.f17467c);
        this.f17474j = new C8980f(this.f17467c);
        this.f17475k = new C8983g(this.f17467c);
        this.f17477m = new PlatformChannel(this.f17467c);
        this.f17476l = new C8991i(this.f17467c, z2);
        this.f17478n = new SettingsChannel(this.f17467c);
        this.f17479o = new C8994j(this.f17467c);
        this.f17480p = new TextInputChannel(this.f17467c);
        this.f17469e = new C9044a(context, this.f17473i);
        this.f17465a = flutterJNI;
        cVar = cVar == null ? C8893a.m24024b().mo46256a() : cVar;
        cVar.mo46457i(context.getApplicationContext());
        cVar.mo46451b(context, strArr);
        flutterJNI.addEngineLifecycleListener(this.f17483s);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setLocalizationPlugin(this.f17469e);
        mo46367d();
        this.f17466b = new C8964a(flutterJNI);
        this.f17481q = jVar;
        jVar.mo46698L();
        this.f17468d = new C8920c(context.getApplicationContext(), this, cVar);
        if (z) {
            mo46386w();
        }
    }
}
