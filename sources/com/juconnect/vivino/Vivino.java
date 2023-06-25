package com.juconnect.vivino;

import android.app.Application;
import android.content.Context;
import com.hisense.connect_life.core.global.KeyConst;
import com.juconnect.vivino.global.UrlConstKt;
import com.juconnect.vivino.model.EnvType;
import com.juconnect.vivino.model.HiVintage;
import com.juconnect.vivino.service.IVivinoLabelService;
import com.juconnect.vivino.service.VivinoLabelServiceImpl;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/vivino/Vivino;", "", "()V", "Companion", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Vivino.kt */
public final class Vivino {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @NotNull
    public static final String SP_ACCESS_TOKEN = "vivino_access_token";
    @NotNull
    public static final String SP_EXPIRES = "vivino_expires";
    @NotNull
    public static final String SP_EXPIRES_IN = "vivino_expires_in";
    @NotNull
    public static final String SP_NAME = "vivino";
    @NotNull
    public static final String SP_TOKEN_TYPE = "vivino_token_type";
    @Nullable
    public static Application application;
    public static String clientId;
    public static String clientSecret;
    @Nullable
    public static String urlHost;
    @Nullable
    public static IVivinoLabelService vivinoLabelService;

    @Metadata(mo47990d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0002J&\u0010\u001a\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J:\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00160\u0014J\r\u0010\u001f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b J\r\u0010!\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%J\r\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0002\b'J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, mo47991d2 = {"Lcom/juconnect/vivino/Vivino$Companion;", "", "()V", "SP_ACCESS_TOKEN", "", "SP_EXPIRES", "SP_EXPIRES_IN", "SP_NAME", "SP_TOKEN_TYPE", "application", "Landroid/app/Application;", "clientId", "clientSecret", "urlHost", "vivinoLabelService", "Lcom/juconnect/vivino/service/IVivinoLabelService;", "getVivinoInfoByVivinoId", "Lio/reactivex/disposables/Disposable;", "vivinoId", "success", "Lkotlin/Function1;", "Lcom/juconnect/vivino/model/HiVintage;", "", "error", "", "getVivinoLabelService", "init", "env", "scanLabel", "file", "Ljava/io/File;", "shareClientId", "shareClientId$vivino_release", "shareClientSecret", "shareClientSecret$vivino_release", "shareContext", "Landroid/content/Context;", "shareContext$vivino_release", "shareUrlHost", "shareUrlHost$vivino_release", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Vivino.kt */
    public static final class Companion {

        @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
        /* compiled from: Vivino.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnvType.values().length];
                iArr[EnvType.TEST.ordinal()] = 1;
                iArr[EnvType.DEV.ordinal()] = 2;
                iArr[EnvType.PRODUCTION.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final IVivinoLabelService getVivinoLabelService() {
            if (Vivino.vivinoLabelService == null) {
                synchronized (Vivino.class) {
                    Vivino.Companion.vivinoLabelService();
                }
            }
            IVivinoLabelService access$getVivinoLabelService$cp = Vivino.vivinoLabelService;
            if (access$getVivinoLabelService$cp != null) {
                return access$getVivinoLabelService$cp;
            }
            throw new Exception("The vivinoLabelService for the vivino isn't initialized!");
        }

        private final IVivinoLabelService vivinoLabelService() {
            return new VivinoLabelServiceImpl();
        }

        @NotNull
        public final C9207b getVivinoInfoByVivinoId(@NotNull String str, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
            Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
            Intrinsics.checkNotNullParameter(function1, "success");
            Intrinsics.checkNotNullParameter(function12, "error");
            return getVivinoLabelService().getVivinoInfoByVivinoId(str, function1, function12);
        }

        public final void init(@NotNull Application application, @NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(str, "env");
            Intrinsics.checkNotNullParameter(str2, "clientId");
            Intrinsics.checkNotNullParameter(str3, "clientSecret");
            Vivino.application = application;
            int i = WhenMappings.$EnumSwitchMapping$0[EnvType.Companion.fromString(str).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                Vivino.urlHost = UrlConstKt.URL_HOST_PRODUCTION;
                Vivino.clientId = str2;
                Vivino.clientSecret = str3;
                Vivino.vivinoLabelService = vivinoLabelService();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final C9207b scanLabel(@NotNull File file, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(function1, "success");
            Intrinsics.checkNotNullParameter(function12, "error");
            return getVivinoLabelService().scanLabel(file, function1, function12);
        }

        @NotNull
        public final String shareClientId$vivino_release() {
            String access$getClientId$cp = Vivino.clientId;
            if (access$getClientId$cp != null) {
                return access$getClientId$cp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("clientId");
            return null;
        }

        @NotNull
        public final String shareClientSecret$vivino_release() {
            String access$getClientSecret$cp = Vivino.clientSecret;
            if (access$getClientSecret$cp != null) {
                return access$getClientSecret$cp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("clientSecret");
            return null;
        }

        @NotNull
        public final Context shareContext$vivino_release() {
            Application access$getApplication$cp = Vivino.application;
            Context applicationContext = access$getApplication$cp == null ? null : access$getApplication$cp.getApplicationContext();
            if (applicationContext != null) {
                return applicationContext;
            }
            throw new Exception("The context for the vivino isn't initialized!");
        }

        @NotNull
        public final String shareUrlHost$vivino_release() {
            String access$getUrlHost$cp = Vivino.urlHost;
            if (access$getUrlHost$cp != null) {
                return access$getUrlHost$cp;
            }
            throw new Exception("The context for the vivino isn't initialized!");
        }
    }
}
