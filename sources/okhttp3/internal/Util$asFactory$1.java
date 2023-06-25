package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.EventListener;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000\u0015\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"okhttp3/internal/Util$asFactory$1", "okhttp3/EventListener$Factory", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "create", "(Lokhttp3/Call;)Lokhttp3/EventListener;", "okhttp"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Util.kt */
public final class Util$asFactory$1 implements EventListener.Factory {
    public final /* synthetic */ EventListener $this_asFactory;

    public Util$asFactory$1(EventListener eventListener) {
        this.$this_asFactory = eventListener;
    }

    @NotNull
    public EventListener create(@NotNull Call call) {
        return this.$this_asFactory;
    }
}
