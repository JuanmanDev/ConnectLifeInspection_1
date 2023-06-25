package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

public enum FieldType {
    DOUBLE(0, C8425b.SCALAR, JavaType.DOUBLE),
    FLOAT(1, C8425b.SCALAR, JavaType.FLOAT),
    INT64(2, C8425b.SCALAR, JavaType.LONG),
    UINT64(3, C8425b.SCALAR, JavaType.LONG),
    INT32(4, C8425b.SCALAR, JavaType.INT),
    FIXED64(5, C8425b.SCALAR, JavaType.LONG),
    FIXED32(6, C8425b.SCALAR, JavaType.INT),
    BOOL(7, C8425b.SCALAR, JavaType.BOOLEAN),
    STRING(8, C8425b.SCALAR, JavaType.STRING),
    MESSAGE(9, C8425b.SCALAR, JavaType.MESSAGE),
    BYTES(10, C8425b.SCALAR, JavaType.BYTE_STRING),
    UINT32(11, C8425b.SCALAR, JavaType.INT),
    ENUM(12, C8425b.SCALAR, JavaType.ENUM),
    SFIXED32(13, C8425b.SCALAR, JavaType.INT),
    SFIXED64(14, C8425b.SCALAR, JavaType.LONG),
    SINT32(15, C8425b.SCALAR, JavaType.INT),
    SINT64(16, C8425b.SCALAR, JavaType.LONG),
    GROUP(17, C8425b.SCALAR, JavaType.MESSAGE),
    DOUBLE_LIST(18, C8425b.VECTOR, JavaType.DOUBLE),
    FLOAT_LIST(19, C8425b.VECTOR, JavaType.FLOAT),
    INT64_LIST(20, C8425b.VECTOR, JavaType.LONG),
    UINT64_LIST(21, C8425b.VECTOR, JavaType.LONG),
    INT32_LIST(22, C8425b.VECTOR, JavaType.INT),
    FIXED64_LIST(23, C8425b.VECTOR, JavaType.LONG),
    FIXED32_LIST(24, C8425b.VECTOR, JavaType.INT),
    BOOL_LIST(25, C8425b.VECTOR, JavaType.BOOLEAN),
    STRING_LIST(26, C8425b.VECTOR, JavaType.STRING),
    MESSAGE_LIST(27, C8425b.VECTOR, JavaType.MESSAGE),
    BYTES_LIST(28, C8425b.VECTOR, JavaType.BYTE_STRING),
    UINT32_LIST(29, C8425b.VECTOR, JavaType.INT),
    ENUM_LIST(30, C8425b.VECTOR, JavaType.ENUM),
    SFIXED32_LIST(31, C8425b.VECTOR, JavaType.INT),
    SFIXED64_LIST(32, C8425b.VECTOR, JavaType.LONG),
    SINT32_LIST(33, C8425b.VECTOR, JavaType.INT),
    SINT64_LIST(34, C8425b.VECTOR, JavaType.LONG),
    DOUBLE_LIST_PACKED(35, C8425b.PACKED_VECTOR, JavaType.DOUBLE),
    FLOAT_LIST_PACKED(36, C8425b.PACKED_VECTOR, JavaType.FLOAT),
    INT64_LIST_PACKED(37, C8425b.PACKED_VECTOR, JavaType.LONG),
    UINT64_LIST_PACKED(38, C8425b.PACKED_VECTOR, JavaType.LONG),
    INT32_LIST_PACKED(39, C8425b.PACKED_VECTOR, JavaType.INT),
    FIXED64_LIST_PACKED(40, C8425b.PACKED_VECTOR, JavaType.LONG),
    FIXED32_LIST_PACKED(41, C8425b.PACKED_VECTOR, JavaType.INT),
    BOOL_LIST_PACKED(42, C8425b.PACKED_VECTOR, JavaType.BOOLEAN),
    UINT32_LIST_PACKED(43, C8425b.PACKED_VECTOR, JavaType.INT),
    ENUM_LIST_PACKED(44, C8425b.PACKED_VECTOR, JavaType.ENUM),
    SFIXED32_LIST_PACKED(45, C8425b.PACKED_VECTOR, JavaType.INT),
    SFIXED64_LIST_PACKED(46, C8425b.PACKED_VECTOR, JavaType.LONG),
    SINT32_LIST_PACKED(47, C8425b.PACKED_VECTOR, JavaType.INT),
    SINT64_LIST_PACKED(48, C8425b.PACKED_VECTOR, JavaType.LONG),
    GROUP_LIST(49, C8425b.VECTOR, JavaType.MESSAGE),
    MAP(50, C8425b.MAP, JavaType.VOID);
    
