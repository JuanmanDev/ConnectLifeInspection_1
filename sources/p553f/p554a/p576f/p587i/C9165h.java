package p553f.p554a.p576f.p587i;

import android.content.Context;
import android.view.View;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9031m;
import p553f.p554a.p570e.p575e.C9055e;
import p553f.p554a.p570e.p575e.C9056f;

/* renamed from: f.a.f.i.h */
/* compiled from: WebViewFactory */
public final class C9165h extends C9056f {

    /* renamed from: a */
    public final C9003c f17959a;

    /* renamed from: b */
    public final View f17960b;

    public C9165h(C9003c cVar, View view) {
        super(C9031m.f17698a);
        this.f17959a = cVar;
        this.f17960b = view;
    }

    public C9055e create(Context context, int i, Object obj) {
        return new C9154c(context, this.f17959a, i, (Map) obj, this.f17960b);
    }
}
