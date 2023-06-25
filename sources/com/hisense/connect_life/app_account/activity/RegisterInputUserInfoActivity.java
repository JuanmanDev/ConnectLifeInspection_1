package com.hisense.connect_life.app_account.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.ConfirmMessageDialog;
import com.hisense.connect_life.app_account.widget.MultiLanguageDialog;
import com.hisense.connect_life.app_account.widget.MultiSelectionDialog;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.GpsUtils;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpGps;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1519p;
import p040c.p200q.p201a.p264c.p338h.C5384a;
import p040c.p429r.p430a.p431a.p432b.C7198i1;
import p040c.p429r.p430a.p431a.p432b.C7205k0;
import p040c.p429r.p430a.p431a.p432b.C7206k1;
import p040c.p429r.p430a.p431a.p432b.C7217n0;
import p040c.p429r.p430a.p431a.p432b.C7226p1;
import p040c.p429r.p430a.p431a.p432b.C7228q;
import p040c.p429r.p430a.p431a.p432b.C7234r1;
import p040c.p429r.p430a.p431a.p432b.C7254w1;
import p687n.p688a.p689a.C9818b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020\u0006H\u0014J\b\u0010@\u001a\u00020<H\u0002J\b\u0010A\u001a\u00020>H\u0002J\u0010\u0010B\u001a\u00020<2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020>H\u0002J\b\u0010E\u001a\u00020\tH\u0002J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\tH\u0002J\b\u0010H\u001a\u00020<H\u0002J\b\u0010I\u001a\u00020<H\u0002J\b\u0010J\u001a\u00020<H\u0002J\b\u0010K\u001a\u00020<H\u0002J\b\u0010L\u001a\u00020<H\u0002J\b\u0010M\u001a\u00020<H\u0002J\u0010\u0010N\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020PH\u0016J\b\u0010Q\u001a\u00020<H\u0014J\b\u0010R\u001a\u00020>H\u0002J \u0010S\u001a\u00020<2\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\u0006H\u0016J\b\u0010W\u001a\u00020<H\u0003J\"\u0010X\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u00062\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010]\u001a\u00020<H\u0016J\b\u0010^\u001a\u00020<H\u0014J\u001e\u0010_\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0aH\u0016J\u001e\u0010b\u001a\u00020<2\u0006\u0010Y\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0aH\u0016J\b\u0010c\u001a\u00020<H\u0002J\b\u0010d\u001a\u00020<H\u0002J\b\u0010e\u001a\u00020<H\u0002J\b\u0010f\u001a\u00020<H\u0014J\u0018\u0010g\u001a\u00020<2\u0006\u0010h\u001a\u00020>2\u0006\u0010i\u001a\u00020jH\u0002J\b\u0010k\u001a\u00020<H\u0002J\b\u0010l\u001a\u00020<H\u0002J\b\u0010m\u001a\u00020<H\u0002J\b\u0010n\u001a\u00020<H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u000e\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u000e\u0010\u0017\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001e\u0010\u001f\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR\u001e\u0010\"\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR\u001e\u00101\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\rR\u001e\u00104\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\rR\u000e\u00107\u001a\u000208X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X.¢\u0006\u0002\n\u0000¨\u0006o"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RegisterInputUserInfoActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$LanguageResult;", "()V", "COUNTRY_REQUEST_CODE", "", "countryCurrentItem", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "dropDownTitleDialog", "Lcom/hisense/connect_life/app_account/widget/MultiSelectionDialog;", "email", "getEmail", "setEmail", "firstName", "id", "getId", "setId", "languageCurrentItem", "lastName", "mCountryCode", "mFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "origin", "getOrigin", "setOrigin", "photoUrl", "getPhotoUrl", "setPhotoUrl", "psw", "getPsw", "setPsw", "regionList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "Lkotlin/collections/ArrayList;", "thirdCallBackParams", "getThirdCallBackParams", "setThirdCallBackParams", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdLoginType", "getThirdLoginType", "setThirdLoginType", "thirdPlatformId", "getThirdPlatformId", "setThirdPlatformId", "token", "getToken", "setToken", "upGps", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "userProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "addUserProfile", "", "isAdd", "", "bindLayout", "checkConditions", "checkEmailChange", "checkLoginNameSign", "enableNextButton", "enabled", "getCountryNameByCode", "getRegionByLang", "code", "getUserProfile", "getVerification", "gotoMainActivity", "gotoRegisterSuccess", "gotoResetPwd", "gotoVerificationActivity", "initUserProfile", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "isAllNotEmpty", "languageResult", "languageName", "languageType", "currentItem", "locationInfo", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onDestroy", "onPermissionsDenied", "perms", "", "onPermissionsGranted", "requestLocationPermission", "setDefault", "setDefaultLanguage", "setListeners", "showDot", "show", "ivDot", "Landroid/widget/ImageView;", "showOffErrorWord", "showUnbindDialog", "signIn", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/RegisterInputUserInfoActivity")
/* compiled from: RegisterInputUserInfoActivity.kt */
public final class RegisterInputUserInfoActivity extends BaseVmActivity<AccountViewModel> implements MultiLanguageDialog.LanguageResult {
    public final int COUNTRY_REQUEST_CODE = 1001;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int countryCurrentItem;
    @Autowired(name = "displayName")
    public String displayName;
    @Nullable
    public MultiSelectionDialog dropDownTitleDialog;
    @Autowired(name = "email")
    public String email;
    @NotNull
    public String firstName = "";
    @Autowired(name = "id")

