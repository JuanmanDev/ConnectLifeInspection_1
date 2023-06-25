package p001a.p007c.p016g;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;

/* renamed from: a.c.g.d */
/* compiled from: lambda */
public final /* synthetic */ class C0062d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener f95a;

    /* renamed from: b */
    public final /* synthetic */ View f96b;

    public /* synthetic */ C0062d(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.f95a = viewPropertyAnimatorUpdateListener;
        this.f96b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f95a.onAnimationUpdate(this.f96b);
    }
}
