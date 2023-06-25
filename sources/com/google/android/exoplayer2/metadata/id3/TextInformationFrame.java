package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C4026a();
    @Nullable

    /* renamed from: l */
    public final String f7772l;

    /* renamed from: m */
    public final String f7773m;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public static class C4026a implements Parcelable.Creator<TextInformationFrame> {
        /* renamed from: a */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* renamed from: b */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f7772l = str2;
        this.f7773m = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (!this.f7761e.equals(textInformationFrame.f7761e) || !C3152e0.m7789b(this.f7772l, textInformationFrame.f7772l) || !C3152e0.m7789b(this.f7773m, textInformationFrame.f7773m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f7761e.hashCode()) * 31;
        String str = this.f7772l;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7773m;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f7761e + ": value=" + this.f7773m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7761e);
        parcel.writeString(this.f7772l);
        parcel.writeString(this.f7773m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInformationFrame(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.f7772l = r0
            java.lang.String r2 = r2.readString()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f7773m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }
}
