package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonParser;
import java.io.Reader;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.p145h.C2069b;
import p040c.p142n.p143a.p144a.p147j.C2072a;
import p040c.p142n.p143a.p144a.p147j.C2073b;
import p040c.p142n.p143a.p144a.p149l.C2091b;

/* renamed from: c.n.a.a.k.g */
/* compiled from: ReaderBasedJsonParser */
public class C2084g extends C2069b {

    /* renamed from: t */
    public Reader f1988t;

    /* renamed from: u */
    public char[] f1989u;

    /* renamed from: v */
    public boolean f1990v;

    /* renamed from: w */
    public final C2091b f1991w;

    static {
        C2072a.m2901e();
    }

    public C2084g(C2073b bVar, int i, Reader reader, C2064d dVar, C2091b bVar2, char[] cArr, int i2, int i3, boolean z) {
        super(bVar, i);
        this.f1988t = reader;
        this.f1989u = cArr;
        this.f1991w = bVar2;
        bVar2.mo16804d();
        this.f1990v = z;
    }

    /* renamed from: b */
    public void mo16708b() {
        if (this.f1988t != null) {
            if (this.f1925l.mo16723k() || mo23324a(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f1988t.close();
            }
            this.f1988t = null;
        }
    }

    /* renamed from: c */
    public void mo16709c() {
        char[] cArr;
        super.mo16709c();
        this.f1991w.mo16810j();
        if (this.f1990v && (cArr = this.f1989u) != null) {
            this.f1989u = null;
            this.f1925l.mo16727o(cArr);
        }
    }

    public C2084g(C2073b bVar, int i, Reader reader, C2064d dVar, C2091b bVar2) {
        super(bVar, i);
        this.f1988t = reader;
        this.f1989u = bVar.mo16718f();
        this.f1991w = bVar2;
        bVar2.mo16804d();
        this.f1990v = true;
    }
}
