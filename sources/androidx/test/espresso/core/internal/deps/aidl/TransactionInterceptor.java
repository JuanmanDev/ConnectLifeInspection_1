package androidx.test.espresso.core.internal.deps.aidl;

import android.os.Parcel;

public interface TransactionInterceptor {
    boolean interceptTransaction(BaseStub baseStub, int i, Parcel parcel, Parcel parcel2, int i2);
}
