package p040c.p142n.p143a.p144a.p147j;

import com.fasterxml.jackson.core.JsonEncoding;
import p040c.p142n.p143a.p144a.p150m.C2094a;
import p040c.p142n.p143a.p144a.p150m.C2096c;

/* renamed from: c.n.a.a.j.b */
/* compiled from: IOContext */
public class C2073b {

    /* renamed from: a */
    public final Object f1936a;

    /* renamed from: b */
    public JsonEncoding f1937b;

    /* renamed from: c */
    public final boolean f1938c;

    /* renamed from: d */
    public final C2094a f1939d;

    /* renamed from: e */
    public byte[] f1940e = null;

    /* renamed from: f */
    public byte[] f1941f = null;

    /* renamed from: g */
    public char[] f1942g = null;

    /* renamed from: h */
    public char[] f1943h = null;

    /* renamed from: i */
    public char[] f1944i = null;

    public C2073b(C2094a aVar, Object obj, boolean z) {
        this.f1939d = aVar;
        this.f1936a = obj;
        this.f1938c = z;
    }

    /* renamed from: a */
    public final void mo16713a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    /* renamed from: b */
    public final void mo16714b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length <= bArr2.length) {
            throw mo16730r();
        }
    }

    /* renamed from: c */
    public final void mo16715c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length <= cArr2.length) {
            throw mo16730r();
        }
    }

    /* renamed from: d */
    public char[] mo16716d() {
        mo16713a(this.f1943h);
        char[] c = this.f1939d.mo16814c(1);
        this.f1943h = c;
        return c;
    }

    /* renamed from: e */
    public byte[] mo16717e() {
        mo16713a(this.f1940e);
        byte[] a = this.f1939d.mo16812a(0);
        this.f1940e = a;
        return a;
    }

    /* renamed from: f */
    public char[] mo16718f() {
        mo16713a(this.f1942g);
        char[] c = this.f1939d.mo16814c(0);
        this.f1942g = c;
        return c;
    }

    /* renamed from: g */
    public char[] mo16719g(int i) {
        mo16713a(this.f1942g);
        char[] d = this.f1939d.mo16815d(0, i);
        this.f1942g = d;
        return d;
    }

    /* renamed from: h */
    public byte[] mo16720h() {
        mo16713a(this.f1941f);
        byte[] a = this.f1939d.mo16812a(1);
        this.f1941f = a;
        return a;
    }

    /* renamed from: i */
    public C2096c mo16721i() {
        return new C2096c(this.f1939d);
    }

    /* renamed from: j */
    public JsonEncoding mo16722j() {
        return this.f1937b;
    }

    /* renamed from: k */
    public boolean mo16723k() {
        return this.f1938c;
    }

    /* renamed from: l */
    public void mo16724l(char[] cArr) {
        if (cArr != null) {
            mo16715c(cArr, this.f1943h);
            this.f1943h = null;
            this.f1939d.mo16821j(1, cArr);
        }
    }

    /* renamed from: m */
    public void mo16725m(char[] cArr) {
        if (cArr != null) {
            mo16715c(cArr, this.f1944i);
            this.f1944i = null;
            this.f1939d.mo16821j(3, cArr);
        }
    }

    /* renamed from: n */
    public void mo16726n(byte[] bArr) {
        if (bArr != null) {
            mo16714b(bArr, this.f1940e);
            this.f1940e = null;
            this.f1939d.mo16820i(0, bArr);
        }
    }

    /* renamed from: o */
    public void mo16727o(char[] cArr) {
        if (cArr != null) {
            mo16715c(cArr, this.f1942g);
            this.f1942g = null;
            this.f1939d.mo16821j(0, cArr);
        }
    }

    /* renamed from: p */
    public void mo16728p(byte[] bArr) {
        if (bArr != null) {
            mo16714b(bArr, this.f1941f);
            this.f1941f = null;
            this.f1939d.mo16820i(1, bArr);
        }
    }

    /* renamed from: q */
    public void mo16729q(JsonEncoding jsonEncoding) {
        this.f1937b = jsonEncoding;
    }

    /* renamed from: r */
    public final IllegalArgumentException mo16730r() {
        return new IllegalArgumentException("Trying to release buffer not owned by the context");
    }
}
