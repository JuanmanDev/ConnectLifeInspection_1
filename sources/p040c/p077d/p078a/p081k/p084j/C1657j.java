package p040c.p077d.p078a.p081k.p084j;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: c.d.a.k.j.j */
/* compiled from: DiskCacheStrategy */
public abstract class C1657j {

    /* renamed from: a */
    public static final C1657j f1107a = new C1658a();

    /* renamed from: b */
    public static final C1657j f1108b = new C1659b();

    /* renamed from: c */
    public static final C1657j f1109c = new C1660c();

    /* renamed from: d */
    public static final C1657j f1110d = new C1661d();

    /* renamed from: c.d.a.k.j.j$a */
    /* compiled from: DiskCacheStrategy */
    public class C1658a extends C1657j {
        /* renamed from: a */
        public boolean mo15818a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo15819b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo15820c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo15821d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: c.d.a.k.j.j$b */
    /* compiled from: DiskCacheStrategy */
    public class C1659b extends C1657j {
        /* renamed from: a */
        public boolean mo15818a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo15819b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo15820c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public boolean mo15821d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: c.d.a.k.j.j$c */
    /* compiled from: DiskCacheStrategy */
    public class C1660c extends C1657j {
        /* renamed from: a */
        public boolean mo15818a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo15819b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo15820c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo15821d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: c.d.a.k.j.j$d */
    /* compiled from: DiskCacheStrategy */
    public class C1661d extends C1657j {
        /* renamed from: a */
        public boolean mo15818a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo15819b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo15820c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: d */
        public boolean mo15821d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo15818a();

    /* renamed from: b */
    public abstract boolean mo15819b();

    /* renamed from: c */
    public abstract boolean mo15820c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo15821d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
