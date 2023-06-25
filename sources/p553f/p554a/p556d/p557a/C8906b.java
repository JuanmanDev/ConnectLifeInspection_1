package p553f.p554a.p556d.p557a;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p553f.p554a.p556d.p558b.p568h.C8964a;

/* renamed from: f.a.d.a.b */
/* compiled from: AndroidTouchProcessor */
public class C8906b {

    /* renamed from: d */
    public static final Matrix f17448d = new Matrix();
    @NonNull

    /* renamed from: a */
    public final C8964a f17449a;
    @NonNull

    /* renamed from: b */
    public final C8912f f17450b = C8912f.m24120a();

    /* renamed from: c */
    public final boolean f17451c;

    public C8906b(@NonNull C8964a aVar, boolean z) {
        this.f17449a = aVar;
        this.f17451c = z;
    }

    /* renamed from: a */
    public final void mo46312a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        long j;
        double d;
        double d2;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i;
        int i5 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i5 != -1) {
            long d3 = this.f17451c ? this.f17450b.mo46365c(motionEvent2).mo46366d() : 0;
            int c = mo46314c(motionEvent.getToolType(i));
            int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(d3);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer2.putLong((long) i5);
            byteBuffer2.putLong((long) c);
            byteBuffer2.putLong((long) i6);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i));
            byteBuffer2.putLong(0);
            float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
            matrix.mapPoints(fArr);
            byteBuffer2.putDouble((double) fArr[0]);
            byteBuffer2.putDouble((double) fArr[1]);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            if (c == 1) {
                j = (long) (motionEvent.getButtonState() & 31);
                if (j == 0 && motionEvent.getSource() == 8194 && (i5 == 4 || i5 == 5)) {
                    j = 1;
                }
            } else {
                j = c == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            byteBuffer2.putLong(j);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i));
            double d4 = 1.0d;
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d = 0.0d;
            } else {
                double min = (double) motionRange.getMin();
                d4 = (double) motionRange.getMax();
                d = min;
            }
            byteBuffer2.putDouble(d);
            byteBuffer2.putDouble(d4);
            if (c == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i4));
                d2 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            } else {
                d2 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i));
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i4));
            if (c == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i4));
            } else {
                byteBuffer2.putDouble(d2);
            }
            byteBuffer2.putLong((long) i3);
            if (i6 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(9)));
                return;
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
        }
    }

    /* renamed from: b */
    public final int mo46313b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    /* renamed from: c */
    public final int mo46314c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 4 : 3;
        }
        return 1;
    }

    /* renamed from: d */
    public boolean mo46315d(@NonNull MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int b = mo46313b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 29 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        mo46312a(motionEvent, motionEvent.getActionIndex(), b, 0, f17448d, allocateDirect);
        if (allocateDirect.position() % 232 == 0) {
            this.f17449a.mo46482g(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    /* renamed from: e */
    public boolean mo46316e(@NonNull MotionEvent motionEvent) {
        return mo46317f(motionEvent, f17448d);
    }

    /* renamed from: f */
    public boolean mo46317f(@NonNull MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 29 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int b = mo46313b(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            mo46312a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    mo46312a(motionEvent, i, 5, 1, matrix, allocateDirect);
                }
            }
            mo46312a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect);
        } else {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                mo46312a(motionEvent, i2, b, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 232 == 0) {
            this.f17449a.mo46482g(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
