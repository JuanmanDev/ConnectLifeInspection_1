package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C4017a();

    /* renamed from: l */
    public final String f7738l;
    @Nullable

    /* renamed from: m */
    public final String f7739m;

    /* renamed from: n */
    public final int f7740n;

    /* renamed from: o */
    public final byte[] f7741o;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public static class C4017a implements Parcelable.Creator<ApicFrame> {
        /* renamed from: a */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* renamed from: b */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f7738l = str;
        this.f7739m = str2;
        this.f7740n = i;
        this.f7741o = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f7740n != apicFrame.f7740n || !C3152e0.m7789b(this.f7738l, apicFrame.f7738l) || !C3152e0.m7789b(this.f7739m, apicFrame.f7739m) || !Arrays.equals(this.f7741o, apicFrame.f7741o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (527 + this.f7740n) * 31;
        String str = this.f7738l;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7739m;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f7741o);
    }

    public String toString() {
        return this.f7761e + ": mimeType=" + this.f7738l + ", description=" + this.f7739m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7738l);
        parcel.writeString(this.f7739m);
        parcel.writeInt(this.f7740n);
        parcel.writeByteArray(this.f7741o);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7738l = readString;
        String readString2 = parcel.readString();
        C3152e0.m7797f(readString2);
        this.f7739m = readString2;
        this.f7740n = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        C3152e0.m7797f(createByteArray);
        this.f7741o = createByteArray;
    }
}
