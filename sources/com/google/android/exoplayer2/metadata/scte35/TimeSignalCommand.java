package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C4035a();

    /* renamed from: e */
    public final long f7809e;

    /* renamed from: l */
    public final long f7810l;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    public static class C4035a implements Parcelable.Creator<TimeSignalCommand> {
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (C4035a) null);
        }

        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C4035a aVar) {
        this(j, j2);
    }

    /* renamed from: a */
    public static TimeSignalCommand m10532a(C3173t tVar, long j, C3146b0 b0Var) {
        long b = m10533b(tVar, j);
        return new TimeSignalCommand(b, b0Var.mo19944b(b));
    }

    /* renamed from: b */
    public static long m10533b(C3173t tVar, long j) {
        long y = (long) tVar.mo20032y();
        if ((128 & y) != 0) {
            return 8589934591L & ((((y & 1) << 32) | tVar.mo19995A()) + j);
        }
        return -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7809e);
        parcel.writeLong(this.f7810l);
    }

    public TimeSignalCommand(long j, long j2) {
        this.f7809e = j;
        this.f7810l = j2;
    }
}
