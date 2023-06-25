package p040c.p531f0.p532a.p536f;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: c.f0.a.f.h */
/* compiled from: RotationGestureDetector */
public class C8847h {

    /* renamed from: a */
    public float f17201a;

    /* renamed from: b */
    public float f17202b;

    /* renamed from: c */
    public float f17203c;

    /* renamed from: d */
    public float f17204d;

    /* renamed from: e */
    public int f17205e = -1;

    /* renamed from: f */
    public int f17206f = -1;

    /* renamed from: g */
    public float f17207g;

    /* renamed from: h */
    public boolean f17208h;

    /* renamed from: i */
    public C8848a f17209i;

    /* renamed from: c.f0.a.f.h$a */
    /* compiled from: RotationGestureDetector */
    public interface C8848a {
        /* renamed from: a */
        boolean mo46038a(C8847h hVar);
    }

    /* renamed from: c.f0.a.f.h$b */
    /* compiled from: RotationGestureDetector */
    public static class C8849b implements C8848a {
    }

    public C8847h(C8848a aVar) {
        this.f17209i = aVar;
    }

    /* renamed from: a */
    public final float mo46034a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return mo46035b((float) Math.toDegrees((double) ((float) Math.atan2((double) (f2 - f4), (double) (f - f3)))), (float) Math.toDegrees((double) ((float) Math.atan2((double) (f6 - f8), (double) (f5 - f7)))));
    }

    /* renamed from: b */
    public final float mo46035b(float f, float f2) {
        float f3 = (f2 % 360.0f) - (f % 360.0f);
        this.f17207g = f3;
        if (f3 < -180.0f) {
            this.f17207g = f3 + 360.0f;
        } else if (f3 > 180.0f) {
            this.f17207g = f3 - 360.0f;
        }
        return this.f17207g;
    }

    /* renamed from: c */
    public float mo46036c() {
        return this.f17207g;
    }

    /* renamed from: d */
    public boolean mo46037d(@NonNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17203c = motionEvent.getX();
            this.f17204d = motionEvent.getY();
            this.f17205e = motionEvent2.findPointerIndex(motionEvent2.getPointerId(0));
            this.f17207g = 0.0f;
            this.f17208h = true;
        } else if (actionMasked == 1) {
            this.f17205e = -1;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.f17201a = motionEvent.getX();
                this.f17202b = motionEvent.getY();
                this.f17206f = motionEvent2.findPointerIndex(motionEvent2.getPointerId(motionEvent.getActionIndex()));
                this.f17207g = 0.0f;
                this.f17208h = true;
            } else if (actionMasked == 6) {
                this.f17206f = -1;
            }
        } else if (!(this.f17205e == -1 || this.f17206f == -1 || motionEvent.getPointerCount() <= this.f17206f)) {
            float x = motionEvent2.getX(this.f17205e);
            float y = motionEvent2.getY(this.f17205e);
            float x2 = motionEvent2.getX(this.f17206f);
            float y2 = motionEvent2.getY(this.f17206f);
            if (this.f17208h) {
                this.f17207g = 0.0f;
                this.f17208h = false;
            } else {
                mo46034a(this.f17201a, this.f17202b, this.f17203c, this.f17204d, x2, y2, x, y);
            }
            C8848a aVar = this.f17209i;
            if (aVar != null) {
                aVar.mo46038a(this);
            }
            this.f17201a = x2;
            this.f17202b = y2;
            this.f17203c = x;
            this.f17204d = y;
        }
        return true;
    }
}
