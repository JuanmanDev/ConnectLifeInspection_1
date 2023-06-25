package p040c.p200q.p201a.p264c.p340i.p342b;

import android.util.Log;
import androidx.test.internal.runner.RunnerArgs;

/* renamed from: c.q.a.c.i.b.f3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5479f3 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f10451e;

    /* renamed from: l */
    public final /* synthetic */ String f10452l;

    /* renamed from: m */
    public final /* synthetic */ Object f10453m;

    /* renamed from: n */
    public final /* synthetic */ Object f10454n;

    /* renamed from: o */
    public final /* synthetic */ Object f10455o;

    /* renamed from: p */
    public final /* synthetic */ C5515i3 f10456p;

    public C5479f3(C5515i3 i3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f10456p = i3Var;
        this.f10451e = i;
        this.f10452l = str;
        this.f10453m = obj;
        this.f10454n = obj2;
        this.f10455o = obj3;
    }

    public final void run() {
        C5692x3 F = this.f10456p.f10699a.mo28622F();
        if (F.mo28505n()) {
            C5515i3 i3Var = this.f10456p;
            if (i3Var.f10542c == 0) {
                if (i3Var.f10699a.mo28649z().mo28241H()) {
                    C5515i3 i3Var2 = this.f10456p;
                    i3Var2.f10699a.mo28489d();
                    i3Var2.f10542c = 'C';
                } else {
                    C5515i3 i3Var3 = this.f10456p;
                    i3Var3.f10699a.mo28489d();
                    i3Var3.f10542c = 'c';
                }
            }
            C5515i3 i3Var4 = this.f10456p;
            if (i3Var4.f10543d < 0) {
                i3Var4.f10699a.mo28649z().mo28249q();
                i3Var4.f10543d = 74029;
            }
            char charAt = "01VDIWEA?".charAt(this.f10451e);
            C5515i3 i3Var5 = this.f10456p;
            String str = "2" + charAt + i3Var5.f10542c + i3Var5.f10543d + RunnerArgs.CLASSPATH_SEPARATOR + C5515i3.m15771A(true, this.f10452l, this.f10453m, this.f10454n, this.f10455o);
            if (str.length() > 1024) {
                str = this.f10452l.substring(0, 1024);
            }
            C5670v3 v3Var = F.f11072d;
            if (v3Var != null) {
                v3Var.mo28662b(str, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f10456p.mo28336C(), "Persisted config not initialized. Not logging error/warn");
    }
}
