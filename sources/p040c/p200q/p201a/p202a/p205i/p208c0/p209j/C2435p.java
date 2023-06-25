package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p213f0.C2523a;

/* renamed from: c.q.a.a.i.c0.j.p */
/* compiled from: AlarmManagerScheduler */
public class C2435p implements C2445x {

    /* renamed from: a */
    public final Context f2799a;

    /* renamed from: b */
    public final C2467j0 f2800b;

    /* renamed from: c */
    public AlarmManager f2801c;

    /* renamed from: d */
    public final SchedulerConfig f2802d;

    /* renamed from: e */
    public final C2512a f2803e;

    public C2435p(Context context, C2467j0 j0Var, C2512a aVar, SchedulerConfig schedulerConfig) {
        this(context, j0Var, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), aVar, schedulerConfig);
    }

    /* renamed from: a */
    public void mo17811a(C2538q qVar, int i) {
        mo17812b(qVar, i, false);
    }

    /* renamed from: b */
    public void mo17812b(C2538q qVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", qVar.mo17943b());
        builder.appendQueryParameter("priority", String.valueOf(C2523a.m4481a(qVar.mo17945d())));
        if (qVar.mo17944c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(qVar.mo17944c(), 0));
        }
        Intent intent = new Intent(this.f2799a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo17813c(intent)) {
            long H = this.f2800b.mo17876H(qVar);
            long g = this.f2802d.mo23904g(qVar.mo17945d(), H, i);
            C2396a.m4209c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", qVar, Long.valueOf(g), Long.valueOf(H), Integer.valueOf(i));
            this.f2801c.set(3, this.f2803e.mo17952a() + g, PendingIntent.getBroadcast(this.f2799a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        C2396a.m4208b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", qVar);
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean mo17813c(Intent intent) {
        return PendingIntent.getBroadcast(this.f2799a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }

    @VisibleForTesting
    public C2435p(Context context, C2467j0 j0Var, AlarmManager alarmManager, C2512a aVar, SchedulerConfig schedulerConfig) {
        this.f2799a = context;
        this.f2800b = j0Var;
        this.f2801c = alarmManager;
        this.f2803e = aVar;
        this.f2802d = schedulerConfig;
    }
}
