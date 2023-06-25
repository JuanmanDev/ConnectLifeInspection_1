package com.hisense.connect_life.hismart.networks.parameters;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.Gson;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/ParameterUtils;", "", "()V", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ParameterUtils.kt */
public final class ParameterUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static final MediaType JSON = MediaType.Companion.parse("application/json; charset=utf-8");

    @Metadata(mo47990d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nJ*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nJL\u0010\r\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\nJH\u0010\r\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\nJL\u0010\u0012\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\nJH\u0010\u0012\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\nJ.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nJ6\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nJ.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nJ\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/ParameterUtils$Companion;", "", "()V", "JSON", "Lokhttp3/MediaType;", "createParamBody", "Lokhttp3/RequestBody;", "token", "", "params", "", "signProvider", "Lcom/hisense/connect_life/hismart/networks/parameters/ISignProvider;", "createParamBodySpec", "paramJson", "Lorg/json/JSONObject;", "paramJsonArray", "Lorg/json/JSONArray;", "createParamBodySpecUrl", "createParamMap", "createSignParamMap", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ParameterUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RequestBody createParamBodySpec$default(Companion companion, Map map, ISignProvider iSignProvider, Map map2, Map map3, int i, Object obj) {
            if ((i & 4) != 0) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            return companion.createParamBodySpec(map, iSignProvider, map2, map3);
        }

        public static /* synthetic */ RequestBody createParamBodySpecUrl$default(Companion companion, Map map, ISignProvider iSignProvider, Map map2, Map map3, int i, Object obj) {
            if ((i & 4) != 0) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            return companion.createParamBodySpecUrl(map, iSignProvider, map2, map3);
        }

        @NotNull
        public final RequestBody createParamBody(@NotNull String str, @NotNull Map<String, String> map, @NotNull ISignProvider iSignProvider) {
            Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(iSignProvider, "signProvider");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(str.length() == 0 ? CommonParameters.INSTANCE.getHeadParameter() : CommonParameters.INSTANCE.getHeadParameter(str));
            linkedHashMap.putAll(map);
            linkedHashMap.put("sign", iSignProvider.sign(linkedHashMap));
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType access$getJSON$cp = ParameterUtils.JSON;
            String json = new Gson().toJson((Object) linkedHashMap);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(signMap)");
            return companion.create(access$getJSON$cp, json);
        }

        @NotNull
        public final RequestBody createParamBodySpec(@NotNull Map<String, String> map, @NotNull ISignProvider iSignProvider, @NotNull Map<String, ? extends JSONObject> map2, @NotNull Map<String, ? extends JSONArray> map3) {
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(iSignProvider, "signProvider");
            Intrinsics.checkNotNullParameter(map2, "paramJson");
            Intrinsics.checkNotNullParameter(map3, "paramJsonArray");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Map<String, String> headParameter = CommonParameters.INSTANCE.getHeadParameter();
            linkedHashMap.putAll(headParameter);
            if (!map.isEmpty()) {
                linkedHashMap.putAll(map);
            }
            if (!map2.isEmpty()) {
                for (Map.Entry next : map2.entrySet()) {
                    Object key = next.getKey();
                    String jSONObject = ((JSONObject) next.getValue()).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "it.value.toString()");
                    linkedHashMap2.put(key, jSONObject);
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
            if (!map3.isEmpty()) {
                for (Map.Entry next2 : map3.entrySet()) {
                    Object key2 = next2.getKey();
                    String jSONArray = ((JSONArray) next2.getValue()).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "it.value.toString()");
                    linkedHashMap2.put(key2, jSONArray);
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
            LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("createParamBodySpec signMap: ", linkedHashMap));
            String sign = iSignProvider.sign(linkedHashMap);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry next3 : headParameter.entrySet()) {
                jSONObject2.put((String) next3.getKey(), (String) next3.getValue());
            }
            for (Map.Entry next4 : map.entrySet()) {
                jSONObject2.put((String) next4.getKey(), (String) next4.getValue());
            }
            for (Map.Entry next5 : map2.entrySet()) {
                jSONObject2.put((String) next5.getKey(), (JSONObject) next5.getValue());
            }
            for (Map.Entry next6 : map3.entrySet()) {
                jSONObject2.put((String) next6.getKey(), (JSONArray) next6.getValue());
            }
            jSONObject2.put("sign", sign);
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType access$getJSON$cp = ParameterUtils.JSON;
            String jSONObject3 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString()");
            return companion.create(access$getJSON$cp, jSONObject3);
        }

        @NotNull
        public final RequestBody createParamBodySpecUrl(@NotNull Map<String, String> map, @NotNull ISignProvider iSignProvider, @NotNull Map<String, ? extends JSONObject> map2, @NotNull Map<String, ? extends JSONArray> map3) {
            Map<String, String> map4 = map;
            ISignProvider iSignProvider2 = iSignProvider;
            Intrinsics.checkNotNullParameter(map4, "params");
            Intrinsics.checkNotNullParameter(iSignProvider2, "signProvider");
            Intrinsics.checkNotNullParameter(map2, "paramJson");
            Intrinsics.checkNotNullParameter(map3, "paramJsonArray");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Map<String, String> headParameter = CommonParameters.INSTANCE.getHeadParameter();
            linkedHashMap.putAll(headParameter);
            if (!map.isEmpty()) {
                linkedHashMap.putAll(map4);
            }
            if (!map2.isEmpty()) {
                for (Map.Entry next : map2.entrySet()) {
                    String jSONObject = ((JSONObject) next.getValue()).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "it.value.toString()");
                    linkedHashMap2.put(next.getKey(), StringsKt__StringsJVMKt.replace$default(jSONObject, "\\/", "/", false, 4, (Object) null));
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
            if (!map3.isEmpty()) {
                for (Map.Entry next2 : map3.entrySet()) {
                    Object key = next2.getKey();
                    String jSONArray = ((JSONArray) next2.getValue()).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray, "it.value.toString()");
                    linkedHashMap2.put(key, jSONArray);
                }
                linkedHashMap.putAll(linkedHashMap2);
            }
            LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("createParamBodySpec signMap: ", linkedHashMap));
            String sign = iSignProvider2.sign(linkedHashMap);
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry next3 : headParameter.entrySet()) {
                jSONObject2.put((String) next3.getKey(), (String) next3.getValue());
            }
            for (Map.Entry next4 : map.entrySet()) {
                jSONObject2.put((String) next4.getKey(), (String) next4.getValue());
            }
            for (Map.Entry next5 : map2.entrySet()) {
                jSONObject2.put((String) next5.getKey(), (JSONObject) next5.getValue());
            }
            for (Map.Entry next6 : map3.entrySet()) {
                jSONObject2.put((String) next6.getKey(), (JSONArray) next6.getValue());
            }
            jSONObject2.put("sign", sign);
            RequestBody.Companion companion = RequestBody.Companion;
            MediaType access$getJSON$cp = ParameterUtils.JSON;
            String jSONObject3 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString()");
            return companion.create(access$getJSON$cp, jSONObject3);
        }

        @NotNull
        public final Map<String, String> createParamMap(@NotNull Map<String, String> map, @NotNull ISignProvider iSignProvider) {
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(iSignProvider, "signProvider");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(CommonParameters.INSTANCE.getHeadParameter());
            linkedHashMap.putAll(map);
            linkedHashMap.put("sign", iSignProvider.sign(linkedHashMap));
            return linkedHashMap;
        }

        @NotNull
        public final Map<String, String> createSignParamMap(@NotNull ISignProvider iSignProvider) {
            Intrinsics.checkNotNullParameter(iSignProvider, "signProvider");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(CommonParameters.INSTANCE.getHeadParameter());
            linkedHashMap.put("sign", iSignProvider.sign(linkedHashMap));
            return linkedHashMap;
        }

        public static /* synthetic */ RequestBody createParamBodySpec$default(Companion companion, Map map, Map map2, Map map3, int i, Object obj) {
            if ((i & 1) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            if ((i & 2) != 0) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            if ((i & 4) != 0) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            return companion.createParamBodySpec(map, map2, map3);
        }

        public static /* synthetic */ RequestBody createParamBodySpecUrl$default(Companion companion, Map map, Map map2, Map map3, int i, Object obj) {
            if ((i & 1) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            if ((i & 2) != 0) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            if ((i & 4) != 0) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            return companion.createParamBodySpecUrl(map, map2, map3);
        }

        @NotNull
        public final Map<String, String> createSignParamMap() {
            return createSignParamMap(new RsaSignProvider());
        }

        @NotNull
        public final Map<String, String> createParamMap(@NotNull String str, @NotNull Map<String, String> map, @NotNull ISignProvider iSignProvider) {
            Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(iSignProvider, "signProvider");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(CommonParameters.INSTANCE.getHeadParameter(str));
            linkedHashMap.putAll(map);
            linkedHashMap.put("sign", iSignProvider.sign(linkedHashMap));
            return linkedHashMap;
        }

        @NotNull
        public final RequestBody createParamBody(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "params");
            return createParamBody("", map, new RsaSignProvider());
        }

        @NotNull
        public final RequestBody createParamBody(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
            Intrinsics.checkNotNullParameter(map, "params");
            return createParamBody(str, map, new RsaSignProvider());
        }

        @NotNull
        public final Map<String, String> createParamMap(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "params");
            return createParamMap(map, (ISignProvider) new RsaSignProvider());
        }

        @NotNull
        public final Map<String, String> createParamMap(@NotNull String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
            Intrinsics.checkNotNullParameter(map, "params");
            return createParamMap(str, map, new RsaSignProvider());
        }

        @NotNull
        public final RequestBody createParamBodySpec(@NotNull Map<String, String> map, @NotNull Map<String, ? extends JSONObject> map2, @NotNull Map<String, ? extends JSONArray> map3) {
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(map2, "paramJson");
            Intrinsics.checkNotNullParameter(map3, "paramJsonArray");
            return createParamBodySpec(map, new RsaSignProvider(), map2, map3);
        }

        @NotNull
        public final RequestBody createParamBodySpecUrl(@NotNull Map<String, String> map, @NotNull Map<String, ? extends JSONObject> map2, @NotNull Map<String, ? extends JSONArray> map3) {
            Intrinsics.checkNotNullParameter(map, "params");
            Intrinsics.checkNotNullParameter(map2, "paramJson");
            Intrinsics.checkNotNullParameter(map3, "paramJsonArray");
            return createParamBodySpecUrl(map, new RsaSignProvider(), map2, map3);
        }
    }
}
