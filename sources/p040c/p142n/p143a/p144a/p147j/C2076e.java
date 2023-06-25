package p040c.p142n.p143a.p144a.p147j;

import androidx.test.internal.runner.RunnerArgs;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: c.n.a.a.j.e */
/* compiled from: UTF32Reader */
public class C2076e extends Reader {

    /* renamed from: e */
    public final C2073b f1956e;

    /* renamed from: l */
    public InputStream f1957l;

    /* renamed from: m */
    public byte[] f1958m;

    /* renamed from: n */
    public int f1959n;

    /* renamed from: o */
    public int f1960o;

    /* renamed from: p */
    public final boolean f1961p;

    /* renamed from: q */
    public char f1962q = 0;

    /* renamed from: r */
    public int f1963r = 0;

    /* renamed from: s */
    public int f1964s = 0;

    /* renamed from: t */
    public final boolean f1965t;

    /* renamed from: u */
    public char[] f1966u = null;

    public C2076e(C2073b bVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this.f1956e = bVar;
        this.f1957l = inputStream;
        this.f1958m = bArr;
        this.f1959n = i;
        this.f1960o = i2;
        this.f1961p = z;
        this.f1965t = inputStream != null ? true : z2;
    }

    /* renamed from: a */
    public final void mo16747a() {
        byte[] bArr = this.f1958m;
        if (bArr != null) {
            this.f1958m = null;
            this.f1956e.mo16726n(bArr);
        }
    }

    /* renamed from: b */
    public final boolean mo16748b(int i) {
        int i2;
        this.f1964s += this.f1960o - i;
        if (i > 0) {
            int i3 = this.f1959n;
            if (i3 > 0) {
                byte[] bArr = this.f1958m;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this.f1959n = 0;
            }
            this.f1960o = i;
        } else {
            this.f1959n = 0;
            InputStream inputStream = this.f1957l;
            int read = inputStream == null ? -1 : inputStream.read(this.f1958m);
            if (read < 1) {
                this.f1960o = 0;
                if (read < 0) {
                    if (this.f1965t) {
                        mo16747a();
                    }
                    return false;
                }
                mo16752e();
                throw null;
            }
            this.f1960o = read;
        }
        while (true) {
            int i4 = this.f1960o;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f1957l;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.f1958m;
                i2 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            }
            if (i2 >= 1) {
                this.f1960o += i2;
            } else if (i2 < 0) {
                if (this.f1965t) {
                    mo16747a();
                }
                mo16753f(this.f1960o, 4);
                throw null;
            } else {
                mo16752e();
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final void mo16749c(char[] cArr, int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + RunnerArgs.CLASS_SEPARATOR + i2 + "), cbuf[" + cArr.length + "]");
    }

    public void close() {
        InputStream inputStream = this.f1957l;
        if (inputStream != null) {
            this.f1957l = null;
            mo16747a();
            inputStream.close();
        }
    }

    /* renamed from: d */
    public final void mo16751d(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this.f1963r + i2);
        sb.append(", byte #");
        sb.append((this.f1964s + this.f1959n) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: e */
    public final void mo16752e() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    /* renamed from: f */
    public final void mo16753f(int i, int i2) {
        int i3 = this.f1963r;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this.f1964s + i) + ")");
    }

    public int read() {
        if (this.f1966u == null) {
            this.f1966u = new char[1];
        }
        if (read(this.f1966u, 0, 1) < 1) {
            return -1;
        }
        return this.f1966u[0];
    }

    public int read(char[] cArr, int i, int i2) {
        int i3;
        byte b;
        int i4;
        int i5;
        if (this.f1958m == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            mo16749c(cArr, i, i2);
            throw null;
        }
        int i6 = i2 + i;
        char c = this.f1962q;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.f1962q = 0;
        } else {
            int i7 = this.f1960o - this.f1959n;
            if (i7 < 4 && !mo16748b(i7)) {
                return -1;
            }
            i3 = i;
        }
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i8 = this.f1959n;
            if (this.f1961p) {
                byte[] bArr = this.f1958m;
                b = (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
                i4 = bArr[i8 + 3] & 255;
            } else {
                byte[] bArr2 = this.f1958m;
                b = (bArr2[i8] & 255) | ((bArr2[i8 + 1] & 255) << 8) | ((bArr2[i8 + 2] & 255) << 16);
                i4 = bArr2[i8 + 3] << 24;
            }
            byte b2 = i4 | b;
            this.f1959n += 4;
            if (b2 > 65535) {
                if (b2 <= 1114111) {
                    int i9 = b2 - 65536;
                    i5 = i3 + 1;
                    cArr[i3] = (char) ((i9 >> 10) + 55296);
                    b2 = (i9 & 1023) | 56320;
                    if (i5 >= i6) {
                        this.f1962q = (char) b2;
                        break;
                    }
                    i3 = i5;
                } else {
                    mo16751d(b2, i3 - i, "(above " + Integer.toHexString(1114111) + ") ");
                    throw null;
                }
            }
            i5 = i3 + 1;
            cArr[i3] = (char) b2;
            if (this.f1959n >= this.f1960o) {
                break;
            }
            i3 = i5;
        }
        i3 = i5;
        int i10 = i3 - i;
        this.f1963r += i10;
        return i10;
    }
}
