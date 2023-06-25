package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C4023a();

    /* renamed from: l */
    public final String f7762l;

    /* renamed from: m */
    public final String f7763m;

    /* renamed from: n */
    public final String f7764n;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$a */
    public static class C4023a implements Parcelable.Creator<InternalFrame> {
        /* renamed from: a */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        /* renamed from: b */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f7762l = str;
        this.f7763m = str2;
        this.f7764n = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (!C3152e0.m7789b(this.f7763m, internalFrame.f7763m) || !C3152e0.m7789b(this.f7762l, internalFrame.f7762l) || !C3152e0.m7789b(this.f7764n, internalFrame.f7764n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f7762l;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7763m;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7764n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f7761e + ": domain=" + this.f7762l + ", description=" + this.f7763m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7761e);
        parcel.writeString(this.f7762l);
        parcel.writeString(this.f7764n);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7762l = readString;
        String readString2 = parcel.readString();
        C3152e0.m7797f(readString2);
        this.f7763m = readString2;
        String readString3 = parcel.readString();
        C3152e0.m7797f(readString3);
        this.f7764n = readString3;
    }
}
