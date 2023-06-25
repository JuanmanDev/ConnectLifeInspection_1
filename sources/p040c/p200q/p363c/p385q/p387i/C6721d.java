package p040c.p200q.p363c.p385q.p387i;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p040c.p200q.p363c.p385q.C6707a;
import p040c.p200q.p363c.p385q.C6712d;
import p040c.p200q.p363c.p385q.C6713e;
import p040c.p200q.p363c.p385q.C6714f;
import p040c.p200q.p363c.p385q.C6715g;
import p040c.p200q.p363c.p385q.p386h.C6716a;
import p040c.p200q.p363c.p385q.p386h.C6717b;

/* renamed from: c.q.c.q.i.d */
/* compiled from: JsonDataEncoderBuilder */
public final class C6721d implements C6717b<C6721d> {

    /* renamed from: e */
    public static final C6712d<Object> f12847e = C6719b.f12845a;

    /* renamed from: f */
    public static final C6714f<String> f12848f = C6718a.f12844a;

    /* renamed from: g */
    public static final C6714f<Boolean> f12849g = C6720c.f12846a;

    /* renamed from: h */
    public static final C6723b f12850h = new C6723b((C6722a) null);

    /* renamed from: a */
    public final Map<Class<?>, C6712d<?>> f12851a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, C6714f<?>> f12852b = new HashMap();

    /* renamed from: c */
    public C6712d<Object> f12853c = f12847e;

    /* renamed from: d */
    public boolean f12854d = false;

    /* renamed from: c.q.c.q.i.d$a */
    /* compiled from: JsonDataEncoderBuilder */
    public class C6722a implements C6707a {
        public C6722a() {
        }

        /* renamed from: a */
        public void mo31334a(@NonNull Object obj, @NonNull Writer writer) {
            C6724e eVar = new C6724e(writer, C6721d.this.f12851a, C6721d.this.f12852b, C6721d.this.f12853c, C6721d.this.f12854d);
            eVar.mo31358i(obj, false);
            eVar.mo31367r();
        }

        /* renamed from: b */
        public String mo31335b(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo31334a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: c.q.c.q.i.d$b */
    /* compiled from: JsonDataEncoderBuilder */
    public static final class C6723b implements C6714f<Date> {

        /* renamed from: a */
        public static final DateFormat f12856a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f12856a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public C6723b() {
        }

        /* renamed from: b */
        public void mo17703a(@NonNull Date date, @NonNull C6715g gVar) {
            gVar.mo31347d(f12856a.format(date));
        }

        public /* synthetic */ C6723b(C6722a aVar) {
            this();
        }
    }

    public C6721d() {
        mo31354m(String.class, f12848f);
        mo31354m(Boolean.class, f12849g);
        mo31354m(Date.class, f12850h);
    }

    /* renamed from: i */
    public static /* synthetic */ void m19002i(Object obj, C6713e eVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    /* renamed from: a */
    public /* bridge */ /* synthetic */ C6717b mo31349a(@NonNull Class cls, @NonNull C6712d dVar) {
        mo31353l(cls, dVar);
        return this;
    }

    @NonNull
    /* renamed from: f */
    public C6707a mo31350f() {
        return new C6722a();
    }

    @NonNull
    /* renamed from: g */
    public C6721d mo31351g(@NonNull C6716a aVar) {
        aVar.mo17702a(this);
        return this;
    }

    @NonNull
    /* renamed from: h */
    public C6721d mo31352h(boolean z) {
        this.f12854d = z;
        return this;
    }

    @NonNull
    /* renamed from: l */
    public <T> C6721d mo31353l(@NonNull Class<T> cls, @NonNull C6712d<? super T> dVar) {
        this.f12851a.put(cls, dVar);
        this.f12852b.remove(cls);
        return this;
    }

    @NonNull
    /* renamed from: m */
    public <T> C6721d mo31354m(@NonNull Class<T> cls, @NonNull C6714f<? super T> fVar) {
        this.f12852b.put(cls, fVar);
        this.f12851a.remove(cls);
        return this;
    }
}
