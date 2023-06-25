package p040c.p200q.p201a.p202a.p205i.p208c0;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2435p;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2440s;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2445x;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;

/* renamed from: c.q.a.a.i.c0.h */
/* compiled from: SchedulingModule */
public abstract class C2418h {
    /* renamed from: a */
    public static C2445x m4256a(Context context, C2467j0 j0Var, SchedulerConfig schedulerConfig, C2512a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C2440s(context, j0Var, schedulerConfig);
        }
        return new C2435p(context, j0Var, aVar, schedulerConfig);
    }
}
