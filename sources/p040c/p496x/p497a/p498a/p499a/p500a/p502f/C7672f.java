package p040c.p496x.p497a.p498a.p499a.p500a.p502f;

import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.io.File;
import java.net.InetAddress;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: c.x.a.a.a.a.f.f */
public abstract class C7672f {

    /* renamed from: c.x.a.a.a.a.f.f$a */
    public interface C7673a {
        /* renamed from: a */
        long mo33162a(int i);
    }

    /* renamed from: c.x.a.a.a.a.f.f$b */
    public interface C7674b {
    }

    /* renamed from: c.x.a.a.a.a.f.f$c */
    public interface C7675c {
        /* renamed from: a */
        C7669e mo33163a(String str);

        /* renamed from: b */
        void mo33164b(String str, InetAddress inetAddress);
    }

    /* renamed from: c.x.a.a.a.a.f.f$d */
    public static final class C7676d {

        /* renamed from: a */
        public C7675c f14426a;

        /* renamed from: b */
        public File f14427b;

        /* renamed from: c */
        public long f14428c;

        /* renamed from: d */
        public long f14429d;

        /* renamed from: e */
        public long f14430e;

        /* renamed from: f */
        public boolean f14431f;

        /* renamed from: g */
        public boolean f14432g;

        /* renamed from: h */
        public C7673a f14433h;

        /* renamed from: i */
        public SSLSocketFactory f14434i;

        /* renamed from: j */
        public X509TrustManager f14435j;

        /* renamed from: k */
        public HostnameVerifier f14436k;

        /* renamed from: a */
        public C7673a mo33165a() {
            return this.f14433h;
        }

        /* renamed from: b */
        public File mo33166b() {
            return this.f14427b;
        }

        /* renamed from: c */
        public long mo33167c() {
            return this.f14428c;
        }

        /* renamed from: d */
        public long mo33168d() {
            return this.f14430e;
        }

        /* renamed from: e */
        public C7675c mo33169e() {
            return this.f14426a;
        }

        /* renamed from: f */
        public HostnameVerifier mo33170f() {
            return this.f14436k;
        }

        /* renamed from: g */
        public long mo33171g() {
            return this.f14429d;
        }

        /* renamed from: h */
        public SSLSocketFactory mo33172h() {
            return this.f14434i;
        }

        /* renamed from: i */
        public X509TrustManager mo33173i() {
            return this.f14435j;
        }

        /* renamed from: j */
        public boolean mo33174j() {
            return this.f14431f;
        }

        /* renamed from: k */
        public boolean mo33175k() {
            return this.f14432g;
        }

        /* renamed from: l */
        public void mo33176l(C7673a aVar) {
            this.f14433h = aVar;
        }

        /* renamed from: m */
        public void mo33177m(File file, long j) {
            this.f14427b = file;
            this.f14428c = j;
        }

        /* renamed from: n */
        public void mo33178n(long j) {
            this.f14430e = j;
        }

        /* renamed from: o */
        public void mo33179o(C7675c cVar) {
            this.f14426a = cVar;
        }

        /* renamed from: p */
        public void mo33180p(boolean z) {
            this.f14431f = z;
        }

        /* renamed from: q */
        public void mo33181q(boolean z) {
            this.f14432g = z;
        }

        /* renamed from: r */
        public void mo33182r(long j) {
            this.f14429d = j;
        }

        public String toString() {
            return "HttpConfig: Dns = " + this.f14426a + ", CacheDirectory = " + this.f14427b + ", CacheSize = " + this.f14428c + ", ReadTimeOut = " + this.f14429d + ", ConnectTimeOut = " + this.f14430e + ", EnableLog = " + this.f14431f + ", EnableRetry = " + this.f14432g;
        }
    }

    /* renamed from: a */
    public void mo33160a(HiRequest hiRequest, C7674b bVar) {
        if (hiRequest == null) {
            throw new NullPointerException("HiRequest is null! ");
        } else if (bVar != null) {
            synchronized (this) {
                if (hiRequest.mo44436b() == null) {
                    hiRequest.mo44444j(bVar);
                } else {
                    throw new IllegalArgumentException("HiRequest is binded! ");
                }
            }
        } else {
            throw new NullPointerException("Cancelable is null! ");
        }
    }

    /* renamed from: b */
    public abstract C7664d mo33161b(HiRequest hiRequest);
}
