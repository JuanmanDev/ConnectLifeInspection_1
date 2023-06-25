package p040c.p072c.p073a.p074a;

import androidx.collection.SimpleArrayMap;
import java.util.regex.Pattern;

/* renamed from: c.c.a.a.p */
/* compiled from: RegexUtils */
public final class C1519p {
    static {
        new SimpleArrayMap();
    }

    /* renamed from: a */
    public static boolean m1017a(CharSequence charSequence) {
        return m1018b("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$", charSequence);
    }

    /* renamed from: b */
    public static boolean m1018b(String str, CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && Pattern.matches(str, charSequence);
    }
}
