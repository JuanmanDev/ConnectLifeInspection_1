package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: BUGLY */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new C8805a();

    /* renamed from: e */
    public final String f16941e;

    /* renamed from: l */
    public final String f16942l;

    /* renamed from: m */
    public final String f16943m;

    /* renamed from: com.tencent.bugly.crashreport.common.info.PlugInBean$a */
    /* compiled from: BUGLY */
    public static class C8805a implements Parcelable.Creator<PlugInBean> {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlugInBean[i];
        }
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f16941e = str;
        this.f16942l = str2;
        this.f16943m = str3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f16941e + " plV:" + this.f16942l + " plUUID:" + this.f16943m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16941e);
        parcel.writeString(this.f16942l);
        parcel.writeString(this.f16943m);
    }

    public PlugInBean(Parcel parcel) {
        this.f16941e = parcel.readString();
        this.f16942l = parcel.readString();
        this.f16943m = parcel.readString();
    }
}
