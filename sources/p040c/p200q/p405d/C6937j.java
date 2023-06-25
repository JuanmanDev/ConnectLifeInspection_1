package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.d.j */
/* compiled from: CodedInputStream */
public abstract class C6937j {

    /* renamed from: a */
    public int f13271a;

    /* renamed from: b */
    public int f13272b;

    /* renamed from: c */
    public int f13273c;

    /* renamed from: d */
    public C6945k f13274d;

    /* renamed from: c.q.d.j$b */
    /* compiled from: CodedInputStream */
    public static final class C6939b extends C6937j {

        /* renamed from: e */
        public final byte[] f13275e;

        /* renamed from: f */
        public final boolean f13276f;

        /* renamed from: g */
        public int f13277g;

        /* renamed from: h */
        public int f13278h;

        /* renamed from: i */
        public int f13279i;

        /* renamed from: j */
        public int f13280j;

        /* renamed from: k */
        public int f13281k;

        /* renamed from: l */
        public boolean f13282l;

        /* renamed from: m */
        public int f13283m;

        /* renamed from: A */
        public String mo32023A() {
            int K = mo32051K();
            if (K > 0 && K <= this.f13277g - this.f13279i) {
                String str = new String(this.f13275e, this.f13279i, K, C6999y.f13392a);
                this.f13279i += K;
                return str;
            } else if (K == 0) {
                return "";
            } else {
                if (K < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: B */
        public String mo32024B() {
            int K = mo32051K();
            if (K > 0) {
                int i = this.f13277g;
                int i2 = this.f13279i;
                if (K <= i - i2) {
                    String h = C6969o1.m20443h(this.f13275e, i2, K);
                    this.f13279i += K;
                    return h;
                }
            }
            if (K == 0) {
                return "";
            }
            if (K <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: C */
        public int mo32025C() {
            if (mo32031e()) {
                this.f13281k = 0;
                return 0;
            }
            int K = mo32051K();
            this.f13281k = K;
            if (WireFormat.m23292a(K) != 0) {
                return this.f13281k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: D */
        public int mo32026D() {
            return mo32051K();
        }

        /* renamed from: E */
        public long mo32027E() {
            return mo32052L();
        }

        /* renamed from: F */
        public boolean mo32028F(int i) {
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                mo32057Q();
                return true;
            } else if (b == 1) {
                mo32056P(8);
                return true;
            } else if (b == 2) {
                mo32056P(mo32051K());
                return true;
            } else if (b == 3) {
                mo32055O();
                mo32029a(WireFormat.m23294c(WireFormat.m23292a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo32056P(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: G */
        public byte mo32047G() {
            int i = this.f13279i;
            if (i != this.f13277g) {
                byte[] bArr = this.f13275e;
                this.f13279i = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: H */
        public byte[] mo32048H(int i) {
            if (i > 0) {
                int i2 = this.f13277g;
                int i3 = this.f13279i;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f13279i = i4;
                    return Arrays.copyOfRange(this.f13275e, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return C6999y.f13393b;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        /* renamed from: I */
        public int mo32049I() {
            int i = this.f13279i;
            if (this.f13277g - i >= 4) {
                byte[] bArr = this.f13275e;
                this.f13279i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: J */
        public long mo32050J() {
            int i = this.f13279i;
            if (this.f13277g - i >= 8) {
                byte[] bArr = this.f13275e;
                this.f13279i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32051K() {
            /*
                r5 = this;
                int r0 = r5.f13279i
                int r1 = r5.f13277g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13275e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13279i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo32053M()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13279i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6939b.mo32051K():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo32052L() {
            /*
                r11 = this;
                int r0 = r11.f13279i
                int r1 = r11.f13277g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13275e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13279i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo32053M()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13279i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6939b.mo32052L():long");
        }

        /* renamed from: M */
        public long mo32053M() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte G = mo32047G();
                j |= ((long) (G & ByteCompanionObject.MAX_VALUE)) << i;
                if ((G & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: N */
        public final void mo32054N() {
            int i = this.f13277g + this.f13278h;
            this.f13277g = i;
            int i2 = i - this.f13280j;
            int i3 = this.f13283m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13278h = i4;
                this.f13277g = i - i4;
                return;
            }
            this.f13278h = 0;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: O */
        public void mo32055O() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo32025C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo32028F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6939b.mo32055O():void");
        }

        /* renamed from: P */
        public void mo32056P(int i) {
            if (i >= 0) {
                int i2 = this.f13277g;
                int i3 = this.f13279i;
                if (i <= i2 - i3) {
                    this.f13279i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: Q */
        public final void mo32057Q() {
            if (this.f13277g - this.f13279i >= 10) {
                mo32058R();
            } else {
                mo32059S();
            }
        }

        /* renamed from: R */
        public final void mo32058R() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f13275e;
                int i2 = this.f13279i;
                this.f13279i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: S */
        public final void mo32059S() {
            int i = 0;
            while (i < 10) {
                if (mo32047G() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: a */
        public void mo32029a(int i) {
            if (this.f13281k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo32030d() {
            return this.f13279i - this.f13280j;
        }

        /* renamed from: e */
        public boolean mo32031e() {
            return this.f13279i == this.f13277g;
        }

        /* renamed from: l */
        public void mo32032l(int i) {
            this.f13283m = i;
            mo32054N();
        }

        /* renamed from: m */
        public int mo32033m(int i) {
            if (i >= 0) {
                int d = i + mo32030d();
                int i2 = this.f13283m;
                if (d <= i2) {
                    this.f13283m = d;
                    mo32054N();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: n */
        public boolean mo32034n() {
            return mo32052L() != 0;
        }

        /* renamed from: o */
        public ByteString mo32035o() {
            ByteString byteString;
            int K = mo32051K();
            if (K > 0) {
                int i = this.f13277g;
                int i2 = this.f13279i;
                if (K <= i - i2) {
                    if (!this.f13276f || !this.f13282l) {
                        byteString = ByteString.copyFrom(this.f13275e, this.f13279i, K);
                    } else {
                        byteString = ByteString.wrap(this.f13275e, i2, K);
                    }
                    this.f13279i += K;
                    return byteString;
                }
            }
            if (K == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(mo32048H(K));
        }

        /* renamed from: p */
        public double mo32036p() {
            return Double.longBitsToDouble(mo32050J());
        }

        /* renamed from: q */
        public int mo32037q() {
            return mo32051K();
        }

        /* renamed from: r */
        public int mo32038r() {
            return mo32049I();
        }

        /* renamed from: s */
        public long mo32039s() {
            return mo32050J();
        }

        /* renamed from: t */
        public float mo32040t() {
            return Float.intBitsToFloat(mo32049I());
        }

        /* renamed from: u */
        public int mo32041u() {
            return mo32051K();
        }

        /* renamed from: v */
        public long mo32042v() {
            return mo32052L();
        }

        /* renamed from: w */
        public int mo32043w() {
            return mo32049I();
        }

        /* renamed from: x */
        public long mo32044x() {
            return mo32050J();
        }

        /* renamed from: y */
        public int mo32045y() {
            return C6937j.m19961b(mo32051K());
        }

        /* renamed from: z */
        public long mo32046z() {
            return C6937j.m19962c(mo32052L());
        }

        public C6939b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f13283m = Integer.MAX_VALUE;
            this.f13275e = bArr;
            this.f13277g = i2 + i;
            this.f13279i = i;
            this.f13280j = i;
            this.f13276f = z;
        }
    }

    /* renamed from: c.q.d.j$c */
    /* compiled from: CodedInputStream */
    public static final class C6940c extends C6937j {

        /* renamed from: e */
        public final InputStream f13284e;

        /* renamed from: f */
        public final byte[] f13285f;

        /* renamed from: g */
        public int f13286g;

        /* renamed from: h */
        public int f13287h;

        /* renamed from: i */
        public int f13288i;

        /* renamed from: j */
        public int f13289j;

        /* renamed from: k */
        public int f13290k;

        /* renamed from: l */
        public int f13291l;

        /* renamed from: m */
        public C6941a f13292m;

        /* renamed from: c.q.d.j$c$a */
        /* compiled from: CodedInputStream */
        public interface C6941a {
            /* renamed from: a */
            void mo32079a();
        }

        /* renamed from: A */
        public String mo32023A() {
            int N = mo32067N();
            if (N > 0 && N <= this.f13286g - this.f13288i) {
                String str = new String(this.f13285f, this.f13288i, N, C6999y.f13392a);
                this.f13288i += N;
                return str;
            } else if (N == 0) {
                return "";
            } else {
                if (N > this.f13286g) {
                    return new String(mo32062I(N, false), C6999y.f13392a);
                }
                mo32071R(N);
                String str2 = new String(this.f13285f, this.f13288i, N, C6999y.f13392a);
                this.f13288i += N;
                return str2;
            }
        }

        /* renamed from: B */
        public String mo32024B() {
            byte[] bArr;
            int N = mo32067N();
            int i = this.f13288i;
            if (N <= this.f13286g - i && N > 0) {
                bArr = this.f13285f;
                this.f13288i = i + N;
            } else if (N == 0) {
                return "";
            } else {
                if (N <= this.f13286g) {
                    mo32071R(N);
                    bArr = this.f13285f;
                    this.f13288i = N + 0;
                } else {
                    bArr = mo32062I(N, false);
                }
                i = 0;
            }
            return C6969o1.m20443h(bArr, i, N);
        }

        /* renamed from: C */
        public int mo32025C() {
            if (mo32031e()) {
                this.f13289j = 0;
                return 0;
            }
            int N = mo32067N();
            this.f13289j = N;
            if (WireFormat.m23292a(N) != 0) {
                return this.f13289j;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: D */
        public int mo32026D() {
            return mo32067N();
        }

        /* renamed from: E */
        public long mo32027E() {
            return mo32068O();
        }

        /* renamed from: F */
        public boolean mo32028F(int i) {
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                mo32075V();
                return true;
            } else if (b == 1) {
                mo32073T(8);
                return true;
            } else if (b == 2) {
                mo32073T(mo32067N());
                return true;
            } else if (b == 3) {
                mo32072S();
                mo32029a(WireFormat.m23294c(WireFormat.m23292a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo32073T(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: G */
        public final ByteString mo32060G(int i) {
            byte[] J = mo32063J(i);
            if (J != null) {
                return ByteString.copyFrom(J);
            }
            int i2 = this.f13288i;
            int i3 = this.f13286g;
            int i4 = i3 - i2;
            this.f13290k += i3;
            this.f13288i = 0;
            this.f13286g = 0;
            List<byte[]> K = mo32064K(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f13285f, i2, bArr, 0, i4);
            for (byte[] next : K) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return ByteString.wrap(bArr);
        }

        /* renamed from: H */
        public byte mo32061H() {
            if (this.f13288i == this.f13286g) {
                mo32071R(1);
            }
            byte[] bArr = this.f13285f;
            int i = this.f13288i;
            this.f13288i = i + 1;
            return bArr[i];
        }

        /* renamed from: I */
        public final byte[] mo32062I(int i, boolean z) {
            byte[] J = mo32063J(i);
            if (J != null) {
                return z ? (byte[]) J.clone() : J;
            }
            int i2 = this.f13288i;
            int i3 = this.f13286g;
            int i4 = i3 - i2;
            this.f13290k += i3;
            this.f13288i = 0;
            this.f13286g = 0;
            List<byte[]> K = mo32064K(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f13285f, i2, bArr, 0, i4);
            for (byte[] next : K) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return bArr;
        }

        /* renamed from: J */
        public final byte[] mo32063J(int i) {
            if (i == 0) {
                return C6999y.f13393b;
            }
            if (i >= 0) {
                int i2 = this.f13290k;
                int i3 = this.f13288i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f13273c <= 0) {
                    int i5 = this.f13291l;
                    if (i4 <= i5) {
                        int i6 = this.f13286g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f13284e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f13285f, this.f13288i, bArr, 0, i6);
                        this.f13290k += this.f13286g;
                        this.f13288i = 0;
                        this.f13286g = 0;
                        while (i6 < i) {
                            int read = this.f13284e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f13290k += read;
                                i6 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo32073T((i5 - i2) - i3);
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: K */
        public final List<byte[]> mo32064K(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f13284e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f13290k += read;
                        i2 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: L */
        public int mo32065L() {
            int i = this.f13288i;
            if (this.f13286g - i < 4) {
                mo32071R(4);
                i = this.f13288i;
            }
            byte[] bArr = this.f13285f;
            this.f13288i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: M */
        public long mo32066M() {
            int i = this.f13288i;
            if (this.f13286g - i < 8) {
                mo32071R(8);
                i = this.f13288i;
            }
            byte[] bArr = this.f13285f;
            this.f13288i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32067N() {
            /*
                r5 = this;
                int r0 = r5.f13288i
                int r1 = r5.f13286g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f13285f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f13288i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo32069P()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f13288i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6940c.mo32067N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo32068O() {
            /*
                r11 = this;
                int r0 = r11.f13288i
                int r1 = r11.f13286g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f13285f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f13288i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo32069P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f13288i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6940c.mo32068O():long");
        }

        /* renamed from: P */
        public long mo32069P() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte H = mo32061H();
                j |= ((long) (H & ByteCompanionObject.MAX_VALUE)) << i;
                if ((H & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: Q */
        public final void mo32070Q() {
            int i = this.f13286g + this.f13287h;
            this.f13286g = i;
            int i2 = this.f13290k + i;
            int i3 = this.f13291l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f13287h = i4;
                this.f13286g = i - i4;
                return;
            }
            this.f13287h = 0;
        }

        /* renamed from: R */
        public final void mo32071R(int i) {
            if (mo32078Y(i)) {
                return;
            }
            if (i > (this.f13273c - this.f13290k) - this.f13288i) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: S */
        public void mo32072S() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo32025C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo32028F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6940c.mo32072S():void");
        }

        /* renamed from: T */
        public void mo32073T(int i) {
            int i2 = this.f13286g;
            int i3 = this.f13288i;
            if (i > i2 - i3 || i < 0) {
                mo32074U(i);
            } else {
                this.f13288i = i3 + i;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f13284e.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: U */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo32074U(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f13290k
                int r1 = r8.f13288i
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f13291l
                if (r2 > r3) goto L_0x008d
                c.q.d.j$c$a r2 = r8.f13292m
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f13290k = r0
                int r0 = r8.f13286g
                int r0 = r0 - r1
                r8.f13286g = r3
                r8.f13288i = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f13284e     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r0 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r0
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f13284e     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f13290k
                int r0 = r0 + r3
                r8.f13290k = r0
                r8.mo32070Q()
                throw r9
            L_0x0067:
                int r0 = r8.f13290k
                int r0 = r0 + r3
                r8.f13290k = r0
                r8.mo32070Q()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f13286g
                int r1 = r8.f13288i
                int r1 = r0 - r1
                r8.f13288i = r0
                r0 = 1
                r8.mo32071R(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f13286g
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f13288i = r3
                r8.mo32071R(r0)
                goto L_0x007d
            L_0x008a:
                r8.f13288i = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo32073T(r3)
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L_0x0097:
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6940c.mo32074U(int):void");
        }

        /* renamed from: V */
        public final void mo32075V() {
            if (this.f13286g - this.f13288i >= 10) {
                mo32076W();
            } else {
                mo32077X();
            }
        }

        /* renamed from: W */
        public final void mo32076W() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f13285f;
                int i2 = this.f13288i;
                this.f13288i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: X */
        public final void mo32077X() {
            int i = 0;
            while (i < 10) {
                if (mo32061H() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: Y */
        public final boolean mo32078Y(int i) {
            int i2 = this.f13288i;
            if (i2 + i > this.f13286g) {
                int i3 = this.f13273c;
                int i4 = this.f13290k;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f13291l) {
                    return false;
                }
                C6941a aVar = this.f13292m;
                if (aVar != null) {
                    aVar.mo32079a();
                }
                int i5 = this.f13288i;
                if (i5 > 0) {
                    int i6 = this.f13286g;
                    if (i6 > i5) {
                        byte[] bArr = this.f13285f;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f13290k += i5;
                    this.f13286g -= i5;
                    this.f13288i = 0;
                }
                InputStream inputStream = this.f13284e;
                byte[] bArr2 = this.f13285f;
                int i7 = this.f13286g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f13273c - this.f13290k) - i7));
                if (read == 0 || read < -1 || read > this.f13285f.length) {
                    throw new IllegalStateException(this.f13284e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f13286g += read;
                    mo32070Q();
                    if (this.f13286g >= i) {
                        return true;
                    }
                    return mo32078Y(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: a */
        public void mo32029a(int i) {
            if (this.f13289j != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo32030d() {
            return this.f13290k + this.f13288i;
        }

        /* renamed from: e */
        public boolean mo32031e() {
            return this.f13288i == this.f13286g && !mo32078Y(1);
        }

        /* renamed from: l */
        public void mo32032l(int i) {
            this.f13291l = i;
            mo32070Q();
        }

        /* renamed from: m */
        public int mo32033m(int i) {
            if (i >= 0) {
                int i2 = i + this.f13290k + this.f13288i;
                int i3 = this.f13291l;
                if (i2 <= i3) {
                    this.f13291l = i2;
                    mo32070Q();
                    return i3;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: n */
        public boolean mo32034n() {
            return mo32068O() != 0;
        }

        /* renamed from: o */
        public ByteString mo32035o() {
            int N = mo32067N();
            int i = this.f13286g;
            int i2 = this.f13288i;
            if (N <= i - i2 && N > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.f13285f, i2, N);
                this.f13288i += N;
                return copyFrom;
            } else if (N == 0) {
                return ByteString.EMPTY;
            } else {
                return mo32060G(N);
            }
        }

        /* renamed from: p */
        public double mo32036p() {
            return Double.longBitsToDouble(mo32066M());
        }

        /* renamed from: q */
        public int mo32037q() {
            return mo32067N();
        }

        /* renamed from: r */
        public int mo32038r() {
            return mo32065L();
        }

        /* renamed from: s */
        public long mo32039s() {
            return mo32066M();
        }

        /* renamed from: t */
        public float mo32040t() {
            return Float.intBitsToFloat(mo32065L());
        }

        /* renamed from: u */
        public int mo32041u() {
            return mo32067N();
        }

        /* renamed from: v */
        public long mo32042v() {
            return mo32068O();
        }

        /* renamed from: w */
        public int mo32043w() {
            return mo32065L();
        }

        /* renamed from: x */
        public long mo32044x() {
            return mo32066M();
        }

        /* renamed from: y */
        public int mo32045y() {
            return C6937j.m19961b(mo32067N());
        }

        /* renamed from: z */
        public long mo32046z() {
            return C6937j.m19962c(mo32068O());
        }

        public C6940c(InputStream inputStream, int i) {
            super();
            this.f13291l = Integer.MAX_VALUE;
            this.f13292m = null;
            C6999y.m20708b(inputStream, "input");
            this.f13284e = inputStream;
            this.f13285f = new byte[i];
            this.f13286g = 0;
            this.f13288i = 0;
            this.f13290k = 0;
        }
    }

    /* renamed from: c.q.d.j$d */
    /* compiled from: CodedInputStream */
    public static final class C6942d extends C6937j {

        /* renamed from: e */
        public final ByteBuffer f13293e;

        /* renamed from: f */
        public final boolean f13294f;

        /* renamed from: g */
        public final long f13295g;

        /* renamed from: h */
        public long f13296h;

        /* renamed from: i */
        public long f13297i;

        /* renamed from: j */
        public long f13298j;

        /* renamed from: k */
        public int f13299k;

        /* renamed from: l */
        public int f13300l;

        /* renamed from: m */
        public boolean f13301m;

        /* renamed from: n */
        public int f13302n;

        /* renamed from: H */
        public static boolean m20074H() {
            return C6961n1.m20333H();
        }

        /* renamed from: A */
        public String mo32023A() {
            int L = mo32084L();
            if (L > 0 && L <= mo32088P()) {
                byte[] bArr = new byte[L];
                long j = (long) L;
                C6961n1.m20361n(this.f13297i, bArr, 0, j);
                String str = new String(bArr, C6999y.f13392a);
                this.f13297i += j;
                return str;
            } else if (L == 0) {
                return "";
            } else {
                if (L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: B */
        public String mo32024B() {
            int L = mo32084L();
            if (L > 0 && L <= mo32088P()) {
                String g = C6969o1.m20442g(this.f13293e, mo32080G(this.f13297i), L);
                this.f13297i += (long) L;
                return g;
            } else if (L == 0) {
                return "";
            } else {
                if (L <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: C */
        public int mo32025C() {
            if (mo32031e()) {
                this.f13300l = 0;
                return 0;
            }
            int L = mo32084L();
            this.f13300l = L;
            if (WireFormat.m23292a(L) != 0) {
                return this.f13300l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        /* renamed from: D */
        public int mo32026D() {
            return mo32084L();
        }

        /* renamed from: E */
        public long mo32027E() {
            return mo32085M();
        }

        /* renamed from: F */
        public boolean mo32028F(int i) {
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                mo32091S();
                return true;
            } else if (b == 1) {
                mo32090R(8);
                return true;
            } else if (b == 2) {
                mo32090R(mo32084L());
                return true;
            } else if (b == 3) {
                mo32089Q();
                mo32029a(WireFormat.m23294c(WireFormat.m23292a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo32090R(4);
                    return true;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: G */
        public final int mo32080G(long j) {
            return (int) (j - this.f13295g);
        }

        /* renamed from: I */
        public byte mo32081I() {
            long j = this.f13297i;
            if (j != this.f13296h) {
                this.f13297i = 1 + j;
                return C6961n1.m20368u(j);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: J */
        public int mo32082J() {
            long j = this.f13297i;
            if (this.f13296h - j >= 4) {
                this.f13297i = 4 + j;
                return ((C6961n1.m20368u(j + 3) & 255) << 24) | (C6961n1.m20368u(j) & 255) | ((C6961n1.m20368u(1 + j) & 255) << 8) | ((C6961n1.m20368u(2 + j) & 255) << 16);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: K */
        public long mo32083K() {
            long j = this.f13297i;
            if (this.f13296h - j >= 8) {
                this.f13297i = 8 + j;
                return ((((long) C6961n1.m20368u(j + 7)) & 255) << 56) | (((long) C6961n1.m20368u(j)) & 255) | ((((long) C6961n1.m20368u(1 + j)) & 255) << 8) | ((((long) C6961n1.m20368u(2 + j)) & 255) << 16) | ((((long) C6961n1.m20368u(3 + j)) & 255) << 24) | ((((long) C6961n1.m20368u(4 + j)) & 255) << 32) | ((((long) C6961n1.m20368u(5 + j)) & 255) << 40) | ((((long) C6961n1.m20368u(6 + j)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (p040c.p200q.p405d.C6961n1.m20368u(r4) < 0) goto L_0x0085;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo32084L() {
            /*
                r10 = this;
                long r0 = r10.f13297i
                long r2 = r10.f13296h
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p040c.p200q.p405d.C6961n1.m20368u(r0)
                if (r0 < 0) goto L_0x0017
                r10.f13297i = r4
                return r0
            L_0x0017:
                long r6 = r10.f13296h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p040c.p200q.p405d.C6961n1.m20368u(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo32086N()
                int r0 = (int) r0
                return r0
            L_0x008b:
                r10.f13297i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6942d.mo32084L():int");
        }

        /* renamed from: M */
        public long mo32085M() {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f13297i;
            if (this.f13296h != j4) {
                long j5 = j4 + 1;
                byte u = C6961n1.m20368u(j4);
                if (u >= 0) {
                    this.f13297i = j5;
                    return (long) u;
                } else if (this.f13296h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte u2 = u ^ (C6961n1.m20368u(j5) << 7);
                    if (u2 < 0) {
                        b = u2 ^ ByteCompanionObject.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte u3 = u2 ^ (C6961n1.m20368u(j6) << 14);
                        if (u3 >= 0) {
                            j = (long) (u3 ^ ByteCompanionObject.MIN_VALUE);
                        } else {
                            j6 = j7 + 1;
                            byte u4 = u3 ^ (C6961n1.m20368u(j7) << 21);
                            if (u4 < 0) {
                                b = u4 ^ ByteCompanionObject.MIN_VALUE;
                            } else {
                                j7 = j6 + 1;
                                long u5 = ((long) u4) ^ (((long) C6961n1.m20368u(j6)) << 28);
                                if (u5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long u6 = u5 ^ (((long) C6961n1.m20368u(j7)) << 35);
                                    if (u6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        u5 = u6 ^ (((long) C6961n1.m20368u(j8)) << 42);
                                        if (u5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            u6 = u5 ^ (((long) C6961n1.m20368u(j7)) << 49);
                                            if (u6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (u6 ^ (((long) C6961n1.m20368u(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C6961n1.m20368u(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f13297i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = u6 ^ j2;
                                    j6 = j8;
                                    this.f13297i = j6;
                                    return j;
                                }
                                j = u5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f13297i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f13297i = j6;
                    return j;
                }
            }
            return mo32086N();
        }

        /* renamed from: N */
        public long mo32086N() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte I = mo32081I();
                j |= ((long) (I & ByteCompanionObject.MAX_VALUE)) << i;
                if ((I & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: O */
        public final void mo32087O() {
            long j = this.f13296h + ((long) this.f13299k);
            this.f13296h = j;
            int i = (int) (j - this.f13298j);
            int i2 = this.f13302n;
            if (i > i2) {
                int i3 = i - i2;
                this.f13299k = i3;
                this.f13296h = j - ((long) i3);
                return;
            }
            this.f13299k = 0;
        }

        /* renamed from: P */
        public final int mo32088P() {
            return (int) (this.f13296h - this.f13297i);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: Q */
        public void mo32089Q() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo32025C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo32028F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6942d.mo32089Q():void");
        }

        /* renamed from: R */
        public void mo32090R(int i) {
            if (i >= 0 && i <= mo32088P()) {
                this.f13297i += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: S */
        public final void mo32091S() {
            if (mo32088P() >= 10) {
                mo32092T();
            } else {
                mo32093U();
            }
        }

        /* renamed from: T */
        public final void mo32092T() {
            int i = 0;
            while (i < 10) {
                long j = this.f13297i;
                this.f13297i = 1 + j;
                if (C6961n1.m20368u(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: U */
        public final void mo32093U() {
            int i = 0;
            while (i < 10) {
                if (mo32081I() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f13293e.position(r0);
            r3.f13293e.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: V */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer mo32094V(long r4, long r6) {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f13293e
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f13293e
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f13293e     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.mo32080G(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f13293e     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.mo32080G(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f13293e     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f13293e
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f13293e
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f13293e
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f13293e
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6937j.C6942d.mo32094V(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: a */
        public void mo32029a(int i) {
            if (this.f13300l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo32030d() {
            return (int) (this.f13297i - this.f13298j);
        }

        /* renamed from: e */
        public boolean mo32031e() {
            return this.f13297i == this.f13296h;
        }

        /* renamed from: l */
        public void mo32032l(int i) {
            this.f13302n = i;
            mo32087O();
        }

        /* renamed from: m */
        public int mo32033m(int i) {
            if (i >= 0) {
                int d = i + mo32030d();
                int i2 = this.f13302n;
                if (d <= i2) {
                    this.f13302n = d;
                    mo32087O();
                    return i2;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        /* renamed from: n */
        public boolean mo32034n() {
            return mo32085M() != 0;
        }

        /* renamed from: o */
        public ByteString mo32035o() {
            int L = mo32084L();
            if (L <= 0 || L > mo32088P()) {
                if (L == 0) {
                    return ByteString.EMPTY;
                }
                if (L < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (!this.f13294f || !this.f13301m) {
                byte[] bArr = new byte[L];
                long j = (long) L;
                C6961n1.m20361n(this.f13297i, bArr, 0, j);
                this.f13297i += j;
                return ByteString.wrap(bArr);
            } else {
                long j2 = this.f13297i;
                long j3 = (long) L;
                ByteBuffer V = mo32094V(j2, j2 + j3);
                this.f13297i += j3;
                return ByteString.wrap(V);
            }
        }

        /* renamed from: p */
        public double mo32036p() {
            return Double.longBitsToDouble(mo32083K());
        }

        /* renamed from: q */
        public int mo32037q() {
            return mo32084L();
        }

        /* renamed from: r */
        public int mo32038r() {
            return mo32082J();
        }

        /* renamed from: s */
        public long mo32039s() {
            return mo32083K();
        }

        /* renamed from: t */
        public float mo32040t() {
            return Float.intBitsToFloat(mo32082J());
        }

        /* renamed from: u */
        public int mo32041u() {
            return mo32084L();
        }

        /* renamed from: v */
        public long mo32042v() {
            return mo32085M();
        }

        /* renamed from: w */
        public int mo32043w() {
            return mo32082J();
        }

        /* renamed from: x */
        public long mo32044x() {
            return mo32083K();
        }

        /* renamed from: y */
        public int mo32045y() {
            return C6937j.m19961b(mo32084L());
        }

        /* renamed from: z */
        public long mo32046z() {
            return C6937j.m19962c(mo32085M());
        }

        public C6942d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f13302n = Integer.MAX_VALUE;
            this.f13293e = byteBuffer;
            long i = C6961n1.m20356i(byteBuffer);
            this.f13295g = i;
            this.f13296h = i + ((long) byteBuffer.limit());
            long position = this.f13295g + ((long) byteBuffer.position());
            this.f13297i = position;
            this.f13298j = position;
            this.f13294f = z;
        }
    }

    /* renamed from: b */
    public static int m19961b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m19962c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C6937j m19963f(InputStream inputStream) {
        return m19964g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C6937j m19964g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m19966i(C6999y.f13393b);
        } else {
            return new C6940c(inputStream, i);
        }
    }

    /* renamed from: h */
    public static C6937j m19965h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m19968k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C6942d.m20074H()) {
            return new C6942d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m19968k(bArr, 0, remaining, true);
    }

    /* renamed from: i */
    public static C6937j m19966i(byte[] bArr) {
        return m19967j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static C6937j m19967j(byte[] bArr, int i, int i2) {
        return m19968k(bArr, i, i2, false);
    }

    /* renamed from: k */
    public static C6937j m19968k(byte[] bArr, int i, int i2, boolean z) {
        C6939b bVar = new C6939b(bArr, i, i2, z);
        try {
            bVar.mo32033m(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo32023A();

    /* renamed from: B */
    public abstract String mo32024B();

    /* renamed from: C */
    public abstract int mo32025C();

    /* renamed from: D */
    public abstract int mo32026D();

    /* renamed from: E */
    public abstract long mo32027E();

    /* renamed from: F */
    public abstract boolean mo32028F(int i);

    /* renamed from: a */
    public abstract void mo32029a(int i);

    /* renamed from: d */
    public abstract int mo32030d();

    /* renamed from: e */
    public abstract boolean mo32031e();

    /* renamed from: l */
    public abstract void mo32032l(int i);

    /* renamed from: m */
    public abstract int mo32033m(int i);

    /* renamed from: n */
    public abstract boolean mo32034n();

    /* renamed from: o */
    public abstract ByteString mo32035o();

    /* renamed from: p */
    public abstract double mo32036p();

    /* renamed from: q */
    public abstract int mo32037q();

    /* renamed from: r */
    public abstract int mo32038r();

    /* renamed from: s */
    public abstract long mo32039s();

    /* renamed from: t */
    public abstract float mo32040t();

    /* renamed from: u */
    public abstract int mo32041u();

    /* renamed from: v */
    public abstract long mo32042v();

    /* renamed from: w */
    public abstract int mo32043w();

    /* renamed from: x */
    public abstract long mo32044x();

    /* renamed from: y */
    public abstract int mo32045y();

    /* renamed from: z */
    public abstract long mo32046z();

    public C6937j() {
        this.f13272b = 100;
        this.f13273c = Integer.MAX_VALUE;
    }
}
