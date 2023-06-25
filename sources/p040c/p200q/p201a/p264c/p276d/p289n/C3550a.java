package p040c.p200q.p201a.p264c.p276d.p289n;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p040c.p200q.p201a.p264c.p276d.p291o.C3573c;

/* renamed from: c.q.a.c.d.n.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3550a {
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static byte[] m9042a(@NonNull Context context, @NonNull String str) {
        MessageDigest b;
        PackageInfo e = C3573c.m9110a(context).mo20847e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m9043b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    @Nullable
    /* renamed from: b */
    public static MessageDigest m9043b(@NonNull String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
