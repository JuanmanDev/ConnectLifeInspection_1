package p692o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p692o.C9856c;

/* renamed from: o.g */
/* compiled from: DefaultCallAdapterFactory */
public final class C9868g extends C9856c.C9857a {

    /* renamed from: a */
    public final Executor f19125a;

    /* renamed from: o.g$a */
    /* compiled from: DefaultCallAdapterFactory */
    public class C9869a implements C9856c<Object, C9855b<?>> {

        /* renamed from: a */
        public final /* synthetic */ Type f19126a;

        /* renamed from: b */
        public final /* synthetic */ Executor f19127b;

        public C9869a(C9868g gVar, Type type, Executor executor) {
            this.f19126a = type;
            this.f19127b = executor;
        }

        /* renamed from: a */
        public Type mo51256a() {
            return this.f19126a;
        }

        /* renamed from: c */
        public C9855b<Object> mo51257b(C9855b<Object> bVar) {
            Executor executor = this.f19127b;
            return executor == null ? bVar : new C9870b(executor, bVar);
        }
    }

    /* renamed from: o.g$b */
    /* compiled from: DefaultCallAdapterFactory */
    public static final class C9870b<T> implements C9855b<T> {

        /* renamed from: e */
        public final Executor f19128e;

        /* renamed from: l */
        public final C9855b<T> f19129l;

        /* renamed from: o.g$b$a */
        /* compiled from: DefaultCallAdapterFactory */
        public class C9871a implements C9858d<T> {

            /* renamed from: e */
            public final /* synthetic */ C9858d f19130e;

            /* renamed from: o.g$b$a$a */
            /* compiled from: DefaultCallAdapterFactory */
            public class C9872a implements Runnable {

                /* renamed from: e */
                public final /* synthetic */ C9909p f19132e;

                public C9872a(C9909p pVar) {
                    this.f19132e = pVar;
                }

                public void run() {
                    if (C9870b.this.f19129l.isCanceled()) {
                        C9871a aVar = C9871a.this;
                        aVar.f19130e.onFailure(C9870b.this, new IOException("Canceled"));
                        return;
                    }
                    C9871a aVar2 = C9871a.this;
                    aVar2.f19130e.onResponse(C9870b.this, this.f19132e);
                }
            }

            /* renamed from: o.g$b$a$b */
            /* compiled from: DefaultCallAdapterFactory */
            public class C9873b implements Runnable {

                /* renamed from: e */
                public final /* synthetic */ Throwable f19134e;

                public C9873b(Throwable th) {
                    this.f19134e = th;
                }

                public void run() {
                    C9871a aVar = C9871a.this;
                    aVar.f19130e.onFailure(C9870b.this, this.f19134e);
                }
            }

            public C9871a(C9858d dVar) {
                this.f19130e = dVar;
            }

            public void onFailure(C9855b<T> bVar, Throwable th) {
                C9870b.this.f19128e.execute(new C9873b(th));
            }

            public void onResponse(C9855b<T> bVar, C9909p<T> pVar) {
                C9870b.this.f19128e.execute(new C9872a(pVar));
            }
        }

        public C9870b(Executor executor, C9855b<T> bVar) {
            this.f19128e = executor;
            this.f19129l = bVar;
        }

        public void cancel() {
            this.f19129l.cancel();
        }

        public C9909p<T> execute() {
            return this.f19129l.execute();
        }

        public boolean isCanceled() {
            return this.f19129l.isCanceled();
        }

        public Request request() {
            return this.f19129l.request();
        }

        /* renamed from: x */
        public void mo51255x(C9858d<T> dVar) {
            C9916u.m26580b(dVar, "callback == null");
            this.f19129l.mo51255x(new C9871a(dVar));
        }

        public C9855b<T> clone() {
            return new C9870b(this.f19128e, this.f19129l.clone());
        }
    }

    public C9868g(Executor executor) {
        this.f19125a = executor;
    }

    /* renamed from: a */
    public C9856c<?, ?> mo51258a(Type type, Annotation[] annotationArr, C9910q qVar) {
        Executor executor = null;
        if (C9856c.C9857a.m26452c(type) != C9855b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type h = C9916u.m26586h(0, (ParameterizedType) type);
            if (!C9916u.m26591m(annotationArr, C9914s.class)) {
                executor = this.f19125a;
            }
            return new C9869a(this, h, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
