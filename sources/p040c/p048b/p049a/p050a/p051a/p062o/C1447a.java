package p040c.p048b.p049a.p050a.p051a.p062o;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.util.Collections;
import java.util.Set;
import p040c.p048b.p049a.p050a.p051a.p062o.C1450d;

/* renamed from: c.b.a.a.a.o.a */
/* compiled from: AggregateInteractiveListener */
public final class C1447a<T extends C1450d<S, U, V>, S, U, V> implements C1450d<S, U, V> {

    /* renamed from: e */
    public String f616e;

    /* renamed from: l */
    public Set<T> f617l;

    public C1447a(String str, Set<T> set) {
        this.f616e = str;
        set = set == null ? Collections.emptySet() : set;
        this.f617l = set;
        for (T t : set) {
            if (!str.equals(t.mo15072d())) {
                throw new IllegalStateException("AggregateInteractiveListener created for request type \"" + str + "\" but received listener with request type \"" + t.mo15072d() + "\"");
            }
        }
    }

    /* renamed from: a */
    public void mo15070a(V v) {
        for (T a : this.f617l) {
            a.mo15070a(v);
        }
    }

    /* renamed from: d */
    public String mo15072d() {
        return this.f616e;
    }

    /* renamed from: f */
    public void mo15073f(Context context, InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        for (T f : this.f617l) {
            f.mo15073f(context, interactiveRequestRecord, uri);
        }
    }

    public void onCancel(U u) {
        for (T onCancel : this.f617l) {
            onCancel.onCancel(u);
        }
    }

    public void onSuccess(S s) {
        for (T onSuccess : this.f617l) {
            onSuccess.onSuccess(s);
        }
    }
}
