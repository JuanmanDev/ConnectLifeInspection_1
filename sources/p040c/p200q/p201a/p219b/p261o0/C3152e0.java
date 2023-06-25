package p040c.p200q.p201a.p219b.p261o0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.android.exoplayer2.ParserException;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p260n0.C3122h;

/* renamed from: c.q.a.b.o0.e0 */
/* compiled from: Util */
public final class C3152e0 {

    /* renamed from: a */
    public static final int f5819a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    public static final String f5820b = Build.DEVICE;

    /* renamed from: c */
    public static final String f5821c = Build.MANUFACTURER;

    /* renamed from: d */
    public static final String f5822d = Build.MODEL;

    /* renamed from: e */
    public static final String f5823e = (f5820b + ", " + f5822d + ", " + f5821c + ", " + f5819a);

    /* renamed from: f */
    public static final byte[] f5824f = new byte[0];

    /* renamed from: g */
    public static final Pattern f5825g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    public static final Pattern f5826h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    public static final int[] f5827i = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    static {
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: A */
    public static String m7761A(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: B */
    public static String m7762B(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService(EventBusConstKt.PHONE)) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m7812m0(networkCountryIso);
            }
        }
        return m7812m0(Locale.getDefault().getCountry());
    }

    /* renamed from: C */
    public static int m7763C(int i) {
        switch (i) {
            case 0:
                return 16777216;
            case 1:
                return 3538944;
            case 2:
                return 13107200;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: D */
    public static int m7764D(String str) {
        int length = str.length();
        C3151e.m7753a(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }

    /* renamed from: E */
    public static Looper m7765E() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: F */
    public static long m7766F(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: G */
    public static int m7767G(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            default:
                return 6;
        }
    }

    /* renamed from: H */
    public static int m7768H(@Nullable Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return 0;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m7767G(activeNetworkInfo);
            }
            return i;
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: I */
    public static int m7769I(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: J */
    public static int m7770J(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != 1073741824) {
            if (i == 2) {
                return i2 * 2;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 * 4;
    }

    /* renamed from: K */
    public static long m7771K(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* renamed from: L */
    public static int m7772L(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: M */
    public static byte[] m7773M(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: N */
    public static int m7774N(String str) {
        String l0 = m7810l0(str);
        if (l0.endsWith(".mpd")) {
            return 0;
        }
        if (l0.endsWith(".m3u8")) {
            return 2;
        }
        return l0.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    /* renamed from: O */
    public static boolean m7775O(C3173t tVar, C3173t tVar2, @Nullable Inflater inflater) {
        if (tVar.mo20008a() <= 0) {
            return false;
        }
        byte[] bArr = tVar2.f5877a;
        if (bArr.length < tVar.mo20008a()) {
            bArr = new byte[(tVar.mo20008a() * 2)];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(tVar.f5877a, tVar.mo20010c(), tVar.mo20008a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(bArr, i, bArr.length - i);
                if (inflater.finished()) {
                    tVar2.mo20004J(bArr, i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == bArr.length) {
                    bArr = Arrays.copyOf(bArr, bArr.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m7776P(int i) {
        return i == Integer.MIN_VALUE || i == 1073741824;
    }

    /* renamed from: Q */
    public static boolean m7777Q(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == 1073741824 || i == 4;
    }

    /* renamed from: R */
    public static boolean m7778R(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: S */
    public static boolean m7779S(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: T */
    public static /* synthetic */ Thread m7780T(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: U */
    public static ExecutorService m7781U(String str) {
        return Executors.newSingleThreadExecutor(new C3149d(str));
    }

    @Nullable
    /* renamed from: V */
    public static String m7782V(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return m7810l0(str);
        }
    }

    /* renamed from: W */
    public static <T> T[] m7783W(T[] tArr, int i) {
        C3151e.m7753a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: X */
    public static long m7784X(String str) {
        Matcher matcher = f5825g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if (AccountManagerConstants$LOCALE.LOCALE_SEPERATOR.equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(MAPCookie.GMT));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
        }
        throw new ParserException("Invalid date/time format: " + str);
    }

    /* renamed from: Y */
    public static long m7785Y(String str) {
        Matcher matcher = f5826h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j = (long) ((parseDouble5 + d) * 1000.0d);
        return isEmpty ? -j : j;
    }

    /* renamed from: Z */
    public static boolean m7786Z(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static long m7787a(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: a0 */
    public static <T> void m7788a0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: b */
    public static boolean m7789b(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b0 */
    public static long m7790b0(long j, C3216y yVar, long j2, long j3) {
        if (C3216y.f6048c.equals(yVar)) {
            return j;
        }
        long j0 = m7806j0(j, yVar.f6050a, Long.MIN_VALUE);
        long a = m7787a(j, yVar.f6051b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = j0 <= j2 && j2 <= a;
        if (j0 > j3 || j3 > a) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : j0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7791c(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r3.length
            if (r0 >= r1) goto L_0x0014
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r6 == 0) goto L_0x0019
            int r4 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r4 = r0
        L_0x001a:
            if (r7 == 0) goto L_0x0023
            int r3 = r3.length
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x0023:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3152e0.m7791c(long[], long, boolean, boolean):int");
    }

    /* renamed from: c0 */
    public static long m7792c0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int m7793d(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3152e0.m7793d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: d0 */
    public static long[] m7794d0(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j3;
                i2++;
            }
        } else if (i >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i2 < size) {
                jArr[i2] = (long) (((double) list.get(i2).longValue()) * d);
                i2++;
            }
        } else {
            long j4 = j / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j4;
                i2++;
            }
        }
        return jArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7795e(long[] r3, long r4, boolean r6, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r3[r0]
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r6 == 0) goto L_0x001a
            int r3 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r3 = r0
        L_0x001b:
            if (r7 == 0) goto L_0x0022
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3152e0.m7795e(long[], long, boolean, boolean):int");
    }

    /* renamed from: e0 */
    public static void m7796e0(long[] jArr, long j, long j2) {
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        int i2 = 0;
        if (i >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (i >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i2 < jArr.length) {
                jArr[i2] = (long) (((double) jArr[i2]) * d);
                i2++;
            }
        } else {
            long j4 = j / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static <T> T m7797f(@Nullable T t) {
        return t;
    }

    /* renamed from: f0 */
    public static String[] m7798f0(String str, String str2) {
        return str.split(str2, -1);
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static <T> T[] m7799g(T[] tArr) {
        return tArr;
    }

    /* renamed from: g0 */
    public static String[] m7800g0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: h */
    public static int m7801h(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: h0 */
    public static String[] m7802h0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m7798f0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: i */
    public static long m7803i(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: i0 */
    public static ComponentName m7804i0(Context context, Intent intent) {
        if (f5819a >= 26) {
            return context.startForegroundService(intent);
        }
        return context.startService(intent);
    }

    /* renamed from: j */
    public static void m7805j(C3122h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j0 */
    public static long m7806j0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: k */
    public static void m7807k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: k0 */
    public static int[] m7808k0(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* renamed from: l */
    public static int m7809l(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: l0 */
    public static String m7810l0(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    /* renamed from: m */
    public static float m7811m(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: m0 */
    public static String m7812m0(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    /* renamed from: n */
    public static int m7813n(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: n0 */
    public static void m7814n0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: o */
    public static long m7815o(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: p */
    public static int m7816p(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f5827i[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: q */
    public static Handler m7817q(Handler.Callback callback) {
        return m7818r(m7765E(), callback);
    }

    /* renamed from: r */
    public static Handler m7818r(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: s */
    public static String m7819s(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: t */
    public static String m7820t(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    /* renamed from: u */
    public static String m7821u(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    /* renamed from: v */
    public static int m7822v(int i) {
        if (i != 0) {
            return (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) ? 4 : 2;
        }
        return 1;
    }

    /* renamed from: w */
    public static int m7823w(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f5819a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: x */
    public static int m7824x(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                return i != 8 ? 1 : 3;
            }
        }
        return i2;
    }

    /* renamed from: y */
    public static byte[] m7825y(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    @Nullable
    /* renamed from: z */
    public static String m7826z(String str, int i) {
        String[] h0 = m7802h0(str);
        if (h0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : h0) {
            if (i == C3166p.m7897i(str2)) {
                if (sb.length() > 0) {
                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
