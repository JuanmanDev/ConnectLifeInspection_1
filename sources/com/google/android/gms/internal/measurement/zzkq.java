package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public enum zzkq {
    VOID(Void.class, Void.class, (Class) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzje.class, zzje.class, zzje.zzb),
    ENUM(Integer.TYPE, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    
    public final Class zzl;
    public final Class zzm;
    public final Object zzn;

    /* access modifiers changed from: public */
    zzkq(Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public final Class zza() {
        return this.zzm;
    }
}
