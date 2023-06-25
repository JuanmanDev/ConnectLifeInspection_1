package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import p040c.p200q.p363c.p370n.p371h.p376l.C6591a0;
import p040c.p200q.p363c.p370n.p371h.p376l.C6592b;
import p040c.p200q.p363c.p370n.p371h.p376l.C6599c;
import p040c.p200q.p363c.p370n.p371h.p376l.C6610d;
import p040c.p200q.p363c.p370n.p371h.p376l.C6613e;
import p040c.p200q.p363c.p370n.p371h.p376l.C6616f;
import p040c.p200q.p363c.p370n.p371h.p376l.C6619g;
import p040c.p200q.p363c.p370n.p371h.p376l.C6622h;
import p040c.p200q.p363c.p370n.p371h.p376l.C6626j;
import p040c.p200q.p363c.p370n.p371h.p376l.C6629k;
import p040c.p200q.p363c.p370n.p371h.p376l.C6632l;
import p040c.p200q.p363c.p370n.p371h.p376l.C6635m;
import p040c.p200q.p363c.p370n.p371h.p376l.C6638n;
import p040c.p200q.p363c.p370n.p371h.p376l.C6641o;
import p040c.p200q.p363c.p370n.p371h.p376l.C6644p;
import p040c.p200q.p363c.p370n.p371h.p376l.C6647q;
import p040c.p200q.p363c.p370n.p371h.p376l.C6650r;
import p040c.p200q.p363c.p370n.p371h.p376l.C6653s;
import p040c.p200q.p363c.p370n.p371h.p376l.C6656t;
import p040c.p200q.p363c.p370n.p371h.p376l.C6659u;
import p040c.p200q.p363c.p370n.p371h.p376l.C6662v;

public abstract class CrashlyticsReport {

    /* renamed from: a */
    public static final Charset f15433a = Charset.forName("UTF-8");

    public enum Type {
        INCOMPLETE,
        JAVA,
        NATIVE
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a */
    public static abstract class C8251a {

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$a$a */
        public static abstract class C8252a {
            @NonNull
            /* renamed from: a */
            public abstract C8251a mo30987a();

            @NonNull
            /* renamed from: b */
            public abstract C8252a mo30988b(@NonNull int i);

            @NonNull
            /* renamed from: c */
            public abstract C8252a mo30989c(@NonNull int i);

            @NonNull
            /* renamed from: d */
            public abstract C8252a mo30990d(@NonNull String str);

            @NonNull
            /* renamed from: e */
            public abstract C8252a mo30991e(@NonNull long j);

            @NonNull
            /* renamed from: f */
            public abstract C8252a mo30992f(@NonNull int i);

            @NonNull
            /* renamed from: g */
            public abstract C8252a mo30993g(@NonNull long j);

            @NonNull
            /* renamed from: h */
            public abstract C8252a mo30994h(@NonNull long j);

            @NonNull
            /* renamed from: i */
            public abstract C8252a mo30995i(@Nullable String str);
        }

        @NonNull
        /* renamed from: a */
        public static C8252a m22752a() {
            return new C6599c.C6601b();
        }

        @NonNull
        /* renamed from: b */
        public abstract int mo30976b();

        @NonNull
        /* renamed from: c */
        public abstract int mo30977c();

        @NonNull
        /* renamed from: d */
        public abstract String mo30978d();

        @NonNull
        /* renamed from: e */
        public abstract long mo30979e();

        @NonNull
        /* renamed from: f */
        public abstract int mo30981f();

        @NonNull
        /* renamed from: g */
        public abstract long mo30982g();

        @NonNull
        /* renamed from: h */
        public abstract long mo30983h();

        @Nullable
        /* renamed from: i */
        public abstract String mo30985i();
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$b */
    public static abstract class C8253b {
        @NonNull
        /* renamed from: a */
        public abstract CrashlyticsReport mo30946a();

