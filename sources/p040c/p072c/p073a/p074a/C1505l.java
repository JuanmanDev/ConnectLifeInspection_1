package p040c.p072c.p073a.p074a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: c.c.a.a.l */
/* compiled from: LanguageUtils */
public class C1505l {
    /* renamed from: a */
    public static void m937a(Activity activity) {
        Locale locale;
        String i = C1493b0.m892p().mo15419i("KEY_LOCALE");
        if (!TextUtils.isEmpty(i)) {
            if ("VALUE_FOLLOW_SYSTEM".equals(i)) {
                locale = m938b(Resources.getSystem().getConfiguration());
            } else {
                locale = m941e(i);
            }
            if (locale != null) {
                m943g(activity, locale);
                m943g(C1535z.m1079a(), locale);
            }
        }
    }

    /* renamed from: b */
    public static Locale m938b(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return configuration.getLocales().get(0);
        }
        return configuration.locale;
    }

    /* renamed from: c */
    public static boolean m939c(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '$') {
                if (i >= 1) {
                    return false;
                }
                i++;
            }
        }
        return i == 1;
    }

    /* renamed from: d */
    public static void m940d(Configuration configuration, Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(locale);
        } else {
            configuration.locale = locale;
        }
    }

    /* renamed from: e */
    public static Locale m941e(String str) {
        Locale f = m942f(str);
        if (f == null) {
            "The string of " + str + " is not in the correct format.";
            C1493b0.m892p().mo15427r("KEY_LOCALE");
        }
        return f;
    }

    /* renamed from: f */
    public static Locale m942f(String str) {
        if (!m939c(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("$");
            return new Locale(str.substring(0, indexOf), str.substring(indexOf + 1));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static void m943g(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        m940d(configuration, locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
