package androidx.test.rule;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runner.Description;
import p648m.p668e.p676k.C9741c;
import p648m.p668e.p680m.p681d.C9785g;

@Beta
public class ServiceTestRule implements C9741c {
    public static final long DEFAULT_TIMEOUT = 5;
    public static final String TAG = "ServiceTestRule";
    public IBinder binder;
    public boolean serviceBound;
    public ServiceConnection serviceConn;
    public Intent serviceIntent;
    public boolean serviceStarted;
    public TimeUnit timeUnit;
    public long timeout;

    public class ProxyServiceConnection implements ServiceConnection {
        public ServiceConnection callerConnection;
        public CountDownLatch connectedLatch;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder unused = ServiceTestRule.this.binder = iBinder;
            ServiceConnection serviceConnection = this.callerConnection;
            if (serviceConnection != null) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.connectedLatch.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            IBinder unused = ServiceTestRule.this.binder = null;
            ServiceConnection serviceConnection = this.callerConnection;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(componentName);
            }
        }

        public ProxyServiceConnection(ServiceConnection serviceConnection) {
            this.connectedLatch = new CountDownLatch(1);
            this.callerConnection = serviceConnection;
        }
    }

    public class ServiceStatement extends C9785g {
        public final C9785g base;

        public ServiceStatement(C9785g gVar) {
            this.base = gVar;
        }

        public void evaluate() {
            try {
                ServiceTestRule.this.beforeService();
                this.base.evaluate();
            } finally {
                ServiceTestRule.this.shutdownService();
                ServiceTestRule.this.afterService();
            }
        }
    }

    public ServiceTestRule() {
        this(5, TimeUnit.SECONDS);
    }

    private void waitOnLatch(CountDownLatch countDownLatch, String str) {
        try {
            if (!countDownLatch.await(this.timeout, this.timeUnit)) {
                long j = this.timeout;
                String name = this.timeUnit.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 56 + String.valueOf(str).length());
                sb.append("Waited for ");
                sb.append(j);
                sb.append(" ");
                sb.append(name);
                sb.append(", but service was never ");
                sb.append(str);
                throw new TimeoutException(sb.toString());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "Interrupted while waiting for service to be ".concat(valueOf) : new String("Interrupted while waiting for service to be "), e);
        }
    }

    public static ServiceTestRule withTimeout(long j, TimeUnit timeUnit2) {
        return new ServiceTestRule(j, timeUnit2);
    }

    public void afterService() {
    }

    public C9785g apply(C9785g gVar, Description description) {
        return new ServiceStatement(gVar);
    }

    public void beforeService() {
    }

    public IBinder bindService(@NonNull Intent intent) {
        this.serviceIntent = ((Intent) Checks.checkNotNull(intent, "intent can't be null")).cloneFilter();
        this.serviceBound = bindServiceAndWait(intent, (ServiceConnection) null, 1);
        return this.binder;
    }

    @VisibleForTesting
    public boolean bindServiceAndWait(Intent intent, ServiceConnection serviceConnection, int i) {
        ProxyServiceConnection proxyServiceConnection = new ProxyServiceConnection(serviceConnection);
        boolean bindService = InstrumentationRegistry.getInstrumentation().getTargetContext().bindService(intent, proxyServiceConnection, i);
        if (bindService) {
            waitOnLatch(proxyServiceConnection.connectedLatch, "connected");
            this.serviceConn = proxyServiceConnection;
        }
        return bindService;
    }

    @VisibleForTesting
    public void shutdownService() {
        if (this.serviceStarted) {
            InstrumentationRegistry.getInstrumentation().getTargetContext().stopService(this.serviceIntent);
            this.serviceStarted = false;
        }
        unbindService();
    }

    public void startService(@NonNull Intent intent) {
        this.serviceIntent = (Intent) Checks.checkNotNull(intent, "intent can't be null");
        InstrumentationRegistry.getInstrumentation().getTargetContext().startService(this.serviceIntent);
        this.serviceStarted = true;
        this.serviceBound = bindServiceAndWait(this.serviceIntent, (ServiceConnection) null, 1);
    }

    public void unbindService() {
        if (this.serviceBound) {
            InstrumentationRegistry.getInstrumentation().getTargetContext().unbindService(this.serviceConn);
            this.binder = null;
            this.serviceBound = false;
        }
    }

    public ServiceTestRule(long j, TimeUnit timeUnit2) {
        this.serviceStarted = false;
        this.serviceBound = false;
        this.timeout = j;
        this.timeUnit = timeUnit2;
    }

    public IBinder bindService(@NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        this.serviceIntent = ((Intent) Checks.checkNotNull(intent, "intent can't be null")).cloneFilter();
        this.serviceBound = bindServiceAndWait(this.serviceIntent, (ServiceConnection) Checks.checkNotNull(serviceConnection, "connection can't be null"), i);
        return this.binder;
    }
}
