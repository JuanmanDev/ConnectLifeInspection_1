package p040c.p537g0.p538a;

import android.content.Context;
import androidx.annotation.NonNull;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: c.g0.a.d */
/* compiled from: ShareExtendPlugin */
public class C8854d implements C8944a, C8948a, C9024l.C9028d {

    /* renamed from: e */
    public C8944a.C8946b f17215e;

    /* renamed from: l */
    public C8950c f17216l;

    /* renamed from: m */
    public C9017j f17217m;

    /* renamed from: n */
    public C8851a f17218n;

    /* renamed from: o */
    public C8853c f17219o;

    /* renamed from: a */
    public final void mo46046a(Context context, C9003c cVar, C9024l.C9027c cVar2, C8950c cVar3) {
        this.f17217m = new C9017j(cVar, "com.zt.shareextend/share_extend");
        C8853c cVar4 = new C8853c(context);
        this.f17219o = cVar4;
        C8851a aVar = new C8851a(cVar4);
        this.f17218n = aVar;
        this.f17217m.mo46575e(aVar);
        if (cVar2 != null) {
            cVar2.mo46297b(this);
        } else {
            cVar3.mo46417b(this);
        }
    }

    /* renamed from: b */
    public final void mo46047b() {
        this.f17216l.mo46421f(this);
        this.f17216l = null;
        this.f17217m.mo46575e((C9017j.C9021c) null);
        this.f17217m = null;
    }

    public void onAttachedToActivity(@NonNull C8950c cVar) {
        this.f17216l = cVar;
        mo46046a(cVar.mo46419d(), this.f17215e.mo46465b(), (C9024l.C9027c) null, this.f17216l);
    }

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        this.f17215e = bVar;
    }

    public void onDetachedFromActivity() {
        mo46047b();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        this.f17215e = null;
    }

    public void onReattachedToActivityForConfigChanges(@NonNull C8950c cVar) {
        onAttachedToActivity(cVar);
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 100 && iArr.length > 0 && iArr[0] == 0) {
            this.f17219o.mo46043c();
        }
        return false;
    }
}
