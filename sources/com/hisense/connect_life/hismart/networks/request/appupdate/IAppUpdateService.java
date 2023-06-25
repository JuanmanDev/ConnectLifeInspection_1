package com.hisense.connect_life.hismart.networks.request.appupdate;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH&¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/appupdate/IAppUpdateService;", "", "getAppPolicy", "Lio/reactivex/disposables/Disposable;", "versionCode", "", "appLanguage", "appId", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppPolicyModel;", "", "failure", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IAppUpdateService.kt */
public interface IAppUpdateService {
    @NotNull
    C9207b getAppPolicy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super AppPolicyModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
