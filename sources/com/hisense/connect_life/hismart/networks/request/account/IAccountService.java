package com.hisense.connect_life.hismart.networks.request.account;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import com.hisense.connect_life.hismart.model.CheckUpgradeResponse;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.JHKUserAgreementBean;
import com.hisense.connect_life.hismart.networks.request.device.model.JhlRegisterResult;
import com.hisense.connect_life.hismart.networks.request.device.model.RegisterInfo;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J/\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JW\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J7\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J'\u0010\u001c\u001a\u00020\u00032\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J?\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J?\u0010#\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JT\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u001e\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 0)\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J@\u0010*\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J8\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J\u0016\u0010/\u001a\u00020\t2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t01H\u0016J'\u00102\u001a\u00020\t2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H'J7\u00104\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H'JB\u00106\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JB\u00108\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J2\u00109\u001a\u00020\u00032\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JQ\u0010:\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J/\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J?\u0010<\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JO\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JG\u0010A\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J?\u0010C\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JH\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J?\u0010J\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J_\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&JO\u0010Q\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J7\u0010R\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J?\u0010T\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H'JH\u0010W\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J8\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\\2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JO\u0010]\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u001d\u0010\u000f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\u0012H&J8\u0010a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H&¨\u0006b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/IAccountService;", "", "addUserProfile", "Lio/reactivex/disposables/Disposable;", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "success", "Lkotlin/Function1;", "", "", "failure", "", "anonymousLogin", "sourceId", "", "hiSmartCallback", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "Lkotlin/ExtensionFunctionType;", "checkAuthCode", "loginName", "authCode", "delFlag", "devSerial", "authCodeType", "token", "Lcom/hisense/connect_life/hismart/networks/request/device/model/JhlRegisterResult;", "checkLoginNameSign", "checkPass", "checkUpgrade", "languageId", "versionCode", "", "appId", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeResponse;", "checkUpgradeByPackage", "packageName", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "deleteAccount", "password", "accessToken", "Lkotlin/Pair;", "deleteUserData", "customerId", "downloadFileWithDynamicUrlSync", "fileUrl", "Lokhttp3/ResponseBody;", "errorCallback", "HiSmartCallback", "Lkotlin/Function0;", "getJHKRegisterProtocol", "Lcom/hisense/connect_life/hismart/networks/request/device/model/JHKUserAgreementBean;", "getJHKUserRegisterProtocol", "requestType", "getJHLProtocolInfo", "Lcom/hisense/connect_life/hismart/model/JHLAgreementData;", "getJHLUserProtocolInfo", "getUserProfile", "login", "logout", "refreshToken", "deviceId", "register", "mailbox", "Lcom/hisense/connect_life/hismart/networks/request/device/model/RegisterInfo;", "resetPassword", "newPassword", "resetPasswordByOldPsw", "oldPassword", "saveLoginLog", "userId", "loginTime", "", "phoneModel", "sendVerificationCode", "email", "codeType", "thirdRegister", "thirdClientId", "thirdType", "idToken", "thirdSignIn", "thirdUnBind", "Lcom/hisense/connect_life/hismart/model/JuResponse;", "updateJHKUserRegisterProtocol", "tosVer", "ppVer", "updateJHLUserRegisterProtocol", "ppVersion", "tosVersion", "updateProfilePhoto", "file", "Ljava/io/File;", "updateUserEmail", "oldAuthCode", "newAuthCode", "newEmail", "updateUserProfile", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IAccountService.kt */
public interface IAccountService {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: IAccountService.kt */
    public static final class DefaultImpls {
        public static void errorCallback(@NotNull IAccountService iAccountService, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(iAccountService, "this");
            Intrinsics.checkNotNullParameter(function0, "HiSmartCallback");
        }
    }

    @NotNull
    C9207b addUserProfile(@NotNull UserProfile userProfile, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b anonymousLogin(@NotNull String str, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1);

    @NotNull
    C9207b checkAuthCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Function1<? super HiSmartCallback<JhlRegisterResult>, Unit> function1);

    @NotNull
    C9207b checkLoginNameSign(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<String>, Unit> function1);

    @NotNull
    C9207b checkPass(@NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b checkUpgrade(@NotNull String str, int i, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<CheckUpgradeResponse>, Unit> function1);

    @NotNull
    C9207b checkUpgradeByPackage(@NotNull String str, int i, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<CheckUpgradeByPackageResponse>, Unit> function1);

    @NotNull
    C9207b deleteAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Pair<Boolean, Integer>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b deleteUserData(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b downloadFileWithDynamicUrlSync(@NotNull String str, @NotNull Function1<? super ResponseBody, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void errorCallback(@NotNull Function0<Unit> function0);

    @Deprecated(message = "已变更为聚好联协议接口")
    void getJHKRegisterProtocol(@NotNull Function1<? super HiSmartCallback<JHKUserAgreementBean>, Unit> function1);

    @Deprecated(message = "已变更为聚好联协议接口")
    void getJHKUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<JHKUserAgreementBean>, Unit> function1);

    @NotNull
    C9207b getJHLProtocolInfo(@NotNull String str, @NotNull String str2, @NotNull Function1<? super JHLAgreementData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getJHLUserProtocolInfo(@NotNull String str, @NotNull String str2, @NotNull Function1<? super JHLAgreementData, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getUserProfile(@NotNull Function1<? super UserProfile, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b login(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1);

    @NotNull
    C9207b logout(@NotNull String str, @NotNull Function1<? super HiSmartCallback<String>, Unit> function1);

    @NotNull
    C9207b refreshToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1);

    @NotNull
    C9207b register(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<RegisterInfo>, Unit> function1);

    @NotNull
    C9207b resetPassword(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b resetPasswordByOldPsw(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b saveLoginLog(@NotNull String str, long j, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b sendVerificationCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b thirdRegister(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull Function1<? super HiSmartCallback<RegisterInfo>, Unit> function1);

    @NotNull
    C9207b thirdSignIn(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<ClientLoginInfo>, Unit> function1);

    @NotNull
    C9207b thirdUnBind(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiSmartCallback<JuResponse>, Unit> function1);

    @Deprecated(message = "已变更为聚好联协议接口")
    void updateJHKUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b updateJHLUserRegisterProtocol(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateProfilePhoto(@NotNull File file, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateUserEmail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Function1<? super HiSmartCallback<Boolean>, Unit> function1);

    @NotNull
    C9207b updateUserProfile(@NotNull UserProfile userProfile, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
