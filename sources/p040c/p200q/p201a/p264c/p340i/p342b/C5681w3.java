package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.w3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5681w3 {

    /* renamed from: a */
    public final String f11054a;

    /* renamed from: b */
    public boolean f11055b;

    /* renamed from: c */
    public String f11056c;

    /* renamed from: d */
    public final /* synthetic */ C5692x3 f11057d;

    public C5681w3(C5692x3 x3Var, String str, String str2) {
        this.f11057d = x3Var;
        C3495o.m8904f(str);
        this.f11054a = str;
    }

    @WorkerThread
    /* renamed from: a */
    public final String mo28670a() {
        if (!this.f11055b) {
            this.f11055b = true;
            this.f11056c = this.f11057d.mo28679o().getString(this.f11054a, (String) null);
        }
        return this.f11056c;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28671b(String str) {
        SharedPreferences.Editor edit = this.f11057d.mo28679o().edit();
        edit.putString(this.f11054a, str);
        edit.apply();
        this.f11056c = str;
    }
}
