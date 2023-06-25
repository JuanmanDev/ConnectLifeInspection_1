package p040c.p151o.p152a.p153a.p170r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p040c.p151o.p152a.p153a.C2100c;

/* renamed from: c.o.a.a.r.c */
/* compiled from: ReportingManager */
public class C2181c implements C2179a {

    /* renamed from: a */
    public final C2180b f2161a;

    public C2181c(C2180b bVar) {
        this.f2161a = bVar;
    }

    /* renamed from: b */
    public static C2179a m3296b() {
        try {
            return (C2179a) C2100c.m3048a().mo16935g(C2179a.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new C2181c((C2180b) null);
        }
    }

    /* renamed from: a */
    public void mo17013a(@Nullable String str, @NonNull String str2, String str3) {
        if (mo17016c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", str2);
            hashMap.put("priority", "ERROR");
            this.f2161a.mo17014a(str3, str, hashMap);
        }
    }

    /* renamed from: c */
    public final boolean mo17016c() {
        C2180b bVar = this.f2161a;
        if (bVar == null) {
            return false;
        }
        return bVar.isActive();
    }
}
