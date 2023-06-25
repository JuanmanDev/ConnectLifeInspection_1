package p040c.p048b.p049a.p050a.p051a.p067t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.amazon.identity.auth.device.utils.HashAlgorithm;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

@SuppressLint({"PackageManagerGetSignatures"})
/* renamed from: c.b.a.a.a.t.g */
/* compiled from: PackageSignatureUtil */
public class C1478g {

    /* renamed from: a */
    public static final String f656a = "c.b.a.a.a.t.g";

    /* renamed from: a */
    public static List<String> m812a(String str, HashAlgorithm hashAlgorithm, Context context) {
        ArrayList arrayList = new ArrayList();
        Signature[] b = m813b(str, context);
        if (b == null) {
            C1485a.m828a(f656a, " appSignature is null. pkg=" + str);
            return arrayList;
        }
        C1485a.m832e(f656a, "num sigs = " + b.length);
        for (Signature d : b) {
            String str2 = null;
            try {
                str2 = m815d(d, hashAlgorithm);
                arrayList.add(str2.toLowerCase(Locale.US));
            } catch (Exception e) {
                C1485a.m830c(f656a, "Encountered error while finding signatures for " + str, e);
            }
            C1485a.m836i(f656a, "Fingerprint checking", "fingerprint = " + str2);
        }
        return arrayList;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: b */
    public static Signature[] m813b(String str, Context context) {
        PackageInfo packageInfo;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1485a.m828a(f656a, "Can't find app signatures as pkgMgr is null ");
            return null;
        }
        try {
            packageInfo = packageManager.getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            String str2 = f656a;
            C1485a.m828a(str2, "packageName not found for package " + str);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.signatures;
        }
        C1485a.m828a(f656a, "Can't find app signatures as pkgMgr is null ");
        return null;
    }

    /* renamed from: c */
    public static byte[] m814c(HashAlgorithm hashAlgorithm, byte[] bArr) {
        return MessageDigest.getInstance(hashAlgorithm.getAlgorithmName()).digest(bArr);
    }

    /* renamed from: d */
    public static String m815d(Signature signature, HashAlgorithm hashAlgorithm) {
        return C1475d.m808f(m814c(hashAlgorithm, C1480i.m819b(signature.toByteArray()).getEncoded()));
    }
}
