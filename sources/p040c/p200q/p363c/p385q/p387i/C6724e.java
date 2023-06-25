package p040c.p200q.p363c.p385q.p387i;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p040c.p200q.p363c.p385q.C6709c;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.C6714f;
import p040c.p200q.p363c.p385q.C6715g;

/* renamed from: c.q.c.q.i.e */
/* compiled from: JsonValueObjectEncoderContext */
public final class C6724e implements C6713e, C6715g {

    /* renamed from: a */
    public C6724e f12857a = null;

    /* renamed from: b */
    public boolean f12858b = true;

    /* renamed from: c */
    public final JsonWriter f12859c;

    /* renamed from: d */
    public final Map<Class<?>, C6712d<?>> f12860d;

    /* renamed from: e */
    public final Map<Class<?>, C6714f<?>> f12861e;

    /* renamed from: f */
    public final C6712d<Object> f12862f;

    /* renamed from: g */
    public final boolean f12863g;

    public C6724e(@NonNull Writer writer, @NonNull Map<Class<?>, C6712d<?>> map, @NonNull Map<Class<?>, C6714f<?>> map2, C6712d<Object> dVar, boolean z) {
        this.f12859c = new JsonWriter(writer);
        this.f12860d = map;
        this.f12861e = map2;
        this.f12862f = dVar;
        this.f12863g = z;
    }

    @NonNull
    /* renamed from: a */
    public C6713e mo31343a(@NonNull C6709c cVar, boolean z) {
        mo31363n(cVar.mo31336b(), z);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C6713e mo31344b(@NonNull C6709c cVar, long j) {
        mo31361l(cVar.mo31336b(), j);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C6713e mo31345c(@NonNull C6709c cVar, int i) {
        mo31360k(cVar.mo31336b(), i);
        return this;
    }

    @NonNull
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C6715g mo31347d(@Nullable String str) {
        mo31359j(str);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public /* bridge */ /* synthetic */ C6715g mo31348e(boolean z) {
        mo31364o(z);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C6713e mo31346f(@NonNull C6709c cVar, @Nullable Object obj) {
        return mo31362m(cVar.mo31336b(), obj);
    }

    @NonNull
    /* renamed from: g */
    public C6724e mo31356g(int i) {
        mo31371v();
        this.f12859c.value((long) i);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C6724e mo31357h(long j) {
        mo31371v();
        this.f12859c.value(j);
        return this;
    }

    @NonNull
    /* renamed from: i */
    public C6724e mo31358i(@Nullable Object obj, boolean z) {
        Class<?> cls;
        int i = 0;
        if (z && mo31366q(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f12859c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f12859c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                mo31365p((byte[]) obj);
                return this;
            }
            this.f12859c.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    this.f12859c.value((long) iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    mo31357h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f12859c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f12859c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number i2 : (Number[]) obj) {
                    mo31358i(i2, false);
                }
            } else {
                for (Object i3 : (Object[]) obj) {
                    mo31358i(i3, false);
                }
            }
            this.f12859c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f12859c.beginArray();
            for (Object i4 : (Collection) obj) {
                mo31358i(i4, false);
            }
            this.f12859c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f12859c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    mo31362m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.f12859c.endObject();
            return this;
        } else {
            C6712d dVar = this.f12860d.get(obj.getClass());
            if (dVar != null) {
                mo31368s(dVar, obj, z);
                return this;
            }
            C6714f fVar = this.f12861e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo17703a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                mo31359j(((Enum) obj).name());
                return this;
            } else {
                mo31368s(this.f12862f, obj, z);
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: j */
    public C6724e mo31359j(@Nullable String str) {
        mo31371v();
        this.f12859c.value(str);
        return this;
    }

    @NonNull
    /* renamed from: k */
    public C6724e mo31360k(@NonNull String str, int i) {
        mo31371v();
        this.f12859c.name(str);
        mo31356g(i);
        return this;
    }

    @NonNull
    /* renamed from: l */
    public C6724e mo31361l(@NonNull String str, long j) {
        mo31371v();
        this.f12859c.name(str);
        mo31357h(j);
        return this;
    }

    @NonNull
    /* renamed from: m */
    public C6724e mo31362m(@NonNull String str, @Nullable Object obj) {
        if (this.f12863g) {
            return mo31370u(str, obj);
        }
        return mo31369t(str, obj);
    }

    @NonNull
    /* renamed from: n */
    public C6724e mo31363n(@NonNull String str, boolean z) {
        mo31371v();
        this.f12859c.name(str);
        mo31364o(z);
        return this;
    }

    @NonNull
    /* renamed from: o */
    public C6724e mo31364o(boolean z) {
        mo31371v();
        this.f12859c.value(z);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public C6724e mo31365p(@Nullable byte[] bArr) {
        mo31371v();
        if (bArr == null) {
            this.f12859c.nullValue();
        } else {
            this.f12859c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: q */
    public final boolean mo31366q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    public void mo31367r() {
        mo31371v();
        this.f12859c.flush();
    }

    /* renamed from: s */
    public C6724e mo31368s(C6712d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.f12859c.beginObject();
        }
        dVar.mo17703a(obj, this);
        if (!z) {
            this.f12859c.endObject();
        }
        return this;
    }

    /* renamed from: t */
    public final C6724e mo31369t(@NonNull String str, @Nullable Object obj) {
        mo31371v();
        this.f12859c.name(str);
        if (obj != null) {
            return mo31358i(obj, false);
        }
        this.f12859c.nullValue();
        return this;
    }

    /* renamed from: u */
    public final C6724e mo31370u(@NonNull String str, @Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        mo31371v();
        this.f12859c.name(str);
        return mo31358i(obj, false);
    }

    /* renamed from: v */
    public final void mo31371v() {
        if (this.f12858b) {
            C6724e eVar = this.f12857a;
            if (eVar != null) {
                eVar.mo31371v();
                this.f12857a.f12858b = false;
                this.f12857a = null;
                this.f12859c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
