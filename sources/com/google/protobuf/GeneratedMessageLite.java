package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.C8426a;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p040c.p200q.p405d.C6884a;
import p040c.p200q.p405d.C6887a1;
import p040c.p200q.p405d.C6888b;
import p040c.p200q.p405d.C6903d1;
import p040c.p200q.p405d.C6904e;
import p040c.p200q.p405d.C6937j;
import p040c.p200q.p405d.C6945k;
import p040c.p200q.p405d.C6948k1;
import p040c.p200q.p405d.C6949l;
import p040c.p200q.p405d.C6954m0;
import p040c.p200q.p405d.C6959n;
import p040c.p200q.p405d.C6961n1;
import p040c.p200q.p405d.C6968o0;
import p040c.p200q.p405d.C6975p;
import p040c.p200q.p405d.C6988u;
import p040c.p200q.p405d.C6996w0;
import p040c.p200q.p405d.C6999y;
import p040c.p200q.p405d.C7009y0;
import p040c.p200q.p405d.C7014z0;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C8426a<MessageType, BuilderType>> extends C6884a<MessageType, BuilderType> {

    /* renamed from: n */
    public static Map<Object, GeneratedMessageLite<?, ?>> f15526n = new ConcurrentHashMap();

    /* renamed from: l */
    public C6948k1 f15527l = C6948k1.m20192e();

    /* renamed from: m */
    public int f15528m = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final byte[] asBytes;
        public final Class<?> messageClass;
        public final String messageClassName;

        public SerializedForm(C6954m0 m0Var) {
            Class<?> cls = m0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = m0Var.mo31732f();
        }

        /* renamed from: of */
        public static SerializedForm m23254of(C6954m0 m0Var) {
            return new SerializedForm(m0Var);
        }

        @Deprecated
        private Object readResolveFallback() {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                C6954m0.C6955a h = ((C6954m0) declaredField.get((Object) null)).mo32218h();
                h.mo31743u(this.asBytes);
                return h.mo32220D();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e2);
            } catch (SecurityException e3) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Unable to call parsePartialFrom", e4);
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            }
        }

        private Class<?> resolveMessageClass() {
            Class<?> cls = this.messageClass;
            return cls != null ? cls : Class.forName(this.messageClassName);
        }

        public Object readResolve() {
            try {
                Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                C6954m0.C6955a h = ((C6954m0) declaredField.get((Object) null)).mo32218h();
                h.mo31743u(this.asBytes);
                return h.mo32220D();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e2) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (InvalidProtocolBufferException e4) {
                throw new RuntimeException("Unable to understand proto buffer", e4);
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static abstract class C8426a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C8426a<MessageType, BuilderType>> extends C6884a.C6885a<MessageType, BuilderType> {

        /* renamed from: e */
        public final MessageType f15529e;

        /* renamed from: l */
        public MessageType f15530l;

        /* renamed from: m */
        public boolean f15531m = false;

        public C8426a(MessageType messagetype) {
            this.f15529e = messagetype;
            this.f15530l = (GeneratedMessageLite) messagetype.mo37970p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: C */
        public BuilderType mo37976C(byte[] bArr, int i, int i2, C6975p pVar) {
            mo37982s();
            try {
                C7009y0.m20722a().mo32433e(this.f15530l).mo31887f(this.f15530l, bArr, i, i + i2, new C6904e.C6906b(pVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* renamed from: E */
        public final void mo37977E(MessageType messagetype, MessageType messagetype2) {
            C7009y0.m20722a().mo32433e(messagetype).mo31882a(messagetype, messagetype2);
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.m23235x(this.f15530l, false);
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C6884a.C6885a mo31739j(C6884a aVar) {
            mo37985w((GeneratedMessageLite) aVar);
            return this;
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ C6884a.C6885a mo31742m(byte[] bArr, int i, int i2) {
            mo37987z(bArr, i, i2);
            return this;
        }

        /* renamed from: p */
        public final MessageType build() {
            MessageType q = mo32220D();
            if (q.isInitialized()) {
                return q;
            }
            throw C6884a.C6885a.m19565n(q);
        }

        /* renamed from: q */
        public MessageType mo32220D() {
            if (this.f15531m) {
                return this.f15530l;
            }
            this.f15530l.mo37974y();
            this.f15531m = true;
            return this.f15530l;
        }

        /* renamed from: r */
        public BuilderType clone() {
            BuilderType A = mo32244a().mo32218h();
            A.mo37986y(mo32220D());
            return A;
        }

        /* renamed from: s */
        public final void mo37982s() {
            if (this.f15531m) {
                mo37983t();
                this.f15531m = false;
            }
        }

        /* renamed from: t */
        public void mo37983t() {
            MessageType messagetype = (GeneratedMessageLite) this.f15530l.mo37970p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mo37977E(messagetype, this.f15530l);
            this.f15530l = messagetype;
        }

        /* renamed from: v */
        public MessageType mo32244a() {
            return this.f15529e;
        }

        /* renamed from: w */
        public BuilderType mo37985w(MessageType messagetype) {
            mo37986y(messagetype);
            return this;
        }

        /* renamed from: y */
        public BuilderType mo37986y(MessageType messagetype) {
            mo37982s();
            mo37977E(this.f15530l, messagetype);
            return this;
        }

        /* renamed from: z */
        public BuilderType mo37987z(byte[] bArr, int i, int i2) {
            mo37976C(bArr, i, i2, C6975p.m20507b());
            return this;
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static class C8427b<T extends GeneratedMessageLite<T, ?>> extends C6888b<T> {

        /* renamed from: a */
        public final T f15532a;

        public C8427b(T t) {
            this.f15532a = t;
        }

        /* renamed from: g */
        public T mo32408b(C6937j jVar, C6975p pVar) {
            return GeneratedMessageLite.m23230E(this.f15532a, jVar, pVar);
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static abstract class C8428c<MessageType extends C8428c<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements Object<MessageType, BuilderType> {

        /* renamed from: o */
        public C6988u<C8429d> f15533o = C6988u.m20645h();

        /* renamed from: H */
        public C6988u<C8429d> mo37989H() {
            if (this.f15533o.mo32366o()) {
                this.f15533o = this.f15533o.clone();
            }
            return this.f15533o;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C6954m0 mo32244a() {
            return GeneratedMessageLite.super.mo32244a();
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ C6954m0.C6955a mo32215b() {
            return GeneratedMessageLite.super.mo32215b();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C6954m0.C6955a mo32218h() {
            return GeneratedMessageLite.super.mo32218h();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C8429d implements C6988u.C6990b<C8429d> {

        /* renamed from: e */
        public final C6999y.C7003d<?> f15534e;

        /* renamed from: l */
        public final int f15535l;

        /* renamed from: m */
        public final WireFormat.FieldType f15536m;

        /* renamed from: n */
        public final boolean f15537n;

        /* renamed from: o */
        public final boolean f15538o;

        /* renamed from: c */
        public int compareTo(C8429d dVar) {
            return this.f15535l - dVar.f15535l;
        }

        /* renamed from: d */
        public C6999y.C7003d<?> mo37992d() {
            return this.f15534e;
        }

        /* renamed from: f */
        public boolean mo32374f() {
            return this.f15537n;
        }

        public int getNumber() {
            return this.f15535l;
        }

        public boolean isPacked() {
            return this.f15538o;
        }

        /* renamed from: l */
        public WireFormat.FieldType mo32377l() {
            return this.f15536m;
        }

        /* renamed from: p */
        public C6954m0.C6955a mo32378p(C6954m0.C6955a aVar, C6954m0 m0Var) {
            C8426a aVar2 = (C8426a) aVar;
            aVar2.mo37986y((GeneratedMessageLite) m0Var);
            return aVar2;
        }

        /* renamed from: s */
        public WireFormat.JavaType mo32379s() {
            return this.f15536m.getJavaType();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public static class C8430e<ContainingType extends C6954m0, Type> extends C6959n<ContainingType, Type> {

        /* renamed from: a */
        public final C6954m0 f15539a;

        /* renamed from: b */
        public final C8429d f15540b;

        /* renamed from: a */
        public WireFormat.FieldType mo37993a() {
            return this.f15540b.mo32377l();
        }

        /* renamed from: b */
        public C6954m0 mo37994b() {
            return this.f15539a;
        }

        /* renamed from: c */
        public int mo37995c() {
            return this.f15540b.getNumber();
        }

        /* renamed from: d */
        public boolean mo37996d() {
            return this.f15540b.f15537n;
        }
    }

    /* renamed from: C */
    public static Object m23229C(C6954m0 m0Var, String str, Object[] objArr) {
        return new C6887a1(m0Var, str, objArr);
    }

    /* renamed from: E */
    public static <T extends GeneratedMessageLite<T, ?>> T m23230E(T t, C6937j jVar, C6975p pVar) {
        T t2 = (GeneratedMessageLite) t.mo37970p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C6903d1 e = C7009y0.m20722a().mo32433e(t2);
            e.mo31886e(t2, C6945k.m20137P(jVar), pVar);
            e.mo31884c(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: F */
    public static <T extends GeneratedMessageLite<?, ?>> void m23231F(Class<T> cls, T t) {
        f15526n.put(cls, t);
    }

    /* renamed from: s */
    public static <E> C6999y.C7008i<E> m23232s() {
        return C7014z0.m20731g();
    }

    /* renamed from: t */
    public static <T extends GeneratedMessageLite<?, ?>> T m23233t(Class<T> cls) {
        T t = (GeneratedMessageLite) f15526n.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) f15526n.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) C6961n1.m20357j(cls)).mo32244a();
            if (t != null) {
                f15526n.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: w */
    public static Object m23234w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: x */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean m23235x(T t, boolean z) {
        byte byteValue = ((Byte) t.mo37970p(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C7009y0.m20722a().mo32433e(t).mo31885d(t);
        if (z) {
            t.mo37971q(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, d ? t : null);
        }
        return d;
    }

    /* renamed from: z */
    public static <E> C6999y.C7008i<E> m23236z(C6999y.C7008i<E> iVar) {
        int size = iVar.size();
        return iVar.mo31773q(size == 0 ? 10 : size * 2);
    }

    /* renamed from: A */
    public final BuilderType mo32218h() {
        return (C8426a) mo37970p(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: G */
    public final BuilderType mo32215b() {
        BuilderType buildertype = (C8426a) mo37970p(MethodToInvoke.NEW_BUILDER);
        buildertype.mo37986y(this);
        return buildertype;
    }

    /* renamed from: c */
    public void mo32216c(CodedOutputStream codedOutputStream) {
        C7009y0.m20722a().mo32433e(this).mo31883b(this, C6949l.m20207P(codedOutputStream));
    }

    /* renamed from: e */
    public int mo32217e() {
        if (this.f15528m == -1) {
            this.f15528m = C7009y0.m20722a().mo32433e(this).mo31889h(this);
        }
        return this.f15528m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mo32244a().getClass().isInstance(obj)) {
            return false;
        }
        return C7009y0.m20722a().mo32433e(this).mo31888g(this, (GeneratedMessageLite) obj);
    }

    /* renamed from: g */
    public int mo31733g() {
        return this.f15528m;
    }

    public int hashCode() {
        int i = this.f13173e;
        if (i != 0) {
            return i;
        }
        int i2 = C7009y0.m20722a().mo32433e(this).mo31890i(this);
        this.f13173e = i2;
        return i2;
    }

    /* renamed from: i */
    public final C6996w0<MessageType> mo32219i() {
        return (C6996w0) mo37970p(MethodToInvoke.GET_PARSER);
    }

    public final boolean isInitialized() {
        return m23235x(this, true);
    }

    /* renamed from: m */
    public void mo31737m(int i) {
        this.f15528m = i;
    }

    /* renamed from: n */
    public Object mo37968n() {
        return mo37970p(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    /* renamed from: o */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C8426a<MessageType, BuilderType>> BuilderType mo37969o() {
        return (C8426a) mo37970p(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: p */
    public Object mo37970p(MethodToInvoke methodToInvoke) {
        return mo25271r(methodToInvoke, (Object) null, (Object) null);
    }

    /* renamed from: q */
    public Object mo37971q(MethodToInvoke methodToInvoke, Object obj) {
        return mo25271r(methodToInvoke, obj, (Object) null);
    }

    /* renamed from: r */
    public abstract Object mo25271r(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        return C6968o0.m20435e(this, super.toString());
    }

    /* renamed from: v */
    public final MessageType mo32244a() {
        return (GeneratedMessageLite) mo37970p(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: y */
    public void mo37974y() {
        C7009y0.m20722a().mo32433e(this).mo31884c(this);
    }
}
