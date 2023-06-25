package com.hisense.connect_life.core.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.R$color;
import com.hisense.connect_life.core.R$layout;
import com.hisense.connect_life.core.R$style;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p430a.p436b.p437b.C7285d;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H$J\u0006\u0010\u0019\u001a\u00020\u000eJ\b\u0010\u001a\u001a\u00020\u000eH\u0014J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH$J\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u000eH\u0014J\u001e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\u001e\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J-\u0010'\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00182\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0)2\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010.\u001a\u00020\u0018H\u0004J\b\u0010/\u001a\u00020\u000eH$J\u0016\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\"\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u0002022\b\b\u0002\u00105\u001a\u00020%2\b\b\u0002\u00103\u001a\u000204J\u0010\u00106\u001a\u00020\u000e2\b\b\u0001\u00107\u001a\u00020\u0018J\u000e\u00106\u001a\u00020\u000e2\u0006\u00108\u001a\u00020%R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lkotlinx/coroutines/CoroutineScope;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "mAlertDialog", "Landroidx/appcompat/app/AlertDialog;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "applyOverrideConfiguration", "overrideConfiguration", "Landroid/content/res/Configuration;", "attachBaseContext", "newBase", "Landroid/content/Context;", "bindLayout", "", "dismissProgressDialog", "initData", "initStatus", "initWidgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "perms", "", "", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "registerBack", "backId", "setListeners", "showProgressDialog", "context", "Landroidx/fragment/app/FragmentActivity;", "cancelable", "", "tip", "showString", "resourcesId", "string", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseActivity.kt */
public abstract class BaseActivity extends AppCompatActivity implements CoroutineScope, EasyPermissions.PermissionCallbacks {
    public final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final C9206a compositeDisposable = new C9206a();
    @Nullable
    public AlertDialog mAlertDialog;

    private final void initStatus() {
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R$color.colorWhite));
        }
    }

    /* renamed from: registerBack$lambda-0  reason: not valid java name */
    public static final void m26920registerBack$lambda0(BaseActivity baseActivity, View view) {
        Intrinsics.checkNotNullParameter(baseActivity, "this$0");
        baseActivity.finish();
    }

    public static /* synthetic */ void showProgressDialog$default(BaseActivity baseActivity, FragmentActivity fragmentActivity, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = true;
            }
            baseActivity.showProgressDialog(fragmentActivity, str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressDialog");
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

    public final void addDisposable(@NotNull C9207b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "disposable");
        this.compositeDisposable.mo47027b(bVar);
    }

    public void applyOverrideConfiguration(@Nullable Configuration configuration) {
        if (configuration != null) {
            int i = configuration.uiMode;
            configuration.setTo(getBaseContext().getResources().getConfiguration());
            configuration.uiMode = i;
        }
        super.applyOverrideConfiguration(configuration);
    }

    public void attachBaseContext(@Nullable Context context) {
        Locale locale;
        if (SPManagerKt.getLanguageType().length() > 0) {
            MultiLanguageUtil multiLanguageUtil = MultiLanguageUtil.INSTANCE;
            Intrinsics.checkNotNull(context);
            Context attachBaseContext = multiLanguageUtil.attachBaseContext(context);
            Configuration configuration = attachBaseContext.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(Locale.ENGLISH, "ENGLISH");
            if (Intrinsics.areEqual((Object) SPManagerKt.getLanguageType(), (Object) LanguageConstKt.sr_BA)) {
                locale = new Locale("sr", "BA");
            } else {
                locale = new Locale(SPManagerKt.getLanguageType());
            }
            configuration.setLocale(locale);
            super.attachBaseContext(new BaseActivity$attachBaseContext$wrappedContext$1(attachBaseContext, configuration, R$style.Theme_AppCompat_Light_NoActionBar));
            return;
        }
        Intrinsics.checkNotNull(context);
        super.attachBaseContext(context);
    }

    public abstract int bindLayout();

    public final void dismissProgressDialog() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.mAlertDialog;
        if (alertDialog2 != null) {
            Intrinsics.checkNotNull(alertDialog2);
            if (alertDialog2.isShowing() && (alertDialog = this.mAlertDialog) != null) {
                alertDialog.dismiss();
            }
        }
    }

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public void initData() {
    }

    public abstract void initWidgets();

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(bindLayout());
        C1337a.m211c().mo15012e(this);
        initStatus();
        initData();
        initWidgets();
        setListeners();
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.compositeDisposable.mo47031f()) {
            this.compositeDisposable.dispose();
        }
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
    }

    public void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        EasyPermissions.m26770d(i, strArr, iArr, this);
    }

    public final void registerBack(@IdRes int i) {
        findViewById(i).setOnClickListener(new C7285d(this));
    }

    public abstract void setListeners();

    public final void showProgressDialog(@NotNull FragmentActivity fragmentActivity, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intrinsics.checkNotNullParameter(str, "tip");
        try {
            if (this.mAlertDialog != null) {
                AlertDialog alertDialog = this.mAlertDialog;
                Intrinsics.checkNotNull(alertDialog);
                if (alertDialog.isShowing()) {
                    return;
                }
            }
            if (this.mAlertDialog == null) {
                this.mAlertDialog = new AlertDialog.Builder(fragmentActivity, R$style.ProgressDialog).create();
            }
            View inflate = fragmentActivity.getLayoutInflater().inflate(R$layout.fragment_loading_dialog, (ViewGroup) null);
            AlertDialog alertDialog2 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog2);
            alertDialog2.setView(inflate, 0, 0, 0, 0);
            AlertDialog alertDialog3 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog3);
            alertDialog3.setCanceledOnTouchOutside(z);
            AlertDialog alertDialog4 = this.mAlertDialog;
            Intrinsics.checkNotNull(alertDialog4);
            alertDialog4.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void showString(@StringRes int i) {
        MultiLanguageUtil.INSTANCE.getConfigLocale();
        ToastUtils o = ToastUtils.m9596o();
        o.mo21601s("dark");
        o.mo21603w(getString(i), new Object[0]);
    }

    public final void showString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        ToastUtils o = ToastUtils.m9596o();
        o.mo21601s("dark");
        o.mo21603w(str, new Object[0]);
    }

    public final void showProgressDialog(@NotNull FragmentActivity fragmentActivity, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        showProgressDialog(fragmentActivity, "", z);
    }
}
