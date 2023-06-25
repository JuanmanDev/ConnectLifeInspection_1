package p040c.p200q.p363c.p385q.p388j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.Person;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p363c.p385q.C6709c;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.C6714f;

/* renamed from: c.q.c.q.j.f */
/* compiled from: ProtobufDataEncoderContext */
public final class C6731f implements C6713e {

    /* renamed from: f */
    public static final Charset f12871f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final C6709c f12872g;

    /* renamed from: h */
    public static final C6709c f12873h;

    /* renamed from: i */
    public static final C6712d<Map.Entry<Object, Object>> f12874i = C6725a.f12864a;

    /* renamed from: a */
    public OutputStream f12875a;

    /* renamed from: b */
    public final Map<Class<?>, C6712d<?>> f12876b;

    /* renamed from: c */
    public final Map<Class<?>, C6714f<?>> f12877c;

    /* renamed from: d */
    public final C6712d<Object> f12878d;

    /* renamed from: e */
    public final C6735h f12879e = new C6735h(this);

    /* renamed from: c.q.c.q.j.f$a */
    /* compiled from: ProtobufDataEncoderContext */
    public static /* synthetic */ class C6732a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12880a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12880a = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12880a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12880a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p385q.p388j.C6731f.C6732a.<clinit>():void");
        }
    }

    static {
        C6709c.C6711b a = C6709c.m18981a(Person.KEY_KEY);
        C6727c b = C6727c.m19039b();
        b.mo31373c(1);
        a.mo31342b(b.mo31372a());
        f12872g = a.mo31341a();
        C6709c.C6711b a2 = C6709c.m18981a("value");
        C6727c b2 = C6727c.m19039b();
        b2.mo31373c(2);
        a2.mo31342b(b2.mo31372a());
        f12873h = a2.mo31341a();
    }

    public C6731f(OutputStream outputStream, Map<Class<?>, C6712d<?>> map, Map<Class<?>, C6714f<?>> map2, C6712d<Object> dVar) {
        this.f12875a = outputStream;
        this.f12876b = map;
        this.f12877c = map2;
        this.f12878d = dVar;
    }

    /* renamed from: n */
    public static ByteBuffer m19043n(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: s */
    public static Protobuf m19044s(C6709c cVar) {
        Protobuf protobuf = (Protobuf) cVar.mo31337c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: t */
    public static int m19045t(C6709c cVar) {
        Protobuf protobuf = (Protobuf) cVar.mo31337c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    public static /* synthetic */ void m19046u(Map.Entry entry, C6713e eVar) {
        eVar.mo31346f(f12872g, entry.getKey());
        eVar.mo31346f(f12873h, entry.getValue());
    }

    @NonNull
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C6713e mo31343a(@NonNull C6709c cVar, boolean z) {
        mo31391l(cVar, z);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C6713e mo31344b(@NonNull C6709c cVar, long j) {
        mo31389j(cVar, j);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public /* bridge */ /* synthetic */ C6713e mo31345c(@NonNull C6709c cVar, int i) {
        mo31387h(cVar, i);
        return this;
    }

    /* renamed from: d */
    public C6713e mo31384d(@NonNull C6709c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        mo31397v((m19045t(cVar) << 3) | 1);
        this.f12875a.write(m19043n(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    public C6713e mo31385e(@NonNull C6709c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        mo31397v((m19045t(cVar) << 3) | 5);
        this.f12875a.write(m19043n(4).putFloat(f).array());
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C6713e mo31346f(@NonNull C6709c cVar, @Nullable Object obj) {
        mo31386g(cVar, obj, true);
        return this;
    }

    /* renamed from: g */
    public C6713e mo31386g(@NonNull C6709c cVar, @Nullable Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            mo31397v((m19045t(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f12871f);
            mo31397v(bytes.length);
            this.f12875a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo31386g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry p : ((Map) obj).entrySet()) {
                mo31394p(f12874i, cVar, p, false);
            }
            return this;
        } else if (obj instanceof Double) {
            mo31384d(cVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            mo31385e(cVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            mo31390k(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            mo31392m(cVar, ((Boolean) obj).booleanValue(), z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            mo31397v((m19045t(cVar) << 3) | 2);
            mo31397v(bArr.length);
            this.f12875a.write(bArr);
            return this;
        } else {
            C6712d dVar = this.f12876b.get(obj.getClass());
            if (dVar != null) {
                mo31394p(dVar, cVar, obj, z);
                return this;
            }
            C6714f fVar = this.f12877c.get(obj.getClass());
            if (fVar != null) {
                mo31395q(fVar, cVar, obj, z);
                return this;
            } else if (obj instanceof C6730e) {
                mo31387h(cVar, ((C6730e) obj).getNumber());
                return this;
            } else if (obj instanceof Enum) {
                mo31387h(cVar, ((Enum) obj).ordinal());
                return this;
            } else {
                mo31394p(this.f12878d, cVar, obj, z);
                return this;
            }
        }
    }

    @NonNull
    /* renamed from: h */
    public C6731f mo31387h(@NonNull C6709c cVar, int i) {
        mo31388i(cVar, i, true);
        return this;
    }

    /* renamed from: i */
    public C6731f mo31388i(@NonNull C6709c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        Protobuf s = m19044s(cVar);
        int i2 = C6732a.f12880a[s.intEncoding().ordinal()];
        if (i2 == 1) {
            mo31397v(s.tag() << 3);
            mo31397v(i);
        } else if (i2 == 2) {
            mo31397v(s.tag() << 3);
            mo31397v((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            mo31397v((s.tag() << 3) | 5);
            this.f12875a.write(m19043n(4).putInt(i).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: j */
    public C6731f mo31389j(@NonNull C6709c cVar, long j) {
        mo31390k(cVar, j, true);
        return this;
    }

    /* renamed from: k */
    public C6731f mo31390k(@NonNull C6709c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        Protobuf s = m19044s(cVar);
        int i = C6732a.f12880a[s.intEncoding().ordinal()];
        if (i == 1) {
            mo31397v(s.tag() << 3);
            mo31398w(j);
        } else if (i == 2) {
            mo31397v(s.tag() << 3);
            mo31398w((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            mo31397v((s.tag() << 3) | 1);
            this.f12875a.write(m19043n(8).putLong(j).array());
        }
        return this;
    }

    @NonNull
    /* renamed from: l */
    public C6731f mo31391l(@NonNull C6709c cVar, boolean z) {
        mo31392m(cVar, z, true);
        return this;
    }

    /* renamed from: m */
    public C6731f mo31392m(@NonNull C6709c cVar, boolean z, boolean z2) {
        mo31388i(cVar, z ? 1 : 0, z2);
        return this;
    }

    /* renamed from: o */
    public final <T> long mo31393o(C6712d<T> dVar, T t) {
        OutputStream outputStream;
        C6729d dVar2 = new C6729d();
        try {
            outputStream = this.f12875a;
            this.f12875a = dVar2;
            dVar.mo17703a(t, this);
            this.f12875a = outputStream;
            long a = dVar2.mo31380a();
            dVar2.close();
            return a;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: p */
    public final <T> C6731f mo31394p(C6712d<T> dVar, C6709c cVar, T t, boolean z) {
        long o = mo31393o(dVar, t);
        if (z && o == 0) {
            return this;
        }
        mo31397v((m19045t(cVar) << 3) | 2);
        mo31398w(o);
        dVar.mo17703a(t, this);
        return this;
    }

    /* renamed from: q */
    public final <T> C6731f mo31395q(C6714f<T> fVar, C6709c cVar, T t, boolean z) {
        this.f12879e.mo31405b(cVar, z);
        fVar.mo17703a(t, this.f12879e);
        return this;
    }

    /* renamed from: r */
    public C6731f mo31396r(@Nullable Object obj) {
        if (obj == null) {
            return this;
        }
        C6712d dVar = this.f12876b.get(obj.getClass());
        if (dVar != null) {
            dVar.mo17703a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* renamed from: v */
    public final void mo31397v(int i) {
        while (((long) (i & -128)) != 0) {
            this.f12875a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f12875a.write(i & 127);
    }

    /* renamed from: w */
    public final void mo31398w(long j) {
        while ((-128 & j) != 0) {
            this.f12875a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f12875a.write(((int) j) & 127);
    }
}
