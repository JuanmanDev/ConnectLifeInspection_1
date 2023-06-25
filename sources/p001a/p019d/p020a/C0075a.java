package p001a.p019d.p020a;

import androidx.emoji2.text.ConcurrencyHelpers;
import java.util.concurrent.ThreadFactory;

/* renamed from: a.d.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C0075a implements ThreadFactory {

    /* renamed from: e */
    public final /* synthetic */ String f110e;

    public /* synthetic */ C0075a(String str) {
        this.f110e = str;
    }

    public final Thread newThread(Runnable runnable) {
        return ConcurrencyHelpers.m91a(this.f110e, runnable);
    }
}
