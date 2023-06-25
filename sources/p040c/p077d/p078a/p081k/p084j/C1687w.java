package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1574h;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p105q.C1946f;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.k.j.w */
/* compiled from: ResourceCacheKey */
public final class C1687w implements C1567c {

    /* renamed from: j */
    public static final C1946f<Class<?>, byte[]> f1203j = new C1946f<>(50);

    /* renamed from: b */
    public final C1692b f1204b;

    /* renamed from: c */
    public final C1567c f1205c;

    /* renamed from: d */
    public final C1567c f1206d;

    /* renamed from: e */
    public final int f1207e;

    /* renamed from: f */
    public final int f1208f;

    /* renamed from: g */
    public final Class<?> f1209g;

    /* renamed from: h */
    public final C1571e f1210h;

    /* renamed from: i */
    public final C1574h<?> f1211i;

    public C1687w(C1692b bVar, C1567c cVar, C1567c cVar2, int i, int i2, C1574h<?> hVar, Class<?> cls, C1571e eVar) {
        this.f1204b = bVar;
        this.f1205c = cVar;
        this.f1206d = cVar2;
        this.f1207e = i;
        this.f1208f = i2;
        this.f1211i = hVar;
        this.f1209g = cls;
        this.f1210h = eVar;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f1204b.mo15900c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f1207e).putInt(this.f1208f).array();
        this.f1206d.mo15606a(messageDigest);
        this.f1205c.mo15606a(messageDigest);
        messageDigest.update(bArr);
        C1574h<?> hVar = this.f1211i;
        if (hVar != null) {
            hVar.mo15606a(messageDigest);
        }
        this.f1210h.mo15606a(messageDigest);
        messageDigest.update(mo15888c());
        this.f1204b.put(bArr);
    }

    /* renamed from: c */
    public final byte[] mo15888c() {
        byte[] g = f1203j.mo16434g(this.f1209g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f1209g.getName().getBytes(C1567c.f914a);
        f1203j.mo16436k(this.f1209g, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1687w)) {
            return false;
        }
        C1687w wVar = (C1687w) obj;
        if (this.f1208f != wVar.f1208f || this.f1207e != wVar.f1207e || !C1950j.m2567c(this.f1211i, wVar.f1211i) || !this.f1209g.equals(wVar.f1209g) || !this.f1205c.equals(wVar.f1205c) || !this.f1206d.equals(wVar.f1206d) || !this.f1210h.equals(wVar.f1210h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f1205c.hashCode() * 31) + this.f1206d.hashCode()) * 31) + this.f1207e) * 31) + this.f1208f;
        C1574h<?> hVar = this.f1211i;
        if (hVar != null) {
            hashCode = (hashCode * 31) + hVar.hashCode();
        }
        return (((hashCode * 31) + this.f1209g.hashCode()) * 31) + this.f1210h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f1205c + ", signature=" + this.f1206d + ", width=" + this.f1207e + ", height=" + this.f1208f + ", decodedResourceClass=" + this.f1209g + ", transformation='" + this.f1211i + '\'' + ", options=" + this.f1210h + '}';
    }
}
