package com.hisense.connect_life.app_account.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7167a3;
import p040c.p429r.p430a.p431a.p432b.C7170b1;
import p040c.p429r.p430a.p431a.p432b.C7209l0;
import p040c.p429r.p430a.p431a.p432b.C7236s;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0005H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0007J\b\u0010\u0017\u001a\u00020\u0011H\u0014J#\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/DeleteAccountEmailCode;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "TIME_COUNT_DOWN", "", "emailStr", "", "getEmailStr", "()Ljava/lang/String;", "setEmailStr", "(Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "verCodeTimer", "bindLayout", "deleteAccountSuccess", "", "initData", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "sendMessageAtOneS", "setListeners", "showAuthCodeError", "isError", "", "isExpired", "(ZLjava/lang/Boolean;)V", "showNextButton", "enabled", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/ConformDeleteEmailCode")
/* compiled from: DeleteAccountEmailCode.kt */
public final class DeleteAccountEmailCode extends BaseVmActivity<AccountViewModel> {
    public final int TIME_COUNT_DOWN = 1;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "email")
    public String emailStr;
    @NotNull
    public final Handler handler = new Handler(new C7170b1(this));
    public int verCodeTimer = 60;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(DeleteAccountEmailCode deleteAccountEmailCode) {
        return (AccountViewModel) deleteAccountEmailCode.getMViewModel();
    }

    private final void deleteAccountSuccess() {
        FirebaseAnalytics.getInstance(this).mo37291a("custom_account_delete", new Bundle());
        AppConfig.Companion.setFcmToken("");
        HiSmart.Companion.getInstance().updateToken("");
        AppConfig.Companion.setAnonymousLoginToken("");
        Intrinsics.stringPlus("DeleteAccount:", SPManagerKt.getCustomerId());
        showString(R$string.delete_account_success_hint);
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new DeleteAccountEmailCode$deleteAccountSuccess$1((Continuation<? super DeleteAccountEmailCode$deleteAccountSuccess$1>) null), 2, (Object) null);
    }

    /* renamed from: handler$lambda-0  reason: not valid java name */
    public static final boolean m26811handler$lambda0(DeleteAccountEmailCode deleteAccountEmailCode, Message message) {
        Intrinsics.checkNotNullParameter(deleteAccountEmailCode, "this$0");
        Intrinsics.checkNotNullParameter(message, LanguageConstKt.f15954it);
        if (message.what != deleteAccountEmailCode.TIME_COUNT_DOWN) {
            return false;
        }
        deleteAccountEmailCode.sendMessageAtOneS();
        return false;
    }

    private final void showAuthCodeError(boolean z, Boolean bool) {
        if (z) {
            if (bool == null || !bool.booleanValue()) {
                ((TextView) _$_findCachedViewById(R$id.code_error)).setText(getString(R$string.verification_code_error));
            } else {
                ((TextView) _$_findCachedViewById(R$id.code_error)).setText(getString(R$string.auth_code_expired_error));
            }
            TextView textView = (TextView) _$_findCachedViewById(R$id.code_error);
            Intrinsics.checkNotNullExpressionValue(textView, "code_error");
            textView.setVisibility(0);
            ((EditText) _$_findCachedViewById(R$id.edit_verification)).setBackgroundResource(R$drawable.edittext_background_error);
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.code_error);
        Intrinsics.checkNotNullExpressionValue(textView2, "code_error");
        textView2.setVisibility(8);
        ((EditText) _$_findCachedViewById(R$id.edit_verification)).setBackgroundResource(R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showAuthCodeError$default(DeleteAccountEmailCode deleteAccountEmailCode, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        deleteAccountEmailCode.showAuthCodeError(z, bool);
    }

    /* access modifiers changed from: private */
    public final void showNextButton(boolean z) {
        ((TextView) _$_findCachedViewById(R$id.next)).setEnabled(z);
        ((TextView) _$_findCachedViewById(R$id.next)).setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        ((TextView) _$_findCachedViewById(R$id.next)).setTextColor(getResources().getColor(z ? R$color.colorWhite : R$color.colorText_86));
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26812subscribeObservable$lambda1(DeleteAccountEmailCode deleteAccountEmailCode, Pair pair) {
        Intrinsics.checkNotNullParameter(deleteAccountEmailCode, "this$0");
        if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
            deleteAccountEmailCode.verCodeTimer = 60;
            deleteAccountEmailCode.sendMessageAtOneS();
            deleteAccountEmailCode.showString(R$string.verification_code_get_success);
        } else if (((Number) pair.getSecond()).intValue() == -1) {
            deleteAccountEmailCode.showString(R$string.network_lost);
        }
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26813subscribeObservable$lambda2(DeleteAccountEmailCode deleteAccountEmailCode, Pair pair) {
        Intrinsics.checkNotNullParameter(deleteAccountEmailCode, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            deleteAccountEmailCode.showAuthCodeError(true, Boolean.valueOf(((Number) pair.getSecond()).intValue() == 600933));
        } else {
            ((AccountViewModel) deleteAccountEmailCode.getMViewModel()).deleteAccount("", ((EditText) deleteAccountEmailCode._$_findCachedViewById(R$id.edit_verification)).getText().toString());
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26814subscribeObservable$lambda3(DeleteAccountEmailCode deleteAccountEmailCode, Pair pair) {
        Intrinsics.checkNotNullParameter(deleteAccountEmailCode, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            deleteAccountEmailCode.deleteAccountSuccess();
        } else if (((Number) pair.getSecond()).intValue() < 0) {
            String string = deleteAccountEmailCode.getString(R$string.network_lost);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.network_lost)");
            deleteAccountEmailCode.showString(string);
        } else {
            String string2 = deleteAccountEmailCode.getString(R$string.delete_account_fail);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.delete_account_fail)");
            deleteAccountEmailCode.showString(string2);
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

    public int bindLayout() {
        return R$layout.activity_delete_account_email_code;
    }

    @NotNull
    public final String getEmailStr() {
        String str = this.emailStr;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emailStr");
        return null;
    }

    public void initData() {
        super.initData();
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        showNextButton(false);
        showAuthCodeError$default(this, false, (Boolean) null, 2, (Object) null);
        String string = getString(R$string.check_your_email);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.check_your_email)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_delete_notification)).setText(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(upperCase, MAPCookie.DOT, "", false, 4, (Object) null), "。", "", false, 4, (Object) null));
        ((TextView) _$_findCachedViewById(R$id.tv_delete_message)).setText(getString(R$string.sent_email) + ' ' + getEmailStr() + ' ' + getString(R$string.with_verification_code));
        ((AccountViewModel) getMViewModel()).getVerificationCode(getEmailStr(), "7");
    }

    @SuppressLint({"StringFormatInvalid"})
    public final void sendMessageAtOneS() {
        if (this.verCodeTimer <= 0) {
            ((TextView) _$_findCachedViewById(R$id.resend)).setEnabled(true);
            ((TextView) _$_findCachedViewById(R$id.resend)).setText(getString(R$string.resend_verification_code));
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.resend)).setEnabled(false);
        this.verCodeTimer--;
        ((TextView) _$_findCachedViewById(R$id.resend)).setText(getString(R$string.resend_try_again_ver, new Object[]{Integer.valueOf(this.verCodeTimer)}));
        this.handler.sendEmptyMessageDelayed(this.TIME_COUNT_DOWN, 1000);
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_back);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_back");
        JuConnectExtKt.singleClickListener(textView, new DeleteAccountEmailCode$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.resend);
        Intrinsics.checkNotNullExpressionValue(textView2, "resend");
        JuConnectExtKt.singleClickListener(textView2, new DeleteAccountEmailCode$setListeners$2(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(textView3, "next");
        JuConnectExtKt.singleClickListener(textView3, new DeleteAccountEmailCode$setListeners$3(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.edit_verification);
        Intrinsics.checkNotNullExpressionValue(editText, "edit_verification");
        editText.addTextChangedListener(new C8444x640474d7(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.edit_verification);
        Intrinsics.checkNotNullExpressionValue(editText2, "edit_verification");
        editText2.addTextChangedListener(new C8445xb6ecf9b6(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7167a3(this));
        ((AccountViewModel) getMViewModel()).getCheckAuthCodeLiveData().observe(this, new C7209l0(this));
        ((AccountViewModel) getMViewModel()).getDeleteAccountLiveData().observe(this, new C7236s(this));
    }
}
