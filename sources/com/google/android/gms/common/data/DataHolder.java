package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p040c.p200q.p201a.p264c.p276d.p279h.C3435b;
import p040c.p200q.p201a.p264c.p276d.p279h.C3436c;
import p040c.p200q.p201a.p264c.p276d.p279h.C3437d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @NonNull
    public static final Parcelable.Creator<DataHolder> CREATOR = new C3437d();

    /* renamed from: e */
    public final int f8214e;

    /* renamed from: l */
    public final String[] f8215l;

    /* renamed from: m */
    public Bundle f8216m;

    /* renamed from: n */
    public final CursorWindow[] f8217n;

    /* renamed from: o */
    public final int f8218o;
    @Nullable

    /* renamed from: p */
    public final Bundle f8219p;

    /* renamed from: q */
    public int[] f8220q;

    /* renamed from: r */
    public boolean f8221r = false;

    /* renamed from: s */
    public boolean f8222s = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4072a {
        public /* synthetic */ C4072a(String[] strArr, String str, C3436c cVar) {
            C3495o.m8908j(strArr);
            String[] strArr2 = strArr;
            new ArrayList();
            new HashMap();
        }
    }

    static {
        new C3435b(new String[0], (String) null);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, @Nullable Bundle bundle) {
        this.f8214e = i;
        this.f8215l = strArr;
        this.f8217n = cursorWindowArr;
        this.f8218o = i2;
        this.f8219p = bundle;
    }

    @Nullable
    /* renamed from: P */
    public Bundle mo24567P() {
        return this.f8219p;
    }

    /* renamed from: Q */
    public int mo24568Q() {
        return this.f8218o;
    }

    /* renamed from: R */
    public final void mo24569R() {
        this.f8216m = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f8215l;
            if (i2 >= strArr.length) {
                break;
            }
            this.f8216m.putInt(strArr[i2], i2);
            i2++;
        }
        this.f8220q = new int[this.f8217n.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f8217n;
            if (i < cursorWindowArr.length) {
                this.f8220q[i] = i3;
                i3 += this.f8217n[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                return;
            }
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.f8221r) {
                this.f8221r = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f8217n;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        try {
            if (this.f8222s && this.f8217n.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                sb.toString();
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f8221r;
        }
        return z;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8971t(parcel, 1, this.f8215l, false);
        C3514a.m8973v(parcel, 2, this.f8217n, i, false);
        C3514a.m8963l(parcel, 3, mo24568Q());
        C3514a.m8956e(parcel, 4, mo24567P(), false);
        C3514a.m8963l(parcel, 1000, this.f8214e);
        C3514a.m8953b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
