package com.hisense.connect_life.hismart.networks.request.wine.model;

import android.text.TextUtils;
import androidx.room.TypeConverter;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/model/StrListToStrConverter;", "", "()V", "fromStrList", "", "list", "", "toStrList", "value", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: StrListToStrConverter.kt */
public final class StrListToStrConverter {
    @TypeConverter
    @NotNull
    public final String fromStrList(@Nullable List<String> list) {
        return list != null ? new Gson().toJson((Object) list).toString() : "";
    }

    @TypeConverter
    @NotNull
    public final List<String> toStrList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        Type type = new StrListToStrConverter$toStrList$type$1().getType();
        if (TextUtils.isEmpty(str)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object fromJson = new Gson().fromJson(str, type);
        Intrinsics.checkNotNullExpressionValue(fromJson, "{\n            Gson().fro…>>(value, type)\n        }");
        return (List) fromJson;
    }
}
