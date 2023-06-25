package p553f.p554a.p556d.p558b.p561g.p566g;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: f.a.d.b.g.g.a */
/* compiled from: ShimPluginRegistry */
public class C8959a implements C9024l {

    /* renamed from: e */
    public final C8916a f17558e;

    /* renamed from: l */
    public final Map<String, Object> f17559l = new HashMap();

    /* renamed from: m */
    public final C8961b f17560m;

    /* renamed from: f.a.d.b.g.g.a$b */
    /* compiled from: ShimPluginRegistry */
    public static class C8961b implements C8944a, C8948a {

        /* renamed from: e */
        public final Set<C8962b> f17561e;

        /* renamed from: l */
        public C8944a.C8946b f17562l;

        /* renamed from: m */
        public C8950c f17563m;

        public C8961b() {
            this.f17561e = new HashSet();
        }

        /* renamed from: a */
        public void mo46478a(@NonNull C8962b bVar) {
            this.f17561e.add(bVar);
            C8944a.C8946b bVar2 = this.f17562l;
            if (bVar2 != null) {
                bVar.onAttachedToEngine(bVar2);
            }
            C8950c cVar = this.f17563m;
            if (cVar != null) {
                bVar.onAttachedToActivity(cVar);
            }
        }

        public void onAttachedToActivity(@NonNull C8950c cVar) {
            this.f17563m = cVar;
            for (C8962b onAttachedToActivity : this.f17561e) {
                onAttachedToActivity.onAttachedToActivity(cVar);
            }
        }

        public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
            this.f17562l = bVar;
            for (C8962b onAttachedToEngine : this.f17561e) {
                onAttachedToEngine.onAttachedToEngine(bVar);
            }
        }

        public void onDetachedFromActivity() {
            for (C8962b onDetachedFromActivity : this.f17561e) {
                onDetachedFromActivity.onDetachedFromActivity();
            }
            this.f17563m = null;
        }

        public void onDetachedFromActivityForConfigChanges() {
            for (C8962b onDetachedFromActivity : this.f17561e) {
                onDetachedFromActivity.onDetachedFromActivity();
            }
            this.f17563m = null;
        }

        public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
            for (C8962b onDetachedFromEngine : this.f17561e) {
                onDetachedFromEngine.onDetachedFromEngine(bVar);
            }
            this.f17562l = null;
            this.f17563m = null;
        }

        public void onReattachedToActivityForConfigChanges(@NonNull C8950c cVar) {
            this.f17563m = cVar;
            for (C8962b onReattachedToActivityForConfigChanges : this.f17561e) {
                onReattachedToActivityForConfigChanges.onReattachedToActivityForConfigChanges(cVar);
            }
        }
    }

    public C8959a(@NonNull C8916a aVar) {
        this.f17558e = aVar;
        this.f17560m = new C8961b();
        this.f17558e.mo46379p().mo46397g(this.f17560m);
    }

    public boolean hasPlugin(String str) {
        return this.f17559l.containsKey(str);
    }

    public C9024l.C9027c registrarFor(String str) {
        C8896b.m24032d("ShimPluginRegistry", "Creating plugin Registrar for '" + str + "'");
        if (!this.f17559l.containsKey(str)) {
            this.f17559l.put(str, (Object) null);
            C8962b bVar = new C8962b(str, this.f17559l);
            this.f17560m.mo46478a(bVar);
            return bVar;
        }
        throw new IllegalStateException("Plugin key " + str + " is already in use");
    }

    public <T> T valuePublishedByPlugin(String str) {
        return this.f17559l.get(str);
    }
}
