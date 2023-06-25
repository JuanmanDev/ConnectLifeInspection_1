package p553f.p554a.p576f.p586h;

import java.util.ArrayList;
import java.util.Iterator;
import p553f.p554a.p570e.p571a.C9006d;

/* renamed from: f.a.f.h.d */
/* compiled from: QueuingEventSink */
public final class C9138d implements C9006d.C9008b {

    /* renamed from: a */
    public C9006d.C9008b f17901a;

    /* renamed from: b */
    public ArrayList<Object> f17902b = new ArrayList<>();

    /* renamed from: c */
    public boolean f17903c = false;

    /* renamed from: f.a.f.h.d$b */
    /* compiled from: QueuingEventSink */
    public static class C9140b {
        public C9140b() {
        }
    }

    /* renamed from: f.a.f.h.d$c */
    /* compiled from: QueuingEventSink */
    public static class C9141c {

        /* renamed from: a */
        public String f17904a;

        /* renamed from: b */
        public String f17905b;

        /* renamed from: c */
        public Object f17906c;

        public C9141c(String str, String str2, Object obj) {
            this.f17904a = str;
            this.f17905b = str2;
            this.f17906c = obj;
        }
    }

    /* renamed from: a */
    public void mo46557a() {
        mo46864b(new C9140b());
        mo46865c();
        this.f17903c = true;
    }

    /* renamed from: b */
    public final void mo46864b(Object obj) {
        if (!this.f17903c) {
            this.f17902b.add(obj);
        }
    }

    /* renamed from: c */
    public final void mo46865c() {
        if (this.f17901a != null) {
            Iterator<Object> it = this.f17902b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C9140b) {
                    this.f17901a.mo46557a();
                } else if (next instanceof C9141c) {
                    C9141c cVar = (C9141c) next;
                    this.f17901a.error(cVar.f17904a, cVar.f17905b, cVar.f17906c);
                } else {
                    this.f17901a.success(next);
                }
            }
            this.f17902b.clear();
        }
    }

    /* renamed from: d */
    public void mo46866d(C9006d.C9008b bVar) {
        this.f17901a = bVar;
        mo46865c();
    }

    public void error(String str, String str2, Object obj) {
        mo46864b(new C9141c(str, str2, obj));
        mo46865c();
    }

    public void success(Object obj) {
        mo46864b(obj);
        mo46865c();
    }
}
