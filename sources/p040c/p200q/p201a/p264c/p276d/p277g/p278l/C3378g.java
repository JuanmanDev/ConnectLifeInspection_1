package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3378g {

    /* renamed from: a */
    public final Object f6293a;

    public C3378g(@NonNull Activity activity) {
        C3495o.m8909k(activity, "Activity must not be null");
        this.f6293a = activity;
    }

    @NonNull
    /* renamed from: a */
    public final Activity mo20546a() {
        return (Activity) this.f6293a;
    }

    @NonNull
    /* renamed from: b */
    public final FragmentActivity mo20547b() {
        return (FragmentActivity) this.f6293a;
    }

    /* renamed from: c */
    public final boolean mo20548c() {
        return this.f6293a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo20549d() {
        return this.f6293a instanceof FragmentActivity;
    }
}
