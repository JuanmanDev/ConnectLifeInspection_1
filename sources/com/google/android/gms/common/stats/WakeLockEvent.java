package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.test.internal.runner.RunnerArgs;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p288m.C3549b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C3549b();

    /* renamed from: e */
    public final int f8336e;

    /* renamed from: l */
    public final long f8337l;

    /* renamed from: m */
    public int f8338m;

    /* renamed from: n */
    public final String f8339n;

    /* renamed from: o */
    public final String f8340o;

    /* renamed from: p */
    public final String f8341p;

    /* renamed from: q */
    public final int f8342q;

    /* renamed from: r */
    public final List f8343r;

    /* renamed from: s */
    public final String f8344s;

    /* renamed from: t */
    public final long f8345t;

    /* renamed from: u */
    public int f8346u;

    /* renamed from: v */
    public final String f8347v;

    /* renamed from: w */
    public final float f8348w;

    /* renamed from: x */
    public final long f8349x;

    /* renamed from: y */
    public final boolean f8350y;

    /* renamed from: z */
    public long f8351z = -1;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f8336e = i;
        this.f8337l = j;
        this.f8338m = i2;
        this.f8339n = str;
        this.f8340o = str3;
        this.f8341p = str5;
        this.f8342q = i3;
        this.f8343r = list;
        this.f8344s = str2;
        this.f8345t = j2;
        this.f8346u = i4;
        this.f8347v = str4;
        this.f8348w = f;
        this.f8349x = j3;
        this.f8350y = z;
    }

    /* renamed from: P */
    public final int mo24650P() {
        return this.f8338m;
    }

    /* renamed from: Q */
    public final long mo24651Q() {
        return this.f8351z;
    }

    /* renamed from: R */
    public final long mo24652R() {
        return this.f8337l;
    }

    @NonNull
    /* renamed from: S */
    public final String mo24653S() {
        String str;
        List list = this.f8343r;
        String str2 = this.f8339n;
        int i = this.f8342q;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(RunnerArgs.CLASS_SEPARATOR, list);
        }
        int i2 = this.f8346u;
        String str4 = this.f8340o;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f8347v;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f8348w;
        String str6 = this.f8341p;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f8350y;
        return "\t" + str2 + "\t" + i + "\t" + str + "\t" + i2 + "\t" + str4 + "\t" + str5 + "\t" + f + "\t" + str3 + "\t" + z;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8336e);
        C3514a.m8965n(parcel, 2, this.f8337l);
        C3514a.m8970s(parcel, 4, this.f8339n, false);
        C3514a.m8963l(parcel, 5, this.f8342q);
        C3514a.m8972u(parcel, 6, this.f8343r, false);
        C3514a.m8965n(parcel, 8, this.f8345t);
        C3514a.m8970s(parcel, 10, this.f8340o, false);
        C3514a.m8963l(parcel, 11, this.f8338m);
        C3514a.m8970s(parcel, 12, this.f8344s, false);
        C3514a.m8970s(parcel, 13, this.f8347v, false);
        C3514a.m8963l(parcel, 14, this.f8346u);
        C3514a.m8960i(parcel, 15, this.f8348w);
        C3514a.m8965n(parcel, 16, this.f8349x);
        C3514a.m8970s(parcel, 17, this.f8341p, false);
        C3514a.m8954c(parcel, 18, this.f8350y);
        C3514a.m8953b(parcel, a);
    }
}
