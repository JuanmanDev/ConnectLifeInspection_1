package p687n.p688a.p689a.p690e;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.app.ActivityCompat;
import pub.devrel.easypermissions.RationaleDialogFragment;

/* renamed from: n.a.a.e.a */
/* compiled from: ActivityPermissionHelper */
public class C9823a extends C9827e<Activity> {
    public C9823a(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public void mo50756a(int i, @NonNull String... strArr) {
        ActivityCompat.requestPermissions((Activity) mo50761c(), strArr, i);
    }

    /* renamed from: b */
    public Context mo50757b() {
        return (Context) mo50761c();
    }

    /* renamed from: h */
    public boolean mo50758h(@NonNull String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale((Activity) mo50761c(), str);
    }

    /* renamed from: i */
    public void mo50759i(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr) {
        FragmentManager fragmentManager = ((Activity) mo50761c()).getFragmentManager();
        if (!(fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof RationaleDialogFragment)) {
            RationaleDialogFragment.m26775a(str2, str3, str, i, i2, strArr).mo53748b(fragmentManager, "RationaleDialogFragment");
        }
    }
}
