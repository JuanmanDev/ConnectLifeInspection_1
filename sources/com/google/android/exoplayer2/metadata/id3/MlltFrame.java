package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C4024a();

    /* renamed from: l */
    public final int f7765l;

    /* renamed from: m */
    public final int f7766m;

    /* renamed from: n */
    public final int f7767n;

    /* renamed from: o */
    public final int[] f7768o;

    /* renamed from: p */
    public final int[] f7769p;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.MlltFrame$a */
    public static class C4024a implements Parcelable.Creator<MlltFrame> {
        /* renamed from: a */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        /* renamed from: b */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7765l = i;
        this.f7766m = i2;
        this.f7767n = i3;
        this.f7768o = iArr;
        this.f7769p = iArr2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f7765l == mlltFrame.f7765l && this.f7766m == mlltFrame.f7766m && this.f7767n == mlltFrame.f7767n && Arrays.equals(this.f7768o, mlltFrame.f7768o) && Arrays.equals(this.f7769p, mlltFrame.f7769p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f7765l) * 31) + this.f7766m) * 31) + this.f7767n) * 31) + Arrays.hashCode(this.f7768o)) * 31) + Arrays.hashCode(this.f7769p);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7765l);
        parcel.writeInt(this.f7766m);
        parcel.writeInt(this.f7767n);
        parcel.writeIntArray(this.f7768o);
        parcel.writeIntArray(this.f7769p);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f7765l = parcel.readInt();
        this.f7766m = parcel.readInt();
        this.f7767n = parcel.readInt();
        this.f7768o = parcel.createIntArray();
        this.f7769p = parcel.createIntArray();
    }
}
