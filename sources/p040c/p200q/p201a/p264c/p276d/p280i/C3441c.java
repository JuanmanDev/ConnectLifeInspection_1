package p040c.p200q.p201a.p264c.p276d.p280i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.base.zak;
import p040c.p200q.p201a.p264c.p276d.p281j.C3450c;

/* renamed from: c.q.a.c.d.i.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3441c {

    /* renamed from: a */
    public int f6399a;

    /* renamed from: a */
    public abstract void mo20636a(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    public final void mo20637b(Context context, zak zak, boolean z) {
        int i = this.f6399a;
        mo20636a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* renamed from: c */
    public final void mo20638c(Context context, Bitmap bitmap, boolean z) {
        C3450c.m8753c(bitmap);
        mo20636a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
