package p040c.p200q.p363c.p370n.p371h.p381p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p347m.C5769i;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6503g0;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p374j.C6542v;
import p040c.p200q.p363c.p370n.p371h.p374j.C6543w;
import p040c.p200q.p363c.p370n.p371h.p374j.C6549z;
import p040c.p200q.p363c.p370n.p371h.p378m.C6670b;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.p.f */
/* compiled from: SettingsController */
public class C6692f implements C6696i {

    /* renamed from: a */
    public final Context f12810a;

    /* renamed from: b */
    public final C6697j f12811b;

    /* renamed from: c */
    public final C6694g f12812c;

    /* renamed from: d */
    public final C6542v f12813d;

    /* renamed from: e */
    public final C6685a f12814e;

    /* renamed from: f */
    public final C6698k f12815f;

    /* renamed from: g */
    public final C6543w f12816g;

    /* renamed from: h */
    public final AtomicReference<C6688d> f12817h = new AtomicReference<>();

    /* renamed from: i */
    public final AtomicReference<C5773k<C6688d>> f12818i = new AtomicReference<>(new C5773k());

    /* renamed from: c.q.c.n.h.p.f$a */
    /* compiled from: SettingsController */
    public class C6693a implements C5769i<Void, Void> {
        public C6693a() {
        }

        @NonNull
        /* renamed from: b */
        public C5771j<Void> mo20378a(@Nullable Void voidR) {
            JSONObject a = C6692f.this.f12815f.mo31313a(C6692f.this.f12811b, true);
            if (a != null) {
                C6688d b = C6692f.this.f12812c.mo31332b(a);
                C6692f.this.f12814e.mo31311c(b.f12798c, a);
                C6692f.this.mo31329q(a, "Loaded settings: ");
                C6692f fVar = C6692f.this;
                boolean unused = fVar.mo31330r(fVar.f12811b.f12826f);
                C6692f.this.f12817h.set(b);
                ((C5773k) C6692f.this.f12818i.get()).mo28863e(b);
            }
            return C5777m.m16414f(null);
        }
    }

    public C6692f(Context context, C6697j jVar, C6542v vVar, C6694g gVar, C6685a aVar, C6698k kVar, C6543w wVar) {
        this.f12810a = context;
        this.f12811b = jVar;
        this.f12813d = vVar;
        this.f12812c = gVar;
        this.f12814e = aVar;
        this.f12815f = kVar;
        this.f12816g = wVar;
        this.f12817h.set(C6686b.m18930b(vVar));
    }

    /* renamed from: l */
    public static C6692f m18949l(Context context, String str, C6549z zVar, C6670b bVar, String str2, String str3, C6677f fVar, C6543w wVar) {
        String g = zVar.mo30819g();
        C6503g0 g0Var = new C6503g0();
        C6694g gVar = new C6694g(g0Var);
        C6685a aVar = new C6685a(fVar);
        C6687c cVar = new C6687c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h = zVar.mo30820h();
        String i = zVar.mo30821i();
        String j = zVar.mo30822j();
        String h2 = C6513n.m18230h(C6513n.m18236n(context), str, str3, str2);
        return new C6692f(context, new C6697j(str, h, i, j, zVar, h2, str3, str2, DeliveryMechanism.determineFrom(g).getId()), g0Var, gVar, aVar, cVar, wVar);
    }

    /* renamed from: a */
    public C5771j<C6688d> mo31322a() {
        return this.f12818i.get().mo28859a();
    }

    /* renamed from: b */
    public C6688d mo31323b() {
        return this.f12817h.get();
    }

    /* renamed from: k */
    public boolean mo31324k() {
        return !mo31326n().equals(this.f12811b.f12826f);
    }

    /* renamed from: m */
    public final C6688d mo31325m(C6691e eVar) {
        C6688d dVar = null;
        try {
            if (C6691e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                return null;
            }
            JSONObject b = this.f12814e.mo31310b();
            if (b != null) {
                C6688d b2 = this.f12812c.mo31332b(b);
                if (b2 != null) {
                    mo31329q(b, "Loaded cached settings: ");
                    long a = this.f12813d.mo30679a();
                    if (!C6691e.IGNORE_CACHE_EXPIRATION.equals(eVar)) {
                        if (b2.mo31321a(a)) {
                            C6479f.m18125f().mo30647i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C6479f.m18125f().mo30647i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        C6479f.m18125f().mo30644e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    C6479f.m18125f().mo30644e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C6479f.m18125f().mo30641b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C6479f.m18125f().mo30644e("Failed to get cached settings", e);
            return dVar;
        }
    }

    /* renamed from: n */
    public final String mo31326n() {
        return C6513n.m18240r(this.f12810a).getString("existing_instance_identifier", "");
    }

    /* renamed from: o */
    public C5771j<Void> mo31327o(C6691e eVar, Executor executor) {
        C6688d m;
        if (mo31324k() || (m = mo31325m(eVar)) == null) {
            C6688d m2 = mo31325m(C6691e.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f12817h.set(m2);
                this.f12818i.get().mo28863e(m2);
            }
            return this.f12816g.mo30813j(executor).mo28858s(executor, new C6693a());
        }
        this.f12817h.set(m);
        this.f12818i.get().mo28863e(m);
        return C5777m.m16414f(null);
    }

    /* renamed from: p */
    public C5771j<Void> mo31328p(Executor executor) {
        return mo31327o(C6691e.USE_CACHE, executor);
    }

    /* renamed from: q */
    public final void mo31329q(JSONObject jSONObject, String str) {
        C6479f f = C6479f.m18125f();
        f.mo30641b(str + jSONObject.toString());
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public final boolean mo31330r(String str) {
        SharedPreferences.Editor edit = C6513n.m18240r(this.f12810a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }
}
