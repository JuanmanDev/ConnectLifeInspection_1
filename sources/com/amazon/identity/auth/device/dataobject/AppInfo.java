package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import androidx.test.internal.runner.RunnerArgs;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1419d;
import p040c.p048b.p049a.p050a.p051a.p067t.C1475d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class AppInfo extends C1413a {

    /* renamed from: v */
    public static final String f6901v = "com.amazon.identity.auth.device.dataobject.AppInfo";

    /* renamed from: w */
    public static final String[] f6902w = {"rowid", "AppFamilyId", "PackageName", "AllowedScopes", "GrantedPermissions", "ClientId", "AppVariantId", "AuthzHost", "ExchangeHost", "Payload"};

    /* renamed from: m */
    public String f6903m;

    /* renamed from: n */
    public String f6904n;

    /* renamed from: o */
    public String f6905o;

    /* renamed from: p */
    public String f6906p;

    /* renamed from: q */
    public String f6907q;

    /* renamed from: r */
    public String f6908r;

    /* renamed from: s */
    public String[] f6909s;

    /* renamed from: t */
    public String[] f6910t;

    /* renamed from: u */
    public JSONObject f6911u;

    public enum COL_INDEX {
        ROW_ID(0),
        APP_FAMILY_ID(1),
        PACKAGE_NAME(2),
        ALLOWED_SCOPES(3),
        GRANTED_PERMISSIONS(4),
        CLIENT_ID(5),
        APP_VARIANT_ID(6),
        AUTHZ_HOST(7),
        EXCHANGE_HOST(8),
        PAYLOAD(9);
        
        public final int colId;

        /* access modifiers changed from: public */
        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public AppInfo(String str, String str2, String str3, String[] strArr, String[] strArr2, String str4, String str5, String str6, JSONObject jSONObject) {
        this.f6903m = str;
        this.f6904n = str2;
        this.f6905o = str3;
        this.f6909s = strArr;
        this.f6910t = strArr2;
        this.f6906p = str4;
        this.f6911u = jSONObject;
        this.f6907q = str5;
        this.f6908r = str6;
    }

    /* renamed from: A */
    public void mo21435A(String str) {
        this.f6908r = str;
    }

    /* renamed from: B */
    public void mo21436B(String[] strArr) {
        this.f6910t = strArr;
    }

    /* renamed from: C */
    public void mo21437C(String str) {
        this.f6905o = str;
    }

    /* renamed from: D */
    public void mo21438D(String str) {
        try {
            this.f6911u = new JSONObject(str);
        } catch (JSONException e) {
            C1485a.m830c(f6901v, "Payload String not correct JSON.  Setting payload to null", e);
        }
    }

    /* renamed from: e */
    public ContentValues mo15164e(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f6902w[COL_INDEX.APP_FAMILY_ID.colId], this.f6903m);
        contentValues.put(f6902w[COL_INDEX.PACKAGE_NAME.colId], this.f6905o);
        contentValues.put(f6902w[COL_INDEX.ALLOWED_SCOPES.colId], C1475d.m807e(this.f6909s, RunnerArgs.CLASS_SEPARATOR));
        contentValues.put(f6902w[COL_INDEX.GRANTED_PERMISSIONS.colId], C1475d.m807e(this.f6910t, RunnerArgs.CLASS_SEPARATOR));
        contentValues.put(f6902w[COL_INDEX.CLIENT_ID.colId], this.f6906p);
        contentValues.put(f6902w[COL_INDEX.APP_VARIANT_ID.colId], this.f6904n);
        contentValues.put(f6902w[COL_INDEX.AUTHZ_HOST.colId], this.f6907q);
        contentValues.put(f6902w[COL_INDEX.EXCHANGE_HOST.colId], this.f6908r);
        String str = f6902w[COL_INDEX.PAYLOAD.colId];
        JSONObject jSONObject = this.f6911u;
        contentValues.put(str, jSONObject != null ? jSONObject.toString() : null);
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        if (!TextUtils.equals(this.f6903m, appInfo.mo21443l()) || !TextUtils.equals(this.f6904n, appInfo.mo21444m()) || !TextUtils.equals(this.f6905o, appInfo.mo21450s()) || !Arrays.equals(this.f6909s, appInfo.mo21442k()) || !Arrays.equals(this.f6910t, appInfo.mo21449r()) || !TextUtils.equals(this.f6906p, appInfo.mo21446o()) || !TextUtils.equals(this.f6907q, appInfo.mo21445n()) || !TextUtils.equals(this.f6908r, appInfo.mo21448q()) || !mo21452u(appInfo)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public AppInfo clone() {
        return new AppInfo(mo15163d(), this.f6903m, this.f6904n, this.f6905o, this.f6909s, this.f6910t, this.f6906p, this.f6907q, this.f6908r, this.f6911u);
    }

    /* renamed from: k */
    public String[] mo21442k() {
        return this.f6909s;
    }

    /* renamed from: l */
    public String mo21443l() {
        return this.f6903m;
    }

    /* renamed from: m */
    public String mo21444m() {
        return this.f6904n;
    }

    /* renamed from: n */
    public String mo21445n() {
        return this.f6907q;
    }

    /* renamed from: o */
    public String mo21446o() {
        return this.f6906p;
    }

    /* renamed from: p */
    public C1419d mo15162c(Context context) {
        return C1419d.m537s(context);
    }

    /* renamed from: q */
    public String mo21448q() {
        return this.f6908r;
    }

    /* renamed from: r */
    public String[] mo21449r() {
        return this.f6910t;
    }

    /* renamed from: s */
    public String mo21450s() {
        return this.f6905o;
    }

    /* renamed from: t */
    public final JSONObject mo21451t() {
        return this.f6911u;
    }

    public String toString() {
        try {
            return this.f6911u.toString(4);
        } catch (Exception unused) {
            return "{ rowid=" + mo15163d() + ", appFamilyId=" + this.f6903m + ", appVariantId=" + this.f6904n + ", packageName=" + this.f6905o + ", allowedScopes=" + Arrays.toString(this.f6909s) + ", grantedPermissions=" + Arrays.toString(this.f6910t) + ", clientId=" + this.f6906p + ", AuthzHost=" + this.f6907q + ", ExchangeHost=" + this.f6908r + " }";
        }
    }

    /* renamed from: u */
    public final boolean mo21452u(AppInfo appInfo) {
        JSONObject t = appInfo.mo21451t();
        JSONObject jSONObject = this.f6911u;
        if (jSONObject == null) {
            return t == null;
        }
        if (t == null) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (!this.f6911u.getString(next).equals(t.getString(next))) {
                    String str = f6901v;
                    C1485a.m829b(str, "APIKeys not equal: key " + next + " not equal");
                    return false;
                }
            } catch (JSONException e) {
                C1485a.m830c(f6901v, "APIKeys not equal: JSONException", e);
                return false;
            } catch (ClassCastException e2) {
                C1485a.m830c(f6901v, "APIKeys not equal: ClassCastExceptionException", e2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public void mo21453v(String[] strArr) {
        this.f6909s = strArr;
    }

    /* renamed from: w */
    public void mo21454w(String str) {
        this.f6903m = str;
    }

    /* renamed from: x */
    public void mo21455x(String str) {
        this.f6904n = str;
    }

    /* renamed from: y */
    public void mo21456y(String str) {
        this.f6907q = str;
    }

    /* renamed from: z */
    public void mo21457z(String str) {
        this.f6906p = str;
    }

    public AppInfo(long j, String str, String str2, String str3, String[] strArr, String[] strArr2, String str4, String str5, String str6, JSONObject jSONObject) {
        this(str, str2, str3, strArr, strArr2, str4, str5, str6, jSONObject);
        mo15167h(j);
    }

    public AppInfo() {
    }
}
