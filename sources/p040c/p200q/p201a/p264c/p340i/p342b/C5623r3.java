package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.r3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5623r3 {

    /* renamed from: a */
    public final String f10813a;

    /* renamed from: b */
    public final boolean f10814b;

    /* renamed from: c */
    public boolean f10815c;

    /* renamed from: d */
    public boolean f10816d;

    /* renamed from: e */
    public final /* synthetic */ C5692x3 f10817e;

    public C5623r3(C5692x3 x3Var, String str, boolean z) {
        this.f10817e = x3Var;
        C3495o.m8904f(str);
        this.f10813a = str;
        this.f10814b = z;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo28589a(boolean z) {
        SharedPreferences.Editor edit = this.f10817e.mo28679o().edit();
        edit.putBoolean(this.f10813a, z);
        edit.apply();
        this.f10816d = z;
    }

    @WorkerThread
    /* renamed from: b */
    public final boolean mo28590b() {
        if (!this.f10815c) {
            this.f10815c = true;
            this.f10816d = this.f10817e.mo28679o().getBoolean(this.f10813a, this.f10814b);
        }
        return this.f10816d;
    }
}
