package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÿ\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo47991d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "(ILkotlin/Function2;Lkotlin/Function1;Lkotlin/Function4;)Landroidx/collection/LruCache;", "collection-ktx"}, mo47992k = 2, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: LruCache.kt */
public final class LruCacheKt {
    @NotNull
    public static final <K, V> LruCache<K, V> lruCache(int i, @NotNull Function2<? super K, ? super V, Integer> function2, @NotNull Function1<? super K, ? extends V> function1, @NotNull Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
        return new LruCacheKt$lruCache$4(function2, function1, function4, i, i);
    }

    @NotNull
    public static /* synthetic */ LruCache lruCache$default(int i, Function2 function2, Function1 function1, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = LruCacheKt$lruCache$1.INSTANCE;
        }
        Function2 function22 = function2;
        if ((i2 & 4) != 0) {
            function1 = LruCacheKt$lruCache$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i2 & 8) != 0) {
            function4 = LruCacheKt$lruCache$3.INSTANCE;
        }
        return new LruCacheKt$lruCache$4(function22, function12, function4, i, i);
    }
}
