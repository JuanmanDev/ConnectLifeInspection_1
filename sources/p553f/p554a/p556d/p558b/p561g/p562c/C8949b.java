package p553f.p554a.p556d.p558b.p561g.p562c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;

/* renamed from: f.a.d.b.g.c.b */
/* compiled from: ActivityControlSurface */
public interface C8949b {
    /* renamed from: a */
    boolean mo46391a(int i, int i2, @Nullable Intent intent);

    /* renamed from: b */
    void mo46392b(@Nullable Bundle bundle);

    /* renamed from: c */
    void mo46393c(@NonNull Bundle bundle);

    /* renamed from: d */
    void mo46394d(@NonNull Activity activity, @NonNull Lifecycle lifecycle);

    /* renamed from: e */
    void mo46395e();

    /* renamed from: f */
    void mo46396f();

    void onNewIntent(@NonNull Intent intent);

    boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void onUserLeaveHint();
}
