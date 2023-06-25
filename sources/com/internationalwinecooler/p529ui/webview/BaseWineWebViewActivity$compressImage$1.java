package com.internationalwinecooler.p529ui.webview;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hisense.connect_life.core.utils.BitmapUtils;
import com.hisense.juconnect.connectlife.R;
import com.internationalwinecooler.model.JsResp;
import com.internationalwinecooler.p529ui.WebActionEnum;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p704p.p705a.p706a.C9991f;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$compressImage$1", mo48701f = "BaseWineWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$compressImage$1 */
/* compiled from: BaseWineWebViewActivity.kt */
public final class BaseWineWebViewActivity$compressImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ String $imagePath;
    public final /* synthetic */ WebActionEnum $webActionEnum;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ BaseWineWebViewActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$compressImage$1$1", mo48701f = "BaseWineWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.webview.BaseWineWebViewActivity$compressImage$1$1 */
    /* compiled from: BaseWineWebViewActivity.kt */
    public static final class C87141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87141(baseWineWebViewActivity, webActionEnum, json, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                baseWineWebViewActivity.doEvaluateJsAction(new Pair(webActionEnum, json));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseWineWebViewActivity$compressImage$1(String str, BaseWineWebViewActivity baseWineWebViewActivity, WebActionEnum webActionEnum, Continuation<? super BaseWineWebViewActivity$compressImage$1> continuation) {
        super(2, continuation);
        this.$imagePath = str;
        this.this$0 = baseWineWebViewActivity;
        this.$webActionEnum = webActionEnum;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BaseWineWebViewActivity$compressImage$1 baseWineWebViewActivity$compressImage$1 = new BaseWineWebViewActivity$compressImage$1(this.$imagePath, this.this$0, this.$webActionEnum, continuation);
        baseWineWebViewActivity$compressImage$1.L$0 = obj;
        return baseWineWebViewActivity$compressImage$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BaseWineWebViewActivity$compressImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JsResp jsResp;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (TextUtils.isEmpty(this.$imagePath)) {
                JsonObject jsonObject = new JsonObject();
                String string = this.this$0.getString(R.string.photo_not_exist);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.photo_not_exist)");
                jsResp = new JsResp(jsonObject, 1, string);
            } else {
                C9991f.C9992a h = C9991f.m26740h(this.this$0);
                h.mo53728i(this.$imagePath);
                String fileToBase64 = BitmapUtils.INSTANCE.fileToBase64(h.mo53727h().get(0));
                if (fileToBase64 == null) {
                    fileToBase64 = "";
                }
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("imageData", fileToBase64);
                jsResp = new JsResp(jsonObject2, 0, (String) null, 6, (DefaultConstructorMarker) null);
            }
            final String json = new Gson().toJson((Object) jsResp);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            final BaseWineWebViewActivity baseWineWebViewActivity = this.this$0;
            final WebActionEnum webActionEnum = this.$webActionEnum;
            Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, main, (CoroutineStart) null, new C87141((Continuation<? super C87141>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
