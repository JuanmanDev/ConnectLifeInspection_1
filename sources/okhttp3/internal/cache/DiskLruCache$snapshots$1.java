package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00060\u0006R\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00070\u000eR\u00020\u00070\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\b\u0018\u00010\u0006R\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\b\u0018\u00010\u0006R\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, mo47991d2 = {"okhttp3/internal/cache/DiskLruCache$snapshots$1", "Ljava/util/Iterator;", "Lkotlin/jvm/internal/markers/KMutableIterator;", "", "hasNext", "()Z", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "next", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "remove", "()V", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "kotlin.jvm.PlatformType", "delegate", "Ljava/util/Iterator;", "getDelegate", "()Ljava/util/Iterator;", "nextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "getNextSnapshot", "setNextSnapshot", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;)V", "removeSnapshot", "getRemoveSnapshot", "setRemoveSnapshot", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, KMutableIterator {
    @NotNull
    public final Iterator<DiskLruCache.Entry> delegate;
    @Nullable
    public DiskLruCache.Snapshot nextSnapshot;
    @Nullable
    public DiskLruCache.Snapshot removeSnapshot;
    public final /* synthetic */ DiskLruCache this$0;

    public DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    @NotNull
    public final Iterator<DiskLruCache.Entry> getDelegate() {
        return this.delegate;
    }

    @Nullable
    public final DiskLruCache.Snapshot getNextSnapshot() {
        return this.nextSnapshot;
    }

    @Nullable
    public final DiskLruCache.Snapshot getRemoveSnapshot() {
        return this.removeSnapshot;
    }

    public boolean hasNext() {
        DiskLruCache.Snapshot snapshot$okhttp;
        if (this.nextSnapshot != null) {
            return true;
        }
        synchronized (this.this$0) {
            if (this.this$0.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null && (snapshot$okhttp = next.snapshot$okhttp()) != null) {
                    this.nextSnapshot = snapshot$okhttp;
                    return true;
                }
            }
            Unit unit = Unit.INSTANCE;
            return false;
        }
    }

    public void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }

    public final void setNextSnapshot(@Nullable DiskLruCache.Snapshot snapshot) {
        this.nextSnapshot = snapshot;
    }

    public final void setRemoveSnapshot(@Nullable DiskLruCache.Snapshot snapshot) {
        this.removeSnapshot = snapshot;
    }

    @NotNull
    public DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            if (snapshot == null) {
                Intrinsics.throwNpe();
            }
            return snapshot;
        }
        throw new NoSuchElementException();
    }
}
