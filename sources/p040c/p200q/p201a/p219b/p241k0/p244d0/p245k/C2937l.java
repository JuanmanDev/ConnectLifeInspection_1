package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import java.util.Locale;

/* renamed from: c.q.a.b.k0.d0.k.l */
/* compiled from: UrlTemplate */
public final class C2937l {

    /* renamed from: a */
    public final String[] f4836a;

    /* renamed from: b */
    public final int[] f4837b;

    /* renamed from: c */
    public final String[] f4838c;

    /* renamed from: d */
    public final int f4839d;

    public C2937l(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f4836a = strArr;
        this.f4837b = iArr;
        this.f4838c = strArr2;
        this.f4839d = i;
    }

    /* renamed from: b */
    public static C2937l m6615b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new C2937l(strArr, iArr, strArr2, m6616c(str, strArr, iArr, strArr2));
    }

    /* renamed from: c */
    public static int m6616c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c == 2) {
                        iArr[i2] = 4;
                    } else {
                        throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String mo19303a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f4839d;
            if (i2 < i3) {
                sb.append(this.f4836a[i2]);
                int[] iArr = this.f4837b;
                if (iArr[i2] == 1) {
                    sb.append(str);
                } else if (iArr[i2] == 2) {
                    sb.append(String.format(Locale.US, this.f4838c[i2], new Object[]{Long.valueOf(j)}));
                } else if (iArr[i2] == 3) {
                    sb.append(String.format(Locale.US, this.f4838c[i2], new Object[]{Integer.valueOf(i)}));
                } else if (iArr[i2] == 4) {
                    sb.append(String.format(Locale.US, this.f4838c[i2], new Object[]{Long.valueOf(j2)}));
                }
                i2++;
            } else {
                sb.append(this.f4836a[i3]);
                return sb.toString();
            }
        }
    }
}
