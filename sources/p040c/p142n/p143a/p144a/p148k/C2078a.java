package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.p146i.C2071a;
import p040c.p142n.p143a.p144a.p147j.C2073b;
import p040c.p142n.p143a.p144a.p147j.C2075d;
import p040c.p142n.p143a.p144a.p147j.C2076e;
import p040c.p142n.p143a.p144a.p149l.C2088a;
import p040c.p142n.p143a.p144a.p149l.C2091b;

/* renamed from: c.n.a.a.k.a */
/* compiled from: ByteSourceJsonBootstrapper */
public final class C2078a {

    /* renamed from: a */
    public final C2073b f1973a;

    /* renamed from: b */
    public final InputStream f1974b;

    /* renamed from: c */
    public final byte[] f1975c;

    /* renamed from: d */
    public int f1976d;

    /* renamed from: e */
    public int f1977e;

    /* renamed from: f */
    public final boolean f1978f;

    /* renamed from: g */
    public boolean f1979g = true;

    /* renamed from: h */
    public int f1980h = 0;

    public C2078a(C2073b bVar, InputStream inputStream) {
        this.f1973a = bVar;
        this.f1974b = inputStream;
        this.f1975c = bVar.mo16717e();
        this.f1976d = 0;
        this.f1977e = 0;
        this.f1978f = true;
    }

