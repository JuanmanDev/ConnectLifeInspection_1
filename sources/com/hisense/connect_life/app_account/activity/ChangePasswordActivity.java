package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p431a.p432b.C7255w2;

@Metadata(mo47990d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\b\u0010 \u001a\u00020\u0017H\u0014J\b\u0010!\u001a\u00020\u0017H\u0002J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J*\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006/"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/ChangePasswordActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "emailStr", "", "getEmailStr", "()Ljava/lang/String;", "setEmailStr", "(Ljava/lang/String;)V", "extraFont", "Landroid/graphics/Typeface;", "getExtraFont", "()Landroid/graphics/Typeface;", "extraFont$delegate", "Lkotlin/Lazy;", "bindLayout", "", "checkPasswordFormat", "", "password", "checkPasswordSame", "enableNextButton", "", "enabled", "gotoLogin", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isContainsNumbersAndLetters", "str", "onDestroy", "setListeners", "setNextShow", "showHidePassword", "editText", "Landroid/widget/EditText;", "iconText", "Lcom/hisense/connect_life/core/widget/IconFontView;", "showPasswordError", "showError", "content", "tvError", "Landroid/widget/TextView;", "pwdRoot", "Landroid/widget/LinearLayout;", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/ChangePasswordActivity")
/* compiled from: ChangePasswordActivity.kt */
public final class ChangePasswordActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "email")
    public String emailStr;
    @NotNull
    public final Lazy extraFont$delegate = LazyKt__LazyJVMKt.lazy(new ChangePasswordActivity$extraFont$2(this));

    public static final /* synthetic */ AccountViewModel access$getMViewModel(ChangePasswordActivity changePasswordActivity) {
        return (AccountViewModel) changePasswordActivity.getMViewModel();
    }

    /* access modifiers changed from: private */
    public final boolean checkPasswordFormat(String str) {
        return isContainsNumbersAndLetters(str);
    }

    /* access modifiers changed from: private */
    public final boolean checkPasswordSame() {
        return Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(R$id.sign_new_password)).getText().toString(), (Object) ((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString());
    }

    private final void enableNextButton(boolean z) {
        Button button = (Button) _$_findCachedViewById(R$id.next);
        button.setTextColor(button.getResources().getColor(z ? R$color.colorWhite : R$color.colorText_86));
        button.setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        button.setEnabled(z);
    }

    private final Typeface getExtraFont() {
        return (Typeface) this.extraFont$delegate.getValue();
    }

    private final void gotoLogin() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new ChangePasswordActivity$gotoLogin$1((Continuation<? super ChangePasswordActivity$gotoLogin$1>) null), 2, (Object) null);
    }

    private final boolean isContainsNumbersAndLetters(String str) {
        int length = str.length();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < length) {
            int i2 = i + 1;
            if (Character.isDigit(str.charAt(i))) {
                z = true;
            } else if (Character.isLetter(str.charAt(i))) {
                z2 = true;
            }
            i = i2;
        }
        if (!z || !z2 || str.length() < 8 || str.length() > 50) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final void setNextShow() {
        enableNextButton(checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_old_password)).getText().toString()) && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_new_password)).getText().toString()) && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString()) && checkPasswordSame());
    }

    /* access modifiers changed from: private */
    public final void showHidePassword(EditText editText, IconFontView iconFontView) {
        if (TextUtils.equals(iconFontView.getText(), getString(R$string.icon_login_password_show))) {
            iconFontView.setTextSize(20.0f);
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            editText.setTypeface(getExtraFont());
            iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_close));
        } else {
            iconFontView.setTextSize(14.0f);
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            iconFontView.setText(iconFontView.getResources().getString(R$string.icon_login_password_show));
        }
        editText.setSelection(editText.getText().length());
    }

    /* access modifiers changed from: private */
    public final void showPasswordError(boolean z, String str, TextView textView, LinearLayout linearLayout) {
        if (!z) {
            str = "";
        }
        textView.setText(str);
        linearLayout.setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showPasswordError$default(ChangePasswordActivity changePasswordActivity, boolean z, String str, TextView textView, LinearLayout linearLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        changePasswordActivity.showPasswordError(z, str, textView, linearLayout);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26806subscribeObservable$lambda3(ChangePasswordActivity changePasswordActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(changePasswordActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            changePasswordActivity.gotoLogin();
            return;
        }
        String str = (String) pair.getSecond();
        if (Intrinsics.areEqual((Object) str, (Object) "600709")) {
            String string = changePasswordActivity.getString(R$string.change_email_error_pwd);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.change_email_error_pwd)");
            TextView textView = (TextView) changePasswordActivity._$_findCachedViewById(R$id.tv_error_old_password);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_error_old_password");
            LinearLayout linearLayout = (LinearLayout) changePasswordActivity._$_findCachedViewById(R$id.ll_et_password_bg);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_et_password_bg");
            changePasswordActivity.showPasswordError(true, string, textView, linearLayout);
        } else if (Intrinsics.areEqual((Object) str, (Object) "600917")) {
            String string2 = changePasswordActivity.getString(R$string.password_same_as_old);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.password_same_as_old)");
            TextView textView2 = (TextView) changePasswordActivity._$_findCachedViewById(R$id.tv_error_new_password);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_new_password");
            LinearLayout linearLayout2 = (LinearLayout) changePasswordActivity._$_findCachedViewById(R$id.ll_et_new_password_bg);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_et_new_password_bg");
            changePasswordActivity.showPasswordError(true, string2, textView2, linearLayout2);
            String string3 = changePasswordActivity.getString(R$string.password_same_as_old);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.password_same_as_old)");
            TextView textView3 = (TextView) changePasswordActivity._$_findCachedViewById(R$id.tv_error_repeat_password);
            Intrinsics.checkNotNullExpressionValue(textView3, "tv_error_repeat_password");
            LinearLayout linearLayout3 = (LinearLayout) changePasswordActivity._$_findCachedViewById(R$id.ll_et_repeat_password_bg);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_et_repeat_password_bg");
            changePasswordActivity.showPasswordError(true, string3, textView3, linearLayout3);
        } else {
            String string4 = changePasswordActivity.getString(R$string.reset_password_error);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.reset_password_error)");
            changePasswordActivity.showString(string4);
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
        return R$layout.activity_change_password;
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

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        String string = getString(R$string.change_password);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.change_password)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(StringsKt__StringsJVMKt.capitalize(string, locale));
        String string2 = getString(R$string.change_password);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.change_password)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String upperCase = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_change_password)).setText(upperCase);
        ((TextView) _$_findCachedViewById(R$id.tv_change_password_tips)).setText(getString(R$string.change_password_tips, new Object[]{getEmailStr()}));
        String string3 = getString(R$string.old_password);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.old_password)");
        Locale locale3 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale3, "ROOT");
        String upperCase2 = string3.toUpperCase(locale3);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_old_password)).setText(upperCase2);
        String string4 = getString(R$string.old_password);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.old_password)");
        Locale locale4 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale4, "ROOT");
        String upperCase3 = string4.toUpperCase(locale4);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        ((EditText) _$_findCachedViewById(R$id.sign_old_password)).setHint(upperCase3);
        String string5 = getString(R$string.reset_new_psw);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.reset_new_psw)");
        Locale locale5 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale5, "ROOT");
        String upperCase4 = string5.toUpperCase(locale5);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_new_password)).setText(upperCase4);
        String string6 = getString(R$string.reset_new_psw);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.reset_new_psw)");
        Locale locale6 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale6, "ROOT");
        String upperCase5 = string6.toUpperCase(locale6);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "this as java.lang.String).toUpperCase(locale)");
        ((EditText) _$_findCachedViewById(R$id.sign_new_password)).setHint(upperCase5);
        String string7 = getString(R$string.reset_re_enter_psw);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.reset_re_enter_psw)");
        Locale locale7 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale7, "ROOT");
        String upperCase6 = string7.toUpperCase(locale7);
        Intrinsics.checkNotNullExpressionValue(upperCase6, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_repeat_password)).setText(upperCase6);
        String string8 = getString(R$string.reset_re_enter_psw);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.reset_re_enter_psw)");
        Locale locale8 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale8, "ROOT");
        String upperCase7 = string8.toUpperCase(locale8);
        Intrinsics.checkNotNullExpressionValue(upperCase7, "this as java.lang.String).toUpperCase(locale)");
        ((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).setHint(upperCase7);
        setNextShow();
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ChangePasswordActivity$setListeners$1(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_old_password);
        Intrinsics.checkNotNullExpressionValue(editText, "sign_old_password");
        editText.addTextChangedListener(new C8440xd1cf6103(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.sign_new_password);
        Intrinsics.checkNotNullExpressionValue(editText2, "sign_new_password");
        editText2.addTextChangedListener(new C8441xd1cf6104(this));
        EditText editText3 = (EditText) _$_findCachedViewById(R$id.sign_repeat_password);
        Intrinsics.checkNotNullExpressionValue(editText3, "sign_repeat_password");
        editText3.addTextChangedListener(new C8442xd1cf6105(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.show_hide_old_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "show_hide_old_password");
        JuConnectExtKt.singleClickListener(iconFontView2, new ChangePasswordActivity$setListeners$5(this));
        IconFontView iconFontView3 = (IconFontView) _$_findCachedViewById(R$id.show_hide_new_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView3, "show_hide_new_password");
        JuConnectExtKt.singleClickListener(iconFontView3, new ChangePasswordActivity$setListeners$6(this));
        IconFontView iconFontView4 = (IconFontView) _$_findCachedViewById(R$id.show_hide_repeat_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView4, "show_hide_repeat_password");
        JuConnectExtKt.singleClickListener(iconFontView4, new ChangePasswordActivity$setListeners$7(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new ChangePasswordActivity$setListeners$8(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getResetPswByOldPSWLiveData().observe(this, new C7255w2(this));
    }
}
