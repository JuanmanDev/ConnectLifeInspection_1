package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p287b.C3546e;
import p040c.p200q.p201a.p264c.p276d.p289n.C3551b;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;
import p040c.p200q.p201a.p264c.p276d.p289n.C3560k;
import p040c.p200q.p201a.p264c.p276d.p289n.C3561l;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @NonNull
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C3546e();

    /* renamed from: e */
    public final int f8320e;

    /* renamed from: l */
    public final Parcel f8321l;

    /* renamed from: m */
    public final int f8322m = 2;

    /* renamed from: n */
    public final zan f8323n;
    @Nullable

    /* renamed from: o */
    public final String f8324o;

    /* renamed from: p */
    public int f8325p;

    /* renamed from: q */
    public int f8326q;

    public SafeParcelResponse(int i, Parcel parcel, zan zan) {
        this.f8320e = i;
        C3495o.m8908j(parcel);
        this.f8321l = parcel;
        this.f8323n = zan;
        this.f8324o = zan == null ? null : zan.mo24645P();
        this.f8325p = 2;
    }

    /* renamed from: j */
    public static final void m11007j(StringBuilder sb, int i, @Nullable Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                C3495o.m8908j(obj);
                sb.append(C3560k.m9078a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C3552c.m9056c((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C3552c.m9057d((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                C3495o.m8908j(obj);
                C3561l.m9079a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: k */
    public static final void m11008k(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.f8311m) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                }
                m11007j(sb, field.f8310l, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m11007j(sb, field.f8310l, obj);
    }

    @Nullable
    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo24326a() {
        zan zan = this.f8323n;
        if (zan == null) {
            return null;
        }
        String str = this.f8324o;
        C3495o.m8908j(str);
        return zan.mo24646Q(str);
    }

    @NonNull
    /* renamed from: c */
    public final Object mo24625c(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: e */
    public final boolean mo24626e(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @NonNull
    /* renamed from: h */
    public final Parcel mo24640h() {
        int i = this.f8325p;
        if (i == 0) {
            int a = C3514a.m8952a(this.f8321l);
            this.f8326q = a;
            C3514a.m8953b(this.f8321l, a);
            this.f8325p = 2;
        } else if (i == 1) {
            C3514a.m8953b(this.f8321l, this.f8326q);
            this.f8325p = 2;
        }
        return this.f8321l;
    }

    /* renamed from: i */
    public final void mo24641i(StringBuilder sb, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) next.getValue()).mo24628V(), next);
        }
        sb.append('{');
        int J = SafeParcelReader.m10946J(parcel);
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            Map.Entry entry = (Map.Entry) sparseArray.get(SafeParcelReader.m10969u(B));
            if (entry != null) {
                if (z) {
                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry.getValue();
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append("\":");
                if (field.mo24634c0()) {
                    int i = field.f8312n;
                    switch (i) {
                        case 0:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, Integer.valueOf(SafeParcelReader.m10940D(parcel, B))));
                            break;
                        case 1:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, SafeParcelReader.m10951c(parcel, B)));
                            break;
                        case 2:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, Long.valueOf(SafeParcelReader.m10941E(parcel, B))));
                            break;
                        case 3:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, Float.valueOf(SafeParcelReader.m10974z(parcel, B))));
                            break;
                        case 4:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, Double.valueOf(SafeParcelReader.m10972x(parcel, B))));
                            break;
                        case 5:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, SafeParcelReader.m10949a(parcel, B)));
                            break;
                        case 6:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, Boolean.valueOf(SafeParcelReader.m10970v(parcel, B))));
                            break;
                        case 7:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, SafeParcelReader.m10963o(parcel, B)));
                            break;
                        case 8:
                        case 9:
                            m11008k(sb, field, FastJsonResponse.m10983f(field, SafeParcelReader.m10955g(parcel, B)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m10954f(parcel, B);
                            HashMap hashMap = new HashMap();
                            for (String str : f.keySet()) {
                                String string = f.getString(str);
                                C3495o.m8908j(string);
                                hashMap.put(str, string);
                            }
                            m11008k(sb, field, FastJsonResponse.m10983f(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            StringBuilder sb2 = new StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new IllegalArgumentException(sb2.toString());
                    }
                } else if (field.f8313o) {
                    sb.append("[");
                    switch (field.f8312n) {
                        case 0:
                            C3551b.m9049f(sb, SafeParcelReader.m10958j(parcel, B));
                            break;
                        case 1:
                            C3551b.m9051h(sb, SafeParcelReader.m10952d(parcel, B));
                            break;
                        case 2:
                            C3551b.m9050g(sb, SafeParcelReader.m10959k(parcel, B));
                            break;
                        case 3:
                            C3551b.m9048e(sb, SafeParcelReader.m10957i(parcel, B));
                            break;
                        case 4:
                            C3551b.m9047d(sb, SafeParcelReader.m10956h(parcel, B));
                            break;
                        case 5:
                            C3551b.m9051h(sb, SafeParcelReader.m10950b(parcel, B));
                            break;
                        case 6:
                            C3551b.m9052i(sb, SafeParcelReader.m10953e(parcel, B));
                            break;
                        case 7:
                            C3551b.m9053j(sb, SafeParcelReader.m10964p(parcel, B));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] m = SafeParcelReader.m10961m(parcel, B);
                            int length = m.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                                }
                                m[i2].setDataPosition(0);
                                mo24641i(sb, field.mo24632a0(), m[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f8312n) {
                        case 0:
                            sb.append(SafeParcelReader.m10940D(parcel, B));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m10951c(parcel, B));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m10941E(parcel, B));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m10974z(parcel, B));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m10972x(parcel, B));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m10949a(parcel, B));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m10970v(parcel, B));
                            break;
                        case 7:
                            String o = SafeParcelReader.m10963o(parcel, B);
                            sb.append("\"");
                            sb.append(C3560k.m9078a(o));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m10955g(parcel, B);
                            sb.append("\"");
                            sb.append(C3552c.m9056c(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m10955g(parcel, B);
                            sb.append("\"");
                            sb.append(C3552c.m9057d(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m10954f(parcel, B);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str2 : keySet) {
                                if (!z2) {
                                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                                }
                                sb.append("\"");
                                sb.append(str2);
                                sb.append("\":\"");
                                sb.append(C3560k.m9078a(f2.getString(str2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel l = SafeParcelReader.m10960l(parcel, B);
                            l.setDataPosition(0);
                            mo24641i(sb, field.mo24632a0(), l);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == J) {
            sb.append('}');
            return;
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Overread allowed size end=");
        sb3.append(J);
        throw new SafeParcelReader.ParseException(sb3.toString(), parcel);
    }

    @NonNull
    public final String toString() {
        C3495o.m8909k(this.f8323n, "Cannot convert to JSON on client side.");
        Parcel h = mo24640h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zan zan = this.f8323n;
        String str = this.f8324o;
        C3495o.m8908j(str);
        Map<String, FastJsonResponse.Field<?, ?>> Q = zan.mo24646Q(str);
        C3495o.m8908j(Q);
        mo24641i(sb, Q, h);
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zan zan;
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8320e);
        C3514a.m8967p(parcel, 2, mo24640h(), false);
        int i2 = this.f8322m;
        if (i2 != 0) {
            zan = i2 != 1 ? this.f8323n : this.f8323n;
        } else {
            zan = null;
        }
        C3514a.m8968q(parcel, 3, zan, i, false);
        C3514a.m8953b(parcel, a);
    }
}
