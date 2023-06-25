package p040c.p077d.p078a.p081k.p084j.p085a0;

import android.content.Context;
import java.io.File;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1616d;

/* renamed from: c.d.a.k.j.a0.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C1619f extends C1616d {

    /* renamed from: c.d.a.k.j.a0.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    public class C1620a implements C1616d.C1617a {

        /* renamed from: a */
        public final /* synthetic */ Context f985a;

        /* renamed from: b */
        public final /* synthetic */ String f986b;

        public C1620a(Context context, String str) {
            this.f985a = context;
            this.f986b = str;
        }

        /* renamed from: a */
        public File mo15700a() {
            File cacheDir = this.f985a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f986b != null ? new File(cacheDir, this.f986b) : cacheDir;
        }
    }

    public C1619f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C1619f(Context context, String str, long j) {
        super(new C1620a(context, str), j);
    }
}
