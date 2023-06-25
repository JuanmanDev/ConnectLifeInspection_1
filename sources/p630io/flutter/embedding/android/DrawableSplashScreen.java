package p630io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p553f.p554a.p556d.p557a.C8914g;

/* renamed from: io.flutter.embedding.android.DrawableSplashScreen */
public final class DrawableSplashScreen implements C8914g {

    /* renamed from: a */
    public final Drawable f18421a;

    /* renamed from: b */
    public final ImageView.ScaleType f18422b;

    /* renamed from: c */
    public final long f18423c;

    /* renamed from: d */
    public DrawableSplashScreenView f18424d;

    /* renamed from: io.flutter.embedding.android.DrawableSplashScreen$DrawableSplashScreenView */
    public static class DrawableSplashScreenView extends ImageView {
        public DrawableSplashScreenView(@NonNull Context context) {
            this(context, (AttributeSet) null, 0);
        }

        /* renamed from: a */
        public void mo47325a(@Nullable Drawable drawable, @NonNull ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(@Nullable Drawable drawable) {
            mo47325a(drawable, ImageView.ScaleType.FIT_XY);
        }

        public DrawableSplashScreenView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DrawableSplashScreenView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    /* renamed from: io.flutter.embedding.android.DrawableSplashScreen$a */
    public class C9396a implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f18425a;

        public C9396a(DrawableSplashScreen drawableSplashScreen, Runnable runnable) {
            this.f18425a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f18425a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f18425a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public DrawableSplashScreen(@NonNull Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    @Nullable
    public View createSplashView(@NonNull Context context, @Nullable Bundle bundle) {
        DrawableSplashScreenView drawableSplashScreenView = new DrawableSplashScreenView(context);
        this.f18424d = drawableSplashScreenView;
        drawableSplashScreenView.mo47325a(this.f18421a, this.f18422b);
        return this.f18424d;
    }

    public void transitionToFlutter(@NonNull Runnable runnable) {
        DrawableSplashScreenView drawableSplashScreenView = this.f18424d;
        if (drawableSplashScreenView == null) {
            runnable.run();
        } else {
            drawableSplashScreenView.animate().alpha(0.0f).setDuration(this.f18423c).setListener(new C9396a(this, runnable));
        }
    }

    public DrawableSplashScreen(@NonNull Drawable drawable, @NonNull ImageView.ScaleType scaleType, long j) {
        this.f18421a = drawable;
        this.f18422b = scaleType;
        this.f18423c = j;
    }
}
