package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.util.Map;
import java.util.UUID;
import p040c.p325e0.p326a.p332c.C4271h;

/* compiled from: BUGLY */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new C8807a();

    /* renamed from: A */
    public long f16968A = -1;

    /* renamed from: B */
    public String f16969B = null;

    /* renamed from: C */
    public int f16970C = 0;

    /* renamed from: D */
    public String f16971D = "";

    /* renamed from: E */
    public String f16972E = "";

    /* renamed from: F */
    public String f16973F = null;

    /* renamed from: G */
    public String f16974G = null;

    /* renamed from: H */
    public byte[] f16975H = null;

    /* renamed from: I */
    public Map<String, String> f16976I = null;

    /* renamed from: J */
    public String f16977J = "";

    /* renamed from: K */
    public String f16978K = "";

    /* renamed from: L */
    public long f16979L = -1;

    /* renamed from: M */
    public long f16980M = -1;

    /* renamed from: N */
    public long f16981N = -1;

    /* renamed from: O */
    public long f16982O = -1;

    /* renamed from: P */
    public long f16983P = -1;

    /* renamed from: Q */
    public long f16984Q = -1;

    /* renamed from: R */
    public String f16985R = "";

    /* renamed from: S */
    public String f16986S = "";

    /* renamed from: T */
    public String f16987T = "";

    /* renamed from: U */
    public String f16988U = "";

    /* renamed from: V */
    public String f16989V = "";

    /* renamed from: W */
    public long f16990W = -1;

    /* renamed from: X */
    public boolean f16991X = false;

    /* renamed from: Y */
    public Map<String, String> f16992Y = null;

    /* renamed from: Z */
    public int f16993Z = -1;

    /* renamed from: a0 */
    public int f16994a0 = -1;

    /* renamed from: b0 */
    public Map<String, String> f16995b0 = null;

    /* renamed from: c0 */
    public Map<String, String> f16996c0 = null;

    /* renamed from: d0 */
    public byte[] f16997d0 = null;

    /* renamed from: e */
    public int f16998e = 0;

    /* renamed from: e0 */
    public String f16999e0 = null;

    /* renamed from: f0 */
    public String f17000f0 = null;

    /* renamed from: l */
    public String f17001l = UUID.randomUUID().toString();

    /* renamed from: m */
    public boolean f17002m = false;

    /* renamed from: n */
    public String f17003n = "";

    /* renamed from: o */
    public String f17004o = "";

    /* renamed from: p */
    public String f17005p = "";

    /* renamed from: q */
    public Map<String, PlugInBean> f17006q = null;

    /* renamed from: r */
    public Map<String, PlugInBean> f17007r = null;

    /* renamed from: s */
    public boolean f17008s = false;

    /* renamed from: t */
    public boolean f17009t = false;

    /* renamed from: u */
    public int f17010u = 0;

    /* renamed from: v */
    public String f17011v = "";

    /* renamed from: w */
    public String f17012w = "";

    /* renamed from: x */
    public String f17013x = "";

    /* renamed from: y */
    public String f17014y = "";

    /* renamed from: z */
    public String f17015z = "";

    /* renamed from: com.tencent.bugly.crashreport.crash.CrashDetailBean$a */
    /* compiled from: BUGLY */
    public static class C8807a implements Parcelable.Creator<CrashDetailBean> {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashDetailBean[i];
        }
    }

    public CrashDetailBean() {
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        CrashDetailBean crashDetailBean = (CrashDetailBean) obj;
        if (crashDetailBean == null || this.f16968A - crashDetailBean.f16968A > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16998e);
        parcel.writeString(this.f17001l);
        parcel.writeByte(this.f17002m ? (byte) 1 : 0);
        parcel.writeString(this.f17003n);
        parcel.writeString(this.f17004o);
        parcel.writeString(this.f17005p);
        parcel.writeByte(this.f17008s ? (byte) 1 : 0);
        parcel.writeByte(this.f17009t ? (byte) 1 : 0);
        parcel.writeInt(this.f17010u);
        parcel.writeString(this.f17011v);
        parcel.writeString(this.f17012w);
        parcel.writeString(this.f17013x);
        parcel.writeString(this.f17014y);
        parcel.writeString(this.f17015z);
        parcel.writeLong(this.f16968A);
        parcel.writeString(this.f16969B);
        parcel.writeInt(this.f16970C);
        parcel.writeString(this.f16971D);
        parcel.writeString(this.f16972E);
        parcel.writeString(this.f16973F);
        C4271h.m11661h(parcel, this.f16976I);
        parcel.writeString(this.f16977J);
        parcel.writeString(this.f16978K);
        parcel.writeLong(this.f16979L);
        parcel.writeLong(this.f16980M);
        parcel.writeLong(this.f16981N);
        parcel.writeLong(this.f16982O);
        parcel.writeLong(this.f16983P);
        parcel.writeLong(this.f16984Q);
        parcel.writeString(this.f16985R);
        parcel.writeString(this.f16986S);
        parcel.writeString(this.f16987T);
        parcel.writeString(this.f16988U);
        parcel.writeString(this.f16989V);
        parcel.writeLong(this.f16990W);
        parcel.writeByte(this.f16991X ? (byte) 1 : 0);
        C4271h.m11661h(parcel, this.f16992Y);
        C4271h.m11658e(parcel, this.f17006q);
        C4271h.m11658e(parcel, this.f17007r);
        parcel.writeInt(this.f16993Z);
        parcel.writeInt(this.f16994a0);
        C4271h.m11661h(parcel, this.f16995b0);
        C4271h.m11661h(parcel, this.f16996c0);
        parcel.writeByteArray(this.f16997d0);
        parcel.writeByteArray(this.f16975H);
        parcel.writeString(this.f16999e0);
        parcel.writeString(this.f17000f0);
        parcel.writeString(this.f16974G);
    }

    public CrashDetailBean(Parcel parcel) {
        boolean z = false;
        this.f16998e = parcel.readInt();
        this.f17001l = parcel.readString();
        this.f17002m = parcel.readByte() == 1;
        this.f17003n = parcel.readString();
        this.f17004o = parcel.readString();
        this.f17005p = parcel.readString();
        this.f17008s = parcel.readByte() == 1;
        this.f17009t = parcel.readByte() == 1;
        this.f17010u = parcel.readInt();
        this.f17011v = parcel.readString();
        this.f17012w = parcel.readString();
        this.f17013x = parcel.readString();
        this.f17014y = parcel.readString();
        this.f17015z = parcel.readString();
        this.f16968A = parcel.readLong();
        this.f16969B = parcel.readString();
        this.f16970C = parcel.readInt();
        this.f16971D = parcel.readString();
        this.f16972E = parcel.readString();
        this.f16973F = parcel.readString();
        this.f16976I = C4271h.m11660g(parcel);
        this.f16977J = parcel.readString();
        this.f16978K = parcel.readString();
        this.f16979L = parcel.readLong();
        this.f16980M = parcel.readLong();
        this.f16981N = parcel.readLong();
        this.f16982O = parcel.readLong();
        this.f16983P = parcel.readLong();
        this.f16984Q = parcel.readLong();
        this.f16985R = parcel.readString();
        this.f16986S = parcel.readString();
        this.f16987T = parcel.readString();
        this.f16988U = parcel.readString();
        this.f16989V = parcel.readString();
        this.f16990W = parcel.readLong();
        this.f16991X = parcel.readByte() == 1 ? true : z;
        this.f16992Y = C4271h.m11660g(parcel);
        this.f17006q = C4271h.m11657d(parcel);
        this.f17007r = C4271h.m11657d(parcel);
        this.f16993Z = parcel.readInt();
        this.f16994a0 = parcel.readInt();
        this.f16995b0 = C4271h.m11660g(parcel);
        this.f16996c0 = C4271h.m11660g(parcel);
        this.f16997d0 = parcel.createByteArray();
        this.f16975H = parcel.createByteArray();
        this.f16999e0 = parcel.readString();
        this.f17000f0 = parcel.readString();
        this.f16974G = parcel.readString();
    }
}
