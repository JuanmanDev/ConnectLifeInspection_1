package p648m.p649a.p650a.p651a;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/* renamed from: m.a.a.a.d */
/* compiled from: HelpFormatter */
public class C9605d {

    /* renamed from: a */
    public int f18827a = 74;

    /* renamed from: b */
    public int f18828b = 1;

    /* renamed from: c */
    public int f18829c = 3;

    /* renamed from: d */
    public String f18830d = System.getProperty("line.separator");

    /* renamed from: e */
    public String f18831e = AccountManagerConstants$LOCALE.LOCALE_SEPERATOR;

    /* renamed from: f */
    public String f18832f = "--";

    /* renamed from: g */
    public Comparator f18833g = new C9606a();

    /* renamed from: m.a.a.a.d$a */
    /* compiled from: HelpFormatter */
    public static class C9606a implements Comparator {
        public C9606a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Option) obj).getKey().compareToIgnoreCase(((Option) obj2).getKey());
        }
    }

    /* renamed from: a */
    public String mo50277a(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public int mo50278b(String str, int i, int i2) {
        int indexOf = str.indexOf(10, i2);
        if ((indexOf != -1 && indexOf <= i) || ((indexOf = str.indexOf(9, i2)) != -1 && indexOf <= i)) {
            return indexOf + 1;
        }
        int i3 = i + i2;
        if (i3 >= str.length()) {
            return -1;
        }
        int i4 = i3;
        while (i4 >= i2 && (r5 = str.charAt(i4)) != ' ' && r5 != 10 && r5 != 13) {
            i4--;
        }
        if (i4 > i2) {
            return i4;
        }
        while (i3 <= str.length() && (r9 = str.charAt(i3)) != ' ' && r9 != 10 && r9 != 13) {
            i3++;
        }
        if (i3 == str.length()) {
            return -1;
        }
        return i3;
    }

    /* renamed from: c */
    public int mo50279c() {
        return this.f18829c;
    }

    /* renamed from: d */
    public int mo50280d() {
        return this.f18828b;
    }

    /* renamed from: e */
    public Comparator mo50281e() {
        return this.f18833g;
    }

    /* renamed from: f */
    public int mo50282f() {
        return this.f18827a;
    }

    /* renamed from: g */
    public void mo50283g(PrintWriter printWriter, int i, Options options, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        mo50284h(stringBuffer, i, options, i2, i3);
        printWriter.println(stringBuffer.toString());
    }

    /* renamed from: h */
    public StringBuffer mo50284h(StringBuffer stringBuffer, int i, Options options, int i2, int i3) {
        String a = mo50277a(i2);
        String a2 = mo50277a(i3);
        ArrayList arrayList = new ArrayList();
        List<Option> helpOptions = options.helpOptions();
        Collections.sort(helpOptions, mo50281e());
        int i4 = 0;
        int i5 = 0;
        for (Option option : helpOptions) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (option.getOpt() == null) {
                stringBuffer2.append(a);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("   ");
                stringBuffer3.append(this.f18832f);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(option.getLongOpt());
            } else {
                stringBuffer2.append(a);
                stringBuffer2.append(this.f18831e);
                stringBuffer2.append(option.getOpt());
                if (option.hasLongOpt()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.f18832f);
                    stringBuffer2.append(option.getLongOpt());
                }
            }
            if (option.hasArg()) {
                if (option.hasArgName()) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(option.getArgName());
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i5) {
                i5 = stringBuffer2.length();
            }
        }
        Iterator it = helpOptions.iterator();
        while (it.hasNext()) {
            Option option2 = (Option) it.next();
            int i6 = i4 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i4).toString());
            if (stringBuffer4.length() < i5) {
                stringBuffer4.append(mo50277a(i5 - stringBuffer4.length()));
            }
            stringBuffer4.append(a2);
            int i7 = i5 + i3;
            if (option2.getDescription() != null) {
                stringBuffer4.append(option2.getDescription());
            }
            mo50285i(stringBuffer, i, i7, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.f18830d);
            }
            i4 = i6;
        }
        return stringBuffer;
    }

    /* renamed from: i */
    public StringBuffer mo50285i(StringBuffer stringBuffer, int i, int i2, String str) {
        int b = mo50278b(str, i, 0);
        if (b == -1) {
            stringBuffer.append(mo50286j(str));
            return stringBuffer;
        }
        stringBuffer.append(mo50286j(str.substring(0, b)));
        stringBuffer.append(this.f18830d);
        if (i2 >= i) {
            i2 = 1;
        }
        String a = mo50277a(i2);
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(a);
            stringBuffer2.append(str.substring(b).trim());
            str = stringBuffer2.toString();
            b = mo50278b(str, i, 0);
            if (b == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            if (str.length() > i && b == i2 - 1) {
                b = i;
            }
            stringBuffer.append(mo50286j(str.substring(0, b)));
            stringBuffer.append(this.f18830d);
        }
    }

    /* renamed from: j */
    public String mo50286j(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
