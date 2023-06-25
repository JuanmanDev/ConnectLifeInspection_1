package p648m.p657c;

import java.util.Iterator;
import kotlin.text.Typography;
import p648m.p657c.p659k.C9639a;
import p648m.p657c.p659k.C9642d;

/* renamed from: m.c.a */
/* compiled from: BaseDescription */
public abstract class C9618a implements C9620c {
    /* renamed from: a */
    public C9620c mo50298a(String str, String str2, String str3, Iterable<? extends C9625g> iterable) {
        mo50304g(str, str2, str3, iterable.iterator());
        return this;
    }

    /* renamed from: b */
    public C9620c mo50299b(C9625g gVar) {
        gVar.describeTo(this);
        return this;
    }

    /* renamed from: c */
    public C9620c mo50300c(String str) {
        mo50303f(str);
        return this;
    }

    /* renamed from: d */
    public C9620c mo50301d(Object obj) {
        if (obj == null) {
            mo50303f("null");
        } else if (obj instanceof String) {
            mo50308k((String) obj);
        } else if (obj instanceof Character) {
            mo50302e(Typography.quote);
            mo50307j(((Character) obj).charValue());
            mo50302e(Typography.quote);
        } else if (obj instanceof Short) {
            mo50302e(Typography.less);
            mo50303f(mo50306i(obj));
            mo50303f("s>");
        } else if (obj instanceof Long) {
            mo50302e(Typography.less);
            mo50303f(mo50306i(obj));
            mo50303f("L>");
        } else if (obj instanceof Float) {
            mo50302e(Typography.less);
            mo50303f(mo50306i(obj));
            mo50303f("F>");
        } else if (obj.getClass().isArray()) {
            mo50305h("[", ", ", "]", new C9639a(obj));
        } else {
            mo50302e(Typography.less);
            mo50303f(mo50306i(obj));
            mo50302e(Typography.greater);
        }
        return this;
    }

    /* renamed from: e */
    public abstract void mo50302e(char c);

    /* renamed from: f */
    public abstract void mo50303f(String str);

    /* renamed from: g */
    public final C9620c mo50304g(String str, String str2, String str3, Iterator<? extends C9625g> it) {
        mo50303f(str);
        boolean z = false;
        while (it.hasNext()) {
            if (z) {
                mo50303f(str2);
            }
            mo50299b((C9625g) it.next());
            z = true;
        }
        mo50303f(str3);
        return this;
    }

    /* renamed from: h */
    public final <T> C9620c mo50305h(String str, String str2, String str3, Iterator<T> it) {
        mo50304g(str, str2, str3, new C9642d(it));
        return this;
    }

    /* renamed from: i */
    public final String mo50306i(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    /* renamed from: j */
    public final void mo50307j(char c) {
        if (c == 9) {
            mo50303f("\\t");
        } else if (c == 10) {
            mo50303f("\\n");
        } else if (c == 13) {
            mo50303f("\\r");
        } else if (c != '\"') {
            mo50302e(c);
        } else {
            mo50303f("\\\"");
        }
    }

    /* renamed from: k */
    public final void mo50308k(String str) {
        mo50302e(Typography.quote);
        for (int i = 0; i < str.length(); i++) {
            mo50307j(str.charAt(i));
        }
        mo50302e(Typography.quote);
    }
}
