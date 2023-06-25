package p648m.p660d.p667l;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m.d.l.d */
/* compiled from: NamedThreadFactory */
public class C9684d implements ThreadFactory {

    /* renamed from: e */
    public final ThreadFactory f18965e = Executors.defaultThreadFactory();

    /* renamed from: l */
    public final AtomicInteger f18966l = new AtomicInteger(1);

    /* renamed from: m */
    public final String f18967m;

    public C9684d(String str) {
        this.f18967m = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f18965e.newThread(runnable);
        newThread.setName(this.f18967m + AccountManagerConstants$LOCALE.LOCALE_SEPERATOR + this.f18966l);
        return newThread;
    }
}
