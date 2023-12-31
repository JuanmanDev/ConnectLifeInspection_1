package androidx.core.transition;

import android.transition.Transition;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo47991d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "onTransitionCancel", "", "transition", "Landroid/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "core-ktx_release"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 176)
/* compiled from: Transition.kt */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    public final /* synthetic */ Function1<Transition, Unit> $onCancel;
    public final /* synthetic */ Function1<Transition, Unit> $onEnd;
    public final /* synthetic */ Function1<Transition, Unit> $onPause;
    public final /* synthetic */ Function1<Transition, Unit> $onResume;
    public final /* synthetic */ Function1<Transition, Unit> $onStart;

    public TransitionKt$addListener$listener$1(Function1<? super Transition, Unit> function1, Function1<? super Transition, Unit> function12, Function1<? super Transition, Unit> function13, Function1<? super Transition, Unit> function14, Function1<? super Transition, Unit> function15) {
        this.$onEnd = function1;
        this.$onResume = function12;
        this.$onPause = function13;
        this.$onCancel = function14;
        this.$onStart = function15;
    }

    public void onTransitionCancel(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onEnd.invoke(transition);
    }

    public void onTransitionPause(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(@NotNull Transition transition) {
        Intrinsics.checkNotNullParameter(transition, AnimatedStateListDrawableCompat.ELEMENT_TRANSITION);
        this.$onStart.invoke(transition);
    }
}
