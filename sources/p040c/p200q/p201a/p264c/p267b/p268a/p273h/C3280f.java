package p040c.p200q.p201a.p264c.p267b.p268a.p273h;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: c.q.a.c.b.a.h.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C3280f implements Comparator {

    /* renamed from: e */
    public static final /* synthetic */ C3280f f6138e = new C3280f();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo24526P().compareTo(((Scope) obj2).mo24526P());
    }
}
