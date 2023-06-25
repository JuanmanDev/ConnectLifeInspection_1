package com.hisense.connect_life.core.extentions;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.hisense.connect_life.core.glide.GlideUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a$\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a$\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0000\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u001a$\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006\u0014"}, mo47991d2 = {"loadLocalCircleImage", "", "Landroid/widget/ImageView;", "imgRes", "", "path", "", "loadLocalImage", "loadLocalRoundImage", "radius", "loadRemoteCircleImage", "urlImage", "placeHolder", "Landroid/graphics/drawable/Drawable;", "errorHolder", "loadRemoteImage", "placeholder", "error", "loadRemoteRoundImage", "oadRemoteCircleImage", "core_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GlideExt.kt */
public final class GlideExtKt {
    public static final void loadLocalCircleImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "path");
        GlideUtils.INSTANCE.loadLocalCircleImage(imageView, str);
    }

    public static final void loadLocalImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "path");
        GlideUtils.INSTANCE.loadLocalImage(imageView, str);
    }

    public static final void loadLocalRoundImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "path");
        GlideUtils.INSTANCE.loadLocalRoundImage(imageView, str, i);
    }

    public static final void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteCircleImage(imageView, str);
    }

    public static final void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteImage(imageView, str);
    }

    public static final void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteRoundImage(imageView, str, i);
    }

    public static final void oadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteCircleImage(imageView, str, drawable, drawable);
    }

    public static final void loadLocalCircleImage(@NotNull ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        GlideUtils.INSTANCE.loadLocalCircleImage(imageView, i);
    }

    public static final void loadLocalImage(@NotNull ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        GlideUtils.INSTANCE.loadLocalImage(imageView, i);
    }

    public static final void loadLocalRoundImage(@NotNull ImageView imageView, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        GlideUtils.INSTANCE.loadLocalRoundImage(imageView, i, i2);
    }

    public static final void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteCircleImage(imageView, str, i, i2);
    }

    public static final void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteImage(imageView, str, i, i2);
    }

    public static final void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        GlideUtils.INSTANCE.loadRemoteRoundImage(imageView, str, i, i2, i3);
    }

    public static final void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        Intrinsics.checkNotNullParameter(drawable2, "errorHolder");
        GlideUtils.INSTANCE.loadRemoteCircleImage(imageView, str, drawable, drawable2);
    }

    public static final void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeholder");
        Intrinsics.checkNotNullParameter(drawable2, "error");
        GlideUtils.INSTANCE.loadRemoteImage(imageView, str, drawable, drawable2);
    }

    public static final void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        Intrinsics.checkNotNullParameter(drawable2, "errorHolder");
        GlideUtils.INSTANCE.loadRemoteRoundImage(imageView, str, i, drawable, drawable2);
    }

    public static final void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteCircleImage(imageView, str, i, i);
    }

    public static final void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteImage(imageView, str, i, i);
    }

    public static final void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteRoundImage(imageView, str, i, i2, i2);
    }

    public static final void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteImage(imageView, str, drawable, drawable);
    }

    public static final void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteRoundImage(imageView, str, i, drawable, drawable);
    }
}
