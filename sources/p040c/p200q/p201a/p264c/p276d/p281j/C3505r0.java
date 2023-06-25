package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.RemoteCreator;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* renamed from: c.q.a.c.d.j.r0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3505r0 extends RemoteCreator<C3476i0> {

    /* renamed from: c */
    public static final C3505r0 f6499c = new C3505r0();

    public C3505r0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m8930c(Context context, int i, int i2) {
        C3505r0 r0Var = f6499c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) C3587b.m9123g(((C3476i0) r0Var.mo24663b(context)).mo20736v(C3587b.m9124k(context), zax));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20781a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof C3476i0 ? (C3476i0) queryLocalInterface : new C3476i0(iBinder);
    }
}
