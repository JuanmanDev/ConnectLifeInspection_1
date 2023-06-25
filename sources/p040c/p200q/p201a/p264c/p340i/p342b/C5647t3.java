package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.t3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5647t3 {

    /* renamed from: a */
    public final String f10884a;

    /* renamed from: b */
    public final long f10885b;

    /* renamed from: c */
    public boolean f10886c;

    /* renamed from: d */
    public long f10887d;

    /* renamed from: e */
    public final /* synthetic */ C5692x3 f10888e;

    public C5647t3(C5692x3 x3Var, String str, long j) {
        this.f10888e = x3Var;
        C3495o.m8904f(str);
        this.f10884a = str;
        this.f10885b = j;
    }

    @WorkerThread
    /* renamed from: a */
    public final long mo28615a() {
        if (!this.f10886c) {
            this.f10886c = true;
            this.f10887d = this.f10888e.mo28679o().getLong(this.f10884a, this.f10885b);
        }
        return this.f10887d;
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28616b(long j) {
        SharedPreferences.Editor edit = this.f10888e.mo28679o().edit();
        edit.putLong(this.f10884a, j);
        edit.apply();
        this.f10887d = j;
    }
}
