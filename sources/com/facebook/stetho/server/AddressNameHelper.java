package com.facebook.stetho.server;

import com.facebook.stetho.common.ProcessUtil;

public class AddressNameHelper {
    public static final String PREFIX = "stetho_";

    public static String createCustomAddress(String str) {
        return PREFIX + ProcessUtil.getProcessName() + str;
    }
}
