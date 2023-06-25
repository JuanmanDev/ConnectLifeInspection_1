package p040c.p107e.p108a.p109e.p110d;

import com.amazon.identity.auth.map.device.token.MAPCookie;

/* renamed from: c.e.a.e.d.b */
/* compiled from: BasicHeaderElement */
public class C1973b implements C1978g, Cloneable {

    /* renamed from: e */
    public final String f1662e;

    /* renamed from: l */
    public final String f1663l;

    /* renamed from: m */
    public final C1982j[] f1664m;

    public C1973b(String str, String str2, C1982j[] jVarArr) {
        if (str != null) {
            this.f1662e = str;
            this.f1663l = str2;
            if (jVarArr != null) {
                this.f1664m = jVarArr;
            } else {
                this.f1664m = new C1982j[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1978g)) {
            return false;
        }
        C1973b bVar = (C1973b) obj;
        if (!this.f1662e.equals(bVar.f1662e) || !C1981i.m2649a(this.f1663l, bVar.f1663l) || !C1981i.m2650b(this.f1664m, bVar.f1664m)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.f1662e;
    }

    public String getValue() {
        return this.f1663l;
    }

    public int hashCode() {
        int d = C1981i.m2652d(C1981i.m2652d(17, this.f1662e), this.f1663l);
        int i = 0;
        while (true) {
            C1982j[] jVarArr = this.f1664m;
            if (i >= jVarArr.length) {
                return d;
            }
            d = C1981i.m2652d(d, jVarArr[i]);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f1662e);
        if (this.f1663l != null) {
            sb.append(MAPCookie.COOKIE_NAME_VALUE_SEPERATOR);
            sb.append(this.f1663l);
        }
        for (C1982j append : this.f1664m) {
            sb.append("; ");
            sb.append(append);
        }
        return sb.toString();
    }
}
