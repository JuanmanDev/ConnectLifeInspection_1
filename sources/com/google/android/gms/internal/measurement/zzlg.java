package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p294g.p335i.C5369z8;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzlg extends LinkedHashMap {
    public static final zzlg zza;
    public boolean zzb = true;

    static {
        zzlg zzlg = new zzlg();
        zza = zzlg;
        zzlg.zzb = false;
    }

    public zzlg() {
    }

    public static zzlg zza() {
        return zza;
    }

    public static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return C5369z8.m15422b((byte[]) obj);
        }
        return obj.hashCode();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        zzg();
        C5369z8.m15425e(obj);
        C5369z8.m15425e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        zzg();
        for (Object next : map.keySet()) {
            C5369z8.m15425e(next);
            C5369z8.m15425e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzlg zzb() {
        return isEmpty() ? new zzlg() : new zzlg(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzlg zzlg) {
        zzg();
        if (!zzlg.isEmpty()) {
            putAll(zzlg);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    public zzlg(Map map) {
        super(map);
    }
}
