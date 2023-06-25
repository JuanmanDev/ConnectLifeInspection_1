package com.hisense.connect_life.hismart.networks.request.clife;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/clife/IClifeService;", "", "getUserData", "Lio/reactivex/disposables/Disposable;", "success", "Lkotlin/Function1;", "", "", "failure", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IClifeService.kt */
public interface IClifeService {
    @NotNull
    C9207b getUserData(@NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
