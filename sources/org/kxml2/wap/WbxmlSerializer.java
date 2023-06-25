package org.kxml2.wap;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.jvm.internal.ByteCompanionObject;
import org.xmlpull.p703v1.XmlSerializer;

public class WbxmlSerializer implements XmlSerializer {

    /* renamed from: a */
    public Hashtable f19419a = new Hashtable();

    /* renamed from: b */
    public OutputStream f19420b;

    /* renamed from: c */
    public ByteArrayOutputStream f19421c = new ByteArrayOutputStream();

    /* renamed from: d */
    public ByteArrayOutputStream f19422d = new ByteArrayOutputStream();

    /* renamed from: e */
    public String f19423e;

    /* renamed from: f */
    public int f19424f;

    /* renamed from: g */
    public Vector f19425g = new Vector();

    /* renamed from: h */
    public Hashtable f19426h = new Hashtable();

    /* renamed from: i */
    public Hashtable f19427i = new Hashtable();

    /* renamed from: j */
    public Hashtable f19428j = new Hashtable();

    /* renamed from: k */
    public int f19429k;

    /* renamed from: l */
    public int f19430l;

    /* renamed from: m */
    public String f19431m;

    /* renamed from: b */
    public static void m26721b(OutputStream outputStream, int i) {
        int i2;
        byte[] bArr = new byte[5];
        int i3 = 0;
        while (true) {
            i2 = i3 + 1;
            bArr[i3] = (byte) (i & 127);
            i >>= 7;
            if (i == 0) {
                break;
            }
            i3 = i2;
        }
        while (i2 > 1) {
            i2--;
            outputStream.write(bArr[i2] | ByteCompanionObject.MIN_VALUE);
        }
        outputStream.write(bArr[0]);
    }

