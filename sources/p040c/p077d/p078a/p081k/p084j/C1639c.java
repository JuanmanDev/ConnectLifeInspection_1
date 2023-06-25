package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p084j.C1643f;
import p040c.p077d.p078a.p081k.p089k.C1756n;

/* renamed from: c.d.a.k.j.c */
/* compiled from: DataCacheGenerator */
public class C1639c implements C1643f, C1578d.C1579a<Object> {

    /* renamed from: e */
    public final List<C1567c> f1017e;

    /* renamed from: l */
    public final C1645g<?> f1018l;

    /* renamed from: m */
    public final C1643f.C1644a f1019m;

    /* renamed from: n */
    public int f1020n;

    /* renamed from: o */
    public C1567c f1021o;

    /* renamed from: p */
    public List<C1756n<File, ?>> f1022p;

    /* renamed from: q */
    public int f1023q;

    /* renamed from: r */
    public volatile C1756n.C1757a<?> f1024r;

    /* renamed from: s */
    public File f1025s;

    public C1639c(C1645g<?> gVar, C1643f.C1644a aVar) {
        this(gVar.mo15751c(), gVar, aVar);
    }

    /* renamed from: a */
    public boolean mo15742a() {
        while (true) {
            boolean z = false;
            if (this.f1022p == null || !mo15743b()) {
                int i = this.f1020n + 1;
                this.f1020n = i;
                if (i >= this.f1017e.size()) {
                    return false;
                }
                C1567c cVar = this.f1017e.get(this.f1020n);
                File b = this.f1018l.mo15752d().mo15693b(new C1641d(cVar, this.f1018l.mo15763o()));
                this.f1025s = b;
                if (b != null) {
                    this.f1021o = cVar;
                    this.f1022p = this.f1018l.mo15758j(b);
                    this.f1023q = 0;
                }
            } else {
                this.f1024r = null;
                while (!z && mo15743b()) {
                    List<C1756n<File, ?>> list = this.f1022p;
                    int i2 = this.f1023q;
                    this.f1023q = i2 + 1;
                    this.f1024r = list.get(i2).mo15974b(this.f1025s, this.f1018l.mo15767s(), this.f1018l.mo15754f(), this.f1018l.mo15759k());
                    if (this.f1024r != null && this.f1018l.mo15768t(this.f1024r.f1310c.mo15624a())) {
                        this.f1024r.f1310c.mo15633e(this.f1018l.mo15760l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo15743b() {
        return this.f1023q < this.f1022p.size();
    }

    public void cancel() {
        C1756n.C1757a<?> aVar = this.f1024r;
        if (aVar != null) {
            aVar.f1310c.cancel();
        }
    }

    /* renamed from: d */
    public void mo15643d(@NonNull Exception exc) {
        this.f1019m.mo15746c(this.f1021o, exc, this.f1024r.f1310c, DataSource.DATA_DISK_CACHE);
    }

    /* renamed from: f */
    public void mo15644f(Object obj) {
        this.f1019m.mo15748g(this.f1021o, obj, this.f1024r.f1310c, DataSource.DATA_DISK_CACHE, this.f1021o);
    }

    public C1639c(List<C1567c> list, C1645g<?> gVar, C1643f.C1644a aVar) {
        this.f1020n = -1;
        this.f1017e = list;
        this.f1018l = gVar;
        this.f1019m = aVar;
    }
}
