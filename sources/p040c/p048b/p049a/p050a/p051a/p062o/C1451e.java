package p040c.p048b.p049a.p050a.p051a.p062o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import p040c.p048b.p049a.p050a.p051a.p052h.p054c.C1373a;
import p040c.p048b.p049a.p050a.p051a.p062o.C1450d;

/* renamed from: c.b.a.a.a.o.e */
/* compiled from: InteractiveRequest */
public abstract class C1451e<T extends C1450d<S, U, V>, S, U, V> implements C1449c, C1450d<S, U, V> {

    /* renamed from: e */
    public C1373a f625e;

    /* renamed from: c.b.a.a.a.o.e$a */
    /* compiled from: InteractiveRequest */
    public static abstract class C1452a<W extends C1451e<?, ?, ?, ?>> {

        /* renamed from: a */
        public C1373a f626a;

        public C1452a(C1373a aVar) {
            if (aVar != null) {
                this.f626a = aVar;
                return;
            }
            throw new IllegalArgumentException("A RequestContext is necessary for making interactive requests");
        }
    }

    public C1451e(C1373a aVar) {
        mo15310l(aVar);
    }

    /* renamed from: a */
    public void mo15070a(V v) {
        mo15305g().mo15070a(v);
    }

    /* renamed from: f */
    public void mo15073f(Context context, InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        mo15305g().mo15073f(context, interactiveRequestRecord, uri);
    }

    /* renamed from: g */
    public final C1450d<S, U, V> mo15305g() {
        return this.f625e.mo15086h(this);
    }

    /* renamed from: h */
    public Context mo15306h() {
        return this.f625e.mo15087i();
    }

    /* renamed from: i */
    public abstract Class<T> mo15307i();

    /* renamed from: j */
    public C1373a mo15308j() {
        return this.f625e;
    }

    /* renamed from: k */
    public abstract Bundle mo15309k();

    /* renamed from: l */
    public void mo15310l(C1373a aVar) {
        if (aVar != null) {
            this.f625e = aVar;
            return;
        }
        throw new IllegalArgumentException("requestContext must be non-null");
    }

    public void onCancel(U u) {
        mo15305g().onCancel(u);
    }

    public void onSuccess(S s) {
        mo15305g().onSuccess(s);
    }
}
