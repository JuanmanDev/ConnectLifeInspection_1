package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import p040c.p200q.p201a.p264c.p343j.C5730f;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new C5730f();

    /* renamed from: e */
    public String f14937e;

    /* renamed from: l */
    public DataHolder f14938l;

    /* renamed from: m */
    public ParcelFileDescriptor f14939m;

    /* renamed from: n */
    public long f14940n;

    /* renamed from: o */
    public byte[] f14941o;

    /* renamed from: p */
    public byte[] f14942p;

    /* renamed from: q */
    public File f14943q;

    static {
        Class<SafeBrowsingData> cls = SafeBrowsingData.class;
    }

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.f14937e = str;
        this.f14938l = dataHolder;
        this.f14939m = parcelFileDescriptor;
        this.f14940n = j;
        this.f14941o = bArr;
    }

    /* renamed from: V */
    public static void m22030V(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: P */
    public DataHolder mo33672P() {
        return this.f14938l;
    }

    /* renamed from: Q */
    public ParcelFileDescriptor mo33673Q() {
        return this.f14939m;
    }

    /* renamed from: R */
    public long mo33674R() {
        return this.f14940n;
    }

    /* renamed from: S */
    public String mo33675S() {
        return this.f14937e;
    }

    /* renamed from: T */
    public byte[] mo33676T() {
        return this.f14941o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.FileOutputStream mo33677U() {
        /*
            r5 = this;
            java.io.File r0 = r5.f14943q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch:{ IOException -> 0x002d, all -> 0x0023 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002e, all -> 0x0021 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x002e, all -> 0x0021 }
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch:{ IOException -> 0x002e, all -> 0x0021 }
            r5.f14939m = r3     // Catch:{ IOException -> 0x002e, all -> 0x0021 }
            if (r0 == 0) goto L_0x0020
            r0.delete()
        L_0x0020:
            return r2
        L_0x0021:
            r1 = move-exception
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.delete()
        L_0x002c:
            throw r1
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.delete()
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.mo33677U():java.io.FileOutputStream");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f14939m
            r1 = 1
            if (r0 != 0) goto L_0x0031
            byte[] r0 = r3.f14942p
            if (r0 == 0) goto L_0x0031
            java.io.FileOutputStream r0 = r3.mo33677U()
            if (r0 == 0) goto L_0x0031
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f14942p     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            int r2 = r2.length     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.writeInt(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            byte[] r2 = r3.f14942p     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            r0.write(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0029 }
            m22030V(r0)
            r0 = r1
            goto L_0x0032
        L_0x0029:
            r4 = move-exception
            m22030V(r0)
            throw r4
        L_0x002e:
            m22030V(r0)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r5 = r5 | r1
        L_0x0036:
            p040c.p200q.p201a.p264c.p343j.C5730f.m16330a(r3, r4, r5)
            r4 = 0
            r3.f14939m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }
}
