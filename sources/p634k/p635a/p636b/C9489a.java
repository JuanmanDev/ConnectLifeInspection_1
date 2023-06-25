package p634k.p635a.p636b;

import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* renamed from: k.a.b.a */
/* compiled from: lambda */
public final /* synthetic */ class C9489a implements DisposableHandle {

    /* renamed from: e */
    public final /* synthetic */ HandlerContext f18795e;

    /* renamed from: l */
    public final /* synthetic */ Runnable f18796l;

    public /* synthetic */ C9489a(HandlerContext handlerContext, Runnable runnable) {
        this.f18795e = handlerContext;
        this.f18796l = runnable;
    }

    public final void dispose() {
        HandlerContext.m28780invokeOnTimeout$lambda3(this.f18795e, this.f18796l);
    }
}
