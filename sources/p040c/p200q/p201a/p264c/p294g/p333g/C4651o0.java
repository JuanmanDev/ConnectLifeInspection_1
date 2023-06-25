package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.util.List;

/* renamed from: c.q.a.c.g.g.o0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4651o0 implements C4863w2 {

    /* renamed from: a */
    public final C4624n0 f9490a;

    /* renamed from: b */
    public int f9491b;

    /* renamed from: c */
    public int f9492c;

    /* renamed from: d */
    public int f9493d = 0;

    public C4651o0(C4624n0 n0Var) {
        C4706q1.m12869f(n0Var, "input");
        this.f9490a = n0Var;
        n0Var.f9460c = this;
    }

    /* renamed from: Q */
    public static final void m12572Q(int i) {
        if ((i & 3) != 0) {
            throw zzadn.zzg();
        }
    }

    /* renamed from: R */
    public static final void m12573R(int i) {
        if ((i & 7) != 0) {
            throw zzadn.zzg();
        }
    }

    /* renamed from: S */
    public static C4651o0 m12574S(C4624n0 n0Var) {
        C4651o0 o0Var = n0Var.f9460c;
        return o0Var != null ? o0Var : new C4651o0(n0Var);
    }

    /* renamed from: A */
    public final void mo26352A(List list) {
        int c;
        int c2;
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            int i = this.f9491b & 7;
            if (i == 1) {
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26216q());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26216q());
                } while (this.f9490a.mo26203a() < a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26216q()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26216q()));
                } while (this.f9490a.mo26203a() < a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    @Deprecated
    /* renamed from: B */
    public final void mo26353B(List list, C4889x2 x2Var, C4913y0 y0Var) {
        int c;
        int i = this.f9491b;
        if ((i & 7) == 3) {
            do {
                Object d = x2Var.mo26417d();
                mo26385r(d, x2Var, y0Var);
                x2Var.mo26413b(d);
                list.add(d);
                C4624n0 n0Var = this.f9490a;
                if (!n0Var.mo26211i() && this.f9493d == 0) {
                    c = n0Var.mo26205c();
                } else {
                    return;
                }
            } while (c == i);
            this.f9493d = c;
            return;
        }
        throw zzadn.zza();
    }

    /* renamed from: C */
    public final void mo26354C(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26214o());
                } while (this.f9490a.mo26203a() < a);
            } else if (i == 5) {
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26214o());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26214o()));
                } while (this.f9490a.mo26203a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26214o()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: D */
    public final void mo26355D(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26214o());
                } while (this.f9490a.mo26203a() < a);
            } else if (i == 5) {
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26214o());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26214o()));
                } while (this.f9490a.mo26203a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26214o()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: E */
    public final void mo26356E(Object obj, C4889x2 x2Var, C4913y0 y0Var) {
        mo26367P(2);
        mo26365N(obj, x2Var, y0Var);
    }

    /* renamed from: F */
    public final void mo26357F(List list) {
        int c;
        int c2;
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    a2Var.mo25768g(C4624n0.m12505l(((C4570l0) this.f9490a).mo26217r()));
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    a2Var.mo25768g(C4624n0.m12505l(((C4570l0) this.f9490a).mo26217r()));
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(C4624n0.m12505l(((C4570l0) this.f9490a).mo26217r())));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Long.valueOf(C4624n0.m12505l(((C4570l0) this.f9490a).mo26217r())));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: G */
    public final void mo26358G(Object obj, C4889x2 x2Var, C4913y0 y0Var) {
        mo26367P(3);
        mo26385r(obj, x2Var, y0Var);
    }

    /* renamed from: H */
    public final void mo26359H(List list) {
        int c;
        int c2;
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            int i = this.f9491b & 7;
            if (i == 1) {
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26216q());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26216q());
                } while (this.f9490a.mo26203a() < a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26216q()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26216q()));
                } while (this.f9490a.mo26203a() < a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: I */
    public final void mo26360I(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    l1Var.mo26223g(C4624n0.m12504k(((C4570l0) this.f9490a).mo26215p()));
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    l1Var.mo26223g(C4624n0.m12504k(((C4570l0) this.f9490a).mo26215p()));
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(C4624n0.m12504k(((C4570l0) this.f9490a).mo26215p())));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Integer.valueOf(C4624n0.m12504k(((C4570l0) this.f9490a).mo26215p())));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: J */
    public final void mo26361J(List list, C4889x2 x2Var, C4913y0 y0Var) {
        int c;
        int i = this.f9491b;
        if ((i & 7) == 2) {
            do {
                Object d = x2Var.mo26417d();
                mo26365N(d, x2Var, y0Var);
                x2Var.mo26413b(d);
                list.add(d);
                C4624n0 n0Var = this.f9490a;
                if (!n0Var.mo26211i() && this.f9493d == 0) {
                    c = n0Var.mo26205c();
                } else {
                    return;
                }
            } while (c == i);
            this.f9493d = c;
            return;
        }
        throw zzadn.zza();
    }

    /* renamed from: K */
    public final void mo26362K(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: L */
    public final void mo26363L(List list) {
        int c;
        int c2;
        if (list instanceof C4912y) {
            C4912y yVar = (C4912y) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    yVar.mo26846f(this.f9490a.mo26212j());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    yVar.mo26846f(this.f9490a.mo26212j());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9490a.mo26212j()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Boolean.valueOf(this.f9490a.mo26212j()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: M */
    public final void mo26364M(List list) {
        int c;
        int c2;
        if (list instanceof C4382e1) {
            C4382e1 e1Var = (C4382e1) list;
            int i = this.f9491b & 7;
            if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    e1Var.mo25923f(Float.intBitsToFloat(((C4570l0) this.f9490a).mo26214o()));
                } while (this.f9490a.mo26203a() < a);
            } else if (i == 5) {
                do {
                    e1Var.mo25923f(Float.intBitsToFloat(((C4570l0) this.f9490a).mo26214o()));
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12572Q(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C4570l0) this.f9490a).mo26214o())));
                } while (this.f9490a.mo26203a() < a2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((C4570l0) this.f9490a).mo26214o())));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: N */
    public final void mo26365N(Object obj, C4889x2 x2Var, C4913y0 y0Var) {
        int p = ((C4570l0) this.f9490a).mo26215p();
        C4624n0 n0Var = this.f9490a;
        if (n0Var.f9458a < n0Var.f9459b) {
            int b = n0Var.mo26204b(p);
            this.f9490a.f9458a++;
            x2Var.mo26424j(obj, this, y0Var);
            this.f9490a.mo26209g(0);
            C4624n0 n0Var2 = this.f9490a;
            n0Var2.f9458a--;
            n0Var2.mo26210h(b);
            return;
        }
        throw new zzadn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: O */
    public final void mo26366O(int i) {
        if (this.f9490a.mo26203a() != i) {
            throw zzadn.zzi();
        }
    }

    /* renamed from: P */
    public final void mo26367P(int i) {
        if ((this.f9491b & 7) != i) {
            throw zzadn.zza();
        }
    }

    /* renamed from: a */
    public final float mo26368a() {
        mo26367P(5);
        return Float.intBitsToFloat(((C4570l0) this.f9490a).mo26214o());
    }

    /* renamed from: b */
    public final int mo26369b() {
        int i = this.f9493d;
        if (i != 0) {
            this.f9491b = i;
            this.f9493d = 0;
        } else {
            i = this.f9490a.mo26205c();
            this.f9491b = i;
        }
        if (i == 0 || i == this.f9492c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    /* renamed from: c */
    public final int mo26370c() {
        return this.f9491b;
    }

    /* renamed from: d */
    public final int mo26371d() {
        mo26367P(0);
        return ((C4570l0) this.f9490a).mo26215p();
    }

    /* renamed from: e */
    public final int mo26372e() {
        mo26367P(5);
        return ((C4570l0) this.f9490a).mo26214o();
    }

    /* renamed from: f */
    public final int mo26373f() {
        mo26367P(0);
        return C4624n0.m12504k(((C4570l0) this.f9490a).mo26215p());
    }

    /* renamed from: g */
    public final long mo26374g() {
        mo26367P(1);
        return ((C4570l0) this.f9490a).mo26216q();
    }

    /* renamed from: h */
    public final zzacc mo26375h() {
        mo26367P(2);
        return this.f9490a.mo26206d();
    }

    /* renamed from: i */
    public final void mo26376i(List list, boolean z) {
        int c;
        int c2;
        if ((this.f9491b & 7) != 2) {
            throw zzadn.zza();
        } else if ((list instanceof C4784t1) && !z) {
            C4784t1 t1Var = (C4784t1) list;
            do {
                t1Var.mo26624M(mo26375h());
                C4624n0 n0Var = this.f9490a;
                if (!n0Var.mo26211i()) {
                    c2 = n0Var.mo26205c();
                } else {
                    return;
                }
            } while (c2 == this.f9491b);
            this.f9493d = c2;
        } else {
            do {
                list.add(z ? mo26381n() : mo26382o());
                C4624n0 n0Var2 = this.f9490a;
                if (!n0Var2.mo26211i()) {
                    c = n0Var2.mo26205c();
                } else {
                    return;
                }
            } while (c == this.f9491b);
            this.f9493d = c;
        }
    }

    /* renamed from: j */
    public final long mo26377j() {
        mo26367P(0);
        return ((C4570l0) this.f9490a).mo26217r();
    }

    /* renamed from: k */
    public final int mo26378k() {
        mo26367P(0);
        return ((C4570l0) this.f9490a).mo26215p();
    }

    /* renamed from: l */
    public final long mo26379l() {
        mo26367P(0);
        return ((C4570l0) this.f9490a).mo26217r();
    }

    /* renamed from: m */
    public final int mo26380m() {
        mo26367P(0);
        return ((C4570l0) this.f9490a).mo26215p();
    }

    /* renamed from: n */
    public final String mo26381n() {
        mo26367P(2);
        return this.f9490a.mo26208f();
    }

    /* renamed from: o */
    public final String mo26382o() {
        mo26367P(2);
        return this.f9490a.mo26207e();
    }

    /* renamed from: p */
    public final long mo26383p() {
        mo26367P(0);
        return C4624n0.m12505l(((C4570l0) this.f9490a).mo26217r());
    }

    /* renamed from: q */
    public final int mo26384q() {
        mo26367P(5);
        return ((C4570l0) this.f9490a).mo26214o();
    }

    /* renamed from: r */
    public final void mo26385r(Object obj, C4889x2 x2Var, C4913y0 y0Var) {
        int i = this.f9492c;
        this.f9492c = ((this.f9491b >>> 3) << 3) | 4;
        try {
            x2Var.mo26424j(obj, this, y0Var);
            if (this.f9491b != this.f9492c) {
                throw zzadn.zzg();
            }
        } finally {
            this.f9492c = i;
        }
    }

    /* renamed from: s */
    public final long mo26386s() {
        mo26367P(1);
        return ((C4570l0) this.f9490a).mo26216q();
    }

    /* renamed from: t */
    public final boolean mo26387t() {
        mo26367P(0);
        return this.f9490a.mo26212j();
    }

    /* renamed from: u */
    public final void mo26388u(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: v */
    public final void mo26389v(List list) {
        int c;
        int c2;
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26217r());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26217r());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26217r()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26217r()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: w */
    public final void mo26390w(List list) {
        int c;
        int c2;
        if (list instanceof C4275a2) {
            C4275a2 a2Var = (C4275a2) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26217r());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    a2Var.mo25768g(((C4570l0) this.f9490a).mo26217r());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26217r()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Long.valueOf(((C4570l0) this.f9490a).mo26217r()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: x */
    public final void mo26391x(List list) {
        int c;
        int c2;
        if (list instanceof C4835v0) {
            C4835v0 v0Var = (C4835v0) list;
            int i = this.f9491b & 7;
            if (i == 1) {
                do {
                    v0Var.mo26753f(Double.longBitsToDouble(((C4570l0) this.f9490a).mo26216q()));
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int p = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p);
                int a = this.f9490a.mo26203a() + p;
                do {
                    v0Var.mo26753f(Double.longBitsToDouble(((C4570l0) this.f9490a).mo26216q()));
                } while (this.f9490a.mo26203a() < a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C4570l0) this.f9490a).mo26216q())));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int p2 = ((C4570l0) this.f9490a).mo26215p();
                m12573R(p2);
                int a2 = this.f9490a.mo26203a() + p2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((C4570l0) this.f9490a).mo26216q())));
                } while (this.f9490a.mo26203a() < a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    /* renamed from: y */
    public final void mo26392y(List list) {
        int c;
        if ((this.f9491b & 7) == 2) {
            do {
                list.add(mo26375h());
                C4624n0 n0Var = this.f9490a;
                if (!n0Var.mo26211i()) {
                    c = n0Var.mo26205c();
                } else {
                    return;
                }
            } while (c == this.f9491b);
            this.f9493d = c;
            return;
        }
        throw zzadn.zza();
    }

    /* renamed from: z */
    public final void mo26393z(List list) {
        int c;
        int c2;
        if (list instanceof C4571l1) {
            C4571l1 l1Var = (C4571l1) list;
            int i = this.f9491b & 7;
            if (i == 0) {
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                    C4624n0 n0Var = this.f9490a;
                    if (!n0Var.mo26211i()) {
                        c2 = n0Var.mo26205c();
                    } else {
                        return;
                    }
                } while (c2 == this.f9491b);
                this.f9493d = c2;
            } else if (i == 2) {
                int a = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    l1Var.mo26223g(((C4570l0) this.f9490a).mo26215p());
                } while (this.f9490a.mo26203a() < a);
                mo26366O(a);
            } else {
                throw zzadn.zza();
            }
        } else {
            int i2 = this.f9491b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                    C4624n0 n0Var2 = this.f9490a;
                    if (!n0Var2.mo26211i()) {
                        c = n0Var2.mo26205c();
                    } else {
                        return;
                    }
                } while (c == this.f9491b);
                this.f9493d = c;
            } else if (i2 == 2) {
                int a2 = this.f9490a.mo26203a() + ((C4570l0) this.f9490a).mo26215p();
                do {
                    list.add(Integer.valueOf(((C4570l0) this.f9490a).mo26215p()));
                } while (this.f9490a.mo26203a() < a2);
                mo26366O(a2);
            } else {
                throw zzadn.zza();
            }
        }
    }

    public final double zza() {
        mo26367P(1);
        return Double.longBitsToDouble(((C4570l0) this.f9490a).mo26216q());
    }
}
