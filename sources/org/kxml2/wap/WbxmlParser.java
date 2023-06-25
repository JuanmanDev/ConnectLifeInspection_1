package org.kxml2.wap;

import androidx.core.location.GpsStatusWrapper;
import androidx.core.p028os.EnvironmentCompat;
import androidx.test.internal.runner.RunnerArgs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.text.Typography;
import org.xmlpull.p703v1.XmlPullParser;
import org.xmlpull.p703v1.XmlPullParserException;

public class WbxmlParser implements XmlPullParser {

    /* renamed from: A */
    public int f19391A = -2;

    /* renamed from: B */
    public Vector f19392B = new Vector();

    /* renamed from: C */
    public int f19393C;

    /* renamed from: D */
    public String f19394D;

    /* renamed from: E */
    public String f19395E;

    /* renamed from: F */
    public String f19396F;

    /* renamed from: G */
    public String f19397G;

    /* renamed from: H */
    public Object f19398H;

    /* renamed from: I */
    public int f19399I;

    /* renamed from: J */
    public boolean f19400J;

    /* renamed from: K */
    public boolean f19401K;

    /* renamed from: L */
    public String f19402L;

    /* renamed from: e */
    public InputStream f19403e;

    /* renamed from: l */
    public int f19404l = 0;

    /* renamed from: m */
    public int f19405m = 1;

    /* renamed from: n */
    public int f19406n = 2;

    /* renamed from: o */
    public String[] f19407o;

    /* renamed from: p */
    public String[] f19408p;

    /* renamed from: q */
    public String[] f19409q;

    /* renamed from: r */
    public byte[] f19410r;

    /* renamed from: s */
    public Hashtable f19411s = null;

    /* renamed from: t */
    public boolean f19412t;

    /* renamed from: u */
    public int f19413u;

    /* renamed from: v */
    public String[] f19414v = new String[16];

    /* renamed from: w */
    public String[] f19415w = new String[8];

    /* renamed from: x */
    public int[] f19416x = new int[4];

    /* renamed from: y */
    public int f19417y;

    /* renamed from: z */
    public String[] f19418z = new String[16];

