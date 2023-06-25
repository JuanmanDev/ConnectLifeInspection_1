package p630io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p557a.C8907c;
import p553f.p554a.p556d.p557a.C8914g;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.C8927d;
import p553f.p554a.p556d.p558b.p561g.p567h.C8963a;
import p553f.p554a.p570e.p575e.C9052d;
import p630io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* renamed from: io.flutter.embedding.android.FlutterActivity */
public class FlutterActivity extends Activity implements C8907c.C8909b, LifecycleOwner {
    @VisibleForTesting

    /* renamed from: e */
    public C8907c f18426e;
    @NonNull

    /* renamed from: l */
    public LifecycleRegistry f18427l = new LifecycleRegistry(this);

    /* renamed from: a */
    public void mo46344a() {
    }

    /* renamed from: b */
    public void mo46345b() {
        if (Build.VERSION.SDK_INT >= 21) {
            reportFullyDrawn();
        }
    }

    public void cleanUpFlutterEngine(@NonNull C8916a aVar) {
    }

    public void configureFlutterEngine(@NonNull C8916a aVar) {
        C8963a.m24276a(aVar);
    }

    @NonNull
    /* renamed from: d */
    public Activity mo46347d() {
        return this;
    }

    /* renamed from: e */
    public final void mo47331e() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    /* renamed from: f */
    public final void mo47332f() {
        if (mo47334j() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: g */
    public boolean mo46348g() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (getCachedEngineId() != null) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getAppBundlePath() {
        String dataString;
        if (!mo47350p() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Nullable
    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @NonNull
    public Context getContext() {
        return this;
    }

    @NonNull
    public String getDartEntrypointFunctionName() {
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            if (string != null) {
                return string;
            }
            return "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @NonNull
    public String getInitialRoute() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            String string = bundle != null ? bundle.getString("io.flutter.InitialRoute") : null;
            if (string != null) {
                return string;
            }
            return "/";
        } catch (PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.f18427l;
    }

    @NonNull
    public RenderMode getRenderMode() {
        return mo47334j() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    @Nullable
    /* renamed from: h */
    public C9052d mo46356h(@Nullable Activity activity, @NonNull C8916a aVar) {
        if (activity == null) {
            return null;
        }
        mo46347d();
        return new C9052d(this, aVar.mo46377n());
    }

    @NonNull
    /* renamed from: i */
    public final View mo47333i() {
        return this.f18426e.mo46326j((LayoutInflater) null, (ViewGroup) null, (Bundle) null);
    }

    @NonNull
    /* renamed from: j */
    public FlutterActivityLaunchConfigs.BackgroundMode mo47334j() {
        if (getIntent().hasExtra("background_mode")) {
            return FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    /* renamed from: k */
    public void mo46357k(@NonNull FlutterTextureView flutterTextureView) {
    }

    /* renamed from: l */
    public void mo46358l(@NonNull FlutterSurfaceView flutterSurfaceView) {
    }

    @NonNull
    /* renamed from: m */
    public C8927d mo46359m() {
        return C8927d.m24190a(getIntent());
    }

    @Nullable
    /* renamed from: n */
    public final Drawable mo47335n() {
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i == 0) {
                return null;
            }
            if (Build.VERSION.SDK_INT > 21) {
                return getResources().getDrawable(i, getTheme());
            }
            return getResources().getDrawable(i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: o */
    public TransparencyMode mo46360o() {
        return mo47334j() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f18426e.mo46323g(i, i2, intent);
    }

    public void onBackPressed() {
        this.f18426e.mo46325i();
    }

    public void onCreate(@Nullable Bundle bundle) {
        mo47351q();
        super.onCreate(bundle);
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        C8907c cVar = new C8907c(this);
        this.f18426e = cVar;
        cVar.mo46324h(this);
        this.f18426e.mo46322f(bundle);
        mo47332f();
        setContentView(mo47333i());
        mo47331e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18426e.mo46327k();
        this.f18426e.mo46328l();
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        this.f18426e.mo46330n(intent);
    }

    public void onPause() {
        super.onPause();
        this.f18426e.mo46331o();
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f18426e.mo46332p();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f18426e.mo46333q(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        this.f18426e.mo46334r();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f18426e.mo46335s(bundle);
    }

    public void onStart() {
        super.onStart();
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.f18426e.mo46336t();
    }

    public void onStop() {
        super.onStop();
        this.f18426e.mo46337u();
        this.f18427l.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        this.f18426e.mo46338v(i);
    }

    public void onUserLeaveHint() {
        this.f18426e.mo46339w();
    }

    /* renamed from: p */
    public final boolean mo47350p() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    @Nullable
    public C8916a provideFlutterEngine(@NonNull Context context) {
        return null;
    }

    @Nullable
    public C8914g provideSplashScreen() {
        Drawable n = mo47335n();
        if (n != null) {
            return new DrawableSplashScreen(n);
        }
        return null;
    }

    /* renamed from: q */
    public final void mo47351q() {
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(getComponentName(), 128);
            if (activityInfo.metaData != null) {
                int i = activityInfo.metaData.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i != -1) {
                    setTheme(i);
                    return;
                }
                return;
            }
            C8896b.m24032d(p630io.flutter.app.FlutterActivity.TAG, "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            C8896b.m24030b(p630io.flutter.app.FlutterActivity.TAG, "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (getCachedEngineId() != null || this.f18426e.mo46321e()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }
}
