package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p287b.C3542a;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;
import p040c.p200q.p201a.p264c.p276d.p289n.C3560k;
import p040c.p200q.p201a.p264c.p276d.p289n.C3561l;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class FastJsonResponse {

    /* renamed from: com.google.android.gms.common.server.response.FastJsonResponse$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4073a<I, O> {
        @NonNull
        /* renamed from: s */
        I mo24620s(@NonNull O o);
    }

    @NonNull
    /* renamed from: f */
    public static final <O, I> I m10983f(@NonNull Field<I, O> field, @Nullable Object obj) {
        return field.f8319u != null ? field.mo24630Y(obj) : obj;
    }

    /* renamed from: g */
    public static final void m10984g(StringBuilder sb, Field field, Object obj) {
        int i = field.f8310l;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.f8316r;
            C3495o.m8908j(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(C3560k.m9078a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo24326a();

    @Nullable
    /* renamed from: b */
    public Object mo24327b(@NonNull Field field) {
        String str = field.f8314p;
        if (field.f8316r == null) {
            return mo24625c(str);
        }
        C3495o.m8913o(mo24625c(str) == null, "Concrete field shouldn't be value object: %s", field.f8314p);
        boolean z = field.f8313o;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo24625c(@NonNull String str);

    /* renamed from: d */
    public boolean mo24328d(@NonNull Field field) {
        UnsupportedOperationException unsupportedOperationException;
        if (field.f8312n != 11) {
            return mo24626e(field.f8314p);
        }
        boolean z = field.f8313o;
        String str = field.f8314p;
        if (z) {
            throw unsupportedOperationException;
        }
        unsupportedOperationException = new UnsupportedOperationException("Concrete types not supported");
        throw unsupportedOperationException;
    }

    /* renamed from: e */
    public abstract boolean mo24626e(@NonNull String str);

    @NonNull
    public String toString() {
        Map<String, Field<?, ?>> a = mo24326a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo24328d(field)) {
                Object f = m10983f(field, mo24327b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (f != null) {
                    switch (field.f8312n) {
                        case 8:
                            sb.append("\"");
                            sb.append(C3552c.m9056c((byte[]) f));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(C3552c.m9057d((byte[]) f));
                            sb.append("\"");
                            break;
                        case 10:
                            C3561l.m9079a(sb, (HashMap) f);
                            break;
                        default:
                            if (!field.f8311m) {
                                m10984g(sb, field, f);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) f;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(RunnerArgs.CLASS_SEPARATOR);
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m10984g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final C3542a CREATOR = new C3542a();

        /* renamed from: e */
        public final int f8309e;

        /* renamed from: l */
        public final int f8310l;

        /* renamed from: m */
        public final boolean f8311m;

        /* renamed from: n */
        public final int f8312n;

        /* renamed from: o */
        public final boolean f8313o;
        @NonNull

        /* renamed from: p */
        public final String f8314p;

        /* renamed from: q */
        public final int f8315q;
        @Nullable

        /* renamed from: r */
        public final Class<? extends FastJsonResponse> f8316r;
        @Nullable

        /* renamed from: s */
        public final String f8317s;

        /* renamed from: t */
        public zan f8318t;
        @Nullable

        /* renamed from: u */
        public C4073a<I, O> f8319u;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, @Nullable String str2, @Nullable zaa zaa) {
            this.f8309e = i;
            this.f8310l = i2;
            this.f8311m = z;
            this.f8312n = i3;
            this.f8313o = z2;
            this.f8314p = str;
            this.f8315q = i4;
            if (str2 == null) {
                this.f8316r = null;
                this.f8317s = null;
            } else {
                this.f8316r = SafeParcelResponse.class;
                this.f8317s = str2;
            }
            if (zaa == null) {
                this.f8319u = null;
            } else {
                this.f8319u = zaa.mo24622Q();
            }
        }

        @NonNull
        /* renamed from: P */
        public static Field<byte[], byte[]> m10990P(@NonNull String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class<? extends FastJsonResponse>) null, (C4073a) null);
        }

        @NonNull
        /* renamed from: Q */
        public static <T extends FastJsonResponse> Field<T, T> m10991Q(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (C4073a) null);
        }

        @NonNull
        /* renamed from: R */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m10992R(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (C4073a) null);
        }

        @NonNull
        /* renamed from: S */
        public static Field<Integer, Integer> m10993S(@NonNull String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class<? extends FastJsonResponse>) null, (C4073a) null);
        }

        @NonNull
        /* renamed from: T */
        public static Field<String, String> m10994T(@NonNull String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class<? extends FastJsonResponse>) null, (C4073a) null);
        }

        @NonNull
        /* renamed from: U */
        public static Field<ArrayList<String>, ArrayList<String>> m10995U(@NonNull String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class<? extends FastJsonResponse>) null, (C4073a) null);
        }

        /* renamed from: V */
        public int mo24628V() {
            return this.f8315q;
        }

        @Nullable
        /* renamed from: W */
        public final zaa mo24629W() {
            C4073a<I, O> aVar = this.f8319u;
            if (aVar == null) {
                return null;
            }
            return zaa.m10981P(aVar);
        }

        @NonNull
        /* renamed from: Y */
        public final I mo24630Y(@NonNull O o) {
            C3495o.m8908j(this.f8319u);
            return this.f8319u.mo24620s(o);
        }

        @Nullable
        /* renamed from: Z */
        public final String mo24631Z() {
            String str = this.f8317s;
            if (str == null) {
                return null;
            }
            return str;
        }

        @NonNull
        /* renamed from: a0 */
        public final Map<String, Field<?, ?>> mo24632a0() {
            C3495o.m8908j(this.f8317s);
            C3495o.m8908j(this.f8318t);
            Map<String, Field<?, ?>> Q = this.f8318t.mo24646Q(this.f8317s);
            C3495o.m8908j(Q);
            return Q;
        }

        /* renamed from: b0 */
        public final void mo24633b0(zan zan) {
            this.f8318t = zan;
        }

        /* renamed from: c0 */
        public final boolean mo24634c0() {
            return this.f8319u != null;
        }

        @NonNull
        public final String toString() {
            C3487m.C3488a c = C3487m.m8888c(this);
            c.mo20747a("versionCode", Integer.valueOf(this.f8309e));
            c.mo20747a("typeIn", Integer.valueOf(this.f8310l));
            c.mo20747a("typeInArray", Boolean.valueOf(this.f8311m));
            c.mo20747a("typeOut", Integer.valueOf(this.f8312n));
            c.mo20747a("typeOutArray", Boolean.valueOf(this.f8313o));
            c.mo20747a("outputFieldName", this.f8314p);
            c.mo20747a("safeParcelFieldId", Integer.valueOf(this.f8315q));
            c.mo20747a("concreteTypeName", mo24631Z());
            Class<? extends FastJsonResponse> cls = this.f8316r;
            if (cls != null) {
                c.mo20747a("concreteType.class", cls.getCanonicalName());
            }
            C4073a<I, O> aVar = this.f8319u;
            if (aVar != null) {
                c.mo20747a("converterName", aVar.getClass().getCanonicalName());
            }
            return c.toString();
        }

        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int a = C3514a.m8952a(parcel);
            C3514a.m8963l(parcel, 1, this.f8309e);
            C3514a.m8963l(parcel, 2, this.f8310l);
            C3514a.m8954c(parcel, 3, this.f8311m);
            C3514a.m8963l(parcel, 4, this.f8312n);
            C3514a.m8954c(parcel, 5, this.f8313o);
            C3514a.m8970s(parcel, 6, this.f8314p, false);
            C3514a.m8963l(parcel, 7, mo24628V());
            C3514a.m8970s(parcel, 8, mo24631Z(), false);
            C3514a.m8968q(parcel, 9, mo24629W(), i, false);
            C3514a.m8953b(parcel, a);
        }

        public Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class<? extends FastJsonResponse> cls, @Nullable C4073a<I, O> aVar) {
            this.f8309e = 1;
            this.f8310l = i;
            this.f8311m = z;
            this.f8312n = i2;
            this.f8313o = z2;
            this.f8314p = str;
            this.f8315q = i3;
            this.f8316r = cls;
            if (cls == null) {
                this.f8317s = null;
            } else {
                this.f8317s = cls.getCanonicalName();
            }
            this.f8319u = aVar;
        }
    }
}
