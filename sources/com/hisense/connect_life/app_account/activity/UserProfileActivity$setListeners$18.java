package com.hisense.connect_life.app_account.activity;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.FirstAccountDeleteDialog;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.listener.IItemCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity$setListeners$18 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ UserProfileActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserProfileActivity$setListeners$18(UserProfileActivity userProfileActivity) {
        super(1);
        this.this$0 = userProfileActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        FirstAccountDeleteDialog firstAccountDeleteDialog = new FirstAccountDeleteDialog(this.this$0.getDomain(), this.this$0.userEmail);
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(firstAccountDeleteDialog, supportFragmentManager);
        final UserProfileActivity userProfileActivity = this.this$0;
        firstAccountDeleteDialog.setIItemCallback(new IItemCallback<String>() {
            public void cancel() {
            }

            public void accept(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "item");
                AccountViewModel.deleteAccount$default(UserProfileActivity.access$getMViewModel(userProfileActivity), str, (String) null, 2, (Object) null);
            }
        });
    }
}
