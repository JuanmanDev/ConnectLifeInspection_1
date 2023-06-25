package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.C2543u;
import p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2423d;
import p040c.p200q.p201a.p202a.p205i.p213f0.C2523a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* renamed from: a */
    public /* synthetic */ void mo23899a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C2543u.m4549f(getApplicationContext());
        C2538q.C2539a a = C2538q.m4531a();
        a.mo17949b(string);
        a.mo17951d(C2523a.m4482b(i));
        if (string2 != null) {
            a.mo17950c(Base64.decode(string2, 0));
        }
        C2543u.m4547c().mo17985e().mo17843m(a.mo17948a(), i2, new C2423d(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
