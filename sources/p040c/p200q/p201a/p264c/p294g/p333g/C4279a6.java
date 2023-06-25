package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzoy;

@Deprecated
/* renamed from: c.q.a.c.g.g.a6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4279a6 {

    /* renamed from: a */
    public static final C4930yh f9117a = m11677b(16);

    /* renamed from: b */
    public static final C4930yh f9118b = m11678c(16, 16, 32, 16, 5);

    static {
        m11677b(32);
        m11676a(16, 16);
        m11676a(32, 16);
        m11678c(32, 16, 32, 32, 5);
        C4904xh E = C4930yh.m13605E();
        new C4841v6();
        E.mo26826m("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        E.mo26825l(zzoy.TINK);
        C4930yh yhVar = (C4930yh) E.mo26052e();
        C4904xh E2 = C4930yh.m13605E();
        new C4442g7();
        E2.mo26826m("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        E2.mo26825l(zzoy.TINK);
        C4930yh yhVar2 = (C4930yh) E2.mo26052e();
    }

    /* renamed from: a */
    public static C4930yh m11676a(int i, int i2) {
        C4745re F = C4771se.m13065F();
        F.mo26613l(i);
        C4823ue F2 = C4849ve.m13325F();
        F2.mo26730l(16);
        F.mo26614m((C4849ve) F2.mo26052e());
        C4904xh E = C4930yh.m13605E();
        E.mo26827p(((C4771se) F.mo26052e()).mo26232j());
        new C4603m6();
        E.mo26826m("type.googleapis.com/google.crypto.tink.AesEaxKey");
        E.mo26825l(zzoy.TINK);
        return (C4930yh) E.mo26052e();
    }

    /* renamed from: b */
    public static C4930yh m11677b(int i) {
        C4288af F = C4315bf.m11726F();
        F.mo25792l(i);
        C4904xh E = C4930yh.m13605E();
        E.mo26827p(((C4315bf) F.mo26052e()).mo26232j());
        new C4684p6();
        E.mo26826m("type.googleapis.com/google.crypto.tink.AesGcmKey");
        E.mo26825l(zzoy.TINK);
        return (C4930yh) E.mo26052e();
    }

    /* renamed from: c */
    public static C4930yh m11678c(int i, int i2, int i3, int i4, int i5) {
        C4503ie F = C4530je.m12221F();
        C4584le F2 = C4611me.m12483F();
        F2.mo26269l(16);
        F.mo26108m((C4611me) F2.mo26052e());
        F.mo26107l(i);
        C4929yg F3 = C4955zg.m13727F();
        C4317bh F4 = C4344ch.m11781F();
        F4.mo25828m(5);
        F4.mo25827l(i4);
        F3.mo26862m((C4344ch) F4.mo26052e());
        F3.mo26861l(32);
        C4314be E = C4341ce.m11773E();
        E.mo25822l((C4530je) F.mo26052e());
        E.mo25823m((C4955zg) F3.mo26052e());
        C4904xh E2 = C4930yh.m13605E();
        E2.mo26827p(((C4341ce) E.mo26052e()).mo26232j());
        new C4441g6();
        E2.mo26826m("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        E2.mo26825l(zzoy.TINK);
        return (C4930yh) E2.mo26052e();
    }
}
