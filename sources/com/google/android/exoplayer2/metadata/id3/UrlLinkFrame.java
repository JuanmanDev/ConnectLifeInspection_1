package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C4027a();
    @Nullable

    /* renamed from: l */
    public final String f7774l;

    /* renamed from: m */
    public final String f7775m;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public static class C4027a implements Parcelable.Creator<UrlLinkFrame> {
        /* renamed from: a */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* renamed from: b */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f7774l = str2;
        this.f7775m = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (!this.f7761e.equals(urlLinkFrame.f7761e) || !C3152e0.m7789b(this.f7774l, urlLinkFrame.f7774l) || !C3152e0.m7789b(this.f7775m, urlLinkFrame.f7775m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (527 + this.f7761e.hashCode()) * 31;
        String str = this.f7774l;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7775m;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f7761e + ": url=" + this.f7775m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7761e);
        parcel.writeString(this.f7774l);
        parcel.writeString(this.f7775m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UrlLinkFrame(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = r2.readString()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            java.lang.String r0 = r2.readString()
            r1.f7774l = r0
            java.lang.String r2 = r2.readString()
            p040c.p200q.p201a.p219b.p261o0.C3152e0.m7797f(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f7775m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
