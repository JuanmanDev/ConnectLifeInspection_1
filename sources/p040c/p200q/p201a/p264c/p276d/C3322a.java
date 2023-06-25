package p040c.p200q.p201a.p264c.p276d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3322a implements ServiceConnection {

    /* renamed from: e */
    public boolean f6195e = false;

    /* renamed from: l */
    public final BlockingQueue f6196l = new LinkedBlockingQueue();

    @NonNull
    /* renamed from: a */
    public IBinder mo20380a(long j, @NonNull TimeUnit timeUnit) {
        C3495o.m8907i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f6195e) {
            this.f6195e = true;
            IBinder iBinder = (IBinder) this.f6196l.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f6196l.add(iBinder);
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
