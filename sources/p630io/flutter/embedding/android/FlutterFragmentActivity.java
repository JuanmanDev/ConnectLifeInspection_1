package p630io.flutter.embedding.android;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p557a.C8910d;
import p553f.p554a.p556d.p557a.C8911e;
import p553f.p554a.p556d.p557a.C8914g;
import p553f.p554a.p556d.p557a.C8915h;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.C8927d;
import p553f.p554a.p556d.p558b.p561g.p567h.C8963a;
import p630io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p630io.flutter.embedding.android.FlutterFragment;

/* renamed from: io.flutter.embedding.android.FlutterFragmentActivity */
public class FlutterFragmentActivity extends FragmentActivity implements C8915h, C8911e, C8910d {
    public static final int FRAGMENT_CONTAINER_ID = 609893468;
    public static final String TAG = "FlutterFragmentActivity";
    public static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    @Nullable
    public FlutterFragment flutterFragment;

    /* renamed from: io.flutter.embedding.android.FlutterFragmentActivity$a */
    public static class C9400a {
        public C9400a(@NonNull Class<? extends FlutterFragmentActivity> cls, @NonNull String str) {
            String str2 = FlutterActivityLaunchConfigs.f18428a;
        }
    }

    /* renamed from: io.flutter.embedding.android.FlutterFragmentActivity$b */
    public static class C9401b {

        /* renamed from: a */
        public final Class<? extends FlutterFragmentActivity> f18444a;

        /* renamed from: b */
        public String f18445b = "/";

        /* renamed from: c */
        public String f18446c = FlutterActivityLaunchConfigs.f18428a;

        public C9401b(@NonNull Class<? extends FlutterFragmentActivity> cls) {
            this.f18444a = cls;
        }

        @NonNull
        /* renamed from: a */
        public Intent mo47385a(@NonNull Context context) {
            return new Intent(context, this.f18444a).putExtra("route", this.f18445b).putExtra("background_mode", this.f18446c).putExtra("destroy_engine_with_activity", true);
        }
    }

    private void configureStatusBarForFullscreenFlutterExperience() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void configureWindowForTransparency() {
        if (getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @NonNull
    public static Intent createDefaultIntent(@NonNull Context context) {
        return withNewEngine().mo47385a(context);
    }

    @NonNull
    private View createFragmentContainer() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(FRAGMENT_CONTAINER_ID);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void ensureFlutterFragmentCreated() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FlutterFragment flutterFragment2 = (FlutterFragment) supportFragmentManager.findFragmentByTag(TAG_FLUTTER_FRAGMENT);
        this.flutterFragment = flutterFragment2;
        if (flutterFragment2 == null) {
            this.flutterFragment = createFlutterFragment();
            supportFragmentManager.beginTransaction().add((int) FRAGMENT_CONTAINER_ID, (Fragment) this.flutterFragment, TAG_FLUTTER_FRAGMENT).commit();
        }
    }

    @Nullable
    private Drawable getSplashScreenFromManifest() {
        try {
            Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("io.flutter.embedding.android.SplashScreenDrawable")) : null;
            if (valueOf == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT > 21) {
                return getResources().getDrawable(valueOf.intValue(), getTheme());
            }
            return getResources().getDrawable(valueOf.intValue());
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean isDebuggable() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void switchLaunchThemeForNormalTheme() {
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
            C8896b.m24032d(TAG, "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            C8896b.m24030b(TAG, "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    @NonNull
    public static C9400a withCachedEngine(@NonNull String str) {
        return new C9400a(FlutterFragmentActivity.class, str);
    }

    @NonNull
    public static C9401b withNewEngine() {
        return new C9401b(FlutterFragmentActivity.class);
    }

    public void cleanUpFlutterEngine(@NonNull C8916a aVar) {
    }

    public void configureFlutterEngine(@NonNull C8916a aVar) {
        C8963a.m24276a(aVar);
    }

    @NonNull
    public FlutterFragment createFlutterFragment() {
        FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = getBackgroundMode();
        RenderMode renderMode = getRenderMode();
        TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        if (getCachedEngineId() != null) {
            C8896b.m24032d(TAG, "Creating FlutterFragment with cached engine:\nCached engine ID: " + getCachedEngineId() + "\nWill destroy engine when Activity is destroyed: " + shouldDestroyEngineWithHost() + "\nBackground transparency mode: " + backgroundMode + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
            FlutterFragment.C9398b s = FlutterFragment.m25349s(getCachedEngineId());
            s.mo47361d(renderMode);
            s.mo47363f(transparencyMode);
            s.mo47362e(shouldAttachEngineToActivity());
            s.mo47360c(shouldDestroyEngineWithHost());
            return s.mo47358a();
        }
        C8896b.m24032d(TAG, "Creating FlutterFragment with new engine:\nBackground transparency mode: " + backgroundMode + "\nDart entrypoint: " + getDartEntrypointFunctionName() + "\nInitial route: " + getInitialRoute() + "\nApp bundle path: " + getAppBundlePath() + "\nWill attach FlutterEngine to Activity: " + shouldAttachEngineToActivity());
        FlutterFragment.C9399c t = FlutterFragment.m25350t();
        t.mo47367d(getDartEntrypointFunctionName());
        t.mo47369f(getInitialRoute());
        t.mo47364a(getAppBundlePath());
        t.mo47368e(C8927d.m24190a(getIntent()));
        t.mo47370g(renderMode);
        t.mo47372i(transparencyMode);
        t.mo47371h(shouldAttachEngineToActivity());
        return t.mo47365b();
    }

    @NonNull
    public String getAppBundlePath() {
        String dataString;
        if (!isDebuggable() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @NonNull
    public FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        if (getIntent().hasExtra("background_mode")) {
            return FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Nullable
    public String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
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

    @Nullable
    public C8916a getFlutterEngine() {
        return this.flutterFragment.mo47356q();
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
    public RenderMode getRenderMode() {
        return getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.flutterFragment.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        this.flutterFragment.mo47357r();
    }

    public void onCreate(@Nullable Bundle bundle) {
        switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        configureWindowForTransparency();
        setContentView(createFragmentContainer());
        configureStatusBarForFullscreenFlutterExperience();
        ensureFlutterFragmentCreated();
    }

    public void onNewIntent(@NonNull Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.flutterFragment.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        this.flutterFragment.onTrimMemory(i);
    }

    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Nullable
    public C8916a provideFlutterEngine(@NonNull Context context) {
        return null;
    }

    @Nullable
    public C8914g provideSplashScreen() {
        Drawable splashScreenFromManifest = getSplashScreenFromManifest();
        if (splashScreenFromManifest != null) {
            return new DrawableSplashScreen(splashScreenFromManifest);
        }
        return null;
    }

    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }
}
