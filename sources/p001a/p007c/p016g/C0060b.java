package p001a.p007c.p016g;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: a.c.g.b */
/* compiled from: lambda */
public final /* synthetic */ class C0060b implements LifecycleEventObserver {

    /* renamed from: e */
    public final /* synthetic */ MenuHostHelper f92e;

    /* renamed from: l */
    public final /* synthetic */ MenuProvider f93l;

    public /* synthetic */ C0060b(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.f92e = menuHostHelper;
        this.f93l = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f92e.mo6864a(this.f93l, lifecycleOwner, event);
    }
}
