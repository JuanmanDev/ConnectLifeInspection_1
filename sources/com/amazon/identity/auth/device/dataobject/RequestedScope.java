package com.amazon.identity.auth.device.dataobject;

import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import p040c.p048b.p049a.p050a.p051a.p058k.C1413a;
import p040c.p048b.p049a.p050a.p051a.p059l.C1425j;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public class RequestedScope extends C1413a implements Parcelable {
    public static final Parcelable.Creator<RequestedScope> CREATOR = new C3805a();

    /* renamed from: r */
    public static final String f6938r = RequestedScope.class.getName();

    /* renamed from: s */
    public static final String[] f6939s = {"rowid", "Scope", "AppId", MAPCookie.KEY_DIRECTED_ID, "AtzAccessTokenId", "AtzRefreshTokenId"};

    /* renamed from: m */
    public String f6940m;

    /* renamed from: n */
    public String f6941n;

    /* renamed from: o */
    public String f6942o;

    /* renamed from: p */
    public long f6943p;

    /* renamed from: q */
    public long f6944q;

    public enum COL_INDEX {
        ROW_ID(0),
        SCOPE(1),
        APP_FAMILY_ID(2),
        DIRECTED_ID(3),
        AUTHORIZATION_ACCESS_TOKEN_ID(4),
        AUTHORIZATION_REFRESH_TOKEN_ID(5);
        
        public final int colId;

        /* access modifiers changed from: public */
        COL_INDEX(int i) {
            this.colId = i;
        }
    }

    public enum OUTCOME {
        UNKNOWN(-2),
        REJECTED(-1),
        GRANTED_LOCALLY(0);
        
        public final long longVal;

        /* access modifiers changed from: public */
        OUTCOME(long j) {
            this.longVal = j;
        }
    }

    /* renamed from: com.amazon.identity.auth.device.dataobject.RequestedScope$a */
    public static class C3805a implements Parcelable.Creator<RequestedScope> {
        /* renamed from: a */
        public RequestedScope createFromParcel(Parcel parcel) {
            return new RequestedScope(parcel);
        }

        /* renamed from: b */
        public RequestedScope[] newArray(int i) {
            return new RequestedScope[i];
        }
    }

    public RequestedScope(String str, String str2, String str3) {
        long j = OUTCOME.REJECTED.longVal;
        this.f6943p = j;
        this.f6944q = j;
        this.f6940m = str;
        this.f6941n = str2;
        this.f6942o = str3;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public ContentValues mo15164e(Context context) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(f6939s[COL_INDEX.SCOPE.colId], this.f6940m);
        contentValues.put(f6939s[COL_INDEX.APP_FAMILY_ID.colId], this.f6941n);
        contentValues.put(f6939s[COL_INDEX.DIRECTED_ID.colId], this.f6942o);
        contentValues.put(f6939s[COL_INDEX.AUTHORIZATION_ACCESS_TOKEN_ID.colId], Long.valueOf(this.f6943p));
        contentValues.put(f6939s[COL_INDEX.AUTHORIZATION_REFRESH_TOKEN_ID.colId], Long.valueOf(this.f6944q));
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RequestedScope) {
            try {
                RequestedScope requestedScope = (RequestedScope) obj;
                if (!this.f6940m.equals(requestedScope.mo21509p()) || !this.f6941n.equals(requestedScope.mo21504k()) || !this.f6942o.equals(requestedScope.mo21508o()) || this.f6943p != requestedScope.mo21505l() || this.f6944q != requestedScope.mo21506m()) {
                    return false;
                }
                return true;
            } catch (NullPointerException e) {
                String str = f6938r;
                C1485a.m829b(str, "" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: j */
    public RequestedScope clone() {
        return new RequestedScope(mo15163d(), this.f6940m, this.f6941n, this.f6942o, this.f6943p, this.f6944q);
    }

    /* renamed from: k */
    public String mo21504k() {
        return this.f6941n;
    }

    /* renamed from: l */
    public long mo21505l() {
        return this.f6943p;
    }

    /* renamed from: m */
    public long mo21506m() {
        return this.f6944q;
    }

    /* renamed from: n */
    public C1425j mo15162c(Context context) {
        return C1425j.m574u(context);
    }

    /* renamed from: o */
    public String mo21508o() {
        return this.f6942o;
    }

    /* renamed from: p */
    public String mo21509p() {
        return this.f6940m;
    }

    /* renamed from: q */
    public void mo21510q(String str) {
        this.f6941n = str;
    }

    /* renamed from: r */
    public void mo21511r(long j) {
        this.f6943p = j;
    }

    /* renamed from: s */
    public void mo21512s(long j) {
        this.f6944q = j;
    }

    /* renamed from: t */
    public void mo21513t(String str) {
        this.f6942o = str;
    }

    public String toString() {
        return "{ rowid=" + mo15163d() + ", scope=" + this.f6940m + ", appFamilyId=" + this.f6941n + ", directedId=<obscured>, atzAccessTokenId=" + this.f6943p + ", atzRefreshTokenId=" + this.f6944q + " }";
    }

    /* renamed from: u */
    public void mo21514u(String str) {
        this.f6940m = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(mo15163d());
        parcel.writeString(this.f6940m);
        parcel.writeString(this.f6941n);
        parcel.writeString(this.f6942o);
        parcel.writeLong(this.f6943p);
        parcel.writeLong(this.f6944q);
    }

    public RequestedScope(String str, String str2, String str3, long j, long j2) {
        this(str, str2, str3);
        this.f6943p = j;
        this.f6944q = j2;
    }

    public RequestedScope(long j, String str, String str2, String str3, long j2, long j3) {
        this(str, str2, str3, j2, j3);
        mo15167h(j);
    }

    public RequestedScope() {
        long j = OUTCOME.REJECTED.longVal;
        this.f6943p = j;
        this.f6944q = j;
    }

    public RequestedScope(Parcel parcel) {
        long j = OUTCOME.REJECTED.longVal;
        this.f6943p = j;
        this.f6944q = j;
        mo15167h(parcel.readLong());
        this.f6940m = parcel.readString();
        this.f6941n = parcel.readString();
        this.f6942o = parcel.readString();
        this.f6943p = parcel.readLong();
        this.f6944q = parcel.readLong();
    }
}
