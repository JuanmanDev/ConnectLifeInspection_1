package com.juconnect.connect_life.global;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9006d;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, mo47991d2 = {"com/juconnect/connect_life/global/MessageChannel$initChannel$1", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "onCancel", "", "arguments", "", "onListen", "events", "Lio/flutter/plugin/common/EventChannel$EventSink;", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageChannel.kt */
public final class MessageChannel$initChannel$1 implements C9006d.C9011d {
    public final /* synthetic */ MessageChannel this$0;

    public MessageChannel$initChannel$1(MessageChannel messageChannel) {
        this.this$0 = messageChannel;
    }

    public void onCancel(@Nullable Object obj) {
    }

    public void onListen(@Nullable Object obj, @Nullable C9006d.C9008b bVar) {
        this.this$0.eventSink = bVar;
    }
}
