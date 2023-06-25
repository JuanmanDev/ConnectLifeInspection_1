package p001a.p004b.p006b;

import android.net.Uri;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;

/* renamed from: a.b.b.c */
/* compiled from: lambda */
public final /* synthetic */ class C0004c implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ TrustedWebActivityServiceConnectionPool f5e;

    /* renamed from: l */
    public final /* synthetic */ Uri f6l;

    public /* synthetic */ C0004c(TrustedWebActivityServiceConnectionPool trustedWebActivityServiceConnectionPool, Uri uri) {
        this.f5e = trustedWebActivityServiceConnectionPool;
        this.f6l = uri;
    }

    public final void run() {
        this.f5e.mo3557a(this.f6l);
    }
}
