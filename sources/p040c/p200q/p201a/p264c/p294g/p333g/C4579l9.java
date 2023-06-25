package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: c.q.a.c.g.g.l9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4579l9 {

    /* renamed from: a */
    public C4413f5 f9383a = null;

    /* renamed from: b */
    public String f9384b = null;

    /* renamed from: c */
    public C4574l4 f9385c = null;

    /* renamed from: d */
    public C4305b5 f9386d = null;

    /* renamed from: e */
    public C4386e5 f9387e;

    /* renamed from: f */
    public C4714q9 f9388f = null;

    @Deprecated
    /* renamed from: d */
    public final C4579l9 mo26258d(C4930yh yhVar) {
        String J = yhVar.mo26865J();
        byte[] zzt = yhVar.mo26864I().zzt();
        zzoy H = yhVar.mo26863H();
        int i = C4633n9.f9465c;
        zzoy zzoy = zzoy.UNKNOWN_PREFIX;
        int ordinal = H.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f9386d = C4305b5.m11706e(J, zzt, i2);
        return this;
    }

    /* renamed from: e */
    public final C4579l9 mo26259e(String str) {
        if (str.startsWith("android-keystore://")) {
            this.f9384b = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* renamed from: f */
    public final C4579l9 mo26260f(Context context, String str, String str2) {
        if (context != null) {
            this.f9388f = new C4714q9(context, "GenericIdpKeyset", str2);
            this.f9383a = new C4740r9(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    /* renamed from: g */
    public final synchronized C4633n9 mo26261g() {
        C4386e5 e5Var;
        if (this.f9384b != null) {
            this.f9385c = mo26262h();
        }
        try {
            e5Var = mo26263i();
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(C4633n9.f9464b, 4)) {
                String unused = C4633n9.f9464b;
                String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()});
            }
            if (this.f9386d != null) {
                e5Var = C4386e5.m11889e();
                e5Var.mo25934c(this.f9386d);
                e5Var.mo25935d(e5Var.mo25933b().mo25886d().mo26276F(0).mo26183E());
                if (this.f9385c != null) {
                    e5Var.mo25933b().mo25888f(this.f9383a, this.f9385c);
                } else {
                    C4628n4.m12522a(e5Var.mo25933b(), this.f9383a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f9387e = e5Var;
        return new C4633n9(this, (C4606m9) null);
    }

    @Nullable
    /* renamed from: h */
    public final C4574l4 mo26262h() {
        if (Build.VERSION.SDK_INT >= 23) {
            C4687p9 p9Var = new C4687p9();
            boolean a = p9Var.mo26512a(this.f9384b);
            if (!a) {
                try {
                    String str = this.f9384b;
                    if (!new C4687p9().mo26512a(str)) {
                        String a2 = C4751rk.m13022a("android-keystore://", str);
                        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        instance.init(new KeyGenParameterSpec.Builder(a2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                        instance.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                    }
                } catch (GeneralSecurityException | ProviderException unused) {
                    String unused2 = C4633n9.f9464b;
                    return null;
                }
            }
            try {
                return p9Var.mo26021c(this.f9384b);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!a) {
                    String unused3 = C4633n9.f9464b;
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f9384b}), e);
            }
        } else {
            String unused4 = C4633n9.f9464b;
            return null;
        }
    }

    /* renamed from: i */
    public final C4386e5 mo26263i() {
        C4574l4 l4Var = this.f9385c;
        if (l4Var != null) {
            try {
                return C4386e5.m11890f(C4359d5.m11819h(this.f9388f, l4Var));
            } catch (zzadn | GeneralSecurityException unused) {
                String unused2 = C4633n9.f9464b;
            }
        }
        return C4386e5.m11890f(C4628n4.m12523b(this.f9388f));
    }
}
