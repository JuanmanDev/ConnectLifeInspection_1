package com.juconnect.connectlife.ju_ble;

import com.clj.fastble.data.BleDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "version", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* renamed from: com.juconnect.connectlife.ju_ble.BlueToothHelper$connectDeviceAndGetInfo$1$onConnectSuccess$1$1$1$1 */
/* compiled from: BlueToothHelper.kt */
public final class C4077xb89058de extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ BleDevice $bleDevice;
    public final /* synthetic */ Function2<BleDevice, String, Unit> $connectCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4077xb89058de(Function2<? super BleDevice, ? super String, Unit> function2, BleDevice bleDevice) {
        super(1);
        this.$connectCallback = function2;
        this.$bleDevice = bleDevice;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "version");
        this.$connectCallback.invoke(this.$bleDevice, str);
    }
}
