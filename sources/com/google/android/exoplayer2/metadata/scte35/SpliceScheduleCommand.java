package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C4032a();

    /* renamed from: e */
    public final List<C4034c> f7795e;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public static class C4032a implements Parcelable.Creator<SpliceScheduleCommand> {
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, (C4032a) null);
        }

        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C4033b {

        /* renamed from: a */
        public final int f7796a;

        /* renamed from: b */
        public final long f7797b;

        public /* synthetic */ C4033b(int i, long j, C4032a aVar) {
            this(i, j);
        }

        /* renamed from: c */
        public static C4033b m10524c(Parcel parcel) {
            return new C4033b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void mo24173d(Parcel parcel) {
            parcel.writeInt(this.f7796a);
            parcel.writeLong(this.f7797b);
        }

        public C4033b(int i, long j) {
            this.f7796a = i;
            this.f7797b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C4032a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceScheduleCommand m10519a(C3173t tVar) {
        int y = tVar.mo20032y();
        ArrayList arrayList = new ArrayList(y);
        for (int i = 0; i < y; i++) {
            arrayList.add(C4034c.m10530e(tVar));
        }
        return new SpliceScheduleCommand((List<C4034c>) arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f7795e.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f7795e.get(i2).mo24174f(parcel);
        }
    }

    public SpliceScheduleCommand(List<C4034c> list) {
        this.f7795e = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C4034c.m10529d(parcel));
        }
        this.f7795e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    public static final class C4034c {

        /* renamed from: a */
        public final long f7798a;

        /* renamed from: b */
        public final boolean f7799b;

        /* renamed from: c */
        public final boolean f7800c;

        /* renamed from: d */
        public final boolean f7801d;

        /* renamed from: e */
        public final long f7802e;

        /* renamed from: f */
        public final List<C4033b> f7803f;

        /* renamed from: g */
        public final boolean f7804g;

        /* renamed from: h */
        public final long f7805h;

        /* renamed from: i */
        public final int f7806i;

        /* renamed from: j */
        public final int f7807j;

        /* renamed from: k */
        public final int f7808k;

        public C4034c(long j, boolean z, boolean z2, boolean z3, List<C4033b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f7798a = j;
            this.f7799b = z;
            this.f7800c = z2;
            this.f7801d = z3;
            this.f7803f = Collections.unmodifiableList(list);
            this.f7802e = j2;
            this.f7804g = z4;
            this.f7805h = j3;
            this.f7806i = i;
            this.f7807j = i2;
            this.f7808k = i3;
        }

        /* renamed from: d */
        public static C4034c m10529d(Parcel parcel) {
            return new C4034c(parcel);
        }

        /* renamed from: e */
        public static C4034c m10530e(C3173t tVar) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long A = tVar.mo19995A();
            boolean z5 = (tVar.mo20032y() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int y = tVar.mo20032y();
                boolean z6 = (y & 128) != 0;
                boolean z7 = (y & 64) != 0;
                boolean z8 = (y & 32) != 0;
                long A2 = z7 ? tVar.mo19995A() : -9223372036854775807L;
                if (!z7) {
                    int y2 = tVar.mo20032y();
                    ArrayList arrayList3 = new ArrayList(y2);
                    for (int i4 = 0; i4 < y2; i4++) {
                        arrayList3.add(new C4033b(tVar.mo20032y(), tVar.mo19995A(), (C4032a) null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long y3 = (long) tVar.mo20032y();
                    boolean z9 = (128 & y3) != 0;
                    j3 = ((((y3 & 1) << 32) | tVar.mo19995A()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int E = tVar.mo19999E();
                int y4 = tVar.mo20032y();
                z = z7;
                i = tVar.mo20032y();
                j = j3;
                arrayList = arrayList2;
                long j4 = A2;
                i3 = E;
                i2 = y4;
                j2 = j4;
                boolean z10 = z6;
                z2 = z4;
                z3 = z10;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C4034c(A, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        /* renamed from: f */
        public final void mo24174f(Parcel parcel) {
            parcel.writeLong(this.f7798a);
            parcel.writeByte(this.f7799b ? (byte) 1 : 0);
            parcel.writeByte(this.f7800c ? (byte) 1 : 0);
            parcel.writeByte(this.f7801d ? (byte) 1 : 0);
            int size = this.f7803f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f7803f.get(i).mo24173d(parcel);
            }
            parcel.writeLong(this.f7802e);
            parcel.writeByte(this.f7804g ? (byte) 1 : 0);
            parcel.writeLong(this.f7805h);
            parcel.writeInt(this.f7806i);
            parcel.writeInt(this.f7807j);
            parcel.writeInt(this.f7808k);
        }

        public C4034c(Parcel parcel) {
            this.f7798a = parcel.readLong();
            boolean z = false;
            this.f7799b = parcel.readByte() == 1;
            this.f7800c = parcel.readByte() == 1;
            this.f7801d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C4033b.m10524c(parcel));
            }
            this.f7803f = Collections.unmodifiableList(arrayList);
            this.f7802e = parcel.readLong();
            this.f7804g = parcel.readByte() == 1 ? true : z;
            this.f7805h = parcel.readLong();
            this.f7806i = parcel.readInt();
            this.f7807j = parcel.readInt();
            this.f7808k = parcel.readInt();
        }
    }
}
