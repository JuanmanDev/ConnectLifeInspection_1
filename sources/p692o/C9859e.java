package p692o;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p692o.C9856c;
import retrofit2.HttpException;

/* renamed from: o.e */
/* compiled from: CompletableFutureCallAdapterFactory */
public final class C9859e extends C9856c.C9857a {

    /* renamed from: a */
    public static final C9856c.C9857a f19118a = new C9859e();

    /* renamed from: o.e$a */
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class C9860a<R> implements C9856c<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f19119a;

        /* renamed from: o.e$a$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C9861a extends CompletableFuture<R> {

            /* renamed from: e */
            public final /* synthetic */ C9855b f19120e;

            public C9861a(C9860a aVar, C9855b bVar) {
                this.f19120e = bVar;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f19120e.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: o.e$a$b */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C9862b implements C9858d<R> {

            /* renamed from: e */
            public final /* synthetic */ CompletableFuture f19121e;

            public C9862b(C9860a aVar, CompletableFuture completableFuture) {
                this.f19121e = completableFuture;
            }

            public void onFailure(C9855b<R> bVar, Throwable th) {
                this.f19121e.completeExceptionally(th);
            }

            public void onResponse(C9855b<R> bVar, C9909p<R> pVar) {
                if (pVar.mo51319d()) {
                    this.f19121e.complete(pVar.mo51317a());
                } else {
                    this.f19121e.completeExceptionally(new HttpException(pVar));
                }
            }
        }

        public C9860a(Type type) {
            this.f19119a = type;
        }

        /* renamed from: a */
        public Type mo51256a() {
            return this.f19119a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo51257b(C9855b<R> bVar) {
            C9861a aVar = new C9861a(this, bVar);
            bVar.mo51255x(new C9862b(this, aVar));
            return aVar;
        }
    }

    /* renamed from: o.e$b */
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class C9863b<R> implements C9856c<R, CompletableFuture<C9909p<R>>> {

        /* renamed from: a */
        public final Type f19122a;

        /* renamed from: o.e$b$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C9864a extends CompletableFuture<C9909p<R>> {

            /* renamed from: e */
            public final /* synthetic */ C9855b f19123e;

            public C9864a(C9863b bVar, C9855b bVar2) {
                this.f19123e = bVar2;
            }

            public boolean cancel(boolean z) {
                if (z) {
                    this.f19123e.cancel();
                }
                return super.cancel(z);
            }
        }

        /* renamed from: o.e$b$b */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C9865b implements C9858d<R> {

            /* renamed from: e */
            public final /* synthetic */ CompletableFuture f19124e;

            public C9865b(C9863b bVar, CompletableFuture completableFuture) {
                this.f19124e = completableFuture;
            }

            public void onFailure(C9855b<R> bVar, Throwable th) {
                this.f19124e.completeExceptionally(th);
            }

            public void onResponse(C9855b<R> bVar, C9909p<R> pVar) {
                this.f19124e.complete(pVar);
            }
        }

        public C9863b(Type type) {
            this.f19122a = type;
        }

        /* renamed from: a */
        public Type mo51256a() {
            return this.f19122a;
        }

        /* renamed from: c */
        public CompletableFuture<C9909p<R>> mo51257b(C9855b<R> bVar) {
            C9864a aVar = new C9864a(this, bVar);
            bVar.mo51255x(new C9865b(this, aVar));
            return aVar;
        }
    }

    /* renamed from: a */
    public C9856c<?, ?> mo51258a(Type type, Annotation[] annotationArr, C9910q qVar) {
        if (C9856c.C9857a.m26452c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C9856c.C9857a.m26451b(0, (ParameterizedType) type);
            if (C9856c.C9857a.m26452c(b) != C9909p.class) {
                return new C9860a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C9863b(C9856c.C9857a.m26451b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
