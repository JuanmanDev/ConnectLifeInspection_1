package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 28)
/* renamed from: c.t.a.m */
/* compiled from: PermissionDelegateImplV28 */
public class C7577m extends C7576l {
    /* renamed from: a */
    public boolean mo33036a(Activity activity, String str) {
        if (C7584t.m21535e(str, "android.permission.ACCEPT_HANDOVER")) {
            return !C7584t.m21533c(activity, str) && !C7584t.m21552v(activity, str);
        }
        return super.mo33036a(activity, str);
    }

    /* renamed from: c */
    public boolean mo33038c(Context context, String str) {
        if (C7584t.m21535e(str, "android.permission.ACCEPT_HANDOVER")) {
            return C7584t.m21533c(context, str);
        }
        return super.mo33038c(context, str);
    }
}
