package p040c.p200q.p201a.p264c.p276d.p281j;

import android.app.Activity;
import android.content.Intent;

/* renamed from: c.q.a.c.d.j.c0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3451c0 extends C3463e0 {

    /* renamed from: e */
    public final /* synthetic */ Intent f6403e;

    /* renamed from: l */
    public final /* synthetic */ Activity f6404l;

    /* renamed from: m */
    public final /* synthetic */ int f6405m;

    public C3451c0(Intent intent, Activity activity, int i) {
        this.f6403e = intent;
        this.f6404l = activity;
        this.f6405m = i;
    }

    /* renamed from: a */
    public final void mo20645a() {
        Intent intent = this.f6403e;
        if (intent != null) {
            this.f6404l.startActivityForResult(intent, this.f6405m);
        }
    }
}
