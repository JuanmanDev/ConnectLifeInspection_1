package p040c.p200q.p201a.p264c.p276d.p281j;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.zzj;

/* renamed from: c.q.a.c.d.j.e1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3464e1 extends C3512t0 {
    @Nullable

    /* renamed from: e */
    public C3453d f6450e;

    /* renamed from: l */
    public final int f6451l;

    public C3464e1(@NonNull C3453d dVar, int i) {
        this.f6450e = dVar;
        this.f6451l = i;
    }

    @BinderThread
    /* renamed from: C */
    public final void mo20713C(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @BinderThread
    /* renamed from: K */
    public final void mo20714K(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        C3495o.m8909k(this.f6450e, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f6450e.mo20656L(i, iBinder, bundle, this.f6451l);
        this.f6450e = null;
    }

    @BinderThread
    /* renamed from: N */
    public final void mo20715N(int i, @NonNull IBinder iBinder, @NonNull zzj zzj) {
        C3453d dVar = this.f6450e;
        C3495o.m8909k(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C3495o.m8908j(zzj);
        C3453d.m8765a0(dVar, zzj);
        mo20714K(i, iBinder, zzj.f8294e);
    }
}
