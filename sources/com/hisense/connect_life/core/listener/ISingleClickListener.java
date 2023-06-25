package com.hisense.connect_life.core.listener;

import android.view.View;
import com.hisense.connect_life.core.utils.FastClickUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/core/listener/ISingleClickListener;", "Landroid/view/View$OnClickListener;", "accept", "", "v", "Landroid/view/View;", "onClick", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ISingleClickListener.kt */
public interface ISingleClickListener extends View.OnClickListener {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ISingleClickListener.kt */
    public static final class DefaultImpls {
        public static void onClick(@NotNull ISingleClickListener iSingleClickListener, @Nullable View view) {
            Intrinsics.checkNotNullParameter(iSingleClickListener, "this");
            if (FastClickUtils.Companion.isCanClick()) {
                iSingleClickListener.accept(view);
            }
        }
    }

    void accept(@Nullable View view);

    void onClick(@Nullable View view);
}
