package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R$string;

/* renamed from: c.q.a.c.i.b.m4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5564m4 {
    /* renamed from: a */
    public static String m15891a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* renamed from: b */
    public static final String m15892b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
