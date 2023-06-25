package androidx.test.espresso.remote;

import android.os.IBinder;
import android.view.View;
import androidx.test.espresso.Root;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.ViewAssertion;
import java.util.Map;
import java.util.concurrent.Callable;
import p648m.p657c.C9623e;

public class NoopRemoteInteraction implements RemoteInteraction {
    public Callable<Void> createRemoteCheckCallable(C9623e<Root> eVar, C9623e<View> eVar2, Map<String, IBinder> map, ViewAssertion viewAssertion) {
        return new Callable<Void>(this) {
            public Void call() {
                throw new NoRemoteEspressoInstanceException("No remote instances available");
            }
        };
    }

    public Callable<Void> createRemotePerformCallable(C9623e<Root> eVar, C9623e<View> eVar2, Map<String, IBinder> map, ViewAction... viewActionArr) {
        return new Callable<Void>(this) {
            public Void call() {
                throw new NoRemoteEspressoInstanceException("No remote instances available");
            }
        };
    }

    public boolean isRemoteProcess() {
        return false;
    }
}
