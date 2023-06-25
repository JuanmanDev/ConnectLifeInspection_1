package p040c.p048b.p049a.p050a.p051a.p062o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import com.amazon.identity.auth.device.interactive.WorkflowSupportFragment;
import java.lang.ref.WeakReference;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.o.m */
/* compiled from: RequestSourceFragmentActivityWrapper */
public final class C1460m implements C1457j {

    /* renamed from: b */
    public static final String f634b = "c.b.a.a.a.o.m";

    /* renamed from: a */
    public final WeakReference<FragmentActivity> f635a;

    public C1460m(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            this.f635a = new WeakReference<>(fragmentActivity);
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
        return this.f635a.get();
    }

    /* renamed from: c */
    public boolean mo15319c() {
        return true;
    }

    /* renamed from: d */
    public C1454g mo15320d() {
        FragmentActivity fragmentActivity = (FragmentActivity) this.f635a.get();
        if (fragmentActivity != null) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            try {
                C1455h hVar = (C1455h) supportFragmentManager.findFragmentByTag(C1455h.f629a);
                WorkflowSupportFragment workflowSupportFragment = hVar;
                if (hVar == null) {
                    WorkflowSupportFragment workflowSupportFragment2 = new WorkflowSupportFragment();
                    supportFragmentManager.beginTransaction().add((Fragment) workflowSupportFragment2, C1455h.f629a).commit();
                    workflowSupportFragment = workflowSupportFragment2;
                }
                return workflowSupportFragment.getState();
            } catch (ClassCastException e) {
                String str = f634b;
                C1485a.m830c(str, "Found an invalid fragment looking for fragment with tag " + C1455h.f629a + ". Please use a different fragment tag.", e);
                return null;
            }
        } else {
            C1485a.m829b(f634b, "Failed to get InteractiveState on a garbage-collected FragmentActivity");
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1460m.class != obj.getClass()) {
            return false;
        }
        C1460m mVar = (C1460m) obj;
        WeakReference<FragmentActivity> weakReference = this.f635a;
        if (weakReference == null) {
            if (mVar.f635a != null) {
                return false;
            }
        } else if (mVar.f635a == null) {
            return false;
        } else {
            if (weakReference.get() == null) {
                if (mVar.f635a.get() != null) {
                    return false;
                }
            } else if (!((FragmentActivity) this.f635a.get()).equals(mVar.f635a.get())) {
                return false;
            }
        }
        return true;
    }

    public Context getContext() {
        return (Context) this.f635a.get();
    }

    public int hashCode() {
        WeakReference<FragmentActivity> weakReference = this.f635a;
        return 31 + ((weakReference == null || weakReference.get() == null) ? 0 : ((FragmentActivity) this.f635a.get()).hashCode());
    }
}
