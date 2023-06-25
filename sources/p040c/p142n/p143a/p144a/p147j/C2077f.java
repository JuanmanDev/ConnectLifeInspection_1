package p040c.p142n.p143a.p144a.p147j;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import okio.Utf8;

/* renamed from: c.n.a.a.j.f */
/* compiled from: UTF8Writer */
public final class C2077f extends Writer {

    /* renamed from: e */
    public final C2073b f1967e;

    /* renamed from: l */
    public OutputStream f1968l;

    /* renamed from: m */
    public byte[] f1969m;

    /* renamed from: n */
    public final int f1970n;

    /* renamed from: o */
    public int f1971o;

    /* renamed from: p */
    public int f1972p = 0;

    public C2077f(C2073b bVar, OutputStream outputStream) {
        this.f1967e = bVar;
        this.f1968l = outputStream;
        byte[] h = bVar.mo16720h();
        this.f1969m = h;
        this.f1970n = h.length - 4;
        this.f1971o = 0;
    }

    /* renamed from: b */
    public static void m2937b(int i) {
        throw new IOException(m2938c(i));
    }

    /* renamed from: c */
    public static String m2938c(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        } else if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        } else if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        } else {
            return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
    }

    /* renamed from: a */
    public int mo16756a(int i) {
        int i2 = this.f1972p;
        this.f1972p = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    public void close() {
        OutputStream outputStream = this.f1968l;
        if (outputStream != null) {
            int i = this.f1971o;
            if (i > 0) {
                outputStream.write(this.f1969m, 0, i);
                this.f1971o = 0;
            }
            OutputStream outputStream2 = this.f1968l;
            this.f1968l = null;
            byte[] bArr = this.f1969m;
            if (bArr != null) {
                this.f1969m = null;
                this.f1967e.mo16728p(bArr);
            }
            outputStream2.close();
            int i2 = this.f1972p;
            this.f1972p = 0;
            if (i2 > 0) {
                m2937b(i2);
                throw null;
            }
        }
    }

    public void flush() {
        OutputStream outputStream = this.f1968l;
        if (outputStream != null) {
            int i = this.f1971o;
            if (i > 0) {
                outputStream.write(this.f1969m, 0, i);
                this.f1971o = 0;
            }
            this.f1968l.flush();
        }
    }

    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) {
        if (i2 >= 2) {
            if (this.f1972p > 0) {
                i2--;
                write(mo16756a(cArr[i]));
                i++;
            }
            int i3 = this.f1971o;
            byte[] bArr = this.f1969m;
            int i4 = this.f1970n;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f1968l.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char c = cArr[r9];
                if (c < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) c;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        c = cArr[r9];
                        if (c >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) c;
                    }
                }
                if (c < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((c & '?') | 128);
                    r9 = i6;
                } else if (c < 55296 || c > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 12) | 224);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((c >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((c & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else if (c <= 56319) {
                    this.f1972p = c;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int a = mo16756a(cArr[i6]);
                    if (a <= 1114111) {
                        int i14 = i3 + 1;
                        bArr[i3] = (byte) ((a >> 18) | 240);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((a >> 12) & 63) | 128);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((a >> 6) & 63) | 128);
                        i3 = i16 + 1;
                        bArr[i16] = (byte) ((a & 63) | 128);
                    } else {
                        this.f1971o = i3;
                        m2937b(a);
                        throw null;
                    }
                } else {
                    this.f1971o = i3;
                    m2937b(c);
                    throw null;
                }
            }
            this.f1971o = i3;
        } else if (i2 == 1) {
            write((int) cArr[i]);
        }
    }

    public void write(int i) {
        int i2;
        if (this.f1972p > 0) {
            i = mo16756a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i <= 56319) {
                this.f1972p = i;
                return;
            } else {
                m2937b(i);
                throw null;
            }
        }
        int i3 = this.f1971o;
        if (i3 >= this.f1970n) {
            this.f1968l.write(this.f1969m, 0, i3);
            this.f1971o = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f1969m;
            int i4 = this.f1971o;
            this.f1971o = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f1971o;
        if (i < 2048) {
            byte[] bArr2 = this.f1969m;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i6 + 1;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.f1969m;
            int i7 = i5 + 1;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i8 = i7 + 1;
            bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i8] = (byte) ((i & 63) | 128);
            i2 = i8 + 1;
        } else if (i <= 1114111) {
            byte[] bArr4 = this.f1969m;
            int i9 = i5 + 1;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            int i10 = i9 + 1;
            bArr4[i9] = (byte) (((i >> 12) & 63) | 128);
            int i11 = i10 + 1;
            bArr4[i10] = (byte) (((i >> 6) & 63) | 128);
            i2 = i11 + 1;
            bArr4[i11] = (byte) ((i & 63) | 128);
        } else {
            m2937b(i);
            throw null;
        }
        this.f1971o = i2;
    }

    public void write(String str) {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) {
        if (i2 >= 2) {
            if (this.f1972p > 0) {
                i2--;
                write(mo16756a(str.charAt(i)));
                i++;
            }
            int i3 = this.f1971o;
            byte[] bArr = this.f1969m;
            int i4 = this.f1970n;
            int i5 = i2 + r9;
            while (r9 < i5) {
                if (i3 >= i4) {
                    this.f1968l.write(bArr, 0, i3);
                    i3 = 0;
                }
                int i6 = r9 + 1;
                char charAt = str.charAt(r9);
                if (charAt < 128) {
                    int i7 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    int i8 = i5 - i6;
                    int i9 = i4 - i7;
                    if (i8 > i9) {
                        i8 = i9;
                    }
                    int i10 = i8 + i6;
                    while (true) {
                        r9 = i6;
                        i3 = i7;
                        if (r9 >= i10) {
                            continue;
                            break;
                        }
                        i6 = r9 + 1;
                        charAt = str.charAt(r9);
                        if (charAt >= 128) {
                            break;
                        }
                        i7 = i3 + 1;
                        bArr[i3] = (byte) charAt;
                    }
                }
                if (charAt < 2048) {
                    int i11 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i11 + 1;
                    bArr[i11] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 12) | 224);
                    int i13 = i12 + 1;
                    bArr[i12] = (byte) (((charAt >> 6) & 63) | 128);
                    bArr[i13] = (byte) ((charAt & '?') | 128);
                    r9 = i6;
                    i3 = i13 + 1;
                } else if (charAt <= 56319) {
                    this.f1972p = charAt;
                    if (i6 >= i5) {
                        break;
                    }
                    r9 = i6 + 1;
                    int a = mo16756a(str.charAt(i6));
                    if (a <= 1114111) {
                        int i14 = i3 + 1;
                        bArr[i3] = (byte) ((a >> 18) | 240);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((a >> 12) & 63) | 128);
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) (((a >> 6) & 63) | 128);
                        i3 = i16 + 1;
                        bArr[i16] = (byte) ((a & 63) | 128);
                    } else {
                        this.f1971o = i3;
                        m2937b(a);
                        throw null;
                    }
                } else {
                    this.f1971o = i3;
                    m2937b(charAt);
                    throw null;
                }
            }
            this.f1971o = i3;
        } else if (i2 == 1) {
            write((int) str.charAt(i));
        }
    }
}
