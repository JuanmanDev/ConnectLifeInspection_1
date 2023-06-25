package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: c.q.a.c.g.g.zc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4951zc implements C4494i5 {

    /* renamed from: a */
    public final C4710q5 f9778a;

    public /* synthetic */ C4951zc(C4710q5 q5Var, C4925yc ycVar) {
        this.f9778a = q5Var;
        if (q5Var.mo26572f()) {
            C4475hd b = C4634na.m12534a().mo26329b();
            C4610md a = C4553ka.m12280a(q5Var);
            b.mo26073a(a, "mac", "compute");
            b.mo26073a(a, "mac", "verify");
            return;
        }
        C4448gd gdVar = C4553ka.f9325a;
    }

    /* renamed from: a */
    public final void mo26099a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (C4602m5 m5Var : this.f9778a.mo26571e(copyOf)) {
                if (m5Var.mo26303d().equals(zzoy.LEGACY)) {
                    bArr3 = C4724qj.m12936c(bArr2, C4286ad.f9125b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((C4494i5) m5Var.mo26304e()).mo26099a(copyOfRange, bArr3);
                    m5Var.mo26300a();
                    return;
                } catch (GeneralSecurityException e) {
                    C4286ad.f9124a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (C4602m5 m5Var2 : this.f9778a.mo26571e(C4655o4.f9511a)) {
                try {
                    ((C4494i5) m5Var2.mo26304e()).mo26099a(bArr, bArr2);
                    m5Var2.mo26300a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
