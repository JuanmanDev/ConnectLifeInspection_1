package p040c.p077d.p078a;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.p081k.p084j.C1662k;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p101o.C1911e;
import p040c.p077d.p078a.p101o.C1912f;
import p040c.p077d.p078a.p101o.p102j.C1922e;
import p040c.p077d.p078a.p101o.p102j.C1926i;

/* renamed from: c.d.a.e */
/* compiled from: GlideContext */
public class C1543e extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: j */
    public static final C1549h<?, ?> f788j = new C1540b();

    /* renamed from: a */
    public final C1692b f789a;

    /* renamed from: b */
    public final Registry f790b;

    /* renamed from: c */
    public final C1922e f791c;

    /* renamed from: d */
    public final C1912f f792d;

    /* renamed from: e */
    public final List<C1911e<Object>> f793e;

    /* renamed from: f */
    public final Map<Class<?>, C1549h<?, ?>> f794f;

    /* renamed from: g */
    public final C1662k f795g;

    /* renamed from: h */
    public final boolean f796h;

    /* renamed from: i */
    public final int f797i;

    public C1543e(@NonNull Context context, @NonNull C1692b bVar, @NonNull Registry registry, @NonNull C1922e eVar, @NonNull C1912f fVar, @NonNull Map<Class<?>, C1549h<?, ?>> map, @NonNull List<C1911e<Object>> list, @NonNull C1662k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f789a = bVar;
        this.f790b = registry;
        this.f791c = eVar;
        this.f792d = fVar;
        this.f793e = list;
        this.f794f = map;
        this.f795g = kVar;
        this.f796h = z;
        this.f797i = i;
    }

    @NonNull
    /* renamed from: a */
    public <X> C1926i<ImageView, X> mo15466a(@NonNull ImageView imageView, @NonNull Class<X> cls) {
        return this.f791c.mo16383a(imageView, cls);
    }

    @NonNull
    /* renamed from: b */
    public C1692b mo15467b() {
        return this.f789a;
    }

    /* renamed from: c */
    public List<C1911e<Object>> mo15468c() {
        return this.f793e;
    }

    /* renamed from: d */
    public C1912f mo15469d() {
        return this.f792d;
    }

    @NonNull
    /* renamed from: e */
    public <T> C1549h<?, T> mo15470e(@NonNull Class<T> cls) {
        C1549h<?, T> hVar = this.f794f.get(cls);
        if (hVar == null) {
            for (Map.Entry next : this.f794f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    hVar = (C1549h) next.getValue();
                }
            }
        }
        return hVar == null ? f788j : hVar;
    }

    @NonNull
    /* renamed from: f */
    public C1662k mo15471f() {
        return this.f795g;
    }

    /* renamed from: g */
    public int mo15472g() {
        return this.f797i;
    }

    @NonNull
    /* renamed from: h */
    public Registry mo15473h() {
        return this.f790b;
    }

    /* renamed from: i */
    public boolean mo15474i() {
        return this.f796h;
    }
}