    /* renamed from: h */
    public static MatchStrength m2940h(C2071a aVar) {
        if (!aVar.mo16711a()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte = aVar.nextByte();
        if (nextByte == -17) {
            if (!aVar.mo16711a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!aVar.mo16711a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!aVar.mo16711a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            nextByte = aVar.nextByte();
        }
        int k = m2942k(aVar, nextByte);
        if (k < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (k == 123) {
            int j = m2941j(aVar);
            if (j < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (j == 34 || j == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        } else if (k == 91) {
            int j2 = m2941j(aVar);
            if (j2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (j2 == 93 || j2 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        } else {
            MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
            if (k == 34) {
                return matchStrength;
            }
            if (k <= 57 && k >= 48) {
                return matchStrength;
            }
            if (k == 45) {
                int j3 = m2941j(aVar);
                if (j3 < 0) {
                    return MatchStrength.INCONCLUSIVE;
                }
                return (j3 > 57 || j3 < 48) ? MatchStrength.NO_MATCH : matchStrength;
            } else if (k == 110) {
                return m2943l(aVar, "ull", matchStrength);
            } else {
                if (k == 116) {
                    return m2943l(aVar, "rue", matchStrength);
                }
                if (k == 102) {
                    return m2943l(aVar, "alse", matchStrength);
                }
                return MatchStrength.NO_MATCH;
            }
        }
    }

    /* renamed from: j */
    public static int m2941j(C2071a aVar) {
        if (!aVar.mo16711a()) {
            return -1;
        }
        return m2942k(aVar, aVar.nextByte());
    }

    /* renamed from: k */
    public static int m2942k(C2071a aVar, byte b) {
        while (true) {
            byte b2 = b & 255;
            if (b2 != 32 && b2 != 13 && b2 != 10 && b2 != 9) {
                return b2;
            }
            if (!aVar.mo16711a()) {
                return -1;
            }
            b = aVar.nextByte();
        }
    }

    /* renamed from: l */
    public static MatchStrength m2943l(C2071a aVar, String str, MatchStrength matchStrength) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!aVar.mo16711a()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (aVar.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    /* renamed from: a */
    public final boolean mo16765a(int i) {
        if ((65280 & i) == 0) {
            this.f1979g = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f1979g = false;
        }
        this.f1980h = 2;
        return true;
    }

    /* renamed from: b */
    public final boolean mo16766b(int i) {
        if ((i >> 8) == 0) {
            this.f1979g = true;
        } else if ((16777215 & i) == 0) {
            this.f1979g = false;
        } else if ((-16711681 & i) == 0) {
            mo16772i("3412");
            throw null;
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            mo16772i("2143");
            throw null;
        }
        this.f1980h = 4;
        return true;
    }

    /* renamed from: c */
    public JsonParser mo16767c(int i, C2064d dVar, C2088a aVar, C2091b bVar, int i2) {
        int i3 = i2;
        if (mo16769e() != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new C2084g(this.f1973a, i, mo16768d(), dVar, bVar.mo16806f(i2));
        }
        return new C2086i(this.f1973a, i, this.f1974b, dVar, aVar.mo16800d(i3), this.f1975c, this.f1976d, this.f1977e, this.f1978f);
    }

    /* renamed from: d */
    public Reader mo16768d() {
        JsonEncoding j = this.f1973a.mo16722j();
        int bits = j.bits();
        if (bits == 8 || bits == 16) {
            InputStream inputStream = this.f1974b;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(this.f1975c, this.f1976d, this.f1977e);
            } else if (this.f1976d < this.f1977e) {
                inputStream = new C2075d(this.f1973a, inputStream, this.f1975c, this.f1976d, this.f1977e);
            }
            return new InputStreamReader(inputStream, j.getJavaName());
        } else if (bits == 32) {
            C2073b bVar = this.f1973a;
            return new C2076e(bVar, this.f1974b, this.f1975c, this.f1976d, this.f1977e, bVar.mo16722j().isBigEndian());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (mo16765a((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (mo16765a(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonEncoding mo16769e() {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.mo16770f(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8.f1975c
            int r5 = r8.f1976d
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.mo16771g(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.mo16766b(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.mo16765a(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.mo16770f(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8.f1975c
            int r5 = r8.f1976d
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.mo16765a(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 != 0) goto L_0x0064
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L_0x008a
        L_0x0064:
            int r1 = r8.f1980h
            if (r1 == r3) goto L_0x0088
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8.f1979g
            if (r0 == 0) goto L_0x0073
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L_0x008a
        L_0x0073:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L_0x008a
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8.f1979g
            if (r0 == 0) goto L_0x0085
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L_0x008a
        L_0x0085:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L_0x008a
        L_0x0088:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L_0x008a:
            c.n.a.a.j.b r1 = r8.f1973a
            r1.mo16729q(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p142n.p143a.p144a.p148k.C2078a.mo16769e():com.fasterxml.jackson.core.JsonEncoding");
    }

    /* renamed from: f */
    public boolean mo16770f(int i) {
        int i2;
        int i3 = this.f1977e - this.f1976d;
        while (i3 < i) {
            InputStream inputStream = this.f1974b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f1975c;
                int i4 = this.f1977e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f1977e += i2;
            i3 += i2;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo16771g(int i) {
        if (i == -16842752) {
            mo16772i("3412");
            throw null;
        } else if (i == -131072) {
            this.f1976d += 4;
            this.f1980h = 4;
            this.f1979g = false;
            return true;
        } else if (i == 65279) {
            this.f1979g = true;
            this.f1976d += 4;
            this.f1980h = 4;
            return true;
        } else if (i != 65534) {
            int i2 = i >>> 16;
            if (i2 == 65279) {
                this.f1976d += 2;
                this.f1980h = 2;
                this.f1979g = true;
                return true;
            } else if (i2 == 65534) {
                this.f1976d += 2;
                this.f1980h = 2;
                this.f1979g = false;
                return true;
            } else if ((i >>> 8) != 15711167) {
                return false;
            } else {
                this.f1976d += 3;
                this.f1980h = 1;
                this.f1979g = true;
                return true;
            }
        } else {
            mo16772i("2143");
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo16772i(String str) {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public C2078a(C2073b bVar, byte[] bArr, int i, int i2) {
        this.f1973a = bVar;
        this.f1974b = null;
        this.f1975c = bArr;
        this.f1976d = i;
        this.f1977e = i + i2;
        this.f1978f = false;
    }
}
