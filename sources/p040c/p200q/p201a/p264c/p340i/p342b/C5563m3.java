package p040c.p200q.p201a.p264c.p340i.p342b;

import androidx.annotation.WorkerThread;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

@WorkerThread
/* renamed from: c.q.a.c.i.b.m3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5563m3 implements Runnable {

    /* renamed from: e */
    public final C5539k3 f10667e;

    /* renamed from: l */
    public final int f10668l;

    /* renamed from: m */
    public final Throwable f10669m;

    /* renamed from: n */
    public final byte[] f10670n;

    /* renamed from: o */
    public final String f10671o;

    /* renamed from: p */
    public final Map f10672p;

    public /* synthetic */ C5563m3(String str, C5539k3 k3Var, int i, Throwable th, byte[] bArr, Map map, C5551l3 l3Var) {
        C3495o.m8908j(k3Var);
        this.f10667e = k3Var;
        this.f10668l = i;
        this.f10669m = th;
        this.f10670n = bArr;
        this.f10671o = str;
        this.f10672p = map;
    }

    public final void run() {
        this.f10667e.mo28365a(this.f10671o, this.f10668l, this.f10669m, this.f10670n, this.f10672p);
    }
}
