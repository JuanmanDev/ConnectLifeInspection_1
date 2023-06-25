package com.hisense.connect_life.app_account.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.R$drawable;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.app_account.R$layout;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.app_account.util.GetHeadPicPopupWindow;
import com.hisense.connect_life.app_account.viewmodel.AccountViewModel;
import com.hisense.connect_life.app_account.widget.ChangeEmailDialog;
import com.hisense.connect_life.app_account.widget.MultiLanguageDialog;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.constants.AddressType;
import com.hisense.connect_life.hismart.constants.RequestTag;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpGps;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UserProfile;
import com.hisense.connect_life.hismart.networks.request.language.model.Region;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import net.sqlcipher.database.SQLiteDatabase;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1544f;
import p040c.p077d.p078a.C1546g;
import p040c.p429r.p430a.p431a.p432b.C7165a1;
import p040c.p429r.p430a.p431a.p432b.C7173c0;
import p040c.p429r.p430a.p431a.p432b.C7176d;
import p040c.p429r.p430a.p431a.p432b.C7179d2;
import p040c.p429r.p430a.p431a.p432b.C7196i;
import p040c.p429r.p430a.p431a.p432b.C7207k2;
import p040c.p429r.p430a.p431a.p432b.C7219n2;
import p040c.p429r.p430a.p431a.p432b.C7223o2;
import p040c.p429r.p430a.p431a.p432b.C7224p;
import p040c.p429r.p430a.p431a.p432b.C7227p2;
import p040c.p429r.p430a.p431a.p432b.C7231q2;
import p040c.p429r.p430a.p431a.p432b.C7248v;
import p040c.p429r.p430a.p431a.p432b.C7256x;
import p040c.p429r.p430a.p431a.p432b.C7266z1;
import p040c.p429r.p430a.p431a.p432b.C7267z2;
import p040c.p472t.p473a.C7585u;

