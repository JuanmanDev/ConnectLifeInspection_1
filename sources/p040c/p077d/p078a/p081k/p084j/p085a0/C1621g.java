package p040c.p077d.p078a.p081k.p084j.p085a0;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1622h;
import p040c.p077d.p078a.p105q.C1946f;

/* renamed from: c.d.a.k.j.a0.g */
/* compiled from: LruResourceCache */
public class C1621g extends C1946f<C1567c, C1685u<?>> implements C1622h {

    /* renamed from: d */
    public C1622h.C1623a f987d;

    public C1621g(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo15702a(int i) {
        if (i >= 40) {
            mo16432b();
        } else if (i >= 20 || i == 15) {
            mo16438m(mo16435h() / 2);
        }
    }

    @Nullable
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C1685u mo15703c(@NonNull C1567c cVar, @Nullable C1685u uVar) {
        return (C1685u) super.mo16436k(cVar, uVar);
    }

    @Nullable
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C1685u mo15704d(@NonNull C1567c cVar) {
        return (C1685u) super.mo16437l(cVar);
    }

    /* renamed from: e */
    public void mo15705e(@NonNull C1622h.C1623a aVar) {
        this.f987d = aVar;
    }

    /* renamed from: n */
    public int mo15706i(@Nullable C1685u<?> uVar) {
        if (uVar == null) {
            return super.mo15706i(null);
        }
        return uVar.mo15868d();
    }

    /* renamed from: o */
    public void mo15707j(@NonNull C1567c cVar, @Nullable C1685u<?> uVar) {
        C1622h.C1623a aVar = this.f987d;
        if (aVar != null && uVar != null) {
            aVar.mo15711a(uVar);
        }
    }
}
