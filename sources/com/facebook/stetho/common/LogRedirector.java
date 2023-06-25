package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LogRedirector {
    public static volatile Logger sLogger;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* renamed from: d */
    public static void m9792d(String str, String str2, Throwable th) {
        m9791d(str, str2 + "\n" + formatThrowable(th));
    }

    /* renamed from: e */
    public static void m9794e(String str, String str2, Throwable th) {
        m9793e(str, str2 + "\n" + formatThrowable(th));
    }

    public static String formatThrowable(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m9796i(String str, String str2, Throwable th) {
        m9795i(str, str2 + "\n" + formatThrowable(th));
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        if (logger != null) {
            return logger.isLoggable(str, i);
        }
        return Log.isLoggable(str, i);
    }

    public static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* renamed from: v */
    public static void m9798v(String str, String str2, Throwable th) {
        m9797v(str, str2 + "\n" + formatThrowable(th));
    }

    /* renamed from: w */
    public static void m9800w(String str, String str2, Throwable th) {
        m9799w(str, str2 + "\n" + formatThrowable(th));
    }

    /* renamed from: d */
    public static void m9791d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m9793e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m9795i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m9797v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m9799w(String str, String str2) {
        log(5, str, str2);
    }
}
