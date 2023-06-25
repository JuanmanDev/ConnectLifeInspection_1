package com.internationalwinecooler.p529ui;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.facebook.stetho.websocket.WebSocketHandler;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineBaseInfo;
import com.hisense.connect_life.hismart.sql.account.LoginUserInfoRoom;
import com.hisense.juconnect.app_device.activity.WebConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getAllWinesInDevice$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getAllWinesInDevice$1 */
/* compiled from: WineWebViewModel.kt */
public final class WineWebViewModel$getAllWinesInDevice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $auid;
    public final /* synthetic */ String $model;
    public int label;
    public final /* synthetic */ WineWebViewModel this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.WineWebViewModel$getAllWinesInDevice$1$1", mo48701f = "WineWebViewModel.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.WineWebViewModel$getAllWinesInDevice$1$1 */
    /* compiled from: WineWebViewModel.kt */
    public static final class C86561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C86561(wineBaseInfo, list, listOf4, listOf5, listOf3, listOf2, wineWebViewModel, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C86561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            String str2;
            String str3;
            List<String> list;
            String str4;
            String str5;
            LinkedHashMap linkedHashMap;
            Ref.ObjectRef objectRef;
            JsonObject jsonObject;
            Ref.ObjectRef objectRef2;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List<WineBaseInfo> allWineInventoryByDeviceId = LoginUserInfoRoom.Companion.loginUserInfoProvider().getAllWineInventoryByDeviceId(wineBaseInfo.getDeviceId());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList<WineBaseInfo> arrayList = new ArrayList<>();
                Iterator<T> it = allWineInventoryByDeviceId.iterator();
                while (true) {
                    str = "N";
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    WineBaseInfo wineBaseInfo = (WineBaseInfo) next;
                    if ((Intrinsics.areEqual((Object) wineBaseInfo.getZoneName(), (Object) str) || wineBaseInfo.getCellNum() == -1 || wineBaseInfo.getPositionNum() == -1) ? false : true) {
                        arrayList.add(next);
                    }
                }
                for (WineBaseInfo json : arrayList) {
                    LogUtilsShen.Companion.mo39140i("getAllWinesInDevice item   is  " + new Gson().toJson((Object) json) + '}');
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    str2 = "StringBuilder().apply(builderAction).toString()";
                    str3 = "_";
                    if (!it2.hasNext()) {
                        break;
                    }
                    WineBaseInfo wineBaseInfo2 = (WineBaseInfo) it2.next();
                    String str6 = wineBaseInfo2.getZoneName() + str3 + wineBaseInfo2.getCellNum() + str3 + wineBaseInfo2.getPositionNum();
                    Intrinsics.checkNotNullExpressionValue(str6, str2);
                    linkedHashMap2.put(str6, wineBaseInfo2);
                }
                JsonArray jsonArray = new JsonArray();
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                Ref.IntRef intRef = new Ref.IntRef();
                Iterator<Pair<String, List<String>>> it3 = list.iterator();
                while (it3.hasNext()) {
                    Pair next2 = it3.next();
                    objectRef3.element = next2.getFirst();
                    JsonObject jsonObject2 = new JsonObject();
                    objectRef4.element = new JsonArray();
                    Iterator it4 = ((List) next2.getSecond()).iterator();
                    while (it4.hasNext()) {
                        String str7 = (String) it4.next();
                        JsonObject jsonObject3 = new JsonObject();
                        Iterator it5 = it4;
                        objectRef6.element = new JsonArray();
                        intRef.element = 0;
                        Iterator<Pair<String, List<String>>> it6 = it3;
                        JsonArray jsonArray2 = jsonArray;
                        String str8 = "3";
                        JsonObject jsonObject4 = jsonObject2;
                        Ref.ObjectRef objectRef7 = objectRef4;
                        if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                            list = (!Intrinsics.areEqual((Object) objectRef3.element, (Object) ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) || !Intrinsics.areEqual((Object) str7, (Object) str8)) ? listOf5 : listOf4;
                        } else if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                            list = listOf5;
                        } else {
                            list = (!Intrinsics.areEqual((Object) objectRef3.element, (Object) "C") || !Intrinsics.areEqual((Object) str7, (Object) "5")) ? listOf2 : listOf3;
                        }
                        Iterator<String> it7 = list.iterator();
                        while (it7.hasNext()) {
                            String next3 = it7.next();
                            Iterator<String> it8 = it7;
                            JsonObject jsonObject5 = new JsonObject();
                            JsonObject jsonObject6 = jsonObject3;
                            StringBuilder sb = new StringBuilder();
                            Ref.ObjectRef objectRef8 = objectRef6;
                            sb.append((String) objectRef3.element);
                            sb.append(str3);
                            sb.append(str7);
                            sb.append(str3);
                            sb.append(next3);
                            String sb2 = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(sb2, str2);
                            int parseInt = Integer.parseInt(next3);
                            String str9 = str2;
                            String str10 = str3;
                            Ref.ObjectRef objectRef9 = objectRef5;
                            JsonObject jsonObject7 = jsonObject5;
                            if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                                if (!Intrinsics.areEqual((Object) objectRef3.element, (Object) ExifInterface.GPS_MEASUREMENT_IN_PROGRESS) || !Intrinsics.areEqual((Object) str7, (Object) str8)) {
                                    if (parseInt >= 0 && parseInt < 4) {
                                        str4 = Intrinsics.stringPlus("F", Boxing.boxInt(parseInt + 1));
                                    } else {
                                        if (4 <= parseInt && parseInt < 8) {
                                            str4 = Intrinsics.stringPlus("B", Boxing.boxInt(parseInt - 3));
                                        } else {
                                            str4 = Intrinsics.stringPlus("C", Boxing.boxInt(parseInt));
                                        }
                                    }
                                } else {
                                    if (parseInt >= 0 && parseInt < 4) {
                                        str4 = Intrinsics.stringPlus("F", Boxing.boxInt(parseInt + 1));
                                    } else {
                                        if (4 <= parseInt && parseInt < 8) {
                                            str4 = Intrinsics.stringPlus("B", Boxing.boxInt(parseInt - 3));
                                        } else {
                                            if (8 <= parseInt && parseInt < 11) {
                                                str4 = Intrinsics.stringPlus(ExifInterface.GPS_DIRECTION_TRUE, Boxing.boxInt(parseInt - 7));
                                            } else {
                                                if (11 <= parseInt && parseInt < 14) {
                                                    str4 = Intrinsics.stringPlus(str, Boxing.boxInt(parseInt - 10));
                                                } else {
                                                    str4 = Intrinsics.stringPlus("C", Boxing.boxInt(parseInt));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                                if (parseInt >= 0 && parseInt < 4) {
                                    str4 = Intrinsics.stringPlus("F", Boxing.boxInt(parseInt + 1));
                                } else {
                                    if (4 <= parseInt && parseInt < 8) {
                                        str4 = Intrinsics.stringPlus("B", Boxing.boxInt(parseInt - 3));
                                    } else {
                                        str4 = Intrinsics.stringPlus("C", Boxing.boxInt(parseInt));
                                    }
                                }
                            } else {
                                if (parseInt >= 0 && parseInt < 7) {
                                    str4 = Intrinsics.stringPlus("F", Boxing.boxInt(parseInt + 1));
                                } else {
                                    if (7 <= parseInt && parseInt < 13) {
                                        str4 = Intrinsics.stringPlus("B", Boxing.boxInt(parseInt - 6));
                                    } else {
                                        str4 = Intrinsics.stringPlus("C", Boxing.boxInt(parseInt));
                                    }
                                }
                            }
                            String str11 = str8;
                            if (linkedHashMap2.containsKey(sb2)) {
                                WineBaseInfo wineBaseInfo3 = (WineBaseInfo) linkedHashMap2.get(sb2);
                                String categoryId = wineBaseInfo.getCategoryId();
                                if (WebConstant.Companion.isFromScan()) {
                                    linkedHashMap = linkedHashMap2;
                                    if (Intrinsics.areEqual((Object) wineBaseInfo.getCategoryId(), (Object) "0")) {
                                        categoryId = WebConstant.Companion.getViviidCaid();
                                    }
                                } else {
                                    linkedHashMap = linkedHashMap2;
                                }
                                Intrinsics.checkNotNull(wineBaseInfo3);
                                boolean equals = TextUtils.equals(categoryId, wineBaseInfo3.getCategoryId());
                                Intrinsics.stringPlus("wineAdd id:", wineBaseInfo.getCategoryId());
                                Intrinsics.stringPlus("wine id:", wineBaseInfo3.getCategoryId());
                                String valueOf = String.valueOf(equals);
                                if (equals) {
                                    intRef.element++;
                                }
                                jsonObject = jsonObject7;
                                jsonObject.addProperty("isThisType", valueOf);
                                JsonObject asJsonObject = new Gson().toJsonTree(wineBaseInfo3, WineBaseInfo.class).getAsJsonObject();
                                asJsonObject.addProperty(EventBusConstKt.WIFIID, "");
                                asJsonObject.addProperty("shelfPosition", Intrinsics.stringPlus((String) objectRef3.element, str7));
                                asJsonObject.addProperty("exactPosition", str4);
                                jsonObject.add("wineInventoryDtoModel", asJsonObject);
                                str5 = str;
                                objectRef2 = objectRef8;
                                objectRef = objectRef9;
                            } else {
                                linkedHashMap = linkedHashMap2;
                                jsonObject = jsonObject7;
                                T jsonObject8 = new JsonObject();
                                objectRef = objectRef9;
                                objectRef.element = jsonObject8;
                                JsonObject jsonObject9 = (JsonObject) jsonObject8;
                                str5 = str;
                                jsonObject9.addProperty("shelfPosition", Intrinsics.stringPlus((String) objectRef3.element, str7));
                                jsonObject9.addProperty("exactPosition", str4);
                                jsonObject9.addProperty("zoneName", (String) objectRef3.element);
                                jsonObject9.addProperty("cellNum", str7);
                                jsonObject9.addProperty("positionNum", (Number) Boxing.boxInt(parseInt));
                                jsonObject.addProperty("isThisType", LanguageConstKt.f15962no);
                                jsonObject.add("wineInventoryDtoModel", (JsonElement) objectRef.element);
                                objectRef2 = objectRef8;
                            }
                            ((JsonArray) objectRef2.element).add((JsonElement) jsonObject);
                            str = str5;
                            objectRef6 = objectRef2;
                            objectRef5 = objectRef;
                            it7 = it8;
                            jsonObject3 = jsonObject6;
                            str2 = str9;
                            str3 = str10;
                            str8 = str11;
                            linkedHashMap2 = linkedHashMap;
                        }
                        LinkedHashMap linkedHashMap3 = linkedHashMap2;
                        String str12 = str;
                        JsonObject jsonObject10 = jsonObject3;
                        String str13 = str3;
                        Ref.ObjectRef objectRef10 = objectRef5;
                        JsonObject jsonObject11 = jsonObject10;
                        jsonObject11.addProperty("shelfName", Intrinsics.stringPlus((String) objectRef3.element, str7));
                        jsonObject11.addProperty("sameTotal", (Number) Boxing.boxInt(intRef.element));
                        jsonObject11.add("wineArr", (JsonElement) objectRef6.element);
                        Ref.ObjectRef objectRef11 = objectRef7;
                        ((JsonArray) objectRef11.element).add((JsonElement) jsonObject11);
                        str = str12;
                        objectRef4 = objectRef11;
                        it4 = it5;
                        it3 = it6;
                        jsonArray = jsonArray2;
                        jsonObject2 = jsonObject4;
                        str2 = str2;
                        linkedHashMap2 = linkedHashMap3;
                    }
                    JsonArray jsonArray3 = jsonArray;
                    String str14 = str2;
                    String str15 = str3;
                    Ref.ObjectRef objectRef12 = objectRef5;
                    Ref.ObjectRef objectRef13 = objectRef6;
                    Iterator<Pair<String, List<String>>> it9 = it3;
                    JsonObject jsonObject12 = jsonObject2;
                    jsonObject12.addProperty("region", (String) objectRef3.element);
                    jsonObject12.add("shelfData", (JsonElement) objectRef4.element);
                    JsonArray jsonArray4 = jsonArray3;
                    jsonArray4.add((JsonElement) jsonObject12);
                    str = str;
                    jsonArray = jsonArray4;
                    str2 = str14;
                    linkedHashMap2 = linkedHashMap2;
                }
                JsonArray jsonArray5 = jsonArray;
                JsonObject jsonObject13 = new JsonObject();
                jsonObject13.add("regionData", jsonArray5);
                final JsonObject jsonObject14 = new JsonObject();
                jsonObject14.addProperty("resultCode", (Number) Boxing.boxInt(0));
                jsonObject14.addProperty("errorDesc", "获取酒架酒信息成功");
                jsonObject14.add("data", jsonObject13);
                String jsonElement = jsonObject14.toString();
                Intrinsics.checkNotNullExpressionValue(jsonElement, "jsonResult.toString()");
                LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("getAllWinesInDevice result: ", jsonElement));
                CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(wineWebViewModel);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                final WineWebViewModel wineWebViewModel = wineWebViewModel;
                Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, main, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation<? super C86579>) null) {
                    public int label;

                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public WineWebViewModel$getAllWinesInDevice$1(String str, String str2, WineWebViewModel wineWebViewModel, Continuation<? super WineWebViewModel$getAllWinesInDevice$1> continuation) {
                            super(2, continuation);
                            this.$model = str;
                            this.$auid = str2;
                            this.this$0 = wineWebViewModel;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new WineWebViewModel$getAllWinesInDevice$1(this.$model, this.$auid, this.this$0, continuation);
                        }

                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((WineWebViewModel$getAllWinesInDevice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Pair pair;
                            List listOf;
                            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label == 0) {
                                ResultKt.throwOnFailure(obj);
                                final WineBaseInfo wineBaseInfo = (WineBaseInfo) new Gson().fromJson(new JSONObject(this.$model).getJSONObject("wineInfo").toString(), WineBaseInfo.class);
                                if (Intrinsics.areEqual((Object) SPManagerKt.getZone2Use(this.$auid), (Object) "0")) {
                                    pair = new Pair("B", CollectionsKt__CollectionsJVMKt.listOf("1"));
                                } else {
                                    pair = new Pair("B", CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4"));
                                }
                                if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleSingleZoneDevice()) {
                                    listOf = CollectionsKt__CollectionsJVMKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4", "5")));
                                } else if (DeviceCache.Companion.getInstance().isDeviceType(wineBaseInfo.getDeviceId()) == DeviceCache.Companion.getInstance().getBattleTwoZoneDevice()) {
                                    listOf = CollectionsKt__CollectionsKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2")), new Pair("B", CollectionsKt__CollectionsKt.listOf("1", "2", "3")));
                                } else {
                                    listOf = CollectionsKt__CollectionsKt.listOf(new Pair(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4")), pair, new Pair("C", CollectionsKt__CollectionsKt.listOf("1", "2", "3", "4", "5")));
                                }
                                final List list = listOf;
                                final List listOf2 = CollectionsKt__CollectionsKt.listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", CrashDumperPlugin.OPTION_KILL_DEFAULT, "10", "11", "12");
                                final List listOf3 = CollectionsKt__CollectionsKt.listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", CrashDumperPlugin.OPTION_KILL_DEFAULT, "10", "11", "12", WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13, "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35");
                                final List listOf4 = CollectionsKt__CollectionsKt.listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", CrashDumperPlugin.OPTION_KILL_DEFAULT, "10", "11", "12", WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13);
                                final List listOf5 = CollectionsKt__CollectionsKt.listOf("0", "1", "2", "3", "4", "5", "6", "7");
                                CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
                                CoroutineDispatcher io = Dispatchers.getIO();
                                final WineWebViewModel wineWebViewModel = this.this$0;
                                Job unused = BuildersKt__Builders_commonKt.launch$default(viewModelScope, io, (CoroutineStart) null, new C86561((Continuation<? super C86561>) null), 2, (Object) null);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
