package com.hisense.connect_life.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.multilingual.MultiLanguageUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.p598o.C9206a;
import p553f.p594c.p598o.C9207b;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo47990d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H$J\b\u0010\u0011\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H$J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J\u001e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u001e\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J-\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00102\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0%2\u0006\u0010&\u001a\u00020'H\u0016¢\u0006\u0002\u0010(J\u001a\u0010)\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010*\u001a\u00020\fH$J\u0010\u0010+\u001a\u00020\f2\b\b\u0001\u0010,\u001a\u00020\u0010J\u000e\u0010+\u001a\u00020\f2\u0006\u0010-\u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006."}, mo47991d2 = {"Lcom/hisense/connect_life/core/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlinx/coroutines/CoroutineScope;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "addDisposable", "", "disposable", "Lio/reactivex/disposables/Disposable;", "bindLayout", "", "initData", "initWidgets", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "perms", "", "", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "setListeners", "showString", "resourcesId", "string", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BaseFragment.kt */
public abstract class BaseFragment extends Fragment implements CoroutineScope, EasyPermissions.PermissionCallbacks {
    public final /* synthetic */ CoroutineScope $$delegate_0 = CoroutineScopeKt.MainScope();
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final C9206a compositeDisposable = new C9206a();

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

    public final void addDisposable(@NotNull C9207b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "disposable");
        this.compositeDisposable.mo47027b(bVar);
    }

    public abstract int bindLayout();

    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public void initData() {
    }

    public abstract void initWidgets(@NotNull View view);

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(bindLayout(), viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.compositeDisposable.mo47031f()) {
            this.compositeDisposable.dispose();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        initData();
        initWidgets(view);
        setListeners();
    }

    public abstract void setListeners();

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
}
