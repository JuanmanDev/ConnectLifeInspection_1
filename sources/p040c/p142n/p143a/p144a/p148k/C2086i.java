package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonParser;
import java.io.InputStream;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.p145h.C2069b;
import p040c.p142n.p143a.p144a.p147j.C2072a;
import p040c.p142n.p143a.p144a.p147j.C2073b;
import p040c.p142n.p143a.p144a.p149l.C2088a;
import p040c.p142n.p143a.p144a.p150m.C2095b;

/* renamed from: c.n.a.a.k.i */
/* compiled from: UTF8StreamJsonParser */
public class C2086i extends C2069b {

    /* renamed from: t */
    public final C2088a f1998t;

    /* renamed from: u */
    public InputStream f1999u;

    /* renamed from: v */
    public byte[] f2000v;

    /* renamed from: w */
    public boolean f2001w;

    static {
        C2072a.m2902f();
        C2072a.m2901e();
    }

    public C2086i(C2073b bVar, int i, InputStream inputStream, C2064d dVar, C2088a aVar, byte[] bArr, int i2, int i3, boolean z) {
        super(bVar, i);
        this.f1999u = inputStream;
        this.f1998t = aVar;
        this.f2000v = bArr;
        this.f2001w = z;
    }

    /* renamed from: b */
    public void mo16708b() {
        if (this.f1999u != null) {
            if (this.f1925l.mo16723k() || mo23324a(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f1999u.close();
            }
            this.f1999u = null;
        }
    }

    /* renamed from: c */
    public void mo16709c() {
        byte[] bArr;
        super.mo16709c();
        this.f1998t.mo16803g();
        if (this.f2001w && (bArr = this.f2000v) != null) {
            this.f2000v = C2095b.f2042o;
            this.f1925l.mo16726n(bArr);
        }
    }
}
