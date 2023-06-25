package p040c.p200q.p201a.p264c.p276d.p281j.p282u;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* renamed from: c.q.a.c.d.j.u.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3514a {
    /* renamed from: A */
    public static void m8951A(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m8952a(@NonNull Parcel parcel) {
        return m8975x(parcel, 20293);
    }

    /* renamed from: b */
    public static void m8953b(@NonNull Parcel parcel, int i) {
        m8976y(parcel, i);
    }

    /* renamed from: c */
    public static void m8954c(@NonNull Parcel parcel, int i, boolean z) {
        m8977z(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m8955d(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z) {
        if (bool != null) {
            m8977z(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m8956e(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int x = m8975x(parcel, i);
            parcel.writeBundle(bundle);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m8957f(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int x = m8975x(parcel, i);
            parcel.writeByteArray(bArr);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m8958g(@NonNull Parcel parcel, int i, double d) {
        m8977z(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m8959h(@NonNull Parcel parcel, int i, @NonNull Double d, boolean z) {
        if (d != null) {
            m8977z(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m8960i(@NonNull Parcel parcel, int i, float f) {
        m8977z(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: j */
    public static void m8961j(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z) {
        if (f != null) {
            m8977z(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m8962k(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int x = m8975x(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m8963l(@NonNull Parcel parcel, int i, int i2) {
        m8977z(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: m */
    public static void m8964m(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int x = m8975x(parcel, i);
            parcel.writeIntArray(iArr);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m8965n(@NonNull Parcel parcel, int i, long j) {
        m8977z(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: o */
    public static void m8966o(@NonNull Parcel parcel, int i, @NonNull Long l, boolean z) {
        if (l != null) {
            m8977z(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m8967p(@NonNull Parcel parcel, int i, @NonNull Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int x = m8975x(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m8968q(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int x = m8975x(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m8969r(@NonNull Parcel parcel, int i, short s) {
        m8977z(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: s */
    public static void m8970s(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str != null) {
            int x = m8975x(parcel, i);
            parcel.writeString(str);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static void m8971t(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int x = m8975x(parcel, i);
            parcel.writeStringArray(strArr);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m8972u(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z) {
        if (list != null) {
            int x = m8975x(parcel, i);
            parcel.writeStringList(list);
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static <T extends Parcelable> void m8973v(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int x = m8975x(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m8951A(parcel, t, i2);
                }
            }
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static <T extends Parcelable> void m8974w(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list != null) {
            int x = m8975x(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m8951A(parcel, parcelable, 0);
                }
            }
            m8976y(parcel, x);
        } else if (z) {
            m8977z(parcel, i, 0);
        }
    }

    /* renamed from: x */
    public static int m8975x(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: y */
    public static void m8976y(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: z */
    public static void m8977z(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
