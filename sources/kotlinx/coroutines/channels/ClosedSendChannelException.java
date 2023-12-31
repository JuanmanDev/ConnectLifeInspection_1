package kotlinx.coroutines.channels;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo47991d2 = {"Lkotlinx/coroutines/channels/ClosedSendChannelException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Channel.kt */
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(@Nullable String str) {
        super(str);
    }
}
