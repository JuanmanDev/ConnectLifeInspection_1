package com.alibaba.android.arouter.core;

import android.content.Context;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p040c.p041a.p042a.p043a.p044a.C1334a;
import p040c.p041a.p042a.p043a.p044a.C1336b;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p041a.p042a.p043a.p046c.C1343a;
import p040c.p041a.p042a.p043a.p047d.C1351c;

@Route(path = "/arouter/service/interceptor")
public class InterceptorServiceImpl implements InterceptorService {

    /* renamed from: a */
    public static boolean f6865a;

    /* renamed from: b */
    public static final Object f6866b = new Object();

    /* renamed from: com.alibaba.android.arouter.core.InterceptorServiceImpl$a */
    public class C3741a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Postcard f6867e;

        /* renamed from: l */
        public final /* synthetic */ InterceptorCallback f6868l;

        public C3741a(InterceptorServiceImpl interceptorServiceImpl, Postcard postcard, InterceptorCallback interceptorCallback) {
            this.f6867e = postcard;
            this.f6868l = interceptorCallback;
        }

        public void run() {
            C1343a aVar = new C1343a(C1336b.f334f.size());
            try {
                InterceptorServiceImpl.m9429a(0, aVar, this.f6867e);
                aVar.await((long) this.f6867e.getTimeout(), TimeUnit.SECONDS);
                if (aVar.getCount() > 0) {
                    this.f6868l.onInterrupt(new HandlerException("The interceptor processing timed out."));
                } else if (this.f6867e.getTag() != null) {
                    this.f6868l.onInterrupt(new HandlerException(this.f6867e.getTag().toString()));
                } else {
                    this.f6868l.onContinue(this.f6867e);
                }
            } catch (Exception e) {
                this.f6868l.onInterrupt(e);
            }
        }
    }

    /* renamed from: com.alibaba.android.arouter.core.InterceptorServiceImpl$b */
    public static class C3742b implements InterceptorCallback {

        /* renamed from: a */
        public final /* synthetic */ C1343a f6869a;

        /* renamed from: b */
        public final /* synthetic */ int f6870b;

        /* renamed from: c */
        public final /* synthetic */ Postcard f6871c;

        public C3742b(C1343a aVar, int i, Postcard postcard) {
            this.f6869a = aVar;
            this.f6870b = i;
            this.f6871c = postcard;
        }

        public void onContinue(Postcard postcard) {
            this.f6869a.countDown();
            InterceptorServiceImpl.m9429a(this.f6870b + 1, this.f6869a, postcard);
        }

        public void onInterrupt(Throwable th) {
            this.f6871c.setTag(th == null ? new HandlerException("No message.") : th.getMessage());
            this.f6869a.mo15027a();
        }
    }

    /* renamed from: com.alibaba.android.arouter.core.InterceptorServiceImpl$c */
    public class C3743c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Context f6872e;

        public C3743c(InterceptorServiceImpl interceptorServiceImpl, Context context) {
            this.f6872e = context;
        }

        public void run() {
            if (C1351c.m247b(C1336b.f333e)) {
                for (Map.Entry<Integer, Class<? extends IInterceptor>> value : C1336b.f333e.entrySet()) {
                    Class cls = (Class) value.getValue();
                    try {
                        IInterceptor iInterceptor = (IInterceptor) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                        iInterceptor.init(this.f6872e);
                        C1336b.f334f.add(iInterceptor);
                    } catch (Exception e) {
                        throw new HandlerException("ARouter::ARouter init interceptor error! name = [" + cls.getName() + "], reason = [" + e.getMessage() + "]");
                    }
                }
                boolean unused = InterceptorServiceImpl.f6865a = true;
                C1337a.f337c.info(ILogger.defaultTag, "ARouter interceptors init over.");
                synchronized (InterceptorServiceImpl.f6866b) {
                    InterceptorServiceImpl.f6866b.notifyAll();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9429a(int i, C1343a aVar, Postcard postcard) {
        if (i < C1336b.f334f.size()) {
            C1336b.f334f.get(i).process(postcard, new C3742b(aVar, i, postcard));
        }
    }

    /* renamed from: e */
    public static void m9433e() {
        synchronized (f6866b) {
            while (!f6865a) {
                try {
                    f6866b.wait(10000);
                } catch (InterruptedException e) {
                    throw new HandlerException("ARouter::Interceptor init cost too much time error! reason = [" + e.getMessage() + "]");
                }
            }
        }
    }

    public void doInterceptions(Postcard postcard, InterceptorCallback interceptorCallback) {
        List<IInterceptor> list = C1336b.f334f;
        if (list == null || list.size() <= 0) {
            interceptorCallback.onContinue(postcard);
            return;
        }
        m9433e();
        if (!f6865a) {
            interceptorCallback.onInterrupt(new HandlerException("Interceptors initialization takes too much time."));
        } else {
            C1334a.f326b.execute(new C3741a(this, postcard, interceptorCallback));
        }
    }

    public void init(Context context) {
        C1334a.f326b.execute(new C3743c(this, context));
    }
}
