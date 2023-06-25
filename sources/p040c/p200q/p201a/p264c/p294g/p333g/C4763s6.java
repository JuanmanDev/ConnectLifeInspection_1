package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: c.q.a.c.g.g.s6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4763s6 extends C4364da {
    public C4763s6() {
        super(C4423ff.class, new C4711q6(C4574l4.class));
    }

    /* renamed from: k */
    public static void m13047k(boolean z) {
        if (m13049m()) {
            C4840v5.m13308n(new C4763s6(), true);
        }
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ C4310ba m13048l(int i, int i2) {
        C4477hf F = C4504if.m12154F();
        F.mo26074l(i);
        return new C4310ba((C4504if) F.mo26052e(), i2);
    }

    /* renamed from: m */
    public static boolean m13049m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C4337ca mo25847a() {
        return new C4737r6(this, C4504if.class);
    }

    /* renamed from: b */
    public final zznr mo25848b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C4572l2 mo25849c(zzacc zzacc) {
        return C4423ff.m11960H(zzacc, C4913y0.m13537a());
    }

    /* renamed from: d */
    public final String mo25850d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo25851e(C4572l2 l2Var) {
        C4423ff ffVar = (C4423ff) l2Var;
        C4751rk.m13024c(ffVar.mo25985E(), 0);
        C4751rk.m13023b(ffVar.mo25986I().zzd());
    }
}
