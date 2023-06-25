package p040c.p482v.p483a;

import androidx.lifecycle.Observer;
import com.internationalwinecooler.p529ui.WineWebViewModel;
import com.internationalwinecooler.p529ui.WineWebViewModel$getWineCardInfo$1;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* renamed from: c.v.a.b */
/* compiled from: lambda */
public final /* synthetic */ class C7595b implements Observer {

    /* renamed from: a */
    public final /* synthetic */ WineWebViewModel f14298a;

    /* renamed from: b */
    public final /* synthetic */ String f14299b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f14300c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f14301d;

    public /* synthetic */ C7595b(WineWebViewModel wineWebViewModel, String str, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.f14298a = wineWebViewModel;
        this.f14299b = str;
        this.f14300c = objectRef;
        this.f14301d = objectRef2;
    }

    public final void onChanged(Object obj) {
        WineWebViewModel$getWineCardInfo$1.C86822.m27178invokeSuspend$lambda1(this.f14298a, this.f14299b, this.f14300c, this.f14301d, (List) obj);
    }
}
