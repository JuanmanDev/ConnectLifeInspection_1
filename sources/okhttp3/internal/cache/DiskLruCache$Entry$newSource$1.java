package okhttp3.internal.cache;

import kotlin.Metadata;
import kotlin.Unit;
import okhttp3.internal.cache.DiskLruCache;
import okio.ForwardingSource;
import okio.Source;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, mo47991d2 = {"okhttp3/internal/cache/DiskLruCache$Entry$newSource$1", "Lokio/ForwardingSource;", "", "close", "()V", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$Entry$newSource$1 extends ForwardingSource {
    public final /* synthetic */ Source $fileSource;
    public boolean closed;
    public final /* synthetic */ DiskLruCache.Entry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Entry$newSource$1(DiskLruCache.Entry entry, Source source, Source source2) {
        super(source2);
        this.this$0 = entry;
        this.$fileSource = source;
    }

    public void close() {
        super.close();
        if (!this.closed) {
            this.closed = true;
            synchronized (DiskLruCache.this) {
                DiskLruCache.Entry entry = this.this$0;
                entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                if (this.this$0.getLockingSourceCount$okhttp() == 0 && this.this$0.getZombie$okhttp()) {
                    DiskLruCache.this.removeEntry$okhttp(this.this$0);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }
}
