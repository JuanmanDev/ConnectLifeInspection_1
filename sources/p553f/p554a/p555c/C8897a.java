package p553f.p554a.p555c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p588g.C9168b;
import p553f.p554a.p589h.C9172c;
import p553f.p554a.p589h.C9173d;
import p553f.p554a.p589h.C9176e;
import p630io.flutter.app.FlutterApplication;
import p630io.flutter.view.FlutterView;

/* renamed from: f.a.c.a */
/* compiled from: FlutterActivityDelegate */
public final class C8897a implements C8901b, FlutterView.C9457e, C9024l {

    /* renamed from: o */
    public static final WindowManager.LayoutParams f17422o = new WindowManager.LayoutParams(-1, -1);

    /* renamed from: e */
    public final Activity f17423e;

    /* renamed from: l */
    public final C8900b f17424l;

    /* renamed from: m */
    public FlutterView f17425m;

    /* renamed from: n */
    public View f17426n;

    /* renamed from: f.a.c.a$a */
    /* compiled from: FlutterActivityDelegate */
    public class C8898a implements FlutterView.C9456d {

        /* renamed from: f.a.c.a$a$a */
        /* compiled from: FlutterActivityDelegate */
        public class C8899a extends AnimatorListenerAdapter {
            public C8899a() {
            }

            public void onAnimationEnd(Animator animator) {
                ((ViewGroup) C8897a.this.f17426n.getParent()).removeView(C8897a.this.f17426n);
                View unused = C8897a.this.f17426n = null;
            }
        }

        public C8898a() {
        }

        /* renamed from: a */
        public void mo46284a() {
            C8897a.this.f17426n.animate().alpha(0.0f).setListener(new C8899a());
            C8897a.this.f17425m.mo47643A(this);
        }
    }

    /* renamed from: f.a.c.a$b */
    /* compiled from: FlutterActivityDelegate */
    public interface C8900b {
        C9173d createFlutterNativeView();

        FlutterView createFlutterView(Context context);

        boolean retainFlutterNativeView();
    }

    public C8897a(Activity activity, C8900b bVar) {
        C9168b.m24872a(activity);
        this.f17423e = activity;
        C9168b.m24872a(bVar);
        this.f17424l = bVar;
    }

