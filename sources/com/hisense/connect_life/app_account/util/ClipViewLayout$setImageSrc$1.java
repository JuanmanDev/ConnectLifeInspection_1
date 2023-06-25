package com.hisense.connect_life.app_account.util;

import android.net.Uri;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo47990d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo47991d2 = {"com/hisense/connect_life/app_account/util/ClipViewLayout$setImageSrc$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClipViewLayout.kt */
public final class ClipViewLayout$setImageSrc$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ String $forceUseAbsolutePath;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ ClipViewLayout this$0;

    public ClipViewLayout$setImageSrc$1(ClipViewLayout clipViewLayout, Uri uri, String str) {
        this.this$0 = clipViewLayout;
        this.$uri = uri;
        this.$forceUseAbsolutePath = str;
    }

    public void onGlobalLayout() {
        this.this$0.initSrcPic(this.$uri, this.$forceUseAbsolutePath);
        ImageView access$getImageView$p = this.this$0.imageView;
        Intrinsics.checkNotNull(access$getImageView$p);
        access$getImageView$p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
