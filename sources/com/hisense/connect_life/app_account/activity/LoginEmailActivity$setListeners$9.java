package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.widget.MultiSelectionDialog;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoginEmailActivity.kt */
public final class LoginEmailActivity$setListeners$9 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ LoginEmailActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginEmailActivity$setListeners$9(LoginEmailActivity loginEmailActivity) {
        super(1);
        this.this$0 = loginEmailActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (!AccountUtils.Companion.userEmails().isEmpty()) {
            int size = AccountUtils.Companion.userEmails().size();
            String[] strArr = new String[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = "";
            }
            for (T next : AccountUtils.Companion.userEmails()) {
                int i3 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                strArr[i] = (String) next;
                i = i3;
            }
            String string = this.this$0.getString(R$string.email);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.email)");
            MultiSelectionDialog multiSelectionDialog = new MultiSelectionDialog(strArr, string, 0, 4, (DefaultConstructorMarker) null);
            final LoginEmailActivity loginEmailActivity = this.this$0;
            multiSelectionDialog.setCallback(new MultiSelectionDialog.ISelectSelection() {
                public void onSelectionSelected(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "selection");
                    ((EditText) loginEmailActivity._$_findCachedViewById(R$id.sign_email)).setText(str);
                    LoginEmailActivity loginEmailActivity = loginEmailActivity;
                    String string = loginEmailActivity.getString(R$string.change_email_tips_2);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.change_email_tips_2)");
                    loginEmailActivity.showEmailError(!loginEmailActivity.checkEmailFormat(), string);
                }
            });
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            JuConnectExtKt.displayDialog(multiSelectionDialog, supportFragmentManager);
        }
    }
}
