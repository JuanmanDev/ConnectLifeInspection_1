package com.hisense.connect_life.core.global;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/Paths;", "", "()V", "Account", "App", "Device", "Jump", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Paths.kt */
public final class Paths {
    @NotNull
    public static final Paths INSTANCE = new Paths();

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006&"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/Paths$Account;", "", "()V", "AboutActivity", "", "ChangeEmailSuccessActivity", "ChangePasswordActivity", "ChinaModifyPasswordActivity", "ChinaModifyPhoneActivity", "ClipImageActivity", "ConfigTestActivity", "ConformDeleteAccount", "ConformDeleteEmailCode", "CountryListActivity", "DeleteAccount", "DeviceCerVerificationActivity", "GUserAgreementWebViewActivity", "LoginEmailActivity", "LoginFirstActivity", "LoginForgotPswInputEmailActivity", "LoginOrRegisterActivity", "LoginRedirectActivity", "LoginResetFirstActivity", "LoginResetPswActivity", "LoginUsersActivity", "PasswordActivity", "PdfTestActivity", "PrivacyPolicyActivity", "RegisterInputEmaliActiviy", "RegisterInputUserInfoActivity", "RegisterInputVerificationActivity", "RegisterSetPasswordActivity", "RegisterSuccessActivity", "RepeatPasswordActivity", "SingleWebViewActivity", "ThirdFirstLoginInputEmaliActiviy", "UpgradeActivity", "UserProfileActivity", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Paths.kt */
    public static final class Account {
        @NotNull
        public static final String AboutActivity = "/account/AboutActivity";
        @NotNull
        public static final String ChangeEmailSuccessActivity = "/account/ChangeEmailSuccessActivity";
        @NotNull
        public static final String ChangePasswordActivity = "/account/ChangePasswordActivity";
        @NotNull
        public static final String ChinaModifyPasswordActivity = "/account/ChinaModifyPasswordActivity";
        @NotNull
        public static final String ChinaModifyPhoneActivity = "/account/ChinaModifyPhoneActivity";
        @NotNull
        public static final String ClipImageActivity = "/account/ClipImageActivity";
        @NotNull
        public static final String ConfigTestActivity = "/account/ConfigTestActivity";
        @NotNull
        public static final String ConformDeleteAccount = "/account/ConformDeleteAccount";
        @NotNull
        public static final String ConformDeleteEmailCode = "/account/ConformDeleteEmailCode";
        @NotNull
        public static final String CountryListActivity = "/account/CountryListActivity";
        @NotNull
        public static final String DeleteAccount = "/account/DeleteAccount";
        @NotNull
        public static final String DeviceCerVerificationActivity = "/account/DeviceCerVerificationActivity";
        @NotNull
        public static final String GUserAgreementWebViewActivity = "/account/GUserAgreementWebViewActivity";
        @NotNull
        public static final Account INSTANCE = new Account();
        @NotNull
        public static final String LoginEmailActivity = "/account/LoginEmailActivity";
        @NotNull
        public static final String LoginFirstActivity = "/account/LoginFirstActivity";
        @NotNull
        public static final String LoginForgotPswInputEmailActivity = "/account/LoginForgotPswInputEmailActivity";
        @NotNull
        public static final String LoginOrRegisterActivity = "/account/LoginOrRegisterActivity";
        @NotNull
        public static final String LoginRedirectActivity = "/account/LoginRedirectActivity";
        @NotNull
        public static final String LoginResetFirstActivity = "/account/LoginResetFirstActivity";
        @NotNull
        public static final String LoginResetPswActivity = "/account/LoginResetPswActivity";
        @NotNull
        public static final String LoginUsersActivity = "/account/LoginUsersActivity";
        @NotNull
        public static final String PasswordActivity = "/account/PasswordActivity";
        @NotNull
        public static final String PdfTestActivity = "/account/PdfTestActivity";
        @NotNull
        public static final String PrivacyPolicyActivity = "/account/PrivacyPolicyActivity";
        @NotNull
        public static final String RegisterInputEmaliActiviy = "/account/RegisterInputEmaliActiviy";
        @NotNull
        public static final String RegisterInputUserInfoActivity = "/account/RegisterInputUserInfoActivity";
        @NotNull
        public static final String RegisterInputVerificationActivity = "/account/RegisterInputVerificationActivity";
        @NotNull
        public static final String RegisterSetPasswordActivity = "/account/RegisterSetPasswordActivity";
        @NotNull
        public static final String RegisterSuccessActivity = "/account/RegisterSuccessActivity";
        @NotNull
        public static final String RepeatPasswordActivity = "/account/RepeatPasswordActivity";
        @NotNull
        public static final String SingleWebViewActivity = "/account/SingleWebViewActivity";
        @NotNull
        public static final String ThirdFirstLoginInputEmaliActiviy = "/account/ThirdFirstLoginInputEmaliActiviy";
        @NotNull
        public static final String UpgradeActivity = "/account/UpgradeActivity";
        @NotNull
        public static final String UserProfileActivity = "/account/UserProfileActivity";
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/Paths$App;", "", "()V", "AddWineWebViewActivity", "", "HumitureWebViewActivity", "InventoryFilterActivity", "InventoryMainActivity", "InventorySelectTypeActivity", "InventoryTypeDetailActivity", "InventoryWineWebView", "MainActivity", "PropWebViewActivity", "ScanFailureWebViewActivity", "SettingWineWebViewActivity", "StatisticsWebViewActivity", "TakePhotoWebViewActivity", "VivinoWebViewActivity", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Paths.kt */
    public static final class App {
        @NotNull
        public static final String AddWineWebViewActivity = "/app/addWineWebViewActivity";
        @NotNull
        public static final String HumitureWebViewActivity = "/app/HumitureWebViewActivity";
        @NotNull
        public static final App INSTANCE = new App();
        @NotNull
        public static final String InventoryFilterActivity = "/app/InventoryFilterActivity";
        @NotNull
        public static final String InventoryMainActivity = "/app/InventoryMainActivity";
        @NotNull
        public static final String InventorySelectTypeActivity = "/app/InventorySelectTypeActivity";
        @NotNull
        public static final String InventoryTypeDetailActivity = "/app/InventoryTypeDetailActivity";
        @NotNull
        public static final String InventoryWineWebView = "/app/inventoryWineWebView";
        @NotNull
        public static final String MainActivity = "/app/MainActivity";
        @NotNull
        public static final String PropWebViewActivity = "/app/propWebViewActivity";
        @NotNull
        public static final String ScanFailureWebViewActivity = "/app/scanFailureWebViewActivity";
        @NotNull
        public static final String SettingWineWebViewActivity = "/app/customWineWebViewActivity";
        @NotNull
        public static final String StatisticsWebViewActivity = "/app/statisticsWebViewActivity";
        @NotNull
        public static final String TakePhotoWebViewActivity = "/app/takePhotoWebViewActivity";
        @NotNull
        public static final String VivinoWebViewActivity = "/app/VivinoWebViewActivity";
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006%"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/Paths$Device;", "", "()V", "AddApplianceFirstActivity", "", "AddApplianceSinglePairActivity", "AddNewWifiInstructionsActivity", "AddTicketActivity", "ApplianceManagementActivity", "AppliancePairedSuccessActivity", "ApplicationSettingsActivity", "DeviceInfoActivity", "FirmwareUpdateActivity", "KeyLockActivity", "ManualHtmlActivity", "ManualListActivity", "ManualPdfActivity", "NameApplianceActivity", "NotificationActivity", "ReportTicketActivity", "ServiceActivity", "ShareInfoActivity", "SingleZoneAddNewApplicationActivity", "SingleZoneApplianceIdentificationActivity", "SingleZoneConnectionSettingWifiActivity", "SingleZoneConnectionSetupGuideActivity", "SingleZoneConnectionSetupRightActivity", "SingleZoneEnterCodeManuallyActivity", "SingleZoneHelpActivity", "SingleZonePairApplianceGuideActivity", "SingleZonePairingErrorActivity", "SingleZoneSetApplianceNameActivity", "SingleZoneSetApplianceNameErrorActivity", "TicketDetailActivity", "WineLabelPictureActivity", "WineLabelScannerActivity", "WineLabelScannerSuccessActivity", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Paths.kt */
    public static final class Device {
        @NotNull
        public static final String AddApplianceFirstActivity = "/device/AddApplianceFirstActivity";
        @NotNull
        public static final String AddApplianceSinglePairActivity = "/device/AddApplianceSinglePairActivity";
        @NotNull
        public static final String AddNewWifiInstructionsActivity = "/device/AddNewWifiInstructionsActivity";
        @NotNull
        public static final String AddTicketActivity = "/device/AddTicketActivity";
        @NotNull
        public static final String ApplianceManagementActivity = "/device/ApplianceManagementActivity";
        @NotNull
        public static final String AppliancePairedSuccessActivity = "/device/appliancepairedsuccess";
        @NotNull
        public static final String ApplicationSettingsActivity = "/device/ApplicationSettingsActivity";
        @NotNull
        public static final String DeviceInfoActivity = "/device/DeviceInfoActivity";
        @NotNull
        public static final String FirmwareUpdateActivity = "/device/FirmwareUpdateActivity";
        @NotNull
        public static final Device INSTANCE = new Device();
        @NotNull
        public static final String KeyLockActivity = "/device/keylock";
        @NotNull
        public static final String ManualHtmlActivity = "/device/ManualHtmlViewActivity";
        @NotNull
        public static final String ManualListActivity = "/device/ManualListActivity";
        @NotNull
        public static final String ManualPdfActivity = "/device/ManualPdfViewActivity";
        @NotNull
        public static final String NameApplianceActivity = "/device/nameApplianceActivity";
        @NotNull
        public static final String NotificationActivity = "/device/NotificationActivity";
        @NotNull
        public static final String ReportTicketActivity = "/device/ReportTicketActivity";
        @NotNull
        public static final String ServiceActivity = "/device/ServiceActivity";
        @NotNull
        public static final String ShareInfoActivity = "/device/ShareInfoActivity";
        @NotNull
        public static final String SingleZoneAddNewApplicationActivity = "/device/SingleZoneAddNewApplicationActivity";
        @NotNull
        public static final String SingleZoneApplianceIdentificationActivity = "/device/SingleZoneApplianceIdentificationActivity";
        @NotNull
        public static final String SingleZoneConnectionSettingWifiActivity = "/device/SingleZoneConnectionSettingWifiActivity";
        @NotNull
        public static final String SingleZoneConnectionSetupGuideActivity = "/device/SingleZoneConnectionSetupGuideActivity";
        @NotNull
        public static final String SingleZoneConnectionSetupRightActivity = "/device/SingleZoneConnectionSetupRightActivity";
        @NotNull
        public static final String SingleZoneEnterCodeManuallyActivity = "/device/SingleZoneEnterCodeManuallyActivity";
        @NotNull
        public static final String SingleZoneHelpActivity = "/device/SingleZoneHelpActivity";
        @NotNull
        public static final String SingleZonePairApplianceGuideActivity = "/device/SingleZonePairApplianceGuideActivity";
        @NotNull
        public static final String SingleZonePairingErrorActivity = "/device/SingleZonePairingErrorActivity";
        @NotNull
        public static final String SingleZoneSetApplianceNameActivity = "/device/SingleZoneSetApplianceNameActivity";
        @NotNull
        public static final String SingleZoneSetApplianceNameErrorActivity = "/device/SingleZoneSetApplianceNameErrorActivity";
        @NotNull
        public static final String TicketDetailActivity = "/device/TicketDetailActivity";
        @NotNull
        public static final String WineLabelPictureActivity = "/device/winelabelpicture";
        @NotNull
        public static final String WineLabelScannerActivity = "/device/winelabelscanner";
        @NotNull
        public static final String WineLabelScannerSuccessActivity = "/device/winelabelscannersuceess";
    }

