package com.juconnect.connectlife.ju_ble;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.clj.fastble.callback.BleReadCallback;
import com.clj.fastble.exception.BleException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, mo47991d2 = {"com/juconnect/connectlife/ju_ble/BlueToothHelper$readValue$1", "Lcom/clj/fastble/callback/BleReadCallback;", "onReadFailure", "", "exception", "Lcom/clj/fastble/exception/BleException;", "onReadSuccess", "data", "", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: BlueToothHelper.kt */
public final class BlueToothHelper$readValue$1 extends BleReadCallback {
    public final /* synthetic */ Function1<String, Unit> $callback;
    public final /* synthetic */ BlueToothHelper this$0;

    public BlueToothHelper$readValue$1(BlueToothHelper blueToothHelper, Function1<? super String, Unit> function1) {
        this.this$0 = blueToothHelper;
        this.$callback = function1;
    }

    public void onReadFailure(@Nullable BleException bleException) {
        this.this$0.logE("read failed!!!!!");
        this.this$0.logE(String.valueOf(bleException));
        this.$callback.invoke("0");
    }

    public void onReadSuccess(@Nullable byte[] bArr) {
        Intrinsics.checkNotNull(bArr);
        String str = new String(bArr, Charsets.UTF_8);
        this.this$0.logI(Intrinsics.stringPlus("onReadSuccess : ", str));
        int parseInt = Integer.parseInt(StringsKt__StringsJVMKt.replace$default(str, AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null), CharsKt__CharJVMKt.checkRadix(16));
        Function1<String, Unit> function1 = this.$callback;
        String num = Integer.toString(parseInt, CharsKt__CharJVMKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        function1.invoke(num);
    }
}
