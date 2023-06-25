package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: c.q.a.c.g.i.p0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5211p0 {

    /* renamed from: a */
    public static final ClassLoader f10050a = C5211p0.class.getClassLoader();

    /* renamed from: a */
    public static Parcelable m14615a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m14616b(Parcel parcel) {
        return parcel.readHashMap(f10050a);
    }

    /* renamed from: c */
    public static void m14617c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m14618d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m14619e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m14620f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: g */
    public static boolean m14621g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
