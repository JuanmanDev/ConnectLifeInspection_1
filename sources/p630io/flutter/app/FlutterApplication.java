package p630io.flutter.app;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.CallSuper;
import p553f.p554a.C8893a;

/* renamed from: io.flutter.app.FlutterApplication */
public class FlutterApplication extends Application {

    /* renamed from: e */
    public Activity f18416e = null;

    /* renamed from: a */
    public Activity mo47320a() {
        return this.f18416e;
    }

    /* renamed from: b */
    public void mo47321b(Activity activity) {
        this.f18416e = activity;
    }

    @CallSuper
    public void onCreate() {
        super.onCreate();
        C8893a.m24024b().mo46256a().mo46457i(this);
    }
}
