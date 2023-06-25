package p040c.p200q.p201a.p219b;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p220b0.C2583a;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p259m0.C3110g;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p260n0.C3127l;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.h */
/* compiled from: ExoPlayerFactory */
public final class C2827h {
    @Nullable

    /* renamed from: a */
    public static C3118e f4397a;

    /* renamed from: a */
    public static synchronized C3118e m6033a() {
        C3118e eVar;
        synchronized (C2827h.class) {
            if (f4397a == null) {
                f4397a = new C3127l.C3129b().mo19904a();
            }
            eVar = f4397a;
        }
        return eVar;
    }

    /* renamed from: b */
    public static C3217z m6034b(Context context, C3215x xVar, C3110g gVar) {
        return m6035c(context, xVar, gVar, new C2638e());
    }

    /* renamed from: c */
    public static C3217z m6035c(Context context, C3215x xVar, C3110g gVar, C3098m mVar) {
        return m6036d(context, xVar, gVar, mVar, (C2650i<C2656m>) null, C3152e0.m7765E());
    }

    /* renamed from: d */
    public static C3217z m6036d(Context context, C3215x xVar, C3110g gVar, C3098m mVar, @Nullable C2650i<C2656m> iVar, Looper looper) {
        return m6037e(context, xVar, gVar, mVar, iVar, new C2583a.C2584a(), looper);
    }

    /* renamed from: e */
    public static C3217z m6037e(Context context, C3215x xVar, C3110g gVar, C3098m mVar, @Nullable C2650i<C2656m> iVar, C2583a.C2584a aVar, Looper looper) {
        return m6038f(context, xVar, gVar, mVar, iVar, m6033a(), aVar, looper);
    }

    /* renamed from: f */
    public static C3217z m6038f(Context context, C3215x xVar, C3110g gVar, C3098m mVar, @Nullable C2650i<C2656m> iVar, C3118e eVar, C2583a.C2584a aVar, Looper looper) {
        return new C3217z(context, xVar, gVar, mVar, iVar, eVar, aVar, looper);
    }

    /* renamed from: g */
    public static C3217z m6039g(Context context, C3110g gVar) {
        return m6034b(context, new C2822g(context), gVar);
    }
}
