package p001a.p004b.p006b;

import androidx.browser.trusted.ConnectionHolder;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: a.b.b.a */
/* compiled from: lambda */
public final /* synthetic */ class C0002a implements CallbackToFutureAdapter.Resolver {

    /* renamed from: a */
    public final /* synthetic */ ConnectionHolder f3a;

    public /* synthetic */ C0002a(ConnectionHolder connectionHolder) {
        this.f3a = connectionHolder;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return this.f3a.mo3493a(completer);
    }
}