        @NonNull
        /* renamed from: b */
        public abstract C8253b mo30947b(@NonNull String str);

        @NonNull
        /* renamed from: c */
        public abstract C8253b mo30948c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C8253b mo30949d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C8253b mo30950e(@NonNull String str);

        @NonNull
        /* renamed from: f */
        public abstract C8253b mo30951f(C8256d dVar);

        @NonNull
        /* renamed from: g */
        public abstract C8253b mo30952g(int i);

        @NonNull
        /* renamed from: h */
        public abstract C8253b mo30953h(@NonNull String str);

        @NonNull
        /* renamed from: i */
        public abstract C8253b mo30954i(@NonNull C8260e eVar);
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c */
    public static abstract class C8254c {

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$a */
        public static abstract class C8255a {
            @NonNull
            /* renamed from: a */
            public abstract C8254c mo31006a();

            @NonNull
            /* renamed from: b */
            public abstract C8255a mo31007b(@NonNull String str);

            @NonNull
            /* renamed from: c */
            public abstract C8255a mo31008c(@NonNull String str);
        }

        @NonNull
        /* renamed from: a */
        public static C8255a m22779a() {
            return new C6610d.C6612b();
        }

        @NonNull
        /* renamed from: b */
        public abstract String mo31001b();

        @NonNull
        /* renamed from: c */
        public abstract String mo31002c();
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d */
    public static abstract class C8256d {

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$a */
        public static abstract class C8257a {
            /* renamed from: a */
            public abstract C8256d mo31014a();

            /* renamed from: b */
            public abstract C8257a mo31015b(C6591a0<C8258b> a0Var);

            /* renamed from: c */
            public abstract C8257a mo31016c(String str);
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$b */
        public static abstract class C8258b {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$d$b$a */
            public static abstract class C8259a {
                /* renamed from: a */
                public abstract C8258b mo31022a();

                /* renamed from: b */
                public abstract C8259a mo31023b(byte[] bArr);

                /* renamed from: c */
                public abstract C8259a mo31024c(String str);
            }

            @NonNull
            /* renamed from: a */
            public static C8259a m22791a() {
                return new C6616f.C6618b();
            }

            @NonNull
            /* renamed from: b */
            public abstract byte[] mo31017b();

            @NonNull
            /* renamed from: c */
            public abstract String mo31018c();
        }

        @NonNull
        /* renamed from: a */
        public static C8257a m22785a() {
            return new C6613e.C6615b();
        }

        @NonNull
        /* renamed from: b */
        public abstract C6591a0<C8258b> mo31009b();

        @Nullable
        /* renamed from: c */
        public abstract String mo31010c();
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e */
    public static abstract class C8260e {

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a */
        public static abstract class C8261a {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a$a */
            public static abstract class C8262a {
                @NonNull
                /* renamed from: a */
                public abstract C8261a mo31062a();

                @NonNull
                /* renamed from: b */
                public abstract C8262a mo31063b(@Nullable String str);

                @NonNull
                /* renamed from: c */
                public abstract C8262a mo31064c(@Nullable String str);

                @NonNull
                /* renamed from: d */
                public abstract C8262a mo31065d(@NonNull String str);

                @NonNull
                /* renamed from: e */
                public abstract C8262a mo31066e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract C8262a mo31067f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract C8262a mo31068g(@NonNull String str);
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$a$b */
            public static abstract class C8263b {
                @NonNull
                /* renamed from: a */
                public abstract String mo31069a();
            }

            @NonNull
            /* renamed from: a */
            public static C8262a m22813a() {
                return new C6622h.C6624b();
            }

            @Nullable
            /* renamed from: b */
            public abstract String mo31052b();

            @Nullable
            /* renamed from: c */
            public abstract String mo31053c();

            @Nullable
            /* renamed from: d */
            public abstract String mo31054d();

            @NonNull
            /* renamed from: e */
            public abstract String mo31055e();

            @Nullable
            /* renamed from: f */
            public abstract String mo31057f();

