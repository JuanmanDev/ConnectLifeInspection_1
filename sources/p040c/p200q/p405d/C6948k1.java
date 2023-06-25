package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.Arrays;

/* renamed from: c.q.d.k1 */
/* compiled from: UnknownFieldSetLite */
public final class C6948k1 {

    /* renamed from: f */
    public static final C6948k1 f13310f = new C6948k1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f13311a;

    /* renamed from: b */
    public int[] f13312b;

    /* renamed from: c */
    public Object[] f13313c;

    /* renamed from: d */
    public int f13314d;

    /* renamed from: e */
    public boolean f13315e;

    public C6948k1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static boolean m20190c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m20191d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C6948k1 m20192e() {
        return f13310f;
    }

    /* renamed from: h */
    public static int m20193h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public static int m20194i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: k */
    public static C6948k1 m20195k(C6948k1 k1Var, C6948k1 k1Var2) {
        int i = k1Var.f13311a + k1Var2.f13311a;
        int[] copyOf = Arrays.copyOf(k1Var.f13312b, i);
        System.arraycopy(k1Var2.f13312b, 0, copyOf, k1Var.f13311a, k1Var2.f13311a);
        Object[] copyOf2 = Arrays.copyOf(k1Var.f13313c, i);
        System.arraycopy(k1Var2.f13313c, 0, copyOf2, k1Var.f13311a, k1Var2.f13311a);
        return new C6948k1(i, copyOf, copyOf2, true);
    }

    /* renamed from: l */
    public static C6948k1 m20196l() {
        return new C6948k1();
    }

    /* renamed from: p */
    public static void m20197p(int i, Object obj, Writer writer) {
        int a = WireFormat.m23292a(i);
        int b = WireFormat.m23293b(i);
        if (b == 0) {
            writer.mo32171q(a, ((Long) obj).longValue());
        } else if (b == 1) {
            writer.mo32165k(a, ((Long) obj).longValue());
        } else if (b == 2) {
            writer.mo32176v(a, (ByteString) obj);
        } else if (b != 3) {
            if (b == 5) {
                writer.mo32160f(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
        } else if (writer.mo32166l() == Writer.FieldOrder.ASCENDING) {
            writer.mo32175u(a);
            ((C6948k1) obj).mo32133q(writer);
            writer.mo32141H(a);
        } else {
            writer.mo32141H(a);
            ((C6948k1) obj).mo32133q(writer);
            writer.mo32175u(a);
        }
    }

    /* renamed from: a */
    public void mo32123a() {
        if (!this.f13315e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo32124b() {
        int i = this.f13311a;
        if (i == this.f13312b.length) {
            int i2 = this.f13311a + (i < 4 ? 8 : i >> 1);
            this.f13312b = Arrays.copyOf(this.f13312b, i2);
            this.f13313c = Arrays.copyOf(this.f13313c, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6948k1)) {
            return false;
        }
        C6948k1 k1Var = (C6948k1) obj;
        int i = this.f13311a;
        return i == k1Var.f13311a && m20190c(this.f13312b, k1Var.f13312b, i) && m20191d(this.f13313c, k1Var.f13313c, this.f13311a);
    }

    /* renamed from: f */
    public int mo32126f() {
        int i;
        int i2 = this.f13314d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13311a; i4++) {
            int i5 = this.f13312b[i4];
            int a = WireFormat.m23292a(i5);
            int b = WireFormat.m23293b(i5);
            if (b == 0) {
                i = CodedOutputStream.m23116Y(a, ((Long) this.f13313c[i4]).longValue());
            } else if (b == 1) {
                i = CodedOutputStream.m23134p(a, ((Long) this.f13313c[i4]).longValue());
            } else if (b == 2) {
                i = CodedOutputStream.m23126h(a, (ByteString) this.f13313c[i4]);
            } else if (b == 3) {
                i = (CodedOutputStream.m23113V(a) * 2) + ((C6948k1) this.f13313c[i4]).mo32126f();
            } else if (b == 5) {
                i = CodedOutputStream.m23132n(a, ((Integer) this.f13313c[i4]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
            }
            i3 += i;
        }
        this.f13314d = i3;
        return i3;
    }

    /* renamed from: g */
    public int mo32127g() {
        int i = this.f13314d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13311a; i3++) {
            i2 += CodedOutputStream.m23101J(WireFormat.m23292a(this.f13312b[i3]), (ByteString) this.f13313c[i3]);
        }
        this.f13314d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.f13311a;
        return ((((527 + i) * 31) + m20193h(this.f13312b, i)) * 31) + m20194i(this.f13313c, this.f13311a);
    }

    /* renamed from: j */
    public void mo32129j() {
        this.f13315e = false;
    }

    /* renamed from: m */
    public final void mo32130m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f13311a; i2++) {
            C6968o0.m20433c(sb, i, String.valueOf(WireFormat.m23292a(this.f13312b[i2])), this.f13313c[i2]);
        }
    }

    /* renamed from: n */
    public void mo32131n(int i, Object obj) {
        mo32123a();
        mo32124b();
        int[] iArr = this.f13312b;
        int i2 = this.f13311a;
        iArr[i2] = i;
        this.f13313c[i2] = obj;
        this.f13311a = i2 + 1;
    }

    /* renamed from: o */
    public void mo32132o(Writer writer) {
        if (writer.mo32166l() == Writer.FieldOrder.DESCENDING) {
            for (int i = this.f13311a - 1; i >= 0; i--) {
                writer.mo32159e(WireFormat.m23292a(this.f13312b[i]), this.f13313c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f13311a; i2++) {
            writer.mo32159e(WireFormat.m23292a(this.f13312b[i2]), this.f13313c[i2]);
        }
    }

    /* renamed from: q */
    public void mo32133q(Writer writer) {
        if (this.f13311a != 0) {
            if (writer.mo32166l() == Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.f13311a; i++) {
                    m20197p(this.f13312b[i], this.f13313c[i], writer);
                }
                return;
            }
            for (int i2 = this.f13311a - 1; i2 >= 0; i2--) {
                m20197p(this.f13312b[i2], this.f13313c[i2], writer);
            }
        }
    }

    public C6948k1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13314d = -1;
        this.f13311a = i;
        this.f13312b = iArr;
        this.f13313c = objArr;
        this.f13315e = z;
    }
}
