package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, mo47991d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "hintOnError", "", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@InternalCoroutinesApi
/* compiled from: MainDispatcherFactory.kt */
public interface MainDispatcherFactory {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MainDispatcherFactory.kt */
    public static final class DefaultImpls {
        @Nullable
        public static String hintOnError(@NotNull MainDispatcherFactory mainDispatcherFactory) {
            return null;
        }
    }

    @NotNull
    MainCoroutineDispatcher createDispatcher(@NotNull List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}
