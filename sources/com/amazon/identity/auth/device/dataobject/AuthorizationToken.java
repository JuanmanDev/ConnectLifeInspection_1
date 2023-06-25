package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.Token;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1416a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1420e;
import p040c.p048b.p049a.p050a.p051a.p059l.C1423h;
import p040c.p048b.p049a.p050a.p068b.p069a.p070b.C1483a;
import p040c.p048b.p049a.p050a.p068b.p069a.p070b.C1484b;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public abstract class AuthorizationToken extends C1413a implements C1484b {

    /* renamed from: t */
    public static final String f6912t = "com.amazon.identity.auth.device.dataobject.AuthorizationToken";

    /* renamed from: u */
    public static final String[] f6913u = {"Id", "AppId", Token.TAG, "CreationTime", "ExpirationTime", "MiscData", "type", "directedId"};

    /* renamed from: m */
    public String f6914m;

    /* renamed from: n */
    public String f6915n;

    /* renamed from: o */
    public Date f6916o;

    /* renamed from: p */
    public Date f6917p;

    /* renamed from: q */
    public byte[] f6918q;

    /* renamed from: r */
    public AUTHZ_TOKEN_TYPE f6919r;

    /* renamed from: s */
    public String f6920s;

    public enum AUTHZ_TOKEN_TYPE {
        ACCESS("com.amazon.identity.token.accessToken"),
        REFRESH("com.amazon.identity.token.refreshToken");
        
        public final String mType;

        /* access modifiers changed from: public */
        AUTHZ_TOKEN_TYPE(String str) {
            this.mType = str;
        }

        public String toString() {
            return this.mType;
        }
    }

    public enum COL_INDEX {
        ID(0),
        APP_FAMILY_ID(1),
        TOKEN(2),
        CREATION_TIME(3),
        EXPIRATION_TIME(4),
        MISC_DATA(5),
        TYPE(6),
        DIRECTED_ID(7);
        
        public final int colId;

        /* access modifiers changed from: public */
        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public AuthorizationToken(String str, String str2, String str3, Date date, Date date2, byte[] bArr, AUTHZ_TOKEN_TYPE authz_token_type) {
        this.f6914m = str;
        this.f6915n = str3;
        this.f6916o = C1423h.m566e(date);
        this.f6917p = C1423h.m566e(date2);
        this.f6918q = bArr;
        this.f6919r = authz_token_type;
        this.f6920s = str2;
    }

    /* renamed from: e */
    public ContentValues mo15164e(Context context) {
        ContentValues contentValues = new ContentValues();
        SimpleDateFormat b = C1423h.m563b();
        contentValues.put(f6913u[COL_INDEX.APP_FAMILY_ID.colId], this.f6914m);
        contentValues.put(f6913u[COL_INDEX.TOKEN.colId], C1416a.m503h(this.f6915n, context));
        contentValues.put(f6913u[COL_INDEX.CREATION_TIME.colId], b.format(this.f6916o));
        contentValues.put(f6913u[COL_INDEX.EXPIRATION_TIME.colId], b.format(this.f6917p));
        contentValues.put(f6913u[COL_INDEX.MISC_DATA.colId], this.f6918q);
        contentValues.put(f6913u[COL_INDEX.TYPE.colId], Integer.valueOf(this.f6919r.ordinal()));
        contentValues.put(f6913u[COL_INDEX.DIRECTED_ID.colId], this.f6920s);
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof AuthorizationToken)) {
            try {
                AuthorizationToken authorizationToken = (AuthorizationToken) obj;
                if (!TextUtils.equals(this.f6914m, authorizationToken.mo21459j()) || !TextUtils.equals(this.f6915n, authorizationToken.mo21464o()) || !mo15160a(this.f6916o, authorizationToken.mo21460k()) || !mo15160a(this.f6917p, authorizationToken.mo21463n()) || !TextUtils.equals(mo21465p(), authorizationToken.mo21465p()) || !TextUtils.equals(this.f6920s, authorizationToken.mo21462m())) {
                    return false;
                }
                return true;
            } catch (NullPointerException e) {
                String str = f6912t;
                C1485a.m829b(str, "" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: j */
    public String mo21459j() {
        return this.f6914m;
    }

    /* renamed from: k */
    public Date mo21460k() {
        return this.f6916o;
    }

    /* renamed from: l */
    public C1420e mo15162c(Context context) {
        return C1420e.m543t(context);
    }

    /* renamed from: m */
    public String mo21462m() {
        return this.f6920s;
    }

    /* renamed from: n */
    public Date mo21463n() {
        return this.f6917p;
    }

    /* renamed from: o */
    public String mo21464o() {
        return this.f6915n;
    }

    /* renamed from: p */
    public String mo21465p() {
        return this.f6919r.toString();
    }

    /* renamed from: q */
    public boolean mo21466q(int i) {
        return this.f6917p.getTime() - Calendar.getInstance().getTimeInMillis() >= C1483a.m827a((long) i);
    }

    /* renamed from: r */
    public void mo21467r(String str) {
        this.f6914m = str;
    }

    /* renamed from: s */
    public void mo21468s(Date date) {
        this.f6916o = C1423h.m566e(date);
    }

    /* renamed from: t */
    public void mo21469t(String str) {
        this.f6920s = str;
    }

    public String toString() {
        return this.f6915n;
    }

    /* renamed from: u */
    public void mo21470u(Date date) {
        this.f6917p = C1423h.m566e(date);
    }

    /* renamed from: v */
    public void mo21471v(long j) {
        mo15167h(j);
    }

    /* renamed from: w */
    public void mo21472w(byte[] bArr) {
        this.f6918q = bArr;
    }

    /* renamed from: x */
    public void mo21473x(String str) {
        this.f6915n = str;
    }

    public AuthorizationToken() {
    }
}
