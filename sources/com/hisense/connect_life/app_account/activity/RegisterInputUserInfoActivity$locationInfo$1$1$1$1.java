package com.hisense.connect_life.app_account.activity;

import android.location.Address;
import android.widget.EditText;
import android.widget.TextView;
import com.hisense.connect_life.app_account.R$id;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo47991d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@DebugMetadata(mo48700c = "com.hisense.connect_life.app_account.activity.RegisterInputUserInfoActivity$locationInfo$1$1$1$1", mo48701f = "RegisterInputUserInfoActivity.kt", mo48702i = {}, mo48703l = {}, mo48704m = "invokeSuspend", mo48705n = {}, mo48706s = {})
/* compiled from: RegisterInputUserInfoActivity.kt */
public final class RegisterInputUserInfoActivity$locationInfo$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Address $this_with;
    public int label;
    public final /* synthetic */ RegisterInputUserInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterInputUserInfoActivity$locationInfo$1$1$1$1(RegisterInputUserInfoActivity registerInputUserInfoActivity, Address address, Continuation<? super RegisterInputUserInfoActivity$locationInfo$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = registerInputUserInfoActivity;
        this.$this_with = address;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RegisterInputUserInfoActivity$locationInfo$1$1$1$1(this.this$0, this.$this_with, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RegisterInputUserInfoActivity$locationInfo$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ((EditText) this.this$0._$_findCachedViewById(R$id.register_street)).setText(this.$this_with.getSubAdminArea());
            ((EditText) this.this$0._$_findCachedViewById(R$id.register_postal_code)).setText(this.$this_with.getPostalCode());
            ((EditText) this.this$0._$_findCachedViewById(R$id.register_city)).setText(this.$this_with.getLocality());
            TextView textView = (TextView) this.this$0._$_findCachedViewById(R$id.drop_down_country_region);
            if (this.$this_with.getCountryName() == null) {
                str = this.this$0.getCountryNameByCode();
            } else {
                str = this.$this_with.getCountryName();
            }
            textView.setText(str);
            RegisterInputUserInfoActivity registerInputUserInfoActivity = this.this$0;
            if (this.$this_with.getCountryCode() == null) {
                str2 = "";
            } else {
                str2 = this.$this_with.getCountryCode();
                Intrinsics.checkNotNullExpressionValue(str2, "{\n                      …                        }");
            }
            registerInputUserInfoActivity.mCountryCode = str2;
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
