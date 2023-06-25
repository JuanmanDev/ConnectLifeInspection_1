package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C4028a();

    /* renamed from: e */
    public final long f7776e;

    /* renamed from: l */
    public final long f7777l;

    /* renamed from: m */
    public final byte[] f7778m;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$a */
    public static class C4028a implements Parcelable.Creator<PrivateCommand> {
        /* renamed from: a */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, (C4028a) null);
        }

        /* renamed from: b */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C4028a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static PrivateCommand m10509a(C3173t tVar, int i, long j) {
        long A = tVar.mo19995A();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        tVar.mo20015h(bArr, 0, i2);
        return new PrivateCommand(A, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7776e);
        parcel.writeLong(this.f7777l);
        parcel.writeInt(this.f7778m.length);
        parcel.writeByteArray(this.f7778m);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f7776e = j2;
        this.f7777l = j;
        this.f7778m = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.f7776e = parcel.readLong();
        this.f7777l = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f7778m = bArr;
        parcel.readByteArray(bArr);
    }
}
