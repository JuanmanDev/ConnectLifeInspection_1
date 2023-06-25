package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.o8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4659o8 implements C4802tj {

    /* renamed from: a */
    public final String f9513a;

    /* renamed from: b */
    public final int f9514b;

    /* renamed from: c */
    public C4927ye f9515c;

    /* renamed from: d */
    public C4952zd f9516d;

    /* renamed from: e */
    public int f9517e;

    /* renamed from: f */
    public C4585lf f9518f;

    public C4659o8(C4930yh yhVar) {
        String J = yhVar.mo26865J();
        this.f9513a = J;
        if (J.equals(C4944z5.f9764b)) {
            try {
                C4315bf H = C4315bf.m11728H(yhVar.mo26864I(), C4913y0.m13537a());
                this.f9515c = (C4927ye) C4840v5.m13298d(yhVar);
                this.f9514b = H.mo25824E();
            } catch (zzadn e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f9513a.equals(C4944z5.f9763a)) {
            try {
                C4341ce G = C4341ce.m11775G(yhVar.mo26864I(), C4913y0.m13537a());
                this.f9516d = (C4952zd) C4840v5.m13298d(yhVar);
                this.f9517e = G.mo25854H().mo26135E();
                this.f9514b = this.f9517e + G.mo25855I().mo26889E();
            } catch (zzadn e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (this.f9513a.equals(C4946z7.f9766a)) {
            try {
                C4666of H2 = C4666of.m12717H(yhVar.mo26864I(), C4913y0.m13537a());
                this.f9518f = (C4585lf) C4840v5.m13298d(yhVar);
                this.f9514b = H2.mo26471E();
            } catch (zzadn e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(this.f9513a)));
        }
    }

    /* renamed from: a */
    public final C4552k9 mo26459a(byte[] bArr) {
        Class<C4574l4> cls = C4574l4.class;
        if (bArr.length != this.f9514b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f9513a.equals(C4944z5.f9764b)) {
            C4901xe F = C4927ye.m13589F();
            F.mo26051d(this.f9515c);
            F.mo26822l(zzacc.zzo(bArr, 0, this.f9514b));
            return new C4552k9((C4574l4) C4840v5.m13303i(this.f9513a, (C4927ye) F.mo26052e(), cls));
        } else if (this.f9513a.equals(C4944z5.f9763a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f9517e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f9517e, this.f9514b);
            C4422fe F2 = C4449ge.m12044F();
            F2.mo26051d(this.f9516d.mo26887I());
            F2.mo25982l(zzacc.zzn(copyOfRange));
            C4851vg F3 = C4877wg.m13415F();
            F3.mo26051d(this.f9516d.mo26888J());
            F3.mo26779l(zzacc.zzn(copyOfRange2));
            C4926yd F4 = C4952zd.m13717F();
            F4.mo26857p(this.f9516d.mo26886E());
            F4.mo26855l((C4449ge) F2.mo26052e());
            F4.mo26856m((C4877wg) F3.mo26052e());
            return new C4552k9((C4574l4) C4840v5.m13303i(this.f9513a, (C4952zd) F4.mo26052e(), cls));
        } else if (this.f9513a.equals(C4946z7.f9766a)) {
            C4558kf F5 = C4585lf.m12405F();
            F5.mo26051d(this.f9518f);
            F5.mo26174l(zzacc.zzo(bArr, 0, this.f9514b));
            return new C4552k9((C4682p4) C4840v5.m13303i(this.f9513a, (C4585lf) F5.mo26052e(), C4682p4.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f9514b;
    }
}
