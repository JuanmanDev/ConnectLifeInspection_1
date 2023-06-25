package p040c.p301y.p508a;

import androidx.lifecycle.Observer;
import com.juconnect.connect_life.MainActivity;
import kotlin.Pair;

/* renamed from: c.y.a.k */
/* compiled from: lambda */
public final /* synthetic */ class C7719k implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f14490a;

    /* renamed from: b */
    public final /* synthetic */ String f14491b;

    public /* synthetic */ C7719k(MainActivity mainActivity, String str) {
        this.f14490a = mainActivity;
        this.f14491b = str;
    }

    public final void onChanged(Object obj) {
        MainActivity.m27228loginWithOneAccount$lambda40(this.f14490a, this.f14491b, (Pair) obj);
    }
}
