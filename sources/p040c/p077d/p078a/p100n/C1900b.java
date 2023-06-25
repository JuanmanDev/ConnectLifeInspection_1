package p040c.p077d.p078a.p100n;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.d.a.n.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C1900b {

    /* renamed from: a */
    public final List<ImageHeaderParser> f1510a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo16243a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f1510a.add(imageHeaderParser);
    }

    @NonNull
    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo16244b() {
        return this.f1510a;
    }
}
