package com.amazon.identity.auth.map.device.utils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.security.InvalidParameterException;
import p040c.p048b.p049a.p050a.p051a.p067t.C1476e;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

public final class MAPVersion implements Parcelable {
    public static final Parcelable.Creator<MAPVersion> CREATOR = new C3811a();

    /* renamed from: l */
    public static final String f6964l = MAPVersion.class.getName();

    /* renamed from: m */
    public static final MAPVersion f6965m = new MAPVersion("0.0.0");

    /* renamed from: e */
    public final int[] f6966e;

    /* renamed from: com.amazon.identity.auth.map.device.utils.MAPVersion$a */
    public static class C3811a implements Parcelable.Creator<MAPVersion> {
        /* renamed from: a */
        public MAPVersion createFromParcel(Parcel parcel) {
            return new MAPVersion(parcel);
        }

        /* renamed from: b */
        public MAPVersion[] newArray(int i) {
            return new MAPVersion[i];
        }
    }

    public MAPVersion(Parcel parcel) {
        int[] iArr = new int[parcel.readInt()];
        this.f6966e = iArr;
        parcel.readIntArray(iArr);
        String str = f6964l;
        C1485a.m832e(str, "MAPVersion Created from PARCEL: " + toString());
    }

    /* renamed from: a */
    public int mo21569a(MAPVersion mAPVersion) {
        try {
            int[] b = mAPVersion.mo21570b();
            int min = Math.min(this.f6966e.length, mAPVersion.mo21570b().length) - 1;
            int i = 0;
            while (i < min && this.f6966e[i] == b[i]) {
                i++;
            }
            Integer valueOf = Integer.valueOf(this.f6966e[i]);
            Integer valueOf2 = Integer.valueOf(b[i]);
            if (i == this.f6966e.length && this.f6966e.length == mAPVersion.mo21570b().length) {
                return 0;
            }
            if (b.length == this.f6966e.length || !valueOf.equals(valueOf2)) {
                return valueOf.compareTo(valueOf2);
            }
            return Integer.valueOf(this.f6966e.length).compareTo(Integer.valueOf(b.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("1=" + toString() + " vs 2=" + mAPVersion.toString() + " " + e.getMessage());
        }
    }

    /* renamed from: b */
    public int[] mo21570b() {
        return this.f6966e;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return C1476e.m810a(this.f6966e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = f6964l;
        C1485a.m832e(str, "MAPVersion writing " + this.f6966e.length + " ints to parcel");
        parcel.writeInt(this.f6966e.length);
        parcel.writeIntArray(this.f6966e);
    }

    public MAPVersion(String str) {
        C1485a.m832e(f6964l, "MAPVersion from String : " + str);
        if (str != null) {
            String[] split = TextUtils.split(str, "\\.");
            this.f6966e = new int[split.length];
            int i = 0;
            for (String parseInt : split) {
                try {
                    this.f6966e[i] = Integer.parseInt(parseInt);
                } catch (NumberFormatException unused) {
                    this.f6966e[i] = 0;
                }
                i++;
            }
            return;
        }
        throw new InvalidParameterException("version must not be null");
    }
}
