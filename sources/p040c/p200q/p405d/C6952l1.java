package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;

/* renamed from: c.q.d.l1 */
/* compiled from: UnknownFieldSetLiteSchema */
public class C6952l1 extends C6944j1<C6948k1, C6948k1> {
    /* renamed from: A */
    public C6948k1 mo32101g(Object obj) {
        return ((GeneratedMessageLite) obj).f15527l;
    }

    /* renamed from: B */
    public int mo32102h(C6948k1 k1Var) {
        return k1Var.mo32126f();
    }

    /* renamed from: C */
    public int mo32103i(C6948k1 k1Var) {
        return k1Var.mo32127g();
    }

    /* renamed from: D */
    public C6948k1 mo32105k(C6948k1 k1Var, C6948k1 k1Var2) {
        return k1Var2.equals(C6948k1.m20192e()) ? k1Var : C6948k1.m20195k(k1Var, k1Var2);
    }

    /* renamed from: E */
    public C6948k1 mo32108n() {
        return C6948k1.m20196l();
    }

    /* renamed from: F */
    public void mo32109o(Object obj, C6948k1 k1Var) {
        mo32110p(obj, k1Var);
    }

    /* renamed from: G */
    public void mo32110p(Object obj, C6948k1 k1Var) {
        ((GeneratedMessageLite) obj).f15527l = k1Var;
    }

    /* renamed from: H */
    public C6948k1 mo32188H(C6948k1 k1Var) {
        k1Var.mo32129j();
        return k1Var;
    }

    /* renamed from: I */
    public void mo32113s(C6948k1 k1Var, Writer writer) {
        k1Var.mo32132o(writer);
    }

    /* renamed from: J */
    public void mo32114t(C6948k1 k1Var, Writer writer) {
        k1Var.mo32133q(writer);
    }

    /* renamed from: j */
    public void mo32104j(Object obj) {
        mo32101g(obj).mo32129j();
    }

    /* renamed from: q */
    public boolean mo32111q(C6890b1 b1Var) {
        return false;
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo32112r(Object obj) {
        C6948k1 k1Var = (C6948k1) obj;
        mo32188H(k1Var);
        return k1Var;
    }

    /* renamed from: u */
    public void mo32095a(C6948k1 k1Var, int i, int i2) {
        k1Var.mo32131n(WireFormat.m23294c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo32096b(C6948k1 k1Var, int i, long j) {
        k1Var.mo32131n(WireFormat.m23294c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo32097c(C6948k1 k1Var, int i, C6948k1 k1Var2) {
        k1Var.mo32131n(WireFormat.m23294c(i, 3), k1Var2);
    }

    /* renamed from: x */
    public void mo32098d(C6948k1 k1Var, int i, ByteString byteString) {
        k1Var.mo32131n(WireFormat.m23294c(i, 2), byteString);
    }

    /* renamed from: y */
    public void mo32099e(C6948k1 k1Var, int i, long j) {
        k1Var.mo32131n(WireFormat.m23294c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public C6948k1 mo32100f(Object obj) {
        C6948k1 A = mo32101g(obj);
        if (A != C6948k1.m20192e()) {
            return A;
        }
        C6948k1 l = C6948k1.m20196l();
        mo32110p(obj, l);
        return l;
    }
}
