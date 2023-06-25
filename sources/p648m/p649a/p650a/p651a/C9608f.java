package p648m.p649a.p650a.p651a;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.UnrecognizedOptionException;

/* renamed from: m.a.a.a.f */
/* compiled from: Parser */
public abstract class C9608f implements C9602a {

    /* renamed from: a */
    public CommandLine f18834a;

    /* renamed from: b */
    public Options f18835b;

    /* renamed from: c */
    public List f18836c;

    /* renamed from: a */
    public CommandLine mo50275a(Options options, String[] strArr, boolean z) {
        return mo50291f(options, strArr, (Properties) null, z);
    }

    /* renamed from: b */
    public void mo50288b() {
        if (!mo50290e().isEmpty()) {
            throw new MissingOptionException(mo50290e());
        }
    }

    /* renamed from: c */
    public abstract String[] mo50276c(Options options, String[] strArr, boolean z);

    /* renamed from: d */
    public Options mo50289d() {
        return this.f18835b;
    }

    /* renamed from: e */
    public List mo50290e() {
        return this.f18836c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r9 != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085 A[LOOP:2: B:27:0x0085->B:39:0x0085, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0037 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.commons.cli.CommandLine mo50291f(org.apache.commons.cli.Options r6, java.lang.String[] r7, java.util.Properties r8, boolean r9) {
        /*
            r5 = this;
            java.util.List r0 = r6.helpOptions()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = r0.next()
            org.apache.commons.cli.Option r1 = (org.apache.commons.cli.Option) r1
            r1.clearValues()
            goto L_0x0008
        L_0x0018:
            r5.mo50295j(r6)
            org.apache.commons.cli.CommandLine r6 = new org.apache.commons.cli.CommandLine
            r6.<init>()
            r5.f18834a = r6
            r6 = 0
            if (r7 != 0) goto L_0x0027
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x0027:
            org.apache.commons.cli.Options r0 = r5.mo50289d()
            java.lang.String[] r7 = r5.mo50276c(r0, r7, r9)
            java.util.List r7 = java.util.Arrays.asList(r7)
            java.util.ListIterator r7 = r7.listIterator()
        L_0x0037:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "--"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 == 0) goto L_0x004e
        L_0x004c:
            r6 = r3
            goto L_0x0083
        L_0x004e:
            java.lang.String r2 = "-"
            boolean r4 = r2.equals(r0)
            if (r4 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x0059
            goto L_0x004c
        L_0x0059:
            org.apache.commons.cli.CommandLine r2 = r5.f18834a
            r2.addArg(r0)
            goto L_0x0083
        L_0x005f:
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x007b
            if (r9 == 0) goto L_0x0077
            org.apache.commons.cli.Options r2 = r5.mo50289d()
            boolean r2 = r2.hasOption(r0)
            if (r2 != 0) goto L_0x0077
            org.apache.commons.cli.CommandLine r6 = r5.f18834a
            r6.addArg(r0)
            goto L_0x004c
        L_0x0077:
            r5.mo50293h(r0, r7)
            goto L_0x0083
        L_0x007b:
            org.apache.commons.cli.CommandLine r2 = r5.f18834a
            r2.addArg(r0)
            if (r9 == 0) goto L_0x0083
            goto L_0x004c
        L_0x0083:
            if (r6 == 0) goto L_0x0037
        L_0x0085:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x0085
            org.apache.commons.cli.CommandLine r2 = r5.f18834a
            r2.addArg(r0)
            goto L_0x0085
        L_0x009d:
            r5.mo50294i(r8)
            r5.mo50288b()
            org.apache.commons.cli.CommandLine r6 = r5.f18834a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p648m.p649a.p650a.p651a.C9608f.mo50291f(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean):org.apache.commons.cli.CommandLine");
    }

    /* renamed from: g */
    public void mo50292g(Option option, ListIterator listIterator) {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (mo50289d().hasOption(str) && str.startsWith(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR)) {
                listIterator.previous();
                break;
            } else {
                try {
                    option.addValueForProcessing(C9611i.m25800a(str));
                } catch (RuntimeException unused) {
                    listIterator.previous();
                }
            }
        }
        if (option.getValues() == null && !option.hasOptionalArg()) {
            throw new MissingArgumentException(option);
        }
    }

    /* renamed from: h */
    public void mo50293h(String str, ListIterator listIterator) {
        if (mo50289d().hasOption(str)) {
            Option option = (Option) mo50289d().getOption(str).clone();
            if (option.isRequired()) {
                mo50290e().remove(option.getKey());
            }
            if (mo50289d().getOptionGroup(option) != null) {
                OptionGroup optionGroup = mo50289d().getOptionGroup(option);
                if (optionGroup.isRequired()) {
                    mo50290e().remove(optionGroup);
                }
                optionGroup.setSelected(option);
            }
            if (option.hasArg()) {
                mo50292g(option, listIterator);
            }
            this.f18834a.addOption(option);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unrecognized option: ");
        stringBuffer.append(str);
        throw new UnrecognizedOptionException(stringBuffer.toString(), str);
    }

    /* renamed from: i */
    public void mo50294i(Properties properties) {
        if (properties != null) {
            Enumeration<?> propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String obj = propertyNames.nextElement().toString();
                if (!this.f18834a.hasOption(obj)) {
                    Option option = mo50289d().getOption(obj);
                    String property = properties.getProperty(obj);
                    if (option.hasArg()) {
                        if (option.getValues() == null || option.getValues().length == 0) {
                            try {
                                option.addValueForProcessing(property);
                            } catch (RuntimeException unused) {
                            }
                        }
                    } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                        return;
                    }
                    this.f18834a.addOption(option);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo50295j(Options options) {
        this.f18835b = options;
        this.f18836c = new ArrayList(options.getRequiredOptions());
    }
}
