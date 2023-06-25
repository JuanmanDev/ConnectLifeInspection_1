package p040c.p200q.p201a.p219b.p260n0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.b.n0.h */
/* compiled from: DataSource */
public interface C3122h {

    /* renamed from: c.q.a.b.n0.h$a */
    /* compiled from: DataSource */
    public interface C3123a {
        /* renamed from: a */
        C3122h mo19884a();
    }

    /* renamed from: b */
    void mo19308b(C3141v vVar);

    /* renamed from: c */
    long mo19309c(C3125j jVar);

    void close();

    /* renamed from: d */
    Map<String, List<String>> mo19311d() {
        return Collections.emptyMap();
    }

    @Nullable
    /* renamed from: e */
    Uri mo19312e();

    int read(byte[] bArr, int i, int i2);
}
