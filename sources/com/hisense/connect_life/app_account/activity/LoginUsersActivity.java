package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.app_account.R$color;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.adapter.LoginUserNameAdapter;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.GridSpacingItemDecoration;
import com.hisense.connect_life.app_account.util.LoginActivityManager;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.app_account.util.ThirdLoginUtils;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.PermissionConstKt;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.NetUtils;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import com.hisense.connect_life.hismart.model.JHLAgreementData;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.connect_life.third_account.viewmodel.ThirdAccountViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p072c.p073a.p074a.C1506m;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p429r.p430a.p431a.p432b.C7166a2;
import p040c.p429r.p430a.p431a.p432b.C7197i0;
import p040c.p429r.p430a.p431a.p432b.C7208l;
import p040c.p429r.p430a.p431a.p432b.C7220o;
import p040c.p429r.p430a.p431a.p432b.C7257x0;
import p040c.p472t.p473a.C7585u;

@Metadata(mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020\u0005H\u0014J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020*H\u0002J\u0018\u0010.\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010/\u001a\u00020*H\u0002J\b\u00100\u001a\u00020*H\u0002J\b\u00101\u001a\u00020*H\u0002J\b\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020*H\u0002J\b\u00104\u001a\u00020*H\u0002J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\tH\u0002J\b\u00109\u001a\u00020*H\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00020;H\u0016J\b\u0010<\u001a\u00020*H\u0014J\"\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u00020*H\u0016J\u0012\u0010C\u001a\u00020*2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010F\u001a\u00020*H\u0014J\u0010\u0010G\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0007J\b\u0010J\u001a\u00020*H\u0014J\b\u0010K\u001a\u00020*H\u0014J\b\u0010\u001b\u001a\u00020*H\u0002J\b\u0010L\u001a\u00020*H\u0014J\b\u0010M\u001a\u00020*H\u0002J\b\u0010N\u001a\u00020*H\u0016J\u0010\u0010O\u001a\u00020*2\u0006\u0010P\u001a\u00020QH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0013j\b\u0012\u0004\u0012\u00020\u0007`\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/LoginUsersActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "CODE_LOCATION", "", "clickUserInfo", "Lcom/hisense/connect_life/hismart/sql/account/LoginUserInfo;", "connetlifePrivacyPolicyUrl", "", "displayName", "email", "firstName", "id", "jhlNeedUserAgreementCount", "Ljava/lang/Integer;", "lastName", "loginSource", "loginUserInfoList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "loginUserNameAdapter", "Lcom/hisense/connect_life/app_account/adapter/LoginUserNameAdapter;", "loginUserSaveNumber", "origin", "photoUrl", "psw", "refreshToken", "spacing", "spanCount", "termsConditionsUrl", "thirdCallBackParams", "thirdLoginModel", "Lcom/hisense/connect_life/third_account/viewmodel/ThirdAccountViewModel;", "thirdLoginType", "thirdPlatformId", "token", "userIconBgColor", "userName", "vidaaPrivacyPolicyUrl", "bindLayout", "checkLocationPerm", "", "getJHLProtocol", "getJHLUserProtocol", "getLoginUserInfoList", "getSpellName", "getUserProfile", "goPasswordActivity", "gotoConfig", "gotoLoginActivity", "gotoMainActivity", "gotoPolicy", "gotoRegisterActivity", "gotoRegisterInputUserInfo", "gotoThirdLogin", "thirdId", "initMoreThanOneUserView", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "message", "", "onResume", "onStart", "setListeners", "setUserPhotoShow", "subscribeObservable", "thirdLoginByAccount", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/account/LoginUsersActivity")
/* compiled from: LoginUsersActivity.kt */
public final class LoginUsersActivity extends BaseVmActivity<AccountViewModel> {
    public final int CODE_LOCATION = 1;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Nullable
    public LoginUserInfo clickUserInfo;
    @Nullable
    public String connetlifePrivacyPolicyUrl = "";
    @Nullable
    public String displayName = "";
    public String email;
    @NotNull
    public String firstName = "";
    @Nullable

    /* renamed from: id */
    public String f15742id = "";
    @Nullable
    public Integer jhlNeedUserAgreementCount = 0;
    @NotNull
    public String lastName = "";
    @NotNull
    public String loginSource = "0";
    @NotNull
    public ArrayList<LoginUserInfo> loginUserInfoList = new ArrayList<>();
    public LoginUserNameAdapter loginUserNameAdapter;
    @Autowired(name = "userNum")
    @JvmField
    public int loginUserSaveNumber = 1;
    @NotNull
    public String origin = EventBusConstKt.LOGIN;
    @Nullable
    public String photoUrl = "";
    public String psw;
    public String refreshToken;
    public final int spacing = 100;
    public int spanCount = 2;
    @Nullable
    public String termsConditionsUrl = "";
    @NotNull
    public String thirdCallBackParams = "";
    public ThirdAccountViewModel thirdLoginModel;
    @NotNull
    public String thirdLoginType = "3";
    @NotNull
    public String thirdPlatformId = "";
    @Nullable
    public String token = "";
    public int userIconBgColor;
    public String userName;
    @Nullable
    public String vidaaPrivacyPolicyUrl = "";

    /* access modifiers changed from: private */
    public final void checkLocationPerm() {
        if (C7585u.m21554c(this, CollectionsKt__CollectionsKt.listOf(PermissionConstKt.PERMISSION_LOCATION, "android.permission.ACCESS_COARSE_LOCATION"))) {
            gotoRegisterActivity();
            return;
        }
        C7585u l = C7585u.m21560l(this);
        l.mo33042g(PermissionConstKt.PERMISSION_LOCATION);
        l.mo33042g("android.permission.ACCESS_COARSE_LOCATION");
        l.mo33043h(new LoginUsersActivity$checkLocationPerm$1(this));
    }

    private final void getJHLProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLRegisterProtocol(LanguageListManager.INSTANCE.getLanguageCode());
    }

    private final void getJHLUserProtocol() {
        ((AccountViewModel) getMViewModel()).getJHLUserRegisterProtocol(String.valueOf(SPManagerKt.getLanguageId()));
    }

    /* access modifiers changed from: private */
    public final void getLoginUserInfoList() {
        this.loginUserInfoList = LoginUserInfoRoom.Companion.loginUserInfoProvider().sortAndGetAll();
    }

    private final String getSpellName(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) str, (Object) "null") || Intrinsics.areEqual((Object) str2, (Object) "null")) {
            return "UN";
        }
        char charAt = str.charAt(0);
        return Intrinsics.stringPlus(charAt + "", Character.valueOf(str2.charAt(0)));
    }

    private final void getUserProfile() {
        ((AccountViewModel) getMViewModel()).getUserProfile(true);
    }

    private final void goPasswordActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.PasswordActivity);
        String str = this.email;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("email");
            str = null;
        }
        Postcard withString = a.withString("email", str);
        String str3 = this.userName;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.USERNAME);
        } else {
            str2 = str3;
        }
        withString.withString(EventBusConstKt.USERNAME, str2).withString("firstName", this.firstName).withString("lastName", this.lastName).withInt("userIconBgColor", this.userIconBgColor).withString("photoUrl", this.photoUrl);
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoConfig() {
        JuConnectExtKt.navigation(Paths.Account.ConfigTestActivity);
    }

    /* access modifiers changed from: private */
    public final void gotoLoginActivity() {
        hideLoading();
        this.origin = EventBusConstKt.LOGIN;
        JuConnectExtKt.navigation(Paths.Account.LoginEmailActivity);
    }

    private final void gotoMainActivity() {
        hideLoading();
        LoginActivityManager.Companion.get().removeAllActivity();
        Paths.Jump.INSTANCE.jumpToMain(this);
    }

    private final void gotoPolicy() {
        if (TextUtils.isEmpty(this.termsConditionsUrl) || TextUtils.isEmpty(this.connetlifePrivacyPolicyUrl)) {
            String string = getString(R$string.no_internet_connection);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
            showString(string);
            return;
        }
        Postcard a = C1337a.m211c().mo15011a(Intrinsics.areEqual((Object) this.origin, (Object) EventBusConstKt.REGISTER) ? Paths.Account.RegisterInputEmaliActiviy : Paths.Account.PrivacyPolicyActivity);
        a.withString(EventBusConstKt.ORIGIN, this.origin).withString("termsConditionsUrl", this.termsConditionsUrl).withString("vidaaPrivacyPolicyUrl", this.vidaaPrivacyPolicyUrl).withString("connetlifePrivacyPolicyUrl", this.connetlifePrivacyPolicyUrl).withString("thirdPlatformId", this.thirdPlatformId).withString("email", "").withString(EventBusConstKt.PSW, "");
        a.navigation();
    }

    /* access modifiers changed from: private */
    public final void gotoRegisterActivity() {
        this.origin = EventBusConstKt.REGISTER;
        getJHLProtocol();
    }

    private final void gotoRegisterInputUserInfo() {
        hideLoading();
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.RegisterInputUserInfoActivity);
        String str = this.email;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("email");
            str = null;
        }
        Postcard withString = a.withString("email", str);
        String str3 = this.psw;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.PSW);
        } else {
            str2 = str3;
        }
        withString.withString(EventBusConstKt.PSW, str2).withString(EventBusConstKt.ORIGIN, EventBusConstKt.LOGIN).withString("thirdPlatformId", this.thirdPlatformId).withString("thirdLoginType", this.thirdLoginType).withString(FirebaseMessagingService.EXTRA_TOKEN, this.token).withString("id", this.f15742id).withString(FileProvider.DISPLAYNAME_FIELD, this.displayName).withString("photoUrl", this.photoUrl).withString("thirdCallBackParams", this.thirdCallBackParams);
        a.navigation();
    }

    private final void gotoThirdLogin(String str) {
        if (!Intrinsics.areEqual((Object) str, (Object) getString(R$string.server_client_id))) {
            return;
        }
        if (ThirdLoginForGoogleUtils.Companion.checkUserLogin(this)) {
            GoogleSignInAccount currentUser = ThirdLoginForGoogleUtils.Companion.getCurrentUser(this);
            if (currentUser != null) {
                thirdLoginByAccount(currentUser);
                return;
            }
            return;
        }
        ThirdLoginForGoogleUtils.Companion.thirdLogin(this);
    }

    /* access modifiers changed from: private */
    public final void initMoreThanOneUserView() {
        this.loginUserNameAdapter = new LoginUserNameAdapter(this, this.loginUserInfoList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, this.spanCount);
        ((RecyclerView) _$_findCachedViewById(R$id.user_name_recycler)).setLayoutManager(gridLayoutManager);
        if (((RecyclerView) _$_findCachedViewById(R$id.user_name_recycler)).getItemDecorationCount() == 0) {
            ((RecyclerView) _$_findCachedViewById(R$id.user_name_recycler)).addItemDecoration(new GridSpacingItemDecoration(this.spanCount, this.spacing, false));
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R$id.user_name_recycler);
        LoginUserNameAdapter loginUserNameAdapter2 = this.loginUserNameAdapter;
        LoginUserNameAdapter loginUserNameAdapter3 = null;
        if (loginUserNameAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginUserNameAdapter");
            loginUserNameAdapter2 = null;
        }
        recyclerView.setAdapter(loginUserNameAdapter2);
        LoginUserNameAdapter loginUserNameAdapter4 = this.loginUserNameAdapter;
        if (loginUserNameAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginUserNameAdapter");
        } else {
            loginUserNameAdapter3 = loginUserNameAdapter4;
        }
        loginUserNameAdapter3.setOnItemClickListener(new LoginUsersActivity$initMoreThanOneUserView$1(this, gridLayoutManager));
    }

    /* access modifiers changed from: private */
    public final void refreshToken() {
        this.origin = EventBusConstKt.LOGIN;
        if (NetUtils.Companion.getNETWORK_ENABLE()) {
            AccountViewModel accountViewModel = (AccountViewModel) getMViewModel();
            String str = this.refreshToken;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("refreshToken");
                str = null;
            }
            String str2 = this.email;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("email");
                str2 = null;
            }
            String str3 = this.psw;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.PSW);
                str3 = null;
            }
            accountViewModel.refreshToken(str, str2, str3, this.loginSource, this.thirdPlatformId);
            return;
        }
        String string = getString(R$string.network_lost);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.network_lost)");
        showString(string);
    }

    private final void setUserPhotoShow() {
        if (TextUtils.isEmpty(this.photoUrl) || Intrinsics.areEqual((Object) this.photoUrl, (Object) "null")) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView, "user_image");
            imageView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView, "user_text");
            textView.setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.user_text)).setText(getSpellName(this.firstName, this.lastName));
        } else {
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView2, "user_image");
            imageView2.setVisibility(0);
            TextView textView2 = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView2, "user_text");
            textView2.setVisibility(8);
            ((C1544f) C1541c.m1101w(this).mo15512s(this.photoUrl).mo16283b0(((CardView) _$_findCachedViewById(R$id.user_card_view)).getWidth(), ((CardView) _$_findCachedViewById(R$id.user_card_view)).getHeight())).mo15478D0((ImageView) _$_findCachedViewById(R$id.user_image));
        }
        if (TextUtils.isEmpty(this.firstName) || TextUtils.isEmpty(this.lastName) || Intrinsics.areEqual((Object) this.firstName, (Object) "null") || Intrinsics.areEqual((Object) this.lastName, (Object) "null")) {
            TextView textView3 = (TextView) _$_findCachedViewById(R$id.user_name);
            String str = this.email;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("email");
                str = null;
            }
            textView3.setText(str);
            return;
        }
        ((TextView) _$_findCachedViewById(R$id.user_name)).setText(this.firstName + ' ' + this.lastName);
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m26844subscribeObservable$lambda2(LoginUsersActivity loginUsersActivity, Pair pair) {
        String str;
        Intrinsics.checkNotNullParameter(loginUsersActivity, "this$0");
        if (pair != null) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                loginUsersActivity.getJHLUserProtocol();
                return;
            }
            String str2 = (String) pair.getSecond();
            int hashCode = str2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 1591789448) {
                    if (hashCode == 1591789483 && str2.equals("600919")) {
                        str = loginUsersActivity.getString(R$string.third_account_unbind);
                        Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                        loginUsersActivity.showString(str);
                        ThirdLoginForGoogleUtils.Companion.signOut(loginUsersActivity, LoginUsersActivity$subscribeObservable$1$1$1.INSTANCE);
                        loginUsersActivity.hideLoading();
                        ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
                    }
                } else if (str2.equals("600905")) {
                    str = loginUsersActivity.getString(R$string.wrong_email_or_password);
                    Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                    loginUsersActivity.showString(str);
                    ThirdLoginForGoogleUtils.Companion.signOut(loginUsersActivity, LoginUsersActivity$subscribeObservable$1$1$1.INSTANCE);
                    loginUsersActivity.hideLoading();
                    ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
                }
            } else if (str2.equals("")) {
                str = loginUsersActivity.getString(R$string.network_lost);
                Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
                loginUsersActivity.showString(str);
                ThirdLoginForGoogleUtils.Companion.signOut(loginUsersActivity, LoginUsersActivity$subscribeObservable$1$1$1.INSTANCE);
                loginUsersActivity.hideLoading();
                ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
            }
            str = loginUsersActivity.getString(R$string.wrong_email_or_password);
            Intrinsics.checkNotNullExpressionValue(str, "when (it.second) {\n//   …rd)\n                    }");
            loginUsersActivity.showString(str);
            ThirdLoginForGoogleUtils.Companion.signOut(loginUsersActivity, LoginUsersActivity$subscribeObservable$1$1$1.INSTANCE);
            loginUsersActivity.hideLoading();
            ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
        }
    }

    /* renamed from: subscribeObservable$lambda-4  reason: not valid java name */
    public static final void m26845subscribeObservable$lambda4(LoginUsersActivity loginUsersActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginUsersActivity, "this$0");
        if (pair != null) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                loginUsersActivity.getJHLUserProtocol();
                return;
            }
            loginUsersActivity.hideLoading();
            if (!Intrinsics.areEqual((Object) loginUsersActivity.loginSource, (Object) "0")) {
                loginUsersActivity.gotoThirdLogin(loginUsersActivity.thirdPlatformId);
            } else if (((Number) pair.getSecond()).intValue() != 600722) {
                loginUsersActivity.goPasswordActivity();
            } else {
                LoginUserInfo loginUserInfo = loginUsersActivity.clickUserInfo;
                if (loginUserInfo != null) {
                    AccountUtils.Companion.deleteCurrentUserInfoFromDatabase(loginUserInfo == null ? null : loginUserInfo.getCustomer_id_s());
                } else {
                    AccountUtils.Companion.deleteCurrentUserInfoFromDatabase();
                }
            }
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26846subscribeObservable$lambda5(LoginUsersActivity loginUsersActivity, Pair pair) {
        String str;
        String updateCount;
        String ppVersion;
        Intrinsics.checkNotNullParameter(loginUsersActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            String str2 = "";
            if (pair == null) {
                loginUsersActivity.termsConditionsUrl = str2;
                loginUsersActivity.connetlifePrivacyPolicyUrl = str2;
                loginUsersActivity.jhlNeedUserAgreementCount = 0;
                return;
            }
            LogUtilsShen.Companion companion = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData = (JHLAgreementData) pair.getSecond();
            Integer num = null;
            companion.mo39138e(Intrinsics.stringPlus("jhl tosVer: ", jHLAgreementData == null ? null : jHLAgreementData.getTosVersion()));
            LogUtilsShen.Companion companion2 = LogUtilsShen.Companion;
            JHLAgreementData jHLAgreementData2 = (JHLAgreementData) pair.getSecond();
            companion2.mo39138e(Intrinsics.stringPlus("jhl ppVer: ", jHLAgreementData2 == null ? null : jHLAgreementData2.getPpVersion()));
            SPUtils sPUtils = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData3 = (JHLAgreementData) pair.getSecond();
            if (jHLAgreementData3 == null || (str = jHLAgreementData3.getTosVersion()) == null) {
                str = str2;
            }
            sPUtils.put(KeyConst.KEY_JHL_TOSVER, str);
            SPUtils sPUtils2 = SPUtils.INSTANCE;
            JHLAgreementData jHLAgreementData4 = (JHLAgreementData) pair.getSecond();
            if (!(jHLAgreementData4 == null || (ppVersion = jHLAgreementData4.getPpVersion()) == null)) {
                str2 = ppVersion;
            }
            sPUtils2.put(KeyConst.KEY_JHL_PPVER, str2);
            JHLAgreementData jHLAgreementData5 = (JHLAgreementData) pair.getSecond();
            loginUsersActivity.termsConditionsUrl = jHLAgreementData5 == null ? null : jHLAgreementData5.getTosUrl();
            JHLAgreementData jHLAgreementData6 = (JHLAgreementData) pair.getSecond();
            loginUsersActivity.connetlifePrivacyPolicyUrl = jHLAgreementData6 == null ? null : jHLAgreementData6.getPpUrl();
            JHLAgreementData jHLAgreementData7 = (JHLAgreementData) pair.getSecond();
            if (TextUtils.isEmpty(jHLAgreementData7 == null ? null : jHLAgreementData7.getUpdateCount())) {
                num = 0;
            } else {
                JHLAgreementData jHLAgreementData8 = (JHLAgreementData) pair.getSecond();
                if (!(jHLAgreementData8 == null || (updateCount = jHLAgreementData8.getUpdateCount()) == null)) {
                    num = Integer.valueOf(Integer.parseInt(updateCount));
                }
            }
            loginUsersActivity.jhlNeedUserAgreementCount = num;
            if (num != null && num.intValue() == 0) {
                loginUsersActivity.getUserProfile();
                return;
            }
            ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
            loginUsersActivity.hideLoading();
            loginUsersActivity.gotoPolicy();
            return;
        }
        loginUsersActivity.hideLoading();
        String string = loginUsersActivity.getString(R$string.no_internet_connection);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.no_internet_connection)");
        loginUsersActivity.showString(string);
    }

    /* renamed from: subscribeObservable$lambda-6  reason: not valid java name */
    public static final void m26847subscribeObservable$lambda6(LoginUsersActivity loginUsersActivity, JHLAgreementData jHLAgreementData) {
        Intrinsics.checkNotNullParameter(loginUsersActivity, "this$0");
        loginUsersActivity.hideLoading();
        if (jHLAgreementData == null) {
            loginUsersActivity.termsConditionsUrl = "";
            loginUsersActivity.connetlifePrivacyPolicyUrl = "";
        } else {
            loginUsersActivity.termsConditionsUrl = jHLAgreementData.getTosUrl();
            loginUsersActivity.connetlifePrivacyPolicyUrl = jHLAgreementData.getPpUrl();
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_TOSVER, jHLAgreementData.getTosVersion());
            SPUtils.INSTANCE.put(KeyConst.KEY_JHL_PPVER, jHLAgreementData.getPpVersion());
        }
        loginUsersActivity.gotoPolicy();
    }

    /* renamed from: subscribeObservable$lambda-7  reason: not valid java name */
    public static final void m26848subscribeObservable$lambda7(LoginUsersActivity loginUsersActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(loginUsersActivity, "this$0");
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            loginUsersActivity.hideLoading();
            ((AccountViewModel) loginUsersActivity.getMViewModel()).updateLoadingStatus(false);
            String string = loginUsersActivity.getString(R$string.access_failed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.access_failed)");
            loginUsersActivity.showString(string);
        } else if (pair.getSecond() != null) {
            loginUsersActivity.gotoMainActivity();
        } else {
            loginUsersActivity.gotoRegisterInputUserInfo();
        }
    }

    private final void thirdLoginByAccount(GoogleSignInAccount googleSignInAccount) {
        String jhkSerial;
        Intrinsics.stringPlus("firebaseAuthWithGoogle:", googleSignInAccount.mo24423U());
        String U = googleSignInAccount.mo24423U();
        if (!(U == null || U.length() == 0)) {
            showLoading(true);
            ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
            if (thirdAccountViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
                thirdAccountViewModel = null;
            }
            String string = getString(R$string.server_client_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.server_client_id)");
            String U2 = googleSignInAccount.mo24423U();
            Intrinsics.checkNotNull(U2);
            Intrinsics.checkNotNullExpressionValue(U2, "account.idToken!!");
            HiSystemParameter hiSystemParameter = HiSmart.Companion.getInstance().getHiSystemParameter();
            String str = "";
            if (!(hiSystemParameter == null || (jhkSerial = hiSystemParameter.getJhkSerial()) == null)) {
                str = jhkSerial;
            }
            thirdAccountViewModel.thirdSignIn(ThirdLoginForGoogleUtils.thirdType, string, U2, str);
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
        return R$layout.activity_login_users;
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        LoginActivityManager.Companion.get().addActivity(this);
        ThirdLoginForGoogleUtils.Companion.initGoogleLogin(this);
        this.thirdLoginModel = new ThirdAccountViewModel();
        EventBus.getDefault().register(this);
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(9216);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(getResources().getColor(R$color.transparent));
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            try {
                GoogleSignInAccount n = C3253a.m8297c(intent).mo28853n(ApiException.class);
                Intrinsics.checkNotNull(n);
                thirdLoginByAccount(n);
            } catch (ApiException e) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7) {
                    showString(R$string.network_lost);
                } else if (statusCode != 10) {
                    showString(R$string.third_login_failed);
                } else {
                    showString(R$string.invalid_account);
                }
                Intrinsics.stringPlus("Google sign in failed:", Integer.valueOf(e.getStatusCode()));
                Intrinsics.stringPlus("Google sign in failed:", e.getStatus());
            }
        }
    }

    public void onBackPressed() {
        LoginUserNameAdapter loginUserNameAdapter2 = this.loginUserNameAdapter;
        LoginUserNameAdapter loginUserNameAdapter3 = null;
        if (loginUserNameAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginUserNameAdapter");
            loginUserNameAdapter2 = null;
        }
        if (loginUserNameAdapter2.getDeleteStatus()) {
            LoginUserNameAdapter loginUserNameAdapter4 = this.loginUserNameAdapter;
            if (loginUserNameAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginUserNameAdapter");
            } else {
                loginUserNameAdapter3 = loginUserNameAdapter4;
            }
            loginUserNameAdapter3.setDeleteStatus(false);
            return;
        }
        Paths.Jump.exitApp$default(Paths.Jump.INSTANCE, this, (Function0) null, 2, (Object) null);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C1506m.m960j("LoginUsersActivity onCreate!!!");
    }

    public void onDestroy() {
        super.onDestroy();
        C1506m.m960j("LoginUsersActivity onDestroy!!!");
        EventBus.getDefault().unregister(this);
        LoginActivityManager.Companion.get().removeActivity((Activity) this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEvent(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "message");
    }

    public void onResume() {
        super.onResume();
        ThirdLoginUtils.Companion.googleSignOut();
    }

    public void onStart() {
        super.onStart();
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new LoginUsersActivity$onStart$1(this, (Continuation<? super LoginUsersActivity$onStart$1>) null), 2, (Object) null);
        ThirdLoginUtils.Companion.initGoogleSignInfo(this);
    }

    public void setListeners() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.sign_with);
        Intrinsics.checkNotNullExpressionValue(textView, "sign_with");
        JuConnectExtKt.singleClickListener(textView, new LoginUsersActivity$setListeners$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.register);
        Intrinsics.checkNotNullExpressionValue(textView2, EventBusConstKt.REGISTER);
        JuConnectExtKt.singleClickListener(textView2, new LoginUsersActivity$setListeners$2(this));
        TextView textView3 = (TextView) _$_findCachedViewById(R$id.user_name);
        Intrinsics.checkNotNullExpressionValue(textView3, "user_name");
        JuConnectExtKt.singleClickListener(textView3, new LoginUsersActivity$setListeners$3(this));
        CardView cardView = (CardView) _$_findCachedViewById(R$id.user_card_view);
        Intrinsics.checkNotNullExpressionValue(cardView, "user_card_view");
        JuConnectExtKt.singleClickListener(cardView, new LoginUsersActivity$setListeners$4(this));
        Button button = (Button) _$_findCachedViewById(R$id.config_test);
        Intrinsics.checkNotNullExpressionValue(button, "config_test");
        JuConnectExtKt.singleClickListener(button, new LoginUsersActivity$setListeners$5(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ThirdAccountViewModel thirdAccountViewModel = this.thirdLoginModel;
        if (thirdAccountViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thirdLoginModel");
            thirdAccountViewModel = null;
        }
        thirdAccountViewModel.getThirdLoginLiveData().observe(this, new C7197i0(this));
        ((AccountViewModel) getMViewModel()).getRefreshTokenLiveData().observe(this, new C7208l(this));
        ((AccountViewModel) getMViewModel()).getGetJHLUserRegisterProtocolLiveData().observe(this, new C7220o(this));
        ((AccountViewModel) getMViewModel()).getGetJHLRegisterProtocolLiveData().observe(this, new C7166a2(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7257x0(this));
    }
}
