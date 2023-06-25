package p040c.p313b0.p314a.p317d;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2ExchangeCodec;

/* renamed from: c.b0.a.d.e */
/* compiled from: ProtectionSpace */
public class C4162e {

    /* renamed from: a */
    public Long f8769a;

    /* renamed from: b */
    public String f8770b;

    /* renamed from: c */
    public String f8771c;

    /* renamed from: d */
    public String f8772d;

    /* renamed from: e */
    public Integer f8773e;

    public C4162e(Long l, String str, String str2, String str3, Integer num) {
        this.f8769a = l;
        this.f8770b = str;
        this.f8771c = str2;
        this.f8772d = str3;
        this.f8773e = num;
    }

    /* renamed from: a */
    public Map<String, Object> mo25503a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Http2ExchangeCodec.HOST, this.f8770b);
        hashMap.put("protocol", this.f8771c);
        hashMap.put("realm", this.f8772d);
        hashMap.put("port", this.f8773e);
        return hashMap;
    }
}
