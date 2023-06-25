package com.hisense.connect_life.app_account.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpGps;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.greenrobot.eventbus.EventBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p431a.p432b.C7190g1;
import p040c.p429r.p430a.p431a.p432b.C7214m1;
import p040c.p429r.p430a.p431a.p432b.C7216n;

@Route(path = "/account/RepeatPasswordActivity")
@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020'H\u0016J\b\u0010(\u001a\u00020!H\u0014J\b\u0010)\u001a\u00020!H\u0014J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006,"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/RepeatPasswordActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "gps", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "getGps", "()Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;", "setGps", "(Lcom/hisense/connect_life/hismart/networks/request/account/model/UpGps;)V", "psw", "", "getPsw", "()Ljava/lang/String;", "setPsw", "(Ljava/lang/String;)V", "userCity", "userCountry", "userEmail", "userLanguge", "userName", "userNumber", "userPhone", "userPostalCode", "userStreet", "userSurname", "addUserProfile", "", "bindLayout", "", "gotoLoginUserActivity", "initUserInfo", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "setListeners", "signIn", "subscribeObservable", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Deprecated(message = "页面已弃用")
/* compiled from: RepeatPasswordActivity.kt */
public final class RepeatPasswordActivity extends BaseVmActivity<AccountViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "userInfo")
    public Bundle bundle;
    @Autowired(name = "gps")
    public UpGps gps;
    @Autowired(name = "psw")
    public String psw;
    public String userCity;
    public String userCountry;
    public String userEmail;
    public String userLanguge;
    public String userName;
    public String userNumber;
    public String userPhone;
    public String userPostalCode;
    public String userStreet;
    public String userSurname;

    public static final /* synthetic */ AccountViewModel access$getMViewModel(RepeatPasswordActivity repeatPasswordActivity) {
        return (AccountViewModel) repeatPasswordActivity.getMViewModel();
    }

    private final void addUserProfile() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("gps==", getGps()));
        LoggerUtil.Companion companion = LoggerUtil.Companion;
        String str10 = this.userCity;
        if (str10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userCity");
            str10 = null;
        }
        companion.mo39146e(Intrinsics.stringPlus("userCity==", str10));
        String str11 = this.userStreet;
        if (str11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userStreet");
            str = null;
        } else {
            str = str11;
        }
        String str12 = this.userNumber;
        if (str12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNumber");
            str2 = null;
        } else {
            str2 = str12;
        }
        String str13 = this.userPostalCode;
        if (str13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userPostalCode");
            str3 = null;
        } else {
            str3 = str13;
        }
        String str14 = this.userCity;
        if (str14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userCity");
            str4 = null;
        } else {
            str4 = str14;
        }
        String str15 = this.userCountry;
        if (str15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userCountry");
            str5 = null;
        } else {
            str5 = str15;
        }
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(new UpAddress("BILLING", str, str2, str3, str4, str5, getGps()));
        String str16 = this.userPhone;
        if (str16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userPhone");
            str16 = null;
        }
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new UpPhone(str16, "MOBILE"));
        String str17 = this.userEmail;
        if (str17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userEmail");
            str6 = null;
        } else {
            str6 = str17;
        }
        String str18 = this.userName;
        if (str18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.USERNAME);
            str7 = null;
        } else {
            str7 = str18;
        }
        String str19 = this.userSurname;
        if (str19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userSurname");
            str8 = null;
        } else {
            str8 = str19;
        }
        String str20 = this.userLanguge;
        if (str20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userLanguge");
            str9 = null;
        } else {
            str9 = str20;
        }
        ((AccountViewModel) getMViewModel()).addUserProfile(new UserProfile(str6, str7, str8, listOf, listOf2, str9, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131008, (DefaultConstructorMarker) null));
    }

    private final void gotoLoginUserActivity() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.LoginEmailActivity);
        String str = this.userEmail;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userEmail");
            str = null;
        }
        a.withString("email", str).withString(EventBusConstKt.PSW, getPsw());
        a.navigation();
        EventBus.getDefault().post(100);
        finish();
    }

    private final void initUserInfo() {
        if (getBundle() != null) {
            this.userLanguge = String.valueOf(getBundle().getString("language"));
            this.userName = String.valueOf(getBundle().getString("name"));
            this.userSurname = String.valueOf(getBundle().getString("surname"));
            this.userStreet = String.valueOf(getBundle().getString("street"));
            this.userNumber = String.valueOf(getBundle().getString("number"));
            this.userPostalCode = String.valueOf(getBundle().getString("postalCode"));
            this.userCity = String.valueOf(getBundle().getString("city"));
            this.userCountry = String.valueOf(getBundle().getString("country"));
            this.userEmail = String.valueOf(getBundle().getString("email"));
            this.userPhone = String.valueOf(getBundle().getString("phoneNumber"));
            if (getBundle().get(EventBusConstKt.GPS) != null) {
                Object obj = getBundle().get(EventBusConstKt.GPS);
                if (obj != null) {
                    setGps((UpGps) obj);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.hisense.connect_life.hismart.networks.request.account.model.UpGps");
            }
        }
    }

    private final void signIn() {
        AccountViewModel accountViewModel = (AccountViewModel) getMViewModel();
        String str = this.userEmail;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userEmail");
            str = null;
        }
        accountViewModel.signIn(str, StringsKt__StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(R$id.sign_password)).getText().toString()).toString());
    }

    /* renamed from: subscribeObservable$lambda-1  reason: not valid java name */
    public static final void m26889subscribeObservable$lambda1(RepeatPasswordActivity repeatPasswordActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(repeatPasswordActivity, "this$0");
        if (bool != null) {
            if (bool.booleanValue()) {
                repeatPasswordActivity.showString(R$string.register_success);
                repeatPasswordActivity.signIn();
                return;
            }
            repeatPasswordActivity.showString(R$string.register_fail);
        }
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m26890subscribeObservable$lambda3(RepeatPasswordActivity repeatPasswordActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(repeatPasswordActivity, "this$0");
        if (pair != null) {
            if (((Boolean) pair.getFirst()).booleanValue()) {
                repeatPasswordActivity.addUserProfile();
                return;
            }
            ((AccountViewModel) repeatPasswordActivity.getMViewModel()).updateLoadingStatus(false);
            repeatPasswordActivity.gotoLoginUserActivity();
        }
    }

    /* renamed from: subscribeObservable$lambda-5  reason: not valid java name */
    public static final void m26891subscribeObservable$lambda5(RepeatPasswordActivity repeatPasswordActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(repeatPasswordActivity, "this$0");
        if (bool != null) {
            bool.booleanValue();
            repeatPasswordActivity.gotoLoginUserActivity();
            ((AccountViewModel) repeatPasswordActivity.getMViewModel()).getAddUPLiveData().setValue(null);
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
        return R$layout.fragment_repeat_password;
    }

    @NotNull
    public final Bundle getBundle() {
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bundle");
        return null;
    }

    @NotNull
    public final UpGps getGps() {
        UpGps upGps = this.gps;
        if (upGps != null) {
            return upGps;
        }
        Intrinsics.throwUninitializedPropertyAccessException(EventBusConstKt.GPS);
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
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_next)).setText(getResources().getString(R$string.next));
        initUserInfo();
    }

    public final void setBundle(@NotNull Bundle bundle2) {
        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
        this.bundle = bundle2;
    }

    public final void setGps(@NotNull UpGps upGps) {
        Intrinsics.checkNotNullParameter(upGps, "<set-?>");
        this.gps = upGps;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new RepeatPasswordActivity$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.top_next);
        Intrinsics.checkNotNullExpressionValue(textView, "top_next");
        JuConnectExtKt.singleClickListener(textView, new RepeatPasswordActivity$setListeners$2(this));
        IconFontView iconFontView2 = (IconFontView) _$_findCachedViewById(R$id.show_hide_password_repeat);
        Intrinsics.checkNotNullExpressionValue(iconFontView2, "show_hide_password_repeat");
        JuConnectExtKt.singleClickListener(iconFontView2, new RepeatPasswordActivity$setListeners$3(this));
        ((EditText) _$_findCachedViewById(R$id.sign_password)).addTextChangedListener(new RepeatPasswordActivity$setListeners$4(this));
    }

    public final void setPsw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.psw = str;
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((AccountViewModel) getMViewModel()).getSignUpLiveData().observe(this, new C7216n(this));
        ((AccountViewModel) getMViewModel()).getSignInLiveData().observe(this, new C7214m1(this));
        ((AccountViewModel) getMViewModel()).getAddUPLiveData().observe(this, new C7190g1(this));
    }
}
