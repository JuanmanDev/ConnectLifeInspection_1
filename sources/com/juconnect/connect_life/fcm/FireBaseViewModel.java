package com.juconnect.connect_life.fcm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.base.BaseViewModel;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.juconnect.connect_life.util.LogFileUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p301y.p508a.p510t.C7728a;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0011\u001a\u00020\u000fR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048FX\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007¨\u0006\u0012"}, mo47991d2 = {"Lcom/juconnect/connect_life/fcm/FireBaseViewModel;", "Lcom/hisense/connect_life/core/base/BaseViewModel;", "()V", "subscribeLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSubscribeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "subscribeLiveData$delegate", "Lkotlin/Lazy;", "unsubscribeLiveData", "", "getUnsubscribeLiveData", "unsubscribeLiveData$delegate", "subscribeFireBase", "", "subscribePush", "unsubscribeFireBase", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FireBaseViewModel.kt */
public final class FireBaseViewModel extends BaseViewModel {
    @NotNull
    public final Lazy subscribeLiveData$delegate = LazyKt__LazyJVMKt.lazy(FireBaseViewModel$subscribeLiveData$2.INSTANCE);
    @NotNull
    public final Lazy unsubscribeLiveData$delegate = LazyKt__LazyJVMKt.lazy(FireBaseViewModel$unsubscribeLiveData$2.INSTANCE);

    /* renamed from: subscribeFireBase$lambda-0  reason: not valid java name */
    public static final void m27239subscribeFireBase$lambda0(FireBaseViewModel fireBaseViewModel, C5771j jVar) {
        Intrinsics.checkNotNullParameter(fireBaseViewModel, "this$0");
        Intrinsics.checkNotNullParameter(jVar, "task");
        if (!jVar.mo28856q()) {
            Intrinsics.stringPlus("subscribeFireBase task result: ", jVar.mo28851l());
            LogFileUtils.Companion.get().upLog("Firebase", Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), Intrinsics.stringPlus("token获取失败：", jVar.mo28851l()));
            return;
        }
        String str = (String) jVar.mo28852m();
        Intrinsics.stringPlus("fireBase：本机获取到的：", str);
        LogFileUtils.Companion.get().upLog("Firebase", Intrinsics.stringPlus("Android_", SPManagerKt.getCustomerId()), Intrinsics.stringPlus("用户获取到的token：", str));
        if (str != null) {
            if (str.length() > 0) {
                AppConfig.Companion.setFcmToken(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(FirebaseMessagingService.EXTRA_TOKEN, str);
                jSONObject.putOpt("deviceId", AppConfig.Companion.getJhlDevSerial());
                String jSONObject2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "fcmJson.toString()");
                fireBaseViewModel.getSubscribeLiveData().postValue(jSONObject2);
                LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("subscribeFireBase token: ", str));
            }
        }
        fireBaseViewModel.getSubscribeLiveData().postValue("");
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("subscribeFireBase token: ", str));
    }

    private final void subscribePush() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new FireBaseViewModel$subscribePush$1((Continuation<? super FireBaseViewModel$subscribePush$1>) null), 2, (Object) null);
    }

    @NotNull
    public final MutableLiveData<String> getSubscribeLiveData() {
        return (MutableLiveData) this.subscribeLiveData$delegate.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getUnsubscribeLiveData() {
        return (MutableLiveData) this.unsubscribeLiveData$delegate.getValue();
    }

    public final void subscribeFireBase() {
        FirebaseMessaging.m23019f().mo37453i().mo28842c(new C7728a(this));
    }

    public final void unsubscribeFireBase() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new FireBaseViewModel$unsubscribeFireBase$1(this, (Continuation<? super FireBaseViewModel$unsubscribeFireBase$1>) null), 2, (Object) null);
    }
}
