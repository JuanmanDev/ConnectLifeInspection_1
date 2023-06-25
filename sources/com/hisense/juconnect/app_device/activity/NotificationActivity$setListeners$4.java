package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.fragment.AlertdFragment;
import com.hisense.juconnect.app_device.fragment.AllFragment;
import com.hisense.juconnect.app_device.fragment.InventoryFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationActivity.kt */
public final class NotificationActivity$setListeners$4 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ NotificationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationActivity$setListeners$4(NotificationActivity notificationActivity) {
        super(1);
        this.this$0 = notificationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        if (!Intrinsics.areEqual((Object) ((TextView) this.this$0._$_findCachedViewById(R$id.notification_select_counts)).getText(), (Object) "0")) {
            Fragment access$getCurrentFragment$p = this.this$0.currentFragment;
            AllFragment allFragment = null;
            if (access$getCurrentFragment$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
                access$getCurrentFragment$p = null;
            }
            AllFragment access$getAllFragment$p = this.this$0.allFragment;
            if (access$getAllFragment$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFragment");
                access$getAllFragment$p = null;
            }
            if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) access$getAllFragment$p)) {
                AllFragment access$getAllFragment$p2 = this.this$0.allFragment;
                if (access$getAllFragment$p2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFragment");
                } else {
                    allFragment = access$getAllFragment$p2;
                }
                allFragment.deleteNotification();
            } else {
                InventoryFragment access$getInventoryFragment$p = this.this$0.inventoryFragment;
                if (access$getInventoryFragment$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                    access$getInventoryFragment$p = null;
                }
                if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) access$getInventoryFragment$p)) {
                    InventoryFragment access$getInventoryFragment$p2 = this.this$0.inventoryFragment;
                    if (access$getInventoryFragment$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                    } else {
                        allFragment = access$getInventoryFragment$p2;
                    }
                    allFragment.deleteNotification();
                } else {
                    AlertdFragment access$getAlertdFragment$p = this.this$0.alertdFragment;
                    if (access$getAlertdFragment$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                        access$getAlertdFragment$p = null;
                    }
                    if (Intrinsics.areEqual((Object) access$getCurrentFragment$p, (Object) access$getAlertdFragment$p)) {
                        AlertdFragment access$getAlertdFragment$p2 = this.this$0.alertdFragment;
                        if (access$getAlertdFragment$p2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                        } else {
                            allFragment = access$getAlertdFragment$p2;
                        }
                        allFragment.deleteNotification();
                    }
                }
            }
            ((TextView) this.this$0._$_findCachedViewById(R$id.top_next)).setText(this.this$0.getString(R$string.select));
            this.this$0.setSaveCVVisible(false);
            this.this$0.logSelectCount(0);
            NotificationActivity notificationActivity = this.this$0;
            String string = notificationActivity.getString(R$string.delete_success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.delete_success)");
            notificationActivity.showString(string);
            this.this$0.setSelectTextShow();
        }
    }
}
