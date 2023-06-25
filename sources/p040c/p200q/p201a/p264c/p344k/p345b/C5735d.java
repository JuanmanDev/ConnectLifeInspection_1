package p040c.p200q.p201a.p264c.p344k.p345b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import p040c.p200q.p201a.p264c.p294g.p298d.C3632b;
import p040c.p200q.p201a.p264c.p294g.p298d.C3633c;

/* renamed from: c.q.a.c.k.b.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C5735d extends C3632b implements C5736e {
    public C5735d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: k */
    public final boolean mo20905k(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C3633c.m9178a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C3633c.m9178a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) C3633c.m9178a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C3633c.m9178a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C3633c.m9178a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C3633c.m9178a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo20619A((zak) C3633c.m9178a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C3633c.m9178a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
