package p040c.p313b0.p314a.p317d;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.b0.a.d.c */
/* compiled from: CredentialDatabase */
public class C4160c {

    /* renamed from: d */
    public static C4160c f8765d;

    /* renamed from: a */
    public C4163f f8766a;

    /* renamed from: b */
    public C4159b f8767b;

    /* renamed from: c */
    public C4161d f8768c;

    public C4160c(C4161d dVar, C4163f fVar, C4159b bVar) {
        this.f8768c = dVar;
        this.f8766a = fVar;
        this.f8767b = bVar;
    }

    /* renamed from: c */
    public static C4160c m11406c(Context context) {
        C4160c cVar = f8765d;
        if (cVar != null) {
            return cVar;
        }
        C4161d dVar = new C4161d(context);
        C4160c cVar2 = new C4160c(dVar, new C4163f(dVar), new C4159b(dVar));
        f8765d = cVar2;
        return cVar2;
    }

    /* renamed from: a */
    public void mo25494a() {
        C4161d dVar = this.f8768c;
        dVar.mo25499a(dVar.getWritableDatabase());
    }

    /* renamed from: b */
    public List<C4158a> mo25495b(String str, String str2, String str3, Integer num) {
        ArrayList arrayList = new ArrayList();
        C4162e b = this.f8766a.mo25505b(str, str2, str3, num);
        return b != null ? this.f8767b.mo25491c(b.f8769a) : arrayList;
    }

    /* renamed from: d */
    public void mo25496d(String str, String str2, String str3, Integer num, String str4, String str5) {
        C4162e b = this.f8766a.mo25505b(str, str2, str3, num);
        if (b != null) {
            this.f8767b.mo25489a(this.f8767b.mo25490b(str4, str5, b.f8769a));
        }
    }

    /* renamed from: e */
    public void mo25497e(String str, String str2, String str3, Integer num) {
        C4162e b = this.f8766a.mo25505b(str, str2, str3, num);
        if (b != null) {
            this.f8766a.mo25504a(b);
        }
    }

    /* renamed from: f */
    public void mo25498f(String str, String str2, String str3, Integer num, String str4, String str5) {
        Long l;
        C4162e b = this.f8766a.mo25505b(str, str2, str3, num);
        if (b == null) {
            l = Long.valueOf(this.f8766a.mo25507d(new C4162e((Long) null, str, str2, str3, num)));
        } else {
            l = b.f8769a;
        }
        C4158a b2 = this.f8767b.mo25490b(str4, str5, l);
        if (b2 != null) {
            boolean z = false;
            boolean z2 = true;
            if (!b2.f8760b.equals(str4)) {
                b2.f8760b = str4;
                z = true;
            }
            if (!b2.f8761c.equals(str5)) {
                b2.f8761c = str5;
            } else {
                z2 = z;
            }
            if (z2) {
                this.f8767b.mo25493e(b2);
                return;
            }
            return;
        }
        C4158a aVar = new C4158a((Long) null, str4, str5, l);
        aVar.f8759a = Long.valueOf(this.f8767b.mo25492d(aVar));
    }
}
