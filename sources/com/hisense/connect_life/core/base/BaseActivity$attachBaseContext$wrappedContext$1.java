package com.hisense.connect_life.core.base;

import android.content.Context;
import android.content.res.Configuration;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo47991d2 = {"com/hisense/connect_life/core/base/BaseActivity$attachBaseContext$wrappedContext$1", "Landroidx/appcompat/view/ContextThemeWrapper;", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseActivity.kt */
public final class BaseActivity$attachBaseContext$wrappedContext$1 extends ContextThemeWrapper {
    public final /* synthetic */ Configuration $config;
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseActivity$attachBaseContext$wrappedContext$1(Context context, Configuration configuration, int i) {
        super(context, i);
        this.$context = context;
        this.$config = configuration;
    }

    public void applyOverrideConfiguration(@Nullable Configuration configuration) {
        if (configuration != null) {
            configuration.setTo(this.$config);
        }
        super.applyOverrideConfiguration(configuration);
    }
}
