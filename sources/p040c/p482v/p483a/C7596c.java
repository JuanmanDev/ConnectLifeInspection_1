package p040c.p482v.p483a;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import com.internationalwinecooler.p529ui.WineWebViewModel;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;

/* renamed from: c.v.a.c */
/* compiled from: lambda */
public final /* synthetic */ class C7596c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MutableLiveData f14302a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f14303b;

    /* renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f14304c;

    /* renamed from: d */
    public final /* synthetic */ Ref.BooleanRef f14305d;

    /* renamed from: e */
    public final /* synthetic */ Ref.ObjectRef f14306e;

    /* renamed from: f */
    public final /* synthetic */ WineWebViewModel f14307f;

    /* renamed from: g */
    public final /* synthetic */ String f14308g;

    /* renamed from: h */
    public final /* synthetic */ AddWineResult f14309h;

    public /* synthetic */ C7596c(MutableLiveData mutableLiveData, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef2, WineWebViewModel wineWebViewModel, String str, AddWineResult addWineResult) {
        this.f14302a = mutableLiveData;
        this.f14303b = objectRef;
        this.f14304c = booleanRef;
        this.f14305d = booleanRef2;
        this.f14306e = objectRef2;
        this.f14307f = wineWebViewModel;
        this.f14308g = str;
        this.f14309h = addWineResult;
    }

    public final void onChanged(Object obj) {
        WineWebViewModel.m27177addWineSuccess$lambda4(this.f14302a, this.f14303b, this.f14304c, this.f14305d, this.f14306e, this.f14307f, this.f14308g, this.f14309h, (Pair) obj);
    }
}
