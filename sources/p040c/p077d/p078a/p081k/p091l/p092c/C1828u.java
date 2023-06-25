package p040c.p077d.p078a.p081k.p091l.p092c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p091l.p092c.C1814k;
import p040c.p077d.p078a.p105q.C1941c;
import p040c.p077d.p078a.p105q.C1947g;

/* renamed from: c.d.a.k.l.c.u */
/* compiled from: StreamBitmapDecoder */
public class C1828u implements C1572f<InputStream, Bitmap> {

    /* renamed from: a */
    public final C1814k f1413a;

    /* renamed from: b */
    public final C1692b f1414b;

    /* renamed from: c.d.a.k.l.c.u$a */
    /* compiled from: StreamBitmapDecoder */
    public static class C1829a implements C1814k.C1816b {

        /* renamed from: a */
        public final C1824r f1415a;

        /* renamed from: b */
        public final C1941c f1416b;

        public C1829a(C1824r rVar, C1941c cVar) {
            this.f1415a = rVar;
            this.f1416b = cVar;
        }

        /* renamed from: a */
        public void mo16102a(C1697e eVar, Bitmap bitmap) {
            IOException a = this.f1416b.mo16418a();
            if (a != null) {
                if (bitmap != null) {
                    eVar.mo15922c(bitmap);
                }
                throw a;
            }
        }

        /* renamed from: b */
        public void mo16103b() {
            this.f1415a.mo16111b();
        }
    }

    public C1828u(C1814k kVar, C1692b bVar) {
        this.f1413a = kVar;
        this.f1414b = bVar;
    }

    /* renamed from: c */
    public C1685u<Bitmap> mo15621b(@NonNull InputStream inputStream, int i, int i2, @NonNull C1571e eVar) {
        C1824r rVar;
        boolean z;
        if (inputStream instanceof C1824r) {
            rVar = (C1824r) inputStream;
            z = false;
        } else {
            z = true;
            rVar = new C1824r(inputStream, this.f1414b);
        }
        C1941c b = C1941c.m2540b(rVar);
        try {
            return this.f1413a.mo16097e(new C1947g(b), i, i2, eVar, new C1829a(rVar, b));
        } finally {
            b.mo16420c();
            if (z) {
                rVar.mo16112c();
            }
        }
    }

    /* renamed from: d */
    public boolean mo15620a(@NonNull InputStream inputStream, @NonNull C1571e eVar) {
        return this.f1413a.mo16099m(inputStream);
    }
}
