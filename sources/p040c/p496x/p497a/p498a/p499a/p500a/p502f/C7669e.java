package p040c.p496x.p497a.p498a.p499a.p500a.p502f;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: c.x.a.a.a.a.f.e */
public class C7669e {

    /* renamed from: a */
    public String f14416a;

    /* renamed from: b */
    public List<String> f14417b;

    /* renamed from: c */
    public List<String> f14418c;

    /* renamed from: d */
    public long f14419d;

    /* renamed from: e */
    public long f14420e;

    /* renamed from: c.x.a.a.a.a.f.e$b */
    public static final class C7671b {

        /* renamed from: a */
        public String f14421a;

        /* renamed from: b */
        public Set<String> f14422b;

        /* renamed from: c */
        public Set<String> f14423c;

        /* renamed from: d */
        public long f14424d;

        /* renamed from: e */
        public long f14425e;

        /* renamed from: f */
        public C7671b mo33154f(Collection<String> collection) {
            this.f14422b.addAll(collection);
            return this;
        }

        /* renamed from: g */
        public C7671b mo33155g(Collection<String> collection) {
            this.f14423c.addAll(collection);
            return this;
        }

        /* renamed from: h */
        public C7669e mo33156h() {
            return new C7669e(this);
        }

        /* renamed from: i */
        public C7671b mo33157i(long j) {
            this.f14425e = j;
            return this;
        }

        /* renamed from: j */
        public C7671b mo33158j(String str) {
            this.f14421a = str;
            return this;
        }

        /* renamed from: k */
        public C7671b mo33159k(long j) {
            this.f14424d = j;
            return this;
        }

        public C7671b() {
            this.f14422b = new LinkedHashSet();
            this.f14423c = new LinkedHashSet();
        }

        public C7671b(C7669e eVar) {
            this.f14421a = eVar.f14416a;
            this.f14422b = new LinkedHashSet(eVar.mo33147g());
            this.f14423c = new LinkedHashSet(eVar.mo33149i());
            this.f14424d = eVar.f14419d;
            this.f14425e = eVar.f14420e;
        }
    }

    /* renamed from: d */
    public C7671b mo33144d() {
        return new C7671b();
    }

    /* renamed from: e */
    public String mo33145e() {
        return this.f14416a;
    }

    /* renamed from: f */
    public List<InetAddress> mo33146f() {
        ArrayList arrayList = new ArrayList();
        for (String byName : this.f14417b) {
            try {
                arrayList.add(InetAddress.getByAddress(mo33145e(), InetAddress.getByName(byName).getAddress()));
            } catch (UnknownHostException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<String> mo33147g() {
        return Collections.unmodifiableList(this.f14417b);
    }

    /* renamed from: h */
    public List<InetAddress> mo33148h() {
        ArrayList arrayList = new ArrayList();
        for (String byName : this.f14418c) {
            try {
                arrayList.add(InetAddress.getByAddress(mo33145e(), InetAddress.getByName(byName).getAddress()));
            } catch (UnknownHostException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public List<String> mo33149i() {
        return Collections.unmodifiableList(this.f14418c);
    }

    /* renamed from: j */
    public long mo33150j() {
        return this.f14420e;
    }

    /* renamed from: k */
    public long mo33151k() {
        return this.f14419d;
    }

    /* renamed from: l */
    public int mo33152l() {
        return this.f14417b.size();
    }

    public String toString() {
        return "HostInfo: " + this.f14416a + ", " + this.f14419d + ", " + this.f14417b + ", " + this.f14418c;
    }

    public C7669e(C7671b bVar) {
        this.f14416a = bVar.f14421a;
        this.f14417b = new ArrayList(bVar.f14422b);
        this.f14418c = new ArrayList(bVar.f14423c);
        this.f14419d = bVar.f14424d;
        this.f14420e = bVar.f14425e;
    }
}
