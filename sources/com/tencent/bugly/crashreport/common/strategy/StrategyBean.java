package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import java.util.Map;
import p040c.p325e0.p326a.p332c.C4271h;

/* compiled from: BUGLY */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new C8806a();

    /* renamed from: D */
    public static String f16944D = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: E */
    public static String f16945E = "http://android.bugly.qq.com/rqd/async";

    /* renamed from: A */
    public int f16946A;

    /* renamed from: B */
    public long f16947B;

    /* renamed from: C */
    public long f16948C;

    /* renamed from: e */
    public long f16949e;

    /* renamed from: l */
    public boolean f16950l;

    /* renamed from: m */
    public boolean f16951m;

    /* renamed from: n */
    public boolean f16952n;

    /* renamed from: o */
    public boolean f16953o;

    /* renamed from: p */
    public boolean f16954p;

    /* renamed from: q */
    public boolean f16955q;

    /* renamed from: r */
    public boolean f16956r;

    /* renamed from: s */
    public boolean f16957s;

    /* renamed from: t */
    public boolean f16958t;

    /* renamed from: u */
    public long f16959u;

    /* renamed from: v */
    public long f16960v;

    /* renamed from: w */
    public String f16961w;

    /* renamed from: x */
    public String f16962x;

    /* renamed from: y */
    public String f16963y;

    /* renamed from: z */
    public Map<String, String> f16964z;

    /* renamed from: com.tencent.bugly.crashreport.common.strategy.StrategyBean$a */
    /* compiled from: BUGLY */
    public static class C8806a implements Parcelable.Creator<StrategyBean> {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StrategyBean[i];
        }
    }

    public StrategyBean() {
        this.f16949e = -1;
        this.f16950l = true;
        this.f16951m = true;
        this.f16952n = true;
        this.f16953o = true;
        this.f16954p = false;
        this.f16955q = true;
        this.f16956r = true;
        this.f16957s = true;
        this.f16958t = true;
        this.f16960v = 30000;
        this.f16961w = f16944D;
        this.f16962x = f16945E;
        this.f16946A = 10;
        this.f16947B = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f16948C = -1;
        this.f16949e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L");
        sb.append("@)");
        sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K");
        sb.append("@!");
        this.f16963y = sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16949e);
        parcel.writeByte(this.f16950l ? (byte) 1 : 0);
        parcel.writeByte(this.f16951m ? (byte) 1 : 0);
        parcel.writeByte(this.f16952n ? (byte) 1 : 0);
        parcel.writeString(this.f16961w);
        parcel.writeString(this.f16962x);
        parcel.writeString(this.f16963y);
        C4271h.m11661h(parcel, this.f16964z);
        parcel.writeByte(this.f16953o ? (byte) 1 : 0);
        parcel.writeByte(this.f16954p ? (byte) 1 : 0);
        parcel.writeByte(this.f16957s ? (byte) 1 : 0);
        parcel.writeByte(this.f16958t ? (byte) 1 : 0);
        parcel.writeLong(this.f16960v);
        parcel.writeByte(this.f16955q ? (byte) 1 : 0);
        parcel.writeByte(this.f16956r ? (byte) 1 : 0);
        parcel.writeLong(this.f16959u);
        parcel.writeInt(this.f16946A);
        parcel.writeLong(this.f16947B);
        parcel.writeLong(this.f16948C);
    }

    public StrategyBean(Parcel parcel) {
        this.f16949e = -1;
        boolean z = true;
        this.f16950l = true;
        this.f16951m = true;
        this.f16952n = true;
        this.f16953o = true;
        this.f16954p = false;
        this.f16955q = true;
        this.f16956r = true;
        this.f16957s = true;
        this.f16958t = true;
        this.f16960v = 30000;
        this.f16961w = f16944D;
        this.f16962x = f16945E;
        this.f16946A = 10;
        this.f16947B = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f16948C = -1;
        try {
            "S(@L@L" + "@)";
            this.f16949e = parcel.readLong();
            this.f16950l = parcel.readByte() == 1;
            this.f16951m = parcel.readByte() == 1;
            this.f16952n = parcel.readByte() == 1;
            this.f16961w = parcel.readString();
            this.f16962x = parcel.readString();
            this.f16963y = parcel.readString();
            this.f16964z = C4271h.m11660g(parcel);
            this.f16953o = parcel.readByte() == 1;
            this.f16954p = parcel.readByte() == 1;
            this.f16957s = parcel.readByte() == 1;
            this.f16958t = parcel.readByte() == 1;
            this.f16960v = parcel.readLong();
            this.f16955q = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z = false;
            }
            this.f16956r = z;
            this.f16959u = parcel.readLong();
            this.f16946A = parcel.readInt();
            this.f16947B = parcel.readLong();
            this.f16948C = parcel.readLong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
