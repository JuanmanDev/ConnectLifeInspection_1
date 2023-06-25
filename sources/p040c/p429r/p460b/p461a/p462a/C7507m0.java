package p040c.p429r.p460b.p461a.p462a;

import android.widget.CompoundButton;
import com.hisense.juconnect.app_device.activity.KeyLockActivity;

/* renamed from: c.r.b.a.a.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C7507m0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ KeyLockActivity f14205a;

    public /* synthetic */ C7507m0(KeyLockActivity keyLockActivity) {
        this.f14205a = keyLockActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        KeyLockActivity.m27115setListeners$lambda3(this.f14205a, compoundButton, z);
    }
}
