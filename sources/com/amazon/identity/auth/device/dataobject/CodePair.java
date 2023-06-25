package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1416a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1421f;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p051a.p067t.C1479h;

public class CodePair extends C1413a {

    /* renamed from: u */
    public static final String[] f6922u = {"Id", "AppId", "UserCode", "DeviceCode", "VerificationUri", "Interval", "CreationTime", "ExpirationTime", "Scopes"};

    /* renamed from: m */
    public final String f6923m;

    /* renamed from: n */
    public final String f6924n;

    /* renamed from: o */
    public final URI f6925o;

    /* renamed from: p */
    public final int f6926p;

    /* renamed from: q */
    public final Date f6927q;

    /* renamed from: r */
    public final Date f6928r;

    /* renamed from: s */
    public final String f6929s;

    /* renamed from: t */
    public final String[] f6930t;

    public enum COL_INDEX {
        ID(0),
        APP_ID(1),
        USER_CODE(2),
        DEVICE_CODE(3),
        VERIFICATION_URI(4),
        INTERVAL(5),
        CREATION_TIME(6),
        EXPIRATION_TIME(7),
        SCOPES(8);
        
        public final int colId;

        /* access modifiers changed from: public */
        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public CodePair(String str, String str2, String str3, URI uri, int i, Date date, Date date2, String[] strArr) {
        this.f6929s = str;
        this.f6923m = str2;
        this.f6924n = str3;
        this.f6925o = uri;
        this.f6926p = i;
        this.f6927q = C1423h.m566e(date);
        this.f6928r = C1423h.m566e(date2);
        this.f6930t = strArr;
    }

    /* renamed from: e */
    public ContentValues mo15164e(Context context) {
        ContentValues contentValues = new ContentValues();
        SimpleDateFormat b = C1423h.m563b();
        contentValues.put(f6922u[COL_INDEX.APP_ID.colId], this.f6929s);
        contentValues.put(f6922u[COL_INDEX.USER_CODE.colId], this.f6923m);
        contentValues.put(f6922u[COL_INDEX.DEVICE_CODE.colId], C1416a.m503h(this.f6924n, context));
        contentValues.put(f6922u[COL_INDEX.VERIFICATION_URI.colId], this.f6925o.toString());
        contentValues.put(f6922u[COL_INDEX.INTERVAL.colId], Integer.valueOf(this.f6926p));
        contentValues.put(f6922u[COL_INDEX.CREATION_TIME.colId], b.format(this.f6927q));
        contentValues.put(f6922u[COL_INDEX.EXPIRATION_TIME.colId], b.format(this.f6928r));
        contentValues.put(f6922u[COL_INDEX.SCOPES.colId], C1479h.m816a(this.f6930t));
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CodePair)) {
            return false;
        }
        CodePair codePair = (CodePair) obj;
        if (!TextUtils.equals(this.f6929s, codePair.mo21476j()) || !TextUtils.equals(this.f6923m, codePair.mo21483q()) || !TextUtils.equals(this.f6924n, codePair.mo21479m()) || !mo15160a(this.f6925o, codePair.mo21484r()) || !mo15160a(Integer.valueOf(this.f6926p), Integer.valueOf(codePair.mo21481o())) || !mo15160a(this.f6927q, codePair.mo21477k()) || !mo15160a(this.f6928r, codePair.mo21480n()) || !mo15160a(this.f6930t, codePair.mo21482p())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public String mo21476j() {
        return this.f6929s;
    }

    /* renamed from: k */
    public Date mo21477k() {
        return this.f6927q;
    }

    /* renamed from: l */
    public C1421f mo15162c(Context context) {
        return C1421f.m550s(context);
    }

    /* renamed from: m */
    public String mo21479m() {
        return this.f6924n;
    }

    /* renamed from: n */
    public Date mo21480n() {
        return this.f6928r;
    }

    /* renamed from: o */
    public int mo21481o() {
        return this.f6926p;
    }

    /* renamed from: p */
    public String[] mo21482p() {
        return this.f6930t;
    }

    /* renamed from: q */
    public String mo21483q() {
        return this.f6923m;
    }

    /* renamed from: r */
    public URI mo21484r() {
        return this.f6925o;
    }
}
