package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.h7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5507h7 {
    /* renamed from: a */
    public static String m15763a(String str, String[] strArr, String[] strArr2) {
        C3495o.m8908j(strArr);
        C3495o.m8908j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m15764b(Context context, String str, String str2) {
        C3495o.m8908j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C5564m4.m15891a(context);
        }
        return C5564m4.m15892b("google_app_id", resources, str2);
    }
}
