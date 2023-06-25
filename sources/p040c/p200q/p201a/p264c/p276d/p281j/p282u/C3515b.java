package p040c.p200q.p201a.p264c.p276d.p281j.p282u;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p289n.C3552c;

/* renamed from: c.q.a.c.d.j.u.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3515b {
    @NonNull
    /* renamed from: a */
    public static <T extends SafeParcelable> T m8978a(@NonNull byte[] bArr, @NonNull Parcelable.Creator<T> creator) {
        C3495o.m8908j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    @NonNull
    /* renamed from: b */
    public static <T extends SafeParcelable> T m8979b(@NonNull String str, @NonNull Parcelable.Creator<T> creator) {
        return m8978a(C3552c.m9054a(str), creator);
    }

    @NonNull
    /* renamed from: c */
    public static <T extends SafeParcelable> byte[] m8980c(@NonNull T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: d */
    public static <T extends SafeParcelable> void m8981d(@NonNull T t, @NonNull Intent intent, @NonNull String str) {
        intent.putExtra(str, m8980c(t));
    }

    @NonNull
    /* renamed from: e */
    public static <T extends SafeParcelable> String m8982e(@NonNull T t) {
        return C3552c.m9057d(m8980c(t));
    }
}
