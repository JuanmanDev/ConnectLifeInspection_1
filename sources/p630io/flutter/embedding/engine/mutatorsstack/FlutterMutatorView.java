package p630io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p553f.p554a.p556d.p557a.C8906b;

/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView */
public class FlutterMutatorView extends FrameLayout {

    /* renamed from: e */
    public FlutterMutatorsStack f18511e;

    /* renamed from: l */
    public float f18512l;

    /* renamed from: m */
    public int f18513m;

    /* renamed from: n */
    public int f18514n;

    /* renamed from: o */
    public int f18515o;

    /* renamed from: p */
    public int f18516p;

    /* renamed from: q */
    public final C8906b f18517q;

    public FlutterMutatorView(@NonNull Context context, float f, @NonNull C8906b bVar) {
        super(context, (AttributeSet) null);
        this.f18512l = f;
        this.f18517q = bVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f18511e.getFinalMatrix());
        float f = this.f18512l;
        matrix.preScale(1.0f / f, 1.0f / f);
        matrix.postTranslate((float) (-this.f18513m), (float) (-this.f18514n));
        return matrix;
    }

    /* renamed from: a */
    public void mo47512a(@NonNull FlutterMutatorsStack flutterMutatorsStack, int i, int i2, int i3, int i4) {
        this.f18511e = flutterMutatorsStack;
        this.f18513m = i;
        this.f18514n = i2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f18511e.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset((float) (-this.f18513m), (float) (-this.f18514n));
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f18517q == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f18513m;
            this.f18515o = i;
            int i2 = this.f18514n;
            this.f18516p = i2;
            matrix.postTranslate((float) i, (float) i2);
        } else if (action != 2) {
            matrix.postTranslate((float) this.f18513m, (float) this.f18514n);
        } else {
            matrix.postTranslate((float) this.f18515o, (float) this.f18516p);
            this.f18515o = this.f18513m;
            this.f18516p = this.f18514n;
        }
        return this.f18517q.mo46317f(motionEvent, matrix);
    }

    public FlutterMutatorView(@NonNull Context context) {
        super(context, (AttributeSet) null);
        this.f18512l = 1.0f;
        this.f18517q = null;
    }
}
