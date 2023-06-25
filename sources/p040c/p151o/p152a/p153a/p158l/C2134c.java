package p040c.p151o.p152a.p153a.p158l;

import com.gigya.android.sdk.encryption.EncryptionException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p040c.p151o.p152a.p153a.p166o.C2153a;
import p040c.p151o.p152a.p153a.p174u.C2202c;

/* renamed from: c.o.a.a.l.c */
/* compiled from: SessionKeyLegacy */
public class C2134c implements C2132a {

    /* renamed from: a */
    public final C2153a f2104a;

    public SecretKey getKey() {
        try {
            String h = this.f2104a.mo16969h("GS_PREFA", (String) null);
            if (h != null) {
                byte[] b = C2202c.m3348b(h);
                return new SecretKeySpec(b, 0, b.length, "AES");
            }
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128);
            SecretKey generateKey = instance.generateKey();
            this.f2104a.mo16970i("GS_PREFA", C2202c.m3347a(generateKey.getEncoded()));
            return generateKey;
        } catch (Exception e) {
            throw new EncryptionException("Session encryption exception", e.getCause());
        }
    }
}
