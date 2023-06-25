package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.Editable;
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
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1506m;
import p040c.p429r.p430a.p431a.p432b.C7172c;
import p040c.p429r.p430a.p431a.p432b.C7201j0;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u0005H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016J\b\u0010)\u001a\u00020\u001bH\u0014J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0007H\u0002J\b\u0010,\u001a\u00020\u001bH\u0014J\b\u0010-\u001a\u00020\u001bH\u0014J\b\u0010.\u001a\u00020\u001bH\u0002J\u0018\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u0007H\u0002J\u0018\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J*\u00107\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001d2\b\b\u0002\u00101\u001a\u00020\u00072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u001bH\u0002J\b\u0010=\u001a\u00020\u001bH\u0016JH\u0010>\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0E2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0GH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006H"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginResetPswActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "countDownTime", "", "deleteAccountTag", "", "getDeleteAccountTag", "()Ljava/lang/String;", "setDeleteAccountTag", "(Ljava/lang/String;)V", "emailStr", "getEmailStr", "setEmailStr", "extraFont", "Landroid/graphics/Typeface;", "getExtraFont", "()Landroid/graphics/Typeface;", "extraFont$delegate", "Lkotlin/Lazy;", "isLogin", "setLogin", "timerJob", "Lkotlinx/coroutines/Job;", "bindLayout", "cancelCountDown", "", "checkCode", "", "checkPasswordFormat", "password", "checkPasswordSame", "enableButton", "button", "Landroid/widget/Button;", "enabled", "enableNextButton", "gotoLogin", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isContainsNumbersAndLetters", "str", "onDestroy", "setListeners", "setNextShow", "showCodeError", "showError", "content", "showHidePassword", "editText", "Landroid/widget/EditText;", "iconText", "Lcom/hisense/connect_life/core/widget/IconFontView;", "showPasswordError", "tvError", "Landroid/widget/TextView;", "pwdRoot", "Landroid/widget/LinearLayout;", "startCountDown", "subscribeObservable", "timer", "countSeconds", "delayMillSeconds", "", "cs", "Lkotlinx/coroutines/CoroutineScope;", "complete", "Lkotlin/Function0;", "collect", "Lkotlin/Function1;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginResetPswActivity")
/* compiled from: LoginResetPswActivity.kt */
public final class LoginResetPswActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final int countDownTime = 60;
    @Autowired(name = "DELETE_ACCOUNT")
    public String deleteAccountTag;
    @Autowired(name = "email")
    public String emailStr;
    @NotNull
    public final Lazy extraFont$delegate = LazyKt__LazyJVMKt.lazy(new LoginResetPswActivity$extraFont$2(this));
    @Autowired(name = "login")
    public String isLogin;
    @Nullable
    public Job timerJob;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(LoginResetPswActivity loginResetPswActivity) {
        return (AccountViewModel) loginResetPswActivity.getMViewModel();
    }

    private final void cancelCountDown() {
        Job job;
        Job job2 = this.timerJob;
        boolean z = false;
        if (job2 != null && job2.isActive()) {
            z = true;
        }
        if (z && (job = this.timerJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final boolean checkCode() {
        Editable text = ((EditText) _$_findCachedViewById(R$id.sign_code)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "sign_code.text");
        return text.length() > 0;
    }

    /* access modifiers changed from: private */
    public final boolean checkPasswordFormat(String str) {
        return isContainsNumbersAndLetters(str);
    }

    /* access modifiers changed from: private */
    public final boolean checkPasswordSame() {
        return Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString(), (Object) ((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString());
    }

    /* access modifiers changed from: private */
    public final void enableButton(Button button, boolean z) {
        if (z) {
            button.setTextColor(getColor(R$color.colorWhite));
            button.setBackgroundResource(R$drawable.button_circle_solid);
            button.setEnabled(true);
            return;
        }
        button.setTextColor(getColor(R$color.colorText_86));
        button.setBackgroundResource(R$drawable.button_circle_unselect);
        button.setEnabled(false);
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
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new LoginResetPswActivity$gotoLogin$1((Continuation<? super LoginResetPswActivity$gotoLogin$1>) null), 2, (Object) null);
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
        enableNextButton(checkCode() && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()) && checkPasswordFormat(((EditText) _$_findCachedViewById(R$id.sign_repeat_password)).getText().toString()) && checkPasswordSame());
    }

    /* access modifiers changed from: private */
    public final void showCodeError(boolean z, String str) {
        if (z) {
            ((TextView) _$_findCachedViewById(R$id.tv_error_code)).setText(str);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_et_code_bg)).setBackgroundResource(R$drawable.edittext_background_error);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.tv_error_code)).setText("");
        ((LinearLayout) _$_findCachedViewById(R$id.ll_et_code_bg)).setBackgroundResource(R$drawable.edittext_background_white);
    }

    /* access modifiers changed from: private */
    public final void showHidePassword(EditText editText, IconFontView iconFontView) {
        Editable text = editText.getText();
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
        editText.setSelection(text.length());
    }

    /* access modifiers changed from: private */
    public final void showPasswordError(boolean z, String str, TextView textView, LinearLayout linearLayout) {
        if (!z) {
            str = "";
        }
        textView.setText(str);
        linearLayout.setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_white);
    }

    public static /* synthetic */ void showPasswordError$default(LoginResetPswActivity loginResetPswActivity, boolean z, String str, TextView textView, LinearLayout linearLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        loginResetPswActivity.showPasswordError(z, str, textView, linearLayout);
    }

    private final void startCountDown() {
        Job job;
        Job job2 = this.timerJob;
        if ((job2 != null && job2.isActive()) && (job = this.timerJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Button button = (Button) _$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button, "get_verification_code");
        enableButton(button, false);
        this.timerJob = timer$default(this, 0, 0, (CoroutineScope) null, new LoginResetPswActivity$startCountDown$1(this), new LoginResetPswActivity$startCountDown$2(this), 7, (Object) null);
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26842subscribeObservable$lambda3(LoginResetPswActivity loginResetPswActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginResetPswActivity, "this$0");
        loginResetPswActivity.hideLoading();
        if (pair != null && ((Boolean) pair.getFirst()).booleanValue()) {
            loginResetPswActivity.startCountDown();
            loginResetPswActivity.showString(R$string.verification_code_get_success);
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26843subscribeObservable$lambda4(LoginResetPswActivity loginResetPswActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginResetPswActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            C1506m.m968r(Intrinsics.stringPlus("resetPwd it.second: ", pair.getSecond()));
            if (600903 == ((Number) pair.getSecond()).intValue()) {
                String string = loginResetPswActivity.getString(R$string.verification_code_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.verification_code_error)");
                loginResetPswActivity.showCodeError(true, string);
            } else if (600933 == ((Number) pair.getSecond()).intValue()) {
                String string2 = loginResetPswActivity.getString(R$string.auth_code_expired_error);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.auth_code_expired_error)");
                loginResetPswActivity.showCodeError(true, string2);
            } else if (600917 == ((Number) pair.getSecond()).intValue()) {
                String string3 = loginResetPswActivity.getString(R$string.password_same_as_old);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.password_same_as_old)");
                TextView textView = (TextView) loginResetPswActivity._$_findCachedViewById(R$id.tv_error_password);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_error_password");
                LinearLayout linearLayout = (LinearLayout) loginResetPswActivity._$_findCachedViewById(R$id.ll_et_password_bg);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_et_password_bg");
                loginResetPswActivity.showPasswordError(true, string3, textView, linearLayout);
            } else {
                String string4 = loginResetPswActivity.getString(R$string.reset_password_error);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.reset_password_error)");
                loginResetPswActivity.showCodeError(true, string4);
            }
        } else {
            loginResetPswActivity.gotoLogin();
        }
    }

    private final Job timer(int i, long j, CoroutineScope coroutineScope, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new LoginResetPswActivity$timer$1(i, j, function0, function1, (Continuation<? super LoginResetPswActivity$timer$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ Job timer$default(LoginResetPswActivity loginResetPswActivity, int i, long j, CoroutineScope coroutineScope, Function0 function0, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 60;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            j = 1000;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            coroutineScope = CoroutineScopeKt.MainScope();
        }
        return loginResetPswActivity.timer(i3, j2, coroutineScope, function0, function1);
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
        return R$layout.activity_login_reset_psw;
    }

    @NotNull
    public final String getDeleteAccountTag() {
        String str = this.deleteAccountTag;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deleteAccountTag");
        return null;
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
        String string = getString(R$string.reset_new_psw);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.reset_new_psw)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_password)).setText(upperCase);
        String string2 = getString(R$string.reset_re_enter_psw);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.reset_re_enter_psw)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_repeat_password)).setText(upperCase2);
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.reset_password_s));
        startCountDown();
        setNextShow();
    }

    @NotNull
    public final String isLogin() {
        String str = this.isLogin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("isLogin");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
        cancelCountDown();
    }

    public final void setDeleteAccountTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deleteAccountTag = str;
    }

    public final void setEmailStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.emailStr = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new LoginResetPswActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, LoginResetPswActivity$setListeners$2.INSTANCE);
        Button button2 = (Button) _$_findCachedViewById(R$id.get_verification_code);
        Intrinsics.checkNotNullExpressionValue(button2, "get_verification_code");
        JuConnectExtKt.singleClickListener(button2, new LoginResetPswActivity$setListeners$3(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.sign_code);
        Intrinsics.checkNotNullExpressionValue(editText, "sign_code");
        editText.addTextChangedListener(new LoginResetPswActivity$setListeners$$inlined$doAfterTextChanged$1(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.sign_password);
        Intrinsics.checkNotNullExpressionValue(editText2, "sign_password");
        editText2.addTextChangedListener(new LoginResetPswActivity$setListeners$$inlined$doAfterTextChanged$2(this));
        EditText editText3 = (EditText) _$_findCachedViewById(R$id.sign_repeat_password);
        Intrinsics.checkNotNullExpressionValue(editText3, "sign_repeat_password");
        editText3.addTextChangedListener(new LoginResetPswActivity$setListeners$$inlined$doAfterTextChanged$3(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.show_hide_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "show_hide_password");
        JuConnectExtKt.singleClickListener(iconFontView2, new LoginResetPswActivity$setListeners$7(this));
        IconFontView iconFontView3 = (IconFontView) _$_findCachedViewById(R$id.show_hide_repeat_password);
        Intrinsics.checkNotNullExpressionValue(iconFontView3, "show_hide_repeat_password");
        JuConnectExtKt.singleClickListener(iconFontView3, new LoginResetPswActivity$setListeners$8(this));
        Button button3 = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button3, "next");
        JuConnectExtKt.singleClickListener(button3, new LoginResetPswActivity$setListeners$9(this));
    }

    public final void setLogin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isLogin = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7201j0(this));
        ((AccountViewModel) getMViewModel()).getResetPswLiveData().observe(this, new C7172c(this));
    }
}
