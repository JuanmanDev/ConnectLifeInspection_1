package p040c.p200q.p201a.p264c.p340i.p342b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import kotlinx.coroutines.DebugKt;

/* renamed from: c.q.a.c.i.b.ma */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5570ma {

    /* renamed from: a */
    public final C5648t4 f10685a;

    public C5570ma(C5648t4 t4Var) {
        this.f10685a = t4Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo28478a(String str, Bundle bundle) {
        String str2;
        this.f10685a.mo28486a().mo28029h();
        if (!this.f10685a.mo28642o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f10685a.mo28622F().f11090v.mo28671b(str2);
                this.f10685a.mo28622F().f11091w.mo28616b(this.f10685a.mo28488c().mo20838a());
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo28479b() {
        String str;
        this.f10685a.mo28486a().mo28029h();
        if (mo28481d()) {
            if (mo28482e()) {
                this.f10685a.mo28622F().f11090v.mo28671b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f10685a.mo28624I().mo28068u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
            } else {
                String a = this.f10685a.mo28622F().f11090v.mo28670a();
                if (TextUtils.isEmpty(a)) {
                    this.f10685a.mo28487b().mo28341t().mo28259a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f10685a.mo28622F().f11091w.mo28615a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f10685a.mo28624I().mo28068u(str, "_cmp", (Bundle) pair.second);
                }
                this.f10685a.mo28622F().f11090v.mo28671b((String) null);
            }
            this.f10685a.mo28622F().f11091w.mo28616b(0);
        }
    }

    /* renamed from: c */
    public final void mo28480c() {
        if (mo28481d() && mo28482e()) {
            this.f10685a.mo28622F().f11090v.mo28671b((String) null);
        }
    }

    /* renamed from: d */
    public final boolean mo28481d() {
        return this.f10685a.mo28622F().f11091w.mo28615a() > 0;
    }

    /* renamed from: e */
    public final boolean mo28482e() {
        if (mo28481d() && this.f10685a.mo28488c().mo20838a() - this.f10685a.mo28622F().f11091w.mo28615a() > this.f10685a.mo28649z().mo28250r((String) null, C5658u2.f10954R)) {
            return true;
        }
        return false;
    }
}
