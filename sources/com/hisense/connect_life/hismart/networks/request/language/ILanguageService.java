package com.hisense.connect_life.hismart.networks.request.language;

import com.hisense.connect_life.hismart.networks.request.language.model.LanguageId;
import com.hisense.connect_life.hismart.networks.request.language.model.RegionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H&J@\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H&J8\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/language/ILanguageService;", "", "getDefaultLanguage", "Lio/reactivex/disposables/Disposable;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/LanguageId;", "", "failure", "", "getRegionByLang", "languageId", "", "token", "Lcom/hisense/connect_life/hismart/networks/request/language/model/RegionResult;", "setDefaultLanguage", "defaultLanguageId", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ILanguageService.kt */
public interface ILanguageService {
    @NotNull
    C9207b getDefaultLanguage(@NotNull Function1<? super LanguageId, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getRegionByLang(@NotNull String str, @NotNull String str2, @NotNull Function1<? super RegionResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b setDefaultLanguage(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
