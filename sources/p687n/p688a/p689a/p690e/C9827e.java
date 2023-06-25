package p687n.p688a.p689a.p690e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* renamed from: n.a.a.e.e */
/* compiled from: PermissionHelper */
public abstract class C9827e<T> {

    /* renamed from: a */
    public T f19109a;

    public C9827e(@NonNull T t) {
        this.f19109a = t;
    }

    @NonNull
    /* renamed from: d */
    public static C9827e<? extends Activity> m26419d(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return new C9826d(activity);
        }
        if (activity instanceof AppCompatActivity) {
            return new C9824b((AppCompatActivity) activity);
        }
        return new C9823a(activity);
    }

    @NonNull
    /* renamed from: e */
    public static C9827e<Fragment> m26420e(Fragment fragment) {
        if (Build.VERSION.SDK_INT < 23) {
            return new C9826d(fragment);
        }
        return new C9828f(fragment);
    }

    /* renamed from: a */
    public abstract void mo50756a(int i, @NonNull String... strArr);

    /* renamed from: b */
    public abstract Context mo50757b();

    @NonNull
    /* renamed from: c */
    public T mo50761c() {
        return this.f19109a;
    }

    /* renamed from: f */
    public void mo50762f(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr) {
        if (mo50763g(strArr)) {
            mo50759i(str, str2, str3, i, i2, strArr);
        } else {
            mo50756a(i2, strArr);
        }
    }

    /* renamed from: g */
    public final boolean mo50763g(@NonNull String... strArr) {
        for (String h : strArr) {
            if (mo50758h(h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo50758h(@NonNull String str);

    /* renamed from: i */
    public abstract void mo50759i(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr);
}
