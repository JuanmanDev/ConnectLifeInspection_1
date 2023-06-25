package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3351e;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3362b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class AvailabilityException extends Exception {
    public final ArrayMap<C3362b<?>, ConnectionResult> zaa;

    public AvailabilityException(@NonNull ArrayMap<C3362b<?>, ConnectionResult> arrayMap) {
        this.zaa = arrayMap;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull C3345c<? extends C3334a.C3338d> cVar) {
        C3362b<? extends C3334a.C3338d> b = cVar.mo20434b();
        boolean z = this.zaa.get(b) != null;
        String b2 = b.mo20463b();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 58);
        sb.append("The given API (");
        sb.append(b2);
        sb.append(") was not part of the availability request.");
        C3495o.m8900b(z, sb.toString());
        ConnectionResult connectionResult = this.zaa.get(b);
        C3495o.m8908j(connectionResult);
        return connectionResult;
    }

    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C3362b next : this.zaa.keySet()) {
            ConnectionResult connectionResult = this.zaa.get(next);
            C3495o.m8908j(connectionResult);
            ConnectionResult connectionResult2 = connectionResult;
            z &= !connectionResult2.mo24487T();
            String b = next.mo20463b();
            String valueOf = String.valueOf(connectionResult2);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + String.valueOf(valueOf).length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull C3351e<? extends C3334a.C3338d> eVar) {
        C3362b<? extends C3334a.C3338d> b = eVar.mo20434b();
        boolean z = this.zaa.get(b) != null;
        String b2 = b.mo20463b();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 58);
        sb.append("The given API (");
        sb.append(b2);
        sb.append(") was not part of the availability request.");
        C3495o.m8900b(z, sb.toString());
        ConnectionResult connectionResult = this.zaa.get(b);
        C3495o.m8908j(connectionResult);
        return connectionResult;
    }
}
