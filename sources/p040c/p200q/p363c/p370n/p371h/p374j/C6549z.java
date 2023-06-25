package p040c.p200q.p363c.p370n.p371h.p374j;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p394v.C6770i;

/* renamed from: c.q.c.n.h.j.z */
/* compiled from: IdManager */
public class C6549z implements C6491a0 {

    /* renamed from: g */
    public static final Pattern f12351g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    public static final String f12352h = Pattern.quote("/");

    /* renamed from: a */
    public final C6493b0 f12353a;

    /* renamed from: b */
    public final Context f12354b;

    /* renamed from: c */
    public final String f12355c;

    /* renamed from: d */
    public final C6770i f12356d;

    /* renamed from: e */
    public final C6543w f12357e;

    /* renamed from: f */
    public String f12358f;

    public C6549z(Context context, String str, C6770i iVar, C6543w wVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f12354b = context;
            this.f12355c = str;
            this.f12356d = iVar;
            this.f12357e = wVar;
            this.f12353a = new C6493b0();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    /* renamed from: c */
    public static String m18407c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static String m18408e(String str) {
        if (str == null) {
            return null;
        }
        return f12351g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    public static boolean m18409k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @NonNull
    /* renamed from: a */
    public synchronized String mo30654a() {
        if (this.f12358f != null) {
            return this.f12358f;
        }
        C6479f.m18125f().mo30647i("Determining Crashlytics installation ID...");
        SharedPreferences r = C6513n.m18240r(this.f12354b);
        String string = r.getString("firebase.installation.id", (String) null);
        C6479f f = C6479f.m18125f();
        f.mo30647i("Cached Firebase Installation ID: " + string);
        if (this.f12357e.mo30809d()) {
            String d = mo30817d();
            C6479f f2 = C6479f.m18125f();
            f2.mo30647i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                d = string == null ? m18407c() : string;
            }
            if (d.equals(string)) {
                this.f12358f = mo30823l(r);
            } else {
                this.f12358f = mo30816b(d, r);
            }
        } else if (m18409k(string)) {
            this.f12358f = mo30823l(r);
        } else {
            this.f12358f = mo30816b(m18407c(), r);
        }
        if (this.f12358f == null) {
            C6479f.m18125f().mo30649k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f12358f = mo30816b(m18407c(), r);
        }
        C6479f f3 = C6479f.m18125f();
        f3.mo30647i("Crashlytics installation ID: " + this.f12358f);
        return this.f12358f;
    }

    @NonNull
    /* renamed from: b */
    public final synchronized String mo30816b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m18408e(UUID.randomUUID().toString());
        C6479f f = C6479f.m18125f();
        f.mo30647i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    @Nullable
    /* renamed from: d */
    public final String mo30817d() {
        try {
            return (String) C6505h0.m18191a(this.f12356d.getId());
        } catch (Exception e) {
            C6479f.m18125f().mo30650l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo30818f() {
        return this.f12355c;
    }

    /* renamed from: g */
    public String mo30819g() {
        return this.f12353a.mo30655a(this.f12354b);
    }

    /* renamed from: h */
    public String mo30820h() {
        return String.format(Locale.US, "%s/%s", new Object[]{mo30824m(Build.MANUFACTURER), mo30824m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo30821i() {
        return mo30824m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo30822j() {
        return mo30824m(Build.VERSION.RELEASE);
    }

    /* renamed from: l */
    public final String mo30823l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    public final String mo30824m(String str) {
        return str.replaceAll(f12352h, "");
    }
}
