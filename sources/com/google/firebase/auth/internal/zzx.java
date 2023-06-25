package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.C6361d;
import p040c.p200q.p363c.p367l.C6368g;
import p040c.p200q.p363c.p367l.p368h.C6375d;
import p040c.p200q.p363c.p367l.p368h.C6386i0;
import p040c.p200q.p363c.p367l.p368h.C6390m;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new C6386i0();

    /* renamed from: e */
    public zzzy f15411e;

    /* renamed from: l */
    public zzt f15412l;

    /* renamed from: m */
    public final String f15413m;

    /* renamed from: n */
    public String f15414n;

    /* renamed from: o */
    public List f15415o;

    /* renamed from: p */
    public List f15416p;

    /* renamed from: q */
    public String f15417q;

    /* renamed from: r */
    public Boolean f15418r;

    /* renamed from: s */
    public zzz f15419s;

    /* renamed from: t */
    public boolean f15420t;

    /* renamed from: u */
    public zze f15421u;

    /* renamed from: v */
    public zzbb f15422v;

    public zzx(C6331h hVar, List list) {
        C3495o.m8908j(hVar);
        this.f15413m = hVar.mo30405n();
        this.f15414n = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f15417q = "2";
        mo37357V(list);
    }

    /* renamed from: P */
    public final /* synthetic */ C6361d mo37351P() {
        return new C6375d(this);
    }

    @NonNull
    /* renamed from: Q */
    public final List<? extends C6368g> mo37352Q() {
        return this.f15415o;
    }

    @Nullable
    /* renamed from: R */
    public final String mo37353R() {
        Map map;
        zzzy zzzy = this.f15411e;
        if (zzzy == null || zzzy.mo33499S() == null || (map = (Map) C6390m.m17917a(zzzy.mo33499S()).mo30450a().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @NonNull
    /* renamed from: S */
    public final String mo37354S() {
        return this.f15412l.mo37400P();
    }

    /* renamed from: T */
    public final boolean mo37355T() {
        Boolean bool = this.f15418r;
        if (bool == null || bool.booleanValue()) {
            zzzy zzzy = this.f15411e;
            String b = zzzy != null ? C6390m.m17917a(zzzy.mo33499S()).mo30451b() : "";
            boolean z = false;
            if (this.f15415o.size() <= 1 && (b == null || !b.equals("custom"))) {
                z = true;
            }
            this.f15418r = Boolean.valueOf(z);
        }
        return this.f15418r.booleanValue();
    }

    /* renamed from: U */
    public final /* bridge */ /* synthetic */ FirebaseUser mo37356U() {
        mo37408g0();
        return this;
    }

    @NonNull
    /* renamed from: V */
    public final synchronized FirebaseUser mo37357V(List list) {
        C3495o.m8908j(list);
        this.f15415o = new ArrayList(list.size());
        this.f15416p = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C6368g gVar = (C6368g) list.get(i);
            if (gVar.mo30456y().equals("firebase")) {
                this.f15412l = (zzt) gVar;
            } else {
                this.f15416p.add(gVar.mo30456y());
            }
            this.f15415o.add((zzt) gVar);
        }
        if (this.f15412l == null) {
            this.f15412l = (zzt) this.f15415o.get(0);
        }
        return this;
    }

    @NonNull
    /* renamed from: W */
    public final zzzy mo37358W() {
        return this.f15411e;
    }

    @NonNull
    /* renamed from: X */
    public final String mo37359X() {
        return this.f15411e.mo33499S();
    }

    @NonNull
    /* renamed from: Y */
    public final String mo37360Y() {
        return this.f15411e.mo33502V();
    }

    @Nullable
    /* renamed from: Z */
    public final List mo37361Z() {
        return this.f15416p;
    }

    /* renamed from: a0 */
    public final void mo37362a0(zzzy zzzy) {
        C3495o.m8908j(zzzy);
        this.f15411e = zzzy;
    }

    /* renamed from: b0 */
    public final void mo37363b0(List list) {
        Parcelable.Creator<zzbb> creator = zzbb.CREATOR;
        zzbb zzbb = null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbb = new zzbb(arrayList);
        }
        this.f15422v = zzbb;
    }

    /* renamed from: c0 */
    public final FirebaseUserMetadata mo37404c0() {
        return this.f15419s;
    }

    @NonNull
    /* renamed from: d0 */
    public final C6331h mo37405d0() {
        return C6331h.m17786m(this.f15413m);
    }

    @Nullable
    /* renamed from: e0 */
    public final zze mo37406e0() {
        return this.f15421u;
    }

    /* renamed from: f0 */
    public final zzx mo37407f0(String str) {
        this.f15417q = str;
        return this;
    }

    /* renamed from: g0 */
    public final zzx mo37408g0() {
        this.f15418r = Boolean.FALSE;
        return this;
    }

    @Nullable
    /* renamed from: h0 */
    public final List mo37409h0() {
        zzbb zzbb = this.f15422v;
        if (zzbb != null) {
            return zzbb.mo37394P();
        }
        return new ArrayList();
    }

    /* renamed from: i0 */
    public final List mo37410i0() {
        return this.f15415o;
    }

    /* renamed from: j0 */
    public final void mo37411j0(@Nullable zze zze) {
        this.f15421u = zze;
    }

    /* renamed from: k0 */
    public final void mo37412k0(boolean z) {
        this.f15420t = z;
    }

    /* renamed from: l0 */
    public final void mo37413l0(zzz zzz) {
        this.f15419s = zzz;
    }

    /* renamed from: m0 */
    public final boolean mo37414m0() {
        return this.f15420t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f15411e, i, false);
        C3514a.m8968q(parcel, 2, this.f15412l, i, false);
        C3514a.m8970s(parcel, 3, this.f15413m, false);
        C3514a.m8970s(parcel, 4, this.f15414n, false);
        C3514a.m8974w(parcel, 5, this.f15415o, false);
        C3514a.m8972u(parcel, 6, this.f15416p, false);
        C3514a.m8970s(parcel, 7, this.f15417q, false);
        C3514a.m8955d(parcel, 8, Boolean.valueOf(mo37355T()), false);
        C3514a.m8968q(parcel, 9, this.f15419s, i, false);
        C3514a.m8954c(parcel, 10, this.f15420t);
        C3514a.m8968q(parcel, 11, this.f15421u, i, false);
        C3514a.m8968q(parcel, 12, this.f15422v, i, false);
        C3514a.m8953b(parcel, a);
    }

    @NonNull
    /* renamed from: y */
    public final String mo30456y() {
        return this.f15412l.mo30456y();
    }

    public zzx(zzzy zzzy, zzt zzt, String str, String str2, List list, List list2, String str3, Boolean bool, zzz zzz, boolean z, zze zze, zzbb zzbb) {
        this.f15411e = zzzy;
        this.f15412l = zzt;
        this.f15413m = str;
        this.f15414n = str2;
        this.f15415o = list;
        this.f15416p = list2;
        this.f15417q = str3;
        this.f15418r = bool;
        this.f15419s = zzz;
        this.f15420t = z;
        this.f15421u = zze;
        this.f15422v = zzbb;
    }
}
