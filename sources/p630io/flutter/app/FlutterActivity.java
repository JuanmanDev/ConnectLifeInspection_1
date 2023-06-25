package p630io.flutter.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import p553f.p554a.p555c.C8897a;
import p553f.p554a.p555c.C8901b;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p589h.C9173d;
import p630io.flutter.view.FlutterView;

/* renamed from: io.flutter.app.FlutterActivity */
public class FlutterActivity extends Activity implements FlutterView.C9457e, C9024l, C8897a.C8900b {
    public static final String TAG = "FlutterActivity";
    public final C8897a delegate;
    public final C8901b eventDelegate;
    public final C9024l pluginRegistry;
    public final FlutterView.C9457e viewProvider;

    public FlutterActivity() {
        C8897a aVar = new C8897a(this, this);
        this.delegate = aVar;
        this.eventDelegate = aVar;
        this.viewProvider = aVar;
        this.pluginRegistry = aVar;
    }

    public C9173d createFlutterNativeView() {
        return null;
    }

    public FlutterView createFlutterView(Context context) {
        return null;
    }

    public FlutterView getFlutterView() {
        return this.viewProvider.getFlutterView();
    }

    public final boolean hasPlugin(String str) {
        return this.pluginRegistry.hasPlugin(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.eventDelegate.mo20939a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.eventDelegate.mo46260c()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.eventDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.eventDelegate.onCreate(bundle);
    }

    public void onDestroy() {
        this.eventDelegate.onDestroy();
        super.onDestroy();
    }

    public void onLowMemory() {
        this.eventDelegate.onLowMemory();
    }

    public void onNewIntent(Intent intent) {
        this.eventDelegate.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        this.eventDelegate.onPause();
    }

    public void onPostResume() {
        super.onPostResume();
        this.eventDelegate.onPostResume();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.eventDelegate.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.eventDelegate.onResume();
    }

    public void onStart() {
        super.onStart();
        this.eventDelegate.onStart();
    }

    public void onStop() {
        this.eventDelegate.onStop();
        super.onStop();
    }

    public void onTrimMemory(int i) {
        this.eventDelegate.onTrimMemory(i);
    }

    public void onUserLeaveHint() {
        this.eventDelegate.onUserLeaveHint();
    }

    public final C9024l.C9027c registrarFor(String str) {
        return this.pluginRegistry.registrarFor(str);
    }

    public boolean retainFlutterNativeView() {
        return false;
    }

    public final <T> T valuePublishedByPlugin(String str) {
        return this.pluginRegistry.valuePublishedByPlugin(str);
    }
}
