package p040c.p429r.p430a.p431a.p432b;

import android.os.Handler;
import android.os.Message;
import com.hisense.connect_life.app_account.activity.DeleteAccountEmailCode;

/* renamed from: c.r.a.a.b.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C7170b1 implements Handler.Callback {

    /* renamed from: e */
    public final /* synthetic */ DeleteAccountEmailCode f13796e;

    public /* synthetic */ C7170b1(DeleteAccountEmailCode deleteAccountEmailCode) {
        this.f13796e = deleteAccountEmailCode;
    }

    public final boolean handleMessage(Message message) {
        return DeleteAccountEmailCode.m26811handler$lambda0(this.f13796e, message);
    }
}
