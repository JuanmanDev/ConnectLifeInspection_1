package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p363c.p367l.C6404i;
import p040c.p200q.p363c.p367l.C6416u;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class ActionCodeSettings extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new C6416u();

    /* renamed from: e */
    public final String f15314e;

    /* renamed from: l */
    public final String f15315l;

    /* renamed from: m */
    public final String f15316m;

    /* renamed from: n */
    public final String f15317n;

    /* renamed from: o */
    public final boolean f15318o;
    @Nullable

    /* renamed from: p */
    public final String f15319p;

    /* renamed from: q */
    public final boolean f15320q;

    /* renamed from: r */
    public String f15321r;

    /* renamed from: s */
    public int f15322s;

    /* renamed from: t */
    public String f15323t;

    /* renamed from: com.google.firebase.auth.ActionCodeSettings$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public static class C8247a {

        /* renamed from: a */
        public String f15324a;

        /* renamed from: b */
        public String f15325b;

        /* renamed from: c */
        public String f15326c;

        /* renamed from: d */
        public boolean f15327d;
        @Nullable

        /* renamed from: e */
        public String f15328e;

        /* renamed from: f */
        public boolean f15329f = false;

        /* renamed from: g */
        public String f15330g;

        public /* synthetic */ C8247a(C6404i iVar) {
        }

        @NonNull
        /* renamed from: a */
        public ActionCodeSettings mo37313a() {
            if (this.f15324a != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }
    }

    public ActionCodeSettings(C8247a aVar) {
        this.f15314e = aVar.f15324a;
        this.f15315l = aVar.f15325b;
        this.f15316m = null;
        this.f15317n = aVar.f15326c;
        this.f15318o = aVar.f15327d;
        this.f15319p = aVar.f15328e;
        this.f15320q = aVar.f15329f;
        this.f15323t = aVar.f15330g;
    }

    @NonNull
    /* renamed from: V */
    public static C8247a m22589V() {
        return new C8247a((C6404i) null);
    }

    /* renamed from: P */
    public boolean mo37306P() {
        return this.f15320q;
    }

    /* renamed from: Q */
    public boolean mo37307Q() {
        return this.f15318o;
    }

    @Nullable
    /* renamed from: R */
    public String mo37308R() {
        return this.f15319p;
    }

    @Nullable
    /* renamed from: S */
    public String mo37309S() {
        return this.f15317n;
    }

    @Nullable
    /* renamed from: T */
    public String mo37310T() {
        return this.f15315l;
    }

    @NonNull
    /* renamed from: U */
    public String mo37311U() {
        return this.f15314e;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo37311U(), false);
        C3514a.m8970s(parcel, 2, mo37310T(), false);
        C3514a.m8970s(parcel, 3, this.f15316m, false);
        C3514a.m8970s(parcel, 4, mo37309S(), false);
        C3514a.m8954c(parcel, 5, mo37307Q());
        C3514a.m8970s(parcel, 6, mo37308R(), false);
        C3514a.m8954c(parcel, 7, mo37306P());
        C3514a.m8970s(parcel, 8, this.f15321r, false);
        C3514a.m8963l(parcel, 9, this.f15322s);
        C3514a.m8970s(parcel, 10, this.f15323t, false);
        C3514a.m8953b(parcel, a);
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7) {
        this.f15314e = str;
        this.f15315l = str2;
        this.f15316m = str3;
        this.f15317n = str4;
        this.f15318o = z;
        this.f15319p = str5;
        this.f15320q = z2;
        this.f15321r = str6;
        this.f15322s = i;
        this.f15323t = str7;
    }
}
