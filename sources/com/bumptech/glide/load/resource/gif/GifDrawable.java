package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.p080j.C1559a;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p091l.p096g.C1858f;
import p040c.p077d.p078a.p105q.C1949i;

public class GifDrawable extends Drawable implements C1858f.C1860b, Animatable, Animatable2Compat {

    /* renamed from: e */
    public final C3834a f7031e;

    /* renamed from: l */
    public boolean f7032l;

    /* renamed from: m */
    public boolean f7033m;

    /* renamed from: n */
    public boolean f7034n;

    /* renamed from: o */
    public boolean f7035o;

    /* renamed from: p */
    public int f7036p;

    /* renamed from: q */
    public int f7037q;

    /* renamed from: r */
    public boolean f7038r;

    /* renamed from: s */
    public Paint f7039s;

    /* renamed from: t */
    public Rect f7040t;

    /* renamed from: u */
    public List<Animatable2Compat.AnimationCallback> f7041u;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    public static final class C3834a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a */
        public final C1858f f7042a;

        public C3834a(C1858f fVar) {
            this.f7042a = fVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @NonNull
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }
    }

    public GifDrawable(Context context, C1559a aVar, C1574h<Bitmap> hVar, int i, int i2, Bitmap bitmap) {
        this(new C3834a(new C1858f(C1541c.m1093d(context), aVar, i, i2, hVar, bitmap)));
    }

    /* renamed from: a */
    public void mo16182a() {
        if (mo21676b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo21682g() == mo21681f() - 1) {
            this.f7036p++;
        }
        int i = this.f7037q;
        if (i != -1 && this.f7036p >= i) {
            mo21690j();
            stop();
        }
    }

    /* renamed from: b */
    public final Drawable.Callback mo21676b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: c */
    public ByteBuffer mo21677c() {
        return this.f7031e.f7042a.mo16161b();
    }

    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.f7041u;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final Rect mo21678d() {
        if (this.f7040t == null) {
            this.f7040t = new Rect();
        }
        return this.f7040t;
    }

    public void draw(@NonNull Canvas canvas) {
        if (!this.f7034n) {
            if (this.f7038r) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), mo21678d());
                this.f7038r = false;
            }
            canvas.drawBitmap(this.f7031e.f7042a.mo16162c(), (Rect) null, mo21678d(), mo21687h());
        }
    }

    /* renamed from: e */
    public Bitmap mo21680e() {
        return this.f7031e.f7042a.mo16164e();
    }

    /* renamed from: f */
    public int mo21681f() {
        return this.f7031e.f7042a.mo16165f();
    }

    /* renamed from: g */
    public int mo21682g() {
        return this.f7031e.f7042a.mo16163d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7031e;
    }

    public int getIntrinsicHeight() {
        return this.f7031e.f7042a.mo16167i();
    }

    public int getIntrinsicWidth() {
        return this.f7031e.f7042a.mo16169l();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public final Paint mo21687h() {
        if (this.f7039s == null) {
            this.f7039s = new Paint(2);
        }
        return this.f7039s;
    }

    /* renamed from: i */
    public int mo21688i() {
        return this.f7031e.f7042a.mo16168k();
    }

    public boolean isRunning() {
        return this.f7032l;
    }

    /* renamed from: j */
    public final void mo21690j() {
        List<Animatable2Compat.AnimationCallback> list = this.f7041u;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f7041u.get(i).onAnimationEnd(this);
            }
        }
    }

    /* renamed from: k */
    public void mo21691k() {
        this.f7034n = true;
        this.f7031e.f7042a.mo16160a();
    }

    /* renamed from: l */
    public final void mo21692l() {
        this.f7036p = 0;
    }

    /* renamed from: m */
    public void mo21693m(C1574h<Bitmap> hVar, Bitmap bitmap) {
        this.f7031e.f7042a.mo16173p(hVar, bitmap);
    }

    /* renamed from: n */
    public final void mo21694n() {
        C1949i.m2560a(!this.f7034n, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f7031e.f7042a.mo16165f() == 1) {
            invalidateSelf();
        } else if (!this.f7032l) {
            this.f7032l = true;
            this.f7031e.f7042a.mo16176s(this);
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public final void mo21695o() {
        this.f7032l = false;
        this.f7031e.f7042a.mo16178t(this);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7038r = true;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback != null) {
            if (this.f7041u == null) {
                this.f7041u = new ArrayList();
            }
            this.f7041u.add(animationCallback);
        }
    }

    public void setAlpha(int i) {
        mo21687h().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        mo21687h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1949i.m2560a(!this.f7034n, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f7035o = z;
        if (!z) {
            mo21695o();
        } else if (this.f7033m) {
            mo21694n();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f7033m = true;
        mo21692l();
        if (this.f7035o) {
            mo21694n();
        }
    }

    public void stop() {
        this.f7033m = false;
        mo21695o();
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f7041u;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    public GifDrawable(C3834a aVar) {
        this.f7035o = true;
        this.f7037q = -1;
        C1949i.m2563d(aVar);
        this.f7031e = aVar;
    }
}
