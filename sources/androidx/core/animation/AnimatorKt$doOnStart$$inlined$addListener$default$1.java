package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, mo47991d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 176)
/* compiled from: Animator.kt */
public final class AnimatorKt$doOnStart$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    public final /* synthetic */ Function1 $onStart;

    public AnimatorKt$doOnStart$$inlined$addListener$default$1(Function1 function1) {
        this.$onStart = function1;
    }

    public void onAnimationCancel(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationEnd(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationRepeat(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationStart(@NotNull Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
