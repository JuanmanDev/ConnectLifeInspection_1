package p001a.p007c.p016g;

import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;

/* renamed from: a.c.g.f */
/* compiled from: lambda */
public final /* synthetic */ class C0064f implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ WindowInsetsControllerCompat.Impl30 f98a;

    /* renamed from: b */
    public final /* synthetic */ WindowInsetsControllerCompat.OnControllableInsetsChangedListener f99b;

    public /* synthetic */ C0064f(WindowInsetsControllerCompat.Impl30 impl30, WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f98a = impl30;
        this.f99b = onControllableInsetsChangedListener;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f98a.mo7183a(this.f99b, windowInsetsController, i);
    }
}
