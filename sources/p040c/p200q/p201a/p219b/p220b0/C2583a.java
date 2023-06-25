package p040c.p200q.p201a.p219b.p220b0;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p040c.p200q.p201a.p219b.C2578a0;
import p040c.p200q.p201a.p219b.C3206r;
import p040c.p200q.p201a.p219b.C3207s;
import p040c.p200q.p201a.p219b.p220b0.C2587b;
import p040c.p200q.p201a.p219b.p221c0.C2599h;
import p040c.p200q.p201a.p219b.p221c0.C2607k;
import p040c.p200q.p201a.p219b.p221c0.C2608l;
import p040c.p200q.p201a.p219b.p222d0.C2633d;
import p040c.p200q.p201a.p219b.p223e0.C2649h;
import p040c.p200q.p201a.p219b.p235h0.C2832d;
import p040c.p200q.p201a.p219b.p241k0.C3014u;
import p040c.p200q.p201a.p219b.p241k0.C3017v;
import p040c.p200q.p201a.p219b.p259m0.C3109f;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3153f;
import p040c.p200q.p201a.p219b.p262p0.C3200m;
import p040c.p200q.p201a.p219b.p262p0.C3201n;

/* renamed from: c.q.a.b.b0.a */
/* compiled from: AnalyticsCollector */
public class C2583a implements C3207s.C3208a, C2832d, C2608l, C3201n, C3017v, C3118e.C3119a, C2649h, C3200m, C2607k {

    /* renamed from: e */
    public final CopyOnWriteArraySet<C2587b> f3058e;

    /* renamed from: l */
    public final C3153f f3059l;

    /* renamed from: m */
    public final C2578a0.C2581c f3060m;

    /* renamed from: n */
    public final C2586c f3061n;

    /* renamed from: o */
    public C3207s f3062o;

    /* renamed from: c.q.a.b.b0.a$a */
    /* compiled from: AnalyticsCollector */
    public static class C2584a {
        /* renamed from: a */
        public C2583a mo18138a(@Nullable C3207s sVar, C3153f fVar) {
            return new C2583a(sVar, fVar);
        }
    }

    /* renamed from: c.q.a.b.b0.a$b */
    /* compiled from: AnalyticsCollector */
    public static final class C2585b {

        /* renamed from: a */
        public final C3014u.C3015a f3063a;

        /* renamed from: b */
        public final C2578a0 f3064b;

        /* renamed from: c */
        public final int f3065c;

        public C2585b(C3014u.C3015a aVar, C2578a0 a0Var, int i) {
            this.f3063a = aVar;
            this.f3064b = a0Var;
            this.f3065c = i;
        }
    }

    /* renamed from: c.q.a.b.b0.a$c */
    /* compiled from: AnalyticsCollector */
    public static final class C2586c {

        /* renamed from: a */
        public final ArrayList<C2585b> f3066a = new ArrayList<>();

        /* renamed from: b */
        public final HashMap<C3014u.C3015a, C2585b> f3067b = new HashMap<>();

        /* renamed from: c */
        public final C2578a0.C2580b f3068c = new C2578a0.C2580b();
        @Nullable

        /* renamed from: d */
        public C2585b f3069d;
        @Nullable

        /* renamed from: e */
        public C2585b f3070e;

        /* renamed from: f */
        public C2578a0 f3071f = C2578a0.f3043a;

        /* renamed from: g */
        public boolean f3072g;

        @Nullable
        /* renamed from: b */
        public C2585b mo18139b() {
            return this.f3069d;
        }

        @Nullable
        /* renamed from: c */
        public C2585b mo18140c() {
            if (this.f3066a.isEmpty()) {
                return null;
            }
            ArrayList<C2585b> arrayList = this.f3066a;
            return arrayList.get(arrayList.size() - 1);
        }

        @Nullable
        /* renamed from: d */
        public C2585b mo18141d(C3014u.C3015a aVar) {
            return this.f3067b.get(aVar);
        }

        @Nullable
        /* renamed from: e */
        public C2585b mo18142e() {
            if (this.f3066a.isEmpty() || this.f3071f.mo18062q() || this.f3072g) {
                return null;
            }
            return this.f3066a.get(0);
        }

        @Nullable
        /* renamed from: f */
        public C2585b mo18143f() {
            return this.f3070e;
        }

        /* renamed from: g */
        public boolean mo18144g() {
            return this.f3072g;
        }

