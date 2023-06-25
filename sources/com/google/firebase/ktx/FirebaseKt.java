package com.google.firebase.ktx;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.C6338j;

@Metadata(mo47990d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b\u001a\"\u0010\f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo47991d2 = {"LIBRARY_NAME", "", "app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/ktx/Firebase;", "getApp", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseApp;", "options", "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseOptions;", "name", "initialize", "context", "Landroid/content/Context;", "com.google.firebase-firebase-common-ktx"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Firebase.kt */
public final class FirebaseKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-core-ktx";

    @NotNull
    public static final C6331h app(@NotNull Firebase firebase, @NotNull String str) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        C6331h m = C6331h.m17786m(str);
        Intrinsics.checkNotNullExpressionValue(m, "getInstance(name)");
        return m;
    }

    @NotNull
    public static final C6331h getApp(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        C6331h l = C6331h.m17785l();
        Intrinsics.checkNotNullExpressionValue(l, "getInstance()");
        return l;
    }

    @NotNull
    public static final C6338j getOptions(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        C6338j o = getApp(Firebase.INSTANCE).mo30406o();
        Intrinsics.checkNotNullExpressionValue(o, "Firebase.app.options");
        return o;
    }

    @Nullable
    public static final C6331h initialize(@NotNull Firebase firebase, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return C6331h.m17787r(context);
    }

    @NotNull
    public static final C6331h initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull C6338j jVar) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jVar, "options");
        C6331h s = C6331h.m17788s(context, jVar);
        Intrinsics.checkNotNullExpressionValue(s, "initializeApp(context, options)");
        return s;
    }

    @NotNull
    public static final C6331h initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull C6338j jVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jVar, "options");
        Intrinsics.checkNotNullParameter(str, "name");
        C6331h t = C6331h.m17789t(context, jVar, str);
        Intrinsics.checkNotNullExpressionValue(t, "initializeApp(context, options, name)");
        return t;
    }
}
