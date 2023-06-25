package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: c.q.a.c.d.j.g1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3470g1 extends C3508s0 {
    @Nullable

    /* renamed from: g */
    public final IBinder f6464g;

    /* renamed from: h */
    public final /* synthetic */ C3453d f6465h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @BinderThread
    public C3470g1(C3453d dVar, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(dVar, i, bundle);
        this.f6465h = dVar;
        this.f6464g = iBinder;
    }

    /* renamed from: f */
    public final void mo20724f(ConnectionResult connectionResult) {
        if (this.f6465h.f6430z != null) {
            this.f6465h.f6430z.mo20690e(connectionResult);
        }
        this.f6465h.mo20654J(connectionResult);
    }

    /* renamed from: g */
    public final boolean mo20725g() {
        try {
            IBinder iBinder = this.f6464g;
            C3495o.m8908j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f6465h.mo20300C().equals(interfaceDescriptor)) {
                "service descriptor mismatch: " + this.f6465h.mo20300C() + " vs. " + interfaceDescriptor;
                return false;
            }
            IInterface q = this.f6465h.mo20304q(this.f6464g);
            if (q == null) {
                return false;
            }
            if (!C3453d.m8768e0(this.f6465h, 2, 4, q) && !C3453d.m8768e0(this.f6465h, 3, 4, q)) {
                return false;
            }
            this.f6465h.f6411D = null;
            Bundle v = this.f6465h.mo20683v();
            C3453d dVar = this.f6465h;
            if (dVar.f6429y != null) {
                dVar.f6429y.mo20689g(v);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
