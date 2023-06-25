package p040c.p048b.p049a.p050a.p051a.p062o;

import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.UUID;
import p040c.p048b.p049a.p050a.p051a.C1359f;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.o.b */
/* compiled from: GenericInteractiveState */
public final class C1448b implements C1454g {

    /* renamed from: f */
    public static final String f618f = "c.b.a.a.a.o.b";

    /* renamed from: g */
    public static final String f619g = (C1454g.class.getName() + ".instanceState");

    /* renamed from: a */
    public final C1453f f620a;

    /* renamed from: b */
    public final C1359f f621b;

    /* renamed from: c */
    public final Set<InteractiveRequestRecord> f622c;

    /* renamed from: d */
    public WeakReference<C1455h> f623d;

    /* renamed from: e */
    public UUID f624e;

    public C1448b(C1455h hVar) {
        this(hVar, C1359f.m278a(), C1453f.m744a());
    }

    /* renamed from: a */
    public synchronized void mo15297a(C1373a aVar) {
        if (mo15303g()) {
            mo15299c(aVar);
        } else {
            String str = f618f;
            C1485a.m828a(str, "InteractiveState " + this.f624e + ": No responses to process");
        }
    }

    /* renamed from: b */
    public synchronized void mo15298b(InteractiveRequestRecord interactiveRequestRecord) {
        String str = interactiveRequestRecord.mo21522a() == null ? ActivityChooserModel.ATTRIBUTE_ACTIVITY : "fragment";
        String str2 = f618f;
        C1485a.m828a(str2, "InteractiveState " + this.f624e + ": Recording " + str + " request " + interactiveRequestRecord.mo21524c());
        this.f622c.add(interactiveRequestRecord);
    }

    /* renamed from: c */
    public void mo15299c(C1373a aVar) {
        C1373a d;
        LinkedList linkedList = new LinkedList();
        for (InteractiveRequestRecord next : this.f622c) {
            String c = next.mo21524c();
            if (this.f621b.mo15061b(c) && (d = mo15300d(next)) == aVar) {
                String str = f618f;
                C1485a.m828a(str, "InteractiveState " + this.f624e + ": Processing request " + c);
                d.mo15093o(next, this.f621b.mo15063d(c));
                linkedList.add(next);
            }
        }
        this.f622c.removeAll(linkedList);
    }

    /* renamed from: d */
    public C1373a mo15300d(InteractiveRequestRecord interactiveRequestRecord) {
        return this.f620a.mo15311b(mo15301e(interactiveRequestRecord));
    }

    /* renamed from: e */
    public Object mo15301e(InteractiveRequestRecord interactiveRequestRecord) {
        Bundle a = interactiveRequestRecord.mo21522a();
        Object f = a != null ? ((C1455h) this.f623d.get()).mo15313f(a) : null;
        if (f == null) {
            f = ((C1455h) this.f623d.get()).mo15316p();
        }
        return f == null ? ((C1455h) this.f623d.get()).mo15315n() : f;
    }

    /* renamed from: f */
    public void mo15302f(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle(f619g)) != null) {
            C1485a.m828a(f618f, "Restoring interactive state from saved instance state");
            String string = bundle2.getString("interactiveStateId");
            if (string == null) {
                C1485a.m838k(f618f, "Restoring interactive state from instance state but no state ID found");
            } else {
                String str = f618f;
                C1485a.m828a(str, "Reassigning interactive state " + this.f624e + " to " + string);
                this.f624e = UUID.fromString(string);
            }
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("requestRecords");
            if (parcelableArrayList != null) {
                this.f622c.addAll(parcelableArrayList);
            }
        }
    }

    /* renamed from: g */
    public boolean mo15303g() {
        boolean z = this.f622c.size() > 0;
        boolean z2 = this.f621b.mo15064e() > 0;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public void mo15304h(Bundle bundle) {
        if (this.f622c.size() > 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("interactiveStateId", this.f624e.toString());
            bundle2.putParcelableArrayList("requestRecords", new ArrayList(this.f622c));
            bundle.putBundle(f619g, bundle2);
            String str = f618f;
            C1485a.m828a(str, "InteractiveState " + this.f624e + ": writing to save instance state");
        }
    }

    public C1448b(C1455h hVar, C1359f fVar, C1453f fVar2) {
        this.f623d = new WeakReference<>(hVar);
        this.f621b = fVar;
        this.f620a = fVar2;
        this.f622c = new HashSet();
        this.f624e = UUID.randomUUID();
    }
}
