package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;
import p040c.p200q.p201a.p264c.p294g.p335i.C5196o0;
import p040c.p200q.p201a.p264c.p294g.p335i.C5211p0;

/* renamed from: c.q.a.c.i.b.w2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class C5680w2 extends C5196o0 implements C5691x2 {
    public C5680w2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: d */
    public final boolean mo27139d(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C5211p0.m14617c(parcel);
                mo28448H((zzaw) C5211p0.m14615a(parcel, zzaw.CREATOR), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                C5211p0.m14617c(parcel);
                mo28453P((zzkw) C5211p0.m14615a(parcel, zzkw.CREATOR), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                C5211p0.m14617c(parcel);
                mo28449I((zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C5211p0.m14617c(parcel);
                mo28452O((zzaw) C5211p0.m14615a(parcel, zzaw.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                C5211p0.m14617c(parcel);
                mo28464l((zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean g = C5211p0.m14621g(parcel);
                C5211p0.m14617c(parcel);
                List s = mo28468s((zzq) C5211p0.m14615a(parcel, zzq.CREATOR), g);
                parcel2.writeNoException();
                parcel2.writeTypedList(s);
                return true;
            case 9:
                String readString3 = parcel.readString();
                C5211p0.m14617c(parcel);
                byte[] u = mo28469u((zzaw) C5211p0.m14615a(parcel, zzaw.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(u);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                C5211p0.m14617c(parcel);
                mo28451L(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                C5211p0.m14617c(parcel);
                String y = mo28471y((zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(y);
                return true;
            case 12:
                C5211p0.m14617c(parcel);
                mo28457W((zzac) C5211p0.m14615a(parcel, zzac.CREATOR), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                C5211p0.m14617c(parcel);
                mo28467q((zzac) C5211p0.m14615a(parcel, zzac.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                C5211p0.m14617c(parcel);
                List T = mo28455T(parcel.readString(), parcel.readString(), C5211p0.m14621g(parcel), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(T);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean g2 = C5211p0.m14621g(parcel);
                C5211p0.m14617c(parcel);
                List p = mo28466p(readString7, readString8, readString9, g2);
                parcel2.writeNoException();
                parcel2.writeTypedList(p);
                return true;
            case 16:
                C5211p0.m14617c(parcel);
                List J = mo28450J(parcel.readString(), parcel.readString(), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(J);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C5211p0.m14617c(parcel);
                List B = mo28447B(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(B);
                return true;
            case 18:
                C5211p0.m14617c(parcel);
                mo28456V((zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                C5211p0.m14617c(parcel);
                mo28465n((Bundle) C5211p0.m14615a(parcel, Bundle.CREATOR), (zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                C5211p0.m14617c(parcel);
                mo28454S((zzq) C5211p0.m14615a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
