package p040c.p130j.p131a.p132c;

import com.google.gson.internal.bind.TypeAdapters;
import java.util.Map;

/* renamed from: c.j.a.c.e */
/* compiled from: Time */
public class C2043e {

    /* renamed from: a */
    public Integer f1864a = 0;

    /* renamed from: b */
    public Integer f1865b = 0;

    /* renamed from: c */
    public Integer f1866c = 0;

    /* renamed from: a */
    public static C2043e m2851a(Map<String, Object> map) {
        C2043e eVar = new C2043e();
        eVar.f1864a = (Integer) map.get("hour");
        eVar.f1865b = (Integer) map.get(TypeAdapters.C838126.MINUTE);
        eVar.f1866c = (Integer) map.get(TypeAdapters.C838126.SECOND);
        return eVar;
    }
}
