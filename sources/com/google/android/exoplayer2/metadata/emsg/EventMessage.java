package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new C4016a();

    /* renamed from: e */
    public final String f7732e;

    /* renamed from: l */
    public final String f7733l;

    /* renamed from: m */
    public final long f7734m;

    /* renamed from: n */
    public final long f7735n;

    /* renamed from: o */
    public final byte[] f7736o;

    /* renamed from: p */
    public int f7737p;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage$a */
    public static class C4016a implements Parcelable.Creator<EventMessage> {
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: b */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f7732e = str;
        this.f7733l = str2;
        this.f7734m = j;
        this.f7735n = j2;
        this.f7736o = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f7734m != eventMessage.f7734m || this.f7735n != eventMessage.f7735n || !C3152e0.m7789b(this.f7732e, eventMessage.f7732e) || !C3152e0.m7789b(this.f7733l, eventMessage.f7733l) || !Arrays.equals(this.f7736o, eventMessage.f7736o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7737p == 0) {
            String str = this.f7732e;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7733l;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f7734m;
            long j2 = this.f7735n;
            this.f7737p = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f7736o);
        }
        return this.f7737p;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f7732e + ", id=" + this.f7735n + ", value=" + this.f7733l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7732e);
        parcel.writeString(this.f7733l);
        parcel.writeLong(this.f7734m);
        parcel.writeLong(this.f7735n);
        parcel.writeByteArray(this.f7736o);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7732e = readString;
        String readString2 = parcel.readString();
        C3152e0.m7797f(readString2);
        this.f7733l = readString2;
        this.f7734m = parcel.readLong();
        this.f7735n = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        C3152e0.m7797f(createByteArray);
        this.f7736o = createByteArray;
    }
}
