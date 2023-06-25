package p040c.p072c.p073a.p074a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* renamed from: c.c.a.a.y */
/* compiled from: ThrowableUtils */
public class C1534y {

    /* renamed from: a */
    public static final String f758a = System.getProperty("line.separator");

    /* renamed from: a */
    public static String m1076a(Throwable th) {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList<String> arrayList2 = new ArrayList<>();
        int i = size - 1;
        List<String> b = m1077b((Throwable) arrayList.get(i));
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (size != 0) {
                list = m1077b((Throwable) arrayList.get(size - 1));
                m1078c(b, list);
            } else {
                list = b;
            }
            if (size == i) {
                arrayList2.add(((Throwable) arrayList.get(size)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(size)).toString());
            }
            arrayList2.addAll(b);
            b = list;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList2) {
            sb.append(append);
            sb.append(f758a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static List<String> m1077b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f758a);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m1078c(List<String> list, List<String> list2) {
        int size = list.size() - 1;
        int size2 = list2.size() - 1;
        while (size >= 0 && size2 >= 0) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
            size2--;
        }
    }
}
