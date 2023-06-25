package p040c.p301y.p508a;

import com.juconnect.connect_life.MainActivity;
import java.util.List;
import p040c.p472t.p473a.C7567d;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.y.a.d */
/* compiled from: lambda */
public final /* synthetic */ class C7712d implements C7567d {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f14480a;

    /* renamed from: b */
    public final /* synthetic */ String f14481b;

    /* renamed from: c */
    public final /* synthetic */ C9017j.C9022d f14482c;

    public /* synthetic */ C7712d(MainActivity mainActivity, String str, C9017j.C9022d dVar) {
        this.f14480a = mainActivity;
        this.f14481b = str;
        this.f14482c = dVar;
    }

    public final void onGranted(List list, boolean z) {
        MainActivity.m27226connectWifiOfDevice$lambda43(this.f14480a, this.f14481b, this.f14482c, list, z);
    }
}
