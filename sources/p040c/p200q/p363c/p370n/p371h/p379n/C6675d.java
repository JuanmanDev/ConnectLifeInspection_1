package p040c.p200q.p363c.p370n.p371h.p379n;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: c.q.c.n.h.n.d */
/* compiled from: lambda */
public final /* synthetic */ class C6675d implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C6675d f12753a = new C6675d();

    private /* synthetic */ C6675d() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
