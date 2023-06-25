package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.y8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4921y8 {
    /* renamed from: a */
    public static C4765s8 m13582a(C4560kh khVar) {
        if (khVar.mo26180H() == 3) {
            return new C4686p8(16);
        }
        if (khVar.mo26180H() == 4) {
            return new C4686p8(32);
        }
        if (khVar.mo26180H() == 5) {
            return new C4713q8();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    public static C4869w8 m13583b(C4560kh khVar) {
        if (khVar.mo26182J() == 3) {
            return new C4498i9(new C4739r8("HmacSha256"));
        }
        if (khVar.mo26182J() == 4) {
            return C4444g9.m12038c(1);
        }
        if (khVar.mo26182J() == 5) {
            return C4444g9.m12038c(2);
        }
        if (khVar.mo26182J() == 6) {
            return C4444g9.m12038c(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    public static C4739r8 m13584c(C4560kh khVar) {
        if (khVar.mo26181I() == 3) {
            return new C4739r8("HmacSha256");
        }
        if (khVar.mo26181I() == 4) {
            return new C4739r8("HmacSha384");
        }
        if (khVar.mo26181I() == 5) {
            return new C4739r8("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
