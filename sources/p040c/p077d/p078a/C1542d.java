package p040c.p077d.p078a;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.p081k.p084j.C1662k;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1619f;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1621g;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1622h;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1624i;
import p040c.p077d.p078a.p081k.p084j.p086b0.C1632a;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p084j.p088z.C1698f;
import p040c.p077d.p078a.p081k.p084j.p088z.C1703j;
import p040c.p077d.p078a.p081k.p084j.p088z.C1706k;
import p040c.p077d.p078a.p098l.C1878d;
import p040c.p077d.p078a.p098l.C1881f;
import p040c.p077d.p078a.p098l.C1886k;
import p040c.p077d.p078a.p101o.C1911e;
import p040c.p077d.p078a.p101o.C1912f;

/* renamed from: c.d.a.d */
/* compiled from: GlideBuilder */
public final class C1542d {

    /* renamed from: a */
    public final Map<Class<?>, C1549h<?, ?>> f771a = new ArrayMap();

    /* renamed from: b */
    public C1662k f772b;

    /* renamed from: c */
    public C1697e f773c;

    /* renamed from: d */
    public C1692b f774d;

    /* renamed from: e */
    public C1622h f775e;

    /* renamed from: f */
    public C1632a f776f;

    /* renamed from: g */
    public C1632a f777g;

    /* renamed from: h */
    public C1609a.C1610a f778h;

    /* renamed from: i */
    public C1624i f779i;

    /* renamed from: j */
    public C1878d f780j;

    /* renamed from: k */
    public int f781k = 4;

    /* renamed from: l */
    public C1912f f782l = new C1912f();
    @Nullable

    /* renamed from: m */
    public C1886k.C1888b f783m;

    /* renamed from: n */
    public C1632a f784n;

    /* renamed from: o */
    public boolean f785o;
    @Nullable

    /* renamed from: p */
    public List<C1911e<Object>> f786p;

    /* renamed from: q */
    public boolean f787q;

    @NonNull
    /* renamed from: a */
    public C1541c mo15464a(@NonNull Context context) {
        if (this.f776f == null) {
            this.f776f = C1632a.m1449f();
        }
        if (this.f777g == null) {
            this.f777g = C1632a.m1447d();
        }
        if (this.f784n == null) {
            this.f784n = C1632a.m1445b();
        }
        if (this.f779i == null) {
            this.f779i = new C1624i.C1625a(context).mo15716a();
        }
        if (this.f780j == null) {
            this.f780j = new C1881f();
        }
        if (this.f773c == null) {
            int b = this.f779i.mo15713b();
            if (b > 0) {
                this.f773c = new C1706k((long) b);
            } else {
                this.f773c = new C1698f();
            }
        }
        if (this.f774d == null) {
            this.f774d = new C1703j(this.f779i.mo15712a());
        }
        if (this.f775e == null) {
            this.f775e = new C1621g((long) this.f779i.mo15714d());
        }
        if (this.f778h == null) {
            this.f778h = new C1619f(context);
        }
        if (this.f772b == null) {
            this.f772b = new C1662k(this.f775e, this.f778h, this.f777g, this.f776f, C1632a.m1451h(), C1632a.m1445b(), this.f785o);
        }
        List<C1911e<Object>> list = this.f786p;
        if (list == null) {
            this.f786p = Collections.emptyList();
        } else {
            this.f786p = Collections.unmodifiableList(list);
        }
        C1886k kVar = new C1886k(this.f783m);
        C1662k kVar2 = this.f772b;
        C1622h hVar = this.f775e;
        C1697e eVar = this.f773c;
        C1692b bVar = this.f774d;
        C1878d dVar = this.f780j;
        int i = this.f781k;
        C1912f fVar = this.f782l;
        fVar.mo16276V();
        return new C1541c(context, kVar2, hVar, eVar, bVar, kVar, dVar, i, fVar, this.f771a, this.f786p, this.f787q);
    }

    /* renamed from: b */
    public void mo15465b(@Nullable C1886k.C1888b bVar) {
        this.f783m = bVar;
    }
}
