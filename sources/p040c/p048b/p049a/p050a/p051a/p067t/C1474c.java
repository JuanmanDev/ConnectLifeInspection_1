package p040c.p048b.p049a.p050a.p051a.p067t;

import android.content.Context;
import android.os.RemoteException;
import com.amazon.identity.auth.device.AuthError;
import p040c.p048b.p049a.p050a.p051a.p056j.C1379a;
import p040c.p048b.p049a.p050a.p051a.p056j.C1406o;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.t.c */
/* compiled from: LWAServiceWrapper */
public abstract class C1474c<Result> {

    /* renamed from: a */
    public static final String f653a = "c.b.a.a.a.t.c";

    /* renamed from: a */
    public abstract Result mo15142a(Context context, C1379a aVar);

    /* renamed from: b */
    public final Result mo15345b(Context context, C1406o oVar) {
        int i = 0;
        RemoteException e = null;
        while (i <= 3) {
            try {
                C1379a g = oVar.mo15148g(context, i == 3);
                if (g != null) {
                    Result a = mo15142a(context, g);
                    C1406o.m459m(context);
                    return a;
                }
                i++;
            } catch (RemoteException e2) {
                e = e2;
                C1485a.m830c(f653a, "RemoteException", e);
                C1406o.m459m(context);
            }
        }
        if (0 != 0 || e == null) {
            return null;
        }
        throw new AuthError("Service Failure", e, AuthError.ERROR_TYPE.ERROR_THREAD);
    }
}
