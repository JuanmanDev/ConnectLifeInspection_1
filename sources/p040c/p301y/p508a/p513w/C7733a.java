package p040c.p301y.p508a.p513w;

import com.juconnect.connect_life.model.EventMessageModel;
import com.juconnect.connect_life.socket.SocketManager;
import p553f.p594c.p601r.C9217e;

/* renamed from: c.y.a.w.a */
/* compiled from: lambda */
public final /* synthetic */ class C7733a implements C9217e {

    /* renamed from: e */
    public final /* synthetic */ SocketManager f14508e;

    /* renamed from: l */
    public final /* synthetic */ EventMessageModel f14509l;

    public /* synthetic */ C7733a(SocketManager socketManager, EventMessageModel eventMessageModel) {
        this.f14508e = socketManager;
        this.f14509l = eventMessageModel;
    }

    public final void accept(Object obj) {
        SocketManager.m27245sendEvent$lambda1(this.f14508e, this.f14509l, (EventMessageModel) obj);
    }
}