    /* renamed from: a */
    public final boolean mo53608a() {
        String str;
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = this.f19417y;
            if (i < (i2 << 2)) {
                String str2 = this.f19418z[i + 2];
                int indexOf = str2.indexOf(58);
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    str = str2.substring(indexOf + 1);
                    str2 = substring;
                } else if (str2.equals("xmlns")) {
                    str = null;
                } else {
                    continue;
                    i += 4;
                }
                if (!str2.equals("xmlns")) {
                    z = true;
                } else {
                    int[] iArr = this.f19416x;
                    int i3 = this.f19413u;
                    int i4 = iArr[i3];
                    iArr[i3] = i4 + 1;
                    int i5 = i4 << 1;
                    String[] b = mo53609b(this.f19415w, i5 + 2);
                    this.f19415w = b;
                    b[i5] = str;
                    String[] strArr = this.f19418z;
                    int i6 = i + 3;
                    b[i5 + 1] = strArr[i6];
                    if (str == null || !strArr[i6].equals("")) {
                        String[] strArr2 = this.f19418z;
                        int i7 = this.f19417y - 1;
                        this.f19417y = i7;
                        System.arraycopy(strArr2, i + 4, strArr2, i, (i7 << 2) - i);
                        i -= 4;
                    } else {
                        mo53610c("illegal empty namespace");
                        throw null;
                    }
                }
                i += 4;
            } else {
                if (z) {
                    int i8 = (i2 << 2) - 4;
                    while (i8 >= 0) {
                        int i9 = i8 + 2;
                        String str3 = this.f19418z[i9];
                        int indexOf2 = str3.indexOf(58);
                        if (indexOf2 != 0) {
                            if (indexOf2 != -1) {
                                String substring2 = str3.substring(0, indexOf2);
                                String substring3 = str3.substring(indexOf2 + 1);
                                String namespace = getNamespace(substring2);
                                if (namespace != null) {
                                    String[] strArr3 = this.f19418z;
                                    strArr3[i8] = namespace;
                                    strArr3[i8 + 1] = substring2;
                                    strArr3[i9] = substring3;
                                    int i10 = (this.f19417y << 2) - 4;
                                    while (i10 > i8) {
                                        if (!substring3.equals(this.f19418z[i10 + 2]) || !namespace.equals(this.f19418z[i10])) {
                                            i10 -= 4;
                                        } else {
                                            StringBuffer stringBuffer = new StringBuffer();
                                            stringBuffer.append("Duplicate Attribute: {");
                                            stringBuffer.append(namespace);
                                            stringBuffer.append("}");
                                            stringBuffer.append(substring3);
                                            mo53610c(stringBuffer.toString());
                                            throw null;
                                        }
                                    }
                                    continue;
                                } else {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("Undefined Prefix: ");
                                    stringBuffer2.append(substring2);
                                    stringBuffer2.append(" in ");
                                    stringBuffer2.append(this);
                                    throw new RuntimeException(stringBuffer2.toString());
                                }
                            }
                            i8 -= 4;
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("illegal attribute name: ");
                            stringBuffer3.append(str3);
                            stringBuffer3.append(" at ");
                            stringBuffer3.append(this);
                            throw new RuntimeException(stringBuffer3.toString());
                        }
                    }
                }
                int indexOf3 = this.f19396F.indexOf(58);
                if (indexOf3 != 0) {
                    if (indexOf3 != -1) {
                        this.f19394D = this.f19396F.substring(0, indexOf3);
                        this.f19396F = this.f19396F.substring(indexOf3 + 1);
                    }
                    String namespace2 = getNamespace(this.f19394D);
                    this.f19395E = namespace2;
                    if (namespace2 == null) {
                        if (this.f19394D == null) {
                            this.f19395E = "";
                        } else {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("undefined prefix: ");
                            stringBuffer4.append(this.f19394D);
                            mo53610c(stringBuffer4.toString());
                            throw null;
                        }
                    }
                    return z;
                }
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("illegal tag name: ");
                stringBuffer5.append(this.f19396F);
                mo53610c(stringBuffer5.toString());
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final String[] mo53609b(String[] strArr, int i) {
        if (strArr.length >= i) {
            return strArr;
        }
        String[] strArr2 = new String[(i + 16)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    /* renamed from: c */
    public final void mo53610c(String str) {
        throw new XmlPullParserException(str, this, (Throwable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        r4.f19399I = 64;
        r4.f19398H = mo53613f(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53611d() {
        /*
            r4 = this;
            int r0 = r4.f19399I
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L_0x000b
            int r0 = r4.f19413u
            int r0 = r0 - r2
            r4.f19413u = r0
        L_0x000b:
            boolean r0 = r4.f19400J
            if (r0 == 0) goto L_0x0015
            r4.f19399I = r1
            r0 = 0
            r4.f19400J = r0
            return
        L_0x0015:
            r0 = 0
            r4.f19397G = r0
            r4.f19394D = r0
            r4.f19396F = r0
        L_0x001c:
            int r0 = r4.mo53614g()
            r3 = -2
            r4.f19391A = r3
            if (r0 != 0) goto L_0x002d
            int r0 = r4.mo53616i()
            r4.mo53622o(r0, r2)
            goto L_0x001c
        L_0x002d:
            r3 = -1
            if (r0 == r3) goto L_0x00ad
            r3 = 2
            if (r0 == r2) goto L_0x0095
            if (r0 == r3) goto L_0x0068
            r2 = 4
            if (r0 == r1) goto L_0x005f
            switch(r0) {
                case 64: goto L_0x0054;
                case 65: goto L_0x0054;
                case 66: goto L_0x0054;
                case 67: goto L_0x004c;
                default: goto L_0x003b;
            }
        L_0x003b:
            switch(r0) {
                case 128: goto L_0x0054;
                case 129: goto L_0x0054;
                case 130: goto L_0x0054;
                case 131: goto L_0x0045;
                default: goto L_0x003e;
            }
        L_0x003e:
            switch(r0) {
                case 192: goto L_0x0054;
                case 193: goto L_0x0054;
                case 194: goto L_0x0054;
                case 195: goto L_0x0054;
                default: goto L_0x0041;
            }
        L_0x0041:
            r4.mo53612e(r0)
            goto L_0x00af
        L_0x0045:
            r4.f19399I = r2
            java.lang.String r0 = r4.mo53619l()
            goto L_0x0065
        L_0x004c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "PI curr. not supp."
            r0.<init>(r1)
            throw r0
        L_0x0054:
            r1 = 64
            r4.f19399I = r1
            java.lang.Object r0 = r4.mo53613f(r0)
            r4.f19398H = r0
            goto L_0x00af
        L_0x005f:
            r4.f19399I = r2
            java.lang.String r0 = r4.mo53618k()
        L_0x0065:
            r4.f19397G = r0
            goto L_0x00af
        L_0x0068:
            r0 = 6
            r4.f19399I = r0
            int r0 = r4.mo53617j()
            char r0 = (char) r0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.f19397G = r1
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "#"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00aa
        L_0x0095:
            int r0 = r4.f19413u
            int r0 = r0 - r2
            int r0 = r0 << r3
            r4.f19399I = r1
            java.lang.String[] r1 = r4.f19414v
            r2 = r1[r0]
            r4.f19395E = r2
            int r2 = r0 + 1
            r2 = r1[r2]
            r4.f19394D = r2
            int r0 = r0 + r3
            r0 = r1[r0]
        L_0x00aa:
            r4.f19396F = r0
            goto L_0x00af
        L_0x00ad:
            r4.f19399I = r2
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kxml2.wap.WbxmlParser.mo53611d():void");
    }

    public void defineEntityReplacementText(String str, String str2) {
    }

    /* renamed from: e */
    public void mo53612e(int i) {
        this.f19399I = 2;
        this.f19396F = mo53620m(this.f19409q, i & 63);
        this.f19417y = 0;
        if ((i & 128) != 0) {
            mo53615h();
        }
        this.f19400J = (i & 64) == 0;
        int i2 = this.f19413u;
        this.f19413u = i2 + 1;
        int i3 = i2 << 2;
        String[] b = mo53609b(this.f19414v, i3 + 4);
        this.f19414v = b;
        b[i3 + 3] = this.f19396F;
        int i4 = this.f19413u;
        int[] iArr = this.f19416x;
        if (i4 >= iArr.length) {
            int[] iArr2 = new int[(i4 + 4)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f19416x = iArr2;
        }
        int[] iArr3 = this.f19416x;
        int i5 = this.f19413u;
        iArr3[i5] = iArr3[i5 - 1];
        for (int i6 = this.f19417y - 1; i6 > 0; i6--) {
            int i7 = 0;
            while (i7 < i6) {
                if (!getAttributeName(i6).equals(getAttributeName(i7))) {
                    i7++;
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Duplicate Attribute: ");
                    stringBuffer.append(getAttributeName(i6));
                    mo53610c(stringBuffer.toString());
                    throw null;
                }
            }
        }
        if (this.f19412t) {
            mo53608a();
        } else {
            this.f19395E = "";
        }
        String[] strArr = this.f19414v;
        strArr[i3] = this.f19395E;
        strArr[i3 + 1] = this.f19394D;
        strArr[i3 + 2] = this.f19396F;
    }

    /* renamed from: f */
    public Object mo53613f(int i) {
        switch (i) {
            case 64:
            case 65:
            case 66:
                return mo53618k();
            default:
                switch (i) {
                    case 128:
                    case 129:
                    case 130:
                        return new Integer(mo53617j());
                    default:
                        byte[] bArr = null;
                        switch (i) {
                            case 192:
                            case GpsStatusWrapper.QZSS_SVID_MIN:
                            case 194:
                                break;
                            case 195:
                                int j = mo53617j();
                                bArr = new byte[j];
                                int i2 = j;
                                while (i2 > 0) {
                                    i2 -= this.f19403e.read(bArr, j - i2, i2);
                                }
                                break;
                            default:
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("illegal id: ");
                                stringBuffer.append(i);
                                mo53610c(stringBuffer.toString());
                                throw null;
                        }
                        return bArr;
                }
        }
    }

    /* renamed from: g */
    public final int mo53614g() {
        if (this.f19391A == -2) {
            this.f19391A = this.f19403e.read();
        }
        return this.f19391A;
    }

    public int getAttributeCount() {
        return this.f19417y;
    }

    public String getAttributeName(int i) {
        if (i < this.f19417y) {
            return this.f19418z[(i << 2) + 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeNamespace(int i) {
        if (i < this.f19417y) {
            return this.f19418z[i << 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributePrefix(int i) {
        if (i < this.f19417y) {
            return this.f19418z[(i << 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeType(int i) {
        return "CDATA";
    }

    public String getAttributeValue(int i) {
        if (i < this.f19417y) {
            return this.f19418z[(i << 2) + 3];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeValue(String str, String str2) {
        for (int i = (this.f19417y << 2) - 4; i >= 0; i -= 4) {
            if (this.f19418z[i + 2].equals(str2) && (str == null || this.f19418z[i].equals(str))) {
                return this.f19418z[i + 3];
            }
        }
        return null;
    }

    public int getColumnNumber() {
        return -1;
    }

    public int getDepth() {
        return this.f19413u;
    }

    public int getEventType() {
        return this.f19399I;
    }

    public boolean getFeature(String str) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.f19412t;
        }
        return false;
    }

    public String getInputEncoding() {
        return this.f19402L;
    }

    public int getLineNumber() {
        return -1;
    }

    public String getName() {
        return this.f19396F;
    }

    public String getNamespace() {
        return this.f19395E;
    }

    public String getNamespace(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int namespaceCount = (getNamespaceCount(this.f19413u) << 1) - 2; namespaceCount >= 0; namespaceCount -= 2) {
            String[] strArr = this.f19415w;
            if (str == null) {
                if (strArr[namespaceCount] == null) {
                    return strArr[namespaceCount + 1];
                }
            } else if (str.equals(strArr[namespaceCount])) {
                return this.f19415w[namespaceCount + 1];
            }
        }
        return null;
    }

    public int getNamespaceCount(int i) {
        if (i <= this.f19413u) {
            return this.f19416x[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getNamespacePrefix(int i) {
        return this.f19415w[i << 1];
    }

    public String getNamespaceUri(int i) {
        return this.f19415w[(i << 1) + 1];
    }

    public String getPositionDescription() {
        String text;
        int i = this.f19399I;
        String[] strArr = XmlPullParser.TYPES;
        StringBuffer stringBuffer = new StringBuffer(i < strArr.length ? strArr[i] : EnvironmentCompat.MEDIA_UNKNOWN);
        stringBuffer.append(' ');
        int i2 = this.f19399I;
        if (i2 == 2 || i2 == 3) {
            if (this.f19400J) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append(Typography.less);
            if (this.f19399I == 3) {
                stringBuffer.append('/');
            }
            if (this.f19394D != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("{");
                stringBuffer2.append(this.f19395E);
                stringBuffer2.append("}");
                stringBuffer2.append(this.f19394D);
                stringBuffer2.append(RunnerArgs.CLASSPATH_SEPARATOR);
                stringBuffer.append(stringBuffer2.toString());
            }
            stringBuffer.append(this.f19396F);
            int i3 = this.f19417y << 2;
            for (int i4 = 0; i4 < i3; i4 += 4) {
                stringBuffer.append(' ');
                int i5 = i4 + 1;
                if (this.f19418z[i5] != null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("{");
                    stringBuffer3.append(this.f19418z[i4]);
                    stringBuffer3.append("}");
                    stringBuffer3.append(this.f19418z[i5]);
                    stringBuffer3.append(RunnerArgs.CLASSPATH_SEPARATOR);
                    stringBuffer.append(stringBuffer3.toString());
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(this.f19418z[i4 + 2]);
                stringBuffer4.append("='");
                stringBuffer4.append(this.f19418z[i4 + 3]);
                stringBuffer4.append("'");
                stringBuffer.append(stringBuffer4.toString());
            }
            stringBuffer.append(Typography.greater);
        } else if (i2 != 7) {
            if (i2 != 4) {
                text = getText();
            } else if (this.f19401K) {
                text = "(whitespace)";
            } else {
                text = getText();
                if (text.length() > 16) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(text.substring(0, 16));
                    stringBuffer5.append("...");
                    text = stringBuffer5.toString();
                }
            }
            stringBuffer.append(text);
        }
        return stringBuffer.toString();
    }

    public String getPrefix() {
        return this.f19394D;
    }

    public Object getProperty(String str) {
        return null;
    }

    public String getText() {
        return this.f19397G;
    }

    public char[] getTextCharacters(int[] iArr) {
        if (this.f19399I >= 4) {
            iArr[0] = 0;
            iArr[1] = this.f19397G.length();
            char[] cArr = new char[this.f19397G.length()];
            String str = this.f19397G;
            str.getChars(0, str.length(), cArr, 0);
            return cArr;
        }
        iArr[0] = -1;
        iArr[1] = -1;
        return null;
    }

    /* renamed from: h */
    public void mo53615h() {
        StringBuffer stringBuffer;
        int i;
        String str;
        int i2 = mo53616i();
        int i3 = 0;
        while (i2 != 1) {
            while (i2 == 0) {
                mo53622o(mo53616i(), false);
                i2 = mo53616i();
            }
            String m = mo53620m(this.f19407o, i2);
            int indexOf = m.indexOf(61);
            if (indexOf == -1) {
                stringBuffer = new StringBuffer();
            } else {
                StringBuffer stringBuffer2 = new StringBuffer(m.substring(indexOf + 1));
                m = m.substring(0, indexOf);
                stringBuffer = stringBuffer2;
            }
            while (true) {
                i = mo53616i();
                if (i > 128 || i == 0 || i == 2 || i == 3 || i == 131 || ((i >= 64 && i <= 66) || (i >= 128 && i <= 130))) {
                    if (i == 0) {
                        mo53622o(mo53616i(), false);
                    } else if (i != 2) {
                        if (i != 3) {
                            switch (i) {
                                case 64:
                                case 65:
                                case 66:
                                    str = mo53621n(i, mo53613f(i));
                                    break;
                                default:
                                    switch (i) {
                                        case 128:
                                        case 129:
                                        case 130:
                                            break;
                                        case 131:
                                            str = mo53619l();
                                            break;
                                        default:
                                            switch (i) {
                                                case 192:
                                                case GpsStatusWrapper.QZSS_SVID_MIN:
                                                case 194:
                                                case 195:
                                                    break;
                                                default:
                                                    str = mo53620m(this.f19408p, i);
                                                    break;
                                            }
                                    }
                                    str = mo53621n(i, mo53613f(i));
                                    break;
                            }
                        } else {
                            str = mo53618k();
                        }
                        stringBuffer.append(str);
                    } else {
                        stringBuffer.append((char) mo53617j());
                    }
                }
            }
            String[] b = mo53609b(this.f19418z, i3 + 4);
            this.f19418z = b;
            int i4 = i3 + 1;
            b[i3] = "";
            int i5 = i4 + 1;
            b[i4] = null;
            int i6 = i5 + 1;
            b[i5] = m;
            i3 = i6 + 1;
            b[i6] = stringBuffer.toString();
            this.f19417y++;
            i2 = i;
        }
    }

    /* renamed from: i */
    public int mo53616i() {
        int read = this.f19403e.read();
        if (read != -1) {
            return read;
        }
        throw new IOException("Unexpected EOF");
    }

    public boolean isAttributeDefault(int i) {
        return false;
    }

    public boolean isEmptyElementTag() {
        if (this.f19399I == 2) {
            return this.f19400J;
        }
        mo53610c("Wrong event type");
        throw null;
    }

    public boolean isWhitespace() {
        int i = this.f19399I;
        if (i == 4 || i == 7 || i == 5) {
            return this.f19401K;
        }
        mo53610c("Wrong event type");
        throw null;
    }

    /* renamed from: j */
    public int mo53617j() {
        int i;
        int i2 = 0;
        do {
            i = mo53616i();
            i2 = (i2 << 7) | (i & 127);
        } while ((i & 128) != 0);
        return i2;
    }

    /* renamed from: k */
    public String mo53618k() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = true;
        while (true) {
            int read = this.f19403e.read();
            if (read == 0) {
                this.f19401K = z;
                String str = new String(byteArrayOutputStream.toByteArray(), this.f19402L);
                byteArrayOutputStream.close();
                return str;
            } else if (read != -1) {
                if (read > 32) {
                    z = false;
                }
                byteArrayOutputStream.write(read);
            } else {
                throw new IOException("Unexpected EOF");
            }
        }
    }

    /* renamed from: l */
    public String mo53619l() {
        int j = mo53617j();
        if (this.f19411s == null) {
            this.f19411s = new Hashtable();
        }
        String str = (String) this.f19411s.get(new Integer(j));
        if (str != null) {
            return str;
        }
        int i = j;
        while (true) {
            byte[] bArr = this.f19410r;
            if (i >= bArr.length || bArr[i] == 0) {
                String str2 = new String(this.f19410r, j, i - j, this.f19402L);
                this.f19411s.put(new Integer(j), str2);
            } else {
                i++;
            }
        }
        String str22 = new String(this.f19410r, j, i - j, this.f19402L);
        this.f19411s.put(new Integer(j), str22);
        return str22;
    }

    /* renamed from: m */
    public String mo53620m(String[] strArr, int i) {
        int i2 = (i & 127) - 5;
        if (i2 == -1) {
            return mo53619l();
        }
        if (i2 >= 0 && strArr != null && i2 < strArr.length && strArr[i2] != null) {
            return strArr[i2];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id ");
        stringBuffer.append(i);
        stringBuffer.append(" undef.");
        throw new IOException(stringBuffer.toString());
    }

    /* renamed from: n */
    public String mo53621n(int i, Object obj) {
        if (obj instanceof byte[]) {
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = (byte[]) obj;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                stringBuffer.append("0123456789abcdef".charAt((bArr[i2] >> 4) & 15));
                stringBuffer.append("0123456789abcdef".charAt(bArr[i2] & 15));
            }
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("$(");
        stringBuffer2.append(obj);
        stringBuffer2.append(")");
        return stringBuffer2.toString();
    }

    public int next() {
        this.f19401K = true;
        int i = 9999;
        while (true) {
            String str = this.f19397G;
            mo53611d();
            int i2 = this.f19399I;
            if (i2 < i) {
                i = i2;
            }
            if (i <= 5) {
                if (i >= 4) {
                    if (str != null) {
                        if (this.f19397G != null) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(str);
                            stringBuffer.append(this.f19397G);
                            str = stringBuffer.toString();
                        }
                        this.f19397G = str;
                    }
                    int g = mo53614g();
                    if (!(g == 2 || g == 3 || g == 4 || g == 68 || g == 196 || g == 131 || g == 132)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f19399I = i;
        if (i > 4) {
            this.f19399I = 4;
        }
        return this.f19399I;
    }

    public int nextTag() {
        next();
        if (this.f19399I == 4 && this.f19401K) {
            next();
        }
        int i = this.f19399I;
        if (i == 3 || i == 2) {
            return this.f19399I;
        }
        mo53610c("unexpected type");
        throw null;
    }

    public String nextText() {
        String str;
        if (this.f19399I == 2) {
            next();
            if (this.f19399I == 4) {
                str = getText();
                next();
            } else {
                str = "";
            }
            if (this.f19399I == 3) {
                return str;
            }
            mo53610c("END_TAG expected");
            throw null;
        }
        mo53610c("precondition: START_TAG");
        throw null;
    }

    public int nextToken() {
        this.f19401K = true;
        mo53611d();
        return this.f19399I;
    }

    /* renamed from: o */
    public final void mo53622o(int i, boolean z) {
        if (this.f19392B.size() != 0 || i != 0) {
            int i2 = i * 3;
            if (i2 <= this.f19392B.size()) {
                Vector vector = this.f19392B;
                if (z) {
                    this.f19409q = (String[]) vector.elementAt(i2 + this.f19404l);
                    return;
                }
                this.f19407o = (String[]) vector.elementAt(this.f19405m + i2);
                this.f19408p = (String[]) this.f19392B.elementAt(i2 + this.f19406n);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Code Page ");
            stringBuffer.append(i);
            stringBuffer.append(" undefined!");
            mo53610c(stringBuffer.toString());
            throw null;
        }
    }

    public void require(int i, String str, String str2) {
        String str3;
        if (i != this.f19399I || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: ");
            if (i == 64) {
                str3 = "WAP Ext.";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(XmlPullParser.TYPES[i]);
                stringBuffer2.append(" {");
                stringBuffer2.append(str);
                stringBuffer2.append("}");
                stringBuffer2.append(str2);
                str3 = stringBuffer2.toString();
            }
            stringBuffer.append(str3);
            mo53610c(stringBuffer.toString());
            throw null;
        }
    }

    public void setFeature(String str, boolean z) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.f19412t = z;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported feature: ");
        stringBuffer.append(str);
        mo53610c(stringBuffer.toString());
        throw null;
    }

    public void setInput(InputStream inputStream, String str) {
        this.f19403e = inputStream;
        try {
            mo53616i();
            int j = mo53617j();
            this.f19393C = j;
            if (j == 0) {
                mo53617j();
            }
            int j2 = mo53617j();
            if (str == null) {
                if (j2 == 4) {
                    str = "ISO-8859-1";
                } else if (j2 == 106) {
                    str = "UTF-8";
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("");
                    stringBuffer.append(j2);
                    throw new UnsupportedEncodingException(stringBuffer.toString());
                }
            }
            this.f19402L = str;
            int j3 = mo53617j();
            this.f19410r = new byte[j3];
            int i = 0;
            while (true) {
                if (i >= j3) {
                    break;
                }
                int read = inputStream.read(this.f19410r, i, j3 - i);
                if (read <= 0) {
                    break;
                }
                i += read;
            }
            mo53622o(0, true);
            mo53622o(0, false);
        } catch (IOException unused) {
            mo53610c("Illegal input format");
            throw null;
        }
    }

    public void setInput(Reader reader) {
        mo53610c("InputStream required");
        throw null;
    }

    public void setProperty(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported property: ");
        stringBuffer.append(str);
        throw new XmlPullParserException(stringBuffer.toString());
    }
}
