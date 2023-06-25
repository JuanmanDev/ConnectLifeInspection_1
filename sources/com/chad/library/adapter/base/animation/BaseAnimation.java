package com.chad.library.adapter.base.animation;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo47991d2 = {"Lcom/chad/library/adapter/base/animation/BaseAnimation;", "Lkotlin/Any;", "Landroid/view/View;", "view", "", "Landroid/animation/Animator;", "animators", "(Landroid/view/View;)[Landroid/animation/Animator;", "com.github.CymChad.brvah"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: BaseAnimation.kt */
public interface BaseAnimation {
    @NotNull
    Animator[] animators(@NotNull View view);
}
