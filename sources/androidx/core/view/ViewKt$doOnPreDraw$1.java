package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "run"}, mo47992k = 3, mo47993mv = {1, 7, 1}, mo47995xi = 176)
/* compiled from: View.kt */
public final class ViewKt$doOnPreDraw$1 implements Runnable {
    public final /* synthetic */ Function1<View, Unit> $action;
    public final /* synthetic */ View $this_doOnPreDraw;

    public ViewKt$doOnPreDraw$1(Function1<? super View, Unit> function1, View view) {
        this.$action = function1;
        this.$this_doOnPreDraw = view;
    }

    public final void run() {
        this.$action.invoke(this.$this_doOnPreDraw);
    }
}
