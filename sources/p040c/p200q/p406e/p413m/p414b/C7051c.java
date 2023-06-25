package p040c.p200q.p406e.p413m.p414b;

import androidx.test.internal.runner.RunnerArgs;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import kotlin.text.Typography;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p040c.p200q.p406e.p410l.C7034c;

/* renamed from: c.q.e.m.b.c */
/* compiled from: DecodedBitStreamParser */
public final class C7051c {

    /* renamed from: a */
    public static final char[] f13520a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    public static final char[] f13521b;

    /* renamed from: c */
    public static final char[] f13522c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    public static final char[] f13523d;

    /* renamed from: e */
    public static final char[] f13524e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: c.q.e.m.b.c$a */
    /* compiled from: DecodedBitStreamParser */
    public static /* synthetic */ class C7052a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13525a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.q.e.m.b.c$b[] r0 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13525a = r0
                c.q.e.m.b.c$b r1 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13525a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.q.e.m.b.c$b r1 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13525a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.q.e.m.b.c$b r1 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13525a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.q.e.m.b.c$b r1 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13525a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.q.e.m.b.c$b r1 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p413m.p414b.C7051c.C7052a.<clinit>():void");
        }
    }

    /* renamed from: c.q.e.m.b.c$b */
    /* compiled from: DecodedBitStreamParser */
    public enum C7053b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {PublicSuffixDatabase.EXCEPTION_MARKER, Typography.quote, RunnerArgs.METHOD_SEPARATOR, Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', '[', '\\', ']', '^', '_'};
        f13521b = cArr;
        f13523d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p406e.p410l.C7035d m20930a(byte[] r7) {
        /*
            c.q.e.l.c r0 = new c.q.e.l.c
            r0.<init>(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            c.q.e.m.b.c$b r5 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.ASCII_ENCODE
        L_0x001a:
            c.q.e.m.b.c$b r6 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            c.q.e.m.b.c$b r5 = m20932c(r0, r1, r2)
            goto L_0x0053
        L_0x0023:
            int[] r6 = p040c.p200q.p406e.p413m.p414b.C7051c.C7052a.f13525a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r4) goto L_0x004e
            r6 = 2
            if (r5 == r6) goto L_0x004a
            r6 = 3
            if (r5 == r6) goto L_0x0046
            r6 = 4
            if (r5 == r6) goto L_0x0042
            r6 = 5
            if (r5 != r6) goto L_0x003d
            m20933d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            com.google.zxing.FormatException r7 = com.google.zxing.FormatException.getFormatInstance()
            throw r7
        L_0x0042:
            m20935f(r0, r1)
            goto L_0x0051
        L_0x0046:
            m20931b(r0, r1)
            goto L_0x0051
        L_0x004a:
            m20936g(r0, r1)
            goto L_0x0051
        L_0x004e:
            m20934e(r0, r1)
        L_0x0051:
            c.q.e.m.b.c$b r5 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.ASCII_ENCODE
        L_0x0053:
            c.q.e.m.b.c$b r6 = p040c.p200q.p406e.p413m.p414b.C7051c.C7053b.PAD_ENCODE
            if (r5 == r6) goto L_0x005d
            int r6 = r0.mo32549a()
            if (r6 > 0) goto L_0x001a
        L_0x005d:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0066
            r1.append(r2)
        L_0x0066:
            c.q.e.l.d r0 = new c.q.e.l.d
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0074
            r3 = r4
        L_0x0074:
            r0.<init>(r7, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p406e.p413m.p414b.C7051c.m20930a(byte[]):c.q.e.l.d");
    }

    /* renamed from: b */
    public static void m20931b(C7034c cVar, StringBuilder sb) {
        int d;
        int[] iArr = new int[3];
        while (cVar.mo32549a() != 8 && (d = cVar.mo32552d(8)) != 254) {
            m20937h(d, cVar.mo32552d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(13);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append(Typography.greater);
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            if (cVar.mo32549a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    public static C7053b m20932c(C7034c cVar, StringBuilder sb, StringBuilder sb2) {
        boolean z = false;
        do {
            int d = cVar.mo32552d(8);
            if (d == 0) {
                throw FormatException.getFormatInstance();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return C7053b.ASCII_ENCODE;
            } else if (d == 129) {
                return C7053b.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (d == 230) {
                    return C7053b.C40_ENCODE;
                } else {
                    if (d == 231) {
                        return C7053b.BASE256_ENCODE;
                    }
                    if (d == 232) {
                        sb.append(29);
                    } else if (!(d == 233 || d == 234)) {
                        if (d == 235) {
                            z = true;
                        } else if (d == 236) {
                            sb.append("[)>\u001e05\u001d");
                            sb2.insert(0, "\u001e\u0004");
                        } else if (d == 237) {
                            sb.append("[)>\u001e06\u001d");
                            sb2.insert(0, "\u001e\u0004");
                        } else if (d == 238) {
                            return C7053b.ANSIX12_ENCODE;
                        } else {
                            if (d == 239) {
                                return C7053b.TEXT_ENCODE;
                            }
                            if (d == 240) {
                                return C7053b.EDIFACT_ENCODE;
                            }
                            if (!(d == 241 || d < 242 || (d == 254 && cVar.mo32549a() == 0))) {
                                throw FormatException.getFormatInstance();
                            }
                        }
                    }
                }
            }
        } while (cVar.mo32549a() > 0);
        return C7053b.ASCII_ENCODE;
    }

    /* renamed from: d */
    public static void m20933d(C7034c cVar, StringBuilder sb, Collection<byte[]> collection) {
        int c = cVar.mo32551c() + 1;
        int i = c + 1;
        int i2 = m20938i(cVar.mo32552d(8), c);
        if (i2 == 0) {
            i2 = cVar.mo32549a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + m20938i(cVar.mo32552d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.mo32549a() >= 8) {
                    bArr[i3] = (byte) m20938i(cVar.mo32552d(8), i);
                    i3++;
                    i++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw FormatException.getFormatInstance();
        }
    }

    /* renamed from: e */
    public static void m20934e(C7034c cVar, StringBuilder sb) {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo32549a() != 8 && (d = cVar.mo32552d(8)) != 254) {
            m20937h(d, cVar.mo32552d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f13521b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw FormatException.getFormatInstance();
                        } else if (z) {
                            sb.append((char) (i3 + 224));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f13520a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (cVar.mo32549a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    public static void m20935f(C7034c cVar, StringBuilder sb) {
        while (cVar.mo32549a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.mo32552d(6);
                if (d == 31) {
                    int b = 8 - cVar.mo32550b();
                    if (b != 8) {
                        cVar.mo32552d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (cVar.mo32549a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    public static void m20936g(C7034c cVar, StringBuilder sb) {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo32549a() != 8 && (d = cVar.mo32552d(8)) != 254) {
            m20937h(d, cVar.mo32552d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f13523d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f13524e;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f13522c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
            }
            if (cVar.mo32549a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m20937h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    public static int m20938i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
