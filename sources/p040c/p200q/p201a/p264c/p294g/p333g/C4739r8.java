package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: c.q.a.c.g.g.r8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4739r8 {

    /* renamed from: a */
    public final String f9598a;

    public C4739r8(String str) {
        this.f9598a = str;
    }

    /* renamed from: a */
    public final int mo26606a() {
        return Mac.getInstance(this.f9598a).getMacLength();
    }

    /* renamed from: b */
    public final byte[] mo26607b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) {
        return mo26611f(mo26612g(C4417f9.m11951e("eae_prk", bArr2, bArr4), (byte[]) null), C4417f9.m11952f("shared_secret", bArr3, bArr4, i), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo26608c() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f9598a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r3
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = r4
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4417f9.f9216h
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4417f9.f9215g
            return r0
        L_0x004b:
            byte[] r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4417f9.f9214f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4739r8.mo26608c():byte[]");
    }

    /* renamed from: d */
    public final byte[] mo26609d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) {
        return mo26611f(bArr, C4417f9.m11952f(str, bArr2, bArr3, i), i);
    }

    /* renamed from: e */
    public final byte[] mo26610e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return mo26612g(C4417f9.m11951e(str, bArr2, bArr3), bArr);
    }

    /* renamed from: f */
    public final byte[] mo26611f(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) C4958zj.f9783f.mo26891a(this.f9598a);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, this.f9598a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* renamed from: g */
    public final byte[] mo26612g(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) C4958zj.f9783f.mo26891a(this.f9598a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f9598a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f9598a));
        }
        return mac.doFinal(bArr);
    }
}
