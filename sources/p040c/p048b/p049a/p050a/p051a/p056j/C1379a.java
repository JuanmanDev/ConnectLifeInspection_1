package p040c.p048b.p049a.p050a.p051a.p056j;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.b.a.a.a.j.a */
/* compiled from: AmazonAuthorizationServiceInterface */
public interface C1379a extends IInterface {

    /* renamed from: c.b.a.a.a.j.a$a */
    /* compiled from: AmazonAuthorizationServiceInterface */
    public static abstract class C1380a extends Binder implements C1379a {

        /* renamed from: c.b.a.a.a.j.a$a$a */
        /* compiled from: AmazonAuthorizationServiceInterface */
        public static class C1381a implements C1379a {

            /* renamed from: l */
            public static C1379a f415l;

            /* renamed from: e */
            public IBinder f416e;

            public C1381a(IBinder iBinder) {
                this.f416e = iBinder;
            }

            /* renamed from: X */
            public Bundle mo15103X(Bundle bundle, String str, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.identity.auth.device.authorization.AmazonAuthorizationServiceInterface");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f416e.transact(1, obtain, obtain2, 0) && C1380a.m358e() != null) {
                        return C1380a.m358e().mo15103X(bundle, str, strArr);
                    }
                    obtain2.readException();
                    Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f416e;
            }

            /* renamed from: o */
            public Bundle mo15104o(Bundle bundle, String str, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.identity.auth.device.authorization.AmazonAuthorizationServiceInterface");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.f416e.transact(2, obtain, obtain2, 0) && C1380a.m358e() != null) {
                        return C1380a.m358e().mo15104o(bundle, str, strArr);
                    }
                    obtain2.readException();
                    Bundle bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: d */
        public static C1379a m357d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.identity.auth.device.authorization.AmazonAuthorizationServiceInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1379a)) {
                return new C1381a(iBinder);
            }
            return (C1379a) queryLocalInterface;
        }

        /* renamed from: e */
        public static C1379a m358e() {
            return C1381a.f415l;
        }
    }

    /* renamed from: X */
    Bundle mo15103X(Bundle bundle, String str, String[] strArr);

    /* renamed from: o */
    Bundle mo15104o(Bundle bundle, String str, String[] strArr);
}
