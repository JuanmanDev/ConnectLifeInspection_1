package p040c.p200q.p353b.p354a;

/* renamed from: c.q.b.a.d */
/* compiled from: CharMatcher */
public abstract class C5832d implements C5851n<Character> {

    /* renamed from: c.q.b.a.d$a */
    /* compiled from: CharMatcher */
    public static abstract class C5833a extends C5832d {
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5832d.super.mo28935b((Character) obj);
        }
    }

    /* renamed from: c.q.b.a.d$b */
    /* compiled from: CharMatcher */
    public static final class C5834b extends C5833a {

        /* renamed from: e */
        public final char f11359e;

        /* renamed from: l */
        public final char f11360l;

        public C5834b(char c, char c2) {
            C5850m.m16583d(c2 >= c);
            this.f11359e = c;
            this.f11360l = c2;
        }

        /* renamed from: f */
        public boolean mo28937f(char c) {
            return this.f11359e <= c && c <= this.f11360l;
        }

        public String toString() {
            return "CharMatcher.inRange('" + C5832d.m16546g(this.f11359e) + "', '" + C5832d.m16546g(this.f11360l) + "')";
        }
    }

    /* renamed from: c.q.b.a.d$c */
    /* compiled from: CharMatcher */
    public static final class C5835c extends C5833a {

        /* renamed from: e */
        public final char f11361e;

        public C5835c(char c) {
            this.f11361e = c;
        }

        /* renamed from: f */
        public boolean mo28937f(char c) {
            return c == this.f11361e;
        }

        public String toString() {
            return "CharMatcher.is('" + C5832d.m16546g(this.f11361e) + "')";
        }
    }

    /* renamed from: c */
    public static C5832d m16544c(char c, char c2) {
        return new C5834b(c, c2);
    }

    /* renamed from: e */
    public static C5832d m16545e(char c) {
        return new C5835c(c);
    }

    /* renamed from: g */
    public static String m16546g(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo28935b(Character ch) {
        return mo28937f(ch.charValue());
    }

    /* renamed from: d */
    public int mo28936d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C5850m.m16597r(i, length);
        while (i < length) {
            if (mo28937f(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: f */
    public abstract boolean mo28937f(char c);
}
