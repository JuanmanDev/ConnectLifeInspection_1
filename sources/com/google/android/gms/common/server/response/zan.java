package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p287b.C3544c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C3544c();

    /* renamed from: e */
    public final int f8333e;

    /* renamed from: l */
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f8334l;

    /* renamed from: m */
    public final String f8335m;

    public zan(int i, ArrayList<zal> arrayList, String str) {
        this.f8333e = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f8328l;
            HashMap hashMap2 = new HashMap();
            ArrayList<zam> arrayList2 = zal.f8329m;
            C3495o.m8908j(arrayList2);
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f8329m.get(i3);
                hashMap2.put(zam.f8331l, zam.f8332m);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f8334l = hashMap;
        C3495o.m8908j(str);
        this.f8335m = str;
        mo24647R();
    }

    /* renamed from: P */
    public final String mo24645P() {
        return this.f8335m;
    }

    @Nullable
    /* renamed from: Q */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo24646Q(String str) {
        return this.f8334l.get(str);
    }

    /* renamed from: R */
    public final void mo24647R() {
        for (String str : this.f8334l.keySet()) {
            Map map = this.f8334l.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo24633b0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f8334l.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f8334l.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8333e);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f8334l.keySet()) {
            arrayList.add(new zal(next, this.f8334l.get(next)));
        }
        C3514a.m8974w(parcel, 2, arrayList, false);
        C3514a.m8970s(parcel, 3, this.f8335m, false);
        C3514a.m8953b(parcel, a);
    }
}
