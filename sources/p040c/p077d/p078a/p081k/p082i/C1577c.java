package p040c.p077d.p078a.p081k.p082i;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.OutputStream;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.i.c */
/* compiled from: BufferedOutputStream */
public final class C1577c extends OutputStream {
    @NonNull

    /* renamed from: e */
    public final OutputStream f924e;

    /* renamed from: l */
    public byte[] f925l;

    /* renamed from: m */
    public C1692b f926m;

    /* renamed from: n */
    public int f927n;

    public C1577c(@NonNull OutputStream outputStream, @NonNull C1692b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: a */
    public final void mo15635a() {
        int i = this.f927n;
        if (i > 0) {
            this.f924e.write(this.f925l, 0, i);
            this.f927n = 0;
        }
    }

    /* renamed from: b */
    public final void mo15636b() {
        if (this.f927n == this.f925l.length) {
            mo15635a();
        }
    }

    /* renamed from: c */
    public final void mo15637c() {
        byte[] bArr = this.f925l;
        if (bArr != null) {
            this.f926m.put(bArr);
            this.f925l = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f924e.close();
            mo15637c();
        } catch (Throwable th) {
            this.f924e.close();
            throw th;
        }
    }

    public void flush() {
        mo15635a();
        this.f924e.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f925l;
        int i2 = this.f927n;
        this.f927n = i2 + 1;
        bArr[i2] = (byte) i;
        mo15636b();
    }

    @VisibleForTesting
    public C1577c(@NonNull OutputStream outputStream, C1692b bVar, int i) {
        this.f924e = outputStream;
        this.f926m = bVar;
        this.f925l = (byte[]) bVar.mo15901d(i, byte[].class);
    }

    public void write(@NonNull byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f927n != 0 || i4 < this.f925l.length) {
                int min = Math.min(i4, this.f925l.length - this.f927n);
                System.arraycopy(bArr, i5, this.f925l, this.f927n, min);
                this.f927n += min;
                i3 += min;
                mo15636b();
            } else {
                this.f924e.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
