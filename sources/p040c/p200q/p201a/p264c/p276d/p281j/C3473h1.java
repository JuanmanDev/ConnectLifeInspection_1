package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: c.q.a.c.d.j.h1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3473h1 extends C3508s0 {

    /* renamed from: g */
    public final /* synthetic */ C3453d f6470g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C3473h1(C3453d dVar, @Nullable int i, Bundle bundle) {
        super(dVar, i, (Bundle) null);
        this.f6470g = dVar;
    }

    /* renamed from: f */
    public final void mo20724f(ConnectionResult connectionResult) {
        if (!this.f6470g.mo20679r() || !C3453d.m8769f0(this.f6470g)) {
            this.f6470g.f6424t.mo20564a(connectionResult);
            this.f6470g.mo20654J(connectionResult);
            return;
        }
        C3453d.m8766b0(this.f6470g, 16);
    }

    /* renamed from: g */
    public final boolean mo20725g() {
        this.f6470g.f6424t.mo20564a(ConnectionResult.f8152o);
        return true;
    }
}
