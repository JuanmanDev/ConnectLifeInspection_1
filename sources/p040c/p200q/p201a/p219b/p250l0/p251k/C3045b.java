package p040c.p200q.p201a.p219b.p250l0.p251k;

import android.text.Layout;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p219b.p250l0.C3031a;

/* renamed from: c.q.a.b.l0.k.b */
/* compiled from: Cea708Cue */
public final class C3045b extends C3031a implements Comparable<C3045b> {

    /* renamed from: o */
    public final int f5386o;

    public C3045b(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.f5386o = i5;
    }

    /* renamed from: c */
    public int compareTo(@NonNull C3045b bVar) {
        int i = bVar.f5386o;
        int i2 = this.f5386o;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