    /* renamed from: h */
    public static String[] m24037h(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        int intExtra = intent.getIntExtra("observatory-port", 0);
        if (intExtra > 0) {
            arrayList.add("--observatory-port=" + Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo20939a(int i, int i2, Intent intent) {
        return this.f17425m.getPluginRegistry().mo20939a(i, i2, intent);
    }

    /* renamed from: c */
    public boolean mo46260c() {
        FlutterView flutterView = this.f17425m;
        if (flutterView == null) {
            return false;
        }
        flutterView.mo47685w();
        return true;
    }

    /* renamed from: f */
    public final void mo46261f() {
        View view = this.f17426n;
        if (view != null) {
            this.f17423e.addContentView(view, f17422o);
            this.f17425m.mo47659i(new C8898a());
            this.f17423e.setTheme(16973833);
        }
    }

    /* renamed from: g */
    public final View mo46262g() {
        Drawable i;
        if (!mo46269m().booleanValue() || (i = mo46265i()) == null) {
            return null;
        }
        View view = new View(this.f17423e);
        view.setLayoutParams(f17422o);
        view.setBackground(i);
        return view;
    }

    public FlutterView getFlutterView() {
        return this.f17425m;
    }

    public boolean hasPlugin(String str) {
        return this.f17425m.getPluginRegistry().hasPlugin(str);
    }

    /* renamed from: i */
    public final Drawable mo46265i() {
        TypedValue typedValue = new TypedValue();
        if (!this.f17423e.getTheme().resolveAttribute(16842836, typedValue, true) || typedValue.resourceId == 0) {
            return null;
        }
        try {
            return this.f17423e.getResources().getDrawable(typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public final boolean mo46266j() {
        return (this.f17423e.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: k */
    public final boolean mo46267k(Intent intent) {
        if (!"android.intent.action.RUN".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("route");
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = C9172c.m24874b();
        }
        if (stringExtra != null) {
            this.f17425m.setInitialRoute(stringExtra);
        }
        mo46268l(dataString);
        return true;
    }

    /* renamed from: l */
    public final void mo46268l(String str) {
        if (!this.f17425m.getFlutterNativeView().mo46965n()) {
            C9176e eVar = new C9176e();
            eVar.f17973a = str;
            eVar.f17974b = "main";
            this.f17425m.mo47646D(eVar);
        }
    }

    /* renamed from: m */
    public final Boolean mo46269m() {
        try {
            Bundle bundle = this.f17423e.getPackageManager().getActivityInfo(this.f17423e.getComponentName(), 129).metaData;
            return Boolean.valueOf(bundle != null && bundle.getBoolean("io.flutter.app.android.SplashScreenUntilFirstFrame"));
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate(Bundle bundle) {
        String b;
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.f17423e.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        C9172c.m24873a(this.f17423e.getApplicationContext(), m24037h(this.f17423e.getIntent()));
        FlutterView createFlutterView = this.f17424l.createFlutterView(this.f17423e);
        this.f17425m = createFlutterView;
        if (createFlutterView == null) {
            FlutterView flutterView = new FlutterView(this.f17423e, (AttributeSet) null, this.f17424l.createFlutterNativeView());
            this.f17425m = flutterView;
            flutterView.setLayoutParams(f17422o);
            this.f17423e.setContentView(this.f17425m);
            View g = mo46262g();
            this.f17426n = g;
            if (g != null) {
                mo46261f();
            }
        }
        if (!mo46267k(this.f17423e.getIntent()) && (b = C9172c.m24874b()) != null) {
            mo46268l(b);
        }
    }

    public void onDestroy() {
        Application application = (Application) this.f17423e.getApplicationContext();
        if (application instanceof FlutterApplication) {
            FlutterApplication flutterApplication = (FlutterApplication) application;
            if (this.f17423e.equals(flutterApplication.mo47320a())) {
                flutterApplication.mo47321b((Activity) null);
            }
        }
        FlutterView flutterView = this.f17425m;
        if (flutterView == null) {
            return;
        }
        if (flutterView.getPluginRegistry().mo46289b(this.f17425m.getFlutterNativeView()) || this.f17424l.retainFlutterNativeView()) {
            this.f17425m.mo47663m();
        } else {
            this.f17425m.mo47662l();
        }
    }

    public void onLowMemory() {
        this.f17425m.mo47679r();
    }

    public void onNewIntent(Intent intent) {
        if (!mo46266j() || !mo46267k(intent)) {
            this.f17425m.getPluginRegistry().onNewIntent(intent);
        }
    }

    public void onPause() {
        Application application = (Application) this.f17423e.getApplicationContext();
        if (application instanceof FlutterApplication) {
            FlutterApplication flutterApplication = (FlutterApplication) application;
            if (this.f17423e.equals(flutterApplication.mo47320a())) {
                flutterApplication.mo47321b((Activity) null);
            }
        }
        FlutterView flutterView = this.f17425m;
        if (flutterView != null) {
            flutterView.mo47680s();
        }
    }

    public void onPostResume() {
        FlutterView flutterView = this.f17425m;
        if (flutterView != null) {
            flutterView.mo47682t();
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        return this.f17425m.getPluginRegistry().onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        Application application = (Application) this.f17423e.getApplicationContext();
        if (application instanceof FlutterApplication) {
            ((FlutterApplication) application).mo47321b(this.f17423e);
        }
    }

    public void onStart() {
        FlutterView flutterView = this.f17425m;
        if (flutterView != null) {
            flutterView.mo47683u();
        }
    }

    public void onStop() {
        this.f17425m.mo47684v();
    }

    public void onTrimMemory(int i) {
        if (i == 10) {
            this.f17425m.mo47679r();
        }
    }

    public void onUserLeaveHint() {
        this.f17425m.getPluginRegistry().onUserLeaveHint();
    }

    public C9024l.C9027c registrarFor(String str) {
        return this.f17425m.getPluginRegistry().registrarFor(str);
    }

    public <T> T valuePublishedByPlugin(String str) {
        return this.f17425m.getPluginRegistry().valuePublishedByPlugin(str);
    }
}