@Route(path = "/account/UserProfileActivity")
@Metadata(mo47990d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001sB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010!\u001a\u00020\rH\u0014J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u000bH\u0002J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010-\u001a\u00020$H\u0002J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000bH\u0002J\u000e\u00100\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000bJ\u0006\u00102\u001a\u00020$J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u000bH\u0002J\u0018\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0002J\b\u00108\u001a\u00020$H\u0002J\b\u00109\u001a\u00020$H\u0002J\b\u0010:\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020$H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020\tH\u0002J\b\u0010>\u001a\u00020$H\u0002J\b\u0010?\u001a\u00020\u0016H\u0002J\u0010\u0010@\u001a\u00020$2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010A\u001a\u00020$H\u0002J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020CH\u0016J\b\u0010D\u001a\u00020$H\u0014J \u0010E\u001a\u00020$2\u0006\u0010F\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\rH\u0016J4\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00162\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010HH\u0002J\"\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\u0010\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020\u000bH\u0007J-\u0010T\u001a\u00020$2\u0006\u0010N\u001a\u00020\r2\u000e\u0010U\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0V2\u0006\u0010W\u001a\u00020XH\u0016¢\u0006\u0002\u0010YJ\b\u0010Z\u001a\u00020$H\u0002J\u0010\u0010[\u001a\u00020$2\u0006\u0010\\\u001a\u00020\u000bH\u0002J\b\u0010]\u001a\u00020$H\u0002J\b\u0010^\u001a\u00020$H\u0002J\b\u0010_\u001a\u00020$H\u0014J\"\u0010`\u001a\u00020$2\b\u0010a\u001a\u0004\u0018\u00010\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0002J\u0012\u0010b\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010c\u001a\u00020$2\u0006\u0010d\u001a\u00020\u0016H\u0002J\b\u0010e\u001a\u00020$H\u0002J\u0018\u0010f\u001a\u00020$2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u000bH\u0002J\u0012\u0010j\u001a\u00020$2\b\b\u0002\u0010k\u001a\u00020\u0016H\u0002J\b\u0010l\u001a\u00020$H\u0016J\b\u0010m\u001a\u00020$H\u0002J\u0010\u0010n\u001a\u00020$2\u0006\u0010\\\u001a\u00020\u000bH\u0002J\u0010\u0010o\u001a\u00020$2\u0006\u0010p\u001a\u00020\u0016H\u0002J\u0018\u0010q\u001a\u00020$2\u0006\u0010r\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006t"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/UserProfileActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/connect_life/app_account/viewmodel/AccountViewModel;", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$LanguageResult;", "Lcom/hisense/connect_life/app_account/widget/MultiLanguageDialog$CityResult;", "()V", "bitMap", "Landroid/graphics/Bitmap;", "contentUri", "Landroid/net/Uri;", "countryCode", "", "countryCurrentItem", "", "domain", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "getHeadPicPopupWindow", "Lcom/hisense/connect_life/app_account/util/GetHeadPicPopupWindow;", "isChangeCountry", "", "isChangeLanguage", "isTakePhoto", "languageCurrentItem", "mLanguageName", "oldUserProfile", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UserProfile;", "regionList", "Ljava/util/ArrayList;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/Region;", "userEmail", "bindLayout", "checkRequiredItems", "cityResult", "", "currentItem", "deleteAccountSuccess", "dp2px", "", "dp", "getCountryCurrentItemIndex", "cCode", "getCountryNameByCode", "getLanguageCurrentItem", "getLanguageNameByCode", "code", "getLanguageTypeString", "languageType", "getPerForR", "getRegionByLang", "languageCode", "getSpellName", "firstName", "lastName", "getUserProfile", "goToSettings", "gotoCamera", "gotoChangePWD", "gotoClipActivity", "uri", "gotoPhoto", "haveStoragePermission", "initCountryName", "initUserPhotoShow", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "languageResult", "languageName", "makeAddress", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAddress;", "init", "attr", "content", "oldUpAddress", "onActivityResult", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onEventMessage", "event", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestCameraPermission", "requestCheckPassExist", "requestTag", "requestPermission", "requestStoragePermission", "setListeners", "setUserPhoto", "photoUrl", "settingTitle", "showChangeEmailDialog", "hasPassword", "showOffErrorWord", "showRedImage", "redImage", "Landroid/widget/ImageView;", "checkContent", "showUpdateToast", "success", "subscribeObservable", "updateDatabaseUserInfo", "updateFailedRollBack", "updateProfileUI", "needChangeLanguage", "updateUserProfile", "data", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileActivity.kt */
public final class UserProfileActivity extends BaseVmActivity<AccountViewModel> implements MultiLanguageDialog.LanguageResult, MultiLanguageDialog.CityResult {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int GOTO_CLIP_CODE = 1000;
    public static final int READ_EXTERNAL_STORAGE_REQUEST = 4165;
    public static final int REQUEST_CAPTURE = 100;
    public static final int REQUEST_CHANG_PREFERENCE = 102;
    public static final int REQUEST_CODE = 17;
    public static final int REQUEST_PICK = 101;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public Bitmap bitMap;
    @Nullable
    public Uri contentUri;
    @NotNull
    public String countryCode = "";
    public int countryCurrentItem;
    @Autowired(name = "domain")
    public String domain;
    @NotNull
    public final GetHeadPicPopupWindow getHeadPicPopupWindow = new GetHeadPicPopupWindow();
    public boolean isChangeCountry;
    public boolean isChangeLanguage;
    public boolean isTakePhoto = true;
    public int languageCurrentItem;
    @NotNull
    public String mLanguageName = "";
    @Nullable
    public UserProfile oldUserProfile;
    @NotNull
    public final ArrayList<Region> regionList = new ArrayList<>();
    @NotNull
    public String userEmail = "";

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/activity/UserProfileActivity$Companion;", "", "()V", "GOTO_CLIP_CODE", "", "READ_EXTERNAL_STORAGE_REQUEST", "REQUEST_CAPTURE", "REQUEST_CHANG_PREFERENCE", "REQUEST_CODE", "REQUEST_PICK", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: UserProfileActivity.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ AccountViewModel access$getMViewModel(UserProfileActivity userProfileActivity) {
        return (AccountViewModel) userProfileActivity.getMViewModel();
    }

    private final boolean checkRequiredItems() {
        if (((TextView) _$_findCachedViewById(R$id.tv_user_title)).getText().toString().length() > 0) {
            if (((EditText) _$_findCachedViewById(R$id.user_profile_name)).getText().toString().length() > 0) {
                if (((EditText) _$_findCachedViewById(R$id.user_profile_surname)).getText().toString().length() > 0) {
                    if (((TextView) _$_findCachedViewById(R$id.user_profile_email)).getText().toString().length() > 0) {
                        if (((TextView) _$_findCachedViewById(R$id.user_profile_language)).getText().toString().length() > 0) {
                            if (((TextView) _$_findCachedViewById(R$id.user_profile_country)).getText().toString().length() > 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final void deleteAccountSuccess() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new UserProfileActivity$deleteAccountSuccess$1((Continuation<? super UserProfileActivity$deleteAccountSuccess$1>) null), 2, (Object) null);
    }

    private final float dp2px(float f) {
        return (f * getResources().getDisplayMetrics().density) + 0.5f;
    }

    private final int getCountryCurrentItemIndex(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int i = 0;
        for (T next : this.regionList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) str, (Object) ((Region) next).getCode())) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    private final String getCountryNameByCode(String str) {
        for (Region region : this.regionList) {
            if (Intrinsics.areEqual((Object) region.getCode(), (Object) str)) {
                return region.getName();
            }
        }
        return "AF";
    }

    private final void getLanguageCurrentItem() {
        CharSequence text = ((TextView) _$_findCachedViewById(R$id.user_profile_language)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "user_profile_language.text");
        int i = 0;
        if (text.length() == 0) {
            this.languageCurrentItem = 0;
            return;
        }
        for (T next : LanguageListManager.INSTANCE.getLanguageNameList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) this.mLanguageName, (Object) (String) next)) {
                this.languageCurrentItem = i;
                return;
            }
            i = i2;
        }
    }

    private final String getLanguageNameByCode(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            int indexByCode = LanguageListManager.INSTANCE.getIndexByCode(String.valueOf(str == null ? null : Integer.valueOf(Integer.parseInt(str))));
            if (indexByCode != -1) {
                String str3 = LanguageListManager.INSTANCE.getLanguageNameList().get(indexByCode);
                Intrinsics.checkNotNullExpressionValue(str3, "LanguageListManager.languageNameList[indexNum]");
                str = str3;
            }
        } catch (NumberFormatException unused) {
        }
        LanguageListManager languageListManager = LanguageListManager.INSTANCE;
        if (str != null) {
            str2 = str;
        }
        int indexByTypeCode = languageListManager.getIndexByTypeCode(str2);
        if (indexByTypeCode == -1) {
            return str;
        }
        String str4 = LanguageListManager.INSTANCE.getLanguageNameList().get(indexByTypeCode);
        Intrinsics.checkNotNullExpressionValue(str4, "LanguageListManager.languageNameList[indexNum]");
        return str4;
    }

    private final void getRegionByLang(String str) {
        ((AccountViewModel) getMViewModel()).updateLoadingStatus(true);
        LoginInfo userInfo = AccountUtils.Companion.getUserInfo();
        if (userInfo != null) {
            ((AccountViewModel) getMViewModel()).getRegionByLang(str, userInfo.getToken());
        }
    }

    private final String getSpellName(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Intrinsics.areEqual((Object) str, (Object) "null") || Intrinsics.areEqual((Object) str2, (Object) "null")) {
            return "";
        }
        char charAt = str.charAt(0);
        return Intrinsics.stringPlus(charAt + "", Character.valueOf(str2.charAt(0)));
    }

    private final void getUserProfile() {
        ((AccountViewModel) getMViewModel()).updateLoadingStatus(true);
        ((AccountViewModel) getMViewModel()).getUserProfile(false);
    }

    private final void goToSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(Intrinsics.stringPlus("package:", getPackageName())));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void gotoCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        StringBuilder sb = new StringBuilder();
        File externalCacheDir = getExternalCacheDir();
        sb.append(externalCacheDir == null ? null : externalCacheDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("pic.jpg");
        Uri uriForFile = FileProvider.getUriForFile(this, "com.hisense.connect_life.app_account.fileProvider", new File(sb.toString()));
        this.contentUri = uriForFile;
        intent.putExtra("output", uriForFile);
        startActivityForResult(intent, 100);
    }

    /* access modifiers changed from: private */
    public final void gotoChangePWD() {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.ChangePasswordActivity);
        a.withString("email", this.userEmail);
        a.navigation((Activity) this, 17);
    }

    private final void gotoClipActivity(Uri uri) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.ClipImageActivity);
        a.withString("uri", uri.toString());
        a.navigation((Activity) this, 1000);
    }

    private final void gotoPhoto() {
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            startActivityForResult(intent, 101);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final boolean haveStoragePermission() {
        return ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private final void initCountryName(String str) {
        ((TextView) _$_findCachedViewById(R$id.user_profile_country)).setText(getCountryNameByCode(str));
        this.countryCurrentItem = getCountryCurrentItemIndex(str);
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image_country);
        Intrinsics.checkNotNullExpressionValue(imageView, "user_image_country");
        showRedImage(imageView, ((TextView) _$_findCachedViewById(R$id.user_profile_country)).getText().toString());
    }

    private final void initUserPhotoShow() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new UserProfileActivity$initUserPhotoShow$1(AccountUtils.Companion.getUserInfo(), this, (Continuation<? super UserProfileActivity$initUserPhotoShow$1>) null), 2, (Object) null);
    }

    private final UpAddress makeAddress(boolean z, String str, String str2, UpAddress upAddress) {
        String str3 = str;
        String str4 = str2;
        if (z) {
            return new UpAddress("BILLING", ((EditText) _$_findCachedViewById(R$id.user_profile_street)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.user_profile_number)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.user_profile_postal_code)).getText().toString(), ((EditText) _$_findCachedViewById(R$id.user_profile_city)).getText().toString(), this.countryCode, new UpGps((String) null, (String) null, 3, (DefaultConstructorMarker) null));
        }
        Intrinsics.checkNotNull(upAddress);
        UpAddress copy$default = UpAddress.copy$default(upAddress, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (UpGps) null, 127, (Object) null);
        if (str3 != null) {
            switch (str.hashCode()) {
                case -1838660605:
                    if (str3.equals(AddressType.STREET)) {
                        Intrinsics.checkNotNull(str2);
                        copy$default.setStreet(str4);
                        break;
                    }
                    break;
                case -1749187619:
                    if (str3.equals(AddressType.COUNTRY_REGION)) {
                        Intrinsics.checkNotNull(str2);
                        copy$default.setCountry(str4);
                        break;
                    }
                    break;
                case 2068843:
                    if (str3.equals(AddressType.CITY)) {
                        Intrinsics.checkNotNull(str2);
                        copy$default.setCity(str4);
                        break;
                    }
                    break;
                case 129250529:
                    if (str3.equals(AddressType.POSTAL_CODE)) {
                        Intrinsics.checkNotNull(str2);
                        copy$default.setPostalCode(str4);
                        break;
                    }
                    break;
                case 1982405992:
                    if (str3.equals(AddressType.HOUSE_NUMBER)) {
                        Intrinsics.checkNotNull(str2);
                        copy$default.setHouseNumber(str4);
                        break;
                    }
                    break;
            }
        }
        return copy$default;
    }

    public static /* synthetic */ UpAddress makeAddress$default(UserProfileActivity userProfileActivity, boolean z, String str, String str2, UpAddress upAddress, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            upAddress = null;
        }
        return userProfileActivity.makeAddress(z, str, str2, upAddress);
    }

    /* access modifiers changed from: private */
    public final void requestCameraPermission() {
        if (Build.VERSION.SDK_INT > 28) {
            getPerForR();
        } else if (haveStoragePermission()) {
            getPerForR();
        } else {
            requestPermission();
        }
    }

    private final void requestCheckPassExist(String str) {
        showLoading();
        ((AccountViewModel) getMViewModel()).checkPassExist(str);
    }

    private final void requestPermission() {
        if (!haveStoragePermission()) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, READ_EXTERNAL_STORAGE_REQUEST);
        }
    }

    /* access modifiers changed from: private */
    public final void requestStoragePermission() {
        if (Build.VERSION.SDK_INT > 28) {
            gotoPhoto();
        } else if (haveStoragePermission()) {
            gotoPhoto();
        } else {
            requestPermission();
        }
    }

    /* renamed from: setListeners$lambda-12  reason: not valid java name */
    public static final void m26893setListeners$lambda12(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        List list;
        List list2;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z && (userProfile = userProfileActivity2.oldUserProfile) != null) {
            List<UpPhone> phoneNumbers = userProfile.getPhoneNumbers();
            boolean z2 = false;
            if (phoneNumbers == null || phoneNumbers.isEmpty()) {
                if (!(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString().length() == 0)) {
                    String str = "MOBILE";
                    String str2 = RequestTag.PhoneNumbers;
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString().length() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        list2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        list2 = CollectionsKt__CollectionsJVMKt.listOf(new UpPhone(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString(), str));
                    }
                    copy$default.setPhoneNumbers(list2);
                    userProfileActivity2.updateUserProfile(copy$default, str2);
                    return;
                }
                return;
            }
            String str3 = "MOBILE";
            String str4 = RequestTag.PhoneNumbers;
            List<UpPhone> phoneNumbers2 = userProfile.getPhoneNumbers();
            Intrinsics.checkNotNull(phoneNumbers2);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(phoneNumbers2, 10));
            for (UpPhone number : phoneNumbers2) {
                arrayList.add(number.getNumber());
            }
            if (!arrayList.contains(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString())) {
                String str5 = str4;
                String str6 = str3;
                UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString().length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    list = CollectionsKt__CollectionsJVMKt.listOf(new UpPhone(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_phone)).getText().toString(), str6));
                }
                copy$default2.setPhoneNumbers(list);
                userProfileActivity2.updateUserProfile(copy$default2, str5);
            }
        }
    }

    /* renamed from: setListeners$lambda-16  reason: not valid java name */
    public static final void m26894setListeners$lambda16(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z && (userProfile = userProfileActivity2.oldUserProfile) != null) {
            List<UpAddress> addresses = userProfile.getAddresses();
            boolean z2 = true;
            if (addresses == null || addresses.isEmpty()) {
                if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_street)).getText().toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    String str = RequestTag.Street;
                    copy$default.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(makeAddress$default(userProfileActivity, true, (String) null, (String) null, (UpAddress) null, 14, (Object) null)));
                    userProfileActivity2.updateUserProfile(copy$default, str);
                    return;
                }
                return;
            }
            String str2 = RequestTag.Street;
            if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_street)).getText().toString().length() == 0) {
                List<UpAddress> addresses2 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses2);
                String street = addresses2.get(0).getStreet();
                if (!(street == null || street.length() == 0)) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_street)).getText().toString();
            List<UpAddress> addresses3 = userProfile.getAddresses();
            Intrinsics.checkNotNull(addresses3);
            if (!Intrinsics.areEqual((Object) obj, (Object) addresses3.get(0).getStreet())) {
                UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                String obj2 = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_street)).getText().toString();
                List<UpAddress> addresses4 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses4);
                copy$default2.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(userProfileActivity2.makeAddress(false, AddressType.STREET, obj2, addresses4.get(0))));
                userProfileActivity2.updateUserProfile(copy$default2, str2);
            }
        }
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m26895setListeners$lambda2(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z) {
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_name)).getText().toString();
            UserProfile userProfile2 = userProfileActivity2.oldUserProfile;
            if (!Intrinsics.areEqual((Object) obj, (Object) userProfile2 == null ? null : userProfile2.getFirstName())) {
                if ((((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_name)).getText().toString().length() > 0) && (userProfile = userProfileActivity2.oldUserProfile) != null) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    copy$default.setFirstName(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_name)).getText().toString());
                    userProfileActivity2.updateUserProfile(copy$default, RequestTag.FirstName);
                }
            }
        }
    }

    /* renamed from: setListeners$lambda-20  reason: not valid java name */
    public static final void m26896setListeners$lambda20(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z && (userProfile = userProfileActivity2.oldUserProfile) != null) {
            List<UpAddress> addresses = userProfile.getAddresses();
            boolean z2 = true;
            if (addresses == null || addresses.isEmpty()) {
                if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_number)).getText().toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    String str = RequestTag.HouseNumber;
                    copy$default.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(makeAddress$default(userProfileActivity, true, (String) null, (String) null, (UpAddress) null, 14, (Object) null)));
                    userProfileActivity2.updateUserProfile(copy$default, str);
                    return;
                }
                return;
            }
            String str2 = RequestTag.HouseNumber;
            if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_number)).getText().toString().length() == 0) {
                List<UpAddress> addresses2 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses2);
                String houseNumber = addresses2.get(0).getHouseNumber();
                if (!(houseNumber == null || houseNumber.length() == 0)) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_number)).getText().toString();
            List<UpAddress> addresses3 = userProfile.getAddresses();
            Intrinsics.checkNotNull(addresses3);
            if (!Intrinsics.areEqual((Object) obj, (Object) addresses3.get(0).getHouseNumber())) {
                UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                String obj2 = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_number)).getText().toString();
                List<UpAddress> addresses4 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses4);
                copy$default2.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(userProfileActivity2.makeAddress(false, AddressType.HOUSE_NUMBER, obj2, addresses4.get(0))));
                userProfileActivity2.updateUserProfile(copy$default2, str2);
            }
        }
    }

    /* renamed from: setListeners$lambda-24  reason: not valid java name */
    public static final void m26897setListeners$lambda24(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z && (userProfile = userProfileActivity2.oldUserProfile) != null) {
            List<UpAddress> addresses = userProfile.getAddresses();
            boolean z2 = true;
            if (addresses == null || addresses.isEmpty()) {
                if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_postal_code)).getText().toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    String str = RequestTag.PostalCode;
                    copy$default.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(makeAddress$default(userProfileActivity, true, (String) null, (String) null, (UpAddress) null, 14, (Object) null)));
                    userProfileActivity2.updateUserProfile(copy$default, str);
                    return;
                }
                return;
            }
            String str2 = RequestTag.PostalCode;
            if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_postal_code)).getText().toString().length() == 0) {
                List<UpAddress> addresses2 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses2);
                String postalCode = addresses2.get(0).getPostalCode();
                if (!(postalCode == null || postalCode.length() == 0)) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_postal_code)).getText().toString();
            List<UpAddress> addresses3 = userProfile.getAddresses();
            Intrinsics.checkNotNull(addresses3);
            if (!Intrinsics.areEqual((Object) obj, (Object) addresses3.get(0).getPostalCode())) {
                UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                String obj2 = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_postal_code)).getText().toString();
                List<UpAddress> addresses4 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses4);
                copy$default2.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(userProfileActivity2.makeAddress(false, AddressType.POSTAL_CODE, obj2, addresses4.get(0))));
                userProfileActivity2.updateUserProfile(copy$default2, str2);
            }
        }
    }

    /* renamed from: setListeners$lambda-28  reason: not valid java name */
    public static final void m26898setListeners$lambda28(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z && (userProfile = userProfileActivity2.oldUserProfile) != null) {
            List<UpAddress> addresses = userProfile.getAddresses();
            boolean z2 = true;
            if (addresses == null || addresses.isEmpty()) {
                if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_city)).getText().toString().length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    String str = RequestTag.City;
                    makeAddress$default(userProfileActivity, true, (String) null, (String) null, (UpAddress) null, 14, (Object) null);
                    userProfileActivity2.updateUserProfile(copy$default, str);
                    return;
                }
                return;
            }
            String str2 = RequestTag.City;
            if (((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_city)).getText().toString().length() == 0) {
                List<UpAddress> addresses2 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses2);
                String city = addresses2.get(0).getCity();
                if (!(city == null || city.length() == 0)) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_city)).getText().toString();
            List<UpAddress> addresses3 = userProfile.getAddresses();
            Intrinsics.checkNotNull(addresses3);
            if (!Intrinsics.areEqual((Object) obj, (Object) addresses3.get(0).getCity())) {
                UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                String obj2 = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_city)).getText().toString();
                List<UpAddress> addresses4 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses4);
                copy$default2.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(userProfileActivity2.makeAddress(false, AddressType.CITY, obj2, addresses4.get(0))));
                userProfileActivity2.updateUserProfile(copy$default2, str2);
            }
        }
    }

    /* renamed from: setListeners$lambda-6  reason: not valid java name */
    public static final void m26899setListeners$lambda6(UserProfileActivity userProfileActivity, View view, boolean z) {
        UserProfile userProfile;
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (!z) {
            String obj = ((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_surname)).getText().toString();
            UserProfile userProfile2 = userProfileActivity2.oldUserProfile;
            if (!Intrinsics.areEqual((Object) obj, (Object) userProfile2 == null ? null : userProfile2.getLastName())) {
                if ((((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_surname)).getText().toString().length() > 0) && (userProfile = userProfileActivity2.oldUserProfile) != null) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    copy$default.setLastName(((EditText) userProfileActivity2._$_findCachedViewById(R$id.user_profile_surname)).getText().toString());
                    userProfileActivity2.updateUserProfile(copy$default, RequestTag.LastName);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setUserPhoto(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || Intrinsics.areEqual((Object) str, (Object) "null")) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image);
            Intrinsics.checkNotNullExpressionValue(imageView, "user_image");
            imageView.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(R$id.user_text);
            Intrinsics.checkNotNullExpressionValue(textView, "user_text");
            textView.setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.user_text)).setText(getSpellName(str2, str3));
            return;
        }
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.user_image);
        Intrinsics.checkNotNullExpressionValue(imageView2, "user_image");
        imageView2.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.user_text);
        Intrinsics.checkNotNullExpressionValue(textView2, "user_text");
        textView2.setVisibility(8);
        runOnUiThread(new C7196i(this, str));
    }

    /* renamed from: setUserPhoto$lambda-48  reason: not valid java name */
    public static final void m26900setUserPhoto$lambda48(UserProfileActivity userProfileActivity, String str) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        ((C1544f) C1541c.m1101w(userProfileActivity).mo15512s(str).mo16283b0(((CardView) userProfileActivity._$_findCachedViewById(R$id.user_card_view)).getWidth(), ((CardView) userProfileActivity._$_findCachedViewById(R$id.user_card_view)).getHeight())).mo15478D0((ImageView) userProfileActivity._$_findCachedViewById(R$id.user_image));
    }

    /* access modifiers changed from: private */
    public final void settingTitle(String str) {
        String str2;
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_user_title);
        if (Intrinsics.areEqual((Object) str, (Object) "0")) {
            str2 = getString(R$string.f15734mr);
        } else {
            str2 = Intrinsics.areEqual((Object) str, (Object) "1") ? getString(R$string.f15735ms) : "";
        }
        textView.setText(str2);
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image_title);
        Intrinsics.checkNotNullExpressionValue(imageView, "user_image_title");
        showRedImage(imageView, ((TextView) _$_findCachedViewById(R$id.tv_user_title)).getText().toString());
    }

    private final void showChangeEmailDialog(boolean z) {
        String userId;
        UserProfile userProfile = this.oldUserProfile;
        if (userProfile != null && (userId = userProfile.getUserId()) != null) {
            ChangeEmailDialog.Companion companion = ChangeEmailDialog.Companion;
            ChangeEmailDialog changeEmailDialog = new ChangeEmailDialog(z ? companion.getPROCESS_CHANGE_EMAIL_WITH_PASSWORD() : companion.getPROCESS_CHANGE_EMAIL_WITH_CODE_NO_PASSWORD(), z, userId, (int) dp2px(336.0f));
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            JuConnectExtKt.displayDialog(changeEmailDialog, supportFragmentManager);
        }
    }

    /* access modifiers changed from: private */
    public final void showOffErrorWord() {
        boolean z = true;
        int i = 8;
        ((TextView) _$_findCachedViewById(R$id.tv_error_first_name)).setVisibility(((EditText) _$_findCachedViewById(R$id.user_profile_name)).getText().toString().length() == 0 ? 0 : 8);
        ((TextView) _$_findCachedViewById(R$id.tv_error_last_name)).setVisibility(((EditText) _$_findCachedViewById(R$id.user_profile_surname)).getText().toString().length() == 0 ? 0 : 8);
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_error_country_region);
        if (((TextView) _$_findCachedViewById(R$id.user_profile_country)).getText().toString().length() == 0) {
            i = 0;
        }
        textView.setVisibility(i);
        ((EditText) _$_findCachedViewById(R$id.user_profile_name)).setBackgroundResource(((EditText) _$_findCachedViewById(R$id.user_profile_name)).getText().toString().length() == 0 ? R$drawable.edittext_background_error_white : R$drawable.bg_userprofile_edit_round);
        EditText editText = (EditText) _$_findCachedViewById(R$id.user_profile_surname);
        if (((EditText) _$_findCachedViewById(R$id.user_profile_surname)).getText().toString().length() != 0) {
            z = false;
        }
        editText.setBackgroundResource(z ? R$drawable.edittext_background_error_white : R$drawable.bg_userprofile_edit_round);
    }

    /* access modifiers changed from: private */
    public final void showRedImage(ImageView imageView, String str) {
        int i = 0;
        if (!(str.length() == 0)) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    private final void showUpdateToast(boolean z) {
        String str;
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_toast);
        if (z) {
            String string = getString(R$string.saved);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.saved)");
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            str = StringsKt__StringsJVMKt.capitalize(string, locale);
        } else {
            str = "";
        }
        textView.setText(str);
        _$_findCachedViewById(R$id.ll_toast).setVisibility(0);
        _$_findCachedViewById(R$id.ll_toast).postDelayed(new C7165a1(this), 1500);
    }

    public static /* synthetic */ void showUpdateToast$default(UserProfileActivity userProfileActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        userProfileActivity.showUpdateToast(z);
    }

    /* renamed from: showUpdateToast$lambda-63  reason: not valid java name */
    public static final void m26901showUpdateToast$lambda63(UserProfileActivity userProfileActivity) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        userProfileActivity._$_findCachedViewById(R$id.ll_toast).setVisibility(8);
    }

    /* renamed from: subscribeObservable$lambda-29  reason: not valid java name */
    public static final void m26902subscribeObservable$lambda29(UserProfileActivity userProfileActivity, Triple triple) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        userProfileActivity.hideLoading();
        if (((Boolean) triple.getFirst()).booleanValue()) {
            String str = (String) triple.getSecond();
            if (Intrinsics.areEqual((Object) str, (Object) RequestTag.CheckPasswordExistToShowChangePassword)) {
                ((RelativeLayout) userProfileActivity._$_findCachedViewById(R$id.rl_change_pwd)).setVisibility(((Boolean) triple.getThird()).booleanValue() ? 0 : 4);
            } else if (Intrinsics.areEqual((Object) str, (Object) RequestTag.CheckPasswordExistToChangeEmail)) {
                userProfileActivity.showChangeEmailDialog(((Boolean) triple.getThird()).booleanValue());
            }
        }
    }

    /* renamed from: subscribeObservable$lambda-34  reason: not valid java name */
    public static final void m26903subscribeObservable$lambda34(UserProfileActivity userProfileActivity, Pair pair) {
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (pair.getSecond() == null) {
            userProfileActivity2.oldUserProfile = new UserProfile((String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
            userProfileActivity2.showString(R$string.get_user_profile_failed);
            return;
        }
        Object second = pair.getSecond();
        Intrinsics.checkNotNull(second);
        String str = "";
        if (((UserProfile) second).getFirstName() == null) {
            Object second2 = pair.getSecond();
            Intrinsics.checkNotNull(second2);
            ((UserProfile) second2).setFirstName(str);
        }
        Object second3 = pair.getSecond();
        Intrinsics.checkNotNull(second3);
        if (((UserProfile) second3).getLastName() == null) {
            Object second4 = pair.getSecond();
            Intrinsics.checkNotNull(second4);
            ((UserProfile) second4).setLastName(str);
        }
        Object second5 = pair.getSecond();
        Intrinsics.checkNotNull(second5);
        UserProfile copy$default = UserProfile.copy$default((UserProfile) second5, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
        userProfileActivity2.oldUserProfile = copy$default;
        Intrinsics.checkNotNull(copy$default);
        String addressType = copy$default.getAddressType();
        if (addressType.length() == 0) {
            addressType = "BILLING";
        }
        copy$default.setAddressType(addressType);
        String phoneType = copy$default.getPhoneType();
        if (phoneType.length() == 0) {
            phoneType = "MOBILE";
        }
        copy$default.setPhoneType(phoneType);
        if (copy$default.getAddresses() == null) {
            copy$default.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(new UpAddress("BILLING", "", "", "", "", "AL", new UpGps("0.0", "0.0"))));
        }
        List<UpAddress> addresses = copy$default.getAddresses();
        Intrinsics.checkNotNull(addresses);
        UpAddress upAddress = (UpAddress) CollectionsKt___CollectionsKt.first(addresses);
        upAddress.setStreet(upAddress.getStreet() == null ? str : upAddress.getStreet());
        upAddress.setHouseNumber(upAddress.getHouseNumber() == null ? str : upAddress.getHouseNumber());
        upAddress.setPostalCode(upAddress.getPostalCode() == null ? str : upAddress.getPostalCode());
        upAddress.setCity(upAddress.getCity() == null ? str : upAddress.getCity());
        if (upAddress.getCountry() != null) {
            str = upAddress.getCountry();
        }
        upAddress.setCountry(str);
        List<UpPhone> phoneNumbers = copy$default.getPhoneNumbers();
        if (phoneNumbers == null || phoneNumbers.isEmpty()) {
            copy$default.setPhoneNumbers(CollectionsKt__CollectionsKt.emptyList());
        } else if (copy$default.getPhoneNumbers() != null) {
            List<UpPhone> phoneNumbers2 = copy$default.getPhoneNumbers();
            Intrinsics.checkNotNull(phoneNumbers2);
            if (StringsKt__StringsKt.trim((CharSequence) phoneNumbers2.get(0).getNumber()).toString().length() == 0) {
                copy$default.setPhoneNumbers(CollectionsKt__CollectionsKt.emptyList());
            }
        }
        userProfileActivity2.updateProfileUI(true);
        userProfileActivity.updateDatabaseUserInfo();
        userProfileActivity.showOffErrorWord();
    }

    /* renamed from: subscribeObservable$lambda-35  reason: not valid java name */
    public static final void m26904subscribeObservable$lambda35(UserProfileActivity userProfileActivity, Triple triple) {
        UserProfileActivity userProfileActivity2 = userProfileActivity;
        Intrinsics.checkNotNullParameter(userProfileActivity2, "this$0");
        if (((Boolean) triple.getFirst()).booleanValue()) {
            UserProfile userProfile = (UserProfile) triple.getThird();
            userProfileActivity2.oldUserProfile = userProfile == null ? null : UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
            EventBus.getDefault().post(userProfileActivity2.oldUserProfile);
            userProfileActivity2.updateProfileUI(false);
            userProfileActivity.updateDatabaseUserInfo();
            showUpdateToast$default(userProfileActivity2, false, 1, (Object) null);
            EventBus.getDefault().post("updateUserProfileCallback");
            return;
        }
        String string = userProfileActivity2.getString(R$string.update_userprofile_failed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.update_userprofile_failed)");
        userProfileActivity2.showString(string);
        userProfileActivity2.updateFailedRollBack((String) triple.getSecond());
    }

    /* renamed from: subscribeObservable$lambda-37  reason: not valid java name */
    public static final void m26905subscribeObservable$lambda37(UserProfileActivity userProfileActivity, List list) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (list != null) {
            if (!userProfileActivity.regionList.isEmpty()) {
                userProfileActivity.regionList.clear();
            }
            userProfileActivity.regionList.addAll(list);
        }
        ((AccountViewModel) userProfileActivity.getMViewModel()).updateLoadingStatus(false);
        userProfileActivity.initCountryName(userProfileActivity.countryCode);
        userProfileActivity.showOffErrorWord();
    }

    /* renamed from: subscribeObservable$lambda-38  reason: not valid java name */
    public static final void m26906subscribeObservable$lambda38(UserProfileActivity userProfileActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (bool == null || !bool.booleanValue()) {
            String string = userProfileActivity.getString(R$string.failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.failure)");
            userProfileActivity.showString(string);
            return;
        }
        Intrinsics.stringPlus("结果", bool);
        C1546g w = C1541c.m1101w(userProfileActivity);
        Bitmap bitmap = userProfileActivity.bitMap;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitMap");
            bitmap = null;
        }
        ((C1544f) w.mo15509p(bitmap).mo16283b0(((CardView) userProfileActivity._$_findCachedViewById(R$id.user_card_view)).getWidth(), ((CardView) userProfileActivity._$_findCachedViewById(R$id.user_card_view)).getHeight())).mo15478D0((ImageView) userProfileActivity._$_findCachedViewById(R$id.user_image));
        userProfileActivity.getUserProfile();
        EventBus.getDefault().post("updateUserProfileCallback");
    }

    /* renamed from: subscribeObservable$lambda-39  reason: not valid java name */
    public static final void m26907subscribeObservable$lambda39(UserProfileActivity userProfileActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(userProfileActivity, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            userProfileActivity.deleteAccountSuccess();
        } else if (((Number) pair.getSecond()).intValue() < 0) {
            String string = userProfileActivity.getString(R$string.network_lost);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.network_lost)");
            userProfileActivity.showString(string);
        } else {
            String string2 = userProfileActivity.getString(R$string.delete_account_fail);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.delete_account_fail)");
            userProfileActivity.showString(string2);
        }
    }

    private final void updateDatabaseUserInfo() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new UserProfileActivity$updateDatabaseUserInfo$1(this, (Continuation<? super UserProfileActivity$updateDatabaseUserInfo$1>) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void updateFailedRollBack(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            r4 = 0
            switch(r0) {
                case -1808122845: goto L_0x02fc;
                case -1548945544: goto L_0x0286;
                case -1540661655: goto L_0x0210;
                case -903015926: goto L_0x0182;
                case -290349704: goto L_0x010c;
                case 2100619: goto L_0x0096;
                case 80818744: goto L_0x007e;
                case 1836967196: goto L_0x002e;
                case 2136803643: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x036f
        L_0x000e:
            java.lang.String r0 = "FirstName"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0018
            goto L_0x036f
        L_0x0018:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_name
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            java.lang.String r4 = r0.getFirstName()
        L_0x0029:
            r6.setText(r4)
            goto L_0x036f
        L_0x002e:
            java.lang.String r0 = "PhoneNumbers"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0038
            goto L_0x036f
        L_0x0038:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x003e
            r6 = r4
            goto L_0x0042
        L_0x003e:
            java.util.List r6 = r6.getPhoneNumbers()
        L_0x0042:
            if (r6 == 0) goto L_0x004c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = r3
        L_0x004c:
            if (r2 == 0) goto L_0x005b
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_phone
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setText(r1)
            goto L_0x036f
        L_0x005b:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_phone
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            java.util.List r4 = r0.getPhoneNumbers()
        L_0x006c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.first(r4)
            com.hisense.connect_life.hismart.networks.request.account.model.UpPhone r0 = (com.hisense.connect_life.hismart.networks.request.account.model.UpPhone) r0
            java.lang.String r0 = r0.getNumber()
            r6.setText(r0)
            goto L_0x036f
        L_0x007e:
            java.lang.String r0 = "Title"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
            goto L_0x036f
        L_0x0088:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            java.lang.String r4 = r6.getGender()
        L_0x0091:
            r5.settingTitle(r4)
            goto L_0x036f
        L_0x0096:
            java.lang.String r0 = "City"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x00a0
            goto L_0x036f
        L_0x00a0:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x00a6
            r6 = r4
            goto L_0x00aa
        L_0x00a6:
            java.util.List r6 = r6.getAddresses()
        L_0x00aa:
            if (r6 == 0) goto L_0x00b5
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r6 = r3
            goto L_0x00b6
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            if (r6 != 0) goto L_0x00ff
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x00be
            r6 = r4
            goto L_0x00c2
        L_0x00be:
            java.util.List r6 = r6.getAddresses()
        L_0x00c2:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = r6.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getCity()
            if (r6 == 0) goto L_0x00d9
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r2 = r3
        L_0x00d9:
            if (r2 == 0) goto L_0x00dc
            goto L_0x00ff
        L_0x00dc:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_city
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x00e9
            goto L_0x00ed
        L_0x00e9:
            java.util.List r4 = r0.getAddresses()
        L_0x00ed:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r0 = r4.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r0 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r0
            java.lang.String r0 = r0.getCity()
            r6.setText(r0)
            goto L_0x036f
        L_0x00ff:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_city
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setText(r1)
            goto L_0x036f
        L_0x010c:
            java.lang.String r0 = "PostalCode"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0116
            goto L_0x036f
        L_0x0116:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x011c
            r6 = r4
            goto L_0x0120
        L_0x011c:
            java.util.List r6 = r6.getAddresses()
        L_0x0120:
            if (r6 == 0) goto L_0x012b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r6 = r3
            goto L_0x012c
        L_0x012b:
            r6 = r2
        L_0x012c:
            if (r6 != 0) goto L_0x0175
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0134
            r6 = r4
            goto L_0x0138
        L_0x0134:
            java.util.List r6 = r6.getAddresses()
        L_0x0138:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = r6.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getPostalCode()
            if (r6 == 0) goto L_0x014f
            int r6 = r6.length()
            if (r6 != 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r2 = r3
        L_0x014f:
            if (r2 == 0) goto L_0x0152
            goto L_0x0175
        L_0x0152:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_postal_code
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x015f
            goto L_0x0163
        L_0x015f:
            java.util.List r4 = r0.getAddresses()
        L_0x0163:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r0 = r4.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r0 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r0
            java.lang.String r0 = r0.getPostalCode()
            r6.setText(r0)
            goto L_0x036f
        L_0x0175:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_postal_code
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setText(r1)
            goto L_0x036f
        L_0x0182:
            java.lang.String r0 = "CountryRegion"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x018c
            goto L_0x036f
        L_0x018c:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0192
            r6 = r4
            goto L_0x0196
        L_0x0192:
            java.util.List r6 = r6.getAddresses()
        L_0x0196:
            if (r6 == 0) goto L_0x01a1
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            r6 = r3
            goto L_0x01a2
        L_0x01a1:
            r6 = r2
        L_0x01a2:
            if (r6 != 0) goto L_0x01ff
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x01aa
            r6 = r4
            goto L_0x01ae
        L_0x01aa:
            java.util.List r6 = r6.getAddresses()
        L_0x01ae:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = r6.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getCountry()
            if (r6 == 0) goto L_0x01c5
            int r6 = r6.length()
            if (r6 != 0) goto L_0x01c4
            goto L_0x01c5
        L_0x01c4:
            r2 = r3
        L_0x01c5:
            if (r2 == 0) goto L_0x01c8
            goto L_0x01ff
        L_0x01c8:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x01cd
            goto L_0x01d1
        L_0x01cd:
            java.util.List r4 = r6.getAddresses()
        L_0x01d1:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r6 = r4.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getCountry()
            if (r6 != 0) goto L_0x01e1
            goto L_0x01e2
        L_0x01e1:
            r1 = r6
        L_0x01e2:
            r5.countryCode = r1
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_country
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r0 = r5.countryCode
            java.lang.String r0 = r5.getCountryNameByCode(r0)
            r6.setText(r0)
            java.lang.String r6 = r5.countryCode
            int r6 = r5.getCountryCurrentItemIndex(r6)
            r5.countryCurrentItem = r6
            goto L_0x036f
        L_0x01ff:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_country
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r1)
            r5.countryCode = r1
            r5.countryCurrentItem = r3
            goto L_0x036f
        L_0x0210:
            java.lang.String r0 = "HouseNumber"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x021a
            goto L_0x036f
        L_0x021a:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0220
            r6 = r4
            goto L_0x0224
        L_0x0220:
            java.util.List r6 = r6.getAddresses()
        L_0x0224:
            if (r6 == 0) goto L_0x022f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x022d
            goto L_0x022f
        L_0x022d:
            r6 = r3
            goto L_0x0230
        L_0x022f:
            r6 = r2
        L_0x0230:
            if (r6 != 0) goto L_0x0279
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0238
            r6 = r4
            goto L_0x023c
        L_0x0238:
            java.util.List r6 = r6.getAddresses()
        L_0x023c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = r6.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getHouseNumber()
            if (r6 == 0) goto L_0x0253
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0252
            goto L_0x0253
        L_0x0252:
            r2 = r3
        L_0x0253:
            if (r2 == 0) goto L_0x0256
            goto L_0x0279
        L_0x0256:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_number
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x0263
            goto L_0x0267
        L_0x0263:
            java.util.List r4 = r0.getAddresses()
        L_0x0267:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r0 = r4.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r0 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r0
            java.lang.String r0 = r0.getHouseNumber()
            r6.setText(r0)
            goto L_0x036f
        L_0x0279:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_number
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setText(r1)
            goto L_0x036f
        L_0x0286:
            java.lang.String r0 = "Language"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0290
            goto L_0x036f
        L_0x0290:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0296
            r6 = r4
            goto L_0x029a
        L_0x0296:
            java.lang.String r6 = r6.getLanguage()
        L_0x029a:
            if (r6 == 0) goto L_0x02a4
            int r6 = r6.length()
            if (r6 != 0) goto L_0x02a3
            goto L_0x02a4
        L_0x02a3:
            r2 = r3
        L_0x02a4:
            if (r2 == 0) goto L_0x02b4
            r5.mLanguageName = r1
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_language
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r6.setText(r1)
            goto L_0x02f7
        L_0x02b4:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x02ba
            r6 = r4
            goto L_0x02be
        L_0x02ba:
            java.lang.String r6 = r6.getLanguage()
        L_0x02be:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.String r6 = r5.getLanguageNameByCode(r6)
            r5.mLanguageName = r6
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_language
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x02d5
            r0 = r4
            goto L_0x02d9
        L_0x02d5:
            java.lang.String r0 = r0.getLanguage()
        L_0x02d9:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = r5.getLanguageNameByCode(r0)
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r1 = r5.oldUserProfile
            if (r1 != 0) goto L_0x02e5
            goto L_0x02e9
        L_0x02e5:
            java.lang.String r4 = r1.getLanguage()
        L_0x02e9:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.String r1 = r5.getLanguageNameByCode(r4)
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            r6.setText(r0)
        L_0x02f7:
            r5.getLanguageCurrentItem()
            goto L_0x036f
        L_0x02fc:
            java.lang.String r0 = "Street"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0306
            goto L_0x036f
        L_0x0306:
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x030c
            r6 = r4
            goto L_0x0310
        L_0x030c:
            java.util.List r6 = r6.getAddresses()
        L_0x0310:
            if (r6 == 0) goto L_0x031b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            r6 = r3
            goto L_0x031c
        L_0x031b:
            r6 = r2
        L_0x031c:
            if (r6 != 0) goto L_0x0364
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r6 = r5.oldUserProfile
            if (r6 != 0) goto L_0x0324
            r6 = r4
            goto L_0x0328
        L_0x0324:
            java.util.List r6 = r6.getAddresses()
        L_0x0328:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = r6.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r6 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r6
            java.lang.String r6 = r6.getStreet()
            if (r6 == 0) goto L_0x033f
            int r6 = r6.length()
            if (r6 != 0) goto L_0x033e
            goto L_0x033f
        L_0x033e:
            r2 = r3
        L_0x033f:
            if (r2 == 0) goto L_0x0342
            goto L_0x0364
        L_0x0342:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_street
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r0 = r5.oldUserProfile
            if (r0 != 0) goto L_0x034f
            goto L_0x0353
        L_0x034f:
            java.util.List r4 = r0.getAddresses()
        L_0x0353:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r0 = r4.get(r3)
            com.hisense.connect_life.hismart.networks.request.account.model.UpAddress r0 = (com.hisense.connect_life.hismart.networks.request.account.model.UpAddress) r0
            java.lang.String r0 = r0.getStreet()
            r6.setText(r0)
            goto L_0x036f
        L_0x0364:
            int r6 = com.hisense.connect_life.app_account.R$id.user_profile_street
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r6.setText(r1)
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.UserProfileActivity.updateFailedRollBack(java.lang.String):void");
    }

    private final void updateProfileUI(boolean z) {
        UserProfile userProfile = this.oldUserProfile;
        if (userProfile != null) {
            setUserPhoto(userProfile.getPhotoUrl(), userProfile.getFirstName(), userProfile.getLastName());
            settingTitle(userProfile.getGender());
            EditText editText = (EditText) _$_findCachedViewById(R$id.user_profile_name);
            String firstName = userProfile.getFirstName();
            boolean z2 = false;
            String str = "";
            if (firstName.length() == 0) {
                firstName = str;
            }
            editText.setText(firstName);
            EditText editText2 = (EditText) _$_findCachedViewById(R$id.user_profile_surname);
            String lastName = userProfile.getLastName();
            if (lastName.length() == 0) {
                lastName = str;
            }
            editText2.setText(lastName);
            if (userProfile.getUserId().length() > 0) {
                z2 = true;
            }
            if (z2) {
                ((TextView) _$_findCachedViewById(R$id.user_profile_email)).setText(userProfile.getUserId());
                this.userEmail = userProfile.getUserId();
            }
            List<UpPhone> phoneNumbers = userProfile.getPhoneNumbers();
            if (phoneNumbers != null && (!phoneNumbers.isEmpty())) {
                ((EditText) _$_findCachedViewById(R$id.user_profile_phone)).setText(((UpPhone) CollectionsKt___CollectionsKt.first(phoneNumbers)).getNumber());
            }
            List<UpAddress> addresses = userProfile.getAddresses();
            if (addresses != null && (!addresses.isEmpty())) {
                UpAddress upAddress = (UpAddress) CollectionsKt___CollectionsKt.first(addresses);
                ((EditText) _$_findCachedViewById(R$id.user_profile_street)).setText(upAddress.getStreet());
                ((EditText) _$_findCachedViewById(R$id.user_profile_number)).setText(upAddress.getHouseNumber());
                ((EditText) _$_findCachedViewById(R$id.user_profile_postal_code)).setText(upAddress.getPostalCode());
                ((EditText) _$_findCachedViewById(R$id.user_profile_city)).setText(upAddress.getCity());
            }
            String country = userProfile.getCountry();
            if (country != null) {
                str = country;
            }
            this.countryCode = str;
            if (z) {
                getRegionByLang(String.valueOf(SPUtils.INSTANCE.get("languageId", 1L)));
            } else {
                initCountryName(str);
            }
            String language = userProfile.getLanguage();
            if (language != null) {
                String languageNameByCode = getLanguageNameByCode(language);
                this.mLanguageName = languageNameByCode;
                ((TextView) _$_findCachedViewById(R$id.user_profile_language)).setText(Intrinsics.stringPlus(languageNameByCode, getLanguageTypeString(language)));
                getLanguageCurrentItem();
            }
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(R$id.user_image_title);
        Intrinsics.checkNotNullExpressionValue(imageView, "user_image_title");
        showRedImage(imageView, ((TextView) _$_findCachedViewById(R$id.tv_user_title)).getText().toString());
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R$id.user_image_name);
        Intrinsics.checkNotNullExpressionValue(imageView2, "user_image_name");
        showRedImage(imageView2, ((EditText) _$_findCachedViewById(R$id.user_profile_name)).getText().toString());
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R$id.user_image_surname);
        Intrinsics.checkNotNullExpressionValue(imageView3, "user_image_surname");
        showRedImage(imageView3, ((EditText) _$_findCachedViewById(R$id.user_profile_surname)).getText().toString());
        ImageView imageView4 = (ImageView) _$_findCachedViewById(R$id.user_image_email);
        Intrinsics.checkNotNullExpressionValue(imageView4, "user_image_email");
        showRedImage(imageView4, ((TextView) _$_findCachedViewById(R$id.user_profile_email)).getText().toString());
        ImageView imageView5 = (ImageView) _$_findCachedViewById(R$id.user_image_language);
        Intrinsics.checkNotNullExpressionValue(imageView5, "user_image_language");
        showRedImage(imageView5, ((TextView) _$_findCachedViewById(R$id.user_profile_language)).getText().toString());
    }

    /* access modifiers changed from: private */
    public final void updateUserProfile(UserProfile userProfile, String str) {
        ((AccountViewModel) getMViewModel()).updateUserProfile(userProfile, str);
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
        return R$layout.activity_user_profile;
    }

    public void cityResult(int i, @NotNull String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "countryCode");
        this.countryCode = str2;
        boolean z = true;
        this.isChangeCountry = true;
        ((TextView) _$_findCachedViewById(R$id.user_profile_country)).setText(getCountryNameByCode(str2));
        this.countryCurrentItem = i;
        UserProfile userProfile = this.oldUserProfile;
        if (userProfile != null) {
            List<UpAddress> addresses = userProfile.getAddresses();
            if (addresses == null || addresses.isEmpty()) {
                if (((TextView) _$_findCachedViewById(R$id.user_profile_country)).getText().toString().length() != 0) {
                    z = false;
                }
                if (!z) {
                    UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    copy$default.setCountry(str2);
                    String str3 = RequestTag.CountryRegion;
                    copy$default.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(makeAddress$default(this, true, (String) null, (String) null, (UpAddress) null, 14, (Object) null)));
                    updateUserProfile(copy$default, str3);
                } else {
                    return;
                }
            } else {
                String str4 = RequestTag.CountryRegion;
                if (((TextView) _$_findCachedViewById(R$id.user_profile_country)).getText().toString().length() == 0) {
                    List<UpAddress> addresses2 = userProfile.getAddresses();
                    Intrinsics.checkNotNull(addresses2);
                    String country = addresses2.get(0).getCountry();
                    if (!(country == null || country.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
                List<UpAddress> addresses3 = userProfile.getAddresses();
                Intrinsics.checkNotNull(addresses3);
                if (!Intrinsics.areEqual((Object) str2, (Object) addresses3.get(0).getCountry())) {
                    UserProfile copy$default2 = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                    copy$default2.setCountry(str2);
                    List<UpAddress> addresses4 = userProfile.getAddresses();
                    Intrinsics.checkNotNull(addresses4);
                    copy$default2.setAddresses(CollectionsKt__CollectionsJVMKt.listOf(makeAddress(false, AddressType.COUNTRY_REGION, str2, addresses4.get(0))));
                    updateUserProfile(copy$default2, str4);
                } else {
                    return;
                }
            }
        }
        showOffErrorWord();
    }

    @NotNull
    public final String getDomain() {
        String str = this.domain;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("domain");
        return null;
    }

    @NotNull
    public final String getLanguageTypeString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageType");
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase);
        sb.append(')');
        return sb.toString();
    }

    public final void getPerForR() {
        if (C7585u.m21554c(this, CollectionsKt__CollectionsJVMKt.listOf("android.permission.CAMERA"))) {
            gotoCamera();
            return;
        }
        C7585u l = C7585u.m21560l(this);
        l.mo33042g("android.permission.CAMERA");
        l.mo33043h(new UserProfileActivity$getPerForR$1(this));
    }

    @NotNull
    public Class<AccountViewModel> initViewModelClz() {
        return AccountViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.user_profile_top_title)).setText(getString(R$string.setting_edit_profile));
        String string = getString(R$string.first_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.first_name)");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_first_name)).setText(upperCase);
        ((EditText) _$_findCachedViewById(R$id.user_profile_name)).setHint(((TextView) _$_findCachedViewById(R$id.tv_title_first_name)).getText());
        String string2 = getString(R$string.last_name);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.last_name)");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "ROOT");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_surname)).setText(upperCase2);
        ((EditText) _$_findCachedViewById(R$id.user_profile_surname)).setHint(((TextView) _$_findCachedViewById(R$id.tv_surname)).getText());
        String string3 = getString(R$string.postal_code);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.postal_code)");
        Locale locale3 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale3, "ROOT");
        String upperCase3 = string3.toUpperCase(locale3);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_postal_code)).setText(upperCase3);
        ((EditText) _$_findCachedViewById(R$id.user_profile_postal_code)).setHint(((TextView) _$_findCachedViewById(R$id.tv_postal_code)).getText());
        String string4 = getString(R$string.user_info);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.user_info)");
        Locale locale4 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale4, "ROOT");
        String upperCase4 = string4.toUpperCase(locale4);
        Intrinsics.checkNotNullExpressionValue(upperCase4, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.add_user_info)).setText(upperCase4);
        String string5 = getString(R$string.email);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.email)");
        Locale locale5 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale5, "ROOT");
        String upperCase5 = string5.toUpperCase(locale5);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_title_email)).setText(upperCase5);
        String string6 = getString(R$string.email);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.email)");
        Locale locale6 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale6, "ROOT");
        String upperCase6 = string6.toUpperCase(locale6);
        Intrinsics.checkNotNullExpressionValue(upperCase6, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.user_profile_email)).setText(upperCase6);
        String string7 = getString(R$string.contact_infomation);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.contact_infomation)");
        Locale locale7 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale7, "ROOT");
        String upperCase7 = string7.toUpperCase(locale7);
        Intrinsics.checkNotNullExpressionValue(upperCase7, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_contact_information)).setText(upperCase7);
        String string8 = getString(R$string.setting_house_number);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.setting_house_number)");
        Locale locale8 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale8, "ROOT");
        String upperCase8 = string8.toUpperCase(locale8);
        Intrinsics.checkNotNullExpressionValue(upperCase8, "this as java.lang.String).toUpperCase(locale)");
        ((TextView) _$_findCachedViewById(R$id.tv_number)).setText(upperCase8);
        ((EditText) _$_findCachedViewById(R$id.user_profile_number)).setHint(((TextView) _$_findCachedViewById(R$id.tv_number)).getText());
        initUserPhotoShow();
        getUserProfile();
        requestCheckPassExist(RequestTag.CheckPasswordExistToShowChangePassword);
        if (SPManagerKt.getLanguageId() == 13) {
            ((TextView) _$_findCachedViewById(R$id.tv_title_title)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R$id.ll_title)).setVisibility(8);
        }
    }

    public void languageResult(@NotNull String str, @NotNull String str2, int i) {
        String str3;
        String str4 = str;
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str4, "languageName");
        Intrinsics.checkNotNullParameter(str5, "languageType");
        boolean z = true;
        this.isChangeLanguage = true;
        this.mLanguageName = str4;
        ((TextView) _$_findCachedViewById(R$id.user_profile_language)).setText(Intrinsics.stringPlus(str4, getLanguageTypeString(str5)));
        this.languageCurrentItem = i;
        LoggerUtil.Companion.mo39148i("languageName: " + str4 + ";\t languageCurrentItem: " + this.languageCurrentItem);
        UserProfile userProfile = this.oldUserProfile;
        if (userProfile != null) {
            String language = userProfile.getLanguage();
            if (language == null || language.length() == 0) {
                if (((TextView) _$_findCachedViewById(R$id.user_profile_language)).getText().toString().length() != 0) {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            int indexByLanguageName = LanguageListManager.INSTANCE.getIndexByLanguageName(this.mLanguageName);
            if (indexByLanguageName == -1) {
                str3 = this.mLanguageName;
            } else {
                String str6 = LanguageListManager.INSTANCE.getLanguageTypeList().get(indexByLanguageName);
                Intrinsics.checkNotNullExpressionValue(str6, "LanguageListManager.languageTypeList[index]");
                str3 = str6;
            }
            if (!Intrinsics.areEqual((Object) str3, (Object) userProfile.getLanguage())) {
                UserProfile copy$default = UserProfile.copy$default(userProfile, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (Object) null);
                copy$default.setLanguage(str3);
                updateUserProfile(copy$default, RequestTag.Language);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.net.Uri} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, @org.jetbrains.annotations.Nullable android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = -1
            r1 = 100
            if (r1 != r4) goto L_0x0015
            if (r0 != r5) goto L_0x0099
            android.net.Uri r4 = r3.contentUri
            if (r4 != 0) goto L_0x0010
            goto L_0x0099
        L_0x0010:
            r3.gotoClipActivity(r4)
            goto L_0x0099
        L_0x0015:
            r1 = 101(0x65, float:1.42E-43)
            r2 = 0
            if (r1 != r4) goto L_0x002c
            if (r0 != r5) goto L_0x0099
            if (r6 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            android.net.Uri r2 = r6.getData()
        L_0x0023:
            if (r2 != 0) goto L_0x0027
            goto L_0x0099
        L_0x0027:
            r3.gotoClipActivity(r2)
            goto L_0x0099
        L_0x002c:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r4) goto L_0x0087
            if (r0 != r5) goto L_0x0099
            if (r6 != 0) goto L_0x0036
            r4 = r2
            goto L_0x003a
        L_0x0036:
            android.net.Uri r4 = r6.getData()
        L_0x003a:
            if (r4 != 0) goto L_0x003d
            return
        L_0x003d:
            android.content.ContentResolver r5 = r3.getContentResolver()
            android.graphics.Bitmap r5 = android.provider.MediaStore.Images.Media.getBitmap(r5, r4)
            java.lang.String r6 = "getBitmap(contentResolver, uri)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r3.bitMap = r5
            int r5 = com.hisense.connect_life.app_account.R$id.user_image
            android.view.View r5 = r3._$_findCachedViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.Bitmap r6 = r3.bitMap
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "bitMap"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            goto L_0x005f
        L_0x005e:
            r2 = r6
        L_0x005f:
            r5.setImageBitmap(r2)
            com.hisense.connect_life.core.utils.LoggerUtil$Companion r5 = com.hisense.connect_life.core.utils.LoggerUtil.Companion
            java.lang.String r6 = r4.getPath()
            java.lang.String r0 = "uri.path: "
            java.lang.String r6 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r6)
            r5.mo39146e(r6)
            java.lang.String r4 = r4.getPath()
            if (r4 != 0) goto L_0x0078
            goto L_0x0099
        L_0x0078:
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            com.hisense.connect_life.core.base.BaseViewModel r4 = r3.getMViewModel()
            com.hisense.connect_life.app_account.viewmodel.AccountViewModel r4 = (com.hisense.connect_life.app_account.viewmodel.AccountViewModel) r4
            r4.updateProfilePhoto(r5)
            goto L_0x0099
        L_0x0087:
            r1 = 102(0x66, float:1.43E-43)
            if (r1 != r4) goto L_0x0099
            if (r0 != r5) goto L_0x0099
            if (r6 == 0) goto L_0x0099
            java.lang.String r4 = "userProfile"
            java.io.Serializable r4 = r6.getSerializableExtra(r4)
            com.hisense.connect_life.hismart.networks.request.account.model.UserProfile r4 = (com.hisense.connect_life.hismart.networks.request.account.model.UserProfile) r4
            r3.oldUserProfile = r4
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.app_account.activity.UserProfileActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onEventMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_EVENT);
        if (Intrinsics.areEqual((Object) str, (Object) KeyConst.DeleteAccount)) {
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 4165) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    showString("Permission request failed!");
                } else {
                    goToSettings();
                }
            } else if (this.isTakePhoto) {
                getPerForR();
            } else {
                gotoPhoto();
            }
        }
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.user_profile_top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "user_profile_top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new UserProfileActivity$setListeners$1(this));
        CardView cardView = (CardView) _$_findCachedViewById(R$id.user_card_view);
        Intrinsics.checkNotNullExpressionValue(cardView, "user_card_view");
        JuConnectExtKt.singleClickListener(cardView, new UserProfileActivity$setListeners$2(this));
        this.getHeadPicPopupWindow.addGetHeadPicPopupWindowClickListener(new UserProfileActivity$setListeners$3(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_title);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_title");
        JuConnectExtKt.singleClickListener(linearLayout, new UserProfileActivity$setListeners$4(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_name)).setOnFocusChangeListener(new C7256x(this));
        EditText editText = (EditText) _$_findCachedViewById(R$id.user_profile_name);
        Intrinsics.checkNotNullExpressionValue(editText, "user_profile_name");
        editText.addTextChangedListener(new UserProfileActivity$setListeners$$inlined$doAfterTextChanged$1(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_surname)).setOnFocusChangeListener(new C7224p(this));
        EditText editText2 = (EditText) _$_findCachedViewById(R$id.user_profile_surname);
        Intrinsics.checkNotNullExpressionValue(editText2, "user_profile_surname");
        editText2.addTextChangedListener(new UserProfileActivity$setListeners$$inlined$doAfterTextChanged$2(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_phone)).setOnFocusChangeListener(new C7176d(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_street)).setOnFocusChangeListener(new C7227p2(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_number)).setOnFocusChangeListener(new C7231q2(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_postal_code)).setOnFocusChangeListener(new C7179d2(this));
        ((EditText) _$_findCachedViewById(R$id.user_profile_city)).setOnFocusChangeListener(new C7207k2(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.user_profile_country);
        Intrinsics.checkNotNullExpressionValue(textView, "user_profile_country");
        JuConnectExtKt.singleClickListener(textView, new UserProfileActivity$setListeners$14(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.user_profile_language);
        Intrinsics.checkNotNullExpressionValue(textView2, "user_profile_language");
        JuConnectExtKt.singleClickListener(textView2, new UserProfileActivity$setListeners$15(this));
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.rl_preferences);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "rl_preferences");
        JuConnectExtKt.singleClickListener(linearLayout2, new UserProfileActivity$setListeners$16(this));
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.rl_change_pwd);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rl_change_pwd");
        JuConnectExtKt.singleClickListener(relativeLayout, new UserProfileActivity$setListeners$17(this));
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R$id.lly_delete_account);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "lly_delete_account");
        JuConnectExtKt.singleClickListener(relativeLayout2, new UserProfileActivity$setListeners$18(this));
    }

    public void subscribeObservable() {
        super.subscribeObservable(true);
        ((AccountViewModel) getMViewModel()).getCheckPassLiveData().observe(this, new C7219n2(this));
        ((AccountViewModel) getMViewModel()).getQueryUpLiveData().observe(this, new C7223o2(this));
        ((AccountViewModel) getMViewModel()).getUpdateUpLiveData().observe(this, new C7173c0(this));
        ((AccountViewModel) getMViewModel()).getRegionByLangLiveData().observe(this, new C7267z2(this));
        ((AccountViewModel) getMViewModel()).getUpdateProfilePhotoLiveData().observe(this, new C7266z1(this));
        ((AccountViewModel) getMViewModel()).getDeleteAccountLiveData().observe(this, new C7248v(this));
    }
}
