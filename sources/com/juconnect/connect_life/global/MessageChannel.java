package com.juconnect.connect_life.global;

import com.juconnect.connect_life.model.EventMessageModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p072c.p073a.p074a.C1502i;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9006d;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/juconnect/connect_life/global/MessageChannel;", "", "()V", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "eventChannelName", "", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "initChannel", "", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "sendMessage", "message", "Lcom/juconnect/connect_life/model/EventMessageModel;", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageChannel.kt */
public final class MessageChannel {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static MessageChannel instance;
    @Nullable
    public C9006d eventChannel;
    @NotNull
    public final String eventChannelName = "com.juconnect.connectlife/messageEvent";
    @Nullable
    public C9006d.C9008b eventSink;

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo47991d2 = {"Lcom/juconnect/connect_life/global/MessageChannel$Companion;", "", "()V", "instance", "Lcom/juconnect/connect_life/global/MessageChannel;", "getInstance", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: MessageChannel.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MessageChannel getInstance() {
            if (MessageChannel.instance == null) {
                synchronized (MessageChannel.class) {
                    if (MessageChannel.instance == null) {
                        Companion companion = MessageChannel.Companion;
                        MessageChannel.instance = new MessageChannel();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            MessageChannel access$getInstance$cp = MessageChannel.instance;
            Intrinsics.checkNotNull(access$getInstance$cp);
            return access$getInstance$cp;
        }
    }

    public final void initChannel(@NotNull C9003c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "messenger");
        C9006d dVar = new C9006d(cVar, this.eventChannelName);
        this.eventChannel = dVar;
        if (dVar != null) {
            dVar.mo46556d(new MessageChannel$initChannel$1(this));
        }
    }

    public final void sendMessage(@NotNull EventMessageModel eventMessageModel) {
        Intrinsics.checkNotNullParameter(eventMessageModel, "message");
        synchronized (MessageChannel.class) {
            String k = C1502i.m931k(eventMessageModel, EventMessageModel.class);
            C9006d.C9008b bVar = this.eventSink;
            if (bVar != null) {
                bVar.success(k);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
