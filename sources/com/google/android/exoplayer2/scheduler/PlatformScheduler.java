package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import p040c.p200q.p201a.p219b.p240j0.C2855a;
import p040c.p200q.p201a.p219b.p240j0.C2861c;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

@TargetApi(21)
public final class PlatformScheduler implements C2861c {

    public static final class PlatformSchedulerService extends JobService {
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.m10554c("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new C2855a(extras.getInt("requirements")).mo19035e(this)) {
                PlatformScheduler.m10554c("Requirements are met");
                String string = extras.getString("service_action");
                String string2 = extras.getString("service_package");
                Intent intent = new Intent(string).setPackage(string2);
                PlatformScheduler.m10554c("Starting service action: " + string + " package: " + string2);
                C3152e0.m7804i0(this, intent);
                return false;
            }
            PlatformScheduler.m10554c("Requirements are not met");
            jobFinished(jobParameters, true);
            return false;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m10554c(String str) {
    }
}
