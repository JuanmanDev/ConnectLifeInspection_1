package p040c.p496x.p497a.p498a.p499a.p500a.p505g;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.test.rule.PortForwardingRule;
import androidx.work.PeriodicWorkRequest;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.facebook.stetho.dumpapp.Framer;
import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.internal.http2.Http2ExchangeCodec;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7658a;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7664d;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7672f;
import p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a;

/* renamed from: c.x.a.a.a.a.g.c */
public class C7692c implements C7672f.C7675c {

    /* renamed from: f */
    public static final String f14455f = ("HTTP1." + C7692c.class.getSimpleName());

    /* renamed from: g */
    public static final byte[] f14456g = {105, 108, 111, 118, 101, 36, 38, 104, 97, 116, 101, 119, 111, 114, 107, 44, 53, Framer.STDOUT_FRAME_PREFIX, 56};

    /* renamed from: a */
    public C7658a f14457a;

    /* renamed from: b */
    public C7688b f14458b;

    /* renamed from: c */
    public String f14459c;

    /* renamed from: d */
    public C7693d f14460d;

    /* renamed from: e */
    public volatile long f14461e = -300000;

    public C7692c(C7658a aVar, File file, String str) {
        if (aVar == null) {
            throw new NullPointerException("HiHttpClient is null! ");
        } else if (!TextUtils.isEmpty(str)) {
            this.f14458b = C7688b.m21768e(file);
            this.f14457a = aVar;
            this.f14459c = str;
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update((str + new String(f14456g)).getBytes());
                this.f14460d = new C7693d(instance.digest());
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new NullPointerException("DeviceId is empty! ");
        }
    }

    /* renamed from: a */
    public C7669e mo33163a(String str) {
        C7708a.m21820d(f14455f, "parse: " + str);
        if (TextUtils.isEmpty(str)) {
            throw new UnknownHostException("hostname == null");
        } else if (C7694e.m21790a(str)) {
            C7708a.m21820d(f14455f, "parse ip: " + str);
            return mo33209d(str);
        } else if (C7685a.m21759d().mo33198f(str)) {
            C7708a.m21820d(f14455f, "Unsupported: " + str);
            return mo33209d(str);
        } else {
            C7669e c = C7685a.m21759d().mo33196c(str);
            if (c != null) {
                return c;
            }
            if (SystemClock.elapsedRealtime() - this.f14461e < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                C7708a.m21820d(f14455f, "Gslb error time! ");
                return mo33209d(str);
            }
            try {
                C7669e eVar = null;
                boolean z = false;
                for (C7669e next : mo33208c(str, "lbgs.hismarttv.com")) {
                    if ("lbgs.hismarttv.com".equals(next.mo33145e())) {
                        if (!next.mo33147g().contains(PortForwardingRule.DEFAULT_PROXY_HOST)) {
                            this.f14458b.mo33202f(next);
                        }
                    } else if (next.mo33147g().contains(PortForwardingRule.DEFAULT_PROXY_HOST)) {
                        C7708a.m21820d(f14455f, "Add unsupported: " + next.mo33145e());
                        C7685a.m21759d().mo33194a(next.mo33145e());
                        z = str.equals(next.mo33145e());
                    } else {
                        C7685a.m21759d().mo33199g(next);
                        if (str.equals(next.mo33145e())) {
                            eVar = next;
                        }
                    }
                }
                if (eVar != null) {
                    return eVar;
                }
                if (!z) {
                    this.f14461e = SystemClock.elapsedRealtime();
                }
                C7708a.m21820d(f14455f, "System Dns! ");
                return mo33209d(str);
            } catch (Exception e) {
                C7708a.m21821e(f14455f, e, "requestGslb gslb error! ");
                C7708a.m21820d(f14455f, "System Dns! ");
                this.f14461e = SystemClock.elapsedRealtime();
                return mo33209d(str);
            }
        }
    }

    /* renamed from: b */
    public void mo33164b(String str, InetAddress inetAddress) {
        String str2 = f14455f;
        C7708a.m21818b(str2, "connect failed: " + str + ", " + inetAddress);
        C7685a.m21759d().mo33195b(str, inetAddress, 300);
    }

    /* renamed from: c */
    public final List<C7669e> mo33208c(String... strArr) {
        C7708a.m21818b(f14455f, "requestGslb: " + Arrays.toString(strArr));
        HashMap hashMap = new HashMap();
        hashMap.put("device_id", this.f14459c);
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (i != 0) {
                    sb.append(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR);
                }
                sb.append(strArr[i]);
            }
            hashMap.put(Http2ExchangeCodec.HOST, this.f14460d.mo33211c(sb.toString()));
            for (String next : this.f14458b.mo33201c()) {
                try {
                    String str = "http://" + next + "/d";
                    C7708a.m21818b(f14455f, "gslb url: " + str);
                    C7658a aVar = this.f14457a;
                    HiRequest.C8725b bVar = new HiRequest.C8725b();
                    bVar.mo44456t(str, hashMap);
                    bVar.mo44448l("Host", "lbgs.hismarttv.com");
                    C7664d a = aVar.mo33108a(bVar.mo44446j());
                    if (a.mo33124d()) {
                        String a2 = a.mo33121a().mo33125a();
                        C7708a.m21818b(f14455f, "body = " + a2);
                        String b = this.f14460d.mo33210b(a2);
                        C7708a.m21818b(f14455f, "result = " + b);
                        return C7694e.m21793d(b);
                    }
                } catch (Exception e) {
                    C7708a.m21821e(f14455f, e, "request: " + next);
                }
            }
            throw new RuntimeException("Gslb error! ");
        } catch (Exception e2) {
            throw new RuntimeException("Encrypt error! ", e2);
        }
    }

    /* renamed from: d */
    public final C7669e mo33209d(String str) {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InetAddress inetAddress : allByName) {
            String inetAddress2 = inetAddress.toString();
            linkedHashSet.add(inetAddress2.substring(inetAddress2.lastIndexOf("/") + 1));
        }
        C7669e.C7671b bVar = new C7669e.C7671b();
        bVar.mo33158j(str);
        bVar.mo33154f(linkedHashSet);
        return bVar.mo33156h();
    }
}
