package p040c.p048b.p049a.p050a.p051a.p062o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import com.amazon.identity.auth.device.api.InvalidIntegrationException;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import com.amazon.identity.auth.device.interactive.WorkflowFragment;
import java.lang.ref.WeakReference;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.o.k */
/* compiled from: RequestSourceActivityWrapper */
public final class C1458k implements C1457j {

    /* renamed from: b */
    public static final String f630b = "c.b.a.a.a.o.k";

    /* renamed from: a */
    public final WeakReference<Activity> f631a;

    public C1458k(Activity activity) {
        if (activity != null) {
            this.f631a = new WeakReference<>(activity);
            return;
        }
        throw new IllegalArgumentException("activity must be non-null");
    }

    /* renamed from: a */
    public void mo15317a(InteractiveRequestRecord interactiveRequestRecord) {
        C1454g d = mo15320d();
        if (d != null) {
            d.mo15298b(interactiveRequestRecord);
        }
    }

    /* renamed from: b */
    public Object mo15318b() {
        return this.f631a.get();
    }

    /* renamed from: c */
    public boolean mo15319c() {
        return true;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public C1454g mo15320d() {
        Activity activity = (Activity) this.f631a.get();
        if (activity != null) {
            mo15322e();
            FragmentManager fragmentManager = activity.getFragmentManager();
            try {
                C1455h hVar = (C1455h) fragmentManager.findFragmentByTag(C1455h.f629a);
                WorkflowFragment workflowFragment = hVar;
                if (hVar == null) {
                    WorkflowFragment workflowFragment2 = new WorkflowFragment();
                    fragmentManager.beginTransaction().add(workflowFragment2, C1455h.f629a).commit();
                    workflowFragment = workflowFragment2;
                }
                return workflowFragment.getState();
            } catch (ClassCastException e) {
                String str = f630b;
                C1485a.m830c(str, "Found an invalid fragment looking for fragment with tag " + C1455h.f629a + ". Please use a different fragment tag.", e);
                return null;
            }
        } else {
            C1485a.m829b(f630b, "Failed to get InteractiveState on a garbage-collected Activity");
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo15322e() {
        try {
            return Class.forName("android.app.Fragment", false, getClass().getClassLoader()) != null;
        } catch (ClassNotFoundException e) {
            throw new InvalidIntegrationException("android.app.Fragment not found. To make a request from an activity, use minSdkVersion of at least 11, or use FragmentActivity from Android Support Library v4", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1458k.class != obj.getClass()) {
            return false;
        }
        C1458k kVar = (C1458k) obj;
        WeakReference<Activity> weakReference = this.f631a;
        if (weakReference == null) {
            if (kVar.f631a != null) {
                return false;
            }
        } else if (kVar.f631a == null) {
            return false;
        } else {
            if (weakReference.get() == null) {
                if (kVar.f631a.get() != null) {
                    return false;
                }
            } else if (!((Activity) this.f631a.get()).equals(kVar.f631a.get())) {
                return false;
            }
        }
        return true;
    }

    public Context getContext() {
        return (Context) this.f631a.get();
    }

    public int hashCode() {
        WeakReference<Activity> weakReference = this.f631a;
        return 31 + ((weakReference == null || weakReference.get() == null) ? 0 : ((Activity) this.f631a.get()).hashCode());
    }
}
