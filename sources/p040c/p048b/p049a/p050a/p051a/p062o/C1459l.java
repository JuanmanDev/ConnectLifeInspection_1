package p040c.p048b.p049a.p050a.p051a.p062o;

import android.content.Context;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import com.amazon.identity.auth.device.interactive.WorkflowSupportFragment;
import java.lang.ref.WeakReference;

/* renamed from: c.b.a.a.a.o.l */
/* compiled from: RequestSourceContextWrapper */
public class C1459l implements C1457j {

    /* renamed from: a */
    public final WeakReference<Context> f632a;

    /* renamed from: b */
    public WorkflowSupportFragment f633b;

    public C1459l(Context context) {
        if (context != null) {
            this.f632a = new WeakReference<>(context);
            this.f633b = null;
            return;
        }
        throw new IllegalArgumentException("context must be non-null");
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
        return this.f632a.get();
    }

    /* renamed from: c */
    public boolean mo15319c() {
        return false;
    }

    /* renamed from: d */
    public C1454g mo15320d() {
        if (this.f633b == null) {
            WorkflowSupportFragment workflowSupportFragment = new WorkflowSupportFragment();
            this.f633b = workflowSupportFragment;
            workflowSupportFragment.mo21536q((Context) this.f632a.get());
        }
        return this.f633b.getState();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1459l.class != obj.getClass()) {
            return false;
        }
        C1459l lVar = (C1459l) obj;
        WeakReference<Context> weakReference = this.f632a;
        if (weakReference == null) {
            if (lVar.f632a != null) {
                return false;
            }
        } else if (lVar.f632a == null) {
            return false;
        } else {
            if (weakReference.get() == null) {
                if (lVar.f632a.get() != null) {
                    return false;
                }
            } else if (!((Context) this.f632a.get()).equals(lVar.f632a.get())) {
                return false;
            }
        }
        return true;
    }

    public Context getContext() {
        return (Context) this.f632a.get();
    }

    public int hashCode() {
        WeakReference<Context> weakReference = this.f632a;
        return 31 + ((weakReference == null || weakReference.get() == null) ? 0 : ((Context) this.f632a.get()).hashCode());
    }
}
