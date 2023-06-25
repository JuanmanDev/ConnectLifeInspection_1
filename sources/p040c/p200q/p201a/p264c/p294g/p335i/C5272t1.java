package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p292e.C3587b;
import p040c.p200q.p201a.p264c.p340i.p342b.C5564m4;

/* renamed from: c.q.a.c.g.i.t1 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public final class C5272t1 extends C5137k2 {

    /* renamed from: o */
    public final /* synthetic */ String f10143o;

    /* renamed from: p */
    public final /* synthetic */ String f10144p;

    /* renamed from: q */
    public final /* synthetic */ Context f10145q;

    /* renamed from: r */
    public final /* synthetic */ Bundle f10146r;

    /* renamed from: s */
    public final /* synthetic */ C5303v2 f10147s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5272t1(C5303v2 v2Var, String str, String str2, Context context, Bundle bundle) {
        super(v2Var, true);
        this.f10147s = v2Var;
        this.f10143o = str;
        this.f10144p = str2;
        this.f10145q = context;
        this.f10146r = bundle;
    }

    /* renamed from: a */
    public final void mo26914a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f10147s.mo27808o(this.f10143o, this.f10144p)) {
                String str4 = this.f10144p;
                str2 = this.f10143o;
                str = str4;
                str3 = this.f10147s.f10179a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C3495o.m8908j(this.f10145q);
            C5303v2 v2Var = this.f10147s;
            v2Var.f10186h = v2Var.mo27812t(this.f10145q, true);
            if (this.f10147s.f10186h == null) {
                String unused = this.f10147s.f10179a;
                return;
            }
            int a = DynamiteModule.m11030a(this.f10145q, ModuleDescriptor.MODULE_ID);
            int b = DynamiteModule.m11031b(this.f10145q, ModuleDescriptor.MODULE_ID);
            zzcl zzcl = new zzcl(74029, (long) Math.max(a, b), b < a, str3, str2, str, this.f10146r, C5564m4.m15891a(this.f10145q));
            C5040e1 s = this.f10147s.f10186h;
            C3495o.m8908j(s);
            s.initialize(C3587b.m9124k(this.f10145q), zzcl, this.f9972e);
        } catch (Exception e) {
            this.f10147s.mo27805l(e, true, false);
        }
    }
}
