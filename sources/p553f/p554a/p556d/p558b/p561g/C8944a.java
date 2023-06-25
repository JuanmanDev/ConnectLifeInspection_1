package p553f.p554a.p556d.p558b.p561g;

import android.content.Context;
import androidx.annotation.NonNull;
import p553f.p554a.p556d.p558b.C8916a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p575e.C9057g;
import p553f.p554a.p589h.C9177f;

/* renamed from: f.a.d.b.g.a */
/* compiled from: FlutterPlugin */
public interface C8944a {

    /* renamed from: f.a.d.b.g.a$a */
    /* compiled from: FlutterPlugin */
    public interface C8945a {
        /* renamed from: a */
        String mo46414a(@NonNull String str);
    }

    /* renamed from: f.a.d.b.g.a$b */
    /* compiled from: FlutterPlugin */
    public static class C8946b {

        /* renamed from: a */
        public final Context f17552a;

        /* renamed from: b */
        public final C8916a f17553b;

        /* renamed from: c */
        public final C9003c f17554c;

        /* renamed from: d */
        public final C9177f f17555d;

        /* renamed from: e */
        public final C9057g f17556e;

        /* renamed from: f */
        public final C8945a f17557f;

        public C8946b(@NonNull Context context, @NonNull C8916a aVar, @NonNull C9003c cVar, @NonNull C9177f fVar, @NonNull C9057g gVar, @NonNull C8945a aVar2) {
            this.f17552a = context;
            this.f17553b = aVar;
            this.f17554c = cVar;
            this.f17555d = fVar;
            this.f17556e = gVar;
            this.f17557f = aVar2;
        }

        @NonNull
        /* renamed from: a */
        public Context mo46464a() {
            return this.f17552a;
        }

        @NonNull
        /* renamed from: b */
        public C9003c mo46465b() {
            return this.f17554c;
        }

        @NonNull
        /* renamed from: c */
        public C8945a mo46466c() {
            return this.f17557f;
        }

        @NonNull
        @Deprecated
        /* renamed from: d */
        public C8916a mo46467d() {
            return this.f17553b;
        }

        @NonNull
        /* renamed from: e */
        public C9057g mo46468e() {
            return this.f17556e;
        }

        @NonNull
        /* renamed from: f */
        public C9177f mo46469f() {
            return this.f17555d;
        }
    }

    void onAttachedToEngine(@NonNull C8946b bVar);

    void onDetachedFromEngine(@NonNull C8946b bVar);
}
