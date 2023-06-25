package androidx.test.internal.runner.intent;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.test.runner.intent.IntentCallback;
import androidx.test.runner.intent.IntentMonitor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class IntentMonitorImpl implements IntentMonitor {
    public static final String TAG = "IntentMonitorImpl";
    public List<WeakReference<IntentCallback>> callbacks = Collections.synchronizedList(new ArrayList());

    public void addIntentCallback(@NonNull IntentCallback intentCallback) {
        if (intentCallback != null) {
            boolean z = true;
            Iterator<WeakReference<IntentCallback>> it = this.callbacks.iterator();
            while (it.hasNext()) {
                IntentCallback intentCallback2 = (IntentCallback) it.next().get();
                if (intentCallback2 == null) {
                    it.remove();
                } else if (intentCallback2 == intentCallback) {
                    z = false;
                }
            }
            if (z) {
                this.callbacks.add(new WeakReference(intentCallback));
                return;
            }
            return;
        }
        throw new NullPointerException("callback cannot be null!");
    }

    public void removeIntentCallback(@NonNull IntentCallback intentCallback) {
        if (intentCallback != null) {
            Iterator<WeakReference<IntentCallback>> it = this.callbacks.iterator();
            while (it.hasNext()) {
                IntentCallback intentCallback2 = (IntentCallback) it.next().get();
                if (intentCallback2 == null) {
                    it.remove();
                } else if (intentCallback2 == intentCallback) {
                    it.remove();
                }
            }
            return;
        }
        throw new NullPointerException("callback cannot be null!");
    }

    public void signalIntent(Intent intent) {
        Iterator<WeakReference<IntentCallback>> it = this.callbacks.iterator();
        while (it.hasNext()) {
            IntentCallback intentCallback = (IntentCallback) it.next().get();
            if (intentCallback == null) {
                it.remove();
            } else {
                try {
                    intentCallback.onIntentSent(new Intent(intent));
                } catch (RuntimeException unused) {
                    String.format("Callback threw exception! (callback: %s intent: %s)", new Object[]{intentCallback, intent});
                }
            }
        }
    }
}