    /* renamed from: id */
    public String f15744id;
    public int languageCurrentItem;
    @NotNull
    public String lastName = "";
    @NotNull
    public String mCountryCode = "";
    public C5384a mFusedLocationProviderClient;
    @Autowired(name = "origin")
    public String origin;
    @Autowired(name = "photoUrl")
    public String photoUrl;
    @Autowired(name = "psw")
    public String psw;
    @NotNull
    public final ArrayList<Region> regionList = new ArrayList<>();
    @Autowired(name = "thirdCallBackParams")
    public String thirdCallBackParams;
    public ThirdAccountViewModel thirdLoginModel;
    @Autowired(name = "thirdLoginType")
    public String thirdLoginType;
    @Autowired(name = "thirdPlatformId")
    public String thirdPlatformId;
    @Autowired(name = "token")
    public String token;
    @NotNull
    public UpGps upGps = new UpGps("0.0", "0.0");
    public UserProfile userProfile;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r8 = r8.getJhkSerial();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addUserProfile(boolean r8) {
        /*
            r7 = this;
            r7.initUserProfile(r8)
            if (r8 != 0) goto L_0x0049
            com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel r8 = r7.thirdLoginModel
            if (r8 != 0) goto L_0x000f
            java.lang.String r8 = "thirdLoginModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r8 = 0
        L_0x000f:
            r0 = r8
            java.lang.String r1 = r7.getThirdPlatformId()
            java.lang.String r2 = r7.getThirdLoginType()
            java.lang.String r3 = r7.getToken()
            int r8 = com.hisense.connect_life.app_account.R$id.register_email
            android.view.View r8 = r7._$_findCachedViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.CharSequence r8 = r8.getText()
            java.lang.String r4 = r8.toString()
            com.hisense.connect_life.hismart.core.HiSmart$Companion r8 = com.hisense.connect_life.hismart.core.HiSmart.Companion
            com.hisense.connect_life.hismart.core.HiSmart r8 = r8.getInstance()
            com.hisense.connect_life.hismart.core.HiSystemParameter r8 = r8.getHiSystemParameter()
            java.lang.String r5 = ""
            if (r8 != 0) goto L_0x003c
        L_0x003a:
            r6 = r5
            goto L_0x0044
        L_0x003c:
            java.lang.String r8 = r8.getJhkSerial()
            if (r8 != 0) goto L_0x0043
            goto L_0x003a
        L_0x0043:
            r6 = r8
        L_0x0044:
            java.lang.String r5 = ""
            r0.thirdRegister(r1, r2, r3, r4, r5, r6)
        L_0x0049:
            com.google.firebase.analytics.FirebaseAnalytics r8 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r7)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "custom_submit_profile"
            r8.mo37291a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity.addUserProfile(boolean):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if ((((android.widget.TextView) _$_findCachedViewById(com.hisense.connect_life.app_account.R$id.drop_down_country_region)).getText().toString().length() > 0) != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void checkConditions() {
        /*
            r3 = this;
            int r0 = com.hisense.connect_life.app_account.R$id.drop_down_title
            android.view.View r0 = r3._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x001a
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            if (r0 == 0) goto L_0x008a
            int r0 = com.hisense.connect_life.app_account.R$id.register_name
            android.view.View r0 = r3._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0035
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x008a
            int r0 = com.hisense.connect_life.app_account.R$id.register_surname
            android.view.View r0 = r3._$_findCachedViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0050
            r0 = r1
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 == 0) goto L_0x008a
            int r0 = com.hisense.connect_life.app_account.R$id.drop_down_language
            android.view.View r0 = r3._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x006b
            r0 = r1
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x008a
            int r0 = com.hisense.connect_life.app_account.R$id.drop_down_country_region
            android.view.View r0 = r3._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0086
            r0 = r1
            goto L_0x0087
        L_0x0086:
            r0 = r2
        L_0x0087:
            if (r0 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r1 = r2
        L_0x008b:
            r3.enableNextButton(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity.checkConditions():void");
    }

    private final boolean checkEmailChange() {
        return !Intrinsics.areEqual((Object) getEmail(), (Object) ((TextView) _$_findCachedViewById(R$id.register_email)).getText().toString());
    }

    /* access modifiers changed from: private */
    public final void checkLoginNameSign(String str) {
        ((AccountViewModel) getMViewModel()).checkLoginNameSign(str);
    }

    private final void enableNextButton(boolean z) {
        Button button = (Button) _$_findCachedViewById(R$id.next);
        button.setTextColor(button.getResources().getColor(z ? R$color.colorWhite : R$color.colorText_86));
        button.setBackgroundResource(z ? R$drawable.button_next_select_bg : R$drawable.button_next_unselect_bg);
        button.setEnabled(z);
    }

    /* access modifiers changed from: private */
    public final String getCountryNameByCode() {
        ArrayList<Region> arrayList = this.regionList;
        if (arrayList == null) {
            return "";
        }
        for (Region region : arrayList) {
            if (Intrinsics.areEqual((Object) region.getCode(), (Object) this.mCountryCode)) {
                return region.getName();
            }
        }
        return "";
    }

    private final void getRegionByLang(String str) {
        ((AccountViewModel) getMViewModel()).getRegionByLang(str, AppConfig.Companion.getAccessToken());
    }

    private final void getUserProfile() {
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    private final void getVerification() {
    }

    private final void gotoMainActivity() {
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoRegisterSuccess() {
        this.firstName = ((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString();
        this.lastName = ((EditText) _$_findCachedViewById(R$id.register_surname)).getText().toString();
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterSuccessActivity);
        a.withString("name", ((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString()).withString("email", getEmail()).withString(EventBusConstKt.PSW, getPsw()).withString("firstName", this.firstName).withString("lastName", this.lastName).withString("thirdPlatformId", getThirdPlatformId()).withString("thirdLoginType", getThirdLoginType()).withString(FirebaseMessagingService.EXTRA_TOKEN, getToken()).withString("id", getId()).withString(FileProvider.DISPLAYNAME_FIELD, getDisplayName()).withString("photoUrl", getPhotoUrl()).withString("thirdCallBackParams", getThirdCallBackParams());
        a.navigation();
        finish();
    }

    private final void gotoResetPwd() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginResetPswActivity);
        a.withString("email", getEmail());
        a.withString(EventBusConstKt.LOGIN, "true");
        a.navigation();
    }

    private final void gotoVerificationActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputVerificationActivity);
        Postcard withString = a.withString("thirdPlatformId", getThirdPlatformId()).withString("thirdLoginType", getThirdLoginType()).withString(FirebaseMessagingService.EXTRA_TOKEN, getToken()).withString(EventBusConstKt.ORIGIN, EventBusConstKt.THIRD_REGISTER);
        UserProfile userProfile2 = this.userProfile;
        if (userProfile2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userProfile");
            userProfile2 = null;
        }
        withString.withObject(EventBusConstKt.USERINFO, userProfile2);
        a.navigation();
    }

    private final void initUserProfile(boolean z) {
        List list;
        String str;
        boolean z2 = z;
        if (isAllNotEmpty()) {
            CharSequence text = ((TextView) _$_findCachedViewById(R$id.drop_down_language)).getText();
            Intrinsics.checkNotNullExpressionValue(text, "drop_down_language.text");
            if (text.length() > 0) {
                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new UpAddress("BILLING", ((EditText) _$_findCachedViewById(R$id.register_street)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.register_house_number)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.register_postal_code)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.register_city)).getText().toString(), this.mCountryCode, this.upGps));
                if (TextUtils.isEmpty(((EditText) _$_findCachedViewById(R$id.register_phone_number)).getText().toString())) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    list = CollectionsKt__CollectionsJVMKt.listOf(new UpPhone(((EditText) _$_findCachedViewById(R$id.register_phone_number)).getText().toString(), "MOBILE"));
                }
                List list2 = list;
                String str2 = this.mCountryCode;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                int indexByLanguageName = LanguageListManager.INSTANCE.getIndexByLanguageName(((TextView) _$_findCachedViewById(R$id.drop_down_language)).getText().toString());
                String obj = ((TextView) _$_findCachedViewById(R$id.register_email)).getText().toString();
                String obj2 = ((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString();
                String obj3 = ((EditText) _$_findCachedViewById(R$id.register_surname)).getText().toString();
                String str4 = LanguageListManager.INSTANCE.getLanguageTypeList().get(indexByLanguageName);
                String obj4 = ((TextView) _$_findCachedViewById(R$id.drop_down_title)).getText().toString();
                MultiSelectionDialog multiSelectionDialog = this.dropDownTitleDialog;
                if (multiSelectionDialog == null) {
                    str = "0";
                } else {
                    Intrinsics.checkNotNull(multiSelectionDialog);
                    str = String.valueOf(multiSelectionDialog.getSelectionIndex());
                }
                this.userProfile = new UserProfile(obj, obj2, obj3, listOf, list2, str4, (String) null, (List) null, (String) null, str, (List) null, (List) null, (String) null, (String) null, (String) null, str3, obj4, 32192, (DefaultConstructorMarker) null);
                if (!Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.THIRD_REGISTER) || z2) {
                    LoggerUtil.Companion companion = LoggerUtil.Companion;
                    companion.mo39146e("addUserProfile: " + getOrigin() + " , " + z2);
                    AccountViewModel accountViewModel = (AccountViewModel) getMViewModel();
                    UserProfile userProfile2 = this.userProfile;
                    if (userProfile2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userProfile");
                        userProfile2 = null;
                    }
                    accountViewModel.addUserProfile(userProfile2);
                }
            }
        }
    }

    private final boolean isAllNotEmpty() {
        return !TextUtils.isEmpty(((EditText) _$_findCachedViewById(R$id.register_name)).getText()) && !TextUtils.isEmpty(((EditText) _$_findCachedViewById(R$id.register_surname)).getText()) && !TextUtils.isEmpty(((TextView) _$_findCachedViewById(R$id.drop_down_country_region)).getText());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void locationInfo() {
        Address address;
        if (GpsUtils.INSTANCE.isOPen(this)) {
            Object systemService = getSystemService("location");
            if (systemService != null) {
                Location lastKnownLocation = ((LocationManager) systemService).getLastKnownLocation(EventBusConstKt.GPS);
                if (lastKnownLocation != null) {
                    try {
                        List<Address> fromLocation = new Geocoder(this).getFromLocation(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 1);
                        boolean z = true;
                        if (fromLocation == null || !fromLocation.isEmpty()) {
                            z = false;
                        }
                        if (z) {
                            address = null;
                        } else {
                            Intrinsics.checkNotNull(fromLocation);
                            address = fromLocation.get(0);
                        }
                        Intrinsics.stringPlus("bestMatch: ", address);
                        if (address != null) {
                            "subAdminArea: " + address.getSubAdminArea() + ", postalCode: " + address.getPostalCode() + ", locality: " + address.getLocality() + ", countryName: " + address.getCountryName() + ", countryCode:" + address.getCountryCode();
                            Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), (CoroutineStart) null, new RegisterInputUserInfoActivity$locationInfo$1$1$1$1(this, address, (Continuation<? super RegisterInputUserInfoActivity$locationInfo$1$1$1$1>) null), 2, (Object) null);
                            BigDecimal bigDecimal = new BigDecimal(address.getLatitude());
                            BigDecimal bigDecimal2 = new BigDecimal(address.getLongitude());
                            String bigDecimal3 = bigDecimal.setScale(3, RoundingMode.DOWN).toString();
                            Intrinsics.checkNotNullExpressionValue(bigDecimal3, "ll.setScale(3, RoundingMode.DOWN).toString()");
                            String bigDecimal4 = bigDecimal2.setScale(3, RoundingMode.DOWN).toString();
                            Intrinsics.checkNotNullExpressionValue(bigDecimal4, "lg.setScale(3, RoundingMode.DOWN).toString()");
                            this.upGps = new UpGps(bigDecimal3, bigDecimal4);
                            "Location:  " + Double.parseDouble(bigDecimal3) + "===" + Double.parseDouble(bigDecimal4);
                        }
                    } catch (IOException unused2) {
                        setDefault();
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
        } else {
            setDefault();
        }
    }

    private final void requestLocationPermission() {
        if (EasyPermissions.m26767a(this, PermissionConstKt.PERMISSION_LOCATION)) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new RegisterInputUserInfoActivity$requestLocationPermission$1(this, (Continuation<? super RegisterInputUserInfoActivity$requestLocationPermission$1>) null), 2, (Object) null);
            return;
        }
        C9818b.C9820b bVar = new C9818b.C9820b((Activity) this, 2, PermissionConstKt.PERMISSION_LOCATION);
        bVar.mo50749d(R$string.rationale_location);
        bVar.mo50748c(R$string.rationale_ask_ok);
        bVar.mo50747b(R$string.camera_cancel);
        C9818b a = bVar.mo50746a();
        Intrinsics.checkNotNullExpressionValue(a, "Builder(this, CODE_PERMI…                 .build()");
        EasyPermissions.m26771e(a);
    }

    private final void setDefault() {
        this.upGps = new UpGps("0.0", "0.0");
    }

    private final void setDefaultLanguage() {
        boolean z;
        String languageType = SPManagerKt.getLanguageType();
        Iterator<String> it = LanguageListManager.INSTANCE.getLanguageTypeList().iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            int i2 = i + 1;
            if (Intrinsics.areEqual((Object) it.next(), (Object) languageType)) {
                this.languageCurrentItem = i;
                ((TextView) _$_findCachedViewById(R$id.drop_down_language)).setText(LanguageListManager.INSTANCE.getLanguageNameList().get(i));
                z = true;
                break;
            }
            i = i2;
        }
        if (!z) {
            Iterator<String> it2 = LanguageListManager.INSTANCE.getLanguageTypeList().iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int i4 = i3 + 1;
                if (Intrinsics.areEqual((Object) it2.next(), (Object) LanguageConstKt.f15944en)) {
                    this.languageCurrentItem = i3;
                    ((TextView) _$_findCachedViewById(R$id.drop_down_language)).setText(LanguageListManager.INSTANCE.getLanguageNameList().get(i3));
                    break;
                }
                i3 = i4;
            }
        }
        if (((TextView) _$_findCachedViewById(R$id.drop_down_language)).getText().toString().length() == 0) {
            z2 = true;
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_language_dot);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_language_dot");
        showDot(z2, imageView);
        checkConditions();
    }

    /* access modifiers changed from: private */
    public final void showDot(boolean z, ImageView imageView) {
        imageView.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    public final void showOffErrorWord() {
        boolean z = true;
        int i = 8;
        ((TextView) _$_findCachedViewById(R$id.tv_error_first_name)).setVisibility(((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString().length() == 0 ? 0 : 8);
        ((TextView) _$_findCachedViewById(R$id.tv_error_last_name)).setVisibility(((EditText) _$_findCachedViewById(R$id.register_surname)).getText().toString().length() == 0 ? 0 : 8);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_error_country_region);
        if (((TextView) _$_findCachedViewById(R$id.drop_down_country_region)).getText().toString().length() == 0) {
            i = 0;
        }
        textView.setVisibility(i);
        ((LinearLayout) _$_findCachedViewById(R$id.ll_first_name)).setBackgroundResource(((EditText) _$_findCachedViewById(R$id.register_name)).getText().toString().length() == 0 ? R$drawable.edittext_background_error_white : R$drawable.edittext_background_new_white);
        ((LinearLayout) _$_findCachedViewById(R$id.ll_last_name)).setBackgroundResource(((EditText) _$_findCachedViewById(R$id.register_surname)).getText().toString().length() == 0 ? R$drawable.edittext_background_error_white : R$drawable.edittext_background_new_white);
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.drop_down_country_region);
        if (((TextView) _$_findCachedViewById(R$id.drop_down_country_region)).getText().toString().length() != 0) {
            z = false;
        }
        textView2.setBackgroundResource(z ? R$drawable.edittext_background_error_white : R$drawable.edittext_background_new_white);
    }

    private final void showUnbindDialog() {
        ConfirmMessageDialog confirmMessageDialog = new ConfirmMessageDialog(R$string.account_already_register, R$string.f15677OK, R$string.change);
        confirmMessageDialog.setIItemCallback(new RegisterInputUserInfoActivity$showUnbindDialog$1(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(confirmMessageDialog, supportFragmentManager);
    }

    private final void signIn() {
        ((AccountViewModel) getMViewModel()).signIn(getEmail(), getPsw());
    }

    /* renamed from: subscribeObservable$lambda-10  reason: not valid java name */
    public static final void m26866subscribeObservable$lambda10(RegisterInputUserInfoActivity registerInputUserInfoActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                FirebaseAnalytics.getInstance(registerInputUserInfoActivity).mo37291a("custom_profile_created", new Bundle());
                if (Intrinsics.areEqual((Object) registerInputUserInfoActivity.getOrigin(), (Object) EventBusConstKt.REGISTER) || Intrinsics.areEqual((Object) registerInputUserInfoActivity.getOrigin(), (Object) EventBusConstKt.THIRD_REGISTER)) {
                    registerInputUserInfoActivity.gotoRegisterSuccess();
                } else {
                    registerInputUserInfoActivity.gotoMainActivity();
                }
            } else {
                String string = registerInputUserInfoActivity.getString(R$string.fail);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fail)");
                registerInputUserInfoActivity.showString(string);
            }
            ((AccountViewModel) registerInputUserInfoActivity.getMViewModel()).getAddUPLiveData().setValue(null);
        }
    }

    /* renamed from: subscribeObservable$lambda-13  reason: not valid java name */
    public static final void m26867subscribeObservable$lambda13(RegisterInputUserInfoActivity registerInputUserInfoActivity, List list) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        registerInputUserInfoActivity.hideLoading();
        if (list != null) {
            if (!registerInputUserInfoActivity.regionList.isEmpty()) {
                registerInputUserInfoActivity.regionList.clear();
            }
            registerInputUserInfoActivity.regionList.addAll(list);
            int i = 0;
            for (T next : registerInputUserInfoActivity.regionList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) ((Region) next).getCode(), (Object) registerInputUserInfoActivity.mCountryCode)) {
                    registerInputUserInfoActivity.countryCurrentItem = i;
                }
                i = i2;
            }
            ((TextView) registerInputUserInfoActivity._$_findCachedViewById(R$id.drop_down_country_region)).setText(registerInputUserInfoActivity.getCountryNameByCode());
        }
    }

    /* renamed from: subscribeObservable$lambda-14  reason: not valid java name */
    public static final void m26868subscribeObservable$lambda14(RegisterInputUserInfoActivity registerInputUserInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        if (pair == null || !((Boolean) pair.getFirst()).booleanValue()) {
            int intValue = ((Number) pair.getSecond()).intValue();
            if (intValue == -1) {
                registerInputUserInfoActivity.showString(R$string.network_lost);
            } else if (intValue == 1) {
                registerInputUserInfoActivity.showString(R$string.wrong_email_or_password);
            }
        } else {
            registerInputUserInfoActivity.gotoVerificationActivity();
        }
    }

    /* renamed from: subscribeObservable$lambda-15  reason: not valid java name */
    public static final void m26869subscribeObservable$lambda15(RegisterInputUserInfoActivity registerInputUserInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            String string = registerInputUserInfoActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            registerInputUserInfoActivity.showString(string);
        } else if (pair.getSecond() != null) {
            registerInputUserInfoActivity.gotoMainActivity();
        } else {
            String string2 = registerInputUserInfoActivity.getString(R$string.fail);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.fail)");
            registerInputUserInfoActivity.showString(string2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2  */
    /* renamed from: subscribeObservable$lambda-18  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m26870subscribeObservable$lambda18(com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity r14, kotlin.Pair r15) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            if (r15 != 0) goto L_0x0009
            goto L_0x00ee
        L_0x0009:
            java.lang.Object r0 = r15.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r14.getUserProfile()
            goto L_0x00e1
        L_0x001b:
            r0 = 5
            java.lang.Object r2 = r15.getSecond()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 2
            java.lang.String r4 = ":"
            r5 = 0
            boolean r3 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r2, (java.lang.CharSequence) r4, (boolean) r5, (int) r3, (java.lang.Object) r1)
            java.lang.String r6 = "600905"
            r7 = 1
            if (r3 == 0) goto L_0x004d
            java.lang.Object r15 = r15.getSecond()
            r8 = r15
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String[] r9 = new java.lang.String[]{r4}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r15 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r8, (java.lang.String[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)
            java.lang.Object r15 = r15.get(r7)
            java.lang.String r15 = (java.lang.String) r15
            int r0 = java.lang.Integer.parseInt(r15)
            r2 = r6
        L_0x004d:
            int r15 = r2.hashCode()
            java.lang.String r3 = "600925"
            java.lang.String r4 = "600924"
            if (r15 == 0) goto L_0x0092
            r8 = 1591789448(0x5ee0c788, float:8.0985321E18)
            if (r15 == r8) goto L_0x007c
            switch(r15) {
                case 1591789509: goto L_0x006e;
                case 1591789510: goto L_0x0060;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x009a
        L_0x0060:
            boolean r15 = r2.equals(r3)
            if (r15 != 0) goto L_0x0067
            goto L_0x009a
        L_0x0067:
            int r15 = com.hisense.connect_life.app_account.R$string.account_locked
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00a7
        L_0x006e:
            boolean r15 = r2.equals(r4)
            if (r15 != 0) goto L_0x0075
            goto L_0x009a
        L_0x0075:
            int r15 = com.hisense.connect_life.app_account.R$string.untrusted_device
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00a7
        L_0x007c:
            boolean r15 = r2.equals(r6)
            if (r15 != 0) goto L_0x0083
            goto L_0x009a
        L_0x0083:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password_num
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            java.lang.String r15 = r14.getString(r15, r6)
            goto L_0x00a7
        L_0x0092:
            java.lang.String r15 = ""
            boolean r15 = r2.equals(r15)
            if (r15 != 0) goto L_0x00a1
        L_0x009a:
            int r15 = com.hisense.connect_life.app_account.R$string.wrong_email_or_password
            java.lang.String r15 = r14.getString(r15)
            goto L_0x00a7
        L_0x00a1:
            int r15 = com.hisense.connect_life.app_account.R$string.network_lost
            java.lang.String r15 = r14.getString(r15)
        L_0x00a7:
            java.lang.String r0 = "when (secondStr) {\n     …rd)\n                    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            r14.showString((java.lang.String) r15)
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r15 == 0) goto L_0x00d2
            com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity$Companion r15 = com.hisense.connect_life.app_account.activity.DeviceCerVerificationActivity.Companion
            int r15 = r15.getCODE_DEV_VER()
            c.a.a.a.b.a r0 = p040c.p041a.p042a.p043a.p045b.C1337a.m211c()
            java.lang.String r2 = "/account/DeviceCerVerificationActivity"
            com.alibaba.android.arouter.facade.Postcard r0 = r0.mo15011a(r2)
            java.lang.String r2 = r14.getEmail()
            java.lang.String r3 = "email"
            r0.withString(r3, r2)
            r0.navigation((android.app.Activity) r14, (int) r15)
            goto L_0x00e1
        L_0x00d2:
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r15 == 0) goto L_0x00dc
            r14.gotoResetPwd()
            goto L_0x00e1
        L_0x00dc:
            int r15 = com.hisense.connect_life.app_account.R$string.login_failed
            r14.showString((int) r15)
        L_0x00e1:
            com.hisense.connect_life.core.base.BaseViewModel r14 = r14.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r14 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r14
            androidx.lifecycle.MutableLiveData r14 = r14.getSignInLiveData()
            r14.setValue(r1)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity.m26870subscribeObservable$lambda18(com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity, kotlin.Pair):void");
    }

    /* renamed from: subscribeObservable$lambda-19  reason: not valid java name */
    public static final void m26871subscribeObservable$lambda19(RegisterInputUserInfoActivity registerInputUserInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            registerInputUserInfoActivity.getUserProfile();
            return;
        }
        registerInputUserInfoActivity.hideLoading();
        String string = registerInputUserInfoActivity.getString(R$string.fail);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fail)");
        registerInputUserInfoActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-20  reason: not valid java name */
    public static final void m26872subscribeObservable$lambda20(RegisterInputUserInfoActivity registerInputUserInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        boolean z = true;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            registerInputUserInfoActivity.showString(R$string.register_success);
            registerInputUserInfoActivity.addUserProfile(true);
            return;
        }
        registerInputUserInfoActivity.hideLoading();
        if (((CharSequence) pair.getSecond()).length() != 0) {
            z = false;
        }
        String string = z ? registerInputUserInfoActivity.getString(R$string.register_fail) : (String) pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(string, "if (it.second.isEmpty())…ster_fail) else it.second");
        registerInputUserInfoActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-21  reason: not valid java name */
    public static final void m26873subscribeObservable$lambda21(RegisterInputUserInfoActivity registerInputUserInfoActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(registerInputUserInfoActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            registerInputUserInfoActivity.showString(R$string.request_fail_tips);
        } else if (Intrinsics.areEqual(pair.getSecond(), (Object) "1")) {
            registerInputUserInfoActivity.hideLoading();
            registerInputUserInfoActivity.showUnbindDialog();
        } else if (registerInputUserInfoActivity.checkEmailChange()) {
            registerInputUserInfoActivity.initUserProfile(false);
            registerInputUserInfoActivity.getVerification();
        } else {
            registerInputUserInfoActivity.addUserProfile(false);
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
        return R$layout.activity_register_input_userinfo;
    }

    @NotNull
    public final String getDisplayName() {
        String str = this.displayName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FileProvider.DISPLAYNAME_FIELD);
        return null;
    }

    @NotNull
    public final String getEmail() {
        String str = this.email;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        return null;
    }

    @NotNull
    public final String getId() {
        String str = this.f15744id;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("id");
        return null;
    }

    @NotNull
    public final String getOrigin() {
        String str = this.origin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.ORIGIN);
        return null;
    }

    @NotNull
    public final String getPhotoUrl() {
        String str = this.photoUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("photoUrl");
        return null;
    }

    @NotNull
    public final String getPsw() {
        String str = this.psw;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.PSW);
        return null;
    }

    @NotNull
    public final String getThirdCallBackParams() {
        String str = this.thirdCallBackParams;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdCallBackParams");
        return null;
    }

    @NotNull
    public final String getThirdLoginType() {
        String str = this.thirdLoginType;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdLoginType");
        return null;
    }

    @NotNull
    public final String getThirdPlatformId() {
        String str = this.thirdPlatformId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thirdPlatformId");
        return null;
    }

    @NotNull
    public final String getToken() {
        String str = this.token;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(FirebaseMessagingService.EXTRA_TOKEN);
        return null;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ((TextView) _$_findCachedViewById(R$id.register_email)).setText(getEmail());
        ((TextView) _$_findCachedViewById(R$id.register_email)).setTextColor(getResources().getColor(R$color.colorText_c4));
        String string = getString(R$string.first_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.first_name)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_first_name)).setText(upperCase);
        String string2 = getString(R$string.first_name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.first_name)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String lowerCase = string2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        Locale locale3 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale3, "ROOT");
        ((EditText) _$_findCachedViewById(R$id.register_name)).setHint(StringsKt__StringsJVMKt.capitalize(lowerCase, locale3));
        String string3 = getString(R$string.last_name);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.last_name)");
        Locale locale4 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale4, "ROOT");
        String upperCase2 = string3.toUpperCase(locale4);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_last_name)).setText(upperCase2);
        String string4 = getString(R$string.last_name);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.last_name)");
        Locale locale5 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale5, "ROOT");
        String lowerCase2 = string4.toLowerCase(locale5);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        Locale locale6 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale6, "ROOT");
        ((EditText) _$_findCachedViewById(R$id.register_surname)).setHint(StringsKt__StringsJVMKt.capitalize(lowerCase2, locale6));
        String string5 = getString(R$string.phone_number);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.phone_number)");
        Locale locale7 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale7, "ROOT");
        ((TextView) _$_findCachedViewById(R$id.tv_title_phone_number)).setText(StringsKt__StringsJVMKt.capitalize(string5, locale7));
        String string6 = getString(R$string.street);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.street)");
        Locale locale8 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale8, "ROOT");
        String upperCase3 = string6.toUpperCase(locale8);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_street)).setText(upperCase3);
        String string7 = getString(R$string.street);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.street)");
        Locale locale9 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale9, "ROOT");
        String lowerCase3 = string7.toLowerCase(locale9);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
        Locale locale10 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale10, "ROOT");
        ((EditText) _$_findCachedViewById(R$id.register_street)).setHint(StringsKt__StringsJVMKt.capitalize(lowerCase3, locale10));
        String string8 = getString(R$string.house_number);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.house_number)");
        Locale locale11 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale11, "ROOT");
        String upperCase4 = string8.toUpperCase(locale11);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_house_number)).setText(upperCase4);
        String string9 = getString(R$string.post_code);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.post_code)");
        Locale locale12 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale12, "ROOT");
        String upperCase5 = string9.toUpperCase(locale12);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_postal_code)).setText(upperCase5);
        String string10 = getString(R$string.city);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.city)");
        Locale locale13 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale13, "ROOT");
        String lowerCase4 = string10.toLowerCase(locale13);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
        Locale locale14 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale14, "ROOT");
        ((EditText) _$_findCachedViewById(R$id.register_city)).setHint(StringsKt__StringsJVMKt.capitalize(lowerCase4, locale14));
        String string11 = getString(R$string.phone_number);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(R.string.phone_number)");
        Locale locale15 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale15, "ROOT");
        String upperCase6 = string11.toUpperCase(locale15);
        Intrinsics.checkNotNullExpressionValue(upperCase6, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_phone_number)).setText(upperCase6);
        String string12 = getString(R$string.user_info);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(R.string.user_info)");
        Locale locale16 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale16, "ROOT");
        String upperCase7 = string12.toUpperCase(locale16);
        Intrinsics.checkNotNullExpressionValue(upperCase7, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_user_info)).setText(upperCase7);
        String string13 = getString(R$string.email);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(R.string.email)");
        Locale locale17 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale17, "ROOT");
        String upperCase8 = string13.toUpperCase(locale17);
        Intrinsics.checkNotNullExpressionValue(upperCase8, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_email)).setText(upperCase8);
        String string14 = getString(R$string.address);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(R.string.address)");
        Locale locale18 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale18, "ROOT");
        String upperCase9 = string14.toUpperCase(locale18);
        Intrinsics.checkNotNullExpressionValue(upperCase9, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_address)).setText(upperCase9);
        String string15 = getString(R$string.next);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(R.string.next)");
        Locale locale19 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale19, "ROOT");
        String upperCase10 = string15.toUpperCase(locale19);
        Intrinsics.checkNotNullExpressionValue(upperCase10, "this as java.lang.String).toUpperCase(locale)");
        ((Button) _$_findCachedViewById(R$id.next)).setText(upperCase10);
        boolean z = true;
        if (!StringsKt__StringsJVMKt.isBlank(getEmail())) {
            if (getEmail().length() > 0) {
                ((TextView) _$_findCachedViewById(R$id.register_email)).setEnabled(false);
            }
        }
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this).get(ThirdAccountViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(ThirdAccountViewModel::class.java)");
        this.thirdLoginModel = (ThirdAccountViewModel) viewModel;
        if (Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.REGISTER) || Intrinsics.areEqual((Object) getOrigin(), (Object) EventBusConstKt.THIRD_REGISTER)) {
            ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.register_title));
        } else {
            ((TextView) _$_findCachedViewById(R$id.top_login_title)).setText(getString(R$string.sign_in_title));
        }
        getRegionByLang(String.valueOf(SPUtils.INSTANCE.get("languageId", 1L)));
        setDefaultLanguage();
        ((TextView) _$_findCachedViewById(R$id.drop_down_title)).setText(getString(R$string.f15734mr));
        if (((TextView) _$_findCachedViewById(R$id.drop_down_title)).getText().toString().length() != 0) {
            z = false;
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_title_dot);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_title_dot");
        showDot(z, imageView);
        checkConditions();
        showOffErrorWord();
        if (SPManagerKt.getLanguageId() == 13) {
            ((TextView) _$_findCachedViewById(R$id.tv_title_title1)).setVisibility(8);
            ((FrameLayout) _$_findCachedViewById(R$id.fl_title)).setVisibility(8);
        }
    }

    public void languageResult(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "languageName");
        Intrinsics.checkNotNullParameter(str2, "languageType");
        ((TextView) _$_findCachedViewById(R$id.drop_down_language)).setText(str);
        this.languageCurrentItem = i;
        boolean z = ((TextView) _$_findCachedViewById(R$id.drop_down_language)).getText().toString().length() == 0;
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_language_dot);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_language_dot");
        showDot(z, imageView);
        checkConditions();
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        String stringExtra;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == this.COUNTRY_REQUEST_CODE) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                String valueOf = String.valueOf(extras.getString("countryCode"));
                this.mCountryCode = valueOf;
                LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("RegisterInputUserInfoActivity mCountryCode: ", valueOf));
                ((TextView) _$_findCachedViewById(R$id.drop_down_country_region)).setText(getCountryNameByCode());
                boolean z = ((TextView) _$_findCachedViewById(R$id.drop_down_country_region)).getText().toString().length() == 0;
                ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_country_region_dot);
                Intrinsics.checkNotNullExpressionValue(imageView, "iv_country_region_dot");
                showDot(z, imageView);
                checkConditions();
                showOffErrorWord();
            }
        } else if (i == DeviceCerVerificationActivity.Companion.getCODE_DEV_VER()) {
            String str = "";
            if (!(intent == null || (stringExtra = intent.getStringExtra(EventBusConstKt.AUTH_CODE)) == null)) {
                str = stringExtra;
            }
            if (C1519p.m1017a(getEmail()) && !TextUtils.isEmpty(getPsw())) {
                ((AccountViewModel) getMViewModel()).signIn(getEmail(), getPsw(), str);
            }
        }
    }

    public void onBackPressed() {
        int i;
        try {
            ArrayList<LoginUserInfo> all = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAll();
            i = (all == null ? null : Integer.valueOf(all.size())).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        String str = Paths.Account.LoginEmailActivity;
        if (i == 0) {
            if (AccountUtils.Companion.userEmails().isEmpty()) {
                str = Paths.Account.LoginFirstActivity;
            }
            Postcard a = C1337a.m211c().mo15011a(str);
            a.withFlags(268468224);
            a.navigation();
        } else {
            Postcard a2 = C1337a.m211c().mo15011a(str);
            a2.withFlags(268468224);
            a2.navigation();
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        super.onPermissionsDenied(i, list);
        setDefault();
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new RegisterInputUserInfoActivity$onPermissionsGranted$1(this, (Continuation<? super RegisterInputUserInfoActivity$onPermissionsGranted$1>) null), 2, (Object) null);
    }

    public final void setDisplayName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.displayName = str;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15744id = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new RegisterInputUserInfoActivity$setListeners$1(this));
        Button button = (Button) _$_findCachedViewById(R$id.next);
        Intrinsics.checkNotNullExpressionValue(button, "next");
        JuConnectExtKt.singleClickListener(button, new RegisterInputUserInfoActivity$setListeners$2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.drop_down_language);
        Intrinsics.checkNotNullExpressionValue(textView, "drop_down_language");
        JuConnectExtKt.singleClickListener(textView, new RegisterInputUserInfoActivity$setListeners$3(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.drop_down_country_region);
        Intrinsics.checkNotNullExpressionValue(textView2, "drop_down_country_region");
        JuConnectExtKt.singleClickListener(textView2, new RegisterInputUserInfoActivity$setListeners$4(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.drop_down_title);
        Intrinsics.checkNotNullExpressionValue(textView3, "drop_down_title");
        JuConnectExtKt.singleClickListener(textView3, new RegisterInputUserInfoActivity$setListeners$5(this));
        TextView textView4 = (TextView) _$_findCachedViewById(R$id.tv_title_extra_info);
        Intrinsics.checkNotNullExpressionValue(textView4, "tv_title_extra_info");
        JuConnectExtKt.singleClickListener(textView4, new RegisterInputUserInfoActivity$setListeners$6(this));
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.iv_extra_info_drop_down);
        Intrinsics.checkNotNullExpressionValue(imageView, "iv_extra_info_drop_down");
        JuConnectExtKt.singleClickListener(imageView, new RegisterInputUserInfoActivity$setListeners$7(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.register_name);
        Intrinsics.checkNotNullExpressionValue(editText, "register_name");
        editText.addTextChangedListener(new C8456xd396126e(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.register_surname);
        Intrinsics.checkNotNullExpressionValue(editText2, "register_surname");
        editText2.addTextChangedListener(new C8457xd396126f(this));
    }

    public final void setOrigin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.origin = str;
    }

    public final void setPhotoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoUrl = str;
    }

    public final void setPsw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.psw = str;
    }

    public final void setThirdCallBackParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdCallBackParams = str;
    }

    public final void setThirdLoginType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdLoginType = str;
    }

    public final void setThirdPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdPlatformId = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getAddUPLiveData().observe(this, new C7228q(this));
        ((AccountViewModel) getMViewModel()).getRegionByLangLiveData().observe(this, new C7205k0(this));
        ((AccountViewModel) getMViewModel()).getGetVerificationLiveData().observe(this, new C7254w1(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7206k1(this));
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7234r1(this));
        ((AccountViewModel) getMViewModel()).getThirdSignInLiveData().observe(this, new C7217n0(this));
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdRegisterLiveData().observe(this, new C7198i1(this));
        ((AccountViewModel) getMViewModel()).getCheckLoginNameSignLiveData().observe(this, new C7226p1(this));
    }
}
