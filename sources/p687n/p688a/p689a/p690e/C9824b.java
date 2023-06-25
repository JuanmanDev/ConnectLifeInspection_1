package p687n.p688a.p689a.p690e;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

/* renamed from: n.a.a.e.b */
/* compiled from: AppCompatActivityPermissionsHelper */
public class C9824b extends C9825c<AppCompatActivity> {
    public C9824b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
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

    /* renamed from: j */
    public FragmentManager mo50760j() {
        return ((AppCompatActivity) mo50761c()).getSupportFragmentManager();
    }
}
