package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C4029a();

    /* renamed from: e */
    public final long f7779e;

    /* renamed from: l */
    public final boolean f7780l;

    /* renamed from: m */
    public final boolean f7781m;

    /* renamed from: n */
    public final boolean f7782n;

    /* renamed from: o */
    public final boolean f7783o;

    /* renamed from: p */
    public final long f7784p;

    /* renamed from: q */
    public final long f7785q;

    /* renamed from: r */
    public final List<C4030b> f7786r;

    /* renamed from: s */
    public final boolean f7787s;

    /* renamed from: t */
    public final long f7788t;

    /* renamed from: u */
    public final int f7789u;

    /* renamed from: v */
    public final int f7790v;

    /* renamed from: w */
    public final int f7791w;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static class C4029a implements Parcelable.Creator<SpliceInsertCommand> {
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, (C4029a) null);
        }

        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    public static final class C4030b {

        /* renamed from: a */
        public final int f7792a;

        /* renamed from: b */
        public final long f7793b;

        /* renamed from: c */
        public final long f7794c;

        public /* synthetic */ C4030b(int i, long j, long j2, C4029a aVar) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C4030b m10515a(Parcel parcel) {
            return new C4030b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void mo24162b(Parcel parcel) {
            parcel.writeInt(this.f7792a);
            parcel.writeLong(this.f7793b);
            parcel.writeLong(this.f7794c);
        }

        public C4030b(int i, long j, long j2) {
            this.f7792a = i;
            this.f7793b = j;
            this.f7794c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C4029a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceInsertCommand m10512a(C3173t tVar, long j, C3146b0 b0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        C3146b0 b0Var2 = b0Var;
        long A = tVar.mo19995A();
        boolean z6 = (tVar.mo20032y() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int y = tVar.mo20032y();
            boolean z7 = (y & 128) != 0;
            boolean z8 = (y & 64) != 0;
            boolean z9 = (y & 32) != 0;
            boolean z10 = (y & 16) != 0;
            long b = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m10533b(tVar, j);
            if (!z8) {
                int y2 = tVar.mo20032y();
                ArrayList arrayList = new ArrayList(y2);
                for (int i4 = 0; i4 < y2; i4++) {
                    int y3 = tVar.mo20032y();
                    long b2 = !z10 ? TimeSignalCommand.m10533b(tVar, j) : -9223372036854775807L;
                    arrayList.add(new C4030b(y3, b2, b0Var2.mo19944b(b2), (C4029a) null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long y4 = (long) tVar.mo20032y();
                boolean z11 = (128 & y4) != 0;
                j4 = ((((y4 & 1) << 32) | tVar.mo19995A()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = tVar.mo19999E();
            z = z8;
            i2 = tVar.mo20032y();
            i = tVar.mo20032y();
            list = emptyList;
            long j5 = b;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
            j3 = j5;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new SpliceInsertCommand(A, z6, z4, z, z3, j3, b0Var2.mo19944b(j3), list, z2, j2, i3, i2, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7779e);
        parcel.writeByte(this.f7780l ? (byte) 1 : 0);
        parcel.writeByte(this.f7781m ? (byte) 1 : 0);
        parcel.writeByte(this.f7782n ? (byte) 1 : 0);
        parcel.writeByte(this.f7783o ? (byte) 1 : 0);
        parcel.writeLong(this.f7784p);
        parcel.writeLong(this.f7785q);
        int size = this.f7786r.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f7786r.get(i2).mo24162b(parcel);
        }
        parcel.writeByte(this.f7787s ? (byte) 1 : 0);
        parcel.writeLong(this.f7788t);
        parcel.writeInt(this.f7789u);
        parcel.writeInt(this.f7790v);
        parcel.writeInt(this.f7791w);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C4030b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f7779e = j;
        this.f7780l = z;
        this.f7781m = z2;
        this.f7782n = z3;
        this.f7783o = z4;
        this.f7784p = j2;
        this.f7785q = j3;
        this.f7786r = Collections.unmodifiableList(list);
        this.f7787s = z5;
        this.f7788t = j4;
        this.f7789u = i;
        this.f7790v = i2;
        this.f7791w = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f7779e = parcel.readLong();
        boolean z = false;
        this.f7780l = parcel.readByte() == 1;
        this.f7781m = parcel.readByte() == 1;
        this.f7782n = parcel.readByte() == 1;
        this.f7783o = parcel.readByte() == 1;
        this.f7784p = parcel.readLong();
        this.f7785q = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C4030b.m10515a(parcel));
        }
        this.f7786r = Collections.unmodifiableList(arrayList);
        this.f7787s = parcel.readByte() == 1 ? true : z;
        this.f7788t = parcel.readLong();
        this.f7789u = parcel.readInt();
        this.f7790v = parcel.readInt();
        this.f7791w = parcel.readInt();
    }
}
