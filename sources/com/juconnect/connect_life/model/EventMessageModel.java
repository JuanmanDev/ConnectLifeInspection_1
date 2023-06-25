package com.juconnect.connect_life.model;

import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo47991d2 = {"Lcom/juconnect/connect_life/model/EventMessageModel;", "", "typeCode", "", "data", "Lcom/google/gson/JsonObject;", "(ILcom/google/gson/JsonObject;)V", "getData", "()Lcom/google/gson/JsonObject;", "getTypeCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: EventMessageModel.kt */
public final class EventMessageModel {
    @NotNull
    public final JsonObject data;
    public final int typeCode;

    public EventMessageModel(int i, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "data");
        this.typeCode = i;
        this.data = jsonObject;
    }

    public static /* synthetic */ EventMessageModel copy$default(EventMessageModel eventMessageModel, int i, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = eventMessageModel.typeCode;
        }
        if ((i2 & 2) != 0) {
            jsonObject = eventMessageModel.data;
        }
        return eventMessageModel.copy(i, jsonObject);
    }

    public final int component1() {
        return this.typeCode;
    }

    @NotNull
    public final JsonObject component2() {
        return this.data;
    }

    @NotNull
    public final EventMessageModel copy(int i, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "data");
        return new EventMessageModel(i, jsonObject);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) EventMessageModel.class, (Object) obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            EventMessageModel eventMessageModel = (EventMessageModel) obj;
            return this.typeCode == eventMessageModel.typeCode && Intrinsics.areEqual((Object) this.data, (Object) eventMessageModel.data);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.juconnect.connect_life.model.EventMessageModel");
    }

    @NotNull
    public final JsonObject getData() {
        return this.data;
    }

    public final int getTypeCode() {
        return this.typeCode;
    }

    public int hashCode() {
        return (this.typeCode * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventMessageModel(typeCode=" + this.typeCode + ", data=" + this.data + ')';
    }
}
