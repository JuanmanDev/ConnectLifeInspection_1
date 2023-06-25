package p040c.p200q.p201a.p219b.p250l0;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* renamed from: c.q.a.b.l0.a */
/* compiled from: Cue */
public class C3031a {

    /* renamed from: e */
    public final CharSequence f5334e;

    /* renamed from: l */
    public final Bitmap f5335l;

    /* renamed from: m */
    public final float f5336m;

    /* renamed from: n */
    public final float f5337n;

    public C3031a(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this((CharSequence) null, (Layout.Alignment) null, bitmap, f2, 0, i2, f, i, Integer.MIN_VALUE, Float.MIN_VALUE, f3, f4, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C3031a(CharSequence charSequence) {
        this(charSequence, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C3031a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    public C3031a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, (Bitmap) null, f, i, i2, f2, i3, i4, f4, f3, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C3031a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, (Bitmap) null, f, i, i2, f2, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f3, Float.MIN_VALUE, z, i4);
    }

    public C3031a(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5) {
        this.f5334e = charSequence;
        this.f5335l = bitmap;
        this.f5336m = f;
        this.f5337n = f2;
    }
}
