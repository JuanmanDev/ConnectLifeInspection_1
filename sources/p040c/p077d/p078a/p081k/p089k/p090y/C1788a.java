package p040c.p077d.p078a.p081k.p089k.p090y;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1568d;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1588j;
import p040c.p077d.p078a.p081k.p089k.C1743g;
import p040c.p077d.p078a.p081k.p089k.C1753m;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1764r;

/* renamed from: c.d.a.k.k.y.a */
/* compiled from: HttpGlideUrlLoader */
public class C1788a implements C1756n<C1743g, InputStream> {

    /* renamed from: b */
    public static final C1568d<Integer> f1351b = C1568d.m1282f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @Nullable

    /* renamed from: a */
    public final C1753m<C1743g, C1743g> f1352a;

    /* renamed from: c.d.a.k.k.y.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C1789a implements C1758o<C1743g, InputStream> {

        /* renamed from: a */
        public final C1753m<C1743g, C1743g> f1353a = new C1753m<>(500);

        @NonNull
        /* renamed from: b */
        public C1756n<C1743g, InputStream> mo15978b(C1764r rVar) {
            return new C1788a(this.f1353a);
        }
    }

    public C1788a(@Nullable C1753m<C1743g, C1743g> mVar) {
        this.f1352a = mVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<InputStream> mo15974b(@NonNull C1743g gVar, int i, int i2, @NonNull C1571e eVar) {
        C1753m<C1743g, C1743g> mVar = this.f1352a;
        if (mVar != null) {
            C1743g a = mVar.mo16023a(gVar, 0, 0);
            if (a == null) {
                this.f1352a.mo16024b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C1756n.C1757a<>(gVar, new C1588j(gVar, ((Integer) eVar.mo15616c(f1351b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull C1743g gVar) {
        return true;
    }
}
