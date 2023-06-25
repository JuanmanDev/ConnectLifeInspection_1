package p040c.p200q.p363c.p364k.p365a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.WorkerThread;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5303v2;
import p040c.p200q.p201a.p264c.p340i.p341a.C5413a;
import p040c.p200q.p363c.C6330g;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p364k.p365a.p366c.C6347b;
import p040c.p200q.p363c.p364k.p365a.p366c.C6349d;
import p040c.p200q.p363c.p364k.p365a.p366c.C6351f;
import p040c.p200q.p363c.p389r.C6736a;
import p040c.p200q.p363c.p389r.C6739d;

/* renamed from: c.q.c.k.a.b */
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class C6344b implements C6341a {

    /* renamed from: c */
    public static volatile C6341a f12004c;

    /* renamed from: a */
    public final C5413a f12005a;

    /* renamed from: b */
    public final Map f12006b = new ConcurrentHashMap();

    /* renamed from: c.q.c.k.a.b$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public class C6345a implements C6341a.C6342a {
        public C6345a(C6344b bVar, String str) {
        }
    }

    public C6344b(C5413a aVar) {
        C3495o.m8908j(aVar);
        this.f12005a = aVar;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    /* renamed from: d */
    public static C6341a m17837d(@NonNull C6331h hVar, @NonNull Context context, @NonNull C6739d dVar) {
        C3495o.m8908j(hVar);
        C3495o.m8908j(context);
        C3495o.m8908j(dVar);
        C3495o.m8908j(context.getApplicationContext());
        if (f12004c == null) {
            synchronized (C6344b.class) {
                if (f12004c == null) {
                    Bundle bundle = new Bundle(1);
                    if (hVar.mo30411v()) {
                        dVar.mo30594b(C6330g.class, C6352d.f12023e, C6353e.f12024a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", hVar.mo30410u());
                    }
                    f12004c = new C6344b(C5303v2.m15090u(context, (String) null, (String) null, (String) null, bundle).mo27811r());
                }
            }
        }
        return f12004c;
    }

    /* renamed from: e */
    public static /* synthetic */ void m17838e(C6736a aVar) {
        boolean z = ((C6330g) aVar.mo31406a()).f11972a;
        synchronized (C6344b.class) {
            C6341a aVar2 = f12004c;
            C3495o.m8908j(aVar2);
            ((C6344b) aVar2).f12005a.mo28024c(z);
        }
    }

    /* renamed from: a */
    public void mo30437a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C6347b.m17849f(str) && C6347b.m17847d(str2, bundle) && C6347b.m17846c(str, str2, bundle)) {
            C6347b.m17845b(str, str2, bundle);
            this.f12005a.mo28022a(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public void mo30438b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (C6347b.m17849f(str) && C6347b.m17850g(str, str2)) {
            this.f12005a.mo28023b(str, str2, obj);
        }
    }

    @WorkerThread
    @NonNull
    /* renamed from: c */
    public C6341a.C6342a mo30439c(@NonNull String str, @NonNull C6341a.C6343b bVar) {
        Object obj;
        C3495o.m8908j(bVar);
        if (!C6347b.m17849f(str) || mo30441f(str)) {
            return null;
        }
        C5413a aVar = this.f12005a;
        if ("fiam".equals(str)) {
            obj = new C6349d(aVar, bVar);
        } else {
            obj = "clx".equals(str) ? new C6351f(aVar, bVar) : null;
        }
        if (obj == null) {
            return null;
        }
        this.f12006b.put(str, obj);
        return new C6345a(this, str);
    }

    /* renamed from: f */
    public final boolean mo30441f(@NonNull String str) {
        return !str.isEmpty() && this.f12006b.containsKey(str) && this.f12006b.get(str) != null;
    }
}
