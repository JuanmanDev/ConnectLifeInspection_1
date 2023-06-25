package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.connectlife.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p040c.p072c.p073a.p074a.C1527w;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getDeviceInfo$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getDeviceInfo$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getDeviceInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineWebViewModel$getDeviceInfo$1(String str, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getDeviceInfo$1> continuation) {
        super(2, continuation);
        this.$model = str;
        this.this$0 = wineWebViewModel;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WineWebViewModel$getDeviceInfo$1(this.$model, this.this$0, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WineWebViewModel$getDeviceInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JsonObject jsonObject;
        String str;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                String string = new JSONObject(this.$model).getString("deviceId");
                if (TextUtils.isEmpty(string)) {
                    WineWebViewModel wineWebViewModel = this.this$0;
                    String b = C1527w.m1063b(R.string.parameter_error);
                    Intrinsics.checkNotNullExpressionValue(b, "getString(R.string.parameter_error)");
                    wineWebViewModel.executeFailCallback(b, WebActionEnum.GET_DEVICE_INFO_CALLBACK);
                } else {
                    DeviceCache instance = DeviceCache.Companion.getInstance();
                    Intrinsics.checkNotNullExpressionValue(string, KeyConst.KEY_AUIT);
                    DeviceInfo device = instance.getDevice(string);
                    Integer num = null;
                    if (device == null) {
                        jsonObject = null;
                    } else {
                        jsonObject = device.getProperties();
                    }
                    if (jsonObject != null) {
                        JsonObject properties = device == null ? null : device.getProperties();
                        Intrinsics.checkNotNull(properties);
                        if (properties.size() > 0) {
                            JsonObject jsonObject2 = new JsonObject();
                            JsonObject jsonObject3 = new JsonObject();
                            JsonObject jsonObject4 = new JsonObject();
                            JsonObject jsonObject5 = new JsonObject();
                            JsonObject properties2 = device.getProperties();
                            Intrinsics.checkNotNull(properties2);
                            JsonElement jsonElement = properties2.get("Zone1SetTemperature");
                            jsonObject4.addProperty(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (Number) jsonElement == null ? null : Boxing.boxInt(jsonElement.getAsInt()));
                            JsonElement jsonElement2 = properties2.get("Zone2SetTemperature");
                            jsonObject4.addProperty("B", (Number) jsonElement2 == null ? null : Boxing.boxInt(jsonElement2.getAsInt()));
                            JsonElement jsonElement3 = properties2.get("Zone3SetTemperature");
                            jsonObject4.addProperty("C", (Number) jsonElement3 == null ? null : Boxing.boxInt(jsonElement3.getAsInt()));
                            JsonElement jsonElement4 = properties2.get("TemperatureUnit");
                            if (jsonElement4 != null && jsonElement4.getAsInt() == 0) {
                                str = "C";
                            } else {
                                str = "F";
                            }
                            jsonObject4.addProperty("unit", str);
                            JsonElement jsonElement5 = properties2.get("Zone1RealHumidity");
                            jsonObject5.addProperty(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, (Number) jsonElement5 == null ? null : Boxing.boxInt(jsonElement5.getAsInt()));
                            JsonElement jsonElement6 = properties2.get("Zone2RealHumidity");
                            jsonObject5.addProperty("B", (Number) jsonElement6 == null ? null : Boxing.boxInt(jsonElement6.getAsInt()));
                            JsonElement jsonElement7 = properties2.get("Zone3RealHumidity");
                            if (jsonElement7 != null) {
                                num = Boxing.boxInt(jsonElement7.getAsInt());
                            }
                            jsonObject5.addProperty("C", (Number) num);
                            jsonObject3.add(HtmlPaths.DEVICE_TEMPERATURE, jsonObject4);
                            jsonObject3.add("humudity", jsonObject5);
                            jsonObject2.addProperty("resultCode", (Number) Boxing.boxInt(0));
                            jsonObject2.add("data", jsonObject3);
                            this.this$0.getEvaluateJsLiveData().postValue(new Pair(WebActionEnum.GET_DEVICE_INFO_CALLBACK, jsonObject2.toString()));
                        }
                    }
                    WineWebViewModel wineWebViewModel2 = this.this$0;
                    String b2 = C1527w.m1063b(R.string.unit_exception);
                    Intrinsics.checkNotNullExpressionValue(b2, "getString(R.string.unit_exception)");
                    wineWebViewModel2.executeFailCallback(b2, WebActionEnum.GET_DEVICE_INFO_CALLBACK);
                }
            } catch (JSONException e) {
                WineWebViewModel wineWebViewModel3 = this.this$0;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                wineWebViewModel3.executeFailCallback(message, WebActionEnum.GET_DEVICE_INFO_CALLBACK);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
