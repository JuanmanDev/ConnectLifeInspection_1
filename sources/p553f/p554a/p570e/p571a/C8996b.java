package p553f.p554a.p570e.p571a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;
import p553f.p554a.p570e.p571a.C9003c;

/* renamed from: f.a.e.a.b */
/* compiled from: BasicMessageChannel */
public final class C8996b<T> {
    @NonNull

    /* renamed from: a */
    public final C9003c f17668a;
    @NonNull

    /* renamed from: b */
    public final String f17669b;
    @NonNull

    /* renamed from: c */
    public final C9015h<T> f17670c;

    /* renamed from: f.a.e.a.b$b */
    /* compiled from: BasicMessageChannel */
    public final class C8998b implements C9003c.C9004a {

        /* renamed from: a */
        public final C9001d<T> f17671a;

        /* renamed from: f.a.e.a.b$b$a */
        /* compiled from: BasicMessageChannel */
        public class C8999a implements C9002e<T> {

            /* renamed from: a */
            public final /* synthetic */ C9003c.C9005b f17673a;

            public C8999a(C9003c.C9005b bVar) {
                this.f17673a = bVar;
            }

            /* renamed from: a */
            public void mo46503a(T t) {
                this.f17673a.mo46450a(C8996b.this.f17670c.mo46562a(t));
            }
        }

        /* renamed from: a */
        public void mo46443a(@Nullable ByteBuffer byteBuffer, @NonNull C9003c.C9005b bVar) {
            try {
                this.f17671a.mo46510a(C8996b.this.f17670c.mo46563b(byteBuffer), new C8999a(bVar));
            } catch (RuntimeException unused) {
                "BasicMessageChannel#" + C8996b.this.f17669b;
                bVar.mo46450a((ByteBuffer) null);
            }
        }

        public C8998b(@NonNull C9001d<T> dVar) {
            this.f17671a = dVar;
        }
    }

    /* renamed from: f.a.e.a.b$c */
    /* compiled from: BasicMessageChannel */
    public final class C9000c implements C9003c.C9005b {

        /* renamed from: a */
        public final C9002e<T> f17675a;

        /* renamed from: a */
        public void mo46450a(@Nullable ByteBuffer byteBuffer) {
            try {
                this.f17675a.mo46503a(C8996b.this.f17670c.mo46563b(byteBuffer));
            } catch (RuntimeException unused) {
                "BasicMessageChannel#" + C8996b.this.f17669b;
            }
        }

        public C9000c(@NonNull C9002e<T> eVar) {
            this.f17675a = eVar;
        }
    }

    /* renamed from: f.a.e.a.b$d */
    /* compiled from: BasicMessageChannel */
    public interface C9001d<T> {
        /* renamed from: a */
        void mo46510a(@Nullable T t, @NonNull C9002e<T> eVar);
    }

    /* renamed from: f.a.e.a.b$e */
    /* compiled from: BasicMessageChannel */
    public interface C9002e<T> {
        /* renamed from: a */
        void mo46503a(@Nullable T t);
    }

    public C8996b(@NonNull C9003c cVar, @NonNull String str, @NonNull C9015h<T> hVar) {
        this.f17668a = cVar;
        this.f17669b = str;
        this.f17670c = hVar;
    }

    /* renamed from: c */
    public void mo46553c(@Nullable T t) {
        mo46554d(t, (C9002e) null);
    }

    @UiThread
    /* renamed from: d */
    public void mo46554d(@Nullable T t, @Nullable C9002e<T> eVar) {
        C9003c cVar = this.f17668a;
        String str = this.f17669b;
        ByteBuffer a = this.f17670c.mo46562a(t);
        C9000c cVar2 = null;
        if (eVar != null) {
            cVar2 = new C9000c(eVar);
        }
        cVar.mo46433a(str, a, cVar2);
    }

    @UiThread
    /* renamed from: e */
    public void mo46555e(@Nullable C9001d<T> dVar) {
        C9003c cVar = this.f17668a;
        String str = this.f17669b;
        C8998b bVar = null;
        if (dVar != null) {
            bVar = new C8998b(dVar);
        }
        cVar.mo46434b(str, bVar);
    }
}
