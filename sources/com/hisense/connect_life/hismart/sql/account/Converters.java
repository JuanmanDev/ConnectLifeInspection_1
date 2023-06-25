package com.hisense.connect_life.hismart.sql.account;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAdditionData;
import com.hisense.connect_life.hismart.networks.request.account.model.UpAddress;
import com.hisense.connect_life.hismart.networks.request.account.model.UpMedia;
import com.hisense.connect_life.hismart.networks.request.account.model.UpPhone;
import com.hisense.connect_life.hismart.networks.request.account.model.UpSocialProvider;
import com.hisense.connect_life.hismart.networks.request.device.model.OnlineStatus;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007J\u0018\u0010\r\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0007J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000bH\u0007J\u0016\u0010\u0015\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bH\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0007J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\""}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/sql/account/Converters;", "", "()V", "convertToBoolean", "", "onLineState", "Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;", "(Lcom/hisense/connect_life/hismart/networks/request/device/model/OnlineStatus;)Ljava/lang/Boolean;", "objectToString", "", "list", "", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAddress;", "objectToString1", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpPhone;", "objectToString2", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpSocialProvider;", "objectToString3", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpMedia;", "objectToString4", "Lcom/hisense/connect_life/hismart/networks/request/account/model/UpAdditionData;", "objectToStringInfo", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineBaseInfo;", "objectToStringInfo1", "propertiesToString", "value", "Lcom/google/gson/JsonObject;", "stringToObject", "stringToObject1", "stringToObject2", "stringToObject3", "stringToObject4", "stringToObjectInfo", "stringToObjectInfo1", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: Converters.kt */
public final class Converters {
    @TypeConverter
    @Nullable
    public final Boolean convertToBoolean(@NotNull OnlineStatus onlineStatus) {
        Intrinsics.checkNotNullParameter(onlineStatus, "onLineState");
        return Boolean.valueOf(onlineStatus != OnlineStatus.OFFLINE);
    }

    @TypeConverter
    @NotNull
    public final String objectToString(@Nullable List<UpAddress> list) {
        if (list == null) {
            return "";
        }
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @NotNull
    public final String objectToString1(@Nullable List<UpPhone> list) {
        if (list == null) {
            return "";
        }
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @NotNull
    public final String objectToString2(@Nullable List<UpSocialProvider> list) {
        if (list == null) {
            return "";
        }
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @Nullable
    public final String objectToString3(@Nullable List<UpMedia> list) {
        Gson gson = new Gson();
        if (list == null) {
            return "";
        }
        return gson.toJson((Object) list);
    }

    @TypeConverter
    @NotNull
    public final String objectToString4(@Nullable List<UpAdditionData> list) {
        if (list == null) {
            return "";
        }
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @NotNull
    public final String objectToStringInfo(@NotNull List<WineBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @NotNull
    public final String objectToStringInfo1(@Nullable List<String> list) {
        if (list == null) {
            return "";
        }
        String json = new Gson().toJson((Object) list);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(list)");
        return json;
    }

    @TypeConverter
    @Nullable
    public final String propertiesToString(@Nullable JsonObject jsonObject) {
        return String.valueOf(jsonObject);
    }

    @TypeConverter
    @NotNull
    public final List<UpAddress> stringToObject(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Type type = new Converters$stringToObject$listType$1().getType();
        if (str.length() == 0) {
            Object fromJson = new Gson().fromJson("", type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\"\", listType)");
            return (List) fromJson;
        }
        Object fromJson2 = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(value, listType)");
        return (List) fromJson2;
    }

    @TypeConverter
    @NotNull
    public final List<UpPhone> stringToObject1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Type type = new Converters$stringToObject1$listType$1().getType();
        if (str.length() == 0) {
            Object fromJson = new Gson().fromJson("", type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\"\", listType)");
            return (List) fromJson;
        }
        Object fromJson2 = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(value, listType)");
        return (List) fromJson2;
    }

    @TypeConverter
    @NotNull
    public final List<UpSocialProvider> stringToObject2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Type type = new Converters$stringToObject2$listType$1().getType();
        if (str.length() == 0) {
            Object fromJson = new Gson().fromJson("", type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\"\", listType)");
            return (List) fromJson;
        }
        Object fromJson2 = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(value, listType)");
        return (List) fromJson2;
    }

    @TypeConverter
    @NotNull
    public final List<UpMedia> stringToObject3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Type type = new Converters$stringToObject3$listType$1().getType();
        if (str.length() == 0) {
            Object fromJson = new Gson().fromJson("", type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\"\", listType)");
            return (List) fromJson;
        }
        Object fromJson2 = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(value, listType)");
        return (List) fromJson2;
    }

    @TypeConverter
    @NotNull
    public final List<UpAdditionData> stringToObject4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Type type = new Converters$stringToObject4$listType$1().getType();
        if (str.length() == 0) {
            Object fromJson = new Gson().fromJson("", type);
            Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(\"\", listType)");
            return (List) fromJson;
        }
        Object fromJson2 = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson2, "Gson().fromJson(value, listType)");
        return (List) fromJson2;
    }

    @TypeConverter
    @NotNull
    public final List<WineBaseInfo> stringToObjectInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        Object fromJson = new Gson().fromJson(str, new Converters$stringToObjectInfo$listType$1().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(value, listType)");
        return (List) fromJson;
    }

    @TypeConverter
    @NotNull
    public final List<String> stringToObjectInfo1(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object fromJson = new Gson().fromJson(str, new Converters$stringToObjectInfo1$listType$1().getType());
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(value, listType)");
        return (List) fromJson;
    }
}
