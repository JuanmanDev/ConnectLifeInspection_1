package p040c.p496x.p497a.p498a.p499a.p500a.p502f;

import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.io.IOException;
import java.net.InetSocketAddress;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7659b;

/* renamed from: c.x.a.a.a.a.f.d */
public class C7664d {

    /* renamed from: a */
    public final int f14406a;

    /* renamed from: b */
    public final String f14407b;

    /* renamed from: c */
    public final C7666b f14408c;

    /* renamed from: c.x.a.a.a.a.f.d$b */
    public static abstract class C7666b {
        /* renamed from: a */
        public abstract String mo33125a();
    }

    /* renamed from: c.x.a.a.a.a.f.d$c */
    public static class C7667c {

        /* renamed from: a */
        public HiRequest f14409a;

        /* renamed from: b */
        public int f14410b = -1;

        /* renamed from: c */
        public String f14411c;

        /* renamed from: d */
        public C7659b.C7661b f14412d = new C7659b.C7661b();

        /* renamed from: e */
        public C7666b f14413e;

        /* renamed from: f */
        public C7668d f14414f;

        /* renamed from: g */
        public C7667c mo33126g(String str, String str2) {
            this.f14412d.mo33114b(str, str2);
            return this;
        }

        /* renamed from: h */
        public C7667c mo33127h(C7666b bVar) {
            this.f14413e = bVar;
            return this;
        }

        /* renamed from: i */
        public C7664d mo33128i() {
            if (this.f14410b >= 0) {
                return new C7664d(this);
            }
            throw new IllegalStateException("code < 0: " + this.f14410b);
        }

        /* renamed from: j */
        public C7667c mo33129j(int i) {
            this.f14410b = i;
            return this;
        }

        /* renamed from: k */
        public C7667c mo33130k(String str) {
            this.f14411c = str;
            return this;
        }

        /* renamed from: l */
        public C7667c mo33131l(HiRequest hiRequest) {
            this.f14409a = hiRequest;
            return this;
        }

        /* renamed from: m */
        public C7667c mo33132m(C7668d dVar) {
            this.f14414f = dVar;
            return this;
        }
    }

    /* renamed from: c.x.a.a.a.a.f.d$d */
    public static final class C7668d {

        /* renamed from: a */
        public C7668d f14415a;

        /* renamed from: a */
        public C7668d mo33133a() {
            return this.f14415a;
        }

        /* renamed from: b */
        public void mo33134b(InetSocketAddress inetSocketAddress) {
        }

        /* renamed from: c */
        public void mo33135c(int i) {
        }

        /* renamed from: d */
        public void mo33136d(IOException iOException) {
        }

        /* renamed from: e */
        public void mo33137e(C7668d dVar) {
            this.f14415a = dVar;
        }

        /* renamed from: f */
        public void mo33138f(C7659b bVar) {
        }

        /* renamed from: g */
        public void mo33139g(long j) {
        }

        /* renamed from: h */
        public void mo33140h(C7659b bVar) {
        }

        /* renamed from: i */
        public void mo33141i(long j) {
        }

        /* renamed from: j */
        public void mo33142j(boolean z) {
        }

        /* renamed from: k */
        public void mo33143k(String str) {
        }
    }

    /* renamed from: a */
    public C7666b mo33121a() {
        return this.f14408c;
    }

    /* renamed from: b */
    public int mo33122b() {
        return this.f14406a;
    }

    /* renamed from: c */
    public String mo33123c() {
        return this.f14407b;
    }

    /* renamed from: d */
    public boolean mo33124d() {
        int i = this.f14406a;
        return i >= 200 && i < 300;
    }

    public C7664d(C7667c cVar) {
        HiRequest unused = cVar.f14409a;
        this.f14406a = cVar.f14410b;
        this.f14407b = cVar.f14411c;
        cVar.f14412d.mo33115c();
        this.f14408c = cVar.f14413e;
        C7668d unused2 = cVar.f14414f;
    }
}
