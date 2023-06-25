package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.widget.MultiSelectionDialog;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RegisterInputUserInfoActivity.kt */
public final class RegisterInputUserInfoActivity$setListeners$5 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ RegisterInputUserInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterInputUserInfoActivity$setListeners$5(RegisterInputUserInfoActivity registerInputUserInfoActivity) {
        super(1);
        this.this$0 = registerInputUserInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        RegisterInputUserInfoActivity registerInputUserInfoActivity = this.this$0;
        String string = this.this$0.getString(R$string.f15734mr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mr)");
        String string2 = this.this$0.getString(R$string.f15735ms);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.ms)");
        String string3 = this.this$0.getString(R$string.setting_title_placeholder);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.setting_title_placeholder)");
        registerInputUserInfoActivity.dropDownTitleDialog = new MultiSelectionDialog(new String[]{string, string2}, string3, 0, 4, (DefaultConstructorMarker) null);
        MultiSelectionDialog access$getDropDownTitleDialog$p = this.this$0.dropDownTitleDialog;
        if (access$getDropDownTitleDialog$p != null) {
            final RegisterInputUserInfoActivity registerInputUserInfoActivity2 = this.this$0;
            access$getDropDownTitleDialog$p.setCallback(new MultiSelectionDialog.ISelectSelection() {
                public void onSelectionSelected(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "selection");
                    ((TextView) registerInputUserInfoActivity2._$_findCachedViewById(R$id.drop_down_title)).setText(str);
                    RegisterInputUserInfoActivity registerInputUserInfoActivity = registerInputUserInfoActivity2;
                    boolean z = ((TextView) registerInputUserInfoActivity._$_findCachedViewById(R$id.drop_down_title)).getText().toString().length() == 0;
                    ImageView imageView = (ImageView) registerInputUserInfoActivity2._$_findCachedViewById(R$id.iv_title_dot);
                    Intrinsics.checkNotNullExpressionValue(imageView, "iv_title_dot");
                    registerInputUserInfoActivity.showDot(z, imageView);
                    registerInputUserInfoActivity2.checkConditions();
                }
            });
        }
        MultiSelectionDialog access$getDropDownTitleDialog$p2 = this.this$0.dropDownTitleDialog;
        if (access$getDropDownTitleDialog$p2 != null) {
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            JuConnectExtKt.displayDialog(access$getDropDownTitleDialog$p2, supportFragmentManager);
        }
    }
}
