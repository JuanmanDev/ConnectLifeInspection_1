package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.e8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4389e8 extends C4923ya {

    /* renamed from: d */
    public static final byte[] f9192d = new byte[0];

    public C4389e8() {
        super(C4505ig.class, C4586lg.class, new C4335c8(C4709q4.class));
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ C4310ba m11902m(int i, int i2, int i3, C4305b5 b5Var, byte[] bArr, int i4) {
        zzoy zzoy;
        C4289ag E = C4316bg.m11732E();
        C4640ng E2 = C4667og.m12721E();
        E2.mo26333m(4);
        E2.mo26334p(5);
        E2.mo26332l(zzacc.zzn(bArr));
        C4667og ogVar = (C4667og) E2.mo26052e();
        C4904xh E3 = C4930yh.m13605E();
        E3.mo26826m(b5Var.mo25810b());
        E3.mo26827p(zzacc.zzn(b5Var.mo25811c()));
        int d = b5Var.mo25812d() - 1;
        if (d == 0) {
            zzoy = zzoy.TINK;
        } else if (d == 1) {
            zzoy = zzoy.LEGACY;
        } else if (d != 2) {
            zzoy = zzoy.CRUNCHY;
        } else {
            zzoy = zzoy.RAW;
        }
        E3.mo26825l(zzoy);
        C4902xf E4 = C4928yf.m13597E();
        E4.mo26824l((C4930yh) E3.mo26052e());
        C4370dg F = C4424fg.m11966F();
        F.mo25905m(ogVar);
        F.mo25904l((C4928yf) E4.mo26052e());
        F.mo25906p(i3);
        E.mo25793l((C4424fg) F.mo26052e());
        return new C4310ba((C4316bg) E.mo26052e(), i4);
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4362d8(this, C4316bg.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4505ig.m12162H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4505ig igVar = (C4505ig) l2Var;
        if (!igVar.mo26112J().zzs()) {
            C4751rk.m13024c(igVar.mo26110E(), 0);
            C4632n8.m12528a(igVar.mo26111I().mo26273F());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: k */
    public final /* synthetic */ C4572l2 mo25852k(C4572l2 l2Var) {
        return ((C4505ig) l2Var).mo26111I();
    }
}
