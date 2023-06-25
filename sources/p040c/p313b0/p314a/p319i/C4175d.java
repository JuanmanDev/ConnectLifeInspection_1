package p040c.p313b0.p314a.p319i;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9031m;
import p553f.p554a.p570e.p575e.C9055e;
import p553f.p554a.p570e.p575e.C9056f;

/* renamed from: c.b0.a.i.d */
/* compiled from: FlutterWebViewFactory */
public class C4175d extends C9056f {

    /* renamed from: a */
    public final View f8798a;

    /* renamed from: b */
    public final C9003c f8799b;

    public C4175d(C9003c cVar, View view) {
        super(C9031m.f17698a);
        this.f8798a = view;
        this.f8799b = cVar;
    }

    public C9055e create(Context context, int i, Object obj) {
        return new C4171c(this.f8799b, context, Integer.valueOf(i), (HashMap) obj, this.f8798a);
    }
}
