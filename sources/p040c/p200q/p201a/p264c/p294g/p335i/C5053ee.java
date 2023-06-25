package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.core.app.NotificationCompat;
import androidx.test.internal.runner.RunnerArgs;
import java.util.List;

/* renamed from: c.q.a.c.g.i.ee */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5053ee extends C5118j {

    /* renamed from: m */
    public final C5021ce f9882m;

    public C5053ee(C5021ce ceVar) {
        super("internal.logger");
        this.f9882m = ceVar;
        this.f9953l.put(RunnerArgs.ARGUMENT_LOG_ONLY, new C5037de(this, false, true));
        this.f9953l.put(NotificationCompat.GROUP_KEY_SILENT, new C5116id(this, NotificationCompat.GROUP_KEY_SILENT));
        ((C5118j) this.f9953l.get(NotificationCompat.GROUP_KEY_SILENT)).mo27214o(RunnerArgs.ARGUMENT_LOG_ONLY, new C5037de(this, true, true));
        this.f9953l.put("unmonitored", new C5005be(this, "unmonitored"));
        ((C5118j) this.f9953l.get("unmonitored")).mo27214o(RunnerArgs.ARGUMENT_LOG_ONLY, new C5037de(this, false, false));
    }

    /* renamed from: a */
    public final C5225q mo27025a(C5215p4 p4Var, List list) {
        return C5225q.f10068c;
    }
}
