package androidx.test.orchestrator.instrumentationlistener;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.test.orchestrator.callback.OrchestratorCallback;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import androidx.test.orchestrator.listeners.OrchestrationListenerManager;
import java.util.Iterator;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import p648m.p668e.p677l.p679h.C9757a;

public final class OrchestratedInstrumentationListener extends C9757a {
    public static final String ODO_SERVICE_PACKAGE = "androidx.test.orchestrator.OrchestratorService";
    public static final String ORCHESTRATOR_PACKAGE = "androidx.test.orchestrator";
    public static final String TAG = "OrchestrationListener";
    public final ServiceConnection connection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OrchestratedInstrumentationListener.this.odoCallback = OrchestratorCallback.Stub.asInterface(iBinder);
            OrchestratedInstrumentationListener.this.listener.onOrchestratorConnect();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            OrchestratedInstrumentationListener.this.odoCallback = null;
        }
    };
    public final OnConnectListener listener;
    public OrchestratorCallback odoCallback;

    public interface OnConnectListener {
        void onOrchestratorConnect();
    }

    public OrchestratedInstrumentationListener(OnConnectListener onConnectListener) {
        this.listener = onConnectListener;
    }

    public void addTest(String str) {
        OrchestratorCallback orchestratorCallback = this.odoCallback;
        if (orchestratorCallback != null) {
            try {
                orchestratorCallback.addTest(str);
            } catch (RemoteException unused) {
            }
        } else {
            throw new IllegalStateException("Unable to send test, callback is null");
        }
    }

    public void addTests(Description description) {
        if (!description.isEmpty()) {
            if (description.isTest()) {
                String className = description.getClassName();
                String methodName = description.getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(className).length() + 1 + String.valueOf(methodName).length());
                sb.append(className);
                sb.append("#");
                sb.append(methodName);
                addTest(sb.toString());
                return;
            }
            Iterator<Description> it = description.getChildren().iterator();
            while (it.hasNext()) {
                addTests(it.next());
            }
        }
    }

    public void connect(Context context) {
        Intent intent = new Intent(ODO_SERVICE_PACKAGE);
        intent.setPackage(ORCHESTRATOR_PACKAGE);
        if (!context.bindService(intent, this.connection, 1)) {
            throw new RuntimeException("Cannot connect to androidx.test.orchestrator.OrchestratorService");
        }
    }

    public void sendTestNotification(OrchestrationListenerManager.TestEvent testEvent, Bundle bundle) {
        if (this.odoCallback != null) {
            bundle.putString(OrchestrationListenerManager.KEY_TEST_EVENT, testEvent.toString());
            this.odoCallback.sendTestNotification(bundle);
            return;
        }
        throw new IllegalStateException("Unable to send notification, callback is null");
    }

    public void testAssumptionFailure(Failure failure) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_ASSUMPTION_FAILURE, BundleJUnitUtils.getBundleFromFailure(failure));
        } catch (RemoteException e) {
            throw new IllegalStateException("Unable to send TestAssumptionFailure status, terminating", e);
        }
    }

    public void testFailure(Failure failure) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_FAILURE, BundleJUnitUtils.getBundleFromFailure(failure));
        } catch (RemoteException e) {
            throw new IllegalStateException("Unable to send TestFailure status, terminating", e);
        }
    }

    public void testFinished(Description description) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_FINISHED, BundleJUnitUtils.getBundleFromDescription(description));
        } catch (RemoteException unused) {
        }
    }

    public void testIgnored(Description description) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_IGNORED, BundleJUnitUtils.getBundleFromDescription(description));
        } catch (RemoteException unused) {
        }
    }

    public void testRunFinished(Result result) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_RUN_FINISHED, BundleJUnitUtils.getBundleFromResult(result));
        } catch (RemoteException unused) {
        }
    }

    public void testRunStarted(Description description) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_RUN_STARTED, BundleJUnitUtils.getBundleFromDescription(description));
        } catch (RemoteException unused) {
        }
    }

    public void testStarted(Description description) {
        try {
            sendTestNotification(OrchestrationListenerManager.TestEvent.TEST_STARTED, BundleJUnitUtils.getBundleFromDescription(description));
        } catch (RemoteException unused) {
        }
    }
}
