package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k;

/* renamed from: c.q.a.c.d.j.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3465f<T extends IInterface> extends C3453d<T> implements C3334a.C3342f {

    /* renamed from: I */
    public final C3461e f6452I;

    /* renamed from: J */
    public final Set<Scope> f6453J;
    @Nullable

    /* renamed from: K */
    public final Account f6454K;

    @Deprecated
    public C3465f(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C3461e eVar, @NonNull C3348d.C3349a aVar, @NonNull C3348d.C3350b bVar) {
        this(context, looper, i, eVar, (C3372e) aVar, (C3390k) bVar);
    }

    @NonNull
    /* renamed from: A */
    public final Set<Scope> mo20647A() {
        return this.f6453J;
    }

    @NonNull
    /* renamed from: a */
    public Set<Scope> mo20421a() {
        return mo20676m() ? this.f6453J : Collections.emptySet();
    }

    @NonNull
    /* renamed from: h0 */
    public final C3461e mo20716h0() {
        return this.f6452I;
    }

    @NonNull
    /* renamed from: i0 */
    public Set<Scope> mo20717i0(@NonNull Set<Scope> set) {
        return set;
    }

    /* renamed from: j0 */
    public final Set<Scope> mo20718j0(@NonNull Set<Scope> set) {
        mo20717i0(set);
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Nullable
    /* renamed from: s */
    public final Account mo20680s() {
        return this.f6454K;
    }

    @Nullable
    /* renamed from: u */
    public final Executor mo20682u() {
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3465f(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull android.os.Looper r11, int r12, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p281j.C3461e r13, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e r14, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k r15) {
        /*
            r9 = this;
            c.q.a.c.d.j.g r3 = p040c.p200q.p201a.p264c.p276d.p281j.C3468g.m8857b(r10)
            c.q.a.c.d.b r4 = p040c.p200q.p201a.p264c.p276d.C3324b.m8405m()
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r14)
            r7 = r14
            c.q.a.c.d.g.l.e r7 = (p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e) r7
            p040c.p200q.p201a.p264c.p276d.p281j.C3495o.m8908j(r15)
            r8 = r15
            c.q.a.c.d.g.l.k r8 = (p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3465f.<init>(android.content.Context, android.os.Looper, int, c.q.a.c.d.j.e, c.q.a.c.d.g.l.e, c.q.a.c.d.g.l.k):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3465f(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull android.os.Looper r12, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p281j.C3468g r13, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.C3324b r14, int r15, @androidx.annotation.NonNull p040c.p200q.p201a.p264c.p276d.p281j.C3461e r16, @androidx.annotation.Nullable p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3372e r17, @androidx.annotation.Nullable p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3390k r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            c.q.a.c.d.j.f0 r3 = new c.q.a.c.d.j.f0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            c.q.a.c.d.j.g0 r0 = new c.q.a.c.d.j.g0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo20705j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f6452I = r0
            android.accounts.Account r1 = r16.mo20696a()
            r9.f6454K = r1
            java.util.Set r0 = r16.mo20699d()
            r10.mo20718j0(r0)
            r9.f6453J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3465f.<init>(android.content.Context, android.os.Looper, c.q.a.c.d.j.g, c.q.a.c.d.b, int, c.q.a.c.d.j.e, c.q.a.c.d.g.l.e, c.q.a.c.d.g.l.k):void");
    }
}
