package p648m.p649a.p650a.p651a;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import java.util.ArrayList;
import org.apache.commons.cli.Options;

/* renamed from: m.a.a.a.b */
/* compiled from: GnuParser */
public class C9603b extends C9608f {
    /* renamed from: c */
    public String[] mo50276c(Options options, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            if ("--".equals(str)) {
                arrayList.add("--");
                z2 = true;
            } else if (AccountManagerConstants$LOCALE.LOCALE_SEPERATOR.equals(str)) {
                arrayList.add(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR);
            } else if (str.startsWith(AccountManagerConstants$LOCALE.LOCALE_SEPERATOR)) {
                String b = C9611i.m25801b(str);
                if (options.hasOption(b)) {
                    arrayList.add(str);
                } else if (b.indexOf(61) != -1 && options.hasOption(b.substring(0, b.indexOf(61)))) {
                    arrayList.add(str.substring(0, str.indexOf(61)));
                    arrayList.add(str.substring(str.indexOf(61) + 1));
                } else if (options.hasOption(str.substring(0, 2))) {
                    arrayList.add(str.substring(0, 2));
                    arrayList.add(str.substring(2));
                } else {
                    arrayList.add(str);
                    z2 = z;
                }
            } else {
                arrayList.add(str);
            }
            if (z2) {
                while (true) {
                    i++;
                    if (i >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i]);
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
