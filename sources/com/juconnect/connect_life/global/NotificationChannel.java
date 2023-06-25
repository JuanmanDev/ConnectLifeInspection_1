package com.juconnect.connect_life.global;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connect_life/global/NotificationChannel;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationChannel.kt */
public final class NotificationChannel {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static C9017j methodChannel;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connect_life/global/NotificationChannel$Companion;", "", "()V", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "getMethodChannel", "()Lio/flutter/plugin/common/MethodChannel;", "setMethodChannel", "(Lio/flutter/plugin/common/MethodChannel;)V", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: NotificationChannel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final C9017j getMethodChannel() {
            return NotificationChannel.methodChannel;
        }

        public final void setMethodChannel(@Nullable C9017j jVar) {
            NotificationChannel.methodChannel = jVar;
        }
    }
}
