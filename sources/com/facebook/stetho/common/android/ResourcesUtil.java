package com.facebook.stetho.common.android;

import android.content.res.Resources;
import androidx.test.internal.runner.RunnerArgs;
import com.facebook.stetho.common.LogUtil;

public class ResourcesUtil {
    public static String getFallbackIdString(int i) {
        return "#" + Integer.toHexString(i);
    }

    public static String getIdString(Resources resources, int i) {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String str2 = "";
        if (getResourcePackageId(i) != 127) {
            str2 = resources.getResourcePackageName(i);
            str = RunnerArgs.CLASSPATH_SEPARATOR;
        } else {
            str = str2;
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append("@");
        sb.append(str2);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            LogUtil.m9817w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    public static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
