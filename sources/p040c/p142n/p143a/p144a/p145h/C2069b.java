package p040c.p142n.p143a.p144a.p145h;

import com.fasterxml.jackson.core.JsonParser;
import java.math.BigDecimal;
import java.math.BigInteger;
import p040c.p142n.p143a.p144a.p147j.C2073b;
import p040c.p142n.p143a.p144a.p148k.C2079b;
import p040c.p142n.p143a.p144a.p148k.C2081d;
import p040c.p142n.p143a.p144a.p150m.C2096c;

/* renamed from: c.n.a.a.h.b */
/* compiled from: ParserBase */
public abstract class C2069b extends C2070c {

    /* renamed from: p */
    public static final BigInteger f1921p = BigInteger.valueOf(-2147483648L);

    /* renamed from: q */
    public static final BigInteger f1922q = BigInteger.valueOf(2147483647L);

    /* renamed from: r */
    public static final BigInteger f1923r = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: s */
    public static final BigInteger f1924s = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: l */
    public final C2073b f1925l;

    /* renamed from: m */
    public boolean f1926m;

    /* renamed from: n */
    public final C2096c f1927n;

    /* renamed from: o */
    public char[] f1928o = null;

    static {
        new BigDecimal(f1923r);
        new BigDecimal(f1924s);
        new BigDecimal(f1921p);
        new BigDecimal(f1922q);
    }

    public C2069b(C2073b bVar, int i) {
        C2079b bVar2 = null;
        this.f7198e = i;
        this.f1925l = bVar;
        this.f1927n = bVar.mo16721i();
        C2081d.m2957f(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? C2079b.m2953b(this) : bVar2);
    }

    /* renamed from: b */
    public abstract void mo16708b();

    /* renamed from: c */
    public void mo16709c() {
        this.f1927n.mo16846h();
        char[] cArr = this.f1928o;
        if (cArr != null) {
            this.f1928o = null;
            this.f1925l.mo16725m(cArr);
        }
    }

    public void close() {
        if (!this.f1926m) {
            this.f1926m = true;
            try {
                mo16708b();
            } finally {
                mo16709c();
            }
        }
    }
}
