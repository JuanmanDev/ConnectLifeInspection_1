package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo47991d2 = {"Lcom/chad/library/adapter/base/animation/SlideInLeftAnimation;", "Lcom/chad/library/adapter/base/animation/BaseAnimation;", "Landroid/view/View;", "view", "", "Landroid/animation/Animator;", "animators", "(Landroid/view/View;)[Landroid/animation/Animator;", "<init>", "()V", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: SlideInLeftAnimation.kt */
public final class SlideInLeftAnimation implements BaseAnimation {
    @NotNull
    public Animator[] animators(@NotNull View view) {
        View rootView = view.getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "view.rootView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{-((float) rootView.getWidth()), 0.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.8f));
        return new Animator[]{ofFloat};
    }
}
