package p553f.p554a.p556d.p557a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: f.a.d.a.g */
/* compiled from: SplashScreen */
public interface C8914g {
    @Nullable
    View createSplashView(@NonNull Context context, @Nullable Bundle bundle);

    @SuppressLint({"NewApi"})
    boolean doesSplashViewRememberItsTransition() {
        return false;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    Bundle saveSplashScreenState() {
        return null;
    }

    void transitionToFlutter(@NonNull Runnable runnable);
}
