package p040c.p200q.p363c.p385q.p388j;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.C6714f;
import p040c.p200q.p363c.p385q.p386h.C6716a;
import p040c.p200q.p363c.p385q.p386h.C6717b;

/* renamed from: c.q.c.q.j.g */
/* compiled from: ProtobufEncoder */
public class C6733g {

    /* renamed from: a */
    public final Map<Class<?>, C6712d<?>> f12881a;

    /* renamed from: b */
    public final Map<Class<?>, C6714f<?>> f12882b;

    /* renamed from: c */
    public final C6712d<Object> f12883c;

    /* renamed from: c.q.c.q.j.g$a */
    /* compiled from: ProtobufEncoder */
    public static final class C6734a implements C6717b<C6734a> {

        /* renamed from: d */
        public static final C6712d<Object> f12884d = C6726b.f12865a;

        /* renamed from: a */
        public final Map<Class<?>, C6712d<?>> f12885a = new HashMap();

        /* renamed from: b */
        public final Map<Class<?>, C6714f<?>> f12886b = new HashMap();

        /* renamed from: c */
        public C6712d<Object> f12887c = f12884d;

        /* renamed from: d */
        public static /* synthetic */ void m19069d(Object obj, C6713e eVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        @NonNull
        /* renamed from: a */
        public /* bridge */ /* synthetic */ C6717b mo31349a(@NonNull Class cls, @NonNull C6712d dVar) {
            mo31403e(cls, dVar);
            return this;
        }

        /* renamed from: b */
        public C6733g mo31401b() {
            return new C6733g(new HashMap(this.f12885a), new HashMap(this.f12886b), this.f12887c);
        }

        @NonNull
        /* renamed from: c */
        public C6734a mo31402c(@NonNull C6716a aVar) {
            aVar.mo17702a(this);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public <U> C6734a mo31403e(@NonNull Class<U> cls, @NonNull C6712d<? super U> dVar) {
            this.f12885a.put(cls, dVar);
            this.f12886b.remove(cls);
            return this;
        }
    }

    public C6733g(Map<Class<?>, C6712d<?>> map, Map<Class<?>, C6714f<?>> map2, C6712d<Object> dVar) {
        this.f12881a = map;
        this.f12882b = map2;
        this.f12883c = dVar;
    }

    /* renamed from: a */
    public static C6734a m19066a() {
        return new C6734a();
    }

    /* renamed from: b */
    public void mo31399b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new C6731f(outputStream, this.f12881a, this.f12882b, this.f12883c).mo31396r(obj);
    }

    @NonNull
    /* renamed from: c */
    public byte[] mo31400c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo31399b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
