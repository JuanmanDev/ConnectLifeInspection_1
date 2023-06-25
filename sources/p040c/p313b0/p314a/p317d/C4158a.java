package p040c.p313b0.p314a.p317d;

import java.util.HashMap;
import java.util.Map;

/* renamed from: c.b0.a.d.a */
/* compiled from: Credential */
public class C4158a {

    /* renamed from: a */
    public Long f8759a;

    /* renamed from: b */
    public String f8760b;

    /* renamed from: c */
    public String f8761c;

    /* renamed from: d */
    public Long f8762d;

    public C4158a(Long l, String str, String str2, Long l2) {
        this.f8759a = l;
        this.f8760b = str;
        this.f8761c = str2;
        this.f8762d = l2;
    }

    /* renamed from: a */
    public Map<String, Object> mo25488a() {
        HashMap hashMap = new HashMap();
        hashMap.put("username", this.f8760b);
        hashMap.put("password", this.f8761c);
        return hashMap;
    }
}
