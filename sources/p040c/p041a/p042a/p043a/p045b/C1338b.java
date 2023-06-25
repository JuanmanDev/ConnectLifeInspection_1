package p040c.p041a.p042a.p043a.p045b;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
import com.alibaba.android.arouter.facade.service.PretreatmentService;
import com.alibaba.android.arouter.facade.template.ILogger;
import java.util.concurrent.ThreadPoolExecutor;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p041a.p042a.p043a.p044a.C1334a;
import p040c.p041a.p042a.p043a.p046c.C1344b;
import p040c.p041a.p042a.p043a.p047d.C1350b;
import p040c.p041a.p042a.p043a.p047d.C1353e;

/* renamed from: c.a.a.a.b.b */
/* compiled from: _ARouter */
public final class C1338b {

    /* renamed from: a */
    public static ILogger f338a = new C1350b(ILogger.defaultTag);

    /* renamed from: b */
    public static volatile boolean f339b = false;

    /* renamed from: c */
    public static volatile C1338b f340c = null;

    /* renamed from: d */
    public static volatile boolean f341d = false;

    /* renamed from: e */
    public static volatile ThreadPoolExecutor f342e = C1344b.m238a();

    /* renamed from: f */
    public static Handler f343f;

    /* renamed from: g */
    public static Context f344g;

    /* renamed from: h */
    public static InterceptorService f345h;

    /* renamed from: c.a.a.a.b.b$a */
    /* compiled from: _ARouter */
    public class C1339a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Postcard f346e;

        public C1339a(C1338b bVar, Postcard postcard) {
            this.f346e = postcard;
        }

