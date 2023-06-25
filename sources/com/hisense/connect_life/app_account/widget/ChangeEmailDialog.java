package com.hisense.connect_life.app_account.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import androidx.test.internal.runner.RunnerArgs;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p429r.p430a.p431a.p435e.C7272c;
import p040c.p429r.p430a.p431a.p435e.C7273d;
import p040c.p429r.p430a.p431a.p435e.C7274e;
import p040c.p429r.p430a.p431a.p435e.C7275f;
import p040c.p429r.p430a.p431a.p435e.C7276g;
import p040c.p429r.p430a.p431a.p435e.C7277h;
import p040c.p429r.p430a.p431a.p435e.C7278i;

@Metadata(mo47990d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002WXB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\tH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0014J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002J\u0012\u0010+\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\u0012\u0010/\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u001dH\u0002J\u0012\u00101\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0002J\u0018\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0002J\b\u00105\u001a\u00020\u001dH\u0002J\u0018\u00106\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0002J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020\u001dH\u0002J\b\u00109\u001a\u00020\u001dH\u0002J\u0016\u0010:\u001a\u00020\u001d2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0<H\u0002J\b\u0010=\u001a\u00020\u001dH\u0014J\u0018\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020@2\u0006\u0010,\u001a\u00020\u0005H\u0002J\u0012\u0010A\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u0005H\u0002J\b\u0010C\u001a\u00020\u001dH\u0002J\b\u0010D\u001a\u00020\u001dH\u0002J\b\u0010E\u001a\u00020\u001dH\u0002J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u0005H\u0002JH\u0010H\u001a\u00020\u00162\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0<2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0PH\u0002J\f\u0010Q\u001a\u00020\u001d*\u00020RH\u0002J\f\u0010S\u001a\u00020\u001d*\u00020RH\u0002J\f\u0010T\u001a\u00020\u001d*\u00020\u0007H\u0002J\f\u0010U\u001a\u00020\u001d*\u00020\u0007H\u0002J\f\u0010V\u001a\u00020\u001d*\u00020RH\u0002R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "currentProcess", "Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Process;", "hasPassword", "", "oldEmail", "", "fixedHeight", "", "(Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Process;ZLjava/lang/String;I)V", "accountViewModel", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "getAccountViewModel", "()Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "accountViewModel$delegate", "Lkotlin/Lazy;", "confirmNewPassword", "dismissed", "liveDataUIState", "Landroidx/lifecycle/MutableLiveData;", "newCodeJob", "Lkotlinx/coroutines/Job;", "newEmailCode", "newPassword", "oldCodeJob", "oldEmailCode", "bindLayout", "enableNextButton", "", "enable", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "initSelecter", "isContainsNumbersAndLetters", "str", "onCancel", "dialog", "Landroid/content/DialogInterface;", "onDestroyView", "onDismiss", "refreshFunctionButton", "refreshUI", "refreshUIInputConfirmPassword", "showError", "refreshUIInputNewAuthCode", "refreshUIInputNewEmail", "refreshUIInputNewPassword", "refreshUIInputOldAuthCode", "refreshUIInputOldPassword", "requestAuthCode", "email", "authCodeType", "requestChangeEmail", "requestCheckAuthCode", "requestCheckNewEmail", "requestCheckPassword", "resetResendButton", "runOnUIThread", "func", "Lkotlin/Function0;", "setListeners", "showEdittextError", "editText", "Landroid/widget/EditText;", "showLoading", "show", "startNewEmailTimer", "startOldEmailTimer", "subscribeObserver", "switchProcess", "useAuthCode", "timer", "countSeconds", "delayMillSeconds", "", "cs", "Lkotlinx/coroutines/CoroutineScope;", "complete", "collect", "Lkotlin/Function1;", "gone", "Landroid/view/View;", "invisible", "log", "logE", "visible", "Companion", "Process", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ChangeEmailDialog.kt */
public final class ChangeEmailDialog extends BaseDialogFragment {
    public static final int AUTH_CODE_TYPE_NEW_EMAIL = 6;
    public static final int AUTH_CODE_TYPE_OLD_EMAIL = 5;
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final Process PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD = new Process(CollectionsKt__CollectionsKt.listOf(3, 1, 2, 4, 5), 3);
    @NotNull
    public static final Process PROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD = new Process(CollectionsKt__CollectionsKt.listOf(3, 1, 2), 3);
    @NotNull
    public static final Process PROCESS_CHANGE_EMAIL_WITH_PASSWORD = new Process(CollectionsKt__CollectionsKt.listOf(0, 1, 2), 0);
    @NotNull
    public static final String TAG = "Mernake:ChangeEmail";
    public static final int UI_STEP_END = 99;
    public static final int UI_STEP_INPUT_CONFIRM_PASSWORD = 5;
    public static final int UI_STEP_INPUT_NEW_AUTH_CODE = 2;
    public static final int UI_STEP_INPUT_NEW_EMAIL = 1;
    public static final int UI_STEP_INPUT_NEW_PASSWORD = 4;
    public static final int UI_STEP_INPUT_OLD_AUTH_CODE = 3;
    public static final int UI_STEP_INPUT_OLD_PASSWORD = 0;
    public static final int UI_STEP_START = -1;
    @NotNull
    public static final Map<Integer, Integer> tips = MapsKt__MapsKt.mapOf(TuplesKt.m25743to(0, Integer.valueOf(R$string.change_email_tips_1)), TuplesKt.m25743to(1, Integer.valueOf(R$string.change_email_tips_2)), TuplesKt.m25743to(2, Integer.valueOf(R$string.change_email_tips_3)), TuplesKt.m25743to(3, Integer.valueOf(R$string.change_email_tips_6)), TuplesKt.m25743to(4, Integer.valueOf(R$string.plz_enter_new_pwd)), TuplesKt.m25743to(5, Integer.valueOf(R$string.plz_enter_confirm_new_pwd)));
    @NotNull
    public static final Map<Integer, Integer> titles = MapsKt__MapsKt.mapOf(TuplesKt.m25743to(0, Integer.valueOf(R$string.security_verification)), TuplesKt.m25743to(1, Integer.valueOf(R$string.set_up_new_email)), TuplesKt.m25743to(2, Integer.valueOf(R$string.set_up_new_email)), TuplesKt.m25743to(3, Integer.valueOf(R$string.security_verification)), TuplesKt.m25743to(4, Integer.valueOf(R$string.setup_a_new_password)), TuplesKt.m25743to(5, Integer.valueOf(R$string.enter_your_password_again)));
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final Lazy accountViewModel$delegate = LazyKt__LazyJVMKt.lazy(ChangeEmailDialog$accountViewModel$2.INSTANCE);
    @NotNull
    public String confirmNewPassword = "";
    @NotNull
    public Process currentProcess;
    public boolean dismissed;
    public final boolean hasPassword;
    @NotNull
    public final MutableLiveData<Integer> liveDataUIState = new MutableLiveData<>();
    @Nullable
    public Job newCodeJob;
    @NotNull
    public String newEmailCode = "";
    @NotNull
    public String newPassword = "";
    @Nullable
    public Job oldCodeJob;
    @NotNull
    public final String oldEmail;
    @NotNull
    public String oldEmailCode = "";

    @Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Companion;", "", "()V", "AUTH_CODE_TYPE_NEW_EMAIL", "", "AUTH_CODE_TYPE_OLD_EMAIL", "PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD", "Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Process;", "getPROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD", "()Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Process;", "PROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD", "getPROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD", "PROCESS_CHANGE_EMAIL_WITH_PASSWORD", "getPROCESS_CHANGE_EMAIL_WITH_PASSWORD", "TAG", "", "UI_STEP_END", "UI_STEP_INPUT_CONFIRM_PASSWORD", "UI_STEP_INPUT_NEW_AUTH_CODE", "UI_STEP_INPUT_NEW_EMAIL", "UI_STEP_INPUT_NEW_PASSWORD", "UI_STEP_INPUT_OLD_AUTH_CODE", "UI_STEP_INPUT_OLD_PASSWORD", "UI_STEP_START", "tips", "", "getTips", "()Ljava/util/Map;", "titles", "getTitles", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ChangeEmailDialog.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Process getPROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD() {
            return ChangeEmailDialog.PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD;
        }

        @NotNull
        public final Process getPROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD() {
            return ChangeEmailDialog.PROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD;
        }

        @NotNull
        public final Process getPROCESS_CHANGE_EMAIL_WITH_PASSWORD() {
            return ChangeEmailDialog.PROCESS_CHANGE_EMAIL_WITH_PASSWORD;
        }

        @NotNull
        public final Map<Integer, Integer> getTips() {
            return ChangeEmailDialog.tips;
        }

        @NotNull
        public final Map<Integer, Integer> getTitles() {
            return ChangeEmailDialog.titles;
        }
    }

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/widget/ChangeEmailDialog$Process;", "", "steps", "", "", "currentStep", "(Ljava/util/List;I)V", "getCurrentStep", "()I", "setCurrentStep", "(I)V", "isLastStep", "", "lastStep", "nextStep", "resetStep", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ChangeEmailDialog.kt */
    public static final class Process {
        public int currentStep;
        @NotNull
        public final List<Integer> steps;

        public Process(@NotNull List<Integer> list, int i) {
            Intrinsics.checkNotNullParameter(list, "steps");
            this.steps = list;
            this.currentStep = i;
        }

        public final int getCurrentStep() {
            return this.currentStep;
        }

        public final boolean isLastStep() {
            return this.currentStep == ((Number) CollectionsKt___CollectionsKt.last(this.steps)).intValue();
        }

        public final int lastStep() {
            int i;
            int indexOf = this.steps.indexOf(Integer.valueOf(this.currentStep)) - 1;
            if (indexOf < 0) {
                i = -1;
            } else {
                i = this.steps.get(indexOf).intValue();
            }
            this.currentStep = i;
            return i;
        }

        public final int nextStep() {
            int indexOf = this.steps.indexOf(Integer.valueOf(this.currentStep)) + 1;
            int intValue = indexOf >= this.steps.size() ? 99 : this.steps.get(indexOf).intValue();
            this.currentStep = intValue;
            return intValue;
        }

        public final void resetStep() {
            this.currentStep = this.steps.get(0).intValue();
        }

        public final void setCurrentStep(int i) {
            this.currentStep = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeEmailDialog(@NotNull Process process, boolean z, @NotNull String str, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(process, "currentProcess");
        Intrinsics.checkNotNullParameter(str, "oldEmail");
        this.currentProcess = process;
        this.hasPassword = z;
        this.oldEmail = str;
    }

    /* access modifiers changed from: private */
    public final void enableNextButton(boolean z) {
        ((TextView) _$_findCachedViewById(R$id.tv_certain)).setEnabled(z);
        ((TextView) _$_findCachedViewById(R$id.tv_certain)).setBackgroundResource(z ? R$drawable.button_circle_blue_rec_left : R$drawable.button_circle_dc_rec_left);
    }

    public static /* synthetic */ void enableNextButton$default(ChangeEmailDialog changeEmailDialog, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        changeEmailDialog.enableNextButton(z);
    }

    private final AccountViewModel getAccountViewModel() {
        return (AccountViewModel) this.accountViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void gone(View view) {
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    private final void invisible(View view) {
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isContainsNumbersAndLetters(String str) {
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

    private final void log(String str) {
    }

    private final void logE(String str) {
    }

    /* renamed from: onDismiss$lambda-15  reason: not valid java name */
    public static final void m26910onDismiss$lambda15(ChangeEmailDialog changeEmailDialog, Integer num) {
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r3.liveDataUIState.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void refreshFunctionButton() {
        /*
            r3 = this;
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r3.liveDataUIState
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x000b
            goto L_0x0012
        L_0x000b:
            int r0 = r0.intValue()
            r1 = 3
            if (r0 == r1) goto L_0x0027
        L_0x0012:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r3.liveDataUIState
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            int r0 = com.hisense.connect_life.app_account.R$string.back
            goto L_0x0029
        L_0x0027:
            int r0 = com.hisense.connect_life.app_account.R$string.cancel
        L_0x0029:
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r1 = "getString(if (liveDataUI…ancel else R.string.back)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = "ROOT"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = com.hisense.connect_life.app_account.R$id.tv_cancel
            android.view.View r1 = r3._$_findCachedViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.widget.ChangeEmailDialog.refreshFunctionButton():void");
    }

    private final void refreshUI() {
        String str;
        Integer value = this.liveDataUIState.getValue();
        if (value == null || value.intValue() != -1) {
            if (value != null && value.intValue() == 99) {
                Postcard a = C1337a.m211c().mo15011a(Paths.Account.ChangeEmailSuccessActivity);
                a.withString(KeyConst.LOGIN_EMAILS, ((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString());
                a.navigation();
                dismiss();
                Dialog dialog = getDialog();
                if (dialog != null) {
                    dialog.cancel();
                    return;
                }
                return;
            }
            Integer num = titles.get(value);
            Intrinsics.checkNotNull(num);
            ((TextView) _$_findCachedViewById(R$id.tv_title)).setText(getString(num.intValue()));
            TextView textView = (TextView) _$_findCachedViewById(R$id.tv_tips);
            Integer value2 = this.liveDataUIState.getValue();
            boolean z = false;
            if (value2 != null && value2.intValue() == 3) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Integer num2 = tips.get(value);
                Intrinsics.checkNotNull(num2);
                String string = getString(num2.intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(tips[uiState]!!)");
                str = String.format(string, Arrays.copyOf(new Object[]{this.oldEmail}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            } else {
                Integer num3 = tips.get(value);
                Intrinsics.checkNotNull(num3);
                str = getString(num3.intValue());
            }
            textView.setText(str);
            Integer value3 = this.liveDataUIState.getValue();
            if (value3 != null && value3.intValue() == 0) {
                refreshUIInputOldPassword$default(this, false, 1, (Object) null);
            } else if (value3 != null && value3.intValue() == 1) {
                refreshUIInputNewEmail();
            } else if (value3 != null && value3.intValue() == 3) {
                refreshUIInputOldAuthCode();
            } else if (value3 != null && value3.intValue() == 2) {
                refreshUIInputNewAuthCode();
                Job job = this.newCodeJob;
                if (job != null && job.isActive()) {
                    z = true;
                }
                if (!z) {
                    requestAuthCode(StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString(), 6);
                }
            } else if (value3 != null && value3.intValue() == 4) {
                refreshUIInputNewPassword$default(this, false, 1, (Object) null);
            } else if (value3 != null && value3.intValue() == 5) {
                refreshUIInputConfirmPassword$default(this, false, 1, (Object) null);
            }
            refreshFunctionButton();
        }
    }

    private final void refreshUIInputConfirmPassword(boolean z) {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        visible(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        gone(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        gone(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_switch_to_code);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_switch_to_code");
        gone(textView);
        EditText editText = (EditText) _$_findCachedViewById(R$id.component_input_password);
        String str = this.confirmNewPassword;
        boolean z2 = true;
        if (str.length() == 0) {
            str = "";
        }
        editText.setText(str);
        ((EditText) _$_findCachedViewById(R$id.component_input_password)).setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_contour_f3);
        if (!(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString().length() > 0) || !isContainsNumbersAndLetters(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString())) {
            z2 = false;
        }
        enableNextButton(z2);
    }

    public static /* synthetic */ void refreshUIInputConfirmPassword$default(ChangeEmailDialog changeEmailDialog, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        changeEmailDialog.refreshUIInputConfirmPassword(z);
    }

    private final void refreshUIInputNewAuthCode() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        gone(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        visible(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        gone(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_new_email_tip);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_new_email_tip");
        visible(textView);
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_error_code);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_code");
        gone(textView2);
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.tv_switch_to_password);
        Intrinsics.checkNotNullExpressionValue(textView3, "tv_switch_to_password");
        gone(textView3);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R$string.change_email_tips_4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.change_email_tips_4)");
        boolean z = true;
        String format = String.format(string, Arrays.copyOf(new Object[]{((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        ((TextView) _$_findCachedViewById(R$id.tv_new_email_tip)).setText(format);
        ((EditText) _$_findCachedViewById(R$id.component_input_code)).setBackgroundResource(R$drawable.edittext_background_contour_f3);
        if (!Intrinsics.areEqual((Object) this.newEmailCode, (Object) ((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString())) {
            ((EditText) _$_findCachedViewById(R$id.component_input_code)).setText(this.newEmailCode);
        }
        if (((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString().length() <= 0) {
            z = false;
        }
        enableNextButton(z);
    }

    private final void refreshUIInputNewEmail() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        gone(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        gone(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        visible(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_error_email);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_error_email");
        gone(textView);
        boolean z = true;
        if (!(((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString().length() > 0) || !C1519p.m1017a(((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString())) {
            z = false;
        }
        enableNextButton(z);
        if (!Intrinsics.areEqual((Object) this.oldEmailCode, (Object) ((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString())) {
            ((EditText) _$_findCachedViewById(R$id.component_input_code)).setText(this.oldEmailCode);
        }
    }

    private final void refreshUIInputNewPassword(boolean z) {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        visible(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        gone(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        gone(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_switch_to_code);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_switch_to_code");
        gone(textView);
        EditText editText = (EditText) _$_findCachedViewById(R$id.component_input_password);
        String str = this.newPassword;
        boolean z2 = true;
        if (str.length() == 0) {
            str = "";
        }
        editText.setText(str);
        ((EditText) _$_findCachedViewById(R$id.component_input_password)).setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_contour_f3);
        if (!(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString().length() > 0) || !isContainsNumbersAndLetters(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString())) {
            z2 = false;
        }
        enableNextButton(z2);
    }

    public static /* synthetic */ void refreshUIInputNewPassword$default(ChangeEmailDialog changeEmailDialog, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        changeEmailDialog.refreshUIInputNewPassword(z);
    }

    private final void refreshUIInputOldAuthCode() {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        gone(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        visible(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        gone(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_new_email_tip);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_new_email_tip");
        gone(textView);
        if (!this.hasPassword) {
            TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_switch_to_password);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_switch_to_password");
            gone(textView2);
        }
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.tv_error_code);
        Intrinsics.checkNotNullExpressionValue(textView3, "tv_error_code");
        gone(textView3);
        if (!Intrinsics.areEqual((Object) this.oldEmailCode, (Object) ((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString())) {
            ((EditText) _$_findCachedViewById(R$id.component_input_code)).setText(this.oldEmailCode);
        }
        enableNextButton(((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString().length() > 0);
    }

    private final void refreshUIInputOldPassword(boolean z) {
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_password);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_password");
        visible(linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_old_code);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_old_code");
        gone(linearLayout2);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R$id.ll_email);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "ll_email");
        gone(linearLayout3);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_error_password);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_error_password");
        gone(textView);
        ((EditText) _$_findCachedViewById(R$id.component_input_password)).setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_contour_f3);
        boolean z2 = true;
        if (!(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString().length() > 0) || !isContainsNumbersAndLetters(((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString())) {
            z2 = false;
        }
        enableNextButton(z2);
    }

    public static /* synthetic */ void refreshUIInputOldPassword$default(ChangeEmailDialog changeEmailDialog, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        changeEmailDialog.refreshUIInputOldPassword(z);
    }

    /* access modifiers changed from: private */
    public final void requestAuthCode(String str, int i) {
        showLoading$default(this, false, 1, (Object) null);
        getAccountViewModel().getVerificationCode(str, String.valueOf(i));
    }

    /* access modifiers changed from: private */
    public final void requestChangeEmail() {
        String str;
        String str2;
        String str3;
        showLoading$default(this, false, 1, (Object) null);
        AccountViewModel accountViewModel = getAccountViewModel();
        if (!Intrinsics.areEqual((Object) this.currentProcess, (Object) PROCESS_CHANGE_EMAIL_WITH_PASSWORD)) {
            str = "";
        } else {
            str = StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString()).toString();
        }
        if (!Intrinsics.areEqual((Object) this.currentProcess, (Object) PROCESS_CHANGE_EMAIL_WITH_PASSWORD)) {
            str2 = this.oldEmailCode;
        } else {
            str2 = "";
        }
        String str4 = this.newEmailCode;
        String obj = StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString();
        if (!Intrinsics.areEqual((Object) this.currentProcess, (Object) PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD)) {
            str3 = "";
        } else {
            str3 = this.confirmNewPassword;
        }
        accountViewModel.updateEmail(str, str2, str4, obj, str3);
    }

    /* access modifiers changed from: private */
    public final void requestCheckAuthCode(String str, int i) {
        showLoading$default(this, false, 1, (Object) null);
        getAccountViewModel().checkAuthCode(str, StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.component_input_code)).getText().toString()).toString(), String.valueOf(i));
    }

    /* access modifiers changed from: private */
    public final void requestCheckNewEmail() {
        showLoading$default(this, false, 1, (Object) null);
        getAccountViewModel().checkLoginNameSign(StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString());
    }

    /* access modifiers changed from: private */
    public final void requestCheckPassword() {
        showLoading$default(this, false, 1, (Object) null);
        getAccountViewModel().checkPassword(this.oldEmail, ((EditText) _$_findCachedViewById(R$id.component_input_password)).getText().toString());
    }

    /* access modifiers changed from: private */
    public final void resetResendButton() {
        ((TextView) _$_findCachedViewById(R$id.send_it_to_me)).setTextColor(ViewCompat.MEASURED_STATE_MASK);
        ((TextView) _$_findCachedViewById(R$id.send_it_to_me)).setText(getString(R$string.resend));
        ((TextView) _$_findCachedViewById(R$id.send_it_to_me)).setEnabled(true);
    }

    private final void runOnUIThread(Function0<Unit> function0) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), (CoroutineStart) null, new ChangeEmailDialog$runOnUIThread$1(function0, (Continuation<? super ChangeEmailDialog$runOnUIThread$1>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void showEdittextError(EditText editText, boolean z) {
        editText.setBackgroundResource(z ? R$drawable.edittext_background_error : R$drawable.edittext_background_contour_f3);
    }

    private final void showLoading(boolean z) {
        if (z) {
            displayLoadingDialog();
        } else {
            dismissLoadingDialog();
        }
    }

    public static /* synthetic */ void showLoading$default(ChangeEmailDialog changeEmailDialog, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        changeEmailDialog.showLoading(z);
    }

    private final void startNewEmailTimer() {
        this.newCodeJob = timer$default(this, 0, 0, (CoroutineScope) null, new ChangeEmailDialog$startNewEmailTimer$1(this), new ChangeEmailDialog$startNewEmailTimer$2(this), 7, (Object) null);
    }

    private final void startOldEmailTimer() {
        this.oldCodeJob = timer$default(this, 0, 0, (CoroutineScope) null, new ChangeEmailDialog$startOldEmailTimer$1(this), new ChangeEmailDialog$startOldEmailTimer$2(this), 7, (Object) null);
    }

    private final void subscribeObserver() {
        this.liveDataUIState.observe(this, new C7278i(this));
        getAccountViewModel().getGetVerificationLiveData().observe(this, new C7276g(this));
        getAccountViewModel().getSignInLiveData().observe(this, new C7277h(this));
        getAccountViewModel().getCheckAuthCodeLiveData().observe(this, new C7272c(this));
        getAccountViewModel().getCheckLoginNameSignLiveData().observe(this, new C7275f(this));
        getAccountViewModel().getChangeEmailLiveData().observe(this, new C7274e(this));
    }

    /* renamed from: subscribeObserver$lambda-10  reason: not valid java name */
    public static final void m26911subscribeObserver$lambda10(ChangeEmailDialog changeEmailDialog, Pair pair) {
        String str;
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        changeEmailDialog.showLoading(false);
        if (pair != null) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                changeEmailDialog.log("校验密码成功");
                changeEmailDialog.liveDataUIState.setValue(Integer.valueOf(changeEmailDialog.currentProcess.nextStep()));
                return;
            }
            changeEmailDialog.logE("校验密码失败");
            changeEmailDialog.enableNextButton(false);
            String str2 = (String) pair.getSecond();
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) RunnerArgs.CLASSPATH_SEPARATOR, false, 2, (Object) null)) {
                int parseInt = Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) pair.getSecond(), new String[]{RunnerArgs.CLASSPATH_SEPARATOR}, false, 0, 6, (Object) null).get(1));
                String string = changeEmailDialog.getString(R$string.wrong_email_or_password_num, Integer.valueOf(parseInt));
                Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …                        )");
                EditText editText = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_password);
                Intrinsics.checkNotNullExpressionValue(editText, "component_input_password");
                changeEmailDialog.showEdittextError(editText, true);
                ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password)).setText(string);
                TextView textView = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_error_password");
                changeEmailDialog.visible(textView);
                return;
            }
            if (Intrinsics.areEqual((Object) str2, (Object) "600925")) {
                str = changeEmailDialog.getString(R$string.account_locked);
            } else if (Intrinsics.areEqual((Object) str2, (Object) "")) {
                str = changeEmailDialog.getString(R$string.network_lost);
            } else {
                str = changeEmailDialog.getString(R$string.change_email_error_pwd);
            }
            Intrinsics.checkNotNullExpressionValue(str, "when (secondStr) {\n     …                        }");
            EditText editText2 = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_password);
            Intrinsics.checkNotNullExpressionValue(editText2, "component_input_password");
            changeEmailDialog.showEdittextError(editText2, true);
            ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password)).setText(str);
            TextView textView2 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_password");
            changeEmailDialog.visible(textView2);
            if (Intrinsics.areEqual((Object) str2, (Object) "600925")) {
                Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
                a.withString("email", ((EditText) changeEmailDialog._$_findCachedViewById(R$id.sign_email)).getText().toString());
                a.withString(EventBusConstKt.LOGIN, "false");
                a.navigation();
            }
        }
    }

    /* renamed from: subscribeObserver$lambda-11  reason: not valid java name */
    public static final void m26912subscribeObserver$lambda11(ChangeEmailDialog changeEmailDialog, Pair pair) {
        int i;
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            changeEmailDialog.showLoading(false);
            Integer value = changeEmailDialog.liveDataUIState.getValue();
            if (value != null && value.intValue() == 3) {
                changeEmailDialog.logE("旧邮箱验证码验证失败");
            } else if (value != null && value.intValue() == 2) {
                changeEmailDialog.logE("新邮箱验证码验证失败");
                TextView textView = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_new_email_tip);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_new_email_tip");
                changeEmailDialog.gone(textView);
            }
            changeEmailDialog.enableNextButton(false);
            EditText editText = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_code);
            Intrinsics.checkNotNullExpressionValue(editText, "component_input_code");
            changeEmailDialog.showEdittextError(editText, true);
            TextView textView2 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code);
            if (((Number) pair.getSecond()).intValue() == 600933) {
                i = R$string.auth_code_expired_error;
            } else {
                i = R$string.change_email_error_code;
            }
            textView2.setText(changeEmailDialog.getString(i));
            TextView textView3 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code);
            Intrinsics.checkNotNullExpressionValue(textView3, "tv_error_code");
            changeEmailDialog.visible(textView3);
            return;
        }
        Integer value2 = changeEmailDialog.liveDataUIState.getValue();
        if (value2 != null && value2.intValue() == 3) {
            changeEmailDialog.log("旧邮箱验证码验证成功");
            changeEmailDialog.showLoading(false);
            changeEmailDialog.liveDataUIState.setValue(Integer.valueOf(changeEmailDialog.currentProcess.nextStep()));
        } else if (value2 != null && value2.intValue() == 2) {
            changeEmailDialog.log("新邮箱验证码验证成功");
            if (Intrinsics.areEqual((Object) changeEmailDialog.currentProcess, (Object) PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD)) {
                changeEmailDialog.showLoading(false);
                changeEmailDialog.liveDataUIState.setValue(Integer.valueOf(changeEmailDialog.currentProcess.nextStep()));
                return;
            }
            changeEmailDialog.requestChangeEmail();
        }
    }

    /* renamed from: subscribeObserver$lambda-12  reason: not valid java name */
    public static final void m26913subscribeObserver$lambda12(ChangeEmailDialog changeEmailDialog, Pair pair) {
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        changeEmailDialog.showLoading(false);
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str = (String) pair.getSecond();
            if (Intrinsics.areEqual((Object) str, (Object) "0")) {
                changeEmailDialog.log("校验邮箱成功:" + StringsKt__StringsKt.trim((CharSequence) ((EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString() + "未被注册过");
                changeEmailDialog.liveDataUIState.setValue(Integer.valueOf(changeEmailDialog.currentProcess.nextStep()));
            } else if (Intrinsics.areEqual((Object) str, (Object) "1")) {
                changeEmailDialog.logE("校验邮箱失败:" + StringsKt__StringsKt.trim((CharSequence) ((EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email)).getText().toString()).toString() + "已被注册过");
                changeEmailDialog.enableNextButton(false);
                EditText editText = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email);
                Intrinsics.checkNotNullExpressionValue(editText, "component_input_email");
                changeEmailDialog.showEdittextError(editText, true);
                ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_email)).setText(changeEmailDialog.getString(R$string.email_has_registered_tips));
                TextView textView = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_email);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_error_email");
                changeEmailDialog.visible(textView);
            }
        } else {
            changeEmailDialog.logE("校验邮箱失败:异常失败");
            changeEmailDialog.enableNextButton(false);
            EditText editText2 = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email);
            Intrinsics.checkNotNullExpressionValue(editText2, "component_input_email");
            changeEmailDialog.showEdittextError(editText2, true);
            ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_email)).setText(changeEmailDialog.getString(R$string.request_fail_tips));
            TextView textView2 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_email);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_email");
            changeEmailDialog.visible(textView2);
        }
    }

    /* renamed from: subscribeObserver$lambda-14  reason: not valid java name */
    public static final void m26914subscribeObserver$lambda14(ChangeEmailDialog changeEmailDialog, Pair pair) {
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        changeEmailDialog.showLoading(false);
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                changeEmailDialog.showString(R$string.network_lost);
            } else if (intValue == 1) {
                changeEmailDialog.showString(R$string.wrong_email_or_password);
            }
        } else {
            int intValue2 = ((Number) pair.getSecond()).intValue();
            if (intValue2 == 0) {
                AccountUtils.Companion companion = AccountUtils.Companion;
                companion.deleteUserEmail(changeEmailDialog.oldEmail);
                if (changeEmailDialog.hasPassword) {
                    companion.saveUserEmail(((EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_email)).getText().toString());
                }
                Dialog dialog = changeEmailDialog.getDialog();
                if (dialog != null) {
                    dialog.cancel();
                }
                changeEmailDialog.requireActivity().finish();
                changeEmailDialog.liveDataUIState.setValue(Integer.valueOf(changeEmailDialog.currentProcess.nextStep()));
            } else if (intValue2 == 600709) {
                changeEmailDialog.enableNextButton(false);
                EditText editText = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_code);
                Intrinsics.checkNotNullExpressionValue(editText, "component_input_code");
                changeEmailDialog.showEdittextError(editText, true);
                ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code)).setText(changeEmailDialog.getString(R$string.wrong_email_or_password_num));
                TextView textView = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code);
                Intrinsics.checkNotNullExpressionValue(textView, "tv_error_code");
                changeEmailDialog.visible(textView);
            } else if (intValue2 == 600903) {
                changeEmailDialog.enableNextButton(false);
                if (changeEmailDialog.currentProcess.getCurrentStep() == 5) {
                    EditText editText2 = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_password);
                    Intrinsics.checkNotNullExpressionValue(editText2, "component_input_password");
                    changeEmailDialog.showEdittextError(editText2, true);
                    ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password)).setText(changeEmailDialog.getString(R$string.change_email_error_code));
                    TextView textView2 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_password);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_password");
                    changeEmailDialog.visible(textView2);
                    return;
                }
                EditText editText3 = (EditText) changeEmailDialog._$_findCachedViewById(R$id.component_input_code);
                Intrinsics.checkNotNullExpressionValue(editText3, "component_input_code");
                changeEmailDialog.showEdittextError(editText3, true);
                ((TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code)).setText(changeEmailDialog.getString(R$string.change_email_error_code));
                TextView textView3 = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_error_code);
                Intrinsics.checkNotNullExpressionValue(textView3, "tv_error_code");
                changeEmailDialog.visible(textView3);
            }
        }
    }

    /* renamed from: subscribeObserver$lambda-6  reason: not valid java name */
    public static final void m26915subscribeObserver$lambda6(ChangeEmailDialog changeEmailDialog, Integer num) {
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        if (num != null) {
            changeEmailDialog.refreshUI();
        }
    }

    /* renamed from: subscribeObserver$lambda-7  reason: not valid java name */
    public static final void m26916subscribeObserver$lambda7(ChangeEmailDialog changeEmailDialog, Pair pair) {
        Intrinsics.checkNotNullParameter(changeEmailDialog, "this$0");
        changeEmailDialog.showLoading(false);
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            changeEmailDialog.showString(R$string.network_lost);
        } else if (((Number) pair.getSecond()).intValue() != 600719) {
            ((TextView) changeEmailDialog._$_findCachedViewById(R$id.send_it_to_me)).setText("60s");
            ((TextView) changeEmailDialog._$_findCachedViewById(R$id.send_it_to_me)).setEnabled(false);
            ((TextView) changeEmailDialog._$_findCachedViewById(R$id.send_it_to_me)).setTextColor(changeEmailDialog.requireContext().getColor(R$color.color_bebebe));
            Integer value = changeEmailDialog.liveDataUIState.getValue();
            if (value != null && value.intValue() == 3) {
                changeEmailDialog.startOldEmailTimer();
                return;
            }
            TextView textView = (TextView) changeEmailDialog._$_findCachedViewById(R$id.tv_new_email_tip);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_new_email_tip");
            changeEmailDialog.visible(textView);
            changeEmailDialog.startNewEmailTimer();
        }
    }

    /* access modifiers changed from: private */
    public final void switchProcess(boolean z) {
        Process process = z ? PROCESS_CHANGE_EMAIL_WITH_CODE_HAS_PASSWORD : PROCESS_CHANGE_EMAIL_WITH_PASSWORD;
        this.currentProcess = process;
        this.liveDataUIState.setValue(Integer.valueOf(process.getCurrentStep()));
    }

    private final Job timer(int i, long j, CoroutineScope coroutineScope, Function0<Unit> function0, Function1<? super Integer, Unit> function1) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new ChangeEmailDialog$timer$1(i, j, function0, function1, (Continuation<? super ChangeEmailDialog$timer$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ Job timer$default(ChangeEmailDialog changeEmailDialog, int i, long j, CoroutineScope coroutineScope, Function0 function0, Function1 function1, int i2, Object obj) {
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
        return changeEmailDialog.timer(i3, j2, coroutineScope, function0, function1);
    }

    /* access modifiers changed from: private */
    public final void visible(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.c_change_email_common_dialog;
    }

    @NotNull
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = super.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "super.getLifecycle()");
        return lifecycle;
    }

    public void initSelecter() {
        enableNextButton(false);
        this.liveDataUIState.setValue(Integer.valueOf(this.currentProcess.getCurrentStep()));
        refreshUI();
        subscribeObserver();
        if (this.currentProcess.getCurrentStep() == 3) {
            requestAuthCode(this.oldEmail, 5);
        }
    }

    public void onCancel(@NotNull DialogInterface dialogInterface) {
        Job job;
        Job job2;
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        this.dismissed = true;
        Job job3 = this.oldCodeJob;
        boolean z = false;
        if ((job3 != null && job3.isActive()) && (job2 = this.oldCodeJob) != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job4 = this.newCodeJob;
        if (job4 != null && job4.isActive()) {
            z = true;
        }
        if (z && (job = this.newCodeJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        super.onCancel(dialogInterface);
    }

    public void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Job job;
        Job job2;
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        this.currentProcess.resetStep();
        this.liveDataUIState.removeObserver(new C7273d(this));
        this.liveDataUIState.setValue(null);
        this.dismissed = true;
        Job job3 = this.oldCodeJob;
        boolean z = false;
        if ((job3 != null && job3.isActive()) && (job2 = this.oldCodeJob) != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        Job job4 = this.newCodeJob;
        if (job4 != null && job4.isActive()) {
            z = true;
        }
        if (z && (job = this.newCodeJob) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        super.onDismiss(dialogInterface);
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_switch_to_code);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_switch_to_code");
        JuConnectExtKt.singleClickListener(textView, new ChangeEmailDialog$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.tv_switch_to_password);
        Intrinsics.checkNotNullExpressionValue(textView2, "tv_switch_to_password");
        JuConnectExtKt.singleClickListener(textView2, new ChangeEmailDialog$setListeners$2(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(textView3, "tv_cancel");
        JuConnectExtKt.singleClickListener(textView3, new ChangeEmailDialog$setListeners$3(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.tv_certain);
        Intrinsics.checkNotNullExpressionValue(textView4, "tv_certain");
        JuConnectExtKt.singleClickListener(textView4, new ChangeEmailDialog$setListeners$4(this));
        TextView textView5 = (TextView) _$_findCachedViewById(R$id.send_it_to_me);
        Intrinsics.checkNotNullExpressionValue(textView5, "send_it_to_me");
        JuConnectExtKt.singleClickListener(textView5, new ChangeEmailDialog$setListeners$5(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.component_input_password);
        Intrinsics.checkNotNullExpressionValue(editText, "component_input_password");
        editText.addTextChangedListener(new ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$1(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.component_input_code);
        Intrinsics.checkNotNullExpressionValue(editText2, "component_input_code");
        editText2.addTextChangedListener(new ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$2(this));
        EditText editText3 = (EditText) _$_findCachedViewById(R$id.component_input_email);
        Intrinsics.checkNotNullExpressionValue(editText3, "component_input_email");
        editText3.addTextChangedListener(new ChangeEmailDialog$setListeners$$inlined$doAfterTextChanged$3(this));
    }
}
