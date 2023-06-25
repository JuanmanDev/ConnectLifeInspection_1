package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;

/* renamed from: c.q.d.j1 */
/* compiled from: UnknownFieldSchema */
public abstract class C6944j1<T, B> {
    /* renamed from: a */
    public abstract void mo32095a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo32096b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo32097c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo32098d(B b, int i, ByteString byteString);

    /* renamed from: e */
    public abstract void mo32099e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo32100f(Object obj);

    /* renamed from: g */
    public abstract T mo32101g(Object obj);

    /* renamed from: h */
    public abstract int mo32102h(T t);

    /* renamed from: i */
    public abstract int mo32103i(T t);

    /* renamed from: j */
    public abstract void mo32104j(Object obj);

    /* renamed from: k */
    public abstract T mo32105k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32106l(B r3, p040c.p200q.p405d.C6890b1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo31779A()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo32107m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6944j1.mo32106l(java.lang.Object, c.q.d.b1):void");
    }

    /* renamed from: m */
    public final boolean mo32107m(B b, C6890b1 b1Var) {
        int tag = b1Var.getTag();
        int a = WireFormat.m23292a(tag);
        int b2 = WireFormat.m23293b(tag);
        if (b2 == 0) {
            mo32099e(b, a, b1Var.mo31791M());
            return true;
        } else if (b2 == 1) {
            mo32096b(b, a, b1Var.mo31796c());
            return true;
        } else if (b2 == 2) {
            mo32098d(b, a, b1Var.mo31784F());
            return true;
        } else if (b2 == 3) {
            Object n = mo32108n();
            int c = WireFormat.m23294c(a, 4);
            mo32106l(n, b1Var);
            if (c == b1Var.getTag()) {
                mo32097c(b, a, mo32112r(n));
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo32095a(b, a, b1Var.mo31803i());
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: n */
    public abstract B mo32108n();

    /* renamed from: o */
    public abstract void mo32109o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo32110p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo32111q(C6890b1 b1Var);

    /* renamed from: r */
    public abstract T mo32112r(B b);

    /* renamed from: s */
    public abstract void mo32113s(T t, Writer writer);

    /* renamed from: t */
    public abstract void mo32114t(T t, Writer writer);
}
