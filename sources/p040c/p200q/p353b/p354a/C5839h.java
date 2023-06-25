package p040c.p200q.p353b.p354a;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: c.q.b.a.h */
/* compiled from: Joiner */
public class C5839h {

    /* renamed from: a */
    public final String f11363a;

    /* renamed from: c.q.b.a.h$a */
    /* compiled from: Joiner */
    public class C5840a extends C5839h {

        /* renamed from: b */
        public final /* synthetic */ String f11364b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5840a(C5839h hVar, String str) {
            super(hVar, (C5840a) null);
            this.f11364b = str;
        }

        /* renamed from: h */
        public CharSequence mo28951h(Object obj) {
            return obj == null ? this.f11364b : C5839h.this.mo28951h(obj);
        }

        /* renamed from: i */
        public C5839h mo28952i(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    public /* synthetic */ C5839h(C5839h hVar, C5840a aVar) {
        this(hVar);
    }

    /* renamed from: f */
    public static C5839h m16555f(char c) {
        return new C5839h(String.valueOf(c));
    }

    /* renamed from: g */
    public static C5839h m16556g(String str) {
        return new C5839h(str);
    }

    /* renamed from: a */
    public <A extends Appendable> A mo28946a(A a, Iterator<?> it) {
        C5850m.m16594o(a);
        if (it.hasNext()) {
            a.append(mo28951h(it.next()));
            while (it.hasNext()) {
                a.append(this.f11363a);
                a.append(mo28951h(it.next()));
            }
        }
        return a;
    }

    /* renamed from: b */
    public final StringBuilder mo28947b(StringBuilder sb, Iterator<?> it) {
        try {
            mo28946a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final String mo28948c(Iterable<?> iterable) {
        return mo28949d(iterable.iterator());
    }

    /* renamed from: d */
    public final String mo28949d(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        mo28947b(sb, it);
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo28950e(Object[] objArr) {
        return mo28948c(Arrays.asList(objArr));
    }

    /* renamed from: h */
    public CharSequence mo28951h(Object obj) {
        C5850m.m16594o(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: i */
    public C5839h mo28952i(String str) {
        C5850m.m16594o(str);
        return new C5840a(this, str);
    }

    public C5839h(String str) {
        C5850m.m16594o(str);
        this.f11363a = str;
    }

    public C5839h(C5839h hVar) {
        this.f11363a = hVar.f11363a;
    }
}
