package p040c.p472t.p473a;

import android.app.Activity;
import com.hjq.permissions.PermissionFragment;
import java.util.ArrayList;

/* renamed from: c.t.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7564a implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ PermissionFragment.C8648b f14266e;

    /* renamed from: l */
    public final /* synthetic */ Activity f14267l;

    /* renamed from: m */
    public final /* synthetic */ ArrayList f14268m;

    /* renamed from: n */
    public final /* synthetic */ ArrayList f14269n;

    /* renamed from: o */
    public final /* synthetic */ int f14270o;

    public /* synthetic */ C7564a(PermissionFragment.C8648b bVar, Activity activity, ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f14266e = bVar;
        this.f14267l = activity;
        this.f14268m = arrayList;
        this.f14269n = arrayList2;
        this.f14270o = i;
    }

    public final void run() {
        this.f14266e.mo42926a(this.f14267l, this.f14268m, this.f14269n, this.f14270o);
    }
}
