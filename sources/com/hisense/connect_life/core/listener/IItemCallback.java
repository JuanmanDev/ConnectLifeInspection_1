package com.hisense.connect_life.core.listener;

import kotlin.Metadata;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/core/listener/IItemCallback;", "T", "", "accept", "", "item", "(Ljava/lang/Object;)V", "cancel", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IItemCallback.kt */
public interface IItemCallback<T> {
    void accept(T t);

    void cancel();
}
