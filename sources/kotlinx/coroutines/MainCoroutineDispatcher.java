package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo47991d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "limitedParallelism", "parallelism", "", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    @NotNull
    public abstract MainCoroutineDispatcher getImmediate();

    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        LimitedDispatcherKt.checkParallelism(i);
        return this;
    }

    @NotNull
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @Nullable
    @InternalCoroutinesApi
    public final String toStringInternalImpl() {
        MainCoroutineDispatcher mainCoroutineDispatcher;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = main.getImmediate();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this == mainCoroutineDispatcher) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
