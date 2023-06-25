package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import p040c.p200q.p405d.C6884a;
import p040c.p200q.p405d.C6886a0;
import p040c.p200q.p405d.C6898d;
import p040c.p200q.p405d.C6903d1;
import p040c.p200q.p405d.C6932i;
import p040c.p200q.p405d.C6949l;
import p040c.p200q.p405d.C6954m0;
import p040c.p200q.p405d.C6961n1;
import p040c.p200q.p405d.C6969o1;
import p040c.p200q.p405d.C6999y;

public abstract class CodedOutputStream extends C6932i {

    /* renamed from: c */
    public static final Logger f15508c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    public static final boolean f15509d = C6961n1.m20332G();

    /* renamed from: a */
    public C6949l f15510a;

    /* renamed from: b */
    public boolean f15511b;

    public static class OutOfSpaceException extends IOException {
        public static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        public static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: com.google.protobuf.CodedOutputStream$b */
    public static class C8419b extends CodedOutputStream {

        /* renamed from: e */
        public final byte[] f15512e;

        /* renamed from: f */
        public final int f15513f;

        /* renamed from: g */
        public int f15514g;

        public C8419b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f15512e = bArr;
                    this.f15514g = i;
                    this.f15513f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: C0 */
        public final void mo37904C0(int i, int i2) {
            mo37922U0(i, 0);
            mo37905D0(i2);
        }

        /* renamed from: D0 */
        public final void mo37905D0(int i) {
            if (i >= 0) {
                mo37924W0(i);
            } else {
                mo37926Y0((long) i);
            }
        }

        /* renamed from: G0 */
        public final void mo37908G0(int i, C6954m0 m0Var, C6903d1 d1Var) {
            mo37922U0(i, 2);
            mo37924W0(((C6884a) m0Var).mo31734j(d1Var));
            d1Var.mo31883b(m0Var, this.f15510a);
        }

        /* renamed from: H0 */
        public final void mo37909H0(C6954m0 m0Var) {
            mo37924W0(m0Var.mo32217e());
            m0Var.mo32216c(this);
        }

        /* renamed from: I0 */
        public final void mo37910I0(int i, C6954m0 m0Var) {
            mo37922U0(1, 3);
            mo37923V0(2, i);
            mo37952b1(3, m0Var);
            mo37922U0(1, 4);
        }

        /* renamed from: J0 */
        public final void mo37911J0(int i, ByteString byteString) {
            mo37922U0(1, 3);
            mo37923V0(2, i);
            mo37936m0(3, byteString);
            mo37922U0(1, 4);
        }

        /* renamed from: S0 */
        public final void mo37920S0(int i, String str) {
            mo37922U0(i, 2);
            mo37921T0(str);
        }

