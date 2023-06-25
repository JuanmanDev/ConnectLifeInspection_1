package com.juconnect.connect_life;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.hisense.juconnect.connectlife.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p556d.p557a.C8914g;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, mo47991d2 = {"Lcom/juconnect/connect_life/ConnectLifeSplashScreen;", "Lio/flutter/embedding/android/SplashScreen;", "()V", "createSplashView", "Landroid/view/View;", "context", "Landroid/content/Context;", "savedInstanceState", "Landroid/os/Bundle;", "transitionToFlutter", "", "onTransitionComplete", "Ljava/lang/Runnable;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeSplashScreen.kt */
public final class ConnectLifeSplashScreen implements C8914g {
    @Nullable
    public View createSplashView(@NotNull Context context, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setBackground(context.getResources().getDrawable(R.mipmap.bg_connect_life_screen));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(imageView);
        return frameLayout;
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ boolean doesSplashViewRememberItsTransition() {
        return super.doesSplashViewRememberItsTransition();
    }

    @SuppressLint({"NewApi"})
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ Bundle saveSplashScreenState() {
        return super.saveSplashScreenState();
    }

    public void transitionToFlutter(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "onTransitionComplete");
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 50);
    }
}
