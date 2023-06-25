package p553f.p554a.p556d.p558b;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p560f.C8938c;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.C8947b;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8949b;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p556d.p558b.p561g.p563d.C8952a;
import p553f.p554a.p556d.p558b.p561g.p563d.C8953b;
import p553f.p554a.p556d.p558b.p561g.p564e.C8954a;
import p553f.p554a.p556d.p558b.p561g.p564e.C8955b;
import p553f.p554a.p556d.p558b.p561g.p565f.C8956a;
import p553f.p554a.p556d.p558b.p561g.p565f.C8958b;
import p553f.p554a.p570e.p571a.C9024l;
import p630io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;

/* renamed from: f.a.d.b.c */
/* compiled from: FlutterEnginePluginRegistry */
public class C8920c implements C8947b, C8949b {
    @NonNull

    /* renamed from: a */
    public final Map<Class<? extends C8944a>, C8944a> f17487a = new HashMap();
    @NonNull

    /* renamed from: b */
    public final C8916a f17488b;
    @NonNull

    /* renamed from: c */
    public final C8944a.C8946b f17489c;
    @NonNull

    /* renamed from: d */
    public final Map<Class<? extends C8944a>, C8948a> f17490d = new HashMap();
    @Nullable

    /* renamed from: e */
    public Activity f17491e;
    @Nullable

    /* renamed from: f */
    public C8923c f17492f;

    /* renamed from: g */
    public boolean f17493g = false;
    @NonNull

    /* renamed from: h */
    public final Map<Class<? extends C8944a>, C8956a> f17494h = new HashMap();
    @Nullable

    /* renamed from: i */
    public Service f17495i;
    @Nullable

    /* renamed from: j */
    public C8926f f17496j;
    @NonNull

    /* renamed from: k */
    public final Map<Class<? extends C8944a>, C8952a> f17497k = new HashMap();
    @Nullable

    /* renamed from: l */
    public BroadcastReceiver f17498l;
    @Nullable

    /* renamed from: m */
    public C8924d f17499m;
    @NonNull

    /* renamed from: n */
    public final Map<Class<? extends C8944a>, C8954a> f17500n = new HashMap();
    @Nullable

    /* renamed from: o */
    public ContentProvider f17501o;
    @Nullable

    /* renamed from: p */
    public C8925e f17502p;

    /* renamed from: f.a.d.b.c$b */
    /* compiled from: FlutterEnginePluginRegistry */
    public static class C8922b implements C8944a.C8945a {

        /* renamed from: a */
        public final C8938c f17503a;

        /* renamed from: a */
        public String mo46414a(@NonNull String str) {
            return this.f17503a.mo46454f(str);
        }

        public C8922b(@NonNull C8938c cVar) {
            this.f17503a = cVar;
        }
    }

    /* renamed from: f.a.d.b.c$c */
    /* compiled from: FlutterEnginePluginRegistry */
    public static class C8923c implements C8950c {
        @NonNull

        /* renamed from: a */
        public final Activity f17504a;
        @NonNull

        /* renamed from: b */
        public final Set<C9024l.C9028d> f17505b = new HashSet();
        @NonNull

        /* renamed from: c */
        public final Set<C9024l.C9025a> f17506c = new HashSet();
        @NonNull

        /* renamed from: d */
        public final Set<C9024l.C9026b> f17507d = new HashSet();
        @NonNull

        /* renamed from: e */
        public final Set<C9024l.C9029e> f17508e = new HashSet();
        @NonNull

        /* renamed from: f */
        public final Set<C8950c.C8951a> f17509f = new HashSet();

        public C8923c(@NonNull Activity activity, @NonNull Lifecycle lifecycle) {
            this.f17504a = activity;
            new HiddenLifecycleReference(lifecycle);
        }

        /* renamed from: a */
        public void mo46415a(@NonNull C9024l.C9025a aVar) {
            this.f17506c.add(aVar);
        }

        public void addOnSaveStateListener(@NonNull C8950c.C8951a aVar) {
            this.f17509f.add(aVar);
        }

        /* renamed from: b */
        public void mo46417b(@NonNull C9024l.C9028d dVar) {
            this.f17505b.add(dVar);
        }

        /* renamed from: c */
        public void mo46418c(@NonNull C9024l.C9026b bVar) {
            this.f17507d.add(bVar);
        }

        @NonNull
        /* renamed from: d */
        public Activity mo46419d() {
            return this.f17504a;
        }

        /* renamed from: e */
        public void mo46420e(@NonNull C9024l.C9025a aVar) {
            this.f17506c.remove(aVar);
        }

        /* renamed from: f */
        public void mo46421f(@NonNull C9024l.C9028d dVar) {
            this.f17505b.remove(dVar);
        }

        /* renamed from: g */
        public void mo46422g(@NonNull C9024l.C9029e eVar) {
            this.f17508e.add(eVar);
        }

