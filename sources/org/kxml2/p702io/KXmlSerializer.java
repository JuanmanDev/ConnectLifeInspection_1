package org.kxml2.p702io;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.xmlpull.p703v1.XmlSerializer;

/* renamed from: org.kxml2.io.KXmlSerializer */
public class KXmlSerializer implements XmlSerializer {

    /* renamed from: a */
    public Writer f19381a;

    /* renamed from: b */
    public boolean f19382b;

    /* renamed from: c */
    public int f19383c;

    /* renamed from: d */
    public int f19384d;

    /* renamed from: e */
    public String[] f19385e = new String[12];

    /* renamed from: f */
    public int[] f19386f = new int[4];

    /* renamed from: g */
    public String[] f19387g = new String[8];

    /* renamed from: h */
    public boolean[] f19388h = new boolean[4];

    /* renamed from: i */
    public boolean f19389i;

    /* renamed from: j */
    public String f19390j;

    /* renamed from: a */
    public final void mo53580a(boolean z) {
        if (this.f19382b) {
            int i = this.f19384d + 1;
            this.f19384d = i;
            this.f19382b = false;
            boolean[] zArr = this.f19388h;
            if (zArr.length <= i) {
                boolean[] zArr2 = new boolean[(i + 4)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                this.f19388h = zArr2;
            }
            boolean[] zArr3 = this.f19388h;
            int i2 = this.f19384d;
            zArr3[i2] = zArr3[i2 - 1];
            int i3 = this.f19386f[i2 - 1];
            while (true) {
                int[] iArr = this.f19386f;
                int i4 = this.f19384d;
                if (i3 < iArr[i4]) {
                    this.f19381a.write(32);
                    this.f19381a.write("xmlns");
                    int i5 = i3 * 2;
                    if (!"".equals(this.f19387g[i5])) {
                        this.f19381a.write(58);
                        this.f19381a.write(this.f19387g[i5]);
                    } else if ("".equals(getNamespace()) && !"".equals(this.f19387g[i5 + 1])) {
                        throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                    }
                    this.f19381a.write("=\"");
                    mo53583c(this.f19387g[i5 + 1], 34);
                    this.f19381a.write(34);
                    i3++;
                } else {
                    if (iArr.length <= i4 + 1) {
                        int[] iArr2 = new int[(i4 + 8)];
                        System.arraycopy(iArr, 0, iArr2, 0, i4 + 1);
                        this.f19386f = iArr2;
                    }
                    int[] iArr3 = this.f19386f;
                    int i6 = this.f19384d;
                    iArr3[i6 + 1] = iArr3[i6];
                    this.f19381a.write(z ? " />" : ">");
                    return;
                }
            }
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        if (this.f19382b) {
            if (str == null) {
                str = "";
            }
            String b = "".equals(str) ? "" : mo53582b(str, false, true);
            this.f19381a.write(32);
            if (!"".equals(b)) {
                this.f19381a.write(b);
                this.f19381a.write(58);
            }
            this.f19381a.write(str2);
            this.f19381a.write(61);
            int i = 34;
            if (str3.indexOf(34) != -1) {
                i = 39;
            }
            this.f19381a.write(i);
            mo53583c(str3, i);
            this.f19381a.write(i);
            return this;
        }
        throw new IllegalStateException("illegal position for attribute");
    }

    /* renamed from: b */
    public final String mo53582b(String str, boolean z, boolean z2) {
        int i = this.f19386f[this.f19384d + 1] * 2;
        while (true) {
            i -= 2;
            String str2 = null;
            String str3 = "";
            if (i >= 0) {
                if (this.f19387g[i + 1].equals(str) && (z || !this.f19387g[i].equals(str3))) {
                    String str4 = this.f19387g[i];
                    int i2 = i + 2;
                    while (true) {
                        if (i2 >= this.f19386f[this.f19384d + 1] * 2) {
                            str2 = str4;
                            break;
                        } else if (this.f19387g[i2].equals(str4)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
            } else if (!z2) {
                return null;
            } else {
                if (!str3.equals(str)) {
                    do {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("n");
                        int i3 = this.f19383c;
                        this.f19383c = i3 + 1;
                        stringBuffer.append(i3);
                        String stringBuffer2 = stringBuffer.toString();
                        int i4 = (this.f19386f[this.f19384d + 1] * 2) - 2;
                        while (true) {
                            if (i4 < 0) {
                                str3 = stringBuffer2;
                                continue;
                                break;
                            } else if (stringBuffer2.equals(this.f19387g[i4])) {
                                str3 = null;
                                continue;
                                break;
                            } else {
                                i4 -= 2;
                            }
                        }
                    } while (str3 == null);
                } else {
                    boolean z3 = this.f19382b;
                    this.f19382b = false;
                    setPrefix(str3, str);
                    this.f19382b = z3;
                }
                boolean z32 = this.f19382b;
                this.f19382b = false;
                setPrefix(str3, str);
                this.f19382b = z32;
                return str3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1 != '\'') goto L_0x004f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53583c(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.length()
            if (r0 >= r1) goto L_0x009a
            char r1 = r6.charAt(r0)
            r2 = 9
            java.lang.String r3 = "&#"
            if (r1 == r2) goto L_0x007a
            r2 = 10
            if (r1 == r2) goto L_0x007a
            r2 = 13
            if (r1 == r2) goto L_0x007a
            r2 = 34
            if (r1 == r2) goto L_0x0040
            r4 = 60
            if (r1 == r4) goto L_0x003b
            r4 = 62
            if (r1 == r4) goto L_0x0036
            r4 = 38
            if (r1 == r4) goto L_0x002e
            r4 = 39
            if (r1 == r4) goto L_0x0040
            goto L_0x004f
        L_0x002e:
            java.io.Writer r1 = r5.f19381a
            java.lang.String r2 = "&amp;"
        L_0x0032:
            r1.write(r2)
            goto L_0x0096
        L_0x0036:
            java.io.Writer r1 = r5.f19381a
            java.lang.String r2 = "&gt;"
            goto L_0x0032
        L_0x003b:
            java.io.Writer r1 = r5.f19381a
            java.lang.String r2 = "&lt;"
            goto L_0x0032
        L_0x0040:
            if (r1 != r7) goto L_0x004f
            java.io.Writer r3 = r5.f19381a
            if (r1 != r2) goto L_0x0049
            java.lang.String r1 = "&quot;"
            goto L_0x004b
        L_0x0049:
            java.lang.String r1 = "&apos;"
        L_0x004b:
            r3.write(r1)
            goto L_0x0096
        L_0x004f:
            r2 = 32
            if (r1 < r2) goto L_0x0060
            r2 = 64
            if (r1 == r2) goto L_0x0060
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 < r2) goto L_0x007d
            boolean r2 = r5.f19389i
            if (r2 == 0) goto L_0x0060
            goto L_0x007d
        L_0x0060:
            java.io.Writer r2 = r5.f19381a
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = ";"
            r4.append(r1)
        L_0x0072:
            java.lang.String r1 = r4.toString()
            r2.write(r1)
            goto L_0x0096
        L_0x007a:
            r2 = -1
            if (r7 != r2) goto L_0x0083
        L_0x007d:
            java.io.Writer r2 = r5.f19381a
            r2.write(r1)
            goto L_0x0096
        L_0x0083:
            java.io.Writer r2 = r5.f19381a
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r4.append(r3)
            r4.append(r1)
            r1 = 59
            r4.append(r1)
            goto L_0x0072
        L_0x0096:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kxml2.p702io.KXmlSerializer.mo53583c(java.lang.String, int):void");
    }

    public void cdsect(String str) {
        mo53580a(false);
        this.f19381a.write("<![CDATA[");
        this.f19381a.write(str);
        this.f19381a.write("]]>");
    }

    public void comment(String str) {
        mo53580a(false);
        this.f19381a.write("<!--");
        this.f19381a.write(str);
        this.f19381a.write("-->");
    }

    public void docdecl(String str) {
        this.f19381a.write("<!DOCTYPE");
        this.f19381a.write(str);
        this.f19381a.write(">");
    }

    public void endDocument() {
        while (true) {
            int i = this.f19384d;
            if (i > 0) {
                String[] strArr = this.f19385e;
                endTag(strArr[(i * 3) - 3], strArr[(i * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    public XmlSerializer endTag(String str, String str2) {
        if (!this.f19382b) {
            this.f19384d--;
        }
        if ((str != null || this.f19385e[this.f19384d * 3] == null) && ((str == null || str.equals(this.f19385e[this.f19384d * 3])) && this.f19385e[(this.f19384d * 3) + 2].equals(str2))) {
            if (this.f19382b) {
                mo53580a(true);
                this.f19384d--;
            } else {
                if (this.f19388h[this.f19384d + 1]) {
                    this.f19381a.write("\r\n");
                    for (int i = 0; i < this.f19384d; i++) {
                        this.f19381a.write("  ");
                    }
                }
                this.f19381a.write("</");
                String str3 = this.f19385e[(this.f19384d * 3) + 1];
                if (!"".equals(str3)) {
                    this.f19381a.write(str3);
                    this.f19381a.write(58);
                }
                this.f19381a.write(str2);
                this.f19381a.write(62);
            }
            int[] iArr = this.f19386f;
            int i2 = this.f19384d;
            iArr[i2 + 1] = iArr[i2];
            return this;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("</{");
        stringBuffer.append(str);
        stringBuffer.append("}");
        stringBuffer.append(str2);
        stringBuffer.append("> does not match start");
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void entityRef(String str) {
        mo53580a(false);
        this.f19381a.write(38);
        this.f19381a.write(str);
        this.f19381a.write(59);
    }

    public void flush() {
        mo53580a(false);
        this.f19381a.flush();
    }

    public int getDepth() {
        return this.f19382b ? this.f19384d + 1 : this.f19384d;
    }

    public boolean getFeature(String str) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            return this.f19388h[this.f19384d];
        }
        return false;
    }

    public String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f19385e[(getDepth() * 3) - 1];
    }

    public String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f19385e[(getDepth() * 3) - 3];
    }

    public String getPrefix(String str, boolean z) {
        try {
            return mo53582b(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    public void ignorableWhitespace(String str) {
        text(str);
    }

    public void processingInstruction(String str) {
        mo53580a(false);
        this.f19381a.write("<?");
        this.f19381a.write(str);
        this.f19381a.write("?>");
    }

    public void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.f19388h[this.f19384d] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    public void setOutput(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter;
        if (outputStream != null) {
            if (str != null) {
                outputStreamWriter = new OutputStreamWriter(outputStream, str);
            }
            setOutput(outputStreamWriter);
            this.f19390j = str;
            if (str != null && str.toLowerCase().startsWith("utf")) {
                this.f19389i = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setOutput(Writer writer) {
        this.f19381a = writer;
        int[] iArr = this.f19386f;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f19387g;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "xml";
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f19382b = false;
        this.f19383c = 0;
        this.f19384d = 0;
        this.f19389i = false;
    }

    public void setPrefix(String str, String str2) {
        mo53580a(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(mo53582b(str2, true, false))) {
            int[] iArr = this.f19386f;
            int i = this.f19384d + 1;
            int i2 = iArr[i];
            iArr[i] = i2 + 1;
            int i3 = i2 << 1;
            String[] strArr = this.f19387g;
            int i4 = i3 + 1;
            if (strArr.length < i4) {
                String[] strArr2 = new String[(strArr.length + 16)];
                System.arraycopy(strArr, 0, strArr2, 0, i3);
                this.f19387g = strArr2;
            }
            String[] strArr3 = this.f19387g;
            strArr3[i3] = str;
            strArr3[i4] = str2;
        }
    }

    public void setProperty(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported Property:");
        stringBuffer.append(obj);
        throw new RuntimeException(stringBuffer.toString());
    }

    public void startDocument(String str, Boolean bool) {
        this.f19381a.write("<?xml version='1.0' ");
        if (str != null) {
            this.f19390j = str;
            if (str.toLowerCase().startsWith("utf")) {
                this.f19389i = true;
            }
        }
        if (this.f19390j != null) {
            this.f19381a.write("encoding='");
            this.f19381a.write(this.f19390j);
            this.f19381a.write("' ");
        }
        if (bool != null) {
            this.f19381a.write("standalone='");
            this.f19381a.write(bool.booleanValue() ? "yes" : LanguageConstKt.f15962no);
            this.f19381a.write("' ");
        }
        this.f19381a.write("?>");
    }

    public XmlSerializer startTag(String str, String str2) {
        mo53580a(false);
        if (this.f19388h[this.f19384d]) {
            this.f19381a.write("\r\n");
            for (int i = 0; i < this.f19384d; i++) {
                this.f19381a.write("  ");
            }
        }
        int i2 = this.f19384d * 3;
        String[] strArr = this.f19385e;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[(strArr.length + 12)];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f19385e = strArr2;
        }
        String b = str == null ? "" : mo53582b(str, true, true);
        if ("".equals(str)) {
            int i3 = this.f19386f[this.f19384d];
            while (i3 < this.f19386f[this.f19384d + 1]) {
                int i4 = i3 * 2;
                if (!"".equals(this.f19387g[i4]) || "".equals(this.f19387g[i4 + 1])) {
                    i3++;
                } else {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f19385e;
        int i5 = i2 + 1;
        strArr3[i2] = str;
        strArr3[i5] = b;
        strArr3[i5 + 1] = str2;
        this.f19381a.write(60);
        if (!"".equals(b)) {
            this.f19381a.write(b);
            this.f19381a.write(58);
        }
        this.f19381a.write(str2);
        this.f19382b = true;
        return this;
    }

    public XmlSerializer text(String str) {
        mo53580a(false);
        this.f19388h[this.f19384d] = false;
        mo53583c(str, -1);
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        text(new String(cArr, i, i2));
        return this;
    }
}
