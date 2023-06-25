package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.p368h.C6379f;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new C6379f();
    @Nullable

    /* renamed from: e */
    public String f15392e;
    @Nullable

    /* renamed from: l */
    public String f15393l;
    @Nullable

    /* renamed from: m */
    public List f15394m;

    public zzag() {
    }

    /* renamed from: P */
    public static zzag m22701P(List list, String str) {
        C3495o.m8908j(list);
        C3495o.m8904f(str);
        zzag zzag = new zzag();
        zzag.f15394m = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzag.f15394m.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        zzag.f15393l = str;
        return zzag;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f15392e, false);
        C3514a.m8970s(parcel, 2, this.f15393l, false);
        C3514a.m8974w(parcel, 3, this.f15394m, false);
        C3514a.m8953b(parcel, a);
    }

    public zzag(String str, String str2, List list) {
        this.f15392e = str;
        this.f15393l = str2;
        this.f15394m = list;
    }
}