        /* renamed from: T0 */
        public final void mo37921T0(String str) {
            int i = this.f15514g;
            try {
                int X = CodedOutputStream.m23115X(str.length() * 3);
                int X2 = CodedOutputStream.m23115X(str.length());
                if (X2 == X) {
                    int i2 = i + X2;
                    this.f15514g = i2;
                    int i3 = C6969o1.m20444i(str, this.f15512e, i2, mo37930g0());
                    this.f15514g = i;
                    mo37924W0((i3 - i) - X2);
                    this.f15514g = i3;
                    return;
                }
                mo37924W0(C6969o1.m20445j(str));
                this.f15514g = C6969o1.m20444i(str, this.f15512e, this.f15514g, mo37930g0());
            } catch (C6969o1.C6973d e) {
                this.f15514g = i;
                mo37927c0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        /* renamed from: U0 */
        public final void mo37922U0(int i, int i2) {
            mo37924W0(WireFormat.m23294c(i, i2));
        }

        /* renamed from: V0 */
        public final void mo37923V0(int i, int i2) {
            mo37922U0(i, 0);
            mo37924W0(i2);
        }

        /* renamed from: W0 */
        public final void mo37924W0(int i) {
            if (!CodedOutputStream.f15509d || C6898d.m19666c() || mo37930g0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f15512e;
                    int i2 = this.f15514g;
                    this.f15514g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f15512e;
                    int i3 = this.f15514g;
                    this.f15514g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f15512e;
                int i4 = this.f15514g;
                this.f15514g = i4 + 1;
                C6961n1.m20338M(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f15512e;
                int i5 = this.f15514g;
                this.f15514g = i5 + 1;
                C6961n1.m20338M(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f15512e;
                    int i7 = this.f15514g;
                    this.f15514g = i7 + 1;
                    C6961n1.m20338M(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f15512e;
                int i8 = this.f15514g;
                this.f15514g = i8 + 1;
                C6961n1.m20338M(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f15512e;
                    int i10 = this.f15514g;
                    this.f15514g = i10 + 1;
                    C6961n1.m20338M(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f15512e;
                int i11 = this.f15514g;
                this.f15514g = i11 + 1;
                C6961n1.m20338M(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f15512e;
                    int i13 = this.f15514g;
                    this.f15514g = i13 + 1;
                    C6961n1.m20338M(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f15512e;
                int i14 = this.f15514g;
                this.f15514g = i14 + 1;
                C6961n1.m20338M(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f15512e;
                int i15 = this.f15514g;
                this.f15514g = i15 + 1;
                C6961n1.m20338M(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: X0 */
        public final void mo37925X0(int i, long j) {
            mo37922U0(i, 0);
            mo37926Y0(j);
        }

        /* renamed from: Y0 */
        public final void mo37926Y0(long j) {
            if (!CodedOutputStream.f15509d || mo37930g0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f15512e;
                    int i = this.f15514g;
                    this.f15514g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f15512e;
                    int i2 = this.f15514g;
                    this.f15514g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f15512e;
                    int i3 = this.f15514g;
                    this.f15514g = i3 + 1;
                    C6961n1.m20338M(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f15512e;
                int i4 = this.f15514g;
                this.f15514g = i4 + 1;
                C6961n1.m20338M(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: Z0 */
        public final void mo37950Z0(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f15512e, this.f15514g, remaining);
                this.f15514g += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: a */
        public final void mo32019a(ByteBuffer byteBuffer) {
            mo37950Z0(byteBuffer);
        }

        /* renamed from: a1 */
        public final void mo37951a1(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f15512e, this.f15514g, i2);
                this.f15514g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: b */
        public final void mo32020b(byte[] bArr, int i, int i2) {
            mo37951a1(bArr, i, i2);
        }

        /* renamed from: b1 */
        public final void mo37952b1(int i, C6954m0 m0Var) {
            mo37922U0(i, 2);
            mo37909H0(m0Var);
        }

        /* renamed from: g0 */
        public final int mo37930g0() {
            return this.f15513f - this.f15514g;
        }

        /* renamed from: h0 */
        public final void mo37931h0(byte b) {
            try {
                byte[] bArr = this.f15512e;
                int i = this.f15514g;
                this.f15514g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), 1}), e);
            }
        }

        /* renamed from: i0 */
        public final void mo37932i0(int i, boolean z) {
            mo37922U0(i, 0);
            mo37931h0(z ? (byte) 1 : 0);
        }

        /* renamed from: l0 */
        public final void mo37935l0(byte[] bArr, int i, int i2) {
            mo37924W0(i2);
            mo37951a1(bArr, i, i2);
        }

        /* renamed from: m0 */
        public final void mo37936m0(int i, ByteString byteString) {
            mo37922U0(i, 2);
            mo37937n0(byteString);
        }

        /* renamed from: n0 */
        public final void mo37937n0(ByteString byteString) {
            mo37924W0(byteString.size());
            byteString.writeTo((C6932i) this);
        }

        /* renamed from: s0 */
        public final void mo37942s0(int i, int i2) {
            mo37922U0(i, 5);
            mo37943t0(i2);
        }

        /* renamed from: t0 */
        public final void mo37943t0(int i) {
            try {
                byte[] bArr = this.f15512e;
                int i2 = this.f15514g;
                int i3 = i2 + 1;
                this.f15514g = i3;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.f15512e;
                int i4 = i3 + 1;
                this.f15514g = i4;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.f15512e;
                int i5 = i4 + 1;
                this.f15514g = i5;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.f15512e;
                this.f15514g = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), 1}), e);
            }
        }

        /* renamed from: u0 */
        public final void mo37944u0(int i, long j) {
            mo37922U0(i, 1);
            mo37945v0(j);
        }

        /* renamed from: v0 */
        public final void mo37945v0(long j) {
            try {
                byte[] bArr = this.f15512e;
                int i = this.f15514g;
                int i2 = i + 1;
                this.f15514g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.f15512e;
                int i3 = i2 + 1;
                this.f15514g = i3;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.f15512e;
                int i4 = i3 + 1;
                this.f15514g = i4;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.f15512e;
                int i5 = i4 + 1;
                this.f15514g = i5;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.f15512e;
                int i6 = i5 + 1;
                this.f15514g = i6;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.f15512e;
                int i7 = i6 + 1;
                this.f15514g = i7;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.f15512e;
                int i8 = i7 + 1;
                this.f15514g = i8;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.f15512e;
                this.f15514g = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f15514g), Integer.valueOf(this.f15513f), 1}), e);
            }
        }
    }

    /* renamed from: A */
    public static int m23092A(int i, C6886a0 a0Var) {
        return (m23113V(1) * 2) + m23114W(2, i) + m23093B(3, a0Var);
    }

    /* renamed from: B */
    public static int m23093B(int i, C6886a0 a0Var) {
        return m23113V(i) + m23094C(a0Var);
    }

    /* renamed from: C */
    public static int m23094C(C6886a0 a0Var) {
        return m23095D(a0Var.mo31745b());
    }

    /* renamed from: D */
    public static int m23095D(int i) {
        return m23115X(i) + i;
    }

    /* renamed from: E */
    public static int m23096E(int i, C6954m0 m0Var) {
        return (m23113V(1) * 2) + m23114W(2, i) + m23097F(3, m0Var);
    }

    /* renamed from: F */
    public static int m23097F(int i, C6954m0 m0Var) {
        return m23113V(i) + m23099H(m0Var);
    }

    /* renamed from: G */
    public static int m23098G(int i, C6954m0 m0Var, C6903d1 d1Var) {
        return m23113V(i) + m23100I(m0Var, d1Var);
    }

    /* renamed from: H */
    public static int m23099H(C6954m0 m0Var) {
        return m23095D(m0Var.mo32217e());
    }

    /* renamed from: I */
    public static int m23100I(C6954m0 m0Var, C6903d1 d1Var) {
        return m23095D(((C6884a) m0Var).mo31734j(d1Var));
    }

    /* renamed from: J */
    public static int m23101J(int i, ByteString byteString) {
        return (m23113V(1) * 2) + m23114W(2, i) + m23126h(3, byteString);
    }

    @Deprecated
    /* renamed from: K */
    public static int m23102K(int i) {
        return m23115X(i);
    }

    /* renamed from: L */
    public static int m23103L(int i, int i2) {
        return m23113V(i) + m23104M(i2);
    }

    /* renamed from: M */
    public static int m23104M(int i) {
        return 4;
    }

    /* renamed from: N */
    public static int m23105N(int i, long j) {
        return m23113V(i) + m23106O(j);
    }

    /* renamed from: O */
    public static int m23106O(long j) {
        return 8;
    }

    /* renamed from: P */
    public static int m23107P(int i, int i2) {
        return m23113V(i) + m23108Q(i2);
    }

    /* renamed from: Q */
    public static int m23108Q(int i) {
        return m23115X(m23118a0(i));
    }

    /* renamed from: R */
    public static int m23109R(int i, long j) {
        return m23113V(i) + m23110S(j);
    }

    /* renamed from: S */
    public static int m23110S(long j) {
        return m23117Z(m23119b0(j));
    }

    /* renamed from: T */
    public static int m23111T(int i, String str) {
        return m23113V(i) + m23112U(str);
    }

    /* renamed from: U */
    public static int m23112U(String str) {
        int i;
        try {
            i = C6969o1.m20445j(str);
        } catch (C6969o1.C6973d unused) {
            i = str.getBytes(C6999y.f13392a).length;
        }
        return m23095D(i);
    }

    /* renamed from: V */
    public static int m23113V(int i) {
        return m23115X(WireFormat.m23294c(i, 0));
    }

    /* renamed from: W */
    public static int m23114W(int i, int i2) {
        return m23113V(i) + m23115X(i2);
    }

    /* renamed from: X */
    public static int m23115X(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: Y */
    public static int m23116Y(int i, long j) {
        return m23113V(i) + m23117Z(j);
    }

    /* renamed from: Z */
    public static int m23117Z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((CoroutineScheduler.PARKED_VERSION_MASK & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a0 */
    public static int m23118a0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b0 */
    public static long m23119b0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m23121e(int i, boolean z) {
        return m23113V(i) + m23123f(z);
    }

    /* renamed from: e0 */
    public static CodedOutputStream m23122e0(byte[] bArr) {
        return m23124f0(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static int m23123f(boolean z) {
        return 1;
    }

    /* renamed from: f0 */
    public static CodedOutputStream m23124f0(byte[] bArr, int i, int i2) {
        return new C8419b(bArr, i, i2);
    }

    /* renamed from: g */
    public static int m23125g(byte[] bArr) {
        return m23095D(bArr.length);
    }

    /* renamed from: h */
    public static int m23126h(int i, ByteString byteString) {
        return m23113V(i) + m23127i(byteString);
    }

    /* renamed from: i */
    public static int m23127i(ByteString byteString) {
        return m23095D(byteString.size());
    }

    /* renamed from: j */
    public static int m23128j(int i, double d) {
        return m23113V(i) + m23129k(d);
    }

    /* renamed from: k */
    public static int m23129k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m23130l(int i, int i2) {
        return m23113V(i) + m23131m(i2);
    }

    /* renamed from: m */
    public static int m23131m(int i) {
        return m23142x(i);
    }

    /* renamed from: n */
    public static int m23132n(int i, int i2) {
        return m23113V(i) + m23133o(i2);
    }

    /* renamed from: o */
    public static int m23133o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m23134p(int i, long j) {
        return m23113V(i) + m23135q(j);
    }

    /* renamed from: q */
    public static int m23135q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m23136r(int i, float f) {
        return m23113V(i) + m23137s(f);
    }

    /* renamed from: s */
    public static int m23137s(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: t */
    public static int m23138t(int i, C6954m0 m0Var, C6903d1 d1Var) {
        return (m23113V(i) * 2) + m23140v(m0Var, d1Var);
    }

    @Deprecated
    /* renamed from: u */
    public static int m23139u(C6954m0 m0Var) {
        return m0Var.mo32217e();
    }

    @Deprecated
    /* renamed from: v */
    public static int m23140v(C6954m0 m0Var, C6903d1 d1Var) {
        return ((C6884a) m0Var).mo31734j(d1Var);
    }

    /* renamed from: w */
    public static int m23141w(int i, int i2) {
        return m23113V(i) + m23142x(i2);
    }

    /* renamed from: x */
    public static int m23142x(int i) {
        if (i >= 0) {
            return m23115X(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m23143y(int i, long j) {
        return m23113V(i) + m23144z(j);
    }

    /* renamed from: z */
    public static int m23144z(long j) {
        return m23117Z(j);
    }

    @Deprecated
    /* renamed from: A0 */
    public final void mo37902A0(C6954m0 m0Var) {
        m0Var.mo32216c(this);
    }

    @Deprecated
    /* renamed from: B0 */
    public final void mo37903B0(C6954m0 m0Var, C6903d1 d1Var) {
        d1Var.mo31883b(m0Var, this.f15510a);
    }

    /* renamed from: C0 */
    public abstract void mo37904C0(int i, int i2);

    /* renamed from: D0 */
    public abstract void mo37905D0(int i);

    /* renamed from: E0 */
    public final void mo37906E0(int i, long j) {
        mo37925X0(i, j);
    }

    /* renamed from: F0 */
    public final void mo37907F0(long j) {
        mo37926Y0(j);
    }

    /* renamed from: G0 */
    public abstract void mo37908G0(int i, C6954m0 m0Var, C6903d1 d1Var);

    /* renamed from: H0 */
    public abstract void mo37909H0(C6954m0 m0Var);

    /* renamed from: I0 */
    public abstract void mo37910I0(int i, C6954m0 m0Var);

    /* renamed from: J0 */
    public abstract void mo37911J0(int i, ByteString byteString);

    /* renamed from: K0 */
    public final void mo37912K0(int i, int i2) {
        mo37942s0(i, i2);
    }

    /* renamed from: L0 */
    public final void mo37913L0(int i) {
        mo37943t0(i);
    }

    /* renamed from: M0 */
    public final void mo37914M0(int i, long j) {
        mo37944u0(i, j);
    }

    /* renamed from: N0 */
    public final void mo37915N0(long j) {
        mo37945v0(j);
    }

    /* renamed from: O0 */
    public final void mo37916O0(int i, int i2) {
        mo37923V0(i, m23118a0(i2));
    }

    /* renamed from: P0 */
    public final void mo37917P0(int i) {
        mo37924W0(m23118a0(i));
    }

    /* renamed from: Q0 */
    public final void mo37918Q0(int i, long j) {
        mo37925X0(i, m23119b0(j));
    }

    /* renamed from: R0 */
    public final void mo37919R0(long j) {
        mo37926Y0(m23119b0(j));
    }

    /* renamed from: S0 */
    public abstract void mo37920S0(int i, String str);

    /* renamed from: T0 */
    public abstract void mo37921T0(String str);

    /* renamed from: U0 */
    public abstract void mo37922U0(int i, int i2);

    /* renamed from: V0 */
    public abstract void mo37923V0(int i, int i2);

    /* renamed from: W0 */
    public abstract void mo37924W0(int i);

    /* renamed from: X0 */
    public abstract void mo37925X0(int i, long j);

    /* renamed from: Y0 */
    public abstract void mo37926Y0(long j);

    /* renamed from: c0 */
    public final void mo37927c0(String str, C6969o1.C6973d dVar) {
        f15508c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C6999y.f13392a);
        try {
            mo37924W0(bytes.length);
            mo32020b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException((Throwable) e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    public final void mo37928d() {
        if (mo37930g0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public boolean mo37929d0() {
        return this.f15511b;
    }

    /* renamed from: g0 */
    public abstract int mo37930g0();

    /* renamed from: h0 */
    public abstract void mo37931h0(byte b);

    /* renamed from: i0 */
    public abstract void mo37932i0(int i, boolean z);

    /* renamed from: j0 */
    public final void mo37933j0(boolean z) {
        mo37931h0(z ? (byte) 1 : 0);
    }

    /* renamed from: k0 */
    public final void mo37934k0(byte[] bArr) {
        mo37935l0(bArr, 0, bArr.length);
    }

    /* renamed from: l0 */
    public abstract void mo37935l0(byte[] bArr, int i, int i2);

    /* renamed from: m0 */
    public abstract void mo37936m0(int i, ByteString byteString);

    /* renamed from: n0 */
    public abstract void mo37937n0(ByteString byteString);

    /* renamed from: o0 */
    public final void mo37938o0(int i, double d) {
        mo37944u0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: p0 */
    public final void mo37939p0(double d) {
        mo37945v0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: q0 */
    public final void mo37940q0(int i, int i2) {
        mo37904C0(i, i2);
    }

    /* renamed from: r0 */
    public final void mo37941r0(int i) {
        mo37905D0(i);
    }

    /* renamed from: s0 */
    public abstract void mo37942s0(int i, int i2);

    /* renamed from: t0 */
    public abstract void mo37943t0(int i);

    /* renamed from: u0 */
    public abstract void mo37944u0(int i, long j);

    /* renamed from: v0 */
    public abstract void mo37945v0(long j);

    /* renamed from: w0 */
    public final void mo37946w0(int i, float f) {
        mo37942s0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: x0 */
    public final void mo37947x0(float f) {
        mo37943t0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: y0 */
    public final void mo37948y0(int i, C6954m0 m0Var) {
        mo37922U0(i, 3);
        mo37902A0(m0Var);
        mo37922U0(i, 4);
    }

    @Deprecated
    /* renamed from: z0 */
    public final void mo37949z0(int i, C6954m0 m0Var, C6903d1 d1Var) {
        mo37922U0(i, 3);
        mo37903B0(m0Var, d1Var);
        mo37922U0(i, 4);
    }

    public CodedOutputStream() {
    }
}
