package com.hisense.connect_life.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.hisense.connect_life.core.R$id;
import com.hisense.connect_life.core.R$layout;
import com.hisense.connect_life.core.R$styleable;

public class CheckboxItem extends LinearLayout {
    public CheckboxItem(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo39185a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CheckboxTile);
        ((TextView) LayoutInflater.from(context).inflate(R$layout.checkbox_tile, this).findViewById(R$id.checkbox_tile_text_view)).setText(obtainStyledAttributes.getString(R$styleable.CheckboxTile_android_text));
        obtainStyledAttributes.recycle();
    }

    public CheckboxItem(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckboxItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckboxItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo39185a(context, attributeSet);
    }
}
