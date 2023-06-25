package com.hisense.connect_life.third_account.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.third_account.util.AccountUtils;
import com.hisense.connect_life.third_account.util.RefreshTokenUtils;
import com.hisense.connect_life.third_account.work.RefreshTokenWorkManger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1502i;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0002J0\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0002J6\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bJ&\u0010,\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010-\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R-\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b8FX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR-\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR-\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t0\b8FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006."}, mo47991d2 = {"Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "CHECK_THIRD_LOGIN", "", "CHECK_THIRD_REGIEST", "UNBIND_THIRD_ACCOUNT", "thirdLoginLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "getThirdLoginLiveData", "()Landroidx/lifecycle/MutableLiveData;", "thirdLoginLiveData$delegate", "Lkotlin/Lazy;", "thirdRegisterLiveData", "getThirdRegisterLiveData", "thirdRegisterLiveData$delegate", "thirdUnbindLiveData", "getThirdUnbindLiveData", "thirdUnbindLiveData$delegate", "anonymousLogin", "", "requestFun", "arg", "", "", "(I[Ljava/lang/Object;)V", "checkIsLogin", "setLoginSuccInfo", "clientLoginInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "email", "password", "loginSource", "thirdPlatformId", "thirdRegister", "thirdClientId", "thirdType", "idToken", "mailbox", "authCode", "sourceId", "thirdSignIn", "thirdUnbind", "third_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ThirdAccountViewModel.kt */
public class ThirdAccountViewModel extends BaseViewModel {
    public final int CHECK_THIRD_LOGIN = 1;
    public final int CHECK_THIRD_REGIEST = 2;
    public final int UNBIND_THIRD_ACCOUNT = 3;
    @NotNull
    public final Lazy thirdLoginLiveData$delegate = LazyKt__LazyJVMKt.lazy(ThirdAccountViewModel$thirdLoginLiveData$2.INSTANCE);
    @NotNull
    public final Lazy thirdRegisterLiveData$delegate = LazyKt__LazyJVMKt.lazy(ThirdAccountViewModel$thirdRegisterLiveData$2.INSTANCE);
    @NotNull
    public final Lazy thirdUnbindLiveData$delegate = LazyKt__LazyJVMKt.lazy(ThirdAccountViewModel$thirdUnbindLiveData$2.INSTANCE);

    private final void anonymousLogin(int i, Object... objArr) {
        updateLoadingStatus(true);
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ThirdAccountViewModel$anonymousLogin$1(i, this, objArr, (Continuation<? super ThirdAccountViewModel$anonymousLogin$1>) null), 2, (Object) null);
    }

    private final boolean checkIsLogin() {
        return !(AppConfig.Companion.getAnonymousLoginToken().length() == 0);
    }

    /* access modifiers changed from: private */
    public final void setLoginSuccInfo(ClientLoginInfo clientLoginInfo, String str, String str2, String str3, String str4) {
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("login sucess: ", C1502i.m931k(clientLoginInfo, ClientLoginInfo.class)));
        SPManagerKt.setCustomerId(clientLoginInfo.getCustomerId());
        AccountUtils.Companion.cacheLoginInfo(clientLoginInfo, str2, str, str3, str4);
        AccountUtils.Companion.updateRefreshToken(clientLoginInfo.getRefreshToken(), clientLoginInfo.getCustomerId());
        RefreshTokenWorkManger.Companion.addRefreshTokenWorker(SPUtils.INSTANCE.getContext());
        HiSmart.Companion.getInstance().updateToken(clientLoginInfo.getAccessToken());
        AppConfig.Companion.setAccessToken(clientLoginInfo.getAccessToken());
        SPManagerKt.setEmail(str);
        SPManagerKt.setPsw(str2);
        RefreshTokenUtils.Companion.getInstance().refreshTokenOnTime(clientLoginInfo.getAccessTokenExpiredTime() / 2, SPUtils.INSTANCE.getContext().getApplicationContext());
        EventBus.getDefault().post(KeyConst.REFRESH_TOKEN);
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getThirdLoginLiveData() {
        return (MutableLiveData) this.thirdLoginLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, String>> getThirdRegisterLiveData() {
        return (MutableLiveData) this.thirdRegisterLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> getThirdUnbindLiveData() {
        return (MutableLiveData) this.thirdUnbindLiveData$delegate.getValue();
    }

    public final void thirdRegister(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str, "thirdClientId");
        Intrinsics.checkNotNullParameter(str8, "thirdType");
        Intrinsics.checkNotNullParameter(str9, EventBusConstKt.ID_TOKEN);
        Intrinsics.checkNotNullParameter(str10, "mailbox");
        Intrinsics.checkNotNullParameter(str11, "authCode");
        Intrinsics.checkNotNullParameter(str12, "sourceId");
        updateLoadingStatus(true);
        if (!checkIsLogin()) {
            anonymousLogin(this.CHECK_THIRD_REGIEST, str7, str8, str9, str10, str11, str12);
            return;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ThirdAccountViewModel$thirdRegister$1(str, str2, str3, str4, str5, str6, this, (Continuation<? super ThirdAccountViewModel$thirdRegister$1>) null), 2, (Object) null);
    }

    public final void thirdSignIn(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str, "thirdType");
        Intrinsics.checkNotNullParameter(str6, "thirdClientId");
        Intrinsics.checkNotNullParameter(str7, EventBusConstKt.ID_TOKEN);
        Intrinsics.checkNotNullParameter(str8, "sourceId");
        updateLoadingStatus(true);
        if (!checkIsLogin()) {
            anonymousLogin(this.CHECK_THIRD_LOGIN, str5, str6, str7, str8);
            return;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new ThirdAccountViewModel$thirdSignIn$1(str, str2, str3, this, (Continuation<? super ThirdAccountViewModel$thirdSignIn$1>) null), 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if ((r1.length() > 0) == true) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void thirdUnbind(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "thirdType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 1
            r8.updateLoadingStatus(r0)
            boolean r1 = r8.checkIsLogin()
            r2 = 0
            if (r1 != 0) goto L_0x003e
            com.hisense.connect_life.hismart.core.HiSmart$Companion r1 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r1 = r1.getInstance()
            com.hisense.connect_life.hismart.core.HiSystemParameter r1 = r1.getHiSystemParameter()
            if (r1 != 0) goto L_0x001e
        L_0x001c:
            r1 = r2
            goto L_0x0031
        L_0x001e:
            java.lang.String r1 = r1.getToken()
            if (r1 != 0) goto L_0x0025
            goto L_0x001c
        L_0x0025:
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x002d
            r1 = r0
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r1 != r0) goto L_0x001c
            r1 = r0
        L_0x0031:
            if (r1 == 0) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            int r1 = r8.UNBIND_THIRD_ACCOUNT
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r9
            r8.anonymousLogin(r1, r0)
            goto L_0x0092
        L_0x003e:
            com.hisense.connect_life.hismart.core.HiSmart$Companion r1 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r1 = r1.getInstance()
            com.hisense.connect_life.hismart.core.HiSystemParameter r1 = r1.getHiSystemParameter()
            if (r1 != 0) goto L_0x004c
        L_0x004a:
            r0 = r2
            goto L_0x005e
        L_0x004c:
            java.lang.String r1 = r1.getToken()
            if (r1 != 0) goto L_0x0053
            goto L_0x004a
        L_0x0053:
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x005b
            r1 = r0
            goto L_0x005c
        L_0x005b:
            r1 = r2
        L_0x005c:
            if (r1 != r0) goto L_0x004a
        L_0x005e:
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0078
            com.hisense.connect_life.hismart.core.HiSmart$Companion r0 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r0 = r0.getInstance()
            com.hisense.connect_life.hismart.core.HiSystemParameter r0 = r0.getHiSystemParameter()
            if (r0 != 0) goto L_0x006f
            goto L_0x007e
        L_0x006f:
            java.lang.String r0 = r0.getToken()
            if (r0 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            r1 = r0
            goto L_0x007e
        L_0x0078:
            com.hisense.connect_life.core.global.AppConfig$Companion r0 = com.hisense.connect_life.core.global.AppConfig.Companion
            java.lang.String r1 = r0.getAnonymousLoginToken()
        L_0x007e:
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r8)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            r4 = 0
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$thirdUnbind$1 r5 = new com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel$thirdUnbind$1
            r0 = 0
            r5.<init>(r9, r1, r8, r0)
            r6 = 2
            r7 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r2, r3, r4, r5, r6, r7)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel.thirdUnbind(java.lang.String):void");
    }
}
