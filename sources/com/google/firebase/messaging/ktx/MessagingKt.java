package com.google.firebase.messaging.ktx;

import androidx.core.net.MailTo;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u000f"}, mo47991d2 = {"LIBRARY_NAME", "", "messaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/ktx/Firebase;", "getMessaging", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "to", "init", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-messaging-ktx"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: Messaging.kt */
public final class MessagingKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-fcm-ktx";

    @NotNull
    public static final FirebaseMessaging getMessaging(@NotNull Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseMessaging f = FirebaseMessaging.m23019f();
        Intrinsics.checkNotNullExpressionValue(f, "getInstance()");
        return f;
    }

    @NotNull
    public static final RemoteMessage remoteMessage(@NotNull String str, @NotNull Function1<? super RemoteMessage.C8295a, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, MailTo.f233TO);
        Intrinsics.checkNotNullParameter(function1, "init");
        RemoteMessage.C8295a aVar = new RemoteMessage.C8295a(str);
        function1.invoke(aVar);
        RemoteMessage a = aVar.mo37478a();
        Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
        return a;
    }
}
