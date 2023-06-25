package p040c.p200q.p363c.p385q.p388j;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* renamed from: c.q.c.q.j.c */
/* compiled from: AtProtobuf */
public final class C6727c {

    /* renamed from: a */
    public int f12866a;

    /* renamed from: b */
    public Protobuf.IntEncoding f12867b = Protobuf.IntEncoding.DEFAULT;

    /* renamed from: c.q.c.q.j.c$a */
    /* compiled from: AtProtobuf */
    public static final class C6728a implements Protobuf {

        /* renamed from: a */
        public final int f12868a;

        /* renamed from: b */
        public final Protobuf.IntEncoding f12869b;

        public C6728a(int i, Protobuf.IntEncoding intEncoding) {
            this.f12868a = i;
            this.f12869b = intEncoding;
        }

        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f12868a != protobuf.tag() || !this.f12869b.equals(protobuf.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f12868a ^ 14552422) + (this.f12869b.hashCode() ^ 2041407134);
        }

        public Protobuf.IntEncoding intEncoding() {
            return this.f12869b;
        }

        public int tag() {
            return this.f12868a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f12868a + "intEncoding=" + this.f12869b + ')';
        }
    }

    /* renamed from: b */
    public static C6727c m19039b() {
        return new C6727c();
    }

    /* renamed from: a */
    public Protobuf mo31372a() {
        return new C6728a(this.f12866a, this.f12867b);
    }

    /* renamed from: c */
    public C6727c mo31373c(int i) {
        this.f12866a = i;
        return this;
    }
}
