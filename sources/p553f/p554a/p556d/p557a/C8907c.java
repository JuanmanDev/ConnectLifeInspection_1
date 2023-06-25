package p553f.p554a.p556d.p557a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import p553f.p554a.C8893a;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.C8919b;
import p553f.p554a.p556d.p558b.C8927d;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p556d.p558b.p568h.C8969b;
import p553f.p554a.p570e.p575e.C9052d;
import p630io.flutter.embedding.android.FlutterSplashView;
import p630io.flutter.embedding.android.FlutterSurfaceView;
import p630io.flutter.embedding.android.FlutterTextureView;
import p630io.flutter.embedding.android.FlutterView;
import p630io.flutter.embedding.android.RenderMode;
import p630io.flutter.embedding.android.TransparencyMode;

/* renamed from: f.a.d.a.c */
/* compiled from: FlutterActivityAndFragmentDelegate */
public final class C8907c {
    @NonNull

    /* renamed from: a */
    public C8909b f17452a;
    @Nullable

    /* renamed from: b */
    public C8916a f17453b;
    @Nullable

    /* renamed from: c */
    public FlutterSplashView f17454c;
    @Nullable

    /* renamed from: d */
    public FlutterView f17455d;
    @Nullable

    /* renamed from: e */
    public C9052d f17456e;

    /* renamed from: f */
    public boolean f17457f;
    @NonNull

    /* renamed from: g */
    public final C8969b f17458g = new C8908a();

    /* renamed from: f.a.d.a.c$a */
    /* compiled from: FlutterActivityAndFragmentDelegate */
    public class C8908a implements C8969b {
        public C8908a() {
        }

        /* renamed from: a */
        public void mo46342a() {
            C8907c.this.f17452a.mo46344a();
        }

        /* renamed from: b */
        public void mo46343b() {
            C8907c.this.f17452a.mo46345b();
        }
    }

    /* renamed from: f.a.d.a.c$b */
    /* compiled from: FlutterActivityAndFragmentDelegate */
    public interface C8909b extends C8915h, C8911e, C8910d {
        /* renamed from: a */
        void mo46344a();

        /* renamed from: b */
        void mo46345b();

        void cleanUpFlutterEngine(@NonNull C8916a aVar);

        void configureFlutterEngine(@NonNull C8916a aVar);

        @Nullable
        /* renamed from: d */
        Activity mo46347d();

        /* renamed from: g */
        boolean mo46348g();

        @NonNull
        String getAppBundlePath();

        @Nullable
        String getCachedEngineId();

        @NonNull
        Context getContext();

        @NonNull
        String getDartEntrypointFunctionName();

        @Nullable
        String getInitialRoute();

        @NonNull
        Lifecycle getLifecycle();

        @NonNull
        RenderMode getRenderMode();

        @Nullable
        /* renamed from: h */
        C9052d mo46356h(@Nullable Activity activity, @NonNull C8916a aVar);

        /* renamed from: k */
        void mo46357k(@NonNull FlutterTextureView flutterTextureView);

        /* renamed from: l */
        void mo46358l(@NonNull FlutterSurfaceView flutterSurfaceView);

        @NonNull
        /* renamed from: m */
        C8927d mo46359m();

        @NonNull
        /* renamed from: o */
        TransparencyMode mo46360o();

        @Nullable
        C8916a provideFlutterEngine(@NonNull Context context);

        @Nullable
        C8914g provideSplashScreen();

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();
    }

    public C8907c(@NonNull C8909b bVar) {
        this.f17452a = bVar;
    }

