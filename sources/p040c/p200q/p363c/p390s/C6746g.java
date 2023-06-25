package p040c.p200q.p363c.p390s;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.p028os.UserManagerCompat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p403y.C6880i;

/* renamed from: c.q.c.s.g */
/* compiled from: DefaultHeartBeatController */
public class C6746g implements C6750j, HeartBeatInfo {

    /* renamed from: f */
    public static final ThreadFactory f12902f = C6741b.f12896e;

    /* renamed from: a */
    public final C6757b<C6751k> f12903a;

    /* renamed from: b */
    public final Context f12904b;

    /* renamed from: c */
    public final C6757b<C6880i> f12905c;

    /* renamed from: d */
    public final Set<C6747h> f12906d;

    /* renamed from: e */
    public final Executor f12907e;

    public C6746g(Context context, String str, Set<C6747h> set, C6757b<C6880i> bVar) {
        this(new C6740a(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f12902f), bVar, context);
    }

    @NonNull
    /* renamed from: c */
    public static C6439o<C6746g> m19087c() {
        C6439o.C6441b<C6746g> b = C6439o.m17968b(C6746g.class, C6750j.class, HeartBeatInfo.class);
        b.mo30550b(C6456v.m18044j(Context.class));
        b.mo30550b(C6456v.m18044j(C6331h.class));
        b.mo30550b(C6456v.m18046l(C6747h.class));
        b.mo30550b(C6456v.m18045k(C6880i.class));
        b.mo30554f(C6742c.f12897a);
        return b.mo30552d();
    }

    /* renamed from: d */
    public static /* synthetic */ C6746g m19088d(C6442p pVar) {
        return new C6746g((Context) pVar.mo30529a(Context.class), ((C6331h) pVar.mo30529a(C6331h.class)).mo30407p(), pVar.mo30532d(C6747h.class), pVar.mo30530b(C6880i.class));
    }

    /* renamed from: f */
    public static /* synthetic */ C6751k m19089f(Context context, String str) {
        return new C6751k(context, str);
    }

    /* renamed from: h */
    public static /* synthetic */ Thread m19090h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public C5771j<String> mo31417a() {
        if (!UserManagerCompat.isUserUnlocked(this.f12904b)) {
            return C5777m.m16414f("");
        }
        return C5777m.m16412d(this.f12907e, new C6744e(this));
    }

    @NonNull
    /* renamed from: b */
    public synchronized HeartBeatInfo.HeartBeat mo31418b(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C6751k kVar = this.f12903a.get();
        if (kVar.mo31430i(currentTimeMillis)) {
            kVar.mo31428g();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    /* renamed from: e */
    public /* synthetic */ String mo31419e() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C6751k kVar = this.f12903a.get();
            List<C6752l> c = kVar.mo31424c();
            kVar.mo31423b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C6752l lVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.mo31413c());
                jSONObject.put("dates", new JSONArray(lVar.mo31412b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* renamed from: g */
    public /* synthetic */ Void mo31420g() {
        synchronized (this) {
            this.f12903a.get().mo31432k(System.currentTimeMillis(), this.f12905c.get().mo31729a());
        }
        return null;
    }

    /* renamed from: i */
    public C5771j<Void> mo31421i() {
        if (this.f12906d.size() <= 0) {
            return C5777m.m16414f(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f12904b)) {
            return C5777m.m16414f(null);
        }
        return C5777m.m16412d(this.f12907e, new C6743d(this));
    }

    @VisibleForTesting
    public C6746g(C6757b<C6751k> bVar, Set<C6747h> set, Executor executor, C6757b<C6880i> bVar2, Context context) {
        this.f12903a = bVar;
        this.f12906d = set;
        this.f12907e = executor;
        this.f12905c = bVar2;
        this.f12904b = context;
    }
}
