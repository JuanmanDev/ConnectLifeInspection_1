package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.base.R$styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.dynamic.RemoteCreator;
import p040c.p200q.p201a.p264c.p276d.p281j.C3505r0;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: e */
    public int f8163e;

    /* renamed from: l */
    public int f8164l;

    /* renamed from: m */
    public View f8165m;
    @Nullable

    /* renamed from: n */
    public View.OnClickListener f8166n;

    public SignInButton(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo24504a(int i, int i2) {
        this.f8163e = i;
        this.f8164l = i2;
        mo24505b(getContext());
    }

    /* renamed from: b */
    public final void mo24505b(Context context) {
        View view = this.f8165m;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f8165m = C3505r0.m8930c(context, this.f8163e, this.f8164l);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            int i = this.f8163e;
            int i2 = this.f8164l;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo24609a(context.getResources(), i, i2);
            this.f8165m = zaaa;
        }
        addView(this.f8165m);
        this.f8165m.setEnabled(isEnabled());
        this.f8165m.setOnClickListener(this);
    }

    public void onClick(@NonNull View view) {
        View.OnClickListener onClickListener = this.f8166n;
        if (onClickListener != null && view == this.f8165m) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        mo24504a(this.f8163e, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f8165m.setEnabled(z);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f8166n = onClickListener;
        View view = this.f8165m;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@NonNull Scope[] scopeArr) {
        mo24504a(this.f8163e, this.f8164l);
    }

    public void setSize(int i) {
        mo24504a(i, this.f8164l);
    }

    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8166n = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SignInButton, 0, 0);
        try {
            this.f8163e = obtainStyledAttributes.getInt(R$styleable.SignInButton_buttonSize, 0);
            this.f8164l = obtainStyledAttributes.getInt(R$styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo24504a(this.f8163e, this.f8164l);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
