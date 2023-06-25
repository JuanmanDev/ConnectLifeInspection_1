package p040c.p200q.p353b.p359f;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: c.q.b.f.b */
/* compiled from: Invokable */
public abstract class C6261b<T, R> extends C6260a implements GenericDeclaration {

    /* renamed from: c.q.b.f.b$a */
    /* compiled from: Invokable */
    public static class C6262a<T> extends C6261b<T, T> {

        /* renamed from: m */
        public final Constructor<?> f11880m;

        public C6262a(Constructor<?> constructor) {
            super(constructor);
            this.f11880m = constructor;
        }

        /* renamed from: b */
        public Type[] mo30292b() {
            Type[] genericParameterTypes = this.f11880m.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !mo30293c()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f11880m.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        /* renamed from: c */
        public final boolean mo30293c() {
            Class<?> declaringClass = this.f11880m.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                return false;
            }
            return true;
        }

        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable[] typeParameters2 = this.f11880m.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }
    }

    /* renamed from: c.q.b.f.b$b */
    /* compiled from: Invokable */
    public static class C6263b<T> extends C6261b<T, Object> {

        /* renamed from: m */
        public final Method f11881m;

        public C6263b(Method method) {
            super(method);
            this.f11881m = method;
        }

        public final TypeVariable<?>[] getTypeParameters() {
            return this.f11881m.getTypeParameters();
        }
    }

    public <M extends AccessibleObject & Member> C6261b(M m) {
        super(m);
    }

    public final Class<? super T> getDeclaringClass() {
        return super.getDeclaringClass();
    }
}
