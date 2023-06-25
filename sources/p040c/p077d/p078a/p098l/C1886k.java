package p040c.p077d.p078a.p098l;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.app.Person;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.C1546g;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.l.k */
/* compiled from: RequestManagerRetriever */
public class C1886k implements Handler.Callback {

    /* renamed from: s */
    public static final C1888b f1493s = new C1887a();

    /* renamed from: e */
    public volatile C1546g f1494e;
    @VisibleForTesting

    /* renamed from: l */
    public final Map<FragmentManager, RequestManagerFragment> f1495l = new HashMap();
    @VisibleForTesting

    /* renamed from: m */
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> f1496m = new HashMap();

    /* renamed from: n */
    public final Handler f1497n;

    /* renamed from: o */
    public final C1888b f1498o;

    /* renamed from: p */
    public final ArrayMap<View, Fragment> f1499p = new ArrayMap<>();

    /* renamed from: q */
    public final ArrayMap<View, android.app.Fragment> f1500q = new ArrayMap<>();

    /* renamed from: r */
    public final Bundle f1501r = new Bundle();

    /* renamed from: c.d.a.l.k$a */
    /* compiled from: RequestManagerRetriever */
    public class C1887a implements C1888b {
        @NonNull
        /* renamed from: a */
        public C1546g mo16223a(@NonNull C1541c cVar, @NonNull C1883h hVar, @NonNull C1889l lVar, @NonNull Context context) {
            return new C1546g(cVar, hVar, lVar, context);
        }
    }

    /* renamed from: c.d.a.l.k$b */
    /* compiled from: RequestManagerRetriever */
    public interface C1888b {
        @NonNull
        /* renamed from: a */
        C1546g mo16223a(@NonNull C1541c cVar, @NonNull C1883h hVar, @NonNull C1889l lVar, @NonNull Context context);
    }

