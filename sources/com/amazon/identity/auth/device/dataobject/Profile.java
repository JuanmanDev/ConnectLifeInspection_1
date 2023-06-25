package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.identity.auth.device.AuthError;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1416a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p059l.C1424i;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class Profile extends C1413a {

    /* renamed from: p */
    public static final String f6932p = "com.amazon.identity.auth.device.dataobject.Profile";

    /* renamed from: q */
    public static final String[] f6933q = {"Id", "ExpirationTime", "AppId", "Data"};

    /* renamed from: m */
    public String f6934m;

    /* renamed from: n */
    public String f6935n;

    /* renamed from: o */
    public Date f6936o;

    public enum COL_INDEX {
        ID(0),
        EXPIRATION_TIME(1),
        APP_ID(2),
        DATA(3);
        
        public final int colId;

        /* access modifiers changed from: public */
        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public Profile() {
    }

    /* renamed from: e */
    public ContentValues mo15164e(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f6933q[COL_INDEX.APP_ID.colId], this.f6934m);
        if (this.f6936o != null) {
            contentValues.put(f6933q[COL_INDEX.EXPIRATION_TIME.colId], C1423h.m563b().format(this.f6936o));
        } else {
            contentValues.put(f6933q[COL_INDEX.EXPIRATION_TIME.colId], (String) null);
        }
        contentValues.put(f6933q[COL_INDEX.DATA.colId], C1416a.m503h(this.f6935n, context));
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Profile)) {
            try {
                Profile profile = (Profile) obj;
                if (!TextUtils.equals(this.f6934m, profile.mo21487k()) || !mo15160a(this.f6936o, profile.mo21492p()) || !mo21486j(profile)) {
                    return false;
                }
                return true;
            } catch (NullPointerException e) {
                String str = f6932p;
                C1485a.m829b(str, "" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo21486j(Profile profile) {
        try {
            JSONObject jSONObject = new JSONObject(this.f6935n);
            JSONObject jSONObject2 = new JSONObject(profile.mo21488l());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.getString(next).equals(jSONObject2.getString(next))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return TextUtils.equals(this.f6935n, profile.mo21488l());
        }
    }

    /* renamed from: k */
    public String mo21487k() {
        return this.f6934m;
    }

    /* renamed from: l */
    public String mo21488l() {
        return this.f6935n;
    }

    /* renamed from: m */
    public Bundle mo21489m() {
        return mo21490n();
    }

    /* renamed from: n */
    public final Bundle mo21490n() {
        Bundle bundle = new Bundle();
        if (this.f6935n != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f6935n);
                try {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        bundle.putString(next, jSONObject.getString(next));
                    }
                } catch (JSONException e) {
                    String str = f6932p;
                    C1485a.m829b(str, "Unable to parse profile data in database " + e.getMessage());
                }
            } catch (JSONException e2) {
                C1485a.m830c(f6932p, "JSONException while parsing profile information in database", e2);
                throw new AuthError("JSONException while parsing profile information in database", e2, AuthError.ERROR_TYPE.ERROR_JSON);
            }
        }
        return bundle;
    }

    /* renamed from: o */
    public C1424i mo15162c(Context context) {
        return C1424i.m567s(context);
    }

    /* renamed from: p */
    public Date mo21492p() {
        return this.f6936o;
    }

    /* renamed from: q */
    public long mo21493q() {
        return mo15163d();
    }

    /* renamed from: r */
    public boolean mo21494r() {
        Date date = this.f6936o;
        if (date != null) {
            return date.before(Calendar.getInstance().getTime());
        }
        return true;
    }

    /* renamed from: s */
    public void mo21495s(String str) {
        this.f6934m = str;
    }

    /* renamed from: t */
    public void mo21496t(String str) {
        this.f6935n = str;
    }

    public String toString() {
        return mo21499w();
    }

    /* renamed from: u */
    public void mo21497u(Date date) {
        this.f6936o = C1423h.m566e(date);
    }

    /* renamed from: v */
    public void mo21498v(long j) {
        mo15167h(j);
    }

    /* renamed from: w */
    public String mo21499w() {
        return "{ rowid=" + mo21493q() + ", appId=" + this.f6934m + ", expirationTime=" + C1423h.m563b().format(this.f6936o) + ", data=" + this.f6935n + " }";
    }

    public Profile(String str, String str2) {
        this(str, str2, new Date(Calendar.getInstance().getTime().getTime() + 3600000));
    }

    public Profile(String str, String str2, Date date) {
        this.f6934m = str;
        this.f6935n = str2;
        this.f6936o = date;
    }
}