    @Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/connect_life/core/global/Paths$Jump;", "", "()V", "clickTime", "", "exitApp", "", "context", "Landroid/content/Context;", "beforeExit", "Lkotlin/Function0;", "jumpToMain", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Paths.kt */
    public static final class Jump {
        @NotNull
        public static final Jump INSTANCE = new Jump();
        public static long clickTime;

        public static /* synthetic */ void exitApp$default(Jump jump, Context context, Function0 function0, int i, Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            jump.exitApp(context, function0);
        }

        public final void exitApp(@NotNull Context context, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(context, "context");
            long currentTimeMillis = System.currentTimeMillis();
            String.valueOf(currentTimeMillis);
            if (currentTimeMillis - clickTime < ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                EventBus.getDefault().post(KeyConst.Exit_App);
                clickTime = currentTimeMillis;
                if (context instanceof Activity) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    ((Activity) context).finish();
                    return;
                }
                return;
            }
            clickTime = currentTimeMillis;
            ToastUtils.m9601y(context.getString(R$string.exit_app), new Object[0]);
        }

        public final void jumpToMain(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent();
            intent.setClassName(context, "com.juconnect.connect_life.MainActivity");
            intent.putExtra("loginSuccessCallback", "loginSuccessCallback");
            context.startActivity(intent);
        }
    }
}
