package p040c.p072c.p073a.p074a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* renamed from: c.c.a.a.z */
/* compiled from: Utils */
public final class C1535z {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Application f759a;

    /* renamed from: c.c.a.a.z$a */
    /* compiled from: Utils */
    public static class C1536a {
        /* renamed from: a */
        public void mo15436a(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: b */
        public void mo15437b(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: c */
        public void mo15438c(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: d */
        public void mo15439d(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: e */
        public void mo15440e(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: f */
        public void mo15441f(@NonNull Activity activity) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }

        /* renamed from: g */
        public void mo15442g(@NonNull Activity activity, Lifecycle.Event event) {
            if (activity == null) {
                throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
        }
    }

    /* renamed from: c.c.a.a.z$b */
    /* compiled from: Utils */
    public interface C1537b {
        /* renamed from: a */
        void mo15443a(Activity activity);

        /* renamed from: b */
        void mo15444b(Activity activity);
    }

    /* renamed from: a */
    public static Application m1079a() {
        Application application = f759a;
        if (application != null) {
            return application;
        }
        m1080b(C1493b0.m886j());
        if (f759a != null) {
            C1493b0.m887k() + " reflect app success.";
            return f759a;
        }
        throw new NullPointerException("reflect failed.");
    }

    /* renamed from: b */
    public static void m1080b(Application application) {
        if (application != null) {
            Application application2 = f759a;
            if (application2 == null) {
                f759a = application;
                C1493b0.m894r(application);
                C1493b0.m901y();
            } else if (!application2.equals(application)) {
                C1493b0.m874D(f759a);
                f759a = application;
                C1493b0.m894r(application);
            }
        }
    }
}
