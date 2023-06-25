package androidx.test.espresso.idling;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.test.espresso.IdlingResource;
import java.util.concurrent.atomic.AtomicInteger;

public final class CountingIdlingResource implements IdlingResource {
    public static final String TAG = "CountingIdlingResource";
    public volatile long becameBusyAt;
    public volatile long becameIdleAt;
    public final AtomicInteger counter;
    public final boolean debugCounting;
    public volatile IdlingResource.ResourceCallback resourceCallback;
    public final String resourceName;

    public CountingIdlingResource(String str) {
        this(str, false);
    }

    public void decrement() {
        int decrementAndGet = this.counter.decrementAndGet();
        if (decrementAndGet == 0) {
            if (this.resourceCallback != null) {
                this.resourceCallback.onTransitionToIdle();
            }
            this.becameIdleAt = SystemClock.uptimeMillis();
        }
        if (this.debugCounting) {
            if (decrementAndGet == 0) {
                String str = this.resourceName;
                long j = this.becameIdleAt - this.becameBusyAt;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                sb.append("Resource: ");
                sb.append(str);
                sb.append(" went idle! (Time spent not idle: ");
                sb.append(j);
                sb.append(")");
                sb.toString();
            } else {
                String str2 = this.resourceName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 51);
                sb2.append("Resource: ");
                sb2.append(str2);
                sb2.append(" in-use-count decremented to: ");
                sb2.append(decrementAndGet);
                sb2.toString();
            }
        }
        if (decrementAndGet <= -1) {
            StringBuilder sb3 = new StringBuilder(50);
            sb3.append("Counter has been corrupted! counterVal=");
            sb3.append(decrementAndGet);
            throw new IllegalStateException(sb3.toString());
        }
    }

    public void dumpStateToLogs() {
        StringBuilder sb = new StringBuilder("Resource: ");
        sb.append(this.resourceName);
        sb.append(" inflight transaction count: ");
        sb.append(this.counter.get());
        if (0 == this.becameBusyAt) {
            sb.append(" and has never been busy!");
            sb.toString();
            return;
        }
        sb.append(" and was last busy at: ");
        sb.append(this.becameBusyAt);
        if (0 == this.becameIdleAt) {
            sb.append(" AND NEVER WENT IDLE!");
            sb.toString();
            return;
        }
        sb.append(" and last went idle at: ");
        sb.append(this.becameIdleAt);
        sb.toString();
    }

    public String getName() {
        return this.resourceName;
    }

    public void increment() {
        int andIncrement = this.counter.getAndIncrement();
        if (andIncrement == 0) {
            this.becameBusyAt = SystemClock.uptimeMillis();
        }
        if (this.debugCounting) {
            String str = this.resourceName;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Resource: ");
            sb.append(str);
            sb.append(" in-use-count incremented to: ");
            sb.append(andIncrement + 1);
            sb.toString();
        }
    }

    public boolean isIdleNow() {
        return this.counter.get() == 0;
    }

    public void registerIdleTransitionCallback(IdlingResource.ResourceCallback resourceCallback2) {
        this.resourceCallback = resourceCallback2;
    }

    public CountingIdlingResource(String str, boolean z) {
        this.counter = new AtomicInteger(0);
        this.becameBusyAt = 0;
        this.becameIdleAt = 0;
        if (!TextUtils.isEmpty(str)) {
            this.resourceName = str;
            this.debugCounting = z;
            return;
        }
        throw new IllegalArgumentException("resourceName cannot be empty or null!");
    }
}
