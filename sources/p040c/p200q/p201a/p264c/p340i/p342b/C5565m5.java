package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p264c.p276d.C3330e;
import p040c.p200q.p201a.p264c.p276d.C3332f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3565p;
import p040c.p200q.p201a.p264c.p294g.p335i.C4990b;
import p040c.p200q.p201a.p264c.p294g.p335i.C4992b1;

/* renamed from: c.q.a.c.i.b.m5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5565m5 extends C5680w2 {

    /* renamed from: e */
    public final C5709y9 f10673e;

    /* renamed from: l */
    public Boolean f10674l;

    /* renamed from: m */
    public String f10675m = null;

    public C5565m5(C5709y9 y9Var, String str) {
        C3495o.m8908j(y9Var);
        this.f10673e = y9Var;
    }

    @BinderThread
    /* renamed from: B */
    public final List mo28447B(String str, String str2, String str3) {
        mo28461c0(str, true);
        try {
            return (List) this.f10673e.mo28486a().mo28537s(new C5421a5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28260b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: H */
    public final void mo28448H(zzaw zzaw, zzq zzq) {
        C3495o.m8908j(zzaw);
        mo28460b0(zzq, false);
        mo28459a0(new C5481f5(this, zzaw, zzq));
    }

    @BinderThread
    /* renamed from: I */
    public final void mo28449I(zzq zzq) {
        mo28460b0(zzq, false);
        mo28459a0(new C5541k5(this, zzq));
    }

    @BinderThread
    /* renamed from: J */
    public final List mo28450J(String str, String str2, zzq zzq) {
        mo28460b0(zzq, false);
        String str3 = zzq.f14918e;
        C3495o.m8908j(str3);
        try {
            return (List) this.f10673e.mo28486a().mo28537s(new C5715z4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28260b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: L */
    public final void mo28451L(long j, String str, String str2, String str3) {
        mo28459a0(new C5553l5(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: O */
    public final void mo28452O(zzaw zzaw, String str, String str2) {
        C3495o.m8908j(zzaw);
        C3495o.m8904f(str);
        mo28461c0(str, true);
        mo28459a0(new C5493g5(this, zzaw, str));
    }

    @BinderThread
    /* renamed from: P */
    public final void mo28453P(zzkw zzkw, zzq zzq) {
        C3495o.m8908j(zzkw);
        mo28460b0(zzq, false);
        mo28459a0(new C5517i5(this, zzkw, zzq));
    }

    @BinderThread
    /* renamed from: S */
    public final void mo28454S(zzq zzq) {
        C3495o.m8904f(zzq.f14918e);
        C3495o.m8908j(zzq.f14915F);
        C5469e5 e5Var = new C5469e5(this, zzq);
        C3495o.m8908j(e5Var);
        if (this.f10673e.mo28486a().mo28534C()) {
            e5Var.run();
        } else {
            this.f10673e.mo28486a().mo28533A(e5Var);
        }
    }

    @BinderThread
    /* renamed from: T */
    public final List mo28455T(String str, String str2, boolean z, zzq zzq) {
        mo28460b0(zzq, false);
        String str3 = zzq.f14918e;
        C3495o.m8908j(str3);
        try {
            List<C5450ca> list = (List) this.f10673e.mo28486a().mo28537s(new C5693x4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5450ca caVar : list) {
                if (z || !C5498ga.m15685W(caVar.f10374c)) {
                    arrayList.add(new zzkw(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28261c("Failed to query user properties. appId", C5515i3.m15778z(zzq.f14918e), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: V */
    public final void mo28456V(zzq zzq) {
        C3495o.m8904f(zzq.f14918e);
        mo28461c0(zzq.f14918e, false);
        mo28459a0(new C5433b5(this, zzq));
    }

    @BinderThread
    /* renamed from: W */
    public final void mo28457W(zzac zzac, zzq zzq) {
        C3495o.m8908j(zzac);
        C3495o.m8908j(zzac.f14889m);
        mo28460b0(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.f14887e = zzq.f14918e;
        mo28459a0(new C5671v4(this, zzac2, zzq));
    }

    /* renamed from: Z */
    public final /* synthetic */ void mo28458Z(String str, Bundle bundle) {
        C5547l V = this.f10673e.mo28734V();
        V.mo28029h();
        V.mo28475i();
        byte[] h = V.f10663b.mo28743f0().mo28077B(new C5607q(V.f10699a, "", str, "dep", 0, 0, bundle)).mo27190h();
        V.f10699a.mo28487b().mo28343v().mo28261c("Saving default event parameters, appId, data size", V.f10699a.mo28620D().mo28144d(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h);
        try {
            if (V.mo28385P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f10699a.mo28487b().mo28339r().mo28260b("Failed to insert default event parameters (got -1). appId", C5515i3.m15778z(str));
            }
        } catch (SQLiteException e) {
            V.f10699a.mo28487b().mo28339r().mo28261c("Error storing default event parameters. appId", C5515i3.m15778z(str), e);
        }
    }

    /* renamed from: a0 */
    public final void mo28459a0(Runnable runnable) {
        C3495o.m8908j(runnable);
        if (this.f10673e.mo28486a().mo28534C()) {
            runnable.run();
        } else {
            this.f10673e.mo28486a().mo28540z(runnable);
        }
    }

    @BinderThread
    /* renamed from: b0 */
    public final void mo28460b0(zzq zzq, boolean z) {
        C3495o.m8908j(zzq);
        C3495o.m8904f(zzq.f14918e);
        mo28461c0(zzq.f14918e, false);
        this.f10673e.mo28745g0().mo28281L(zzq.f14919l, zzq.f14910A);
    }

    @BinderThread
    /* renamed from: c0 */
    public final void mo28461c0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f10674l == null) {
                        if (!"com.google.android.gms".equals(this.f10675m) && !C3565p.m9095a(this.f10673e.mo28490f(), Binder.getCallingUid())) {
                            if (!C3332f.m8454a(this.f10673e.mo28490f()).mo20411c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f10674l = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f10674l = Boolean.valueOf(z2);
                    }
                    if (this.f10674l.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f10673e.mo28487b().mo28339r().mo28260b("Measurement Service called with invalid calling package. appId", C5515i3.m15778z(str));
                    throw e;
                }
            }
            if (this.f10675m == null && C3330e.m8452j(this.f10673e.mo28490f(), Binder.getCallingUid(), str)) {
                this.f10675m = str;
            }
            if (!str.equals(this.f10675m)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f10673e.mo28487b().mo28339r().mo28259a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: e */
    public final void mo28462e(zzaw zzaw, zzq zzq) {
        this.f10673e.mo28742e();
        this.f10673e.mo28750j(zzaw, zzq);
    }

    /* renamed from: g */
    public final zzaw mo28463g(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!"_cmp".equals(zzaw.f14899e) || (zzau = zzaw.f14900l) == null || zzau.mo33657P() == 0)) {
            String V = zzaw.f14900l.mo33662V("_cis");
            if ("referrer broadcast".equals(V) || "referrer API".equals(V)) {
                this.f10673e.mo28487b().mo28342u().mo28260b("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.f14900l, zzaw.f14901m, zzaw.f14902n);
            }
        }
        return zzaw;
    }

    @BinderThread
    /* renamed from: l */
    public final void mo28464l(zzq zzq) {
        mo28460b0(zzq, false);
        mo28459a0(new C5457d5(this, zzq));
    }

    @BinderThread
    /* renamed from: n */
    public final void mo28465n(Bundle bundle, zzq zzq) {
        mo28460b0(zzq, false);
        String str = zzq.f14918e;
        C3495o.m8908j(str);
        mo28459a0(new C5660u4(this, str, bundle));
    }

    @BinderThread
    /* renamed from: p */
    public final List mo28466p(String str, String str2, String str3, boolean z) {
        mo28461c0(str, true);
        try {
            List<C5450ca> list = (List) this.f10673e.mo28486a().mo28537s(new C5704y4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5450ca caVar : list) {
                if (z || !C5498ga.m15685W(caVar.f10374c)) {
                    arrayList.add(new zzkw(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28261c("Failed to get user properties as. appId", C5515i3.m15778z(str), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: q */
    public final void mo28467q(zzac zzac) {
        C3495o.m8908j(zzac);
        C3495o.m8908j(zzac.f14889m);
        C3495o.m8904f(zzac.f14887e);
        mo28461c0(zzac.f14887e, true);
        mo28459a0(new C5682w4(this, new zzac(zzac)));
    }

    @BinderThread
    /* renamed from: s */
    public final List mo28468s(zzq zzq, boolean z) {
        mo28460b0(zzq, false);
        String str = zzq.f14918e;
        C3495o.m8908j(str);
        try {
            List<C5450ca> list = (List) this.f10673e.mo28486a().mo28537s(new C5529j5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5450ca caVar : list) {
                if (z || !C5498ga.m15685W(caVar.f10374c)) {
                    arrayList.add(new zzkw(caVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28261c("Failed to get user properties. appId", C5515i3.m15778z(zzq.f14918e), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: u */
    public final byte[] mo28469u(zzaw zzaw, String str) {
        C3495o.m8904f(str);
        C3495o.m8908j(zzaw);
        mo28461c0(str, true);
        this.f10673e.mo28487b().mo28338q().mo28260b("Log and bundle. event", this.f10673e.mo28735W().mo28144d(zzaw.f14899e));
        long nanoTime = this.f10673e.mo28488c().nanoTime() / EventLoop_commonKt.MS_TO_NS;
        try {
            byte[] bArr = (byte[]) this.f10673e.mo28486a().mo28538t(new C5505h5(this, zzaw, str)).get();
            if (bArr == null) {
                this.f10673e.mo28487b().mo28339r().mo28260b("Log and bundle returned null. appId", C5515i3.m15778z(str));
                bArr = new byte[0];
            }
            this.f10673e.mo28487b().mo28338q().mo28262d("Log and bundle processed. event, size, time_ms", this.f10673e.mo28735W().mo28144d(zzaw.f14899e), Integer.valueOf(bArr.length), Long.valueOf((this.f10673e.mo28488c().nanoTime() / EventLoop_commonKt.MS_TO_NS) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f10673e.mo28487b().mo28339r().mo28262d("Failed to log and bundle. appId, event, error", C5515i3.m15778z(str), this.f10673e.mo28735W().mo28144d(zzaw.f14899e), e);
            return null;
        }
    }

    /* renamed from: v */
    public final void mo28470v(zzaw zzaw, zzq zzq) {
        C4992b1 b1Var;
        if (!this.f10673e.mo28738Z().mo28417C(zzq.f14918e)) {
            mo28462e(zzaw, zzq);
            return;
        }
        this.f10673e.mo28487b().mo28343v().mo28260b("EES config found for", zzq.f14918e);
        C5552l4 Z = this.f10673e.mo28738Z();
        String str = zzq.f14918e;
        if (TextUtils.isEmpty(str)) {
            b1Var = null;
        } else {
            b1Var = (C4992b1) Z.f10644j.get(str);
        }
        if (b1Var != null) {
            try {
                Map I = this.f10673e.mo28743f0().mo28082I(zzaw.f14900l.mo33658R(), true);
                String a = C5625r5.m16063a(zzaw.f14899e);
                if (a == null) {
                    a = zzaw.f14899e;
                }
                if (b1Var.mo26969e(new C4990b(a, zzaw.f14902n, I))) {
                    if (b1Var.mo26971g()) {
                        this.f10673e.mo28487b().mo28343v().mo28260b("EES edited event", zzaw.f14899e);
                        mo28462e(this.f10673e.mo28743f0().mo28076A(b1Var.mo26965a().mo27027b()), zzq);
                    } else {
                        mo28462e(zzaw, zzq);
                    }
                    if (b1Var.mo26970f()) {
                        for (C4990b bVar : b1Var.mo26965a().mo27028c()) {
                            this.f10673e.mo28487b().mo28343v().mo28260b("EES logging created event", bVar.mo26957d());
                            mo28462e(this.f10673e.mo28743f0().mo28076A(bVar), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f10673e.mo28487b().mo28339r().mo28261c("EES error. appId, eventName", zzq.f14919l, zzaw.f14899e);
            }
            this.f10673e.mo28487b().mo28343v().mo28260b("EES was not applied to event", zzaw.f14899e);
            mo28462e(zzaw, zzq);
            return;
        }
        this.f10673e.mo28487b().mo28343v().mo28260b("EES not loaded for", zzq.f14918e);
        mo28462e(zzaw, zzq);
    }

    @BinderThread
    /* renamed from: y */
    public final String mo28471y(zzq zzq) {
        mo28460b0(zzq, false);
        return this.f10673e.mo28749i0(zzq);
    }
}
