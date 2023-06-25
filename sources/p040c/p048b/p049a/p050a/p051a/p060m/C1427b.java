package p040c.p048b.p049a.p050a.p051a.p060m;

import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p067t.C1477f;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.b */
/* compiled from: AbstractJSONTokenResponse */
public abstract class C1427b implements C1440o {

    /* renamed from: d */
    public static final String f554d = "c.b.a.a.a.m.b";

    /* renamed from: a */
    public final String f555a;

    /* renamed from: b */
    public final int f556b;

    /* renamed from: c */
    public final Map<String, String> f557c;

    public C1427b(C1433h hVar) {
        this.f556b = hVar.mo15258b();
        this.f555a = hVar.mo15257a();
        this.f557c = hVar.mo15259c();
    }

    /* renamed from: a */
    public abstract void mo15224a(JSONObject jSONObject);

    /* renamed from: b */
    public JSONObject mo15225b(JSONObject jSONObject) {
        return jSONObject.getJSONObject("response");
    }

    /* renamed from: c */
    public long mo15226c(JSONObject jSONObject) {
        long j;
        try {
            if (jSONObject.has("token_expires_in")) {
                j = jSONObject.getLong("token_expires_in");
            } else if (jSONObject.has("expires_in")) {
                j = jSONObject.getLong("expires_in");
            } else {
                C1485a.m838k(f554d, "Unable to find expiration time in JSON response, AccessToken will not expire locally");
                return 0;
            }
            return j;
        } catch (JSONException unused) {
            C1485a.m829b(f554d, "Unable to parse expiration time in JSON response, AccessToken will not expire locally");
            return 0;
        }
    }

    /* renamed from: d */
    public JSONObject mo15227d() {
        String str = f554d;
        C1485a.m836i(str, "Response Extracted", "response=" + this.f555a);
        JSONObject jSONObject = new JSONObject(this.f555a);
        JSONObject b = mo15225b(jSONObject);
        mo15232i(jSONObject);
        return b;
    }

    /* renamed from: e */
    public int mo15228e() {
        return this.f556b;
    }

    /* renamed from: f */
    public abstract String mo15229f();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15230g(org.json.JSONObject r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "force_update"
            java.lang.String r7 = r7.getString(r1)     // Catch:{ JSONException -> 0x0047 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r1 = "1"
            boolean r1 = r7.equals(r1)     // Catch:{ JSONException -> 0x0045 }
            if (r1 != 0) goto L_0x0012
            goto L_0x0051
        L_0x0012:
            java.lang.String r1 = r6.mo15229f()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r2 = f554d     // Catch:{ JSONException -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0045 }
            r3.<init>()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r4 = "Force update requested ver:"
            r3.append(r4)     // Catch:{ JSONException -> 0x0045 }
            r3.append(r1)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0045 }
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m829b(r2, r3)     // Catch:{ JSONException -> 0x0045 }
            com.amazon.identity.auth.device.AuthError r2 = new com.amazon.identity.auth.device.AuthError     // Catch:{ JSONException -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0045 }
            r3.<init>()     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r4 = "Server denied request, requested Force Update ver:"
            r3.append(r4)     // Catch:{ JSONException -> 0x0045 }
            r3.append(r1)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x0045 }
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r3 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_FORCE_UPDATE     // Catch:{ JSONException -> 0x0045 }
            r2.<init>(r1, r0, r3)     // Catch:{ JSONException -> 0x0045 }
            throw r2     // Catch:{ JSONException -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x004b:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0052
        L_0x0051:
            return
        L_0x0052:
            java.lang.String r7 = f554d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON exception parsing force update response:"
            r1.append(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a.m829b(r7, r1)
            com.amazon.identity.auth.device.AuthError r7 = new com.amazon.identity.auth.device.AuthError
            java.lang.String r1 = r0.getMessage()
            com.amazon.identity.auth.device.AuthError$ERROR_TYPE r2 = com.amazon.identity.auth.device.AuthError.ERROR_TYPE.ERROR_JSON
            r7.<init>(r1, r0, r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p048b.p049a.p050a.p051a.p060m.C1427b.mo15230g(org.json.JSONObject):void");
    }

    /* renamed from: h */
    public abstract void mo15231h(JSONObject jSONObject);

    /* renamed from: i */
    public void mo15232i(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("request_id");
            String str = f554d;
            C1485a.m832e(str, "ExchangeResponse requestId from response body: " + string);
        } catch (JSONException unused) {
            C1485a.m838k(f554d, "No RequestId in JSON response");
        }
        String str2 = f554d;
        C1485a.m832e(str2, "ExchangeResponse requestId from response header: " + this.f557c.get("x-amzn-RequestId"));
    }

    /* renamed from: j */
    public void mo15233j() {
        try {
            if (C1477f.m811a(this.f556b)) {
                String str = "500 error (status=" + mo15228e() + ")";
            }
            JSONObject d = mo15227d();
            mo15231h(d);
            mo15224a(d);
            mo15230g(d);
        } catch (JSONException e) {
            if (TextUtils.isEmpty(this.f555a) || !this.f555a.contains("!DOCTYPE html")) {
                C1485a.m838k(f554d, "JSON exception parsing " + "" + " response:" + e.toString());
                String str2 = f554d;
                StringBuilder sb = new StringBuilder();
                sb.append("JSON exception html = ");
                sb.append(this.f555a);
                C1485a.m838k(str2, sb.toString());
                throw new AuthError(e.getMessage(), e, AuthError.ERROR_TYPE.ERROR_JSON);
            }
            C1485a.m829b(f554d, "Server sending back default error page - BAD request");
            throw new AuthError("Server sending back default error page - BAD request", e, AuthError.ERROR_TYPE.ERROR_JSON);
        } catch (IOException e2) {
            C1485a.m829b(f554d, "Exception accessing " + "" + " response:" + e2.toString());
            throw new AuthError(e2.getMessage(), e2, AuthError.ERROR_TYPE.ERROR_COM);
        }
    }
}
