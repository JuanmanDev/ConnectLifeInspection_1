package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.C1573g;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p081k.p082i.C1582f;
import p040c.p077d.p078a.p081k.p084j.C1655i;
import p040c.p077d.p078a.p081k.p084j.C1682s;
import p040c.p077d.p078a.p081k.p084j.C1685u;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p081k.p089k.C1758o;
import p040c.p077d.p078a.p081k.p089k.C1759p;
import p040c.p077d.p078a.p081k.p091l.p097h.C1870e;
import p040c.p077d.p078a.p081k.p091l.p097h.C1871f;
import p040c.p077d.p078a.p100n.C1898a;
import p040c.p077d.p078a.p100n.C1900b;
import p040c.p077d.p078a.p100n.C1901c;
import p040c.p077d.p078a.p100n.C1902d;
import p040c.p077d.p078a.p100n.C1903e;
import p040c.p077d.p078a.p100n.C1905f;
import p040c.p077d.p078a.p105q.p106k.C1952a;

public class Registry {

    /* renamed from: a */
    public final C1759p f7013a;

    /* renamed from: b */
    public final C1898a f7014b;

    /* renamed from: c */
    public final C1903e f7015c;

    /* renamed from: d */
    public final C1905f f7016d;

    /* renamed from: e */
    public final C1582f f7017e;

    /* renamed from: f */
    public final C1871f f7018f;

    /* renamed from: g */
    public final C1900b f7019g;

    /* renamed from: h */
    public final C1902d f7020h = new C1902d();

    /* renamed from: i */
    public final C1901c f7021i = new C1901c();

    /* renamed from: j */
    public final Pools.Pool<List<Throwable>> f7022j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> e = C1952a.m2589e();
        this.f7022j = e;
        this.f7013a = new C1759p(e);
        this.f7014b = new C1898a();
        this.f7015c = new C1903e();
        this.f7016d = new C1905f();
        this.f7017e = new C1582f();
        this.f7018f = new C1871f();
        this.f7019g = new C1900b();
        mo21655r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    @NonNull
    /* renamed from: a */
    public <Data> Registry mo21638a(@NonNull Class<Data> cls, @NonNull C1565a<Data> aVar) {
        this.f7014b.mo16240a(cls, aVar);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public <TResource> Registry mo21639b(@NonNull Class<TResource> cls, @NonNull C1573g<TResource> gVar) {
        this.f7016d.mo16257a(cls, gVar);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public <Data, TResource> Registry mo21640c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C1572f<Data, TResource> fVar) {
        mo21642e("legacy_append", cls, cls2, fVar);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public <Model, Data> Registry mo21641d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull C1758o<Model, Data> oVar) {
        this.f7013a.mo16030a(cls, cls2, oVar);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public <Data, TResource> Registry mo21642e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull C1572f<Data, TResource> fVar) {
        this.f7015c.mo16251a(str, fVar, cls, cls2);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final <Data, TResource, Transcode> List<C1655i<Data, TResource, Transcode>> mo21643f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f7015c.mo16254d(cls, cls2)) {
            for (Class next2 : this.f7018f.mo16191b(next, cls3)) {
                arrayList.add(new C1655i(cls, next, next2, this.f7015c.mo16252b(cls, next), this.f7018f.mo16190a(next, next2), this.f7022j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: g */
    public List<ImageHeaderParser> mo21644g() {
        List<ImageHeaderParser> b = this.f7019g.mo16244b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new NoImageHeaderParserException();
    }

    @Nullable
    /* renamed from: h */
    public <Data, TResource, Transcode> C1682s<Data, TResource, Transcode> mo21645h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        C1682s<Data, TResource, Transcode> a = this.f7021i.mo16245a(cls, cls2, cls3);
        if (this.f7021i.mo16247c(a)) {
            return null;
        }
        if (a == null) {
            List<C1655i<Data, TResource, Transcode>> f = mo21643f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C1682s<>(cls, cls2, cls3, f, this.f7022j);
            }
            this.f7021i.mo16248d(cls, cls2, cls3, a);
        }
        return a;
    }

    @NonNull
    /* renamed from: i */
    public <Model> List<C1756n<Model, ?>> mo21646i(@NonNull Model model) {
        List<C1756n<Model, ?>> d = this.f7013a.mo16032d(model);
        if (!d.isEmpty()) {
            return d;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    @NonNull
    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo21647j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> a = this.f7020h.mo16249a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f7013a.mo16031c(cls)) {
                for (Class next : this.f7015c.mo16254d(d, cls2)) {
                    if (!this.f7018f.mo16191b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f7020h.mo16250b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    @NonNull
    /* renamed from: k */
    public <X> C1573g<X> mo21648k(@NonNull C1685u<X> uVar) {
        C1573g<X> b = this.f7016d.mo16258b(uVar.mo15869e());
        if (b != null) {
            return b;
        }
        throw new NoResultEncoderAvailableException(uVar.mo15869e());
    }

    @NonNull
    /* renamed from: l */
    public <X> C1580e<X> mo21649l(@NonNull X x) {
        return this.f7017e.mo15649a(x);
    }

    @NonNull
    /* renamed from: m */
    public <X> C1565a<X> mo21650m(@NonNull X x) {
        C1565a<X> b = this.f7014b.mo16241b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean mo21651n(@NonNull C1685u<?> uVar) {
        return this.f7016d.mo16258b(uVar.mo15869e()) != null;
    }

    @NonNull
    /* renamed from: o */
    public Registry mo21652o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f7019g.mo16243a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public Registry mo21653p(@NonNull C1580e.C1581a<?> aVar) {
        this.f7017e.mo15650b(aVar);
        return this;
    }

    @NonNull
    /* renamed from: q */
    public <TResource, Transcode> Registry mo21654q(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull C1870e<TResource, Transcode> eVar) {
        this.f7018f.mo16192c(cls, cls2, eVar);
        return this;
    }

    @NonNull
    /* renamed from: r */
    public final Registry mo21655r(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f7015c.mo16255e(arrayList);
        return this;
    }
}