        public void run() {
            Context b = C1338b.f344g;
            Toast.makeText(b, "There's no route matched!\n Path = [" + this.f346e.getPath() + "]\n Group = [" + this.f346e.getGroup() + "]", 1).show();
        }
    }

    /* renamed from: c.a.a.a.b.b$b */
    /* compiled from: _ARouter */
    public class C1340b implements InterceptorCallback {

        /* renamed from: a */
        public final /* synthetic */ Context f347a;

        /* renamed from: b */
        public final /* synthetic */ int f348b;

        /* renamed from: c */
        public final /* synthetic */ NavigationCallback f349c;

        /* renamed from: d */
        public final /* synthetic */ Postcard f350d;

        public C1340b(Context context, int i, NavigationCallback navigationCallback, Postcard postcard) {
            this.f347a = context;
            this.f348b = i;
            this.f349c = navigationCallback;
            this.f350d = postcard;
        }

        public void onContinue(Postcard postcard) {
            Object unused = C1338b.this.mo15015a(this.f347a, postcard, this.f348b, this.f349c);
        }

        public void onInterrupt(Throwable th) {
            NavigationCallback navigationCallback = this.f349c;
            if (navigationCallback != null) {
                navigationCallback.onInterrupt(this.f350d);
            }
            ILogger iLogger = C1338b.f338a;
            iLogger.info(ILogger.defaultTag, "Navigation failed, termination by interceptor : " + th.getMessage());
        }
    }

    /* renamed from: c.a.a.a.b.b$c */
    /* compiled from: _ARouter */
    public class C1341c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ int f352e;

        /* renamed from: l */
        public final /* synthetic */ Context f353l;

        /* renamed from: m */
        public final /* synthetic */ Intent f354m;

        /* renamed from: n */
        public final /* synthetic */ Postcard f355n;

        /* renamed from: o */
        public final /* synthetic */ NavigationCallback f356o;

        public C1341c(int i, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
            this.f352e = i;
            this.f353l = context;
            this.f354m = intent;
            this.f355n = postcard;
            this.f356o = navigationCallback;
        }

        public void run() {
            C1338b.this.mo15022r(this.f352e, this.f353l, this.f354m, this.f355n, this.f356o);
        }
    }

    /* renamed from: c.a.a.a.b.b$d */
    /* compiled from: _ARouter */
    public static /* synthetic */ class C1342d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f358a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.alibaba.android.arouter.facade.enums.RouteType[] r0 = com.alibaba.android.arouter.facade.enums.RouteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f358a = r0
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.ACTIVITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.BOARDCAST     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.CONTENT_PROVIDER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.FRAGMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.METHOD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f358a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.alibaba.android.arouter.facade.enums.RouteType r1 = com.alibaba.android.arouter.facade.enums.RouteType.SERVICE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p041a.p042a.p043a.p045b.C1338b.C1342d.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static void m222e() {
        f345h = (InterceptorService) C1337a.m211c().mo15011a("/arouter/service/interceptor").navigation();
    }

    /* renamed from: h */
    public static boolean m223h() {
        return f339b;
    }

    /* renamed from: j */
    public static C1338b m224j() {
        if (f341d) {
            if (f340c == null) {
                synchronized (C1338b.class) {
                    if (f340c == null) {
                        f340c = new C1338b();
                    }
                }
            }
            return f340c;
        }
        throw new InitException("ARouterCore::Init::Invoke init(context) first!");
    }

    /* renamed from: k */
    public static synchronized boolean m225k(Application application) {
        synchronized (C1338b.class) {
            f344g = application;
            C1334a.m207c(application, f342e);
            f338a.info(ILogger.defaultTag, "ARouter init success!");
            f341d = true;
            f343f = new Handler(Looper.getMainLooper());
        }
        return true;
    }

    /* renamed from: l */
    public static void m226l(Object obj) {
        AutowiredService autowiredService = (AutowiredService) C1337a.m211c().mo15011a("/arouter/service/autowired").navigation();
        if (autowiredService != null) {
            autowiredService.autowire(obj);
        }
    }

    /* renamed from: o */
    public static synchronized void m227o() {
        synchronized (C1338b.class) {
            f339b = true;
            f338a.info(ILogger.defaultTag, "ARouter openDebug");
        }
    }

    /* renamed from: p */
    public static synchronized void m228p() {
        synchronized (C1338b.class) {
            f338a.showLog(true);
            f338a.info(ILogger.defaultTag, "ARouter openLog");
        }
    }

    /* renamed from: a */
    public final Object mo15015a(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        if (context == null) {
            context = f344g;
        }
        Context context2 = context;
        int i2 = C1342d.f358a[postcard.getType().ordinal()];
        if (i2 == 1) {
            Intent intent = new Intent(context2, postcard.getDestination());
            intent.putExtras(postcard.getExtras());
            int flags = postcard.getFlags();
            if (-1 != flags) {
                intent.setFlags(flags);
            } else if (!(context2 instanceof Activity)) {
                intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            }
            String action = postcard.getAction();
            if (!C1353e.m252b(action)) {
                intent.setAction(action);
            }
            mo15021q(new C1341c(i, context2, intent, postcard, navigationCallback));
            return null;
        } else if (i2 == 2) {
            return postcard.getProvider();
        } else {
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                try {
                    Object newInstance = postcard.getDestination().getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (newInstance instanceof Fragment) {
                        ((Fragment) newInstance).setArguments(postcard.getExtras());
                    } else if (newInstance instanceof androidx.fragment.app.Fragment) {
                        ((androidx.fragment.app.Fragment) newInstance).setArguments(postcard.getExtras());
                    }
                    return newInstance;
                } catch (Exception e) {
                    ILogger iLogger = f338a;
                    iLogger.error(ILogger.defaultTag, "Fetch fragment instance error, " + C1353e.m251a(e.getStackTrace()));
                }
            }
            return null;
        }
    }

    /* renamed from: f */
    public Postcard mo15016f(String str) {
        if (!C1353e.m252b(str)) {
            PathReplaceService pathReplaceService = (PathReplaceService) C1337a.m211c().mo15014g(PathReplaceService.class);
            if (pathReplaceService != null) {
                str = pathReplaceService.forString(str);
            }
            return mo15017g(str, mo15018i(str));
        }
        throw new HandlerException("ARouter::Parameter is invalid!");
    }

    /* renamed from: g */
    public Postcard mo15017g(String str, String str2) {
        if (C1353e.m252b(str) || C1353e.m252b(str2)) {
            throw new HandlerException("ARouter::Parameter is invalid!");
        }
        PathReplaceService pathReplaceService = (PathReplaceService) C1337a.m211c().mo15014g(PathReplaceService.class);
        if (pathReplaceService != null) {
            str = pathReplaceService.forString(str);
        }
        return new Postcard(str, str2);
    }

    /* renamed from: i */
    public final String mo15018i(String str) {
        if (C1353e.m252b(str) || !str.startsWith("/")) {
            throw new HandlerException("ARouter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String substring = str.substring(1, str.indexOf("/", 1));
            if (!C1353e.m252b(substring)) {
                return substring;
            }
            throw new HandlerException("ARouter::Extract the default group failed! There's nothing between 2 '/'!");
        } catch (Exception e) {
            ILogger iLogger = f338a;
            iLogger.warning(ILogger.defaultTag, "Failed to extract default group! " + e.getMessage());
            return null;
        }
    }

    /* renamed from: m */
    public Object mo15019m(Context context, Postcard postcard, int i, NavigationCallback navigationCallback) {
        PretreatmentService pretreatmentService = (PretreatmentService) C1337a.m211c().mo15014g(PretreatmentService.class);
        if (pretreatmentService != null && !pretreatmentService.onPretreatment(context, postcard)) {
            return null;
        }
        try {
            C1334a.m206b(postcard);
            if (navigationCallback != null) {
                navigationCallback.onFound(postcard);
            }
            if (postcard.isGreenChannel()) {
                return mo15015a(context, postcard, i, navigationCallback);
            }
            f345h.doInterceptions(postcard, new C1340b(context, i, navigationCallback, postcard));
            return null;
        } catch (NoRouteFoundException e) {
            f338a.warning(ILogger.defaultTag, e.getMessage());
            if (m223h()) {
                mo15021q(new C1339a(this, postcard));
            }
            if (navigationCallback != null) {
                navigationCallback.onLost(postcard);
            } else {
                DegradeService degradeService = (DegradeService) C1337a.m211c().mo15014g(DegradeService.class);
                if (degradeService != null) {
                    degradeService.onLost(context, postcard);
                }
            }
            return null;
        }
    }

    /* renamed from: n */
    public <T> T mo15020n(Class<? extends T> cls) {
        try {
            Postcard a = C1334a.m205a(cls.getName());
            if (a == null) {
                a = C1334a.m205a(cls.getSimpleName());
            }
            if (a == null) {
                return null;
            }
            C1334a.m206b(a);
            return a.getProvider();
        } catch (NoRouteFoundException e) {
            f338a.warning(ILogger.defaultTag, e.getMessage());
            return null;
        }
    }

    /* renamed from: q */
    public final void mo15021q(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            f343f.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: r */
    public final void mo15022r(int i, Context context, Intent intent, Postcard postcard, NavigationCallback navigationCallback) {
        if (i < 0) {
            ContextCompat.startActivity(context, intent, postcard.getOptionsBundle());
        } else if (context instanceof Activity) {
            ActivityCompat.startActivityForResult((Activity) context, intent, i, postcard.getOptionsBundle());
        } else {
            f338a.warning(ILogger.defaultTag, "Must use [navigation(activity, ...)] to support [startActivityForResult]");
        }
        if (!(-1 == postcard.getEnterAnim() || -1 == postcard.getExitAnim() || !(context instanceof Activity))) {
            ((Activity) context).overridePendingTransition(postcard.getEnterAnim(), postcard.getExitAnim());
        }
        if (navigationCallback != null) {
            navigationCallback.onArrival(postcard);
        }
    }
}
