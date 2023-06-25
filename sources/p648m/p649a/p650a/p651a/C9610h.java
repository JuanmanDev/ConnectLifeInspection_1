package p648m.p649a.p650a.p651a;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.apache.commons.cli.ParseException;

/* renamed from: m.a.a.a.h */
/* compiled from: TypeHandler */
public class C9610h {
    /* renamed from: a */
    public static Class m25791a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unable to find the class: ");
            stringBuffer.append(str);
            throw new ParseException(stringBuffer.toString());
        }
    }

    /* renamed from: b */
    public static Date m25792b(String str) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: c */
    public static File m25793c(String str) {
        return new File(str);
    }

    /* renamed from: d */
    public static File[] m25794d(String str) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /* renamed from: e */
    public static Number m25795e(String str) {
        try {
            if (str.indexOf(46) != -1) {
                return Double.valueOf(str);
            }
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            throw new ParseException(e.getMessage());
        }
    }

    /* renamed from: f */
    public static Object m25796f(String str) {
        try {
            try {
                return Class.forName(str).newInstance();
            } catch (Exception e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(e.getClass().getName());
                stringBuffer.append("; Unable to create an instance of: ");
                stringBuffer.append(str);
                throw new ParseException(stringBuffer.toString());
            }
        } catch (ClassNotFoundException unused) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Unable to find the class: ");
            stringBuffer2.append(str);
            throw new ParseException(stringBuffer2.toString());
        }
    }

    /* renamed from: g */
    public static URL m25797g(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unable to parse the URL: ");
            stringBuffer.append(str);
            throw new ParseException(stringBuffer.toString());
        }
    }

    /* renamed from: h */
    public static Object m25798h(String str, Class cls) {
        if (C9609g.f18837a == cls) {
            return str;
        }
        if (C9609g.f18838b == cls) {
            return m25796f(str);
        }
        if (C9609g.f18839c == cls) {
            return m25795e(str);
        }
        if (C9609g.f18840d == cls) {
            m25792b(str);
            throw null;
        } else if (C9609g.f18841e == cls) {
            return m25791a(str);
        } else {
            if (C9609g.f18843g == cls) {
                return m25793c(str);
            }
            if (C9609g.f18842f == cls) {
                return m25793c(str);
            }
            if (C9609g.f18844h == cls) {
                m25794d(str);
                throw null;
            } else if (C9609g.f18845i == cls) {
                return m25797g(str);
            } else {
                return null;
            }
        }
    }

    /* renamed from: i */
    public static Object m25799i(String str, Object obj) {
        return m25798h(str, (Class) obj);
    }
}
