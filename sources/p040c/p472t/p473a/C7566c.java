package p040c.p472t.p473a;

import android.app.Activity;
import com.hjq.permissions.PermissionFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.t.a.c */
/* compiled from: IPermissionInterceptor */
public interface C7566c {
    /* renamed from: a */
    void mo33031a(Activity activity, List<String> list, List<String> list2, boolean z, C7567d dVar) {
        if (dVar != null) {
            dVar.onDenied(list2, z);
        }
    }

    /* renamed from: b */
    void mo33032b(Activity activity, List<String> list, C7567d dVar) {
        PermissionFragment.m23396b(activity, new ArrayList(list), this, dVar);
    }

    /* renamed from: c */
    void mo33033c(Activity activity, List<String> list, List<String> list2, boolean z, C7567d dVar) {
        if (dVar != null) {
            dVar.onGranted(list2, z);
        }
    }
}
