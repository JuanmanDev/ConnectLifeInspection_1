package p040c.p200q.p201a.p264c.p276d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import p040c.p200q.p201a.p264c.p294g.p298d.C3636f;

@SuppressLint({"HandlerLeak"})
/* renamed from: c.q.a.c.d.p */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3574p extends C3636f {

    /* renamed from: a */
    public final Context f6559a;

    /* renamed from: b */
    public final /* synthetic */ C3324b f6560b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3574p(C3324b bVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6560b = bVar;
        this.f6559a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            sb.toString();
            return;
        }
        int g = this.f6560b.mo20388g(this.f6559a);
        if (this.f6560b.mo20390j(g)) {
            this.f6560b.mo20394o(this.f6559a, g);
        }
    }
}