    /* renamed from: a */
    public void mo53623a(boolean z) {
        if (this.f19423e != null) {
            int size = this.f19425g.size();
            int[] iArr = (int[]) this.f19428j.get(this.f19423e);
            if (iArr == null) {
                this.f19421c.write(size == 0 ? z ? 4 : 68 : z ? 132 : 196);
                mo53626e(this.f19423e, false);
            } else {
                if (iArr[0] != this.f19430l) {
                    this.f19430l = iArr[0];
                    this.f19421c.write(0);
                    this.f19421c.write(this.f19430l);
                }
                this.f19421c.write(size == 0 ? z ? iArr[1] : iArr[1] | 64 : z ? iArr[1] | 128 : iArr[1] | 192);
            }
            int i = 0;
            while (i < size) {
                int[] iArr2 = (int[]) this.f19426h.get(this.f19425g.elementAt(i));
                if (iArr2 == null) {
                    this.f19421c.write(4);
                    mo53626e((String) this.f19425g.elementAt(i), false);
                } else {
                    if (iArr2[0] != this.f19429k) {
                        this.f19429k = iArr2[0];
                        this.f19421c.write(0);
                        this.f19421c.write(this.f19429k);
                    }
                    this.f19421c.write(iArr2[1]);
                }
                int i2 = i + 1;
                int[] iArr3 = (int[]) this.f19427i.get(this.f19425g.elementAt(i2));
                if (iArr3 == null) {
                    mo53624c((String) this.f19425g.elementAt(i2));
                } else {
                    if (iArr3[0] != this.f19429k) {
                        this.f19429k = iArr3[0];
                        this.f19421c.write(0);
                        this.f19421c.write(this.f19429k);
                    }
                    this.f19421c.write(iArr3[1]);
                }
                i = i2 + 1;
            }
            if (size > 0) {
                this.f19421c.write(1);
            }
            this.f19423e = null;
            this.f19425g.removeAllElements();
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) {
        this.f19425g.addElement(str2);
        this.f19425g.addElement(str3);
        return this;
    }

    /* renamed from: c */
    public final void mo53624c(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && str.charAt(i) < 'A') {
                i++;
            }
            int i3 = i;
            while (i3 < length && str.charAt(i3) >= 'A') {
                i3++;
            }
            if (i3 - i > 10) {
                if (i > i2 && str.charAt(i - 1) == ' ' && this.f19419a.get(str.substring(i, i3)) == null) {
                    this.f19421c.write(131);
                    mo53626e(str.substring(i2, i3), false);
                } else {
                    if (i > i2 && str.charAt(i - 1) == ' ') {
                        i--;
                    }
                    if (i > i2) {
                        this.f19421c.write(131);
                        mo53626e(str.substring(i2, i), false);
                    }
                    this.f19421c.write(131);
                    mo53626e(str.substring(i, i3), true);
                }
                i2 = i3;
            }
            i = i3;
        }
        if (i2 < length) {
            this.f19421c.write(131);
            mo53626e(str.substring(i2, length), false);
        }
    }

    public void cdsect(String str) {
        text(str);
    }

    public void comment(String str) {
    }

    /* renamed from: d */
    public void mo53625d(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(this.f19431m));
        outputStream.write(0);
    }

    public void docdecl(String str) {
        throw new RuntimeException("Cannot write docdecl for WBXML");
    }

    /* renamed from: e */
    public final void mo53626e(String str, boolean z) {
        Integer num = (Integer) this.f19419a.get(str);
        if (num != null) {
            m26721b(this.f19421c, num.intValue());
            return;
        }
        int size = this.f19422d.size();
        if (str.charAt(0) < '0' || !z) {
            m26721b(this.f19421c, size);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(' ');
            stringBuffer.append(str);
            str = stringBuffer.toString();
            m26721b(this.f19421c, size + 1);
        }
        this.f19419a.put(str, new Integer(size));
        if (str.charAt(0) == ' ') {
            this.f19419a.put(str.substring(1), new Integer(size + 1));
        }
        int lastIndexOf = str.lastIndexOf(32);
        if (lastIndexOf > 1) {
            int i = size + lastIndexOf;
            this.f19419a.put(str.substring(lastIndexOf), new Integer(i));
            this.f19419a.put(str.substring(lastIndexOf + 1), new Integer(i + 1));
        }
        mo53625d(this.f19422d, str);
        this.f19422d.flush();
    }

    public void endDocument() {
        m26721b(this.f19420b, this.f19422d.size());
        this.f19420b.write(this.f19422d.toByteArray());
        this.f19420b.write(this.f19421c.toByteArray());
        this.f19420b.flush();
    }

    public XmlSerializer endTag(String str, String str2) {
        if (this.f19423e != null) {
            mo53623a(true);
        } else {
            this.f19421c.write(1);
        }
        this.f19424f--;
        return this;
    }

    public void entityRef(String str) {
        throw new RuntimeException("EntityReference not supported for WBXML");
    }

    public void flush() {
    }

    public int getDepth() {
        return this.f19424f;
    }

    public boolean getFeature(String str) {
        return false;
    }

    public String getName() {
        throw new RuntimeException("NYI");
    }

    public String getNamespace() {
        throw new RuntimeException("NYI");
    }

    public String getPrefix(String str, boolean z) {
        throw new RuntimeException("NYI");
    }

    public Object getProperty(String str) {
        return null;
    }

    public void ignorableWhitespace(String str) {
    }

    public void processingInstruction(String str) {
        throw new RuntimeException("PI NYI");
    }

    public void setFeature(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unknown feature ");
        stringBuffer.append(str);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void setOutput(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-8";
        }
        this.f19431m = str;
        this.f19420b = outputStream;
        this.f19421c = new ByteArrayOutputStream();
        this.f19422d = new ByteArrayOutputStream();
    }

    public void setOutput(Writer writer) {
        throw new RuntimeException("Wbxml requires an OutputStream!");
    }

    public void setPrefix(String str, String str2) {
        throw new RuntimeException("NYI");
    }

    public void setProperty(String str, Object obj) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unknown property ");
        stringBuffer.append(str);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void startDocument(String str, Boolean bool) {
        OutputStream outputStream;
        int i;
        this.f19420b.write(3);
        this.f19420b.write(1);
        if (str != null) {
            this.f19431m = str;
        }
        if (this.f19431m.toUpperCase().equals("UTF-8")) {
            outputStream = this.f19420b;
            i = 106;
        } else if (this.f19431m.toUpperCase().equals("ISO-8859-1")) {
            outputStream = this.f19420b;
            i = 4;
        } else {
            throw new UnsupportedEncodingException(str);
        }
        outputStream.write(i);
    }

    public XmlSerializer startTag(String str, String str2) {
        if (str == null || "".equals(str)) {
            mo53623a(false);
            this.f19423e = str2;
            this.f19424f++;
            return this;
        }
        throw new RuntimeException("NSP NYI");
    }

    public XmlSerializer text(String str) {
        mo53623a(false);
        mo53624c(str);
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) {
        mo53623a(false);
        mo53624c(new String(cArr, i, i2));
        return this;
    }
}
