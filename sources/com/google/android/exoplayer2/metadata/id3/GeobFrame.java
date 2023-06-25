package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C4022a();

    /* renamed from: l */
    public final String f7757l;

    /* renamed from: m */
    public final String f7758m;

    /* renamed from: n */
    public final String f7759n;

    /* renamed from: o */
    public final byte[] f7760o;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public static class C4022a implements Parcelable.Creator<GeobFrame> {
        /* renamed from: a */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* renamed from: b */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7757l = str;
        this.f7758m = str2;
        this.f7759n = str3;
        this.f7760o = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (!C3152e0.m7789b(this.f7757l, geobFrame.f7757l) || !C3152e0.m7789b(this.f7758m, geobFrame.f7758m) || !C3152e0.m7789b(this.f7759n, geobFrame.f7759n) || !Arrays.equals(this.f7760o, geobFrame.f7760o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f7757l;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7758m;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7759n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f7760o);
    }

    public String toString() {
        return this.f7761e + ": mimeType=" + this.f7757l + ", filename=" + this.f7758m + ", description=" + this.f7759n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7757l);
        parcel.writeString(this.f7758m);
        parcel.writeString(this.f7759n);
        parcel.writeByteArray(this.f7760o);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7757l = readString;
        String readString2 = parcel.readString();
        C3152e0.m7797f(readString2);
        this.f7758m = readString2;
        String readString3 = parcel.readString();
        C3152e0.m7797f(readString3);
        this.f7759n = readString3;
        byte[] createByteArray = parcel.createByteArray();
        C3152e0.m7797f(createByteArray);
        this.f7760o = createByteArray;
    }
}
