package com.juconnect.connectlife.retrofit;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HttpClientFactory.kt */
public final class HttpClientFactory$client$2 extends Lambda implements Function0<OkHttpClient> {
    public final /* synthetic */ HttpClientFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpClientFactory$client$2(HttpClientFactory httpClientFactory) {
        super(0);
        this.this$0 = httpClientFactory;
    }

    @NotNull
    public final OkHttpClient invoke() {
        return this.this$0.getDefaultClient();
    }
}
