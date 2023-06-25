package p040c.p041a.p042a.p043a.p047d;

import android.text.TextUtils;
import com.alibaba.android.arouter.facade.template.ILogger;

/* renamed from: c.a.a.a.d.b */
/* compiled from: DefaultLogger */
public class C1350b implements ILogger {

    /* renamed from: b */
    public static boolean f372b = false;

    /* renamed from: c */
    public static boolean f373c = false;

    /* renamed from: d */
    public static boolean f374d = false;

    /* renamed from: a */
    public String f375a = "ARouter";

    public C1350b(String str) {
        this.f375a = str;
    }

    /* renamed from: a */
    public static String m245a(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder("[");
        if (f373c) {
            String name = Thread.currentThread().getName();
            String fileName = stackTraceElement.getFileName();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            long id = Thread.currentThread().getId();
            int lineNumber = stackTraceElement.getLineNumber();
            sb.append("ThreadId=");
            sb.append(id);
            sb.append(" & ");
            sb.append("ThreadName=");
            sb.append(name);
            sb.append(" & ");
            sb.append("FileName=");
            sb.append(fileName);
            sb.append(" & ");
            sb.append("ClassName=");
            sb.append(className);
            sb.append(" & ");
            sb.append("MethodName=");
            sb.append(methodName);
            sb.append(" & ");
            sb.append("LineNumber=");
            sb.append(lineNumber);
        }
        sb.append(" ] ");
        return sb.toString();
    }

    public void debug(String str, String str2) {
        if (f372b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            str2 + m245a(stackTraceElement);
        }
    }

    public void error(String str, String str2) {
        if (f372b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            str2 + m245a(stackTraceElement);
        }
    }

    public String getDefaultTag() {
        return this.f375a;
    }

    public void info(String str, String str2) {
        if (f372b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            str2 + m245a(stackTraceElement);
        }
    }

    public boolean isMonitorMode() {
        return f374d;
    }

    public void monitor(String str) {
        if (f372b && isMonitorMode()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            this.f375a + "::monitor";
            str + m245a(stackTraceElement);
        }
    }

    public void showLog(boolean z) {
        f372b = z;
    }

    public void showStackTrace(boolean z) {
        f373c = z;
    }

    public void warning(String str, String str2) {
        if (f372b) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            str2 + m245a(stackTraceElement);
        }
    }
}
