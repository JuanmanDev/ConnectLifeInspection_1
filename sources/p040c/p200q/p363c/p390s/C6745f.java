package p040c.p200q.p363c.p390s;

import java.util.List;

/* renamed from: c.q.c.s.f */
/* compiled from: AutoValue_HeartBeatResult */
public final class C6745f extends C6752l {

    /* renamed from: a */
    public final String f12900a;

    /* renamed from: b */
    public final List<String> f12901b;

    public C6745f(String str, List<String> list) {
        if (str != null) {
            this.f12900a = str;
            if (list != null) {
                this.f12901b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    /* renamed from: b */
    public List<String> mo31412b() {
        return this.f12901b;
    }

    /* renamed from: c */
    public String mo31413c() {
        return this.f12900a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6752l)) {
            return false;
        }
        C6752l lVar = (C6752l) obj;
        if (!this.f12900a.equals(lVar.mo31413c()) || !this.f12901b.equals(lVar.mo31412b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f12900a.hashCode() ^ 1000003) * 1000003) ^ this.f12901b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f12900a + ", usedDates=" + this.f12901b + "}";
    }
}
