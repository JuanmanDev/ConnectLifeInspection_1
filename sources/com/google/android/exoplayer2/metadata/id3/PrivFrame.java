package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C4025a();

    /* renamed from: l */
    public final String f7770l;

    /* renamed from: m */
    public final byte[] f7771m;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public static class C4025a implements Parcelable.Creator<PrivFrame> {
        /* renamed from: a */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* renamed from: b */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f7770l = str;
        this.f7771m = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (!C3152e0.m7789b(this.f7770l, privFrame.f7770l) || !Arrays.equals(this.f7771m, privFrame.f7771m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f7770l;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7771m);
    }

    public String toString() {
        return this.f7761e + ": owner=" + this.f7770l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7770l);
        parcel.writeByteArray(this.f7771m);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7770l = readString;
        byte[] createByteArray = parcel.createByteArray();
        C3152e0.m7797f(createByteArray);
        this.f7771m = createByteArray;
    }
}
