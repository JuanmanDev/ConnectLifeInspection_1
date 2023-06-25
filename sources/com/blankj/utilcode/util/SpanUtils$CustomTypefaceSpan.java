package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

@SuppressLint({"ParcelCreator"})
public class SpanUtils$CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: e */
    public final Typeface f6981e;

    /* renamed from: a */
    public final void mo21594a(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int i2 = i & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.getShader();
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        mo21594a(textPaint, this.f6981e);
    }

    public void updateMeasureState(TextPaint textPaint) {
        mo21594a(textPaint, this.f6981e);
    }
}
