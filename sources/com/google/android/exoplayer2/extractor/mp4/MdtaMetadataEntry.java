package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C4007a();

    /* renamed from: e */
    public final String f7666e;

    /* renamed from: l */
    public final byte[] f7667l;

    /* renamed from: m */
    public final int f7668m;

    /* renamed from: n */
    public final int f7669n;

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry$a */
    public static class C4007a implements Parcelable.Creator<MdtaMetadataEntry> {
        /* renamed from: a */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (C4007a) null);
        }

        /* renamed from: b */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C4007a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (!this.f7666e.equals(mdtaMetadataEntry.f7666e) || !Arrays.equals(this.f7667l, mdtaMetadataEntry.f7667l) || this.f7668m != mdtaMetadataEntry.f7668m || this.f7669n != mdtaMetadataEntry.f7669n) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f7666e.hashCode()) * 31) + Arrays.hashCode(this.f7667l)) * 31) + this.f7668m) * 31) + this.f7669n;
    }

    public String toString() {
        return "mdta: key=" + this.f7666e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7666e);
        parcel.writeInt(this.f7667l.length);
        parcel.writeByteArray(this.f7667l);
        parcel.writeInt(this.f7668m);
        parcel.writeInt(this.f7669n);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f7666e = str;
        this.f7667l = bArr;
        this.f7668m = i;
        this.f7669n = i2;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7666e = readString;
        byte[] bArr = new byte[parcel.readInt()];
        this.f7667l = bArr;
        parcel.readByteArray(bArr);
        this.f7668m = parcel.readInt();
        this.f7669n = parcel.readInt();
    }
}
