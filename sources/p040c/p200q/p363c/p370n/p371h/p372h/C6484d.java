package p040c.p200q.p363c.p370n.p371h.p372h;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p373i.C6487a;
import p040c.p200q.p363c.p370n.p371h.p373i.C6488b;

/* renamed from: c.q.c.n.h.h.d */
/* compiled from: BreadcrumbAnalyticsEventReceiver */
public class C6484d implements C6482b, C6488b {
    @Nullable

    /* renamed from: a */
    public C6487a f12195a;

    @NonNull
    /* renamed from: b */
    public static String m18145b(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo30603a(@Nullable C6487a aVar) {
        this.f12195a = aVar;
        C6479f.m18125f().mo30641b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        C6487a aVar = this.f12195a;
        if (aVar != null) {
            try {
                aVar.mo30652a("$A$:" + m18145b(str, bundle));
            } catch (JSONException unused) {
                C6479f.m18125f().mo30649k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