            @Nullable
            /* renamed from: g */
            public abstract C8263b mo31058g();

            @NonNull
            /* renamed from: h */
            public abstract String mo31059h();
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$b */
        public static abstract class C8264b {
            @NonNull
            /* renamed from: a */
            public abstract C8260e mo31040a();

            @NonNull
            /* renamed from: b */
            public abstract C8264b mo31041b(@NonNull C8261a aVar);

            @NonNull
            /* renamed from: c */
            public abstract C8264b mo31042c(boolean z);

            @NonNull
            /* renamed from: d */
            public abstract C8264b mo31043d(@NonNull C8265c cVar);

            @NonNull
            /* renamed from: e */
            public abstract C8264b mo31044e(@NonNull Long l);

            @NonNull
            /* renamed from: f */
            public abstract C8264b mo31045f(@NonNull C6591a0<C8267d> a0Var);

            @NonNull
            /* renamed from: g */
            public abstract C8264b mo31046g(@NonNull String str);

            @NonNull
            /* renamed from: h */
            public abstract C8264b mo31047h(int i);

            @NonNull
            /* renamed from: i */
            public abstract C8264b mo31048i(@NonNull String str);

            @NonNull
            /* renamed from: j */
            public C8264b mo37431j(@NonNull byte[] bArr) {
                mo31048i(new String(bArr, CrashlyticsReport.f15433a));
                return this;
            }

            @NonNull
            /* renamed from: k */
            public abstract C8264b mo31049k(@NonNull C8287e eVar);

            @NonNull
            /* renamed from: l */
            public abstract C8264b mo31050l(long j);

            @NonNull
            /* renamed from: m */
            public abstract C8264b mo31051m(@NonNull C8289f fVar);
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c */
        public static abstract class C8265c {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$c$a */
            public static abstract class C8266a {
                @NonNull
                /* renamed from: a */
                public abstract C8265c mo31085a();

                @NonNull
                /* renamed from: b */
                public abstract C8266a mo31086b(int i);

                @NonNull
                /* renamed from: c */
                public abstract C8266a mo31087c(int i);

                @NonNull
                /* renamed from: d */
                public abstract C8266a mo31088d(long j);

                @NonNull
                /* renamed from: e */
                public abstract C8266a mo31089e(@NonNull String str);

                @NonNull
                /* renamed from: f */
                public abstract C8266a mo31090f(@NonNull String str);

                @NonNull
                /* renamed from: g */
                public abstract C8266a mo31091g(@NonNull String str);

                @NonNull
                /* renamed from: h */
                public abstract C8266a mo31092h(long j);

                @NonNull
                /* renamed from: i */
                public abstract C8266a mo31093i(boolean z);

                @NonNull
                /* renamed from: j */
                public abstract C8266a mo31094j(int i);
            }

            @NonNull
            /* renamed from: a */
            public static C8266a m22842a() {
                return new C6626j.C6628b();
            }

            @NonNull
            /* renamed from: b */
            public abstract int mo31073b();

            /* renamed from: c */
            public abstract int mo31074c();

            /* renamed from: d */
            public abstract long mo31075d();

            @NonNull
            /* renamed from: e */
            public abstract String mo31076e();

            @NonNull
            /* renamed from: f */
            public abstract String mo31078f();

            @NonNull
            /* renamed from: g */
            public abstract String mo31079g();

            /* renamed from: h */
            public abstract long mo31080h();

            /* renamed from: i */
            public abstract int mo31082i();

            /* renamed from: j */
            public abstract boolean mo31083j();
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d */
        public static abstract class C8267d {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a */
            public static abstract class C8268a {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$a */
                public static abstract class C8269a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C8268a mo31119a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C8269a mo31120b(@Nullable Boolean bool);

                    @NonNull
                    /* renamed from: c */
                    public abstract C8269a mo31121c(@NonNull C6591a0<C8254c> a0Var);

