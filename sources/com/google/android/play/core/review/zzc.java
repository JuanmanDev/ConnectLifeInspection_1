package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p348d.p349a.p350a.C5820f;

/* compiled from: com.google.android.play:review@@2.0.1 */
public final class zzc extends ResultReceiver {

    /* renamed from: e */
    public final /* synthetic */ C5773k f14997e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzc(C5820f fVar, Handler handler, C5773k kVar) {
        super(handler);
        this.f14997e = kVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f14997e.mo28863e(null);
    }
}
