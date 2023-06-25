package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.Iterator;
import java.util.Map;
import p040c.p200q.p405d.C6988u;
import p040c.p200q.p405d.C7010z;

/* renamed from: c.q.d.q0 */
/* compiled from: MessageSetSchema */
public final class C6980q0<T> implements C6903d1<T> {

    /* renamed from: a */
    public final C6954m0 f13367a;

    /* renamed from: b */
    public final C6944j1<?, ?> f13368b;

    /* renamed from: c */
    public final boolean f13369c;

    /* renamed from: d */
    public final C6979q<?> f13370d;

    public C6980q0(C6944j1<?, ?> j1Var, C6979q<?> qVar, C6954m0 m0Var) {
        this.f13368b = j1Var;
        this.f13369c = qVar.mo32332e(m0Var);
        this.f13370d = qVar;
        this.f13367a = m0Var;
    }

    /* renamed from: l */
    public static <T> C6980q0<T> m20596l(C6944j1<?, ?> j1Var, C6979q<?> qVar, C6954m0 m0Var) {
        return new C6980q0<>(j1Var, qVar, m0Var);
    }

    /* renamed from: a */
    public void mo31882a(T t, T t2) {
        C6915f1.m19824G(this.f13368b, t, t2);
        if (this.f13369c) {
            C6915f1.m19822E(this.f13370d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo31883b(T t, Writer writer) {
        Iterator<Map.Entry<?, Object>> s = this.f13370d.mo32330c(t).mo32368s();
        while (s.hasNext()) {
            Map.Entry next = s.next();
            C6988u.C6990b bVar = (C6988u.C6990b) next.getKey();
            if (bVar.mo32379s() != WireFormat.JavaType.MESSAGE || bVar.mo32374f() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C7010z.C7012b) {
                writer.mo32159e(bVar.getNumber(), ((C7010z.C7012b) next).mo32436a().mo31748e());
            } else {
                writer.mo32159e(bVar.getNumber(), next.getValue());
            }
        }
        mo32341n(this.f13368b, t, writer);
    }

    /* renamed from: c */
    public void mo31884c(T t) {
        this.f13368b.mo32104j(t);
        this.f13370d.mo32333f(t);
    }

    /* renamed from: d */
    public final boolean mo31885d(T t) {
        return this.f13370d.mo32330c(t).mo32367p();
    }

    /* renamed from: e */
    public void mo31886e(T t, C6890b1 b1Var, C6975p pVar) {
        mo32339k(this.f13368b, this.f13370d, t, b1Var, pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.GeneratedMessageLite$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31887f(T r11, byte[] r12, int r13, int r14, p040c.p200q.p405d.C6904e.C6906b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            c.q.d.k1 r1 = r0.f15527l
            c.q.d.k1 r2 = p040c.p200q.p405d.C6948k1.m20192e()
            if (r1 != r2) goto L_0x0011
            c.q.d.k1 r1 = p040c.p200q.p405d.C6948k1.m20196l()
            r0.f15527l = r1
        L_0x0011:
            com.google.protobuf.GeneratedMessageLite$c r11 = (com.google.protobuf.GeneratedMessageLite.C8428c) r11
            c.q.d.u r11 = r11.mo37989H()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = p040c.p200q.p405d.C6904e.m19698I(r12, r13, r15)
            int r13 = r15.f13210a
            int r3 = com.google.protobuf.WireFormat.f15543a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.WireFormat.m23293b(r13)
            if (r3 != r5) goto L_0x0066
            c.q.d.q<?> r2 = r10.f13370d
            c.q.d.p r3 = r15.f13213d
            c.q.d.m0 r5 = r10.f13367a
            int r6 = com.google.protobuf.WireFormat.m23292a(r13)
            java.lang.Object r2 = r2.mo32329b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.GeneratedMessageLite$e r8 = (com.google.protobuf.GeneratedMessageLite.C8430e) r8
            if (r8 == 0) goto L_0x005b
            c.q.d.y0 r13 = p040c.p200q.p405d.C7009y0.m20722a()
            c.q.d.m0 r2 = r8.mo37994b()
            java.lang.Class r2 = r2.getClass()
            c.q.d.d1 r13 = r13.mo32432d(r2)
            int r13 = p040c.p200q.p405d.C6904e.m19719p(r13, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r2 = r8.f15540b
            java.lang.Object r3 = r15.f13212c
            r11.mo32372x(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = p040c.p200q.p405d.C6904e.m19696G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = p040c.p200q.p405d.C6904e.m19703N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = p040c.p200q.p405d.C6904e.m19698I(r12, r4, r15)
            int r6 = r15.f13210a
            int r7 = com.google.protobuf.WireFormat.m23292a(r6)
            int r8 = com.google.protobuf.WireFormat.m23293b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            c.q.d.y0 r6 = p040c.p200q.p405d.C7009y0.m20722a()
            c.q.d.m0 r7 = r2.mo37994b()
            java.lang.Class r7 = r7.getClass()
            c.q.d.d1 r6 = r6.mo32432d(r7)
            int r4 = p040c.p200q.p405d.C6904e.m19719p(r6, r12, r4, r14, r15)
            com.google.protobuf.GeneratedMessageLite$d r6 = r2.f15540b
            java.lang.Object r7 = r15.f13212c
            r11.mo32372x(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = p040c.p200q.p405d.C6904e.m19705b(r12, r4, r15)
            java.lang.Object r3 = r15.f13212c
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = p040c.p200q.p405d.C6904e.m19698I(r12, r4, r15)
            int r13 = r15.f13210a
            c.q.d.q<?> r2 = r10.f13370d
            c.q.d.p r6 = r15.f13213d
            c.q.d.m0 r7 = r10.f13367a
            java.lang.Object r2 = r2.mo32329b(r6, r7, r13)
            com.google.protobuf.GeneratedMessageLite$e r2 = (com.google.protobuf.GeneratedMessageLite.C8430e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.WireFormat.f15544b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = p040c.p200q.p405d.C6904e.m19703N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.WireFormat.m23294c(r13, r5)
            r1.mo32131n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.InvalidProtocolBufferException r11 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6980q0.mo31887f(java.lang.Object, byte[], int, int, c.q.d.e$b):void");
    }

    /* renamed from: g */
    public boolean mo31888g(T t, T t2) {
        if (!this.f13368b.mo32101g(t).equals(this.f13368b.mo32101g(t2))) {
            return false;
        }
        if (this.f13369c) {
            return this.f13370d.mo32330c(t).equals(this.f13370d.mo32330c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public int mo31889h(T t) {
        int j = mo32338j(this.f13368b, t) + 0;
        return this.f13369c ? j + this.f13370d.mo32330c(t).mo32362j() : j;
    }

    /* renamed from: i */
    public int mo31890i(T t) {
        int hashCode = this.f13368b.mo32101g(t).hashCode();
        return this.f13369c ? (hashCode * 53) + this.f13370d.mo32330c(t).hashCode() : hashCode;
    }

    /* renamed from: j */
    public final <UT, UB> int mo32338j(C6944j1<UT, UB> j1Var, T t) {
        return j1Var.mo32103i(j1Var.mo32101g(t));
    }

    /* renamed from: k */
    public final <UT, UB, ET extends C6988u.C6990b<ET>> void mo32339k(C6944j1<UT, UB> j1Var, C6979q<ET> qVar, T t, C6890b1 b1Var, C6975p pVar) {
        UB f = j1Var.mo32100f(t);
        C6988u<ET> d = qVar.mo32331d(t);
        do {
            try {
                if (b1Var.mo31779A() == Integer.MAX_VALUE) {
                    j1Var.mo32109o(t, f);
                    return;
                }
            } finally {
                j1Var.mo32109o(t, f);
            }
        } while (mo32340m(b1Var, pVar, qVar, d, j1Var, f));
    }

    /* renamed from: m */
    public final <UT, UB, ET extends C6988u.C6990b<ET>> boolean mo32340m(C6890b1 b1Var, C6975p pVar, C6979q<ET> qVar, C6988u<ET> uVar, C6944j1<UT, UB> j1Var, UB ub) {
        int tag = b1Var.getTag();
        if (tag == WireFormat.f15543a) {
            int i = 0;
            Object obj = null;
            ByteString byteString = null;
            while (b1Var.mo31779A() != Integer.MAX_VALUE) {
                int tag2 = b1Var.getTag();
                if (tag2 == WireFormat.f15545c) {
                    i = b1Var.mo31809o();
                    obj = qVar.mo32329b(pVar, this.f13367a, i);
                } else if (tag2 == WireFormat.f15546d) {
                    if (obj != null) {
                        qVar.mo32335h(b1Var, obj, pVar, uVar);
                    } else {
                        byteString = b1Var.mo31784F();
                    }
                } else if (!b1Var.mo31787I()) {
                    break;
                }
            }
            if (b1Var.getTag() == WireFormat.f15544b) {
                if (byteString != null) {
                    if (obj != null) {
                        qVar.mo32336i(byteString, obj, pVar, uVar);
                    } else {
                        j1Var.mo32098d(ub, i, byteString);
                    }
                }
                return true;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        } else if (WireFormat.m23293b(tag) != 2) {
            return b1Var.mo31787I();
        } else {
            Object b = qVar.mo32329b(pVar, this.f13367a, WireFormat.m23292a(tag));
            if (b == null) {
                return j1Var.mo32107m(ub, b1Var);
            }
            qVar.mo32335h(b1Var, b, pVar, uVar);
            return true;
        }
    }

    /* renamed from: n */
    public final <UT, UB> void mo32341n(C6944j1<UT, UB> j1Var, T t, Writer writer) {
        j1Var.mo32113s(j1Var.mo32101g(t), writer);
    }

    public T newInstance() {
        return this.f13367a.mo32218h().mo32220D();
    }
}
