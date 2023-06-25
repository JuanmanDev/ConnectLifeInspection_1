package com.hisense.connect_life.app_account.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3254b;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginForAmazonUtils;", "", "()V", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ThirdLoginForAmazonUtils.kt */
public final class ThirdLoginForAmazonUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int OPEN_THIRD_LOGIN_AMAZON = 9002;
    public static C3254b googleSignInClient = null;
    @NotNull
    public static final String thirdType = "AMAZON";

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginForAmazonUtils$Companion;", "", "()V", "OPEN_THIRD_LOGIN_AMAZON", "", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "thirdType", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThirdLoginForAmazonUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C3254b getGoogleSignInClient() {
            C3254b bVar = ThirdLoginForAmazonUtils.googleSignInClient;
            if (bVar != null) {
                return bVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("googleSignInClient");
            return null;
        }

        public final void setGoogleSignInClient(@NotNull C3254b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            ThirdLoginForAmazonUtils.googleSignInClient = bVar;
        }
    }
}
