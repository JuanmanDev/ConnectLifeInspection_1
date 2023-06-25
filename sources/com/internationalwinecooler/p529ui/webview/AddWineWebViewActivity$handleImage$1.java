package com.internationalwinecooler.p529ui.webview;

import com.hisense.connect_life.core.utils.BitmapUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
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
@DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.AddWineWebViewActivity$handleImage$1", mo48701f = "AddWineWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* renamed from: com.internationalwinecooler.ui.webview.AddWineWebViewActivity$handleImage$1 */
/* compiled from: AddWineWebViewActivity.kt */
public final class AddWineWebViewActivity$handleImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AddWineWebViewActivity this$0;

    @Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    @DebugMetadata(mo48700c = "com.internationalwinecooler.ui.webview.AddWineWebViewActivity$handleImage$1$1", mo48701f = "AddWineWebViewActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
    /* renamed from: com.internationalwinecooler.ui.webview.AddWineWebViewActivity$handleImage$1$1 */
    /* compiled from: AddWineWebViewActivity.kt */
    public static final class C87121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C87121(addWineWebViewActivity, fileToBase64, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C87121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                addWineWebViewActivity.getWineWebViewModel().showWineDataExe(fileToBase64);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddWineWebViewActivity$handleImage$1(AddWineWebViewActivity addWineWebViewActivity, Continuation<? super AddWineWebViewActivity$handleImage$1> continuation) {
        super(2, continuation);
        this.this$0 = addWineWebViewActivity;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        AddWineWebViewActivity$handleImage$1 addWineWebViewActivity$handleImage$1 = new AddWineWebViewActivity$handleImage$1(this.this$0, continuation);
        addWineWebViewActivity$handleImage$1.L$0 = obj;
        return addWineWebViewActivity$handleImage$1;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AddWineWebViewActivity$handleImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Intrinsics.stringPlus("扫描二维码的时候添加酒 ", this.this$0.getPathImage());
            File file = new File(this.this$0.getPathImage());
            StringBuilder sb = new StringBuilder();
            sb.append("扫描的图片大小is ");
            long j = (long) 1024;
            sb.append(file.length() / j);
            sb.append("kb");
            sb.toString();
            C9991f.C9992a h = C9991f.m26740h(this.this$0);
            h.mo53728i(this.this$0.getPathImage());
            File file2 = h.mo53727h().get(0);
            "扫描的图片压缩之后大小is " + (file2.length() / j) + "kb";
            final String fileToBase64 = BitmapUtils.INSTANCE.fileToBase64(file2);
            if (fileToBase64 == null) {
                fileToBase64 = "";
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            final AddWineWebViewActivity addWineWebViewActivity = this.this$0;
            Job unused = BuildersKt__Builders_commonKt.launch$default(coroutineScope, main, (CoroutineStart) null, new C87121((Continuation<? super C87121>) null), 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