    public C1886k(@Nullable C1888b bVar) {
        this.f1498o = bVar == null ? f1493s : bVar;
        this.f1497n = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m2256a(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: e */
    public static void m2257e(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    m2257e(next.getChildFragmentManager().getFragments(), map);
                }
            }
        }
    }

    /* renamed from: t */
    public static boolean m2258t(Activity activity) {
        return !activity.isFinishing();
    }

    @Nullable
    /* renamed from: b */
    public final Activity mo16204b(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return mo16204b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: c */
    public final void mo16205c(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    arrayMap.put(next.getView(), next);
                    mo16205c(next.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        mo16206d(fragmentManager, arrayMap);
    }

    @Deprecated
    /* renamed from: d */
    public final void mo16206d(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f1501r.putInt(Person.KEY_KEY, i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f1501r, Person.KEY_KEY);
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    if (Build.VERSION.SDK_INT >= 17) {
                        mo16205c(fragment.getChildFragmentManager(), arrayMap);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    @Deprecated
    @Nullable
    /* renamed from: f */
    public final android.app.Fragment mo16207f(@NonNull View view, @NonNull Activity activity) {
        this.f1500q.clear();
        mo16205c(activity.getFragmentManager(), this.f1500q);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f1500q.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f1500q.clear();
        return fragment;
    }

    @Nullable
    /* renamed from: g */
    public final Fragment mo16208g(@NonNull View view, @NonNull FragmentActivity fragmentActivity) {
        this.f1499p.clear();
        m2257e(fragmentActivity.getSupportFragmentManager().getFragments(), this.f1499p);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f1499p.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f1499p.clear();
        return fragment;
    }

    @NonNull
    @Deprecated
    /* renamed from: h */
    public final C1546g mo16209h(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment q = mo16219q(fragmentManager, fragment, z);
        C1546g e = q.mo21708e();
        if (e != null) {
            return e;
        }
        C1546g a = this.f1498o.mo16223a(C1541c.m1093d(context), q.mo21706b(), q.mo21709f(), context);
        q.mo21713j(a);
        return a;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f1495l.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                "Failed to remove expected request manager fragment, manager: " + obj;
            }
            return z;
        } else {
            obj3 = (androidx.fragment.app.FragmentManager) message.obj;
            obj2 = this.f1496m.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        "Failed to remove expected request manager fragment, manager: " + obj;
        return z;
    }

    @NonNull
    /* renamed from: i */
    public C1546g mo16211i(@NonNull Activity activity) {
        if (C1950j.m2580p()) {
            return mo16213k(activity.getApplicationContext());
        }
        m2256a(activity);
        return mo16209h(activity, activity.getFragmentManager(), (android.app.Fragment) null, m2258t(activity));
    }

    @TargetApi(17)
    @NonNull
    @Deprecated
    /* renamed from: j */
    public C1546g mo16212j(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C1950j.m2580p() || Build.VERSION.SDK_INT < 17) {
            return mo16213k(fragment.getActivity().getApplicationContext());
        } else {
            return mo16209h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @NonNull
    /* renamed from: k */
    public C1546g mo16213k(@NonNull Context context) {
        if (context != null) {
            if (C1950j.m2581q() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo16216n((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo16211i((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo16213k(((ContextWrapper) context).getBaseContext());
                }
            }
            return mo16217o(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    /* renamed from: l */
    public C1546g mo16214l(@NonNull View view) {
        if (C1950j.m2580p()) {
            return mo16213k(view.getContext().getApplicationContext());
        }
        C1949i.m2563d(view);
        C1949i.m2564e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity b = mo16204b(view.getContext());
        if (b == null) {
            return mo16213k(view.getContext().getApplicationContext());
        }
        if (b instanceof FragmentActivity) {
            Fragment g = mo16208g(view, (FragmentActivity) b);
            return g != null ? mo16215m(g) : mo16211i(b);
        }
        android.app.Fragment f = mo16207f(view, b);
        if (f == null) {
            return mo16211i(b);
        }
        return mo16212j(f);
    }

    @NonNull
    /* renamed from: m */
    public C1546g mo16215m(@NonNull Fragment fragment) {
        C1949i.m2564e(fragment.getActivity(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C1950j.m2580p()) {
            return mo16213k(fragment.getActivity().getApplicationContext());
        }
        return mo16222u(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @NonNull
    /* renamed from: n */
    public C1546g mo16216n(@NonNull FragmentActivity fragmentActivity) {
        if (C1950j.m2580p()) {
            return mo16213k(fragmentActivity.getApplicationContext());
        }
        m2256a(fragmentActivity);
        return mo16222u(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m2258t(fragmentActivity));
    }

    @NonNull
    /* renamed from: o */
    public final C1546g mo16217o(@NonNull Context context) {
        if (this.f1494e == null) {
            synchronized (this) {
                if (this.f1494e == null) {
                    this.f1494e = this.f1498o.mo16223a(C1541c.m1093d(context.getApplicationContext()), new C1875b(), new C1882g(), context.getApplicationContext());
                }
            }
        }
        return this.f1494e;
    }

    @NonNull
    @Deprecated
    /* renamed from: p */
    public RequestManagerFragment mo16218p(Activity activity) {
        return mo16219q(activity.getFragmentManager(), (android.app.Fragment) null, m2258t(activity));
    }

    @NonNull
    /* renamed from: q */
    public final RequestManagerFragment mo16219q(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = this.f1495l.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.mo21712i(fragment);
            if (z) {
                requestManagerFragment.mo21706b().mo16197d();
            }
            this.f1495l.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f1497n.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @NonNull
    /* renamed from: r */
    public SupportRequestManagerFragment mo16220r(FragmentActivity fragmentActivity) {
        return mo16221s(fragmentActivity.getSupportFragmentManager(), (Fragment) null, m2258t(fragmentActivity));
    }

    @NonNull
    /* renamed from: s */
    public final SupportRequestManagerFragment mo16221s(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.f1496m.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.mo21729x(fragment);
            if (z) {
                supportRequestManagerFragment.mo21723r().mo16197d();
            }
            this.f1496m.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.beginTransaction().add((Fragment) supportRequestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f1497n.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    @NonNull
    /* renamed from: u */
    public final C1546g mo16222u(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        SupportRequestManagerFragment s = mo16221s(fragmentManager, fragment, z);
        C1546g t = s.mo21725t();
        if (t != null) {
            return t;
        }
        C1546g a = this.f1498o.mo16223a(C1541c.m1093d(context), s.mo21723r(), s.mo21726u(), context);
        s.mo21730y(a);
        return a;
    }
}
