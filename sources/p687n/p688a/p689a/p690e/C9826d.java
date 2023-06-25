package p687n.p688a.p689a.p690e;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;

/* renamed from: n.a.a.e.d */
/* compiled from: LowApiPermissionsHelper */
public class C9826d<T> extends C9827e<T> {
    public C9826d(@NonNull T t) {
        super(t);
    }

    /* renamed from: a */
    public void mo50756a(int i, @NonNull String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    /* renamed from: b */
    public Context mo50757b() {
        if (mo50761c() instanceof Activity) {
            return (Context) mo50761c();
        }
        if (mo50761c() instanceof Fragment) {
            return ((Fragment) mo50761c()).getContext();
        }
        throw new IllegalStateException("Unknown host: " + mo50761c());
    }

    /* renamed from: h */
    public boolean mo50758h(@NonNull String str) {
        return false;
    }

    /* renamed from: i */
    public void mo50759i(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}
