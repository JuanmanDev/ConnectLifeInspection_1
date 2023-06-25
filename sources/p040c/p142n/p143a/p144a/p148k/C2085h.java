package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.C2065e;
import p040c.p142n.p143a.p144a.C2066f;
import p040c.p142n.p143a.p144a.p147j.C2072a;
import p040c.p142n.p143a.p144a.p147j.C2073b;

/* renamed from: c.n.a.a.k.h */
/* compiled from: UTF8JsonGenerator */
public class C2085h extends C2080c {

    /* renamed from: p */
    public final OutputStream f1992p;

    /* renamed from: q */
    public byte[] f1993q;

    /* renamed from: r */
    public int f1994r = 0;

    /* renamed from: s */
    public final int f1995s;

    /* renamed from: t */
    public char[] f1996t;

    /* renamed from: u */
    public boolean f1997u;

    static {
        C2072a.m2898b();
    }

    public C2085h(C2073b bVar, int i, C2064d dVar, OutputStream outputStream) {
        super(bVar, i, dVar);
        this.f1992p = outputStream;
        this.f1997u = true;
        byte[] h = bVar.mo16720h();
        this.f1993q = h;
        this.f1995s = h.length;
        char[] d = bVar.mo16716d();
        this.f1996t = d;
        int length = d.length;
        if (mo16707h(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            mo16774j(127);
        }
        JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    /* renamed from: b */
    public void mo16780b(char c) {
        if (this.f1994r + 3 >= this.f1995s) {
            mo16785n();
        }
        byte[] bArr = this.f1993q;
        if (c <= 127) {
            int i = this.f1994r;
            this.f1994r = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this.f1994r;
            int i3 = i2 + 1;
            this.f1994r = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f1994r = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            mo16786o(c, (char[]) null, 0, 0);
        }
    }

    /* renamed from: c */
    public void mo16781c(C2066f fVar) {
        byte[] asUnquotedUTF8 = fVar.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            mo16789s(asUnquotedUTF8);
        }
    }

    public void close() {
        super.close();
        if (this.f1993q != null && mo16707h(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C2082e g = mo16706g();
                if (!g.mo16698d()) {
                    if (!g.mo16699e()) {
                        break;
                    }
                    mo16792x();
                } else {
                    mo16791w();
                }
            }
        }
        mo16785n();
        if (this.f1992p != null) {
            if (this.f1983n.mo16723k() || mo16707h(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.f1992p.close();
            } else if (mo16707h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f1992p.flush();
            }
        }
        mo16788r();
    }

    /* renamed from: d */
    public void mo16782d(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.f1996t;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            mo16783e(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r7 >= 2048) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r5.f1993q;
        r2 = r5.f1994r;
        r3 = r2 + 1;
        r5.f1994r = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5.f1994r = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r7 = mo16786o(r7, r6, r0, r8);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16783e(char[] r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5.f1994r
            int r1 = r1 + r0
            int r2 = r5.f1995s
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5.mo16790u(r6, r7, r8)
            return
        L_0x0010:
            r5.mo16785n()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x0054
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0045
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x0040
            byte[] r1 = r5.f1993q
            int r2 = r5.f1994r
            int r3 = r2 + 1
            r5.f1994r = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5.f1994r = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            r7 = r0
            goto L_0x0014
        L_0x0040:
            int r7 = r5.mo16786o(r7, r6, r0, r8)
            goto L_0x0014
        L_0x0045:
            byte[] r1 = r5.f1993q
            int r2 = r5.f1994r
            int r3 = r2 + 1
            r5.f1994r = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p142n.p143a.p144a.p148k.C2085h.mo16783e(char[], int, int):void");
    }

    public void flush() {
        mo16785n();
        if (this.f1992p != null && mo16707h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f1992p.flush();
        }
    }

    /* renamed from: n */
    public final void mo16785n() {
        int i = this.f1994r;
        if (i > 0) {
            this.f1994r = 0;
            this.f1992p.write(this.f1993q, 0, i);
        }
    }

    /* renamed from: o */
    public final int mo16786o(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f1993q;
            int i4 = this.f1994r;
            int i5 = i4 + 1;
            this.f1994r = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            this.f1994r = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.f1994r = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        } else if (i2 >= i3 || cArr == null) {
            mo23312a("Split surrogate on writeRaw() input (last character)");
            throw null;
        } else {
            mo16787q(i, cArr[i2]);
            return i2 + 1;
        }
    }

    /* renamed from: q */
    public final void mo16787q(int i, int i2) {
        int f = mo16705f(i, i2);
        if (this.f1994r + 4 > this.f1995s) {
            mo16785n();
        }
        byte[] bArr = this.f1993q;
        int i3 = this.f1994r;
        int i4 = i3 + 1;
        this.f1994r = i4;
        bArr[i3] = (byte) ((f >> 18) | 240);
        int i5 = i4 + 1;
        this.f1994r = i5;
        bArr[i4] = (byte) (((f >> 12) & 63) | 128);
        int i6 = i5 + 1;
        this.f1994r = i6;
        bArr[i5] = (byte) (((f >> 6) & 63) | 128);
        this.f1994r = i6 + 1;
        bArr[i6] = (byte) ((f & 63) | 128);
    }

    /* renamed from: r */
    public void mo16788r() {
        byte[] bArr = this.f1993q;
        if (bArr != null && this.f1997u) {
            this.f1993q = null;
            this.f1983n.mo16728p(bArr);
        }
        char[] cArr = this.f1996t;
        if (cArr != null) {
            this.f1996t = null;
            this.f1983n.mo16724l(cArr);
        }
    }

    /* renamed from: s */
    public final void mo16789s(byte[] bArr) {
        int length = bArr.length;
        if (this.f1994r + length > this.f1995s) {
            mo16785n();
            if (length > 512) {
                this.f1992p.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f1993q, this.f1994r, length);
        this.f1994r += length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r9 = mo16786o(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if ((r7.f1994r + 3) < r7.f1995s) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        mo16785n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r9 >= 2048) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r7.f1994r;
        r5 = r4 + 1;
        r7.f1994r = r5;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7.f1994r = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16790u(char[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.f1995s
            byte[] r1 = r7.f1993q
        L_0x0004:
            if (r9 >= r10) goto L_0x0051
        L_0x0006:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003d
            int r2 = r7.f1994r
            int r2 = r2 + 3
            int r4 = r7.f1995s
            if (r2 < r4) goto L_0x0017
            r7.mo16785n()
        L_0x0017:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0038
            int r4 = r7.f1994r
            int r5 = r4 + 1
            r7.f1994r = r5
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7.f1994r = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0004
        L_0x0038:
            int r9 = r7.mo16786o(r9, r8, r2, r10)
            goto L_0x0004
        L_0x003d:
            int r3 = r7.f1994r
            if (r3 < r0) goto L_0x0044
            r7.mo16785n()
        L_0x0044:
            int r3 = r7.f1994r
            int r4 = r3 + 1
            r7.f1994r = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0006
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p142n.p143a.p144a.p148k.C2085h.mo16790u(char[], int, int):void");
    }

    /* renamed from: w */
    public final void mo16791w() {
        if (this.f1920m.mo16698d()) {
            C2065e eVar = this.f7196e;
            if (eVar != null) {
                eVar.writeEndArray(this, this.f1920m.mo16696b());
            } else {
                if (this.f1994r >= this.f1995s) {
                    mo16785n();
                }
                byte[] bArr = this.f1993q;
                int i = this.f1994r;
                this.f1994r = i + 1;
                bArr[i] = 93;
            }
            this.f1920m = this.f1920m.mo16778h();
            return;
        }
        mo23312a("Current context not an ARRAY but " + this.f1920m.mo16697c());
        throw null;
    }

    /* renamed from: x */
    public final void mo16792x() {
        if (this.f1920m.mo16699e()) {
            C2065e eVar = this.f7196e;
            if (eVar != null) {
                eVar.writeEndObject(this, this.f1920m.mo16696b());
            } else {
                if (this.f1994r >= this.f1995s) {
                    mo16785n();
                }
                byte[] bArr = this.f1993q;
                int i = this.f1994r;
                this.f1994r = i + 1;
                bArr[i] = 125;
            }
            this.f1920m = this.f1920m.mo16778h();
            return;
        }
        mo23312a("Current context not an object but " + this.f1920m.mo16697c());
        throw null;
    }
}
