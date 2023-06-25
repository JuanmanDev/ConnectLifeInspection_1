package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.q */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5607q {

    /* renamed from: a */
    public final String f10754a;

    /* renamed from: b */
    public final String f10755b;

    /* renamed from: c */
    public final String f10756c;

    /* renamed from: d */
    public final long f10757d;

    /* renamed from: e */
    public final long f10758e;

    /* renamed from: f */
    public final zzau f10759f;

    public C5607q(C5648t4 t4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        C3495o.m8904f(str2);
        C3495o.m8904f(str3);
        this.f10754a = str2;
        this.f10755b = str3;
        this.f10756c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10757d = j;
        this.f10758e = j2;
        if (j2 != 0 && j2 > j) {
            t4Var.mo28487b().mo28344w().mo28260b("Event created with reverse previous/current timestamps. appId", C5515i3.m15778z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    t4Var.mo28487b().mo28339r().mo28259a("Param name can't be null");
                    it.remove();
                } else {
                    Object o = t4Var.mo28629N().mo28302o(str4, bundle2.get(str4));
                    if (o == null) {
                        t4Var.mo28487b().mo28344w().mo28260b("Param value can't be null", t4Var.mo28620D().mo28145e(str4));
                        it.remove();
                    } else {
                        t4Var.mo28629N().mo28272C(bundle2, str4, o);
                    }
                }
            }
            zzau = new zzau(bundle2);
        }
        this.f10759f = zzau;
    }

    /* renamed from: a */
    public final C5607q mo28528a(C5648t4 t4Var, long j) {
        return new C5607q(t4Var, this.f10756c, this.f10754a, this.f10755b, this.f10757d, j, this.f10759f);
    }

    public final String toString() {
        String str = this.f10754a;
        String str2 = this.f10755b;
        String zzau = this.f10759f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + zzau + "}";
    }

    public C5607q(C5648t4 t4Var, String str, String str2, String str3, long j, long j2, zzau zzau) {
        C3495o.m8904f(str2);
        C3495o.m8904f(str3);
        C3495o.m8908j(zzau);
        this.f10754a = str2;
        this.f10755b = str3;
        this.f10756c = true == TextUtils.isEmpty(str) ? null : str;
        this.f10757d = j;
        this.f10758e = j2;
        if (j2 != 0 && j2 > j) {
            t4Var.mo28487b().mo28344w().mo28261c("Event created with reverse previous/current timestamps. appId, name", C5515i3.m15778z(str2), C5515i3.m15778z(str3));
        }
        this.f10759f = zzau;
    }
}
