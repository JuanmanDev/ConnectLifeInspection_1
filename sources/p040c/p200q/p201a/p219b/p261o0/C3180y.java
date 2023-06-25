package p040c.p200q.p201a.p219b.p261o0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.b.o0.y */
/* compiled from: SystemClock */
public final class C3180y implements C3153f {
    /* renamed from: b */
    public long mo19953b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo19954c() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: d */
    public C3162l mo19955d(Looper looper, @Nullable Handler.Callback callback) {
        return new C3181z(new Handler(looper, callback));
    }
}
