package p040c.p200q.p363c.p367l.p368h;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import p040c.p200q.p201a.p264c.p294g.p333g.C4413f5;
import p040c.p200q.p201a.p264c.p294g.p333g.C4470h8;
import p040c.p200q.p201a.p264c.p294g.p333g.C4579l9;
import p040c.p200q.p201a.p264c.p294g.p333g.C4601m4;
import p040c.p200q.p201a.p264c.p294g.p333g.C4605m8;
import p040c.p200q.p201a.p264c.p294g.p333g.C4633n9;
import p040c.p200q.p201a.p264c.p294g.p333g.C4673om;
import p040c.p200q.p201a.p264c.p294g.p333g.C4709q4;

/* renamed from: c.q.c.l.h.d0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6376d0 {

    /* renamed from: c */
    public static C6376d0 f12049c;

    /* renamed from: a */
    public final String f12050a;
    @Nullable

    /* renamed from: b */
    public final C4633n9 f12051b;

    public C6376d0(Context context, String str, boolean z) {
        C4633n9 n9Var;
        this.f12050a = str;
        try {
            C4470h8.m12093a();
            C4579l9 l9Var = new C4579l9();
            l9Var.mo26260f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            l9Var.mo26258d(C4605m8.f9426b);
            l9Var.mo26259e(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            n9Var = l9Var.mo26261g();
        } catch (IOException | GeneralSecurityException e) {
            "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage()));
            n9Var = null;
        }
        this.f12051b = n9Var;
    }

    /* renamed from: a */
    public static C6376d0 m17906a(Context context, String str) {
        C6376d0 d0Var = f12049c;
        if (d0Var == null || !C4673om.m12741a(d0Var.f12050a, str)) {
            f12049c = new C6376d0(context, str, true);
        }
        return f12049c;
    }

    @Nullable
    /* renamed from: b */
    public final String mo30469b(String str) {
        String str2;
        C4633n9 n9Var = this.f12051b;
        if (n9Var != null) {
            try {
                synchronized (n9Var) {
                    str2 = new String(((C4709q4) this.f12051b.mo26328a().mo25887e(C4709q4.class)).mo26102a(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public final String mo30470c() {
        if (this.f12051b == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4413f5 c = C4601m4.m12460c(byteArrayOutputStream);
        try {
            synchronized (this.f12051b) {
                this.f12051b.mo26328a().mo25884b().mo25889g(c);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage()));
            return null;
        }
    }
}
