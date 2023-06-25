package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.p028os.EnvironmentCompat;
import java.util.Map;
import p040c.p325e0.p326a.p332c.C4271h;

/* compiled from: BUGLY */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new C8804a();

    /* renamed from: A */
    public Map<String, String> f16923A;

    /* renamed from: B */
    public Map<String, String> f16924B;

    /* renamed from: e */
    public int f16925e;

    /* renamed from: l */
    public String f16926l;

    /* renamed from: m */
    public String f16927m;

    /* renamed from: n */
    public long f16928n;

    /* renamed from: o */
    public long f16929o;

    /* renamed from: p */
    public long f16930p;

    /* renamed from: q */
    public long f16931q;

    /* renamed from: r */
    public long f16932r;

    /* renamed from: s */
    public String f16933s;

    /* renamed from: t */
    public long f16934t;

    /* renamed from: u */
    public boolean f16935u;

    /* renamed from: v */
    public String f16936v;

    /* renamed from: w */
    public String f16937w;

    /* renamed from: x */
    public int f16938x;

    /* renamed from: y */
    public int f16939y;

    /* renamed from: z */
    public int f16940z;

    /* renamed from: com.tencent.bugly.crashreport.biz.UserInfoBean$a */
    /* compiled from: BUGLY */
    public static class C8804a implements Parcelable.Creator<UserInfoBean> {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UserInfoBean[i];
        }
    }

    public UserInfoBean() {
        this.f16934t = 0;
        this.f16935u = false;
        this.f16936v = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f16939y = -1;
        this.f16940z = -1;
        this.f16923A = null;
        this.f16924B = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16925e);
        parcel.writeString(this.f16926l);
        parcel.writeString(this.f16927m);
        parcel.writeLong(this.f16928n);
        parcel.writeLong(this.f16929o);
        parcel.writeLong(this.f16930p);
        parcel.writeLong(this.f16931q);
        parcel.writeLong(this.f16932r);
        parcel.writeString(this.f16933s);
        parcel.writeLong(this.f16934t);
        parcel.writeByte(this.f16935u ? (byte) 1 : 0);
        parcel.writeString(this.f16936v);
        parcel.writeInt(this.f16939y);
        parcel.writeInt(this.f16940z);
        C4271h.m11661h(parcel, this.f16923A);
        C4271h.m11661h(parcel, this.f16924B);
        parcel.writeString(this.f16937w);
        parcel.writeInt(this.f16938x);
    }

    public UserInfoBean(Parcel parcel) {
        this.f16934t = 0;
        boolean z = false;
        this.f16935u = false;
        this.f16936v = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f16939y = -1;
        this.f16940z = -1;
        this.f16923A = null;
        this.f16924B = null;
        this.f16925e = parcel.readInt();
        this.f16926l = parcel.readString();
        this.f16927m = parcel.readString();
        this.f16928n = parcel.readLong();
        this.f16929o = parcel.readLong();
        this.f16930p = parcel.readLong();
        this.f16931q = parcel.readLong();
        this.f16932r = parcel.readLong();
        this.f16933s = parcel.readString();
        this.f16934t = parcel.readLong();
        this.f16935u = parcel.readByte() == 1 ? true : z;
        this.f16936v = parcel.readString();
        this.f16939y = parcel.readInt();
        this.f16940z = parcel.readInt();
        this.f16923A = C4271h.m11660g(parcel);
        this.f16924B = C4271h.m11660g(parcel);
        this.f16937w = parcel.readString();
        this.f16938x = parcel.readInt();
    }
}
