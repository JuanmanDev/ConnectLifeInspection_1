package p040c.p200q.p201a.p264c.p267b.p268a.p273h.p274e;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p040c.p200q.p201a.p264c.p294g.p296b.C3613c;
import p040c.p200q.p201a.p264c.p294g.p296b.C3615e;

/* renamed from: c.q.a.c.b.a.h.e.r */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C3275r extends C3613c implements C3272o {
    public C3275r() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: d */
    public final boolean mo20312d(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                mo20296E((GoogleSignInAccount) C3615e.m9159a(parcel, GoogleSignInAccount.CREATOR), (Status) C3615e.m9159a(parcel, Status.CREATOR));
                throw null;
            case 102:
                mo20297m((Status) C3615e.m9159a(parcel, Status.CREATOR));
                break;
            case 103:
                mo20298x((Status) C3615e.m9159a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