    /* renamed from: b */
    public final void mo46318b() {
        if (this.f17452a.getCachedEngineId() == null && !this.f17453b.mo46371h().mo46439j()) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Executing Dart entrypoint: " + this.f17452a.getDartEntrypointFunctionName() + ", and sending initial route: " + this.f17452a.getInitialRoute());
            if (this.f17452a.getInitialRoute() != null) {
                this.f17453b.mo46376m().mo46529b(this.f17452a.getInitialRoute());
            }
            String appBundlePath = this.f17452a.getAppBundlePath();
            if (appBundlePath == null || appBundlePath.isEmpty()) {
                appBundlePath = C8893a.m24024b().mo46256a().mo46452c();
            }
            this.f17453b.mo46371h().mo46436g(new C8928a.C8930b(appBundlePath, this.f17452a.getDartEntrypointFunctionName()));
        }
    }

    /* renamed from: c */
    public final void mo46319c() {
        if (this.f17452a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Nullable
    /* renamed from: d */
    public C8916a mo46320d() {
        return this.f17453b;
    }

    /* renamed from: e */
    public boolean mo46321e() {
        return this.f17457f;
    }

    /* renamed from: f */
    public void mo46322f(@Nullable Bundle bundle) {
        Bundle bundle2;
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onActivityCreated. Giving framework and plugins an opportunity to restore state.");
        mo46319c();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f17452a.mo46348g()) {
            this.f17453b.mo46381r().mo46550j(bArr);
        }
        if (this.f17452a.shouldAttachEngineToActivity()) {
            this.f17453b.mo46370g().mo46392b(bundle2);
        }
    }

    /* renamed from: g */
    public void mo46323g(int i, int i2, Intent intent) {
        mo46319c();
        if (this.f17453b != null) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i + "\nresultCode: " + i2 + "\ndata: " + intent);
            this.f17453b.mo46370g().mo46391a(i, i2, intent);
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: h */
    public void mo46324h(@NonNull Context context) {
        mo46319c();
        if (this.f17453b == null) {
            mo46341y();
        }
        C8909b bVar = this.f17452a;
        this.f17456e = bVar.mo46356h(bVar.mo46347d(), this.f17453b);
        if (this.f17452a.shouldAttachEngineToActivity()) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this Fragment.");
            this.f17453b.mo46370g().mo46394d(this.f17452a.mo46347d(), this.f17452a.getLifecycle());
        }
        this.f17452a.configureFlutterEngine(this.f17453b);
    }

    /* renamed from: i */
    public void mo46325i() {
        mo46319c();
        if (this.f17453b != null) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f17453b.mo46376m().mo46528a();
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    @NonNull
    /* renamed from: j */
    public View mo46326j(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        mo46319c();
        if (this.f17452a.getRenderMode() == RenderMode.surface) {
            FlutterSurfaceView flutterSurfaceView = new FlutterSurfaceView((Context) this.f17452a.mo46347d(), this.f17452a.mo46360o() == TransparencyMode.transparent);
            this.f17452a.mo46358l(flutterSurfaceView);
            this.f17455d = new FlutterView((Context) this.f17452a.mo46347d(), flutterSurfaceView);
        } else {
            FlutterTextureView flutterTextureView = new FlutterTextureView(this.f17452a.mo46347d());
            this.f17452a.mo46357k(flutterTextureView);
            this.f17455d = new FlutterView((Context) this.f17452a.mo46347d(), flutterTextureView);
        }
        this.f17455d.mo47431h(this.f17458g);
        FlutterSplashView flutterSplashView = new FlutterSplashView(this.f17452a.getContext());
        this.f17454c = flutterSplashView;
        if (Build.VERSION.SDK_INT >= 17) {
            flutterSplashView.setId(View.generateViewId());
        } else {
            flutterSplashView.setId(486947586);
        }
        this.f17454c.mo47393g(this.f17455d, this.f17452a.provideSplashScreen());
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f17455d.mo47433j(this.f17453b);
        return this.f17454c;
    }

    /* renamed from: k */
    public void mo46327k() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        mo46319c();
        this.f17455d.mo47437n();
        this.f17455d.mo47453t(this.f17458g);
    }

    /* renamed from: l */
    public void mo46328l() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onDetach()");
        mo46319c();
        this.f17452a.cleanUpFlutterEngine(this.f17453b);
        if (this.f17452a.shouldAttachEngineToActivity()) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f17452a.mo46347d().isChangingConfigurations()) {
                this.f17453b.mo46370g().mo46396f();
            } else {
                this.f17453b.mo46370g().mo46395e();
            }
        }
        C9052d dVar = this.f17456e;
        if (dVar != null) {
            dVar.mo46658j();
            this.f17456e = null;
        }
        this.f17453b.mo46373j().mo46521a();
        if (this.f17452a.shouldDestroyEngineWithHost()) {
            this.f17453b.mo46368e();
            if (this.f17452a.getCachedEngineId() != null) {
                C8919b.m24152b().mo46390d(this.f17452a.getCachedEngineId());
            }
            this.f17453b = null;
        }
    }

    /* renamed from: m */
    public void mo46329m() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onLowMemory() to FlutterEngine.");
        mo46319c();
        this.f17453b.mo46371h().mo46440k();
        this.f17453b.mo46383t().mo46551a();
    }

    /* renamed from: n */
    public void mo46330n(@NonNull Intent intent) {
        mo46319c();
        if (this.f17453b != null) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine.");
            this.f17453b.mo46370g().onNewIntent(intent);
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: o */
    public void mo46331o() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onPause()");
        mo46319c();
        this.f17453b.mo46373j().mo46522b();
    }

    /* renamed from: p */
    public void mo46332p() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onPostResume()");
        mo46319c();
        if (this.f17453b != null) {
            C9052d dVar = this.f17456e;
            if (dVar != null) {
                dVar.mo46668t();
                return;
            }
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: q */
    public void mo46333q(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        mo46319c();
        if (this.f17453b != null) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f17453b.mo46370g().onRequestPermissionsResult(i, strArr, iArr);
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: r */
    public void mo46334r() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onResume()");
        mo46319c();
        this.f17453b.mo46373j().mo46524d();
    }

    /* renamed from: s */
    public void mo46335s(@Nullable Bundle bundle) {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        mo46319c();
        if (this.f17452a.mo46348g()) {
            bundle.putByteArray("framework", this.f17453b.mo46381r().mo46548h());
        }
        if (this.f17452a.shouldAttachEngineToActivity()) {
            Bundle bundle2 = new Bundle();
            this.f17453b.mo46370g().mo46393c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* renamed from: t */
    public void mo46336t() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onStart()");
        mo46319c();
        mo46318b();
    }

    /* renamed from: u */
    public void mo46337u() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "onStop()");
        mo46319c();
        this.f17453b.mo46373j().mo46523c();
    }

    /* renamed from: v */
    public void mo46338v(int i) {
        mo46319c();
        C8916a aVar = this.f17453b;
        if (aVar != null) {
            aVar.mo46371h().mo46440k();
            if (i == 10) {
                C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onTrimMemory() to FlutterEngine. Level: " + i);
                this.f17453b.mo46383t().mo46551a();
                return;
            }
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: w */
    public void mo46339w() {
        mo46319c();
        if (this.f17453b != null) {
            C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f17453b.mo46370g().onUserLeaveHint();
            return;
        }
        C8896b.m24033e("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* renamed from: x */
    public void mo46340x() {
        this.f17452a = null;
        this.f17453b = null;
        this.f17455d = null;
        this.f17456e = null;
    }

    @VisibleForTesting
    /* renamed from: y */
    public void mo46341y() {
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String cachedEngineId = this.f17452a.getCachedEngineId();
        if (cachedEngineId != null) {
            C8916a a = C8919b.m24152b().mo46388a(cachedEngineId);
            this.f17453b = a;
            this.f17457f = true;
            if (a == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + cachedEngineId + "'");
            }
            return;
        }
        C8909b bVar = this.f17452a;
        C8916a provideFlutterEngine = bVar.provideFlutterEngine(bVar.getContext());
        this.f17453b = provideFlutterEngine;
        if (provideFlutterEngine != null) {
            this.f17457f = true;
            return;
        }
        C8896b.m24032d("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.f17453b = new C8916a(this.f17452a.getContext(), this.f17452a.mo46359m().mo46432b(), false, this.f17452a.mo46348g());
        this.f17457f = false;
    }
}
