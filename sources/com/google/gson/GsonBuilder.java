package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class GsonBuilder {
    public boolean complexMapKeySerialization = false;
    public String datePattern = Gson.DEFAULT_DATE_PATTERN;
    public int dateStyle = 2;
    public boolean escapeHtmlChars = true;
    public Excluder excluder = Excluder.DEFAULT;
    public final List<TypeAdapterFactory> factories = new ArrayList();
    public FieldNamingStrategy fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
    public boolean generateNonExecutableJson = false;
    public final List<TypeAdapterFactory> hierarchyFactories = new ArrayList();
    public final Map<Type, InstanceCreator<?>> instanceCreators = new HashMap();
    public boolean lenient = false;
    public LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
    public ToNumberStrategy numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
    public ToNumberStrategy objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
    public boolean prettyPrinting = false;
    public final LinkedList<ReflectionAccessFilter> reflectionFilters = new LinkedList<>();
    public boolean serializeNulls = false;
    public boolean serializeSpecialFloatingPointValues = false;
    public int timeStyle = 2;
    public boolean useJdkUnsafe = true;

    public GsonBuilder() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addTypeAdaptersForDate(java.lang.String r5, int r6, int r7, java.util.List<com.google.gson.TypeAdapterFactory> r8) {
        /*
            r4 = this;
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r6 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r6 = r6.createAdapterFactory((java.lang.String) r5)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r7 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r7.createAdapterFactory((java.lang.String) r5)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r7 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r5 = r7.createAdapterFactory((java.lang.String) r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r5 = r5.createAdapterFactory(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r1 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r1.createAdapterFactory(r6, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r6 = r2.createAdapterFactory(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.GsonBuilder.addTypeAdaptersForDate(java.lang.String, int, int, java.util.List):void");
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter) {
        if (reflectionAccessFilter != null) {
            this.reflectionFilters.addFirst(reflectionAccessFilter);
            return this;
        }
        throw null;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy) {
        this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.factories.size() + this.hierarchyFactories.size() + 3);
        arrayList2.addAll(this.factories);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList2);
        Excluder excluder2 = this.excluder;
        FieldNamingStrategy fieldNamingStrategy = this.fieldNamingPolicy;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.instanceCreators);
        boolean z = this.serializeNulls;
        boolean z2 = this.complexMapKeySerialization;
        boolean z3 = this.generateNonExecutableJson;
        boolean z4 = this.escapeHtmlChars;
        boolean z5 = this.prettyPrinting;
        boolean z6 = this.lenient;
        boolean z7 = this.serializeSpecialFloatingPointValues;
        boolean z8 = this.useJdkUnsafe;
        LongSerializationPolicy longSerializationPolicy2 = this.longSerializationPolicy;
        String str = this.datePattern;
        int i = this.dateStyle;
        int i2 = this.timeStyle;
        ArrayList arrayList4 = r1;
        Excluder excluder3 = excluder2;
        ArrayList arrayList5 = new ArrayList(this.factories);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.hierarchyFactories);
        ToNumberStrategy toNumberStrategy = this.objectToNumberStrategy;
        ToNumberStrategy toNumberStrategy2 = this.numberToNumberStrategy;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.reflectionFilters);
        return new Gson(excluder3, fieldNamingStrategy, hashMap, z, z2, z3, z4, z5, z6, z7, z8, longSerializationPolicy2, str, i, i2, arrayList4, arrayList6, arrayList, toNumberStrategy, toNumberStrategy2, arrayList8);
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof InstanceCreator) || (obj instanceof TypeAdapter));
        if (obj instanceof InstanceCreator) {
            this.instanceCreators.put(type, (InstanceCreator) obj);
        }
        if (z || (obj instanceof JsonDeserializer)) {
            this.factories.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.factories.add(TypeAdapters.newFactory(TypeToken.get(type), (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory) {
        this.factories.add(typeAdapterFactory);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        boolean z = obj instanceof JsonSerializer;
        C$Gson$Preconditions.checkArgument(z || (obj instanceof JsonDeserializer) || (obj instanceof TypeAdapter));
        if ((obj instanceof JsonDeserializer) || z) {
            this.hierarchyFactories.add(TreeTypeAdapter.newTypeHierarchyFactory(cls, obj));
        }
        if (obj instanceof TypeAdapter) {
            this.factories.add(TypeAdapters.newTypeHierarchyFactory(cls, (TypeAdapter) obj));
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy... exclusionStrategyArr) {
        for (ExclusionStrategy withExclusionStrategy : exclusionStrategyArr) {
            this.excluder = this.excluder.withExclusionStrategy(withExclusionStrategy, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy2) {
        this.fieldNamingPolicy = fieldNamingPolicy2;
        return this;
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setLenient() {
        this.lenient = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy2) {
        this.longSerializationPolicy = longSerializationPolicy2;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        this.numberToNumberStrategy = toNumberStrategy;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy) {
        this.objectToNumberStrategy = toNumberStrategy;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.prettyPrinting = true;
        return this;
    }

    public GsonBuilder setVersion(double d) {
        this.excluder = this.excluder.withVersion(d);
        return this;
    }

    public GsonBuilder setDateFormat(int i) {
        this.dateStyle = i;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i, int i2) {
        this.dateStyle = i;
        this.timeStyle = i2;
        this.datePattern = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        this.instanceCreators.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.prettyPrinting = gson.prettyPrinting;
        this.lenient = gson.lenient;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        this.factories.addAll(gson.builderFactories);
        this.hierarchyFactories.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        this.reflectionFilters.addAll(gson.reflectionFilters);
    }
}
