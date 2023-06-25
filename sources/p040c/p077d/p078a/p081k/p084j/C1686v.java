package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p084j.C1643f;
import p040c.p077d.p078a.p081k.p089k.C1756n;

/* renamed from: c.d.a.k.j.v */
/* compiled from: ResourceCacheGenerator */
public class C1686v implements C1643f, C1578d.C1579a<Object> {

    /* renamed from: e */
    public final C1643f.C1644a f1193e;

    /* renamed from: l */
    public final C1645g<?> f1194l;

    /* renamed from: m */
    public int f1195m;

    /* renamed from: n */
    public int f1196n = -1;

    /* renamed from: o */
    public C1567c f1197o;

    /* renamed from: p */
    public List<C1756n<File, ?>> f1198p;

    /* renamed from: q */
    public int f1199q;

    /* renamed from: r */
    public volatile C1756n.C1757a<?> f1200r;

    /* renamed from: s */
    public File f1201s;

    /* renamed from: t */
    public C1687w f1202t;

    public C1686v(C1645g<?> gVar, C1643f.C1644a aVar) {
        this.f1194l = gVar;
        this.f1193e = aVar;
    }

    /* renamed from: a */
    public boolean mo15742a() {
        List<C1567c> c = this.f1194l.mo15751c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f1194l.mo15761m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f1198p == null || !mo15887b()) {
                    int i = this.f1196n + 1;
                    this.f1196n = i;
                    if (i >= m.size()) {
                        int i2 = this.f1195m + 1;
                        this.f1195m = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f1196n = 0;
                    }
                    C1567c cVar = c.get(this.f1195m);
                    Class cls = m.get(this.f1196n);
                    this.f1202t = new C1687w(this.f1194l.mo15750b(), cVar, this.f1194l.mo15763o(), this.f1194l.mo15767s(), this.f1194l.mo15754f(), this.f1194l.mo15766r(cls), cls, this.f1194l.mo15759k());
                    File b = this.f1194l.mo15752d().mo15693b(this.f1202t);
                    this.f1201s = b;
                    if (b != null) {
                        this.f1197o = cVar;
                        this.f1198p = this.f1194l.mo15758j(b);
                        this.f1199q = 0;
                    }
                } else {
                    this.f1200r = null;
                    while (!z && mo15887b()) {
                        List<C1756n<File, ?>> list = this.f1198p;
                        int i3 = this.f1199q;
                        this.f1199q = i3 + 1;
                        this.f1200r = list.get(i3).mo15974b(this.f1201s, this.f1194l.mo15767s(), this.f1194l.mo15754f(), this.f1194l.mo15759k());
                        if (this.f1200r != null && this.f1194l.mo15768t(this.f1200r.f1310c.mo15624a())) {
                            this.f1200r.f1310c.mo15633e(this.f1194l.mo15760l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f1194l.mo15765q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f1194l.mo15757i() + " to " + this.f1194l.mo15765q());
        }
    }

    /* renamed from: b */
    public final boolean mo15887b() {
        return this.f1199q < this.f1198p.size();
    }

    public void cancel() {
        C1756n.C1757a<?> aVar = this.f1200r;
        if (aVar != null) {
            aVar.f1310c.cancel();
        }
    }

    /* renamed from: d */
    public void mo15643d(@NonNull Exception exc) {
        this.f1193e.mo15746c(this.f1202t, exc, this.f1200r.f1310c, DataSource.RESOURCE_DISK_CACHE);
    }

    /* renamed from: f */
    public void mo15644f(Object obj) {
        this.f1193e.mo15748g(this.f1197o, obj, this.f1200r.f1310c, DataSource.RESOURCE_DISK_CACHE, this.f1202t);
    }
}
