package p040c.p429r.p460b.p461a.p462a;

import android.widget.CompoundButton;
import com.hisense.juconnect.app_device.activity.KeyLockActivity;

/* renamed from: c.r.b.a.a.j */
/* compiled from: lambda */
public final /* synthetic */ class C7500j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ KeyLockActivity f14197a;

    public /* synthetic */ C7500j(KeyLockActivity keyLockActivity) {
        this.f14197a = keyLockActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        KeyLockActivity.m27113setListeners$lambda1(this.f14197a, compoundButton, z);
    }
}
