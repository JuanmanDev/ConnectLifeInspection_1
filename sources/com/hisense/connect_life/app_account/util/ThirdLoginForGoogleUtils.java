package com.hisense.connect_life.app_account.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.AuthKt;
import com.google.firebase.ktx.Firebase;
import com.hisense.connect_life.app_account.R$string;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3253a;
import p040c.p200q.p201a.p264c.p267b.p268a.p273h.C3254b;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p429r.p430a.p431a.p433c.C7268a;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginForGoogleUtils;", "", "()V", "Companion", "LogoutListener", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ThirdLoginForGoogleUtils.kt */
public final class ThirdLoginForGoogleUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int OPEN_THIRD_LOGIN_GOOGLE = 9001;
    public static FirebaseAuth firebaseAuth = null;
    public static C3254b googleSignInClient = null;
    @NotNull
    public static final String thirdType = "GOOGLE";

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginForGoogleUtils$LogoutListener;", "", "onLogoutResult", "", "var1", "", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThirdLoginForGoogleUtils.kt */
    public interface LogoutListener {
        void onLogoutResult(boolean z);
    }

    @Metadata(mo47990d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ$\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a\u0018\u00010 J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012XT¢\u0006\u0002\n\u0000¨\u0006\""}, mo47991d2 = {"Lcom/hisense/connect_life/app_account/util/ThirdLoginForGoogleUtils$Companion;", "", "()V", "OPEN_THIRD_LOGIN_GOOGLE", "", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "setGoogleSignInClient", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;)V", "thirdType", "", "checkUserLogin", "", "context", "Landroid/content/Context;", "getCurrentUser", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "initGoogleLogin", "", "onActivityResult", "signOut", "activity", "Landroid/app/Activity;", "callBack", "Lkotlin/Function1;", "thirdLogin", "app_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ThirdLoginForGoogleUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: signOut$lambda-0  reason: not valid java name */
        public static final void m26908signOut$lambda0(Function1 function1, C5771j jVar) {
            Intrinsics.checkNotNullParameter(jVar, LanguageConstKt.f15954it);
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(jVar.mo28856q()));
            }
        }

        public final boolean checkUserLogin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getCurrentUser(context) != null;
        }

        @Nullable
        public final GoogleSignInAccount getCurrentUser(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return C3253a.m8296b(context);
        }

        @NotNull
        public final FirebaseAuth getFirebaseAuth() {
            FirebaseAuth firebaseAuth = ThirdLoginForGoogleUtils.firebaseAuth;
            if (firebaseAuth != null) {
                return firebaseAuth;
            }
            Intrinsics.throwUninitializedPropertyAccessException("firebaseAuth");
            return null;
        }

        @NotNull
        public final C3254b getGoogleSignInClient() {
            C3254b bVar = ThirdLoginForGoogleUtils.googleSignInClient;
            if (bVar != null) {
                return bVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("googleSignInClient");
            return null;
        }

        public final void initGoogleLogin(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            GoogleSignInOptions.C4069a aVar = new GoogleSignInOptions.C4069a(GoogleSignInOptions.f8106u);
            aVar.mo24448d(context.getString(R$string.server_client_id));
            aVar.mo24446b();
            GoogleSignInOptions a = aVar.mo24445a();
            Intrinsics.checkNotNullExpressionValue(a, "Builder(GoogleSignInOpti…                 .build()");
            C3254b a2 = C3253a.m8295a(context, a);
            Intrinsics.checkNotNullExpressionValue(a2, "getClient(context, gso)");
            setGoogleSignInClient(a2);
            setFirebaseAuth(AuthKt.getAuth(Firebase.INSTANCE));
        }

        public final void onActivityResult() {
        }

        public final void setFirebaseAuth(@NotNull FirebaseAuth firebaseAuth) {
            Intrinsics.checkNotNullParameter(firebaseAuth, "<set-?>");
            ThirdLoginForGoogleUtils.firebaseAuth = firebaseAuth;
        }

        public final void setGoogleSignInClient(@NotNull C3254b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            ThirdLoginForGoogleUtils.googleSignInClient = bVar;
        }

        public final void signOut(@NotNull Activity activity, @Nullable Function1<? super Boolean, Unit> function1) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            getFirebaseAuth().mo37333h();
            getGoogleSignInClient().mo20280r().mo28841b(activity, new C7268a(function1));
        }

        public final void thirdLogin(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "context");
            Intent p = getGoogleSignInClient().mo20278p();
            Intrinsics.checkNotNullExpressionValue(p, "googleSignInClient.signInIntent");
            p.setFlags(536870912);
            activity.startActivityForResult(p, ThirdLoginForGoogleUtils.OPEN_THIRD_LOGIN_GOOGLE);
        }

        public final void signOut(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            signOut(activity, (Function1<? super Boolean, Unit>) null);
        }
    }
}