                    @NonNull
                    /* renamed from: d */
                    public abstract C8269a mo31122d(@NonNull C8270b bVar);

                    @NonNull
                    /* renamed from: e */
                    public abstract C8269a mo31123e(@NonNull C6591a0<C8254c> a0Var);

                    @NonNull
                    /* renamed from: f */
                    public abstract C8269a mo31124f(int i);
                }

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b */
                public static abstract class C8270b {

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$a */
                    public static abstract class C8271a {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$a$a */
                        public static abstract class C8272a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C8271a mo31146a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C8272a mo31147b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C8272a mo31148c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C8272a mo31149d(long j);

                            @NonNull
                            /* renamed from: e */
                            public abstract C8272a mo31150e(@Nullable String str);

                            @NonNull
                            /* renamed from: f */
                            public C8272a mo37433f(@NonNull byte[] bArr) {
                                mo31150e(new String(bArr, CrashlyticsReport.f15433a));
                                return this;
                            }
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C8272a m22888a() {
                            return new C6638n.C6640b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo31139b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo31140c();

                        /* renamed from: d */
                        public abstract long mo31141d();

                        @Nullable
                        /* renamed from: e */
                        public abstract String mo31142e();

                        @Nullable
                        /* renamed from: f */
                        public byte[] mo37432f() {
                            String e = mo31142e();
                            if (e != null) {
                                return e.getBytes(CrashlyticsReport.f15433a);
                            }
                            return null;
                        }
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$b */
                    public static abstract class C8273b {
                        @NonNull
                        /* renamed from: a */
                        public abstract C8270b mo31133a();

                        @NonNull
                        /* renamed from: b */
                        public abstract C8273b mo31134b(@NonNull C8251a aVar);

                        @NonNull
                        /* renamed from: c */
                        public abstract C8273b mo31135c(@NonNull C6591a0<C8271a> a0Var);

                        @NonNull
                        /* renamed from: d */
                        public abstract C8273b mo31136d(@NonNull C8274c cVar);

                        @NonNull
                        /* renamed from: e */
                        public abstract C8273b mo31137e(@NonNull C8276d dVar);

                        @NonNull
                        /* renamed from: f */
                        public abstract C8273b mo31138f(@NonNull C6591a0<C8278e> a0Var);
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c */
                    public static abstract class C8274c {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$c$a */
                        public static abstract class C8275a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C8274c mo31159a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C8275a mo31160b(@NonNull C8274c cVar);

                            @NonNull
                            /* renamed from: c */
                            public abstract C8275a mo31161c(@NonNull C6591a0<C8278e.C8280b> a0Var);

                            @NonNull
                            /* renamed from: d */
                            public abstract C8275a mo31162d(int i);

                            @NonNull
                            /* renamed from: e */
                            public abstract C8275a mo31163e(@NonNull String str);

                            @NonNull
                            /* renamed from: f */
                            public abstract C8275a mo31164f(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C8275a m22906a() {
                            return new C6641o.C6643b();
                        }

                        @Nullable
                        /* renamed from: b */
                        public abstract C8274c mo31151b();

                        @NonNull
                        /* renamed from: c */
                        public abstract C6591a0<C8278e.C8280b> mo31152c();

                        /* renamed from: d */
                        public abstract int mo31153d();

                        @Nullable
                        /* renamed from: e */
                        public abstract String mo31154e();

                        @NonNull
                        /* renamed from: f */
                        public abstract String mo31156f();
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$d */
                    public static abstract class C8276d {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$d$a */
                        public static abstract class C8277a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C8276d mo31171a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C8277a mo31172b(long j);

                            @NonNull
                            /* renamed from: c */
                            public abstract C8277a mo31173c(@NonNull String str);

                            @NonNull
                            /* renamed from: d */
                            public abstract C8277a mo31174d(@NonNull String str);
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C8277a m22918a() {
                            return new C6644p.C6646b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract long mo31165b();

                        @NonNull
                        /* renamed from: c */
                        public abstract String mo31166c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo31167d();
                    }

                    /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e */
                    public static abstract class C8278e {

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$a */
                        public static abstract class C8279a {
                            @NonNull
                            /* renamed from: a */
                            public abstract C8278e mo31181a();

                            @NonNull
                            /* renamed from: b */
                            public abstract C8279a mo31182b(@NonNull C6591a0<C8280b> a0Var);

                            @NonNull
                            /* renamed from: c */
                            public abstract C8279a mo31183c(int i);

                            @NonNull
                            /* renamed from: d */
                            public abstract C8279a mo31184d(@NonNull String str);
                        }

                        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b */
                        public static abstract class C8280b {

                            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$a$b$e$b$a */
                            public static abstract class C8281a {
                                @NonNull
                                /* renamed from: a */
                                public abstract C8280b mo31193a();

                                @NonNull
                                /* renamed from: b */
                                public abstract C8281a mo31194b(@NonNull String str);

                                @NonNull
                                /* renamed from: c */
                                public abstract C8281a mo31195c(int i);

                                @NonNull
                                /* renamed from: d */
                                public abstract C8281a mo31196d(long j);

                                @NonNull
                                /* renamed from: e */
                                public abstract C8281a mo31197e(long j);

                                @NonNull
                                /* renamed from: f */
                                public abstract C8281a mo31198f(@NonNull String str);
                            }

                            @NonNull
                            /* renamed from: a */
                            public static C8281a m22934a() {
                                return new C6650r.C6652b();
                            }

                            @Nullable
                            /* renamed from: b */
                            public abstract String mo31185b();

                            /* renamed from: c */
                            public abstract int mo31186c();

                            /* renamed from: d */
                            public abstract long mo31187d();

                            /* renamed from: e */
                            public abstract long mo31188e();

                            @NonNull
                            /* renamed from: f */
                            public abstract String mo31190f();
                        }

                        @NonNull
                        /* renamed from: a */
                        public static C8279a m22926a() {
                            return new C6647q.C6649b();
                        }

                        @NonNull
                        /* renamed from: b */
                        public abstract C6591a0<C8280b> mo31175b();

                        /* renamed from: c */
                        public abstract int mo31176c();

                        @NonNull
                        /* renamed from: d */
                        public abstract String mo31177d();
                    }

                    @NonNull
                    /* renamed from: a */
                    public static C8273b m22882a() {
                        return new C6635m.C6637b();
                    }

                    @Nullable
                    /* renamed from: b */
                    public abstract C8251a mo31125b();

                    @NonNull
                    /* renamed from: c */
                    public abstract C6591a0<C8271a> mo31126c();

                    @Nullable
                    /* renamed from: d */
                    public abstract C8274c mo31127d();

                    @NonNull
                    /* renamed from: e */
                    public abstract C8276d mo31128e();

                    @Nullable
                    /* renamed from: f */
                    public abstract C6591a0<C8278e> mo31130f();
                }

                @NonNull
                /* renamed from: a */
                public static C8269a m22869a() {
                    return new C6632l.C6634b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Boolean mo31110b();

                @Nullable
                /* renamed from: c */
                public abstract C6591a0<C8254c> mo31111c();

                @NonNull
                /* renamed from: d */
                public abstract C8270b mo31112d();

                @Nullable
                /* renamed from: e */
                public abstract C6591a0<C8254c> mo31113e();

                /* renamed from: f */
                public abstract int mo31115f();

                @NonNull
                /* renamed from: g */
                public abstract C8269a mo31116g();
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$b */
            public static abstract class C8282b {
                @NonNull
                /* renamed from: a */
                public abstract C8267d mo31104a();

                @NonNull
                /* renamed from: b */
                public abstract C8282b mo31105b(@NonNull C8268a aVar);

                @NonNull
                /* renamed from: c */
                public abstract C8282b mo31106c(@NonNull C8283c cVar);

                @NonNull
                /* renamed from: d */
                public abstract C8282b mo31107d(@NonNull C8285d dVar);

                @NonNull
                /* renamed from: e */
                public abstract C8282b mo31108e(long j);

                @NonNull
                /* renamed from: f */
                public abstract C8282b mo31109f(@NonNull String str);
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$c */
            public static abstract class C8283c {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$c$a */
                public static abstract class C8284a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C8283c mo31208a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C8284a mo31209b(Double d);

                    @NonNull
                    /* renamed from: c */
                    public abstract C8284a mo31210c(int i);

                    @NonNull
                    /* renamed from: d */
                    public abstract C8284a mo31211d(long j);

                    @NonNull
                    /* renamed from: e */
                    public abstract C8284a mo31212e(int i);

                    @NonNull
                    /* renamed from: f */
                    public abstract C8284a mo31213f(boolean z);

                    @NonNull
                    /* renamed from: g */
                    public abstract C8284a mo31214g(long j);
                }

                @NonNull
                /* renamed from: a */
                public static C8284a m22952a() {
                    return new C6653s.C6655b();
                }

                @Nullable
                /* renamed from: b */
                public abstract Double mo31199b();

                /* renamed from: c */
                public abstract int mo31200c();

                /* renamed from: d */
                public abstract long mo31201d();

                /* renamed from: e */
                public abstract int mo31202e();

                /* renamed from: f */
                public abstract long mo31204f();

                /* renamed from: g */
                public abstract boolean mo31205g();
            }

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$d */
            public static abstract class C8285d {

                /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$d$d$a */
                public static abstract class C8286a {
                    @NonNull
                    /* renamed from: a */
                    public abstract C8285d mo31219a();

                    @NonNull
                    /* renamed from: b */
                    public abstract C8286a mo31220b(@NonNull String str);
                }

                @NonNull
                /* renamed from: a */
                public static C8286a m22966a() {
                    return new C6656t.C6658b();
                }

                @NonNull
                /* renamed from: b */
                public abstract String mo31215b();
            }

            @NonNull
            /* renamed from: a */
            public static C8282b m22862a() {
                return new C6629k.C6631b();
            }

            @NonNull
            /* renamed from: b */
            public abstract C8268a mo31095b();

            @NonNull
            /* renamed from: c */
            public abstract C8283c mo31096c();

            @Nullable
            /* renamed from: d */
            public abstract C8285d mo31097d();

            /* renamed from: e */
            public abstract long mo31098e();

            @NonNull
            /* renamed from: f */
            public abstract String mo31100f();

            @NonNull
            /* renamed from: g */
            public abstract C8282b mo31101g();
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e */
        public static abstract class C8287e {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$e$a */
            public static abstract class C8288a {
                @NonNull
                /* renamed from: a */
                public abstract C8287e mo31228a();

                @NonNull
                /* renamed from: b */
                public abstract C8288a mo31229b(@NonNull String str);

                @NonNull
                /* renamed from: c */
                public abstract C8288a mo31230c(boolean z);

                @NonNull
                /* renamed from: d */
                public abstract C8288a mo31231d(int i);

                @NonNull
                /* renamed from: e */
                public abstract C8288a mo31232e(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C8288a m22970a() {
                return new C6659u.C6661b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo31221b();

            /* renamed from: c */
            public abstract int mo31222c();

            @NonNull
            /* renamed from: d */
            public abstract String mo31223d();

            /* renamed from: e */
            public abstract boolean mo31224e();
        }

        /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f */
        public static abstract class C8289f {

            /* renamed from: com.google.firebase.crashlytics.internal.model.CrashlyticsReport$e$f$a */
            public static abstract class C8290a {
                @NonNull
                /* renamed from: a */
                public abstract C8289f mo31237a();

                @NonNull
                /* renamed from: b */
                public abstract C8290a mo31238b(@NonNull String str);
            }

            @NonNull
            /* renamed from: a */
            public static C8290a m22980a() {
                return new C6662v.C6664b();
            }

            @NonNull
            /* renamed from: b */
            public abstract String mo31233b();
        }

        @NonNull
        /* renamed from: a */
        public static C8264b m22797a() {
            C6619g.C6621b bVar = new C6619g.C6621b();
            bVar.mo31042c(false);
            return bVar;
        }

        @NonNull
        /* renamed from: b */
        public abstract C8261a mo31025b();

        @Nullable
        /* renamed from: c */
        public abstract C8265c mo31026c();

        @Nullable
        /* renamed from: d */
        public abstract Long mo31027d();

        @Nullable
        /* renamed from: e */
        public abstract C6591a0<C8267d> mo31028e();

        @NonNull
        /* renamed from: f */
        public abstract String mo31030f();

        /* renamed from: g */
        public abstract int mo31031g();

        @NonNull
        /* renamed from: h */
        public abstract String mo31032h();

        @NonNull
        /* renamed from: i */
        public byte[] mo37428i() {
            return mo31032h().getBytes(CrashlyticsReport.f15433a);
        }

        @Nullable
        /* renamed from: j */
        public abstract C8287e mo31034j();

        /* renamed from: k */
        public abstract long mo31035k();

        @Nullable
        /* renamed from: l */
        public abstract C8289f mo31036l();

        /* renamed from: m */
        public abstract boolean mo31037m();

        @NonNull
        /* renamed from: n */
        public abstract C8264b mo31038n();

        @NonNull
        /* renamed from: o */
        public C8260e mo37429o(@NonNull C6591a0<C8267d> a0Var) {
            C8264b n = mo31038n();
            n.mo31045f(a0Var);
            return n.mo31040a();
        }

        @NonNull
        /* renamed from: p */
        public C8260e mo37430p(long j, boolean z, @Nullable String str) {
            C8264b n = mo31038n();
            n.mo31044e(Long.valueOf(j));
            n.mo31042c(z);
            if (str != null) {
                C8289f.C8290a a = C8289f.m22980a();
                a.mo31238b(str);
                n.mo31051m(a.mo31237a());
            }
            return n.mo31040a();
        }
    }

    @NonNull
    /* renamed from: b */
    public static C8253b m22739b() {
        return new C6592b.C6594b();
    }

    @NonNull
    /* renamed from: c */
    public abstract String mo30934c();

    @NonNull
    /* renamed from: d */
    public abstract String mo30935d();

    @NonNull
    /* renamed from: e */
    public abstract String mo30936e();

    @NonNull
    /* renamed from: f */
    public abstract String mo30938f();

    @Nullable
    /* renamed from: g */
    public abstract C8256d mo30939g();

    /* renamed from: h */
    public abstract int mo30940h();

    @NonNull
    /* renamed from: i */
    public abstract String mo30942i();

    @Nullable
    /* renamed from: j */
    public abstract C8260e mo30943j();

    @NonNull
    /* renamed from: k */
    public abstract C8253b mo30944k();

    @NonNull
    /* renamed from: l */
    public CrashlyticsReport mo37425l(@NonNull C6591a0<C8260e.C8267d> a0Var) {
        if (mo30943j() != null) {
            C8253b k = mo30944k();
            k.mo30954i(mo30943j().mo37429o(a0Var));
            return k.mo30946a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    @NonNull
    /* renamed from: m */
    public CrashlyticsReport mo37426m(@NonNull C8256d dVar) {
        C8253b k = mo30944k();
        k.mo30954i((C8260e) null);
        k.mo30951f(dVar);
        return k.mo30946a();
    }

    @NonNull
    /* renamed from: n */
    public CrashlyticsReport mo37427n(long j, boolean z, @Nullable String str) {
        C8253b k = mo30944k();
        if (mo30943j() != null) {
            k.mo30954i(mo30943j().mo37430p(j, z, str));
        }
        return k.mo30946a();
    }
}
