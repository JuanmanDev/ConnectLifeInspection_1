package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C4018a();

    /* renamed from: l */
    public final byte[] f7742l;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public static class C4018a implements Parcelable.Creator<BinaryFrame> {
        /* renamed from: a */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        /* renamed from: b */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f7742l = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (!this.f7761e.equals(binaryFrame.f7761e) || !Arrays.equals(this.f7742l, binaryFrame.f7742l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f7761e.hashCode()) * 31) + Arrays.hashCode(this.f7742l);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7761e);
        parcel.writeByteArray(this.f7742l);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BinaryFrame(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            byte[] r2 = r2.createByteArray()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r2)
            byte[] r2 = (byte[]) r2
            r1.f7742l = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}
