package p040c.p041a.p042a.p043a.p045b;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.template.ILogger;

/* renamed from: c.a.a.a.b.a */
/* compiled from: ARouter */
public final class C1337a {

    /* renamed from: a */
    public static volatile C1337a f335a = null;

    /* renamed from: b */
    public static volatile boolean f336b = false;

    /* renamed from: c */
    public static ILogger f337c;

    /* renamed from: b */
    public static boolean m210b() {
        return C1338b.m223h();
    }

    /* renamed from: c */
    public static C1337a m211c() {
        if (f336b) {
            if (f335a == null) {
                synchronized (C1337a.class) {
                    if (f335a == null) {
                        f335a = new C1337a();
                    }
                }
            }
            return f335a;
        }
        throw new InitException("ARouter::Init::Invoke init(context) first!");
    }

    /* renamed from: d */
    public static void m212d(Application application) {
        if (!f336b) {
            ILogger iLogger = C1338b.f338a;
            f337c = iLogger;
            iLogger.info(ILogger.defaultTag, "ARouter init start.");
            f336b = C1338b.m225k(application);
            if (f336b) {
                C1338b.m222e();
            }
            C1338b.f338a.info(ILogger.defaultTag, "ARouter init over.");
        }
    }

    /* renamed from: h */
    public static synchronized void m213h() {
        synchronized (C1337a.class) {
            C1338b.m227o();
        }
    }

    /* renamed from: i */
    public static synchronized void m214i() {
        synchronized (C1337a.class) {
            C1338b.m228p();
        }
    }

    /* renamed from: a */
    public Postcard mo15011a(String str) {
        return C1338b.m224j().mo15016f(str);
    }

    /* renamed from: e */
    public void mo15012e(Object obj) {
        C1338b.m226l(obj);
    }

    /* renamed from: f */
    public Object mo15013f(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        return C1338b.m224j().mo15019m(context, postcard, i, navigationCallback);
    }

    /* renamed from: g */
    public <T> T mo15014g(Class<? extends T> cls) {
        return C1338b.m224j().mo15020n(cls);
    }
}
