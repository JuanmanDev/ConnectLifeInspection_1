package p040c.p072c.p073a.p074a;

import java.io.File;
import java.io.IOException;

/* renamed from: c.c.a.a.h */
/* compiled from: FileUtils */
public final class C1501h {
    static {
        System.getProperty("line.separator");
    }

    /* renamed from: a */
    public static boolean m918a(File file) {
        return file != null && (!file.exists() ? file.mkdirs() : file.isDirectory());
    }

    /* renamed from: b */
    public static boolean m919b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!m918a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static File m920c(String str) {
        if (C1493b0.m899w(str)) {
            return null;
        }
        return new File(str);
    }
}
