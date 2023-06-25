package p553f.p554a.p555c;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: f.a.c.b */
/* compiled from: FlutterActivityEvents */
public interface C8901b extends ComponentCallbacks2, C9024l.C9025a, C9024l.C9028d {
    /* renamed from: c */
    boolean mo46260c();

    void onCreate(Bundle bundle);

    void onDestroy();

    void onNewIntent(Intent intent);

    void onPause();

    void onPostResume();

    void onResume();

    void onStart();

    void onStop();

    void onUserLeaveHint();
}
