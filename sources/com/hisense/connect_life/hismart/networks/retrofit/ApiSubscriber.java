package com.hisense.connect_life.hismart.networks.retrofit;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.exception.ApiException;
import com.hisense.connect_life.hismart.networks.request.JuBaseInfo;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p553f.p594c.C9186d;
import p648m.p683f.C9803c;
import retrofit2.HttpException;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0004J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/retrofit/ApiSubscriber;", "Lio/reactivex/FlowableSubscriber;", "Lcom/hisense/connect_life/hismart/model/JuCustomResult;", "Lcom/hisense/connect_life/hismart/networks/request/JuBaseInfo;", "()V", "onComplete", "", "onError", "e", "", "onNext", "t", "onResultError", "ex", "Lcom/hisense/connect_life/hismart/networks/exception/ApiException;", "onSubscribe", "s", "Lorg/reactivestreams/Subscription;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ApiSubscriber.kt */
public abstract class ApiSubscriber implements C9186d<JuCustomResult<JuBaseInfo>> {
    public void onComplete() {
    }

    public void onError(@Nullable Throwable th) {
        Throwable th2 = th;
        while (true) {
            Intrinsics.checkNotNull(th);
            if (th.getCause() == null) {
                break;
            }
            th2 = th;
            th = th.getCause();
        }
        if (!(th2 instanceof HttpException)) {
            if (th2 instanceof ApiException) {
                onResultError((ApiException) th2);
            } else if (!(th2 instanceof JsonParseException) && !(th2 instanceof JSONException) && !(th2 instanceof ParseException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof SocketTimeoutException)) {
                Intrinsics.checkNotNull(th2);
                th2.printStackTrace();
            }
        }
    }

    public final void onResultError(@NotNull ApiException apiException) {
        Intrinsics.checkNotNullParameter(apiException, "ex");
        apiException.getCode();
    }

    public void onSubscribe(@NotNull C9803c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "s");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r5.getResponse();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(@org.jetbrains.annotations.Nullable com.hisense.connect_life.hismart.model.JuCustomResult<com.hisense.connect_life.hismart.networks.request.JuBaseInfo> r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0006
        L_0x0004:
            r2 = r1
            goto L_0x0019
        L_0x0006:
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.JuBaseInfo r2 = (com.hisense.connect_life.hismart.networks.request.JuBaseInfo) r2
            if (r2 != 0) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            int r2 = r2.getErrorCode()
            r3 = 100026(0x186ba, float:1.40166E-40)
            if (r2 != r3) goto L_0x0004
            r2 = r0
        L_0x0019:
            if (r2 != 0) goto L_0x005f
            if (r5 != 0) goto L_0x001f
        L_0x001d:
            r2 = r1
            goto L_0x0032
        L_0x001f:
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.JuBaseInfo r2 = (com.hisense.connect_life.hismart.networks.request.JuBaseInfo) r2
            if (r2 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            int r2 = r2.getErrorCode()
            r3 = 100027(0x186bb, float:1.40168E-40)
            if (r2 != r3) goto L_0x001d
            r2 = r0
        L_0x0032:
            if (r2 != 0) goto L_0x005f
            if (r5 != 0) goto L_0x0038
        L_0x0036:
            r0 = r1
            goto L_0x004a
        L_0x0038:
            java.lang.Object r2 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.JuBaseInfo r2 = (com.hisense.connect_life.hismart.networks.request.JuBaseInfo) r2
            if (r2 != 0) goto L_0x0041
            goto L_0x0036
        L_0x0041:
            int r2 = r2.getErrorCode()
            r3 = 611701(0x95575, float:8.57176E-40)
            if (r2 != r3) goto L_0x0036
        L_0x004a:
            if (r0 != 0) goto L_0x005f
            if (r5 != 0) goto L_0x004f
            goto L_0x005f
        L_0x004f:
            java.lang.Object r5 = r5.getResponse()
            com.hisense.connect_life.hismart.networks.request.JuBaseInfo r5 = (com.hisense.connect_life.hismart.networks.request.JuBaseInfo) r5
            if (r5 != 0) goto L_0x0058
            goto L_0x005f
        L_0x0058:
            int r5 = r5.getErrorCode()
            r0 = 611702(0x95576, float:8.57177E-40)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.networks.retrofit.ApiSubscriber.onNext(com.hisense.connect_life.hismart.model.JuCustomResult):void");
    }
}
