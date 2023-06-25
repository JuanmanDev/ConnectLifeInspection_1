package p040c.p200q.p201a.p264c.p275c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import androidx.annotation.NonNull;

/* renamed from: c.q.a.c.c.a */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public interface C3294a extends IInterface {

    /* renamed from: c.q.a.c.c.a$a */
    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    public static class C3295a implements C3294a {

        /* renamed from: e */
        public final IBinder f6140e;

        public C3295a(@NonNull IBinder iBinder) {
            this.f6140e = iBinder;
        }

        @NonNull
        public IBinder asBinder() {
            return this.f6140e;
        }

        /* renamed from: t */
        public void mo20335t(@NonNull Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f6140e.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    /* renamed from: t */
    void mo20335t(@NonNull Message message);
}
