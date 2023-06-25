package com.hisense.juconnect.app_device.activity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.fragment.AlertdFragment;
import com.hisense.juconnect.app_device.fragment.AllFragment;
import com.hisense.juconnect.app_device.fragment.InventoryFragment;
import com.hisense.juconnect.app_device.viewmodel.MessageViewModel;
import com.juconnect.connectlife.sql.NotificationRoom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7508n;
import p040c.p429r.p460b.p461a.p462a.C7529x0;

@Metadata(mo47990d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0015J\b\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000fJ\b\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\""}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/NotificationActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "()V", "alertdFragment", "Lcom/hisense/juconnect/app_device/fragment/AlertdFragment;", "allFragment", "Lcom/hisense/juconnect/app_device/fragment/AllFragment;", "currentFragment", "Landroidx/fragment/app/Fragment;", "inventoryFragment", "Lcom/hisense/juconnect/app_device/fragment/InventoryFragment;", "allSelect", "", "bindLayout", "", "getUnReadMessage", "hideSelect", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "loadData", "logSelectCount", "selectCount", "onDestroy", "setListeners", "setSaveCVVisible", "isShow", "", "setSelectTextShow", "showSelect", "subscribeObservable", "switchFragment", "fragment", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/NotificationActivity")
/* compiled from: NotificationActivity.kt */
public final class NotificationActivity extends BaseVmActivity<MessageViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public AlertdFragment alertdFragment;
    public AllFragment allFragment;
    public Fragment currentFragment;
    public InventoryFragment inventoryFragment;

    private final void getUnReadMessage() {
    }

    private final void hideSelect() {
        Fragment fragment = this.currentFragment;
        AllFragment allFragment2 = null;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
            fragment = null;
        }
        AllFragment allFragment3 = this.allFragment;
        if (allFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            allFragment3 = null;
        }
        if (!Intrinsics.areEqual((Object) fragment, (Object) allFragment3)) {
            InventoryFragment inventoryFragment2 = this.inventoryFragment;
            if (inventoryFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                inventoryFragment2 = null;
            }
            if (!Intrinsics.areEqual((Object) fragment, (Object) inventoryFragment2)) {
                AlertdFragment alertdFragment2 = this.alertdFragment;
                if (alertdFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                    alertdFragment2 = null;
                }
                if (Intrinsics.areEqual((Object) fragment, (Object) alertdFragment2) && Intrinsics.areEqual((Object) getString(R$string.cancel), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
                    ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
                    AlertdFragment alertdFragment3 = this.alertdFragment;
                    if (alertdFragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                    } else {
                        allFragment2 = alertdFragment3;
                    }
                    allFragment2.hideSelected();
                    setSaveCVVisible(false);
                }
            } else if (Intrinsics.areEqual((Object) getString(R$string.cancel), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
                ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
                InventoryFragment inventoryFragment3 = this.inventoryFragment;
                if (inventoryFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                } else {
                    allFragment2 = inventoryFragment3;
                }
                allFragment2.hideSelected();
                setSaveCVVisible(false);
            }
        } else if (Intrinsics.areEqual((Object) getString(R$string.select_all), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
            ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
            AllFragment allFragment4 = this.allFragment;
            if (allFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            } else {
                allFragment2 = allFragment4;
            }
            allFragment2.hideSelected();
            setSaveCVVisible(false);
        }
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27122setListeners$lambda0(NotificationActivity notificationActivity, View view) {
        Intrinsics.checkNotNullParameter(notificationActivity, "this$0");
        notificationActivity.hideSelect();
    }

    /* access modifiers changed from: private */
    public final void setSaveCVVisible(boolean z) {
        if (z) {
            ((CardView) _$_findCachedViewById(R$id.notification_save_cv)).setVisibility(0);
        } else {
            ((CardView) _$_findCachedViewById(R$id.notification_save_cv)).setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void showSelect() {
        logSelectCount(0);
        Fragment fragment = this.currentFragment;
        AllFragment allFragment2 = null;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
            fragment = null;
        }
        AllFragment allFragment3 = this.allFragment;
        if (allFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            allFragment3 = null;
        }
        if (!Intrinsics.areEqual((Object) fragment, (Object) allFragment3)) {
            InventoryFragment inventoryFragment2 = this.inventoryFragment;
            if (inventoryFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                inventoryFragment2 = null;
            }
            if (!Intrinsics.areEqual((Object) fragment, (Object) inventoryFragment2)) {
                AlertdFragment alertdFragment2 = this.alertdFragment;
                if (alertdFragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                    alertdFragment2 = null;
                }
                if (!Intrinsics.areEqual((Object) fragment, (Object) alertdFragment2)) {
                    return;
                }
                if (Intrinsics.areEqual((Object) getString(R$string.select), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
                    ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.cancel));
                    AlertdFragment alertdFragment3 = this.alertdFragment;
                    if (alertdFragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                    } else {
                        allFragment2 = alertdFragment3;
                    }
                    allFragment2.showSelected();
                    setSaveCVVisible(true);
                    return;
                }
                ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
                AlertdFragment alertdFragment4 = this.alertdFragment;
                if (alertdFragment4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
                } else {
                    allFragment2 = alertdFragment4;
                }
                allFragment2.hideSelected();
                setSaveCVVisible(false);
            } else if (Intrinsics.areEqual((Object) getString(R$string.select), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
                ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.cancel));
                InventoryFragment inventoryFragment3 = this.inventoryFragment;
                if (inventoryFragment3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                } else {
                    allFragment2 = inventoryFragment3;
                }
                allFragment2.showSelected();
                setSaveCVVisible(true);
            } else {
                ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
                InventoryFragment inventoryFragment4 = this.inventoryFragment;
                if (inventoryFragment4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
                } else {
                    allFragment2 = inventoryFragment4;
                }
                allFragment2.hideSelected();
                setSaveCVVisible(false);
            }
        } else if (Intrinsics.areEqual((Object) getString(R$string.select), (Object) ((TextView) _$_findCachedViewById(R$id.top_next)).getText())) {
            ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select_all));
            AllFragment allFragment4 = this.allFragment;
            if (allFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            } else {
                allFragment2 = allFragment4;
            }
            allFragment2.showSelected();
            setSaveCVVisible(true);
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27123subscribeObservable$lambda3(NotificationActivity notificationActivity, List list) {
        Intrinsics.checkNotNullParameter(notificationActivity, "this$0");
        ((MessageViewModel) notificationActivity.getMViewModel()).updateLoadingStatus(false);
    }

    private final void switchFragment(Fragment fragment) {
        Fragment fragment2 = this.currentFragment;
        Fragment fragment3 = null;
        if (fragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
            fragment2 = null;
        }
        if (fragment2 != fragment) {
            if (!fragment.isAdded()) {
                Fragment fragment4 = this.currentFragment;
                if (fragment4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
                } else {
                    fragment3 = fragment4;
                }
                getSupportFragmentManager().beginTransaction().hide(fragment3).add(R$id.activity_notification_fl, fragment).commit();
            } else {
                Fragment fragment5 = this.currentFragment;
                if (fragment5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
                } else {
                    fragment3 = fragment5;
                }
                getSupportFragmentManager().beginTransaction().hide(fragment3).show(fragment).commit();
            }
            this.currentFragment = fragment;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void allSelect() {
        AllFragment allFragment2 = this.allFragment;
        if (allFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            allFragment2 = null;
        }
        allFragment2.AllSeleted();
    }

    public int bindLayout() {
        return R$layout.activity_notification;
    }

    @NotNull
    public Class<MessageViewModel> initViewModelClz() {
        return MessageViewModel.class;
    }

    @SuppressLint({"SetTextI18n"})
    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.notification_centre_appbar_title));
        ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getString(R$string.select));
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        this.inventoryFragment = new InventoryFragment();
        this.alertdFragment = new AlertdFragment();
        this.allFragment = new AllFragment();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R$id.activity_notification_fl;
        AllFragment allFragment2 = this.allFragment;
        AllFragment allFragment3 = null;
        if (allFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            allFragment2 = null;
        }
        beginTransaction.add(i, (Fragment) allFragment2).commit();
        AllFragment allFragment4 = this.allFragment;
        if (allFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
        } else {
            allFragment3 = allFragment4;
        }
        this.currentFragment = allFragment3;
    }

    public void loadData() {
        super.loadData();
        ((MessageViewModel) getMViewModel()).stopAlert();
    }

    public final void logSelectCount(int i) {
        ((TextView) _$_findCachedViewById(R$id.notification_select_counts)).setText(String.valueOf(i));
    }

    public void onDestroy() {
        super.onDestroy();
        NotificationRoom.Companion.notificationProvider().deleteAll();
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new NotificationActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_next);
        Intrinsics.checkNotNullExpressionValue(textView, "top_next");
        JuConnectExtKt.singleClickListener(textView, new NotificationActivity$setListeners$2(this));
        ((TextView) _$_findCachedViewById(R$id.notification_cancel)).setOnClickListener(new C7529x0(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.notification_delete);
        Intrinsics.checkNotNullExpressionValue(textView2, "notification_delete");
        JuConnectExtKt.singleClickListener(textView2, new NotificationActivity$setListeners$4(this));
    }

    public final void setSelectTextShow() {
        Fragment fragment = this.currentFragment;
        AllFragment allFragment2 = null;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentFragment");
            fragment = null;
        }
        AllFragment allFragment3 = this.allFragment;
        if (allFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            allFragment3 = null;
        }
        int i = 0;
        if (Intrinsics.areEqual((Object) fragment, (Object) allFragment3)) {
            TextView textView = (TextView) _$_findCachedViewById(R$id.top_next);
            Intrinsics.checkNotNullExpressionValue(textView, "top_next");
            AllFragment allFragment4 = this.allFragment;
            if (allFragment4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFragment");
            } else {
                allFragment2 = allFragment4;
            }
            if (!allFragment2.isHideSelectText()) {
                i = 8;
            }
            textView.setVisibility(i);
            return;
        }
        InventoryFragment inventoryFragment2 = this.inventoryFragment;
        if (inventoryFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
            inventoryFragment2 = null;
        }
        if (Intrinsics.areEqual((Object) fragment, (Object) inventoryFragment2)) {
            TextView textView2 = (TextView) _$_findCachedViewById(R$id.top_next);
            Intrinsics.checkNotNullExpressionValue(textView2, "top_next");
            InventoryFragment inventoryFragment3 = this.inventoryFragment;
            if (inventoryFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inventoryFragment");
            } else {
                allFragment2 = inventoryFragment3;
            }
            if (!allFragment2.isHideSelectText()) {
                i = 8;
            }
            textView2.setVisibility(i);
            return;
        }
        AlertdFragment alertdFragment2 = this.alertdFragment;
        if (alertdFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
            alertdFragment2 = null;
        }
        if (Intrinsics.areEqual((Object) fragment, (Object) alertdFragment2)) {
            TextView textView3 = (TextView) _$_findCachedViewById(R$id.top_next);
            Intrinsics.checkNotNullExpressionValue(textView3, "top_next");
            AlertdFragment alertdFragment3 = this.alertdFragment;
            if (alertdFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("alertdFragment");
            } else {
                allFragment2 = alertdFragment3;
            }
            if (!allFragment2.isHideSelectText()) {
                i = 8;
            }
            textView3.setVisibility(i);
        }
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((MessageViewModel) getMViewModel()).getUnReadMessageLiveData().observe(this, new C7508n(this));
    }
}