        /* renamed from: h */
        public void mo18145h(int i, C3014u.C3015a aVar) {
            C2585b bVar = new C2585b(aVar, this.f3071f.mo18047b(aVar.f5277a) != -1 ? this.f3071f : C2578a0.f3043a, i);
            this.f3066a.add(bVar);
            this.f3067b.put(aVar, bVar);
            if (this.f3066a.size() == 1 && !this.f3071f.mo18062q()) {
                mo18153p();
            }
        }

        /* renamed from: i */
        public boolean mo18146i(C3014u.C3015a aVar) {
            C2585b remove = this.f3067b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.f3066a.remove(remove);
            C2585b bVar = this.f3070e;
            if (bVar == null || !aVar.equals(bVar.f3063a)) {
                return true;
            }
            this.f3070e = this.f3066a.isEmpty() ? null : this.f3066a.get(0);
            return true;
        }

        /* renamed from: j */
        public void mo18147j(int i) {
            mo18153p();
        }

        /* renamed from: k */
        public void mo18148k(C3014u.C3015a aVar) {
            this.f3070e = this.f3067b.get(aVar);
        }

        /* renamed from: l */
        public void mo18149l() {
            this.f3072g = false;
            mo18153p();
        }

        /* renamed from: m */
        public void mo18150m() {
            this.f3072g = true;
        }

        /* renamed from: n */
        public void mo18151n(C2578a0 a0Var) {
            for (int i = 0; i < this.f3066a.size(); i++) {
                C2585b q = mo18154q(this.f3066a.get(i), a0Var);
                this.f3066a.set(i, q);
                this.f3067b.put(q.f3063a, q);
            }
            C2585b bVar = this.f3070e;
            if (bVar != null) {
                this.f3070e = mo18154q(bVar, a0Var);
            }
            this.f3071f = a0Var;
            mo18153p();
        }

        @Nullable
        /* renamed from: o */
        public C2585b mo18152o(int i) {
            C2585b bVar = null;
            for (int i2 = 0; i2 < this.f3066a.size(); i2++) {
                C2585b bVar2 = this.f3066a.get(i2);
                int b = this.f3071f.mo18047b(bVar2.f3063a.f5277a);
                if (b != -1 && this.f3071f.mo18051f(b, this.f3068c).f3046c == i) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        /* renamed from: p */
        public final void mo18153p() {
            if (!this.f3066a.isEmpty()) {
                this.f3069d = this.f3066a.get(0);
            }
        }

        /* renamed from: q */
        public final C2585b mo18154q(C2585b bVar, C2578a0 a0Var) {
            int b = a0Var.mo18047b(bVar.f3063a.f5277a);
            if (b == -1) {
                return bVar;
            }
            return new C2585b(bVar.f3063a, a0Var, a0Var.mo18051f(b, this.f3068c).f3046c);
        }
    }

    public C2583a(@Nullable C3207s sVar, C3153f fVar) {
        if (sVar != null) {
            this.f3062o = sVar;
        }
        C3151e.m7757e(fVar);
        this.f3059l = fVar;
        this.f3058e = new CopyOnWriteArraySet<>();
        this.f3061n = new C2586c();
        this.f3060m = new C2578a0.C2581c();
    }

    /* renamed from: A */
    public final void mo18087A(int i, @Nullable C3014u.C3015a aVar, C3017v.C3020b bVar, C3017v.C3021c cVar, IOException iOException, boolean z) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18181o(T, bVar, cVar, iOException, z);
        }
    }

