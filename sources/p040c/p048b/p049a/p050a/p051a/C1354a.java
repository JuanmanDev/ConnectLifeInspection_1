package p040c.p048b.p049a.p050a.p051a;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.util.UUID;
import p040c.p048b.p049a.p050a.p051a.p062o.C1451e;

/* renamed from: c.b.a.a.a.a */
/* compiled from: AbstractRequest */
public abstract class C1354a {

    /* renamed from: a */
    public final C1451e<?, ?, ?, ?> f378a;

    /* renamed from: b */
    public final String f379b = UUID.randomUUID().toString();

    /* renamed from: c */
    public int f380c = 0;

    public C1354a(C1451e<?, ?, ?, ?> eVar) {
        this.f378a = eVar;
    }

    /* renamed from: a */
    public boolean mo15042a() {
        return this.f380c < mo15044c();
    }

    /* renamed from: b */
    public InteractiveRequestRecord mo15043b() {
        return new InteractiveRequestRecord(this.f379b, this.f378a.mo15309k());
    }

    /* renamed from: c */
    public int mo15044c() {
        return 1;
    }

    /* renamed from: d */
    public C1451e<?, ?, ?, ?> mo15045d() {
        return this.f378a;
    }

    /* renamed from: e */
    public String mo15046e() {
        return this.f379b;
    }

    /* renamed from: f */
    public abstract String mo15047f(Context context);

    /* renamed from: g */
    public abstract boolean mo15048g(Uri uri, Context context);

    /* renamed from: h */
    public void mo15049h() {
        this.f380c++;
    }

    /* renamed from: i */
    public void mo15050i() {
        C1451e<?, ?, ?, ?> eVar = this.f378a;
        if (eVar != null) {
            eVar.mo15308j().mo15092n(mo15043b());
        }
    }
}
