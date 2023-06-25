package p040c.p200q.p201a.p264c.p275c;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zzd;

/* renamed from: c.q.a.c.c.p */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class C3311p {
    @Nullable

    /* renamed from: a */
    public final Messenger f6173a;
    @Nullable

    /* renamed from: b */
    public final zzd f6174b;

    public C3311p(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f6173a = new Messenger(iBinder);
            this.f6174b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f6174b = new zzd(iBinder);
            this.f6173a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            } else {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo20365a(Message message) {
        Messenger messenger = this.f6173a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzd = this.f6174b;
        if (zzd != null) {
            zzd.mo24478b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