    /* renamed from: B */
    public final void mo18088B(C2578a0 a0Var, @Nullable Object obj, int i) {
        this.f3061n.mo18151n(a0Var);
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18157C(U, i);
        }
    }

    /* renamed from: C */
    public final void mo18089C() {
    }

    /* renamed from: D */
    public final void mo18090D(Format format) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18171e(V, 2, format);
        }
    }

    /* renamed from: E */
    public final void mo18091E(C2633d dVar) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18182p(U, 2, dVar);
        }
    }

    /* renamed from: F */
    public final void mo18092F(int i, C3014u.C3015a aVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        if (this.f3061n.mo18146i(aVar)) {
            Iterator<C2587b> it = this.f3058e.iterator();
            while (it.hasNext()) {
                it.next().mo18187u(T);
            }
        }
    }

    /* renamed from: G */
    public final void mo18093G(Format format) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18171e(V, 1, format);
        }
    }

    /* renamed from: H */
    public final void mo18094H(int i, C3014u.C3015a aVar) {
        this.f3061n.mo18145h(i, aVar);
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18156B(T);
        }
    }

    /* renamed from: I */
    public final void mo18095I(int i, long j, long j2) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18180n(V, i, j, j2);
        }
    }

    /* renamed from: J */
    public final void mo18096J(TrackGroupArray trackGroupArray, C3109f fVar) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18190x(U, trackGroupArray, fVar);
        }
    }

    /* renamed from: K */
    public final void mo18097K(C2633d dVar) {
        C2587b.C2588a R = mo18104R();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18161G(R, 2, dVar);
        }
    }

    /* renamed from: L */
    public void mo18098L(int i, int i2) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18192z(V, i, i2);
        }
    }

    /* renamed from: M */
    public final void mo18099M() {
        C2587b.C2588a R = mo18104R();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18176j(R);
        }
    }

    /* renamed from: N */
    public final void mo18100N(int i, @Nullable C3014u.C3015a aVar, C3017v.C3021c cVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18191y(T, cVar);
        }
    }

    /* renamed from: O */
    public final void mo18101O() {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18162H(V);
        }
    }

    @RequiresNonNull({"player"})
    /* renamed from: P */
    public C2587b.C2588a mo18102P(C2578a0 a0Var, int i, @Nullable C3014u.C3015a aVar) {
        if (a0Var.mo18062q()) {
            aVar = null;
        }
        C3014u.C3015a aVar2 = aVar;
        long b = this.f3059l.mo19953b();
        boolean z = true;
        boolean z2 = a0Var == this.f3062o.mo18922h() && i == this.f3062o.mo18919e();
        long j = 0;
        if (aVar2 != null && aVar2.mo19513a()) {
            if (!(z2 && this.f3062o.mo18921g() == aVar2.f5278b && this.f3062o.mo18918d() == aVar2.f5279c)) {
                z = false;
            }
            if (z) {
                j = this.f3062o.mo18923i();
            }
        } else if (z2) {
            j = this.f3062o.mo18920f();
        } else if (!a0Var.mo18062q()) {
            j = a0Var.mo18058m(i, this.f3060m).mo18079a();
        }
        return new C2587b.C2588a(b, a0Var, i, aVar2, j, this.f3062o.mo18923i(), this.f3062o.mo18915a());
    }

    /* renamed from: Q */
    public final C2587b.C2588a mo18103Q(@Nullable C2585b bVar) {
        C3151e.m7757e(this.f3062o);
        if (bVar == null) {
            int e = this.f3062o.mo18919e();
            C2585b o = this.f3061n.mo18152o(e);
            if (o == null) {
                C2578a0 h = this.f3062o.mo18922h();
                if (!(e < h.mo18061p())) {
                    h = C2578a0.f3043a;
                }
                return mo18102P(h, e, (C3014u.C3015a) null);
            }
            bVar = o;
        }
        return mo18102P(bVar.f3064b, bVar.f3065c, bVar.f3063a);
    }

    /* renamed from: R */
    public final C2587b.C2588a mo18104R() {
        return mo18103Q(this.f3061n.mo18139b());
    }

    /* renamed from: S */
    public final C2587b.C2588a mo18105S() {
        return mo18103Q(this.f3061n.mo18140c());
    }

    /* renamed from: T */
    public final C2587b.C2588a mo18106T(int i, @Nullable C3014u.C3015a aVar) {
        C3151e.m7757e(this.f3062o);
        if (aVar != null) {
            C2585b d = this.f3061n.mo18141d(aVar);
            if (d != null) {
                return mo18103Q(d);
            }
            return mo18102P(C2578a0.f3043a, i, aVar);
        }
        C2578a0 h = this.f3062o.mo18922h();
        if (!(i < h.mo18061p())) {
            h = C2578a0.f3043a;
        }
        return mo18102P(h, i, (C3014u.C3015a) null);
    }

    /* renamed from: U */
    public final C2587b.C2588a mo18107U() {
        return mo18103Q(this.f3061n.mo18142e());
    }

    /* renamed from: V */
    public final C2587b.C2588a mo18108V() {
        return mo18103Q(this.f3061n.mo18143f());
    }

    /* renamed from: W */
    public final void mo18109W() {
        if (!this.f3061n.mo18144g()) {
            C2587b.C2588a U = mo18107U();
            this.f3061n.mo18150m();
            Iterator<C2587b> it = this.f3058e.iterator();
            while (it.hasNext()) {
                it.next().mo18159E(U);
            }
        }
    }

    /* renamed from: X */
    public final void mo18110X() {
        for (C2585b bVar : new ArrayList(this.f3061n.f3066a)) {
            mo18092F(bVar.f3065c, bVar.f3063a);
        }
    }

    /* renamed from: a */
    public final void mo18111a(int i) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18164J(V, i);
        }
    }

    /* renamed from: b */
    public final void mo18112b(int i, int i2, int i3, float f) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18168b(V, i, i2, i3, f);
        }
    }

    /* renamed from: c */
    public final void mo18113c(C3206r rVar) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18178l(U, rVar);
        }
    }

    /* renamed from: d */
    public final void mo18114d(boolean z) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18179m(U, z);
        }
    }

    /* renamed from: e */
    public final void mo18115e(int i) {
        this.f3061n.mo18147j(i);
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18174h(U, i);
        }
    }

    /* renamed from: f */
    public final void mo18116f(C2633d dVar) {
        C2587b.C2588a R = mo18104R();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18161G(R, 1, dVar);
        }
    }

    /* renamed from: g */
    public final void mo18117g(C2633d dVar) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18182p(U, 1, dVar);
        }
    }

    /* renamed from: h */
    public final void mo18118h(String str, long j, long j2) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18173g(V, 2, str, j2);
        }
    }

    /* renamed from: i */
    public final void mo18119i(ExoPlaybackException exoPlaybackException) {
        C2587b.C2588a aVar;
        if (exoPlaybackException.type == 0) {
            aVar = mo18105S();
        } else {
            aVar = mo18107U();
        }
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18165K(aVar, exoPlaybackException);
        }
    }

    /* renamed from: j */
    public final void mo18120j(int i, @Nullable C3014u.C3015a aVar, C3017v.C3020b bVar, C3017v.C3021c cVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18169c(T, bVar, cVar);
        }
    }

    /* renamed from: k */
    public final void mo18121k() {
        if (this.f3061n.mo18144g()) {
            this.f3061n.mo18149l();
            C2587b.C2588a U = mo18107U();
            Iterator<C2587b> it = this.f3058e.iterator();
            while (it.hasNext()) {
                it.next().mo18172f(U);
            }
        }
    }

    /* renamed from: l */
    public final void mo18122l() {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18177k(V);
        }
    }

    /* renamed from: m */
    public void mo18123m(float f) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18189w(V, f);
        }
    }

    /* renamed from: n */
    public final void mo18124n(int i, C3014u.C3015a aVar) {
        this.f3061n.mo18148k(aVar);
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18163I(T);
        }
    }

    /* renamed from: o */
    public final void mo18125o(int i, @Nullable C3014u.C3015a aVar, C3017v.C3020b bVar, C3017v.C3021c cVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18170d(T, bVar, cVar);
        }
    }

    public final void onRepeatModeChanged(int i) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18184r(U, i);
        }
    }

    /* renamed from: p */
    public final void mo18127p(Exception exc) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18175i(V, exc);
        }
    }

    /* renamed from: q */
    public final void mo18128q(@Nullable Surface surface) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18160F(V, surface);
        }
    }

    /* renamed from: r */
    public final void mo18129r(int i, long j, long j2) {
        C2587b.C2588a S = mo18105S();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18167a(S, i, j, j2);
        }
    }

    /* renamed from: s */
    public final void mo18130s(String str, long j, long j2) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18173g(V, 1, str, j2);
        }
    }

    /* renamed from: t */
    public final void mo18131t(Metadata metadata) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18183q(U, metadata);
        }
    }

    /* renamed from: u */
    public final void mo18132u() {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18188v(V);
        }
    }

    /* renamed from: v */
    public final void mo18133v(int i, long j) {
        C2587b.C2588a R = mo18104R();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18155A(R, i, j);
        }
    }

    /* renamed from: w */
    public final void mo18134w(int i, @Nullable C3014u.C3015a aVar, C3017v.C3021c cVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18166L(T, cVar);
        }
    }

    /* renamed from: x */
    public final void mo18135x(boolean z, int i) {
        C2587b.C2588a U = mo18107U();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18186t(U, z, i);
        }
    }

    /* renamed from: y */
    public final void mo18136y(int i, @Nullable C3014u.C3015a aVar, C3017v.C3020b bVar, C3017v.C3021c cVar) {
        C2587b.C2588a T = mo18106T(i, aVar);
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18158D(T, bVar, cVar);
        }
    }

    /* renamed from: z */
    public void mo18137z(C2599h hVar) {
        C2587b.C2588a V = mo18108V();
        Iterator<C2587b> it = this.f3058e.iterator();
        while (it.hasNext()) {
            it.next().mo18185s(V, hVar);
        }
    }
}
