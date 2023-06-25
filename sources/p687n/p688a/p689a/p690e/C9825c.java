package p687n.p688a.p689a.p690e;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.FragmentManager;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* renamed from: n.a.a.e.c */
/* compiled from: BaseSupportPermissionsHelper */
public abstract class C9825c<T> extends C9827e<T> {
    public C9825c(@NonNull T t) {
        super(t);
    }

    /* renamed from: i */
    public void mo50759i(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr) {
        FragmentManager j = mo50760j();
        if (!(j.findFragmentByTag("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat)) {
            RationaleDialogFragmentCompat.m26777q(str, str2, str3, i, i2, strArr).mo53753r(j, "RationaleDialogFragmentCompat");
        }
    }

    /* renamed from: j */
    public abstract FragmentManager mo50760j();
}
