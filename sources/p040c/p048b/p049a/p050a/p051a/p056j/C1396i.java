package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.amazon.identity.auth.device.AuthError;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.i */
/* compiled from: MAPServiceConnection */
public abstract class C1396i<T> implements ServiceConnection {

    /* renamed from: m */
    public static final String f464m = C1396i.class.getName();

    /* renamed from: e */
    public IInterface f465e = null;

    /* renamed from: l */
    public C1382b f466l;

    /* renamed from: a */
    public abstract IInterface mo15130a(IBinder iBinder);

    /* renamed from: b */
    public abstract Class<T> mo15131b();

    /* renamed from: c */
    public boolean mo15132c(IBinder iBinder) {
        try {
            return iBinder.getInterfaceDescriptor().equals(mo15131b().getName());
        } catch (Exception e) {
            String str = f464m;
            C1485a.m830c(str, "" + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: d */
    public void mo15133d(C1382b bVar) {
        if (bVar != null) {
            this.f466l = bVar;
            return;
        }
        throw new IllegalArgumentException("listener cannot be null!");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1485a.m832e(f464m, "onServiceConnected called");
        if (mo15132c(iBinder)) {
            IInterface a = mo15130a(iBinder);
            this.f465e = a;
            this.f466l.mo15107b(a);
            return;
        }
        this.f466l.mo15106a(new AuthError("Returned service's interface doesn't match authorization service", AuthError.ERROR_TYPE.ERROR_UNKNOWN));
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C1485a.m832e(f464m, "onServiceDisconnected called");
        this.f465e = null;
    }
}
