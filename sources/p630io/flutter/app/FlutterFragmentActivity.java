package p630io.flutter.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import p553f.p554a.p555c.C8897a;
import p553f.p554a.p555c.C8901b;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p589h.C9173d;
import p630io.flutter.view.FlutterView;

/* renamed from: io.flutter.app.FlutterFragmentActivity */
public class FlutterFragmentActivity extends FragmentActivity implements FlutterView.C9457e, C9024l, C8897a.C8900b {

    /* renamed from: e */
    public final C8897a f18417e;

    /* renamed from: l */
    public final C8901b f18418l;

    /* renamed from: m */
    public final FlutterView.C9457e f18419m;

    /* renamed from: n */
    public final C9024l f18420n;

    public FlutterFragmentActivity() {
        C8897a aVar = new C8897a(this, this);
        this.f18417e = aVar;
        this.f18418l = aVar;
        this.f18419m = aVar;
        this.f18420n = aVar;
    }

    public C9173d createFlutterNativeView() {
        return null;
    }

    public FlutterView createFlutterView(Context context) {
        return null;
    }

    public FlutterView getFlutterView() {
        return this.f18419m.getFlutterView();
    }

    public final boolean hasPlugin(String str) {
        return this.f18420n.hasPlugin(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f18418l.mo20939a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.f18418l.mo46260c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18418l.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18418l.onCreate(bundle);
    }

    public void onDestroy() {
        this.f18418l.onDestroy();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.f18418l.onLowMemory();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f18418l.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        this.f18418l.onPause();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f18418l.onPostResume();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f18418l.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onStart() {
        super.onStart();
        this.f18418l.onStart();
    }

    public void onStop() {
        this.f18418l.onStop();
        super.onStop();
    }

    public void onTrimMemory(int i) {
        this.f18418l.onTrimMemory(i);
    }

    public void onUserLeaveHint() {
        this.f18418l.onUserLeaveHint();
    }

    public final C9024l.C9027c registrarFor(String str) {
        return this.f18420n.registrarFor(str);
    }

    public boolean retainFlutterNativeView() {
        return false;
    }

    public final <T> T valuePublishedByPlugin(String str) {
        return this.f18420n.valuePublishedByPlugin(str);
    }
}
