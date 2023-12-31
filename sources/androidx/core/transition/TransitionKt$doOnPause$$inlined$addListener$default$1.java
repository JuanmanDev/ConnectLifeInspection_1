package androidx.core.transition;

import android.transition.Transition;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, mo47991d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 176)
/* compiled from: Transition.kt */
public final class TransitionKt$doOnPause$$inlined$addListener$default$1 implements Transition.TransitionListener {
    public final /* synthetic */ Function1 $onPause;

    public TransitionKt$doOnPause$$inlined$addListener$default$1(Function1 function1) {
        this.$onPause = function1;
    }

    public void onTransitionCancel(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
    }

    public void onTransitionEnd(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
    }

    public void onTransitionPause(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
    }

    public void onTransitionStart(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
    }
}
