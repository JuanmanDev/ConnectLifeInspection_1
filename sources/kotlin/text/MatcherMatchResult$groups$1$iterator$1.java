package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Regex.kt */
public final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements Function1<Integer, MatchGroup> {
    public final /* synthetic */ MatcherMatchResult$groups$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatcherMatchResult$groups$1$iterator$1(MatcherMatchResult$groups$1 matcherMatchResult$groups$1) {
        super(1);
        this.this$0 = matcherMatchResult$groups$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @Nullable
    public final MatchGroup invoke(int i) {
        return this.this$0.get(i);
    }
}
