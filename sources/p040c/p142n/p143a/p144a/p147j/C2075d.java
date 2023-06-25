package p040c.p142n.p143a.p144a.p147j;

import java.io.InputStream;

/* renamed from: c.n.a.a.j.d */
/* compiled from: MergedStream */
public final class C2075d extends InputStream {

    /* renamed from: e */
    public final C2073b f1951e;

    /* renamed from: l */
    public final InputStream f1952l;

    /* renamed from: m */
    public byte[] f1953m;

    /* renamed from: n */
    public int f1954n;

    /* renamed from: o */
    public final int f1955o;

    public C2075d(C2073b bVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f1951e = bVar;
        this.f1952l = inputStream;
        this.f1953m = bArr;
        this.f1954n = i;
        this.f1955o = i2;
    }

    /* renamed from: a */
    public final void mo16737a() {
        byte[] bArr = this.f1953m;
        if (bArr != null) {
            this.f1953m = null;
            C2073b bVar = this.f1951e;
            if (bVar != null) {
                bVar.mo16726n(bArr);
            }
        }
    }

    public int available() {
        if (this.f1953m != null) {
            return this.f1955o - this.f1954n;
        }
        return this.f1952l.available();
    }

    public void close() {
        mo16737a();
        this.f1952l.close();
    }

    public void mark(int i) {
        if (this.f1953m == null) {
            this.f1952l.mark(i);
        }
    }

    public boolean markSupported() {
        return this.f1953m == null && this.f1952l.markSupported();
    }

    public int read() {
        byte[] bArr = this.f1953m;
        if (bArr == null) {
            return this.f1952l.read();
        }
        int i = this.f1954n;
        int i2 = i + 1;
        this.f1954n = i2;
        byte b = bArr[i] & 255;
        if (i2 >= this.f1955o) {
            mo16737a();
        }
        return b;
    }

    public void reset() {
        if (this.f1953m == null) {
            this.f1952l.reset();
        }
    }

    public long skip(long j) {
        long j2;
        if (this.f1953m != null) {
            int i = this.f1955o;
            int i2 = this.f1954n;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this.f1954n = i2 + ((int) j);
                return j;
            }
            mo16737a();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f1952l.skip(j) : j2;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.f1953m == null) {
            return this.f1952l.read(bArr, i, i2);
        }
        int i3 = this.f1955o - this.f1954n;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f1953m, this.f1954n, bArr, i, i2);
        int i4 = this.f1954n + i2;
        this.f1954n = i4;
        if (i4 >= this.f1955o) {
            mo16737a();
        }
        return i2;
    }
}
