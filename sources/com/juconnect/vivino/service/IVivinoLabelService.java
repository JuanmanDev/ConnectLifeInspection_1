package com.juconnect.vivino.service;

import com.juconnect.vivino.model.HiVintage;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J<\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&¨\u0006\u000f"}, mo47991d2 = {"Lcom/juconnect/vivino/service/IVivinoLabelService;", "", "getVivinoInfoByVivinoId", "Lio/reactivex/disposables/Disposable;", "vivinoId", "", "success", "Lkotlin/Function1;", "Lcom/juconnect/vivino/model/HiVintage;", "", "error", "", "scanLabel", "file", "Ljava/io/File;", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IVivinoLabelService.kt */
public interface IVivinoLabelService {
    @NotNull
    C9207b getVivinoInfoByVivinoId(@NotNull String str, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b scanLabel(@NotNull File file, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
