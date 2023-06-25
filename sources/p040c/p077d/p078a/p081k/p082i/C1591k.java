package p040c.p077d.p078a.p081k.p082i;

import androidx.annotation.NonNull;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p091l.p092c.C1824r;

/* renamed from: c.d.a.k.i.k */
/* compiled from: InputStreamRewinder */
public final class C1591k implements C1580e<InputStream> {

    /* renamed from: a */
    public final C1824r f943a;

    /* renamed from: c.d.a.k.i.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C1592a implements C1580e.C1581a<InputStream> {

        /* renamed from: a */
        public final C1692b f944a;

        public C1592a(C1692b bVar) {
            this.f944a = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<InputStream> mo15647a() {
            return InputStream.class;
        }

        @NonNull
        /* renamed from: c */
        public C1580e<InputStream> mo15648b(InputStream inputStream) {
            return new C1591k(inputStream, this.f944a);
        }
    }

    public C1591k(InputStream inputStream, C1692b bVar) {
        C1824r rVar = new C1824r(inputStream, bVar);
        this.f943a = rVar;
        rVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo15646b() {
        this.f943a.mo16112c();
    }

    @NonNull
    /* renamed from: c */
    public InputStream mo15645a() {
        this.f943a.reset();
        return this.f943a;
    }
}
