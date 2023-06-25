package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Writer;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.C2065e;
import p040c.p142n.p143a.p144a.C2066f;
import p040c.p142n.p143a.p144a.p147j.C2072a;
import p040c.p142n.p143a.p144a.p147j.C2073b;

/* renamed from: c.n.a.a.k.j */
/* compiled from: WriterBasedJsonGenerator */
public final class C2087j extends C2080c {

    /* renamed from: p */
    public final Writer f2002p;

    /* renamed from: q */
    public char[] f2003q;

    /* renamed from: r */
    public int f2004r = 0;

    /* renamed from: s */
    public int f2005s = 0;

    /* renamed from: t */
    public int f2006t;

    static {
        C2072a.m2899c();
    }

    public C2087j(C2073b bVar, int i, C2064d dVar, Writer writer) {
        super(bVar, i, dVar);
        this.f2002p = writer;
        char[] d = bVar.mo16716d();
        this.f2003q = d;
        this.f2006t = d.length;
    }

    /* renamed from: b */
    public void mo16780b(char c) {
        if (this.f2005s >= this.f2006t) {
            mo16794n();
        }
        char[] cArr = this.f2003q;
        int i = this.f2005s;
        this.f2005s = i + 1;
        cArr[i] = c;
    }

    /* renamed from: c */
    public void mo16781c(C2066f fVar) {
        mo16782d(fVar.getValue());
    }

    public void close() {
        super.close();
        if (this.f2003q != null && mo16707h(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C2082e g = mo16706g();
                if (!g.mo16698d()) {
                    if (!g.mo16699e()) {
                        break;
                    }
                    mo16797r();
                } else {
                    mo16796q();
                }
            }
        }
        mo16794n();
        if (this.f2002p != null) {
            if (this.f1983n.mo16723k() || mo16707h(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this.f2002p.close();
            } else if (mo16707h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f2002p.flush();
            }
        }
        mo16795o();
    }

    /* renamed from: d */
    public void mo16782d(String str) {
        int length = str.length();
        int i = this.f2006t - this.f2005s;
        if (i == 0) {
            mo16794n();
            i = this.f2006t - this.f2005s;
        }
        if (i >= length) {
            str.getChars(0, length, this.f2003q, this.f2005s);
            this.f2005s += length;
            return;
        }
        mo16798s(str);
    }

    /* renamed from: e */
    public void mo16783e(char[] cArr, int i, int i2) {
        if (i2 < 32) {
            if (i2 > this.f2006t - this.f2005s) {
                mo16794n();
            }
            System.arraycopy(cArr, i, this.f2003q, this.f2005s, i2);
            this.f2005s += i2;
            return;
        }
        mo16794n();
        this.f2002p.write(cArr, i, i2);
    }

    public void flush() {
        mo16794n();
        if (this.f2002p != null && mo16707h(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f2002p.flush();
        }
    }

    /* renamed from: n */
    public void mo16794n() {
        int i = this.f2005s;
        int i2 = this.f2004r;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f2004r = 0;
            this.f2005s = 0;
            this.f2002p.write(this.f2003q, i2, i3);
        }
    }

    /* renamed from: o */
    public void mo16795o() {
        char[] cArr = this.f2003q;
        if (cArr != null) {
            this.f2003q = null;
            this.f1983n.mo16724l(cArr);
        }
    }

    /* renamed from: q */
    public void mo16796q() {
        if (this.f1920m.mo16698d()) {
            C2065e eVar = this.f7196e;
            if (eVar != null) {
                eVar.writeEndArray(this, this.f1920m.mo16696b());
            } else {
                if (this.f2005s >= this.f2006t) {
                    mo16794n();
                }
                char[] cArr = this.f2003q;
                int i = this.f2005s;
                this.f2005s = i + 1;
                cArr[i] = ']';
            }
            this.f1920m = this.f1920m.mo16778h();
            return;
        }
        mo23312a("Current context not an ARRAY but " + this.f1920m.mo16697c());
        throw null;
    }

    /* renamed from: r */
    public void mo16797r() {
        if (this.f1920m.mo16699e()) {
            C2065e eVar = this.f7196e;
            if (eVar != null) {
                eVar.writeEndObject(this, this.f1920m.mo16696b());
            } else {
                if (this.f2005s >= this.f2006t) {
                    mo16794n();
                }
                char[] cArr = this.f2003q;
                int i = this.f2005s;
                this.f2005s = i + 1;
                cArr[i] = '}';
            }
            this.f1920m = this.f1920m.mo16778h();
            return;
        }
        mo23312a("Current context not an object but " + this.f1920m.mo16697c());
        throw null;
    }

    /* renamed from: s */
    public final void mo16798s(String str) {
        int i = this.f2006t;
        int i2 = this.f2005s;
        int i3 = i - i2;
        str.getChars(0, i3, this.f2003q, i2);
        this.f2005s += i3;
        mo16794n();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f2006t;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f2003q, 0);
                this.f2004r = 0;
                this.f2005s = i4;
                mo16794n();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f2003q, 0);
                this.f2004r = 0;
                this.f2005s = length;
                return;
            }
        }
    }
}
