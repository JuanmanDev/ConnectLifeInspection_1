package p040c.p200q.p201a.p264c.p276d.p289n;

import androidx.annotation.NonNull;
import androidx.test.internal.runner.RunnerArgs;
import java.lang.reflect.Array;
import java.util.Arrays;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;

/* renamed from: c.q.a.c.d.n.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3551b {
    @NonNull
    /* renamed from: a */
    public static <T> T[] m9044a(@NonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            int length3 = tArr2.length;
            System.arraycopy(tArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static boolean m9045b(@NonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T> boolean m9046c(@NonNull T[] tArr, @NonNull T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!C3487m.m8886a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m9047d(@NonNull StringBuilder sb, @NonNull double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    /* renamed from: e */
    public static void m9048e(@NonNull StringBuilder sb, @NonNull float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    /* renamed from: f */
    public static void m9049f(@NonNull StringBuilder sb, @NonNull int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    /* renamed from: g */
    public static void m9050g(@NonNull StringBuilder sb, @NonNull long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    /* renamed from: h */
    public static <T> void m9051h(@NonNull StringBuilder sb, @NonNull T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(tArr[i]);
        }
    }

    /* renamed from: i */
    public static void m9052i(@NonNull StringBuilder sb, @NonNull boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    /* renamed from: j */
    public static void m9053j(@NonNull StringBuilder sb, @NonNull String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(RunnerArgs.CLASS_SEPARATOR);
            }
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
        }
    }
}
