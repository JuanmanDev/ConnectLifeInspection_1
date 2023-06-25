package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, mo47991d2 = {"okhttp3/Interceptor$Companion$invoke$1", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Interceptor.kt */
public final class OkHttpClient$Builder$addInterceptor$$inlined$invoke$1 implements Interceptor {
    public final /* synthetic */ Function1 $block$inlined;

    public OkHttpClient$Builder$addInterceptor$$inlined$invoke$1(Function1 function1) {
        this.$block$inlined = function1;
    }

    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        return (Response) this.$block$inlined.invoke(chain);
    }
}
