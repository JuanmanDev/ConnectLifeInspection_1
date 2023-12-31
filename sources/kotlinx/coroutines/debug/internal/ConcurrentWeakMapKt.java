package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\b\u0010\b\u001a\u00020\tH\u0002\u001a\u000e\u0010\n\u001a\u00020\u0003*\u0004\u0018\u00010\u000bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"MAGIC", "", "MARKED_NULL", "Lkotlinx/coroutines/debug/internal/Marked;", "MARKED_TRUE", "MIN_CAPACITY", "REHASH", "Lkotlinx/coroutines/internal/Symbol;", "noImpl", "", "mark", "", "kotlinx-coroutines-core"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConcurrentWeakMap.kt */
public final class ConcurrentWeakMapKt {
    public static final int MAGIC = -1640531527;
    @NotNull
    public static final Marked MARKED_NULL = new Marked((Object) null);
    @NotNull
    public static final Marked MARKED_TRUE = new Marked(Boolean.TRUE);
    public static final int MIN_CAPACITY = 16;
    @NotNull
    public static final Symbol REHASH = new Symbol("REHASH");

    public static final Marked mark(Object obj) {
        if (obj == null) {
            return MARKED_NULL;
        }
        if (Intrinsics.areEqual(obj, (Object) Boolean.TRUE)) {
            return MARKED_TRUE;
        }
        return new Marked(obj);
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("not implemented");
    }
}
