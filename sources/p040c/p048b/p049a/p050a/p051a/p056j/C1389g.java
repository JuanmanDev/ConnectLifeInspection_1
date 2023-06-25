package p040c.p048b.p049a.p050a.p051a.p056j;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.g */
/* compiled from: CodeChallengeWorkflow */
public class C1389g {

    /* renamed from: d */
    public static final String f437d = "c.b.a.a.a.j.g";

    /* renamed from: e */
    public static C1389g f438e;

    /* renamed from: a */
    public String f439a;

    /* renamed from: b */
    public String f440b;

    /* renamed from: c */
    public String f441c;

    /* renamed from: f */
    public static C1389g m389f() {
        if (f438e == null) {
            f438e = new C1389g();
        }
        return f438e;
    }

    /* renamed from: a */
    public final String mo15114a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    public final String mo15115b(String str, String str2) {
        if ("S256".equalsIgnoreCase(str2)) {
            return mo15114a(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
        }
        throw new NoSuchAlgorithmException("Challenge method is not supported.");
    }

    /* renamed from: c */
    public final String mo15116c() {
        return mo15114a(mo15117d());
    }

    @SuppressLint({"TrulyRandom"})
    /* renamed from: d */
    public final byte[] mo15117d() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: e */
    public String mo15118e() {
        return this.f439a;
    }

    /* renamed from: g */
    public Bundle mo15119g() {
        String c = mo15116c();
        this.f439a = c;
        try {
            this.f440b = "S256";
            this.f441c = mo15115b(c, "S256");
        } catch (NoSuchAlgorithmException e) {
            C1485a.m830c(f437d, "Error generating Proof Key parameter", e);
            this.f440b = "plain";
            this.f441c = this.f439a;
        }
        Bundle bundle = new Bundle();
        bundle.putString("code_challenge_method", this.f440b);
        bundle.putString("code_challenge", this.f441c);
        return bundle;
    }
}
