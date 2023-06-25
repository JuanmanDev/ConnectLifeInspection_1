package p040c.p077d.p078a.p081k.p082i;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.stetho.dumpapp.Framer;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: c.d.a.k.i.g */
/* compiled from: ExifOrientationStream */
public final class C1585g extends FilterInputStream {

    /* renamed from: m */
    public static final byte[] f931m;

    /* renamed from: n */
    public static final int f932n;

    /* renamed from: o */
    public static final int f933o;

    /* renamed from: e */
    public final byte f934e;

    /* renamed from: l */
    public int f935l;

    static {
        byte[] bArr = {-1, ExifInterface.MARKER_APP1, 0, 28, 69, Framer.EXIT_FRAME_PREFIX, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f931m = bArr;
        int length = bArr.length;
        f932n = length;
        f933o = length + 2;
    }

    public C1585g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f934e = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i;
        int i2;
        int i3 = this.f935l;
        if (i3 < 2 || i3 > (i2 = f933o)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f934e;
        } else {
            i = f931m[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f935l++;
        }
        return i;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f935l = (int) (((long) this.f935l) + skip);
        }
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f935l;
        int i5 = f933o;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f934e;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f931m, this.f935l - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f935l += i3;
        }
        return i3;
    }
}
