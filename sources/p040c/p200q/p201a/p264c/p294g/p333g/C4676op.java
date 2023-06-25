package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c.q.a.c.g.g.op */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4676op implements C4297ao {

    /* renamed from: l */
    public static final String f9529l = "op";

    /* renamed from: e */
    public List f9530e;

    /* renamed from: a */
    public final C4676op mo26487a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9530e = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f9530e.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw C4730r.m12949a(e, f9529l, str);
        }
    }

    /* renamed from: b */
    public final List mo26488b() {
        return this.f9530e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C4297ao mo25802c(String str) {
        mo26487a(str);
        return this;
    }
}
