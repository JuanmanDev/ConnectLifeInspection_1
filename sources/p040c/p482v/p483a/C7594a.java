package p040c.p482v.p483a;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineResult;
import com.internationalwinecooler.p529ui.WineWebViewModel;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* renamed from: c.v.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C7594a implements Observer {

    /* renamed from: a */
    public final /* synthetic */ MutableLiveData f14290a;

    /* renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f14291b;

    /* renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f14292c;

    /* renamed from: d */
    public final /* synthetic */ Ref.BooleanRef f14293d;

    /* renamed from: e */
    public final /* synthetic */ Ref.ObjectRef f14294e;

    /* renamed from: f */
    public final /* synthetic */ WineWebViewModel f14295f;

    /* renamed from: g */
    public final /* synthetic */ String f14296g;

    /* renamed from: h */
    public final /* synthetic */ AddWineResult f14297h;

    public /* synthetic */ C7594a(MutableLiveData mutableLiveData, Ref.ObjectRef objectRef, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.ObjectRef objectRef2, WineWebViewModel wineWebViewModel, String str, AddWineResult addWineResult) {
        this.f14290a = mutableLiveData;
        this.f14291b = objectRef;
        this.f14292c = booleanRef;
        this.f14293d = booleanRef2;
        this.f14294e = objectRef2;
        this.f14295f = wineWebViewModel;
        this.f14296g = str;
        this.f14297h = addWineResult;
    }

    public final void onChanged(Object obj) {
        WineWebViewModel.m27176addWineSuccess$lambda3(this.f14290a, this.f14291b, this.f14292c, this.f14293d, this.f14294e, this.f14295f, this.f14296g, this.f14297h, (List) obj);
    }
}
