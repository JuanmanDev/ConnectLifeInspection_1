package com.hisense.connect_life.app_account.activity;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.hisense.connect_life.app_account.R$font;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInputEmaliActiviy.kt */
public final class RegisterInputEmaliActiviy$extraFont$2 extends Lambda implements Function0<Typeface> {
    public final /* synthetic */ RegisterInputEmaliActiviy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterInputEmaliActiviy$extraFont$2(RegisterInputEmaliActiviy registerInputEmaliActiviy) {
        super(0);
        this.this$0 = registerInputEmaliActiviy;
    }

    @Nullable
    public final Typeface invoke() {
        return ResourcesCompat.getFont(this.this$0, R$font.proximanova_extrabold);
    }
}