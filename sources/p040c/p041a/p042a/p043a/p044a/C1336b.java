package p040c.p041a.p042a.p043a.p044a;

import com.alibaba.android.arouter.base.UniqueKeyTreeMap;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.a.a.a.a.b */
/* compiled from: Warehouse */
public class C1336b {

    /* renamed from: a */
    public static Map<String, Class<? extends IRouteGroup>> f329a = new HashMap();

    /* renamed from: b */
    public static Map<String, RouteMeta> f330b = new HashMap();

    /* renamed from: c */
    public static Map<Class, IProvider> f331c = new HashMap();

    /* renamed from: d */
    public static Map<String, RouteMeta> f332d = new HashMap();

    /* renamed from: e */
    public static Map<Integer, Class<? extends IInterceptor>> f333e = new UniqueKeyTreeMap("More than one interceptors use same priority [%s]");

    /* renamed from: f */
    public static List<IInterceptor> f334f = new ArrayList();
}
