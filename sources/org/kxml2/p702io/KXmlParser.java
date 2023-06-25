package org.kxml2.p702io;

import android.support.p025v4.media.session.PlaybackStateCompat;
import androidx.core.p028os.EnvironmentCompat;
import androidx.room.RoomDatabase;
import androidx.test.internal.runner.RunnerArgs;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import java.io.Reader;
import java.util.Hashtable;
import kotlin.text.Typography;
import okhttp3.internal.http2.Http2ExchangeCodec;
import org.xmlpull.p703v1.XmlPullParser;
import org.xmlpull.p703v1.XmlPullParserException;

/* renamed from: org.kxml2.io.KXmlParser */
public class KXmlParser implements XmlPullParser {

    /* renamed from: A */
    public int f19347A;

    /* renamed from: B */
    public char[] f19348B;

    /* renamed from: C */
    public int f19349C;

    /* renamed from: D */
    public int f19350D;

    /* renamed from: E */
    public boolean f19351E;

    /* renamed from: F */
    public String f19352F;

    /* renamed from: G */
    public String f19353G;

    /* renamed from: H */
    public String f19354H;

    /* renamed from: I */
    public boolean f19355I;

    /* renamed from: J */
    public int f19356J;

    /* renamed from: K */
    public String[] f19357K;

    /* renamed from: L */
    public int f19358L;

    /* renamed from: M */
    public String f19359M;

    /* renamed from: N */
    public int[] f19360N;

    /* renamed from: O */
    public int f19361O;

    /* renamed from: P */
    public boolean f19362P;

    /* renamed from: Q */
    public boolean f19363Q;

    /* renamed from: R */
    public boolean f19364R;

    /* renamed from: e */
    public Object f19365e;

    /* renamed from: l */
    public String f19366l;

    /* renamed from: m */
    public Boolean f19367m;

    /* renamed from: n */
    public boolean f19368n;

    /* renamed from: o */
    public boolean f19369o;

    /* renamed from: p */
    public Hashtable f19370p;

    /* renamed from: q */
    public int f19371q;

    /* renamed from: r */
    public String[] f19372r = new String[16];

    /* renamed from: s */
    public String[] f19373s = new String[8];

    /* renamed from: t */
    public int[] f19374t = new int[4];

    /* renamed from: u */
    public Reader f19375u;

    /* renamed from: v */
    public String f19376v;

    /* renamed from: w */
    public char[] f19377w;

    /* renamed from: x */
    public int f19378x;

    /* renamed from: y */
    public int f19379y;

    /* renamed from: z */
    public int f19380z;

    public KXmlParser() {
        int i = 128;
        this.f19348B = new char[128];
        this.f19357K = new String[16];
        this.f19358L = 0;
        this.f19360N = new int[2];
        this.f19377w = new char[(Runtime.getRuntime().freeMemory() >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? 8192 : i)];
    }

