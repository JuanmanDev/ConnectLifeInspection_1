package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: c.q.a.c.d.j.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3468g {

    /* renamed from: a */
    public static int f6458a = 4225;

    /* renamed from: b */
    public static final Object f6459b = new Object();
    @Nullable

    /* renamed from: c */
    public static C3506r1 f6460c = null;
    @Nullable

    /* renamed from: d */
    public static HandlerThread f6461d = null;

    /* renamed from: e */
    public static boolean f6462e = false;

    /* renamed from: a */
    public static int m8856a() {
        return f6458a;
    }

    @NonNull
    /* renamed from: b */
    public static C3468g m8857b(@NonNull Context context) {
        Looper looper;
        synchronized (f6459b) {
            if (f6460c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f6462e) {
                    looper = m8858c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f6460c = new C3506r1(applicationContext, looper);
            }
        }
        return f6460c;
    }

    @NonNull
    /* renamed from: c */
    public static HandlerThread m8858c() {
        synchronized (f6459b) {
            HandlerThread handlerThread = f6461d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f6461d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f6461d;
            return handlerThread3;
        }
    }

    /* renamed from: d */
    public abstract void mo20721d(C3494n1 n1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo20722e(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        mo20721d(new C3494n1(str, str2, i, z), serviceConnection, str3);
    }

    /* renamed from: f */
    public abstract boolean mo20723f(C3494n1 n1Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor);
}
