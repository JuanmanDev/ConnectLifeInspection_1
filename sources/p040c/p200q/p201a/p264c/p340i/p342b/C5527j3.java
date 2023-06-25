package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* renamed from: c.q.a.c.i.b.j3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5527j3 {
    @NonNull

    /* renamed from: a */
    public final String f10583a;
    @NonNull

    /* renamed from: b */
    public final String f10584b;

    /* renamed from: c */
    public final long f10585c;
    @NonNull

    /* renamed from: d */
    public final Bundle f10586d;

    public C5527j3(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f10583a = str;
        this.f10584b = str2;
        this.f10586d = bundle;
        this.f10585c = j;
    }

    /* renamed from: b */
    public static C5527j3 m15794b(zzaw zzaw) {
        return new C5527j3(zzaw.f14899e, zzaw.f14901m, zzaw.f14900l.mo33658R(), zzaw.f14902n);
    }

    /* renamed from: a */
    public final zzaw mo28354a() {
        return new zzaw(this.f10583a, new zzau(new Bundle(this.f10586d)), this.f10584b, this.f10585c);
    }

    public final String toString() {
        String str = this.f10584b;
        String str2 = this.f10583a;
        String obj = this.f10586d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
