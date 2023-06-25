package p040c.p175p.p184b.p185a.p199k;

import android.graphics.Color;
import androidx.core.location.GpsStatusWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.textfield.IndicatorViewController;

/* renamed from: c.p.b.a.k.a */
/* compiled from: ColorTemplate */
public class C2338a {
    static {
        Color.rgb(207, 248, 246);
        Color.rgb(148, 212, 212);
        Color.rgb(136, 180, 187);
        Color.rgb(118, 174, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION);
        Color.rgb(42, 109, 130);
        Color.rgb(IndicatorViewController.CAPTION_TRANSLATE_Y_ANIMATION_DURATION, 80, 138);
        Color.rgb(254, 149, 7);
        Color.rgb(254, 247, 120);
        Color.rgb(106, 167, 134);
        Color.rgb(53, 194, 209);
        Color.rgb(64, 89, 128);
        Color.rgb(149, 165, 124);
        Color.rgb(IndicatorViewController.CAPTION_TRANSLATE_Y_ANIMATION_DURATION, 184, 162);
        Color.rgb(191, 134, 134);
        Color.rgb(179, 48, 80);
        Color.rgb(GpsStatusWrapper.QZSS_SVID_MIN, 37, 82);
        Color.rgb(255, 102, 0);
        Color.rgb(245, 199, 0);
        Color.rgb(106, 150, 31);
        Color.rgb(179, 100, 53);
        Color.rgb(192, 255, 140);
        Color.rgb(255, 247, 140);
        Color.rgb(255, 208, 140);
        Color.rgb(140, 234, 255);
        Color.rgb(255, 140, 157);
        m3917b("#2ecc71");
        m3917b("#f1c40f");
        m3917b("#e74c3c");
        m3917b("#3498db");
    }

    /* renamed from: a */
    public static int m3916a(int i, int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((i2 & 255) << 24);
    }

    /* renamed from: b */
    public static int m3917b(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, (parseLong >> 0) & 255);
    }
}
