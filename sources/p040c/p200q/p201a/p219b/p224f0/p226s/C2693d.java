package p040c.p200q.p201a.p219b.p224f0.p226s;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.s.d */
/* compiled from: ScriptTagPayloadReader */
public final class C2693d extends TagPayloadReader {

    /* renamed from: b */
    public long f3497b = -9223372036854775807L;

    public C2693d() {
        super((C2686q) null);
    }

    /* renamed from: e */
    public static Boolean m5334e(C3173t tVar) {
        boolean z = true;
        if (tVar.mo20032y() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    public static Object m5335f(C3173t tVar, int i) {
        if (i == 0) {
            return m5337h(tVar);
        }
        if (i == 1) {
            return m5334e(tVar);
        }
        if (i == 2) {
            return m5341l(tVar);
        }
        if (i == 3) {
            return m5339j(tVar);
        }
        if (i == 8) {
            return m5338i(tVar);
        }
        if (i == 10) {
            return m5340k(tVar);
        }
        if (i != 11) {
            return null;
        }
        return m5336g(tVar);
    }

    /* renamed from: g */
    public static Date m5336g(C3173t tVar) {
        Date date = new Date((long) m5337h(tVar).doubleValue());
        tVar.mo20007M(2);
        return date;
    }

    /* renamed from: h */
    public static Double m5337h(C3173t tVar) {
        return Double.valueOf(Double.longBitsToDouble(tVar.mo20025r()));
    }

    /* renamed from: i */
    public static HashMap<String, Object> m5338i(C3173t tVar) {
        int C = tVar.mo19997C();
        HashMap<String, Object> hashMap = new HashMap<>(C);
        for (int i = 0; i < C; i++) {
            hashMap.put(m5341l(tVar), m5335f(tVar, m5342m(tVar)));
        }
        return hashMap;
    }

    /* renamed from: j */
    public static HashMap<String, Object> m5339j(C3173t tVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String l = m5341l(tVar);
            int m = m5342m(tVar);
            if (m == 9) {
                return hashMap;
            }
            hashMap.put(l, m5335f(tVar, m));
        }
    }

    /* renamed from: k */
    public static ArrayList<Object> m5340k(C3173t tVar) {
        int C = tVar.mo19997C();
        ArrayList<Object> arrayList = new ArrayList<>(C);
        for (int i = 0; i < C; i++) {
            arrayList.add(m5335f(tVar, m5342m(tVar)));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static String m5341l(C3173t tVar) {
        int E = tVar.mo19999E();
        int c = tVar.mo20010c();
        tVar.mo20007M(E);
        return new String(tVar.f5877a, c, E);
    }

    /* renamed from: m */
    public static int m5342m(C3173t tVar) {
        return tVar.mo20032y();
    }

    /* renamed from: b */
    public boolean mo18580b(C3173t tVar) {
        return true;
    }

    /* renamed from: c */
    public void mo18581c(C3173t tVar, long j) {
        if (m5342m(tVar) != 2) {
            throw new ParserException();
        } else if ("onMetaData".equals(m5341l(tVar)) && m5342m(tVar) == 8) {
            HashMap<String, Object> i = m5338i(tVar);
            if (i.containsKey("duration")) {
                double doubleValue = ((Double) i.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f3497b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    /* renamed from: d */
    public long mo18588d() {
        return this.f3497b;
    }
}
