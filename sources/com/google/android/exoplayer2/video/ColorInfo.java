package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C4065a();

    /* renamed from: e */
    public final int f7953e;

    /* renamed from: l */
    public final int f7954l;

    /* renamed from: m */
    public final int f7955m;
    @Nullable

    /* renamed from: n */
    public final byte[] f7956n;

    /* renamed from: o */
    public int f7957o;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$a */
    public static class C4065a implements Parcelable.Creator<ColorInfo> {
        /* renamed from: a */
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* renamed from: b */
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[0];
        }
    }

    public ColorInfo(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f7953e = i;
        this.f7954l = i2;
        this.f7955m = i3;
        this.f7956n = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.f7953e == colorInfo.f7953e && this.f7954l == colorInfo.f7954l && this.f7955m == colorInfo.f7955m && Arrays.equals(this.f7956n, colorInfo.f7956n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f7957o == 0) {
            this.f7957o = ((((((527 + this.f7953e) * 31) + this.f7954l) * 31) + this.f7955m) * 31) + Arrays.hashCode(this.f7956n);
        }
        return this.f7957o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f7953e);
        sb.append(", ");
        sb.append(this.f7954l);
        sb.append(", ");
        sb.append(this.f7955m);
        sb.append(", ");
        sb.append(this.f7956n != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7953e);
        parcel.writeInt(this.f7954l);
        parcel.writeInt(this.f7955m);
        C3152e0.m7814n0(parcel, this.f7956n != null);
        byte[] bArr = this.f7956n;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f7953e = parcel.readInt();
        this.f7954l = parcel.readInt();
        this.f7955m = parcel.readInt();
        this.f7956n = C3152e0.m7786Z(parcel) ? parcel.createByteArray() : null;
    }
}
