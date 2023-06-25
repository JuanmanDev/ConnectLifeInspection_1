package p687n.p688a.p689a.p690e;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: n.a.a.e.f */
/* compiled from: SupportFragmentPermissionHelper */
public class C9828f extends C9825c<Fragment> {
    public C9828f(@NonNull Fragment fragment) {
        super(fragment);
    }

    /* renamed from: a */
    public void mo50756a(int i, @NonNull String... strArr) {
        ((Fragment) mo50761c()).requestPermissions(strArr, i);
    }

    /* renamed from: b */
    public Context mo50757b() {
        return ((Fragment) mo50761c()).getActivity();
    }

    /* renamed from: h */
    public boolean mo50758h(@NonNull String str) {
        return ((Fragment) mo50761c()).shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: j */
    public FragmentManager mo50760j() {
        return ((Fragment) mo50761c()).getChildFragmentManager();
    }
}