    public static final Type[] EMPTY_TYPES = null;
    public static final FieldType[] VALUES = null;
    public final C8425b collection;
    public final Class<?> elementType;

    /* renamed from: id */
    public final int f15517id;
    public final JavaType javaType;
    public final boolean primitiveScalar;

    /* renamed from: com.google.protobuf.FieldType$a */
    public static /* synthetic */ class C8424a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15518a = null;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15519b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.JavaType[] r0 = com.google.protobuf.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15519b = r0
                r1 = 1
                com.google.protobuf.JavaType r2 = com.google.protobuf.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15519b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.JavaType r3 = com.google.protobuf.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f15519b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.JavaType r4 = com.google.protobuf.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.FieldType$b[] r3 = com.google.protobuf.FieldType.C8425b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15518a = r3
                com.google.protobuf.FieldType$b r4 = com.google.protobuf.FieldType.C8425b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f15518a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.FieldType$b r3 = com.google.protobuf.FieldType.C8425b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f15518a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.FieldType$b r1 = com.google.protobuf.FieldType.C8425b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldType.C8424a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.FieldType$b */
    public enum C8425b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: e */
        public final boolean f15525e;

        /* access modifiers changed from: public */
        C8425b(boolean z) {
            this.f15525e = z;
        }

        /* renamed from: c */
        public boolean mo37963c() {
            return this.f15525e;
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        EMPTY_TYPES = new Type[0];
        FieldType[] values = values();
        VALUES = new FieldType[values.length];
        for (FieldType fieldType : values) {
            VALUES[fieldType.f15517id] = fieldType;
        }
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.protobuf.FieldType.C8424a.f15519b[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FieldType(int r4, com.google.protobuf.FieldType.C8425b r5, com.google.protobuf.JavaType r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f15517id = r4
            r1.collection = r5
            r1.javaType = r6
            int[] r2 = com.google.protobuf.FieldType.C8424a.f15518a
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.elementType = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
        L_0x0028:
            r2 = 0
            com.google.protobuf.FieldType$b r0 = com.google.protobuf.FieldType.C8425b.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.protobuf.FieldType.C8424a.f15519b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r2
        L_0x003e:
            r1.primitiveScalar = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldType.<init>(java.lang.String, int, int, com.google.protobuf.FieldType$b, com.google.protobuf.JavaType):void");
    }

    public static FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        FieldType[] fieldTypeArr = VALUES;
        if (i >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[i];
    }

    public static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                if (List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                    return type;
                }
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        if (List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    public static Type getListParameter(Class<?> cls, Type[] typeArr) {
        Class<? super Object> cls2;
        boolean z;
        while (true) {
            int i = 0;
            Class<? super Object> cls3 = cls;
            if (cls3 != List.class) {
                Type genericSuperList = getGenericSuperList(cls3);
                if (!(genericSuperList instanceof ParameterizedType)) {
                    typeArr = EMPTY_TYPES;
                    Class<? super Object>[] interfaces = cls3.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i >= length) {
                            cls2 = cls3.getSuperclass();
                            break;
                        }
                        Class<? super Object> cls4 = interfaces[i];
                        if (List.class.isAssignableFrom(cls4)) {
                            cls2 = cls4;
                            break;
                        }
                        i++;
                    }
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable[] typeParameters = cls3.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= typeParameters.length) {
                                        z = false;
                                        break;
                                    } else if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    typeArr = actualTypeArguments;
                    cls2 = (Class) parameterizedType.getRawType();
                }
                cls3 = cls2;
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    /* renamed from: id */
    public int mo37956id() {
        return this.f15517id;
    }

    public boolean isList() {
        return this.collection.mo37963c();
    }

    public boolean isMap() {
        return this.collection == C8425b.MAP;
    }

    public boolean isPacked() {
        return C8425b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == C8425b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        if (C8425b.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
