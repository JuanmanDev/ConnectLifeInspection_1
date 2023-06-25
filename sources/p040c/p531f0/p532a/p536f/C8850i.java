package p040c.p531f0.p532a.p536f;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* renamed from: c.f0.a.f.i */
/* compiled from: SelectedStateListDrawable */
public class C8850i extends StateListDrawable {

    /* renamed from: e */
    public int f17210e;

    public C8850i(Drawable drawable, int i) {
        this.f17210e = i;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        if (z) {
            super.setColorFilter(this.f17210e, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
