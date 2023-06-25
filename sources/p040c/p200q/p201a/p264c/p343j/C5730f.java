package p040c.p200q.p201a.p264c.p343j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.safetynet.SafeBrowsingData;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* renamed from: c.q.a.c.j.f */
public final class C5730f implements Parcelable.Creator<SafeBrowsingData> {
    /* renamed from: a */
    public static void m16330a(SafeBrowsingData safeBrowsingData, Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 2, safeBrowsingData.mo33675S(), false);
        C3514a.m8968q(parcel, 3, safeBrowsingData.mo33672P(), i, false);
        C3514a.m8968q(parcel, 4, safeBrowsingData.mo33673Q(), i, false);
        C3514a.m8965n(parcel, 5, safeBrowsingData.mo33674R());
        C3514a.m8957f(parcel, 6, safeBrowsingData.mo33676T(), false);
        C3514a.m8953b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10946J(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r7 = r6
            r10 = r7
            r8 = r2
        L_0x000c:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0050
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10938B(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10969u(r1)
            r3 = 2
            if (r2 == r3) goto L_0x004b
            r3 = 3
            if (r2 == r3) goto L_0x0041
            r3 = 4
            if (r2 == r3) goto L_0x0037
            r3 = 5
            if (r2 == r3) goto L_0x0032
            r3 = 6
            if (r2 == r3) goto L_0x002d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10945I(r12, r1)
            goto L_0x000c
        L_0x002d:
            byte[] r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10955g(r12, r1)
            goto L_0x000c
        L_0x0032:
            long r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10941E(r12, r1)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10962n(r12, r1, r2)
            r7 = r1
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            goto L_0x000c
        L_0x0041:
            android.os.Parcelable$Creator<com.google.android.gms.common.data.DataHolder> r2 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10962n(r12, r1, r2)
            r6 = r1
            com.google.android.gms.common.data.DataHolder r6 = (com.google.android.gms.common.data.DataHolder) r6
            goto L_0x000c
        L_0x004b:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10963o(r12, r1)
            goto L_0x000c
        L_0x0050:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m10968t(r12, r0)
            com.google.android.gms.safetynet.SafeBrowsingData r12 = new com.google.android.gms.safetynet.SafeBrowsingData
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p343j.C5730f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeBrowsingData[i];
    }
}