    /* renamed from: a */
    public final boolean mo53523a() {
        int i;
        String str;
        int i2 = 0;
        boolean z = false;
        while (true) {
            i = this.f19356J;
            if (i2 >= (i << 2)) {
                break;
            }
            String str2 = this.f19357K[i2 + 2];
            int indexOf = str2.indexOf(58);
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                str = str2.substring(indexOf + 1);
                str2 = substring;
            } else if (str2.equals("xmlns")) {
                str = null;
            } else {
                i2 += 4;
            }
            if (!str2.equals("xmlns")) {
                z = true;
            } else {
                int[] iArr = this.f19374t;
                int i3 = this.f19371q;
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                int i5 = i4 << 1;
                String[] b = mo53524b(this.f19373s, i5 + 2);
                this.f19373s = b;
                b[i5] = str;
                String[] strArr = this.f19357K;
                int i6 = i2 + 3;
                b[i5 + 1] = strArr[i6];
                if (str != null && strArr[i6].equals("")) {
                    mo53525c("illegal empty namespace");
                }
                String[] strArr2 = this.f19357K;
                int i7 = this.f19356J - 1;
                this.f19356J = i7;
                System.arraycopy(strArr2, i2 + 4, strArr2, i2, (i7 << 2) - i2);
                i2 -= 4;
            }
            i2 += 4;
        }
        if (z) {
            int i8 = (i << 2) - 4;
            while (i8 >= 0) {
                int i9 = i8 + 2;
                String str3 = this.f19357K[i9];
                int indexOf2 = str3.indexOf(58);
                if (indexOf2 != 0 || this.f19369o) {
                    if (indexOf2 != -1) {
                        String substring2 = str3.substring(0, indexOf2);
                        String substring3 = str3.substring(indexOf2 + 1);
                        String namespace = getNamespace(substring2);
                        if (namespace != null || this.f19369o) {
                            String[] strArr3 = this.f19357K;
                            strArr3[i8] = namespace;
                            strArr3[i8 + 1] = substring2;
                            strArr3[i9] = substring3;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Undefined Prefix: ");
                            stringBuffer.append(substring2);
                            stringBuffer.append(" in ");
                            stringBuffer.append(this);
                            throw new RuntimeException(stringBuffer.toString());
                        }
                    }
                    i8 -= 4;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("illegal attribute name: ");
                    stringBuffer2.append(str3);
                    stringBuffer2.append(" at ");
                    stringBuffer2.append(this);
                    throw new RuntimeException(stringBuffer2.toString());
                }
            }
        }
        int indexOf3 = this.f19354H.indexOf(58);
        if (indexOf3 == 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("illegal tag name: ");
            stringBuffer3.append(this.f19354H);
            mo53525c(stringBuffer3.toString());
        }
        if (indexOf3 != -1) {
            this.f19353G = this.f19354H.substring(0, indexOf3);
            this.f19354H = this.f19354H.substring(indexOf3 + 1);
        }
        String namespace2 = getNamespace(this.f19353G);
        this.f19352F = namespace2;
        if (namespace2 == null) {
            if (this.f19353G != null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("undefined prefix: ");
                stringBuffer4.append(this.f19353G);
                mo53525c(stringBuffer4.toString());
            }
            this.f19352F = "";
        }
        return z;
    }

    /* renamed from: b */
    public final String[] mo53524b(String[] strArr, int i) {
        if (strArr.length >= i) {
            return strArr;
        }
        String[] strArr2 = new String[(i + 16)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    /* renamed from: c */
    public final void mo53525c(String str) {
        if (!this.f19369o) {
            mo53526d(str);
            throw null;
        } else if (this.f19359M == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ERR: ");
            stringBuffer.append(str);
            this.f19359M = stringBuffer.toString();
        }
    }

    /* renamed from: d */
    public final void mo53526d(String str) {
        if (str.length() >= 100) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 100));
            stringBuffer.append("\n");
            str = stringBuffer.toString();
        }
        throw new XmlPullParserException(str, this, (Throwable) null);
    }

    public void defineEntityReplacementText(String str, String str2) {
        Hashtable hashtable = this.f19370p;
        if (hashtable != null) {
            hashtable.put(str, str2);
            return;
        }
        throw new RuntimeException("entity replacement text must be defined after setInput!");
    }

    /* renamed from: e */
    public final String mo53528e(int i) {
        return new String(this.f19348B, i, this.f19349C - i);
    }

    /* renamed from: f */
    public final boolean mo53529f(String str, boolean z, String str2) {
        if (!str.startsWith("http://xmlpull.org/v1/doc/")) {
            return false;
        }
        return str.substring(z ? 42 : 40).equals(str2);
    }

    /* renamed from: g */
    public final void mo53530g() {
        int j;
        if (this.f19375u != null) {
            if (this.f19350D == 3) {
                this.f19371q--;
            }
            do {
                this.f19356J = -1;
                if (this.f19355I) {
                    this.f19355I = false;
                    this.f19350D = 3;
                    return;
                } else if (this.f19359M != null) {
                    for (int i = 0; i < this.f19359M.length(); i++) {
                        mo53564n(this.f19359M.charAt(i));
                    }
                    this.f19359M = null;
                    this.f19350D = 9;
                    return;
                } else if (!this.f19369o || (this.f19358L <= 0 && (mo53562l(0) != -1 || this.f19371q <= 0))) {
                    this.f19353G = null;
                    this.f19354H = null;
                    this.f19352F = null;
                    int m = mo53563m();
                    this.f19350D = m;
                    if (m == 1) {
                        return;
                    }
                    if (m == 2) {
                        mo53561k(false);
                        return;
                    } else if (m == 3) {
                        mo53556i();
                        return;
                    } else if (m == 4) {
                        mo53570p(60, !this.f19364R);
                        if (this.f19371q == 0 && this.f19351E) {
                            this.f19350D = 7;
                            return;
                        }
                        return;
                    } else if (m != 6) {
                        j = mo53560j(this.f19364R);
                        this.f19350D = j;
                    } else {
                        mo53569o();
                        return;
                    }
                } else {
                    int i2 = (this.f19371q - 1) << 2;
                    this.f19350D = 3;
                    String[] strArr = this.f19372r;
                    this.f19352F = strArr[i2];
                    this.f19353G = strArr[i2 + 1];
                    this.f19354H = strArr[i2 + 2];
                    if (this.f19358L != 1) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("missing end tag /");
                        stringBuffer.append(this.f19354H);
                        stringBuffer.append(" inserted");
                        this.f19359M = stringBuffer.toString();
                    }
                    int i3 = this.f19358L;
                    if (i3 > 0) {
                        this.f19358L = i3 - 1;
                        return;
                    }
                    return;
                }
            } while (j == 998);
            return;
        }
        mo53526d("No Input specified");
        throw null;
    }

    public int getAttributeCount() {
        return this.f19356J;
    }

    public String getAttributeName(int i) {
        if (i < this.f19356J) {
            return this.f19357K[(i << 2) + 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeNamespace(int i) {
        if (i < this.f19356J) {
            return this.f19357K[i << 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributePrefix(int i) {
        if (i < this.f19356J) {
            return this.f19357K[(i << 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeType(int i) {
        return "CDATA";
    }

    public String getAttributeValue(int i) {
        if (i < this.f19356J) {
            return this.f19357K[(i << 2) + 3];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getAttributeValue(String str, String str2) {
        for (int i = (this.f19356J << 2) - 4; i >= 0; i -= 4) {
            if (this.f19357K[i + 2].equals(str2) && (str == null || this.f19357K[i].equals(str))) {
                return this.f19357K[i + 3];
            }
        }
        return null;
    }

    public int getColumnNumber() {
        return this.f19347A;
    }

    public int getDepth() {
        return this.f19371q;
    }

    public int getEventType() {
        return this.f19350D;
    }

    public boolean getFeature(String str) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.f19368n;
        }
        if (mo53529f(str, false, "relaxed")) {
            return this.f19369o;
        }
        return false;
    }

    public String getInputEncoding() {
        return this.f19376v;
    }

    public int getLineNumber() {
        return this.f19380z;
    }

    public String getName() {
        return this.f19354H;
    }

    public String getNamespace() {
        return this.f19352F;
    }

    public String getNamespace(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int namespaceCount = (getNamespaceCount(this.f19371q) << 1) - 2; namespaceCount >= 0; namespaceCount -= 2) {
            String[] strArr = this.f19373s;
            if (str == null) {
                if (strArr[namespaceCount] == null) {
                    return strArr[namespaceCount + 1];
                }
            } else if (str.equals(strArr[namespaceCount])) {
                return this.f19373s[namespaceCount + 1];
            }
        }
        return null;
    }

    public int getNamespaceCount(int i) {
        if (i <= this.f19371q) {
            return this.f19374t[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public String getNamespacePrefix(int i) {
        return this.f19373s[i << 1];
    }

    public String getNamespaceUri(int i) {
        return this.f19373s[(i << 1) + 1];
    }

    public String getPositionDescription() {
        String text;
        int i = this.f19350D;
        String[] strArr = XmlPullParser.TYPES;
        StringBuffer stringBuffer = new StringBuffer(i < strArr.length ? strArr[i] : EnvironmentCompat.MEDIA_UNKNOWN);
        stringBuffer.append(' ');
        int i2 = this.f19350D;
        if (i2 == 2 || i2 == 3) {
            if (this.f19355I) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append(Typography.less);
            if (this.f19350D == 3) {
                stringBuffer.append('/');
            }
            if (this.f19353G != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("{");
                stringBuffer2.append(this.f19352F);
                stringBuffer2.append("}");
                stringBuffer2.append(this.f19353G);
                stringBuffer2.append(RunnerArgs.CLASSPATH_SEPARATOR);
                stringBuffer.append(stringBuffer2.toString());
            }
            stringBuffer.append(this.f19354H);
            int i3 = this.f19356J << 2;
            for (int i4 = 0; i4 < i3; i4 += 4) {
                stringBuffer.append(' ');
                int i5 = i4 + 1;
                if (this.f19357K[i5] != null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("{");
                    stringBuffer3.append(this.f19357K[i4]);
                    stringBuffer3.append("}");
                    stringBuffer3.append(this.f19357K[i5]);
                    stringBuffer3.append(RunnerArgs.CLASSPATH_SEPARATOR);
                    stringBuffer.append(stringBuffer3.toString());
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(this.f19357K[i4 + 2]);
                stringBuffer4.append("='");
                stringBuffer4.append(this.f19357K[i4 + 3]);
                stringBuffer4.append("'");
                stringBuffer.append(stringBuffer4.toString());
            }
            stringBuffer.append(Typography.greater);
        } else if (i2 != 7) {
            if (i2 != 4) {
                text = getText();
            } else if (this.f19351E) {
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
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("@");
        stringBuffer6.append(this.f19380z);
        stringBuffer6.append(RunnerArgs.CLASSPATH_SEPARATOR);
        stringBuffer6.append(this.f19347A);
        stringBuffer.append(stringBuffer6.toString());
        if (this.f19365e != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f19365e);
        } else if (this.f19375u != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f19375u.toString());
        }
        return stringBuffer.toString();
    }

    public String getPrefix() {
        return this.f19353G;
    }

    public Object getProperty(String str) {
        if (mo53529f(str, true, "xmldecl-version")) {
            return this.f19366l;
        }
        if (mo53529f(str, true, "xmldecl-standalone")) {
            return this.f19367m;
        }
        if (!mo53529f(str, true, "location")) {
            return null;
        }
        Object obj = this.f19365e;
        return obj != null ? obj : this.f19375u.toString();
    }

    public String getText() {
        int i = this.f19350D;
        if (i < 4 || (i == 6 && this.f19363Q)) {
            return null;
        }
        return mo53528e(0);
    }

    public char[] getTextCharacters(int[] iArr) {
        int i = this.f19350D;
        if (i < 4) {
            iArr[0] = -1;
            iArr[1] = -1;
            return null;
        } else if (i == 6) {
            iArr[0] = 0;
            iArr[1] = this.f19354H.length();
            return this.f19354H.toCharArray();
        } else {
            iArr[0] = 0;
            iArr[1] = this.f19349C;
            return this.f19348B;
        }
    }

    /* renamed from: h */
    public final void mo53555h(boolean z) {
        int i = 1;
        boolean z2 = false;
        while (true) {
            int q = mo53571q();
            if (q != -1) {
                if (q == 39) {
                    z2 = !z2;
                } else if (q != 60) {
                    if (q == 62 && !z2 && i - 1 == 0) {
                        return;
                    }
                } else if (!z2) {
                    i++;
                }
                if (z) {
                    mo53564n(q);
                }
            } else {
                mo53525c("Unexpected EOF");
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo53556i() {
        mo53571q();
        mo53571q();
        this.f19354H = mo53574s();
        mo53579t();
        mo53572r(Typography.greater);
        int i = this.f19371q;
        int i2 = (i - 1) << 2;
        if (i == 0) {
            mo53525c("element stack empty");
            this.f19350D = 9;
            return;
        }
        int i3 = i2 + 3;
        if (!this.f19354H.equals(this.f19372r[i3])) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: /");
            stringBuffer.append(this.f19372r[i3]);
            stringBuffer.append(" read: ");
            stringBuffer.append(this.f19354H);
            mo53525c(stringBuffer.toString());
            int i4 = i2;
            while (i4 >= 0 && !this.f19354H.toLowerCase().equals(this.f19372r[i4 + 3].toLowerCase())) {
                this.f19358L++;
                i4 -= 4;
            }
            if (i4 < 0) {
                this.f19358L = 0;
                this.f19350D = 9;
                return;
            }
        }
        String[] strArr = this.f19372r;
        this.f19352F = strArr[i2];
        this.f19353G = strArr[i2 + 1];
        this.f19354H = strArr[i2 + 2];
    }

    public boolean isAttributeDefault(int i) {
        return false;
    }

    public boolean isEmptyElementTag() {
        if (this.f19350D == 2) {
            return this.f19355I;
        }
        mo53526d("Wrong event type");
        throw null;
    }

    public boolean isWhitespace() {
        int i = this.f19350D;
        if (i == 4 || i == 7 || i == 5) {
            return this.f19351E;
        }
        mo53526d("Wrong event type");
        throw null;
    }

    /* renamed from: j */
    public final int mo53560j(boolean z) {
        String str;
        int i;
        int i2;
        String str2;
        Boolean bool;
        mo53571q();
        int q = mo53571q();
        if (q == 63) {
            if ((mo53562l(0) == 120 || mo53562l(0) == 88) && (mo53562l(1) == 109 || mo53562l(1) == 77)) {
                if (z) {
                    mo53564n(mo53562l(0));
                    mo53564n(mo53562l(1));
                }
                mo53571q();
                mo53571q();
                if ((mo53562l(0) == 108 || mo53562l(0) == 76) && mo53562l(1) <= 32) {
                    if (this.f19380z != 1 || this.f19347A > 4) {
                        mo53525c("PI must not start with xml");
                    }
                    mo53561k(true);
                    int i3 = 2;
                    if (this.f19356J < 1 || !"version".equals(this.f19357K[2])) {
                        mo53525c("version expected");
                    }
                    String[] strArr = this.f19357K;
                    this.f19366l = strArr[3];
                    if (1 >= this.f19356J || !Http2ExchangeCodec.ENCODING.equals(strArr[6])) {
                        i3 = 1;
                    } else {
                        this.f19376v = this.f19357K[7];
                    }
                    if (i3 < this.f19356J) {
                        int i4 = i3 * 4;
                        if ("standalone".equals(this.f19357K[i4 + 2])) {
                            String str3 = this.f19357K[i4 + 3];
                            if ("yes".equals(str3)) {
                                bool = new Boolean(true);
                            } else if (LanguageConstKt.f15962no.equals(str3)) {
                                bool = new Boolean(false);
                            } else {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("illegal standalone value: ");
                                stringBuffer.append(str3);
                                mo53525c(stringBuffer.toString());
                                i3++;
                            }
                            this.f19367m = bool;
                            i3++;
                        }
                    }
                    if (i3 != this.f19356J) {
                        mo53525c("illegal xmldecl");
                    }
                    this.f19351E = true;
                    this.f19349C = 0;
                    return 998;
                }
            }
            i = 8;
            str2 = "";
            i2 = 63;
        } else if (q != 33) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("illegal: <");
            stringBuffer2.append(q);
            str = stringBuffer2.toString();
            mo53525c(str);
            return 9;
        } else if (mo53562l(0) == 45) {
            i = 9;
            str2 = "--";
            i2 = 45;
        } else if (mo53562l(0) == 91) {
            i = 5;
            str2 = "[CDATA[";
            i2 = 93;
            z = true;
        } else {
            i = 10;
            str2 = "DOCTYPE";
            i2 = -1;
        }
        for (int i5 = 0; i5 < str2.length(); i5++) {
            mo53572r(str2.charAt(i5));
        }
        if (i == 10) {
            mo53555h(z);
        } else {
            int i6 = 0;
            while (true) {
                int q2 = mo53571q();
                if (q2 == -1) {
                    str = "Unexpected EOF";
                    break;
                }
                if (z) {
                    mo53564n(q2);
                }
                if ((i2 == 63 || q2 == i2) && mo53562l(0) == i2 && mo53562l(1) == 62) {
                    if (i2 == 45 && i6 == 45) {
                        mo53525c("illegal comment delimiter: --->");
                    }
                    mo53571q();
                    mo53571q();
                    if (z && i2 != 63) {
                        this.f19349C--;
                    }
                } else {
                    i6 = q2;
                }
            }
            mo53525c(str);
            return 9;
        }
        return i;
    }

    /* renamed from: k */
    public final void mo53561k(boolean z) {
        if (!z) {
            mo53571q();
        }
        this.f19354H = mo53574s();
        this.f19356J = 0;
        while (true) {
            mo53579t();
            int l = mo53562l(0);
            if (!z) {
                if (l != 47) {
                    if (l == 62 && !z) {
                        mo53571q();
                        break;
                    }
                } else {
                    this.f19355I = true;
                    mo53571q();
                    mo53579t();
                    mo53572r(Typography.greater);
                    break;
                }
            } else if (l == 63) {
                mo53571q();
                mo53572r(Typography.greater);
                return;
            }
            if (l == -1) {
                mo53525c("Unexpected EOF");
                return;
            }
            String s = mo53574s();
            if (s.length() == 0) {
                mo53525c("attr name expected");
                break;
            }
            int i = this.f19356J;
            this.f19356J = i + 1;
            int i2 = i << 2;
            String[] b = mo53524b(this.f19357K, i2 + 4);
            this.f19357K = b;
            int i3 = i2 + 1;
            b[i2] = "";
            int i4 = i3 + 1;
            b[i3] = null;
            int i5 = i4 + 1;
            b[i4] = s;
            mo53579t();
            if (mo53562l(0) != 61) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attr.value missing f. ");
                stringBuffer.append(s);
                mo53525c(stringBuffer.toString());
                this.f19357K[i5] = "1";
            } else {
                mo53572r('=');
                mo53579t();
                int l2 = mo53562l(0);
                if (l2 == 39 || l2 == 34) {
                    mo53571q();
                } else {
                    mo53525c("attr value delimiter missing!");
                    l2 = 32;
                }
                int i6 = this.f19349C;
                mo53570p(l2, true);
                this.f19357K[i5] = mo53528e(i6);
                this.f19349C = i6;
                if (l2 != 32) {
                    mo53571q();
                }
            }
        }
        int i7 = this.f19371q;
        this.f19371q = i7 + 1;
        int i8 = i7 << 2;
        String[] b2 = mo53524b(this.f19372r, i8 + 4);
        this.f19372r = b2;
        b2[i8 + 3] = this.f19354H;
        int i9 = this.f19371q;
        int[] iArr = this.f19374t;
        if (i9 >= iArr.length) {
            int[] iArr2 = new int[(i9 + 4)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f19374t = iArr2;
        }
        int[] iArr3 = this.f19374t;
        int i10 = this.f19371q;
        iArr3[i10] = iArr3[i10 - 1];
        if (this.f19368n) {
            mo53523a();
        } else {
            this.f19352F = "";
        }
        String[] strArr = this.f19372r;
        strArr[i8] = this.f19352F;
        strArr[i8 + 1] = this.f19353G;
        strArr[i8 + 2] = this.f19354H;
    }

    /* renamed from: l */
    public final int mo53562l(int i) {
        int i2;
        while (i >= this.f19361O) {
            char[] cArr = this.f19377w;
            if (cArr.length <= 1) {
                i2 = this.f19375u.read();
            } else {
                int i3 = this.f19378x;
                if (i3 < this.f19379y) {
                    this.f19378x = i3 + 1;
                    i2 = cArr[i3];
                } else {
                    int read = this.f19375u.read(cArr, 0, cArr.length);
                    this.f19379y = read;
                    char c = read <= 0 ? 65535 : this.f19377w[0];
                    this.f19378x = 1;
                    i2 = c;
                }
            }
            if (i2 == 13) {
                this.f19362P = true;
                int[] iArr = this.f19360N;
                int i4 = this.f19361O;
                this.f19361O = i4 + 1;
                iArr[i4] = 10;
            } else {
                if (i2 != 10) {
                    int[] iArr2 = this.f19360N;
                    int i5 = this.f19361O;
                    this.f19361O = i5 + 1;
                    iArr2[i5] = i2;
                } else if (!this.f19362P) {
                    int[] iArr3 = this.f19360N;
                    int i6 = this.f19361O;
                    this.f19361O = i6 + 1;
                    iArr3[i6] = 10;
                }
                this.f19362P = false;
            }
        }
        return this.f19360N[i];
    }

    /* renamed from: m */
    public final int mo53563m() {
        int l = mo53562l(0);
        if (l == -1) {
            return 1;
        }
        if (l == 38) {
            return 6;
        }
        if (l != 60) {
            return 4;
        }
        int l2 = mo53562l(1);
        if (l2 == 33) {
            return RoomDatabase.MAX_BIND_PARAMETER_CNT;
        }
        if (l2 == 47) {
            return 3;
        }
        if (l2 != 63) {
            return 2;
        }
        return RoomDatabase.MAX_BIND_PARAMETER_CNT;
    }

    /* renamed from: n */
    public final void mo53564n(int i) {
        this.f19351E &= i <= 32;
        int i2 = this.f19349C;
        char[] cArr = this.f19348B;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[(((i2 * 4) / 3) + 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f19348B = cArr2;
        }
        char[] cArr3 = this.f19348B;
        int i3 = this.f19349C;
        this.f19349C = i3 + 1;
        cArr3[i3] = (char) i;
    }

    public int next() {
        this.f19349C = 0;
        this.f19351E = true;
        this.f19364R = false;
        int i = 9999;
        while (true) {
            mo53530g();
            int i2 = this.f19350D;
            if (i2 < i) {
                i = i2;
            }
            if (i > 6 || (i >= 4 && mo53563m() >= 4)) {
            }
        }
        this.f19350D = i;
        if (i > 4) {
            this.f19350D = 4;
        }
        return this.f19350D;
    }

    public int nextTag() {
        next();
        if (this.f19350D == 4 && this.f19351E) {
            next();
        }
        int i = this.f19350D;
        if (i == 3 || i == 2) {
            return this.f19350D;
        }
        mo53526d("unexpected type");
        throw null;
    }

    public String nextText() {
        String str;
        if (this.f19350D == 2) {
            next();
            if (this.f19350D == 4) {
                str = getText();
                next();
            } else {
                str = "";
            }
            if (this.f19350D == 3) {
                return str;
            }
            mo53526d("END_TAG expected");
            throw null;
        }
        mo53526d("precondition: START_TAG");
        throw null;
    }

    public int nextToken() {
        this.f19351E = true;
        this.f19349C = 0;
        this.f19364R = true;
        mo53530g();
        return this.f19350D;
    }

    /* renamed from: o */
    public final void mo53569o() {
        mo53564n(mo53571q());
        int i = this.f19349C;
        while (true) {
            int q = mo53571q();
            if (q == 59) {
                String e = mo53528e(i);
                boolean z = true;
                this.f19349C = i - 1;
                if (this.f19364R && this.f19350D == 6) {
                    this.f19354H = e;
                }
                if (e.charAt(0) == '#') {
                    mo53564n(e.charAt(1) == 'x' ? Integer.parseInt(e.substring(2), 16) : Integer.parseInt(e.substring(1)));
                    return;
                }
                String str = (String) this.f19370p.get(e);
                if (str != null) {
                    z = false;
                }
                this.f19363Q = z;
                if (!z) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        mo53564n(str.charAt(i2));
                    }
                    return;
                } else if (!this.f19364R) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("unresolved: &");
                    stringBuffer.append(e);
                    stringBuffer.append(MAPCookie.COOKIE_ATTRIBUTE_SEPERATOR);
                    mo53525c(stringBuffer.toString());
                    return;
                } else {
                    return;
                }
            } else if (q >= 128 || ((q >= 48 && q <= 57) || ((q >= 97 && q <= 122) || ((q >= 65 && q <= 90) || q == 95 || q == 45 || q == 35)))) {
                mo53564n(q);
            } else {
                if (!this.f19369o) {
                    mo53525c("unterminated entity ref");
                }
                if (q != -1) {
                    mo53564n(q);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: p */
    public final void mo53570p(int i, boolean z) {
        int l = mo53562l(0);
        int i2 = 0;
        while (l != -1 && l != i) {
            int i3 = 32;
            if (i != 32 || (l > 32 && l != 62)) {
                if (l != 38) {
                    if (l == 10 && this.f19350D == 2) {
                        mo53571q();
                    } else {
                        i3 = mo53571q();
                    }
                    mo53564n(i3);
                } else if (z) {
                    mo53569o();
                } else {
                    return;
                }
                if (l == 62 && i2 >= 2 && i != 93) {
                    mo53525c("Illegal: ]]>");
                }
                i2 = l == 93 ? i2 + 1 : 0;
                l = mo53562l(0);
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final int mo53571q() {
        int i;
        if (this.f19361O == 0) {
            i = mo53562l(0);
        } else {
            int[] iArr = this.f19360N;
            int i2 = iArr[0];
            iArr[0] = iArr[1];
            i = i2;
        }
        this.f19361O--;
        this.f19347A++;
        if (i == 10) {
            this.f19380z++;
            this.f19347A = 1;
        }
        return i;
    }

    /* renamed from: r */
    public final void mo53572r(char c) {
        int q = mo53571q();
        if (q != c) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: '");
            stringBuffer.append(c);
            stringBuffer.append("' actual: '");
            stringBuffer.append((char) q);
            stringBuffer.append("'");
            mo53525c(stringBuffer.toString());
        }
    }

    public void require(int i, String str, String str2) {
        if (i != this.f19350D || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: ");
            stringBuffer.append(XmlPullParser.TYPES[i]);
            stringBuffer.append(" {");
            stringBuffer.append(str);
            stringBuffer.append("}");
            stringBuffer.append(str2);
            mo53526d(stringBuffer.toString());
            throw null;
        }
    }

    /* renamed from: s */
    public final String mo53574s() {
        int i = this.f19349C;
        int l = mo53562l(0);
        if ((l < 97 || l > 122) && ((l < 65 || l > 90) && l != 95 && l != 58 && l < 192 && !this.f19369o)) {
            mo53525c("name expected");
        }
        while (true) {
            mo53564n(mo53571q());
            int l2 = mo53562l(0);
            if ((l2 < 97 || l2 > 122) && ((l2 < 65 || l2 > 90) && !((l2 >= 48 && l2 <= 57) || l2 == 95 || l2 == 45 || l2 == 58 || l2 == 46 || l2 >= 183))) {
                String e = mo53528e(i);
                this.f19349C = i;
                return e;
            }
        }
    }

    public void setFeature(String str, boolean z) {
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            this.f19368n = z;
        } else if (mo53529f(str, false, "relaxed")) {
            this.f19369o = z;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unsupported feature: ");
            stringBuffer.append(str);
            mo53526d(stringBuffer.toString());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r3 = r13.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3 != -1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r4 = r12.f19377w;
        r7 = r12.f19379y;
        r12.f19379y = r7 + 1;
        r4[r7] = (char) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != 62) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r3 = new java.lang.String(r12.f19377w, 0, r12.f19379y);
        r4 = r3.indexOf(okhttp3.internal.http2.Http2ExchangeCodec.ENCODING);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r4 == -1) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r3.charAt(r4) == '\"') goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r3.charAt(r4) == '\'') goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r7 = r4 + 1;
        r3 = r3.substring(r7, r3.indexOf(r3.charAt(r4), r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r1 = "UTF-16BE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r1 = "UTF-32LE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b6, code lost:
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r4 = -65536 & r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        if (r4 != -16842752) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        r12.f19377w[0] = (char) ((r12.f19377w[2] << 8) | r12.f19377w[3]);
        r12.f19379y = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        if (r4 != -131072) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d6, code lost:
        r12.f19377w[0] = (char) ((r12.f19377w[3] << 8) | r12.f19377w[2]);
        r12.f19379y = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if ((r6 & androidx.core.view.InputDeviceCompat.SOURCE_ANY) != -272908544) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        r12.f19377w[0] = r12.f19377w[3];
        r12.f19379y = 1;
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fc, code lost:
        r1 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInput(java.io.InputStream r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 0
            r12.f19378x = r0
            r12.f19379y = r0
            if (r13 == 0) goto L_0x012e
            java.lang.String r1 = "UTF-16LE"
            java.lang.String r2 = "UTF-16BE"
            java.lang.String r3 = "UTF-32BE"
            java.lang.String r4 = "UTF-32LE"
            java.lang.String r5 = "UTF-8"
            if (r14 != 0) goto L_0x00fe
            r6 = r0
        L_0x0014:
            int r7 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            r8 = 4
            r9 = -1
            if (r7 >= r8) goto L_0x0030
            int r7 = r13.read()     // Catch:{ Exception -> 0x0112 }
            if (r7 != r9) goto L_0x0021
            goto L_0x0030
        L_0x0021:
            int r6 = r6 << 8
            r6 = r6 | r7
            char[] r8 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            int r9 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            int r10 = r9 + 1
            r12.f19379y = r10     // Catch:{ Exception -> 0x0112 }
            char r7 = (char) r7     // Catch:{ Exception -> 0x0112 }
            r8[r9] = r7     // Catch:{ Exception -> 0x0112 }
            goto L_0x0014
        L_0x0030:
            int r7 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            if (r7 != r8) goto L_0x00fe
            r7 = 63
            r8 = 2
            r10 = 60
            r11 = 1
            switch(r6) {
                case -131072: goto L_0x00b2;
                case 60: goto L_0x00ab;
                case 65279: goto L_0x00a8;
                case 3932223: goto L_0x009c;
                case 1006632960: goto L_0x0095;
                case 1006649088: goto L_0x0089;
                case 1010792557: goto L_0x003f;
                default: goto L_0x003d;
            }     // Catch:{ Exception -> 0x0112 }
        L_0x003d:
            goto L_0x00b6
        L_0x003f:
            int r3 = r13.read()     // Catch:{ Exception -> 0x0112 }
            if (r3 != r9) goto L_0x0047
            goto L_0x00b6
        L_0x0047:
            char[] r4 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            int r7 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            int r10 = r7 + 1
            r12.f19379y = r10     // Catch:{ Exception -> 0x0112 }
            char r10 = (char) r3     // Catch:{ Exception -> 0x0112 }
            r4[r7] = r10     // Catch:{ Exception -> 0x0112 }
            r4 = 62
            if (r3 != r4) goto L_0x003f
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0112 }
            char[] r4 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            int r7 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            r3.<init>(r4, r0, r7)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "encoding"
            int r4 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0112 }
            if (r4 == r9) goto L_0x00b6
        L_0x0067:
            char r7 = r3.charAt(r4)     // Catch:{ Exception -> 0x0112 }
            r9 = 34
            if (r7 == r9) goto L_0x007a
            char r7 = r3.charAt(r4)     // Catch:{ Exception -> 0x0112 }
            r9 = 39
            if (r7 == r9) goto L_0x007a
            int r4 = r4 + 1
            goto L_0x0067
        L_0x007a:
            int r7 = r4 + 1
            char r4 = r3.charAt(r4)     // Catch:{ Exception -> 0x0112 }
            int r4 = r3.indexOf(r4, r7)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = r3.substring(r7, r4)     // Catch:{ Exception -> 0x0112 }
            goto L_0x00b7
        L_0x0089:
            char[] r2 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r2[r0] = r10     // Catch:{ Exception -> 0x0112 }
            char[] r0 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r0[r11] = r7     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r8     // Catch:{ Exception -> 0x0112 }
            goto L_0x00ff
        L_0x0095:
            char[] r1 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r1[r0] = r10     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r11     // Catch:{ Exception -> 0x0112 }
            goto L_0x00b4
        L_0x009c:
            char[] r1 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r1[r0] = r10     // Catch:{ Exception -> 0x0112 }
            char[] r0 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r0[r11] = r7     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r8     // Catch:{ Exception -> 0x0112 }
        L_0x00a6:
            r1 = r2
            goto L_0x00ff
        L_0x00a8:
            r12.f19379y = r0     // Catch:{ Exception -> 0x0112 }
            goto L_0x00fc
        L_0x00ab:
            char[] r1 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            r1[r0] = r10     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r11     // Catch:{ Exception -> 0x0112 }
            goto L_0x00fc
        L_0x00b2:
            r12.f19379y = r0     // Catch:{ Exception -> 0x0112 }
        L_0x00b4:
            r1 = r4
            goto L_0x00ff
        L_0x00b6:
            r3 = r14
        L_0x00b7:
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r6
            r7 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r9 = 3
            if (r4 != r7) goto L_0x00d2
            char[] r1 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char[] r3 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char r3 = r3[r8]     // Catch:{ Exception -> 0x0112 }
            int r3 = r3 << 8
            char[] r4 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char r4 = r4[r9]     // Catch:{ Exception -> 0x0112 }
            r3 = r3 | r4
            char r3 = (char) r3     // Catch:{ Exception -> 0x0112 }
            r1[r0] = r3     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r11     // Catch:{ Exception -> 0x0112 }
            goto L_0x00a6
        L_0x00d2:
            r2 = -131072(0xfffffffffffe0000, float:NaN)
            if (r4 != r2) goto L_0x00e9
            char[] r2 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char[] r3 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char r3 = r3[r9]     // Catch:{ Exception -> 0x0112 }
            int r3 = r3 << 8
            char[] r4 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char r4 = r4[r8]     // Catch:{ Exception -> 0x0112 }
            r3 = r3 | r4
            char r3 = (char) r3     // Catch:{ Exception -> 0x0112 }
            r2[r0] = r3     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r11     // Catch:{ Exception -> 0x0112 }
            goto L_0x00ff
        L_0x00e9:
            r1 = r6 & -256(0xffffffffffffff00, float:NaN)
            r2 = -272908544(0xffffffffefbbbf00, float:-1.162092E29)
            if (r1 != r2) goto L_0x00fc
            char[] r1 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char[] r2 = r12.f19377w     // Catch:{ Exception -> 0x0112 }
            char r2 = r2[r9]     // Catch:{ Exception -> 0x0112 }
            r1[r0] = r2     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r11     // Catch:{ Exception -> 0x0112 }
            r1 = r5
            goto L_0x00ff
        L_0x00fc:
            r1 = r3
            goto L_0x00ff
        L_0x00fe:
            r1 = r14
        L_0x00ff:
            if (r1 != 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r5 = r1
        L_0x0103:
            int r0 = r12.f19379y     // Catch:{ Exception -> 0x0112 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0112 }
            r1.<init>(r13, r5)     // Catch:{ Exception -> 0x0112 }
            r12.setInput(r1)     // Catch:{ Exception -> 0x0112 }
            r12.f19376v = r14     // Catch:{ Exception -> 0x0112 }
            r12.f19379y = r0     // Catch:{ Exception -> 0x0112 }
            return
        L_0x0112:
            r13 = move-exception
            org.xmlpull.v1.XmlPullParserException r14 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Invalid stream or encoding: "
            r0.append(r1)
            java.lang.String r1 = r13.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0, r12, r13)
            throw r14
        L_0x012e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kxml2.p702io.KXmlParser.setInput(java.io.InputStream, java.lang.String):void");
    }

    public void setInput(Reader reader) {
        this.f19375u = reader;
        this.f19380z = 1;
        this.f19347A = 0;
        this.f19350D = 0;
        this.f19354H = null;
        this.f19352F = null;
        this.f19355I = false;
        this.f19356J = -1;
        this.f19376v = null;
        this.f19366l = null;
        this.f19367m = null;
        if (reader != null) {
            this.f19378x = 0;
            this.f19379y = 0;
            this.f19361O = 0;
            this.f19371q = 0;
            Hashtable hashtable = new Hashtable();
            this.f19370p = hashtable;
            hashtable.put("amp", "&");
            this.f19370p.put("apos", "'");
            this.f19370p.put("gt", ">");
            this.f19370p.put("lt", "<");
            this.f19370p.put("quot", "\"");
        }
    }

    public void setProperty(String str, Object obj) {
        if (mo53529f(str, true, "location")) {
            this.f19365e = obj;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported property: ");
        stringBuffer.append(str);
        throw new XmlPullParserException(stringBuffer.toString());
    }

    /* renamed from: t */
    public final void mo53579t() {
        while (true) {
            int l = mo53562l(0);
            if (l <= 32 && l != -1) {
                mo53571q();
            } else {
                return;
            }
        }
    }
}
