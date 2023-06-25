package p040c.p151o.p152a.p153a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: c.o.a.a.f */
/* compiled from: GigyaLogger */
public class C2103f {

    /* renamed from: a */
    public static boolean f2070a = false;

    /* renamed from: b */
    public static boolean f2071b = false;

    /* renamed from: c */
    public static String f2072c;

    /* renamed from: a */
    public static void m3055a(String str) {
        File file = new File(f2072c);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            if (Integer.parseInt(String.valueOf(file.length() / 1024)) > 35) {
                file.delete();
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.append(str);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m3056b(String str, String str2) {
        if (f2070a) {
            String e = m3059e(str, str2);
            if (m3060f()) {
                m3055a(e);
            }
        }
    }

    /* renamed from: c */
    public static void m3057c(String str, String str2) {
        if (f2070a) {
            String e = m3059e(str, str2);
            if (m3060f()) {
                m3055a(e);
            }
        }
    }

    /* renamed from: d */
    public static void m3058d(String str, String str2) {
        if (f2070a && f2071b) {
            m3059e(str, str2);
        }
    }

    /* renamed from: e */
    public static String m3059e(String str, String str2) {
        return "<< " + str + " *** " + str2 + " >>";
    }

    /* renamed from: f */
    public static boolean m3060f() {
        return f2072c != null;
    }
}
