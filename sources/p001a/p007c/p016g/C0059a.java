package p001a.p007c.p016g;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: a.c.g.a */
/* compiled from: lambda */
public final /* synthetic */ class C0059a implements LifecycleEventObserver {

    /* renamed from: e */
    public final /* synthetic */ MenuHostHelper f89e;

    /* renamed from: l */
    public final /* synthetic */ Lifecycle.State f90l;

    /* renamed from: m */
    public final /* synthetic */ MenuProvider f91m;

    public /* synthetic */ C0059a(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.f89e = menuHostHelper;
        this.f90l = state;
        this.f91m = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f89e.mo6868b(this.f90l, this.f91m, lifecycleOwner, event);
    }
}
