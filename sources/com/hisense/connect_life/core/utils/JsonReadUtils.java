package com.hisense.connect_life.core.utils;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/JsonReadUtils;", "", "()V", "get", "", "context", "Landroid/content/Context;", "id", "", "read", "stream", "Ljava/io/InputStream;", "inputStream", "encode", "Companion", "StreamUtilsInstance", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JsonReadUtils.kt */
public final class JsonReadUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/JsonReadUtils$Companion;", "", "()V", "getInstance", "Lcom/hisense/connect_life/core/utils/JsonReadUtils;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: JsonReadUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsonReadUtils getInstance() {
            return StreamUtilsInstance.INSTANCE.getJsonReadUtils();
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/JsonReadUtils$StreamUtilsInstance;", "", "()V", "jsonReadUtils", "Lcom/hisense/connect_life/core/utils/JsonReadUtils;", "getJsonReadUtils", "()Lcom/hisense/connect_life/core/utils/JsonReadUtils;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: JsonReadUtils.kt */
    public static final class StreamUtilsInstance {
        @NotNull
        public static final StreamUtilsInstance INSTANCE = new StreamUtilsInstance();
        @NotNull
        public static final JsonReadUtils jsonReadUtils = new JsonReadUtils((DefaultConstructorMarker) null);

        @NotNull
        public final JsonReadUtils getJsonReadUtils() {
            return jsonReadUtils;
        }
    }

    public JsonReadUtils() {
    }

    public /* synthetic */ JsonReadUtils(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String get(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        InputStream openRawResource = context.getResources().openRawResource(i);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(id)");
        return read(openRawResource);
    }

    @NotNull
    public final String read(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "stream");
        return read(inputStream, "utf-8");
    }

    @NotNull
    public final String read(@NotNull InputStream inputStream, @NotNull String str) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(str, "encode");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            String str2 = "";
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                str2 = Intrinsics.stringPlus(str2, readLine);
            }
            inputStream.close();
            return str2;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
