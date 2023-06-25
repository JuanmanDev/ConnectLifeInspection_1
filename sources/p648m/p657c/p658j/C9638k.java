package p648m.p657c.p658j;

import p648m.p657c.C9620c;
import p648m.p657c.C9627i;

/* renamed from: m.c.j.k */
/* compiled from: SubstringMatcher */
public abstract class C9638k extends C9627i<String> {

    /* renamed from: e */
    public final String f18866e;

    public C9638k(String str) {
        this.f18866e = str;
    }

    /* renamed from: a */
    public void describeMismatchSafely(String str, C9620c cVar) {
        cVar.mo50300c("was \"").mo50300c(str).mo50300c("\"");
    }

    /* renamed from: b */
    public abstract boolean mo50318b(String str);

    /* renamed from: c */
    public boolean matchesSafely(String str) {
        return mo50318b(str);
    }

    /* renamed from: d */
    public abstract String mo50319d();

    public void describeTo(C9620c cVar) {
        cVar.mo50300c("a string ").mo50300c(mo50319d()).mo50300c(" ").mo50301d(this.f18866e);
    }
}
