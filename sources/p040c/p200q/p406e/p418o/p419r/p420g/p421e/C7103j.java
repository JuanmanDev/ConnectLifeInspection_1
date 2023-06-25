package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.facebook.stetho.websocket.WebSocketHandler;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.j */
/* compiled from: AbstractExpandedDecoder */
public abstract class C7103j {

    /* renamed from: a */
    public final C7032a f13647a;

    /* renamed from: b */
    public final C7113s f13648b;

    public C7103j(C7032a aVar) {
        this.f13647a = aVar;
        this.f13648b = new C7113s(aVar);
    }

    /* renamed from: a */
    public static C7103j m21140a(C7032a aVar) {
        if (aVar.mo32517c(1)) {
            return new C7100g(aVar);
        }
        if (!aVar.mo32517c(2)) {
            return new C7104k(aVar);
        }
        int g = C7113s.m21168g(aVar, 1, 4);
        if (g == 4) {
            return new C7094a(aVar);
        }
        if (g == 5) {
            return new C7095b(aVar);
        }
        int g2 = C7113s.m21168g(aVar, 1, 5);
        if (g2 == 12) {
            return new C7096c(aVar);
        }
        if (g2 == 13) {
            return new C7097d(aVar);
        }
        switch (C7113s.m21168g(aVar, 1, 7)) {
            case 56:
                return new C7098e(aVar, "310", "11");
            case 57:
                return new C7098e(aVar, "320", "11");
            case 58:
                return new C7098e(aVar, "310", WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13);
            case 59:
                return new C7098e(aVar, "320", WebSocketHandler.HEADER_SEC_WEBSOCKET_VERSION_13);
            case 60:
                return new C7098e(aVar, "310", "15");
            case 61:
                return new C7098e(aVar, "320", "15");
            case 62:
                return new C7098e(aVar, "310", "17");
            case 63:
                return new C7098e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: " + aVar);
        }
    }

    /* renamed from: b */
    public final C7113s mo32718b() {
        return this.f13648b;
    }

    /* renamed from: c */
    public final C7032a mo32719c() {
        return this.f13647a;
    }

    /* renamed from: d */
    public abstract String mo32713d();
}
