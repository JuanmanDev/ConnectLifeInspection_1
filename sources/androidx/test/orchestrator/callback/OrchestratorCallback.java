package androidx.test.orchestrator.callback;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.test.runner.internal.deps.aidl.BaseProxy;
import androidx.test.runner.internal.deps.aidl.BaseStub;
import androidx.test.runner.internal.deps.aidl.Codecs;

public interface OrchestratorCallback extends IInterface {

    public static abstract class Stub extends BaseStub implements OrchestratorCallback {
        public static final String DESCRIPTOR = "androidx.test.orchestrator.callback.OrchestratorCallback";
        public static final int TRANSACTION_addTest = 1;
        public static final int TRANSACTION_sendTestNotification = 2;

        public static class Proxy extends BaseProxy implements OrchestratorCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public void addTest(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            public void sendTestNotification(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                Codecs.writeParcelable(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static OrchestratorCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof OrchestratorCallback) {
                return (OrchestratorCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                addTest(parcel.readString());
            } else if (i != 2) {
                return false;
            } else {
                sendTestNotification((Bundle) Codecs.createParcelable(parcel, Bundle.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addTest(String str);

    void sendTestNotification(Bundle bundle);
}
