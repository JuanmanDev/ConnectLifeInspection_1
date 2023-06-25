package p040c.p200q.p201a.p264c.p276d.p289n.p290r;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.n.r.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3567a implements ThreadFactory {

    /* renamed from: e */
    public final String f6551e;

    /* renamed from: l */
    public final ThreadFactory f6552l = Executors.defaultThreadFactory();

    public C3567a(@NonNull String str) {
        C3495o.m8909k(str, "Name must not be null");
        this.f6551e = str;
    }

    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f6552l.newThread(new C3568b(runnable, 0));
        newThread.setName(this.f6551e);
        return newThread;
    }
}
