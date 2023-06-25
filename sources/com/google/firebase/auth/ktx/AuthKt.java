package com.google.firebase.auth.ktx;

import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.C6363e;

@Metadata(mo47990d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a-\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a%\u0010\u0016\u001a\u00020\u00172\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001b"}, mo47991d2 = {"LIBRARY_NAME", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "Lcom/google/firebase/ktx/Firebase;", "getAuth", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/auth/FirebaseAuth;", "actionCodeSettings", "Lcom/google/firebase/auth/ActionCodeSettings;", "init", "Lkotlin/Function1;", "Lcom/google/firebase/auth/ActionCodeSettings$Builder;", "", "Lkotlin/ExtensionFunctionType;", "oAuthCredential", "Lcom/google/firebase/auth/AuthCredential;", "providerId", "Lcom/google/firebase/auth/OAuthProvider$CredentialBuilder;", "oAuthProvider", "Lcom/google/firebase/auth/OAuthProvider;", "firebaseAuth", "Lcom/google/firebase/auth/OAuthProvider$Builder;", "userProfileChangeRequest", "Lcom/google/firebase/auth/UserProfileChangeRequest;", "Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;", "app", "Lcom/google/firebase/FirebaseApp;", "java.com.google.android.libraries.firebase.firebase_auth_ktx_granule"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.firebase:firebase-auth-ktx@@21.1.0 */
public final class AuthKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-auth-ktx";

    @NotNull
    public static final ActionCodeSettings actionCodeSettings(@NotNull Function1<? super ActionCodeSettings.C8247a, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "init");
        ActionCodeSettings.C8247a V = ActionCodeSettings.m22589V();
        Intrinsics.checkNotNullExpressionValue(V, "newBuilder()");
        function1.invoke(V);
        ActionCodeSettings a = V.mo37313a();
        Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
        return a;
    }

    @NotNull
    public static final FirebaseAuth auth(@NotNull Firebase firebase, @NotNull C6331h hVar) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(hVar, "app");
        FirebaseAuth instance = FirebaseAuth.getInstance(hVar);
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(app)");
        return instance;
    }

    @NotNull
    public static final FirebaseAuth getAuth(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseAuth instance = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance()");
        return instance;
    }

    @NotNull
    public static final AuthCredential oAuthCredential(@NotNull String str, @NotNull Function1<? super C6363e.C6365b, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "providerId");
        Intrinsics.checkNotNullParameter(function1, "init");
        C6363e.C6365b c = C6363e.m17885c(str);
        Intrinsics.checkNotNullExpressionValue(c, "newCredentialBuilder(providerId)");
        function1.invoke(c);
        AuthCredential a = c.mo30454a();
        Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
        return a;
    }

    @NotNull
    public static final C6363e oAuthProvider(@NotNull String str, @NotNull Function1<? super C6363e.C6364a, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "providerId");
        Intrinsics.checkNotNullParameter(function1, "init");
        C6363e.C6364a a = C6363e.m17883a(str);
        Intrinsics.checkNotNullExpressionValue(a, "newBuilder(providerId)");
        function1.invoke(a);
        C6363e a2 = a.mo30453a();
        Intrinsics.checkNotNullExpressionValue(a2, "builder.build()");
        return a2;
    }

    @NotNull
    public static final UserProfileChangeRequest userProfileChangeRequest(@NotNull Function1<? super UserProfileChangeRequest.C8250a, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "init");
        UserProfileChangeRequest.C8250a aVar = new UserProfileChangeRequest.C8250a();
        function1.invoke(aVar);
        UserProfileChangeRequest a = aVar.mo37386a();
        Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
        return a;
    }

    @NotNull
    public static final C6363e oAuthProvider(@NotNull String str, @NotNull FirebaseAuth firebaseAuth, @NotNull Function1<? super C6363e.C6364a, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "providerId");
        Intrinsics.checkNotNullParameter(firebaseAuth, "firebaseAuth");
        Intrinsics.checkNotNullParameter(function1, "init");
        C6363e.C6364a b = C6363e.m17884b(str, firebaseAuth);
        Intrinsics.checkNotNullExpressionValue(b, "newBuilder(providerId, firebaseAuth)");
        function1.invoke(b);
        C6363e a = b.mo30453a();
        Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
        return a;
    }
}
