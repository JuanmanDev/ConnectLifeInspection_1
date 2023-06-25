package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: c.q.a.c.d.j.s0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3508s0 extends C3460d1 {

    /* renamed from: d */
    public final int f6507d;
    @Nullable

    /* renamed from: e */
    public final Bundle f6508e;

    /* renamed from: f */
    public final /* synthetic */ C3453d f6509f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C3508s0(C3453d dVar, @Nullable int i, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        this.f6509f = dVar;
        this.f6507d = i;
        this.f6508e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo20691a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f6507d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo20725g()
            if (r3 != 0) goto L_0x001b
            c.q.a.c.d.j.d r3 = r2.f6509f
            r3.mo20671g0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.mo20724f(r3)
        L_0x001b:
            return
        L_0x001c:
            c.q.a.c.d.j.d r3 = r2.f6509f
            r3.mo20671g0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f6508e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f6507d
            r3.<init>(r0, r1)
            r2.mo20724f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3508s0.mo20691a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo20692b() {
    }

    /* renamed from: f */
    public abstract void mo20724f(ConnectionResult connectionResult);

    /* renamed from: g */
    public abstract boolean mo20725g();
}
