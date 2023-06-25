package p040c.p496x.p497a.p498a.p499a.p500a.p502f.p503g;

import androidx.browser.trusted.sharing.ShareTarget;
import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.x.a.a.a.a.f.g.a */
public final class C7677a extends HiRequest.C8724a {

    /* renamed from: a */
    public final List<C7680c> f14437a;

    /* renamed from: b */
    public final String f14438b;

    /* renamed from: c.x.a.a.a.a.f.g.a$b */
    public static final class C7679b {

        /* renamed from: a */
        public final List<C7680c> f14439a = new ArrayList();

        /* renamed from: b */
        public String f14440b = ShareTarget.ENCODING_TYPE_URL_ENCODED;

        /* renamed from: c */
        public C7679b mo33186c(Map<String, String> map) {
            for (Map.Entry next : map.entrySet()) {
                this.f14439a.add(new C7680c((String) next.getKey(), (String) next.getValue()));
            }
            return this;
        }

        /* renamed from: d */
        public C7677a mo33187d() {
            return new C7677a(this);
        }
    }

    /* renamed from: c.x.a.a.a.a.f.g.a$c */
    public static class C7680c {

        /* renamed from: a */
        public final String f14441a;

        /* renamed from: b */
        public final String f14442b;

        public C7680c(String str, String str2) {
            try {
                this.f14441a = URLEncoder.encode(str, Charset.defaultCharset().name());
                this.f14442b = URLEncoder.encode(str2 == null ? "" : str2, Charset.defaultCharset().name());
            } catch (UnsupportedEncodingException unused) {
                throw new IllegalArgumentException("name  = " + str + ", value = " + str2);
            }
        }

        /* renamed from: a */
        public String mo33188a() {
            return this.f14441a;
        }

        /* renamed from: b */
        public String mo33189b() {
            return this.f14442b;
        }
    }

    /* renamed from: b */
    public String mo33184b() {
        return this.f14438b;
    }

    /* renamed from: c */
    public void mo33185c(OutputStream outputStream) {
        int size = this.f14437a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                outputStream.write(38);
            }
            C7680c cVar = this.f14437a.get(i);
            outputStream.write(cVar.mo33188a().getBytes());
            outputStream.write(61);
            outputStream.write(cVar.mo33189b().getBytes());
        }
    }

    public C7677a(C7679b bVar) {
        this.f14437a = new ArrayList(bVar.f14439a);
        this.f14438b = bVar.f14440b;
    }
}
