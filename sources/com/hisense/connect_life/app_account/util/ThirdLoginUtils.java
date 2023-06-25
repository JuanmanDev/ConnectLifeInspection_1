package com.hisense.connect_life.app_account.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.hisense.connect_life.app_account.R$string;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1527w;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3254b;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginUtils;", "", "()V", "Companion", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ThirdLoginUtils.kt */
public final class ThirdLoginUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int RC_SIGN_IN_GOOGLE = ThirdLoginForGoogleUtils.OPEN_THIRD_LOGIN_GOOGLE;
    public static FirebaseAuth firebaseAuth;
    public static C3254b googleSignInClient;

    @Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginUtils$Companion;", "", "()V", "RC_SIGN_IN_GOOGLE", "", "getRC_SIGN_IN_GOOGLE", "()I", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "googleSignIn", "", "activity", "Landroid/app/Activity;", "googleSignOut", "initGoogleSignInfo", "context", "Landroid/content/Context;", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThirdLoginUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FirebaseAuth getFirebaseAuth() {
            FirebaseAuth firebaseAuth = ThirdLoginUtils.firebaseAuth;
            if (firebaseAuth != null) {
                return firebaseAuth;
            }
            Intrinsics.throwUninitializedPropertyAccessException("firebaseAuth");
            return null;
        }

        @NotNull
        public final C3254b getGoogleSignInClient() {
            C3254b bVar = ThirdLoginUtils.googleSignInClient;
            if (bVar != null) {
                return bVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("googleSignInClient");
            return null;
        }

        public final int getRC_SIGN_IN_GOOGLE() {
            return ThirdLoginUtils.RC_SIGN_IN_GOOGLE;
        }

        public final void googleSignIn(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            Intent p = getGoogleSignInClient().mo20278p();
            Intrinsics.checkNotNullExpressionValue(p, "googleSignInClient.signInIntent");
            activity.startActivityForResult(p, getRC_SIGN_IN_GOOGLE());
        }

        public final void googleSignOut() {
            getGoogleSignInClient().mo20280r();
        }

        public final void initGoogleSignInfo(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            GoogleSignInOptions.C4069a aVar = new GoogleSignInOptions.C4069a(GoogleSignInOptions.f8106u);
            aVar.mo24448d(C1527w.m1063b(R$string.server_client_id));
            aVar.mo24446b();
            GoogleSignInOptions a = aVar.mo24445a();
            Intrinsics.checkNotNullExpressionValue(a, "Builder(GoogleSignInOpti…\n                .build()");
            C3254b a2 = C3253a.m8295a(context, a);
            Intrinsics.checkNotNullExpressionValue(a2, "getClient(context, gso)");
            setGoogleSignInClient(a2);
            FirebaseAuth instance = FirebaseAuth.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance()");
            setFirebaseAuth(instance);
        }

        public final void setFirebaseAuth(@NotNull FirebaseAuth firebaseAuth) {
            Intrinsics.checkNotNullParameter(firebaseAuth, "<set-?>");
            ThirdLoginUtils.firebaseAuth = firebaseAuth;
        }

        public final void setGoogleSignInClient(@NotNull C3254b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            ThirdLoginUtils.googleSignInClient = bVar;
        }
    }
}
