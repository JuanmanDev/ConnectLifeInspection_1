package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.gms.base.R$color;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    public static final int m10975b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo24609a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = R$drawable.common_google_signin_btn_icon_dark;
        int i5 = R$drawable.common_google_signin_btn_icon_light;
        int b = m10975b(i2, i4, i5, i5);
        int i6 = R$drawable.common_google_signin_btn_text_dark;
        int i7 = R$drawable.common_google_signin_btn_text_light;
        int b2 = m10975b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable wrap = DrawableCompat.wrap(resources.getDrawable(b));
        DrawableCompat.setTintList(wrap, resources.getColorStateList(R$color.common_google_signin_btn_tint));
        DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(wrap);
        int i8 = R$color.common_google_signin_btn_text_dark;
        int i9 = R$color.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(m10975b(i2, i8, i9, i9));
        C3495o.m8908j(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(R$string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(R$string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (C3557h.m9070c(getContext())) {
            setGravity(19);
        }
    }
}
