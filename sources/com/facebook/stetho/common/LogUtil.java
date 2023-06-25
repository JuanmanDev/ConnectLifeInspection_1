package com.facebook.stetho.common;

import java.util.Locale;

public class LogUtil {
    public static final String TAG = "stetho";

    /* renamed from: d */
    public static void m9802d(String str, Object... objArr) {
        m9801d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m9806e(String str, Object... objArr) {
        m9805e(format(str, objArr));
    }

    public static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m9810i(String str, Object... objArr) {
        m9809i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i == 5 || i == 6) {
            return true;
        }
        return LogRedirector.isLoggable(TAG, i);
    }

    /* renamed from: v */
    public static void m9814v(String str, Object... objArr) {
        m9813v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m9818w(String str, Object... objArr) {
        m9817w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m9804d(Throwable th, String str, Object... objArr) {
        m9803d(th, format(str, objArr));
    }

    /* renamed from: e */
    public static void m9808e(Throwable th, String str, Object... objArr) {
        m9807e(th, format(str, objArr));
    }

    /* renamed from: i */
    public static void m9812i(Throwable th, String str, Object... objArr) {
        m9811i(th, format(str, objArr));
    }

    /* renamed from: v */
    public static void m9816v(Throwable th, String str, Object... objArr) {
        m9815v(th, format(str, objArr));
    }

    /* renamed from: w */
    public static void m9820w(Throwable th, String str, Object... objArr) {
        m9819w(th, format(str, objArr));
    }

    /* renamed from: d */
    public static void m9801d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m9791d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m9805e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m9793e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m9809i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m9795i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m9813v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m9797v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m9817w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m9799w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m9803d(Throwable th, String str) {
        if (isLoggable(3)) {
            LogRedirector.m9792d(TAG, str, th);
        }
    }

    /* renamed from: e */
    public static void m9807e(Throwable th, String str) {
        if (isLoggable(6)) {
            LogRedirector.m9794e(TAG, str, th);
        }
    }

    /* renamed from: i */
    public static void m9811i(Throwable th, String str) {
        if (isLoggable(4)) {
            LogRedirector.m9796i(TAG, str, th);
        }
    }

    /* renamed from: v */
    public static void m9815v(Throwable th, String str) {
        if (isLoggable(2)) {
            LogRedirector.m9798v(TAG, str, th);
        }
    }

    /* renamed from: w */
    public static void m9819w(Throwable th, String str) {
        if (isLoggable(5)) {
            LogRedirector.m9800w(TAG, str, th);
        }
    }
}
