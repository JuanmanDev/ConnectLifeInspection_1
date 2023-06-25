package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p213f0.C2523a;

@RequiresApi(api = 21)
/* renamed from: c.q.a.a.i.c0.j.s */
/* compiled from: JobInfoScheduler */
public class C2440s implements C2445x {

    /* renamed from: a */
    public final Context f2812a;

    /* renamed from: b */
    public final C2467j0 f2813b;

    /* renamed from: c */
    public final SchedulerConfig f2814c;

    public C2440s(Context context, C2467j0 j0Var, SchedulerConfig schedulerConfig) {
        this.f2812a = context;
        this.f2813b = j0Var;
        this.f2814c = schedulerConfig;
    }

    /* renamed from: a */
    public void mo17811a(C2538q qVar, int i) {
        mo17812b(qVar, i, false);
    }

    /* renamed from: b */
    public void mo17812b(C2538q qVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f2812a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2812a.getSystemService("jobscheduler");
        int c = mo17829c(qVar);
        if (z || !mo17830d(jobScheduler, c, i)) {
            long H = this.f2813b.mo17876H(qVar);
            SchedulerConfig schedulerConfig = this.f2814c;
            JobInfo.Builder builder = new JobInfo.Builder(c, componentName);
            schedulerConfig.mo23903c(builder, qVar.mo17945d(), H, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", qVar.mo17943b());
            persistableBundle.putInt("priority", C2523a.m4481a(qVar.mo17945d()));
            if (qVar.mo17944c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(qVar.mo17944c(), 0));
            }
            builder.setExtras(persistableBundle);
            C2396a.m4209c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", qVar, Integer.valueOf(c), Long.valueOf(this.f2814c.mo23904g(qVar.mo17945d(), H, i)), Long.valueOf(H), Integer.valueOf(i));
            jobScheduler.schedule(builder.build());
            return;
        }
        C2396a.m4208b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", qVar);
    }

    @VisibleForTesting
    /* renamed from: c */
    public int mo17829c(C2538q qVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2812a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(qVar.mo17943b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C2523a.m4481a(qVar.mo17945d())).array());
        if (qVar.mo17944c() != null) {
            adler32.update(qVar.mo17944c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean mo17830d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
