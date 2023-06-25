package p040c.p072c.p073a.p074a;

import android.content.res.Resources;
import androidx.annotation.StringRes;
import java.util.IllegalFormatException;

/* renamed from: c.c.a.a.w */
/* compiled from: StringUtils */
public final class C1527w {
    /* renamed from: a */
    public static String m1062a(String str, Object... objArr) {
        if (str == null || objArr == null || objArr.length <= 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: b */
    public static String m1063b(@StringRes int i) {
        return m1064c(i, (Object[]) null);
    }

    /* renamed from: c */
    public static String m1064c(@StringRes int i, Object... objArr) {
        try {
            return m1062a(C1535z.m1079a().getString(i), objArr);
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return String.valueOf(i);
        }
    }

    /* renamed from: d */
    public static boolean m1065d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
