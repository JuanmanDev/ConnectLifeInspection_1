package p040c.p200q.p201a.p264c.p340i.p342b;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzcl;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5694x5 {

    /* renamed from: a */
    public final Context f11097a;
    @Nullable

    /* renamed from: b */
    public String f11098b;
    @Nullable

    /* renamed from: c */
    public String f11099c;
    @Nullable

    /* renamed from: d */
    public String f11100d;
    @Nullable

    /* renamed from: e */
    public Boolean f11101e;

    /* renamed from: f */
    public long f11102f;
    @Nullable

    /* renamed from: g */
    public zzcl f11103g;

    /* renamed from: h */
    public boolean f11104h = true;
    @Nullable

    /* renamed from: i */
    public final Long f11105i;
    @Nullable

    /* renamed from: j */
    public String f11106j;

    public C5694x5(Context context, @Nullable zzcl zzcl, @Nullable Long l) {
        C3495o.m8908j(context);
        Context applicationContext = context.getApplicationContext();
        C3495o.m8908j(applicationContext);
        this.f11097a = applicationContext;
        this.f11105i = l;
        if (zzcl != null) {
            this.f11103g = zzcl;
            this.f11098b = zzcl.f14810p;
            this.f11099c = zzcl.f14809o;
            this.f11100d = zzcl.f14808n;
            this.f11104h = zzcl.f14807m;
            this.f11102f = zzcl.f14806l;
            this.f11106j = zzcl.f14812r;
            Bundle bundle = zzcl.f14811q;
            if (bundle != null) {
                this.f11101e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