        /* renamed from: h */
        public boolean mo46423h(int i, int i2, @Nullable Intent intent) {
            Iterator it = new HashSet(this.f17506c).iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (((C9024l.C9025a) it.next()).mo20939a(i, i2, intent) || z) {
                        z = true;
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo46424i(@Nullable Intent intent) {
            for (C9024l.C9026b onNewIntent : this.f17507d) {
                onNewIntent.onNewIntent(intent);
            }
        }

        /* renamed from: j */
        public boolean mo46425j(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
            Iterator<C9024l.C9028d> it = this.f17505b.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    if (it.next().onRequestPermissionsResult(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
            }
        }

        /* renamed from: k */
        public void mo46426k(@Nullable Bundle bundle) {
            for (C8950c.C8951a b : this.f17509f) {
                b.mo46470b(bundle);
            }
        }

        /* renamed from: l */
        public void mo46427l(@NonNull Bundle bundle) {
            for (C8950c.C8951a c : this.f17509f) {
                c.mo46471c(bundle);
            }
        }

        /* renamed from: m */
        public void mo46428m() {
            for (C9024l.C9029e onUserLeaveHint : this.f17508e) {
                onUserLeaveHint.onUserLeaveHint();
            }
        }

        public void removeOnSaveStateListener(@NonNull C8950c.C8951a aVar) {
            this.f17509f.remove(aVar);
        }
    }

    /* renamed from: f.a.d.b.c$d */
    /* compiled from: FlutterEnginePluginRegistry */
    public static class C8924d implements C8953b {
    }

    /* renamed from: f.a.d.b.c$e */
    /* compiled from: FlutterEnginePluginRegistry */
    public static class C8925e implements C8955b {
    }

    /* renamed from: f.a.d.b.c$f */
    /* compiled from: FlutterEnginePluginRegistry */
    public static class C8926f implements C8958b {
        @NonNull

        /* renamed from: a */
        public final Set<C8956a.C8957a> f17510a;

        public void addOnModeChangeListener(@NonNull C8956a.C8957a aVar) {
            this.f17510a.add(aVar);
        }

        public void removeOnModeChangeListener(@NonNull C8956a.C8957a aVar) {
            this.f17510a.remove(aVar);
        }
    }

    public C8920c(@NonNull Context context, @NonNull C8916a aVar, @NonNull C8938c cVar) {
        this.f17488b = aVar;
        this.f17489c = new C8944a.C8946b(context, aVar, aVar.mo46371h(), aVar.mo46380q(), aVar.mo46378o().mo46693G(), new C8922b(cVar));
    }

    /* renamed from: a */
    public boolean mo46391a(int i, int i2, @Nullable Intent intent) {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onActivityResult() to plugins.");
        if (mo46404n()) {
            return this.f17492f.mo46423h(i, i2, intent);
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }

    /* renamed from: b */
    public void mo46392b(@Nullable Bundle bundle) {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onRestoreInstanceState() to plugins.");
        if (mo46404n()) {
            this.f17492f.mo46426k(bundle);
        } else {
            C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: c */
    public void mo46393c(@NonNull Bundle bundle) {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onSaveInstanceState() to plugins.");
        if (mo46404n()) {
            this.f17492f.mo46427l(bundle);
        } else {
            C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    /* renamed from: d */
    public void mo46394d(@NonNull Activity activity, @NonNull Lifecycle lifecycle) {
        StringBuilder sb = new StringBuilder();
        sb.append("Attaching to an Activity: ");
        sb.append(activity);
        sb.append(MAPCookie.DOT);
        sb.append(this.f17493g ? " This is after a config change." : "");
        C8896b.m24032d("FlutterEnginePluginRegistry", sb.toString());
        mo46399i();
        this.f17491e = activity;
        this.f17492f = new C8923c(activity, lifecycle);
        this.f17488b.mo46378o().mo46709s(activity, this.f17488b.mo46380q(), this.f17488b.mo46371h());
        for (C8948a next : this.f17490d.values()) {
            if (this.f17493g) {
                next.onReattachedToActivityForConfigChanges(this.f17492f);
            } else {
                next.onAttachedToActivity(this.f17492f);
            }
        }
        this.f17493g = false;
    }

    /* renamed from: e */
    public void mo46395e() {
        if (mo46404n()) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Detaching from an Activity: " + this.f17491e);
            for (C8948a onDetachedFromActivity : this.f17490d.values()) {
                onDetachedFromActivity.onDetachedFromActivity();
            }
            this.f17488b.mo46378o().mo46687A();
            this.f17491e = null;
            this.f17492f = null;
            return;
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    /* renamed from: f */
    public void mo46396f() {
        if (mo46404n()) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Detaching from an Activity for config changes: " + this.f17491e);
            this.f17493g = true;
            for (C8948a onDetachedFromActivityForConfigChanges : this.f17490d.values()) {
                onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
            }
            this.f17488b.mo46378o().mo46687A();
            this.f17491e = null;
            this.f17492f = null;
            return;
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    /* renamed from: g */
    public void mo46397g(@NonNull C8944a aVar) {
        if (mo46403m(aVar.getClass())) {
            C8896b.m24033e("FlutterEnginePluginRegistry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f17488b + ").");
            return;
        }
        C8896b.m24032d("FlutterEnginePluginRegistry", "Adding plugin: " + aVar);
        this.f17487a.put(aVar.getClass(), aVar);
        aVar.onAttachedToEngine(this.f17489c);
        if (aVar instanceof C8948a) {
            C8948a aVar2 = (C8948a) aVar;
            this.f17490d.put(aVar.getClass(), aVar2);
            if (mo46404n()) {
                aVar2.onAttachedToActivity(this.f17492f);
            }
        }
        if (aVar instanceof C8956a) {
            C8956a aVar3 = (C8956a) aVar;
            this.f17494h.put(aVar.getClass(), aVar3);
            if (mo46410q()) {
                aVar3.mo46476a(this.f17496j);
            }
        }
        if (aVar instanceof C8952a) {
            C8952a aVar4 = (C8952a) aVar;
            this.f17497k.put(aVar.getClass(), aVar4);
            if (mo46405o()) {
                aVar4.mo46472a(this.f17499m);
            }
        }
        if (aVar instanceof C8954a) {
            C8954a aVar5 = (C8954a) aVar;
            this.f17500n.put(aVar.getClass(), aVar5);
            if (mo46409p()) {
                aVar5.mo46475b(this.f17502p);
            }
        }
    }

    /* renamed from: h */
    public void mo46398h() {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Destroying.");
        mo46399i();
        mo46413t();
    }

    /* renamed from: i */
    public final void mo46399i() {
        if (mo46404n()) {
            mo46395e();
        } else if (mo46410q()) {
            mo46402l();
        } else if (mo46405o()) {
            mo46400j();
        } else if (mo46409p()) {
            mo46401k();
        }
    }

    /* renamed from: j */
    public void mo46400j() {
        if (mo46405o()) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Detaching from BroadcastReceiver: " + this.f17498l);
            for (C8952a b : this.f17497k.values()) {
                b.mo46473b();
            }
            return;
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
    }

    /* renamed from: k */
    public void mo46401k() {
        if (mo46409p()) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Detaching from ContentProvider: " + this.f17501o);
            for (C8954a a : this.f17500n.values()) {
                a.mo46474a();
            }
            return;
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
    }

    /* renamed from: l */
    public void mo46402l() {
        if (mo46410q()) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Detaching from a Service: " + this.f17495i);
            for (C8956a b : this.f17494h.values()) {
                b.mo46477b();
            }
            this.f17495i = null;
            this.f17496j = null;
            return;
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to detach plugins from a Service when no Service was attached.");
    }

    /* renamed from: m */
    public boolean mo46403m(@NonNull Class<? extends C8944a> cls) {
        return this.f17487a.containsKey(cls);
    }

    /* renamed from: n */
    public final boolean mo46404n() {
        return this.f17491e != null;
    }

    /* renamed from: o */
    public final boolean mo46405o() {
        return this.f17498l != null;
    }

    public void onNewIntent(@NonNull Intent intent) {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onNewIntent() to plugins.");
        if (mo46404n()) {
            this.f17492f.mo46424i(intent);
        } else {
            C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onRequestPermissionsResult() to plugins.");
        if (mo46404n()) {
            return this.f17492f.mo46425j(i, strArr, iArr);
        }
        C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }

    public void onUserLeaveHint() {
        C8896b.m24032d("FlutterEnginePluginRegistry", "Forwarding onUserLeaveHint() to plugins.");
        if (mo46404n()) {
            this.f17492f.mo46428m();
        } else {
            C8896b.m24030b("FlutterEnginePluginRegistry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    /* renamed from: p */
    public final boolean mo46409p() {
        return this.f17501o != null;
    }

    /* renamed from: q */
    public final boolean mo46410q() {
        return this.f17495i != null;
    }

    /* renamed from: r */
    public void mo46411r(@NonNull Class<? extends C8944a> cls) {
        C8944a aVar = this.f17487a.get(cls);
        if (aVar != null) {
            C8896b.m24032d("FlutterEnginePluginRegistry", "Removing plugin: " + aVar);
            if (aVar instanceof C8948a) {
                if (mo46404n()) {
                    ((C8948a) aVar).onDetachedFromActivity();
                }
                this.f17490d.remove(cls);
            }
            if (aVar instanceof C8956a) {
                if (mo46410q()) {
                    ((C8956a) aVar).mo46477b();
                }
                this.f17494h.remove(cls);
            }
            if (aVar instanceof C8952a) {
                if (mo46405o()) {
                    ((C8952a) aVar).mo46473b();
                }
                this.f17497k.remove(cls);
            }
            if (aVar instanceof C8954a) {
                if (mo46409p()) {
                    ((C8954a) aVar).mo46474a();
                }
                this.f17500n.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f17489c);
            this.f17487a.remove(cls);
        }
    }

    /* renamed from: s */
    public void mo46412s(@NonNull Set<Class<? extends C8944a>> set) {
        for (Class<? extends C8944a> r : set) {
            mo46411r(r);
        }
    }

    /* renamed from: t */
    public void mo46413t() {
        mo46412s(new HashSet(this.f17487a.keySet()));
        this.f17487a.clear();
    }
}
