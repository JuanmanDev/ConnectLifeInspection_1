package p040c.p429r.p460b.p461a.p462a;

import android.widget.CompoundButton;
import com.hisense.juconnect.app_device.activity.KeyLockActivity;

/* renamed from: c.r.b.a.a.f0 */
/* compiled from: lambda */
public final /* synthetic */ class C7493f0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ KeyLockActivity f14190a;

    public /* synthetic */ C7493f0(KeyLockActivity keyLockActivity) {
        this.f14190a = keyLockActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        KeyLockActivity.m27114setListeners$lambda2(this.f14190a, compoundButton, z);
    }
}
