package p040c.p200q.p363c.p370n.p371h.p381p;

import androidx.core.util.TimeUtils;
import org.json.JSONObject;
import p040c.p200q.p363c.p370n.p371h.p374j.C6542v;
import p040c.p200q.p363c.p370n.p371h.p381p.C6688d;

/* renamed from: c.q.c.n.h.p.l */
/* compiled from: SettingsV3JsonTransform */
public class C6699l implements C6695h {
    /* renamed from: b */
    public static C6688d.C6689a m18967b(JSONObject jSONObject) {
        return new C6688d.C6689a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    public static C6688d.C6690b m18968c(JSONObject jSONObject) {
        return new C6688d.C6690b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    public static long m18969d(C6542v vVar, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return vVar.mo30679a() + (j * 1000);
    }

    /* renamed from: a */
    public C6688d mo31312a(C6542v vVar, JSONObject jSONObject) {
        C6688d.C6690b bVar;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", TimeUtils.SECONDS_PER_HOUR);
        double optDouble = jSONObject2.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject2.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject2.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject2.has("session")) {
            bVar = m18968c(jSONObject2.getJSONObject("session"));
        } else {
            bVar = m18968c(new JSONObject());
        }
        return new C6688d(m18969d(vVar, (long) optInt2, jSONObject2), bVar, m18967b(jSONObject2.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
