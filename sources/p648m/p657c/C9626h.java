package p648m.p657c;

import java.io.IOException;

/* renamed from: m.c.h */
/* compiled from: StringDescription */
public class C9626h extends C9618a {

    /* renamed from: b */
    public final Appendable f18858b;

    public C9626h() {
        this(new StringBuilder());
    }

    /* renamed from: l */
    public static String m25847l(C9625g gVar) {
        return m25848m(gVar);
    }

    /* renamed from: m */
    public static String m25848m(C9625g gVar) {
        C9626h hVar = new C9626h();
        hVar.mo50299b(gVar);
        return hVar.toString();
    }

    /* renamed from: e */
    public void mo50302e(char c) {
        try {
            this.f18858b.append(c);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    /* renamed from: f */
    public void mo50303f(String str) {
        try {
            this.f18858b.append(str);
        } catch (IOException e) {
            throw new RuntimeException("Could not write description", e);
        }
    }

    public String toString() {
        return this.f18858b.toString();
    }

    public C9626h(Appendable appendable) {
        this.f18858b = appendable;
    }
}
