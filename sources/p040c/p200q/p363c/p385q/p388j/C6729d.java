package p040c.p200q.p363c.p385q.p388j;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* renamed from: c.q.c.q.j.d */
/* compiled from: LengthCountingOutputStream */
public final class C6729d extends OutputStream {

    /* renamed from: e */
    public long f12870e = 0;

    /* renamed from: a */
    public long mo31380a() {
        return this.f12870e;
    }

    public void write(int i) {
        this.f12870e++;
    }

    public void write(byte[] bArr) {
        this.f12870e += (long) bArr.length;
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f12870e += (long) i2;
    }
}
