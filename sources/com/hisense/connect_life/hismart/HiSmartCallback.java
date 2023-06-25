package com.hisense.connect_life.hismart;

import com.hisense.connect_life.hismart.model.FailureBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u001a\u0010\u0010\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/HiSmartCallback;", "T", "", "()V", "onFailure", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/model/FailureBean;", "", "getOnFailure$hismart_account_release", "()Lkotlin/jvm/functions/Function1;", "setOnFailure$hismart_account_release", "(Lkotlin/jvm/functions/Function1;)V", "onSuccess", "getOnSuccess$hismart_account_release", "setOnSuccess$hismart_account_release", "failure", "success", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiSmartCallback.kt */
public final class HiSmartCallback<T> {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public Function1<? super FailureBean, Unit> onFailure;
    @Nullable
    public Function1<? super T, Unit> onSuccess;

    @Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/HiSmartCallback$Companion;", "", "()V", "create", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "T", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiSmartCallback.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> HiSmartCallback<T> create(@NotNull Function1<? super HiSmartCallback<T>, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "init");
            HiSmartCallback<T> hiSmartCallback = new HiSmartCallback<>();
            function1.invoke(hiSmartCallback);
            return hiSmartCallback;
        }
    }

    public final void failure(@NotNull Function1<? super FailureBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onFailure");
        this.onFailure = function1;
    }

    @Nullable
    public final Function1<FailureBean, Unit> getOnFailure$hismart_account_release() {
        return this.onFailure;
    }

    @Nullable
    public final Function1<T, Unit> getOnSuccess$hismart_account_release() {
        return this.onSuccess;
    }

    public final void setOnFailure$hismart_account_release(@Nullable Function1<? super FailureBean, Unit> function1) {
        this.onFailure = function1;
    }

    public final void setOnSuccess$hismart_account_release(@Nullable Function1<? super T, Unit> function1) {
        this.onSuccess = function1;
    }

    public final void success(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onSuccess");
        this.onSuccess = function1;
    }
}
