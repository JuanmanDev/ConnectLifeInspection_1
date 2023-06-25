package com.hisense.connect_life.hismart.networks.request.account;

import com.hisense.connect_life.hismart.model.CheckPassResponse;
import com.hisense.connect_life.hismart.model.CheckUpgradeByPackageResponse;
import com.hisense.connect_life.hismart.model.CheckUpgradeResponse;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.model.JuUserAgreement;
import com.hisense.connect_life.hismart.networks.request.account.model.JuUserProfile;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.RegisterInfo;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9954j;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9960p;
import p692o.p698x.C9961q;
import p692o.p698x.C9964t;
import p692o.p698x.C9966v;
import p692o.p698x.C9967w;

@Metadata(mo47990d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0012H'J*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J*\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J*\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010!\u001a\u00020\u0007H'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\u0007H'J\u001e\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J*\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H'J\u001e\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J9\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u00100\u001a\u0002012\u0019\b\u0001\u00102\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b30\u0011H'J\u001e\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u00065"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/JuAccountApi;", "", "addUserProfile", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/model/JuCustomResult;", "Lcom/hisense/connect_life/hismart/model/JuResponse;", "params", "Lokhttp3/RequestBody;", "changeEmail", "checkEmailAuthCode", "checkEmailRegister", "checkPass", "Lcom/hisense/connect_life/hismart/model/CheckPassResponse;", "checkUpgrade", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeResponse;", "checkUpgradeByPackage", "Lcom/hisense/connect_life/hismart/model/CheckUpgradeByPackageResponse;", "", "", "deleteAccount", "deleteUserData", "downloadFileWithDynamicUrlAsync", "Lokhttp3/ResponseBody;", "fileUrl", "getAccountInfo", "getAuthCode", "getJHLProtocolInfo", "Lcom/hisense/connect_life/hismart/model/JuUserAgreement;", "getJHLUserProtocolInfo", "getUserProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/JuUserProfile;", "login", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "profile", "logout", "refreshToken", "register", "Lcom/hisense/connect_life/hismart/networks/request/device/model/RegisterInfo;", "body", "resetPWD", "saveLoginLog", "thirdLogin", "thirdRegister", "thirdUnbind", "updateAccountInfo", "updateJHLCustomerProtocol", "updatePWD", "updateProfilePhoto", "fileBody", "Lokhttp3/MultipartBody$Part;", "requestBodyMap", "Lkotlin/jvm/JvmSuppressWildcards;", "updateUserProfile", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuAccountApi.kt */
public interface JuAccountApi {
    @C9958n("/account/add_user_profile")
    @NotNull
    @C9954j({"Content-Type: application/json"})
    C9185c<JuCustomResult<JuResponse>> addUserProfile(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/change_email")
    C9185c<JuCustomResult<JuResponse>> changeEmail(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/check_mailbox_code")
    C9185c<JuCustomResult<JuResponse>> checkEmailAuthCode(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/check_mailbox_regist")
    C9185c<JuCustomResult<JuResponse>> checkEmailRegister(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/check_pass")
    C9185c<JuCustomResult<CheckPassResponse>> checkPass(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/app/get-app-policy")
    C9185c<JuCustomResult<CheckUpgradeResponse>> checkUpgrade(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("/app/getPolicyByPackage")
    C9185c<JuCustomResult<CheckUpgradeByPackageResponse>> checkUpgradeByPackage(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/account/acc/del_account")
    C9185c<JuCustomResult<JuResponse>> deleteAccount(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/delete_user_data")
    C9185c<JuCustomResult<JuResponse>> deleteUserData(@NotNull @C9964t Map<String, String> map);

    @C9950f
    @C9966v
    @NotNull
    C9185c<ResponseBody> downloadFileWithDynamicUrlAsync(@C9967w @NotNull String str);

    @NotNull
    @C9958n("/account/acc/get_account_info")
    C9185c<JuCustomResult<JuResponse>> getAccountInfo(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/account/acc/get_mailbox_code")
    C9185c<JuCustomResult<JuResponse>> getAuthCode(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("/account/get_pa_tos")
    C9185c<JuCustomResult<JuUserAgreement>> getJHLProtocolInfo(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("/account/check_pa_tos")
    C9185c<JuCustomResult<JuUserAgreement>> getJHLUserProtocolInfo(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("/account/get_user_profile")
    C9185c<JuCustomResult<JuUserProfile>> getUserProfile(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/account/acc/login_pwd")
    C9185c<JuCustomResult<ClientLoginInfo>> login(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/logout")
    C9185c<JuCustomResult<JuResponse>> logout(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/refresh_token")
    C9185c<JuCustomResult<ClientLoginInfo>> refreshToken(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/mailbox_regist")
    C9185c<JuCustomResult<RegisterInfo>> register(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/reset_pwd")
    C9185c<JuCustomResult<JuResponse>> resetPWD(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/save_login_log")
    C9185c<JuCustomResult<JuResponse>> saveLoginLog(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/account/acc/token_sign_in")
    C9185c<JuCustomResult<ClientLoginInfo>> thirdLogin(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/token_sign_up")
    C9185c<JuCustomResult<RegisterInfo>> thirdRegister(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/cancel_auth")
    C9185c<JuCustomResult<JuResponse>> thirdUnbind(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/update_account_info")
    C9185c<JuCustomResult<JuResponse>> updateAccountInfo(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/account/update_pa_tos")
    C9185c<JuCustomResult<JuResponse>> updateJHLCustomerProtocol(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/update_pwd")
    C9185c<JuCustomResult<JuResponse>> updatePWD(@NotNull @C9945a RequestBody requestBody);

    @C9958n("/account/update_profile_photo")
    @C9955k
    @NotNull
    C9185c<JuCustomResult<JuResponse>> updateProfilePhoto(@NotNull @C9960p MultipartBody.Part part, @NotNull @C9961q Map<String, RequestBody> map);

    @NotNull
    @C9958n("/account/update_user_profile")
    C9185c<JuCustomResult<JuResponse>> updateUserProfile(@NotNull @C9945a RequestBody requestBody);
}
