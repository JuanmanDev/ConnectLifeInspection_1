package com.hisense.connect_life.core.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;
import p040c.p077d.p078a.p081k.p084j.C1657j;
import p040c.p077d.p078a.p081k.p091l.p092c.C1827t;
import p040c.p077d.p078a.p101o.C1907a;
import p040c.p077d.p078a.p101o.C1912f;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0016J,\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0016J,\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J4\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/core/glide/GlideStrategy;", "Lcom/hisense/connect_life/core/glide/IImageStrategy;", "()V", "loadLocalCircleImage", "", "imageView", "Landroid/widget/ImageView;", "imgRes", "", "path", "", "loadLocalImage", "loadLocalRoundImage", "radius", "loadRemoteCircleImage", "urlImage", "placeHolder", "Landroid/graphics/drawable/Drawable;", "errorHolder", "loadRemoteImage", "loadRemoteRoundImage", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: GlideStrategy.kt */
public final class GlideStrategy implements IImageStrategy {
    public void loadLocalCircleImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "path");
        C1912f s0 = C1912f.m2414s0();
        Intrinsics.checkNotNullExpressionValue(s0, "circleCropTransform()");
        C1544f<Bitmap> j = C1541c.m1100v(imageView).mo15500j();
        j.mo15484J0(str);
        j.mo15488a(s0).mo15478D0(imageView);
    }

    public void loadLocalImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "path");
        C1544f<Bitmap> j = C1541c.m1100v(imageView).mo15500j();
        j.mo15484J0(str);
        j.mo15478D0(imageView);
    }

    public void loadLocalRoundImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "path");
        C1907a n0 = new C1912f().mo16307n0(new C1827t(i));
        Intrinsics.checkNotNullExpressionValue(n0, "RequestOptions().transform(RoundedCorners(radius))");
        C1544f<Bitmap> j = C1541c.m1100v(imageView).mo15500j();
        j.mo15484J0(str);
        j.mo15488a((C1912f) n0).mo15478D0(imageView);
    }

    public void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, @DrawableRes int i, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i2)).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16284c();
        fVar.mo16282b();
        fVar.mo16285c0(i);
        fVar.mo16298j(i2);
        fVar.mo16293h();
        C1544f<Drawable> r = C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(r, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(r);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, @DrawableRes int i, @DrawableRes int i2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i2)).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        fVar.mo16285c0(i);
        fVar.mo16293h();
        fVar.mo16298j(i2);
        C1544f<Drawable> r = C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(r, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(r);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, @DrawableRes int i2, @DrawableRes int i3) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i3)).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        fVar.mo16307n0(new C1827t(i));
        fVar.mo16285c0(i2);
        fVar.mo16298j(i3);
        fVar.mo16293h();
        C1544f<Drawable> r = C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(r, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(r);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadLocalImage(@NotNull ImageView imageView, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i)).mo15478D0(imageView);
    }

    public void loadLocalCircleImage(@NotNull ImageView imageView, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C1912f s0 = C1912f.m2414s0();
        Intrinsics.checkNotNullExpressionValue(s0, "circleCropTransform()");
        C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i)).mo15488a(s0).mo15478D0(imageView);
    }

    public void loadLocalRoundImage(@NotNull ImageView imageView, @DrawableRes int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        C1907a n0 = new C1912f().mo16307n0(new C1827t(i2));
        Intrinsics.checkNotNullExpressionValue(n0, "RequestOptions().transform(RoundedCorners(radius))");
        C1541c.m1100v(imageView).mo15511r(Integer.valueOf(i)).mo15488a((C1912f) n0).mo15478D0(imageView);
    }

    public void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        Intrinsics.checkNotNullParameter(drawable2, "errorHolder");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15510q(drawable2).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        fVar.mo16286d0(drawable);
        fVar.mo16300k(drawable2);
        fVar.mo16293h();
        C1544f<Drawable> q = C1541c.m1100v(imageView).mo15510q(drawable);
        Intrinsics.checkNotNullExpressionValue(q, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(q);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        Intrinsics.checkNotNullParameter(drawable2, "errorHolder");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15510q(drawable2).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16286d0(drawable);
        fVar.mo16300k(drawable2);
        fVar.mo16293h();
        fVar.mo16284c();
        C1544f<Drawable> q = C1541c.m1100v(imageView).mo15510q(drawable);
        Intrinsics.checkNotNullExpressionValue(q, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(q);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, @NotNull Drawable drawable, @NotNull Drawable drawable2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        Intrinsics.checkNotNullParameter(drawable2, "errorHolder");
        if (TextUtils.isEmpty(str)) {
            C1541c.m1100v(imageView).mo15510q(drawable2).mo15478D0(imageView);
            return;
        }
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        fVar.mo16307n0(new C1827t(i));
        fVar.mo16286d0(drawable);
        fVar.mo16300k(drawable2);
        fVar.mo16293h();
        C1544f<Drawable> q = C1541c.m1100v(imageView).mo15510q(drawable);
        Intrinsics.checkNotNullExpressionValue(q, "with(imageView)\n\t\t\t\t.load(placeHolder)");
        C1544f<Drawable> s = C1541c.m1100v(imageView).mo15512s(str);
        s.mo15487M0(q);
        s.mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteImage(imageView, str, i, i);
    }

    public void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteCircleImage(imageView, str, i, i);
    }

    public void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteImage(imageView, str, drawable, drawable);
    }

    public void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteCircleImage(imageView, str, drawable, drawable);
    }

    public void loadRemoteImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        C1541c.m1100v(imageView).mo15512s(str).mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        loadRemoteRoundImage(imageView, str, i2, i2);
    }

    public void loadRemoteCircleImage(@NotNull ImageView imageView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        C1912f fVar = new C1912f();
        fVar.mo16284c();
        fVar.mo16282b();
        fVar.mo16290f(C1657j.f1107a);
        C1541c.m1100v(imageView).mo15512s(str).mo15488a(fVar).mo15478D0(imageView);
    }

    public void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        Intrinsics.checkNotNullParameter(drawable, "placeHolder");
        loadRemoteRoundImage(imageView, str, i, drawable, drawable);
    }

    public void loadRemoteRoundImage(@NotNull ImageView imageView, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(str, "urlImage");
        C1912f fVar = new C1912f();
        fVar.mo16290f(C1657j.f1107a);
        fVar.mo16302l();
        fVar.mo16307n0(new C1827t(i));
        C1541c.m1100v(imageView).mo15512s(str).mo15488a(fVar).mo15478D0(imageView);
    }
}
