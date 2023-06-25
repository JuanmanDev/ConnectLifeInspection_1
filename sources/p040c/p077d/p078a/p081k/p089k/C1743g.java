package p040c.p077d.p078a.p081k.p089k;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.k.g */
/* compiled from: GlideUrl */
public class C1743g implements C1567c {

    /* renamed from: b */
    public final C1744h f1284b;
    @Nullable

    /* renamed from: c */
    public final URL f1285c;
    @Nullable

    /* renamed from: d */
    public final String f1286d;
    @Nullable

    /* renamed from: e */
    public String f1287e;
    @Nullable

    /* renamed from: f */
    public URL f1288f;
    @Nullable

    /* renamed from: g */
    public volatile byte[] f1289g;

    /* renamed from: h */
    public int f1290h;

    public C1743g(URL url) {
        this(url, C1744h.f1291a);
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(mo16003d());
    }

    /* renamed from: c */
    public String mo16002c() {
        String str = this.f1286d;
        if (str != null) {
            return str;
        }
        URL url = this.f1285c;
        C1949i.m2563d(url);
        return url.toString();
    }

    /* renamed from: d */
    public final byte[] mo16003d() {
        if (this.f1289g == null) {
            this.f1289g = mo16002c().getBytes(C1567c.f914a);
        }
        return this.f1289g;
    }

    /* renamed from: e */
    public Map<String, String> mo16004e() {
        return this.f1284b.mo16009a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1743g)) {
            return false;
        }
        C1743g gVar = (C1743g) obj;
        if (!mo16002c().equals(gVar.mo16002c()) || !this.f1284b.equals(gVar.f1284b)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo16005f() {
        if (TextUtils.isEmpty(this.f1287e)) {
            String str = this.f1286d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f1285c;
                C1949i.m2563d(url);
                str = url.toString();
            }
            this.f1287e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f1287e;
    }

    /* renamed from: g */
    public final URL mo16006g() {
        if (this.f1288f == null) {
            this.f1288f = new URL(mo16005f());
        }
        return this.f1288f;
    }

    /* renamed from: h */
    public URL mo16007h() {
        return mo16006g();
    }

    public int hashCode() {
        if (this.f1290h == 0) {
            int hashCode = mo16002c().hashCode();
            this.f1290h = hashCode;
            this.f1290h = (hashCode * 31) + this.f1284b.hashCode();
        }
        return this.f1290h;
    }

    public String toString() {
        return mo16002c();
    }

    public C1743g(String str) {
        this(str, C1744h.f1291a);
    }

    public C1743g(URL url, C1744h hVar) {
        C1949i.m2563d(url);
        this.f1285c = url;
        this.f1286d = null;
        C1949i.m2563d(hVar);
        this.f1284b = hVar;
    }

    public C1743g(String str, C1744h hVar) {
        this.f1285c = null;
        C1949i.m2561b(str);
        this.f1286d = str;
        C1949i.m2563d(hVar);
        this.f1284b = hVar;
    }
}
