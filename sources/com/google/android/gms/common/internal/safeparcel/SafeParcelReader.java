package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @NonNull
    /* renamed from: A */
    public static Float m10937A(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        if (H == 0) {
            return null;
        }
        m10947K(parcel, i, H, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: B */
    public static int m10938B(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    /* renamed from: C */
    public static IBinder m10939C(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + H);
        return readStrongBinder;
    }

    /* renamed from: D */
    public static int m10940D(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: E */
    public static long m10941E(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 8);
        return parcel.readLong();
    }

    @NonNull
    /* renamed from: F */
    public static Long m10942F(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        if (H == 0) {
            return null;
        }
        m10947K(parcel, i, H, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: G */
    public static short m10943G(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: H */
    public static int m10944H(@NonNull Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: I */
    public static void m10945I(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m10944H(parcel, i));
    }

    /* renamed from: J */
    public static int m10946J(@NonNull Parcel parcel) {
        int B = m10938B(parcel);
        int H = m10944H(parcel, B);
        int dataPosition = parcel.dataPosition();
        if (m10969u(B) == 20293) {
            int i = H + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(B))), parcel);
    }

    /* renamed from: K */
    public static void m10947K(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: L */
    public static void m10948L(Parcel parcel, int i, int i2) {
        int H = m10944H(parcel, i);
        if (H != i2) {
            String hexString = Integer.toHexString(H);
            throw new ParseException("Expected size " + i2 + " got " + H + " (0x" + hexString + ")", parcel);
        }
    }

    @NonNull
    /* renamed from: a */
    public static BigDecimal m10949a(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + H);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @NonNull
    /* renamed from: b */
    public static BigDecimal[] m10950b(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigDecimalArr;
    }

    @NonNull
    /* renamed from: c */
    public static BigInteger m10951c(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return new BigInteger(createByteArray);
    }

    @NonNull
    /* renamed from: d */
    public static BigInteger[] m10952d(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + H);
        return bigIntegerArr;
    }

    @NonNull
    /* renamed from: e */
    public static boolean[] m10953e(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + H);
        return createBooleanArray;
    }

    @NonNull
    /* renamed from: f */
    public static Bundle m10954f(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + H);
        return readBundle;
    }

    @NonNull
    /* renamed from: g */
    public static byte[] m10955g(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + H);
        return createByteArray;
    }

    @NonNull
    /* renamed from: h */
    public static double[] m10956h(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + H);
        return createDoubleArray;
    }

    @NonNull
    /* renamed from: i */
    public static float[] m10957i(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + H);
        return createFloatArray;
    }

    @NonNull
    /* renamed from: j */
    public static int[] m10958j(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + H);
        return createIntArray;
    }

    @NonNull
    /* renamed from: k */
    public static long[] m10959k(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + H);
        return createLongArray;
    }

    @NonNull
    /* renamed from: l */
    public static Parcel m10960l(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, H);
        parcel.setDataPosition(dataPosition + H);
        return obtain;
    }

    @NonNull
    /* renamed from: m */
    public static Parcel[] m10961m(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + H);
        return parcelArr;
    }

    @NonNull
    /* renamed from: n */
    public static <T extends Parcelable> T m10962n(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + H);
        return t;
    }

    @NonNull
    /* renamed from: o */
    public static String m10963o(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + H);
        return readString;
    }

    @NonNull
    /* renamed from: p */
    public static String[] m10964p(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + H);
        return createStringArray;
    }

    @NonNull
    /* renamed from: q */
    public static ArrayList<String> m10965q(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + H);
        return createStringArrayList;
    }

    @NonNull
    /* renamed from: r */
    public static <T> T[] m10966r(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArray;
    }

    @NonNull
    /* renamed from: s */
    public static <T> ArrayList<T> m10967s(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int H = m10944H(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (H == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + H);
        return createTypedArrayList;
    }

    /* renamed from: t */
    public static void m10968t(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: u */
    public static int m10969u(int i) {
        return (char) i;
    }

    /* renamed from: v */
    public static boolean m10970v(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    /* renamed from: w */
    public static Boolean m10971w(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        if (H == 0) {
            return null;
        }
        m10947K(parcel, i, H, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: x */
    public static double m10972x(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    /* renamed from: y */
    public static Double m10973y(@NonNull Parcel parcel, int i) {
        int H = m10944H(parcel, i);
        if (H == 0) {
            return null;
        }
        m10947K(parcel, i, H, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: z */
    public static float m10974z(@NonNull Parcel parcel, int i) {
        m10948L(parcel, i, 4);
        return parcel.readFloat();
    }
}
